package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api;

/* renamed from: com.google.android.gms.common.api.GoogleApiActivity */
/* loaded from: classes13.dex */
public class DialogInterfaceOnCancelListenerC1747xcb82b330 extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c implements android.content.DialogInterface.OnCancelListener {
    protected int zaa = 0;

    public static android.content.Intent zaa(android.content.Context context, android.app.PendingIntent pendingIntent, int i17, boolean z17) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.DialogInterfaceOnCancelListenerC1747xcb82b330.class);
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
        java.lang.Integer num = (java.lang.Integer) extras.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4);
        if (pendingIntent == null && num == null) {
            finish();
            return;
        }
        if (pendingIntent == null) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc.m17618x9cf0d20b().m17636x94f575a3(this, ((java.lang.Integer) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(num)).intValue(), 2, this);
            this.zaa = 1;
            return;
        }
        try {
            startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            this.zaa = 1;
        } catch (android.content.ActivityNotFoundException unused) {
            if (extras.getBoolean("notify_manager", true)) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c.zak(this).zax(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(22, null), getIntent().getIntExtra("failing_client_id", -1));
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
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c zak = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c.zak(this);
                if (i18 == -1) {
                    zak.zay();
                } else if (i18 == 0) {
                    zak.zax(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(13, null), getIntent().getIntExtra("failing_client_id", -1));
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

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zaa = bundle.getInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54473x7fe978e1);
        }
        if (this.zaa != 1) {
            zab();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.putInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54473x7fe978e1, this.zaa);
        super.onSaveInstanceState(bundle);
    }
}
