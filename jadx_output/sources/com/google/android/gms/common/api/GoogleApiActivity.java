package com.google.android.gms.common.api;

/* loaded from: classes13.dex */
public class GoogleApiActivity extends com.tencent.mm.hellhoundlib.activities.HellActivity implements android.content.DialogInterface.OnCancelListener {
    protected int zaa = 0;

    public static android.content.Intent zaa(android.content.Context context, android.app.PendingIntent pendingIntent, int i17, boolean z17) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.gms.common.api.GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i17);
        intent.putExtra("notify_manager", z17);
        return intent;
    }

    private final void zab() {
        android.os.Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) extras.get("pending_intent");
        java.lang.Integer num = (java.lang.Integer) extras.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE);
        if (pendingIntent == null && num == null) {
            finish();
            return;
        }
        if (pendingIntent == null) {
            com.google.android.gms.common.GoogleApiAvailability.getInstance().showErrorDialogFragment(this, ((java.lang.Integer) com.google.android.gms.common.internal.Preconditions.checkNotNull(num)).intValue(), 2, this);
            this.zaa = 1;
            return;
        }
        try {
            startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            this.zaa = 1;
        } catch (android.content.ActivityNotFoundException unused) {
            if (extras.getBoolean("notify_manager", true)) {
                com.google.android.gms.common.api.internal.GoogleApiManager.zak(this).zax(new com.google.android.gms.common.ConnectionResult(22, null), getIntent().getIntExtra("failing_client_id", -1));
            } else {
                java.lang.String str = "Activity not found while launching " + pendingIntent.toString() + ".";
                if (android.os.Build.FINGERPRINT.contains("generic")) {
                    str.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                }
            }
            this.zaa = 1;
            finish();
        } catch (android.content.IntentSender.SendIntentException unused2) {
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.zaa = 0;
            setResult(i18, intent);
            if (booleanExtra) {
                com.google.android.gms.common.api.internal.GoogleApiManager zak = com.google.android.gms.common.api.internal.GoogleApiManager.zak(this);
                if (i18 == -1) {
                    zak.zay();
                } else if (i18 == 0) {
                    zak.zax(new com.google.android.gms.common.ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i17 == 2) {
            this.zaa = 0;
            setResult(i18, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.zaa = 0;
        setResult(0);
        finish();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zaa = bundle.getInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_RESOLUTION);
        }
        if (this.zaa != 1) {
            zab();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.putInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_RESOLUTION, this.zaa);
        super.onSaveInstanceState(bundle);
    }
}
