package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes13.dex */
public class SignInHubActivity extends androidx.fragment.app.FragmentActivity {
    private static boolean zzfg;
    private boolean zzfh = false;
    private com.google.android.gms.auth.api.signin.internal.SignInConfiguration zzfi;
    private boolean zzfj;
    private int zzfk;
    private android.content.Intent zzfl;

    /* loaded from: classes13.dex */
    public class zzd implements a4.a {
        private zzd() {
        }

        @Override // a4.a
        public final androidx.loader.content.e onCreateLoader(int i17, android.os.Bundle bundle) {
            return new com.google.android.gms.auth.api.signin.internal.zzf(com.google.android.gms.auth.api.signin.internal.SignInHubActivity.this, com.google.android.gms.common.api.GoogleApiClient.getAllClients());
        }

        @Override // a4.a
        public final /* synthetic */ void onLoadFinished(androidx.loader.content.e eVar, java.lang.Object obj) {
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity = com.google.android.gms.auth.api.signin.internal.SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.zzfk, com.google.android.gms.auth.api.signin.internal.SignInHubActivity.this.zzfl);
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity.this.finish();
        }

        @Override // a4.a
        public final void onLoaderReset(androidx.loader.content.e eVar) {
        }
    }

    private final void zzu() {
        a4.b supportLoaderManager = getSupportLoaderManager();
        com.google.android.gms.auth.api.signin.internal.SignInHubActivity.zzd zzdVar = new com.google.android.gms.auth.api.signin.internal.SignInHubActivity.zzd();
        a4.g gVar = (a4.g) supportLoaderManager;
        a4.f fVar = gVar.f1168b;
        if (fVar.f1166e) {
            throw new java.lang.IllegalStateException("Called while creating a loader");
        }
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("initLoader must be called on the main thread");
        }
        x.o oVar = fVar.f1165d;
        a4.c cVar = (a4.c) oVar.e(0, null);
        androidx.lifecycle.y yVar = gVar.f1167a;
        if (cVar == null) {
            try {
                fVar.f1166e = true;
                androidx.loader.content.e onCreateLoader = zzdVar.onCreateLoader(0, null);
                if (onCreateLoader == null) {
                    throw new java.lang.IllegalArgumentException("Object returned from onCreateLoader must not be null");
                }
                if (onCreateLoader.getClass().isMemberClass() && !java.lang.reflect.Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                    throw new java.lang.IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + onCreateLoader);
                }
                a4.c cVar2 = new a4.c(0, null, onCreateLoader, null);
                oVar.g(0, cVar2);
                fVar.f1166e = false;
                a4.d dVar = new a4.d(cVar2.f1157f, zzdVar);
                cVar2.observe(yVar, dVar);
                a4.d dVar2 = cVar2.f1159h;
                if (dVar2 != null) {
                    cVar2.removeObserver(dVar2);
                }
                cVar2.f1158g = yVar;
                cVar2.f1159h = dVar;
            } catch (java.lang.Throwable th6) {
                fVar.f1166e = false;
                throw th6;
            }
        } else {
            a4.d dVar3 = new a4.d(cVar.f1157f, zzdVar);
            cVar.observe(yVar, dVar3);
            a4.d dVar4 = cVar.f1159h;
            if (dVar4 != null) {
                cVar.removeObserver(dVar4);
            }
            cVar.f1158g = yVar;
            cVar.f1159h = dVar3;
        }
        zzfg = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (this.zzfh) {
            return;
        }
        setResult(0);
        if (i17 != 40962) {
            return;
        }
        if (intent != null) {
            com.google.android.gms.auth.api.signin.SignInAccount signInAccount = (com.google.android.gms.auth.api.signin.SignInAccount) intent.getParcelableExtra(com.google.android.gms.auth.api.signin.GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
            if (signInAccount != null && signInAccount.getGoogleSignInAccount() != null) {
                com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = signInAccount.getGoogleSignInAccount();
                com.google.android.gms.auth.api.signin.internal.zzq.zze(this).zzd(this.zzfi.zzt(), googleSignInAccount);
                intent.removeExtra(com.google.android.gms.auth.api.signin.GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.zzfj = true;
                this.zzfk = i18;
                this.zzfl = intent;
                zzu();
                return;
            }
            if (intent.hasExtra(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE)) {
                zzd(intent.getIntExtra(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, 8));
                return;
            }
        }
        zzd(8);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        java.lang.String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            zzd(com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes.SIGN_IN_FAILED);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            java.lang.String valueOf = java.lang.String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                "Unknown action: ".concat(valueOf);
            }
            finish();
            return;
        }
        com.google.android.gms.auth.api.signin.internal.SignInConfiguration signInConfiguration = (com.google.android.gms.auth.api.signin.internal.SignInConfiguration) intent.getBundleExtra("config").getParcelable("config");
        this.zzfi = signInConfiguration;
        if (signInConfiguration == null) {
            setResult(0);
            finish();
            return;
        }
        if (!(bundle == null)) {
            boolean z17 = bundle.getBoolean("signingInGoogleApiClients");
            this.zzfj = z17;
            if (z17) {
                this.zzfk = bundle.getInt("signInResultCode");
                this.zzfl = (android.content.Intent) bundle.getParcelable("signInResultData");
                zzu();
                return;
            }
            return;
        }
        if (zzfg) {
            setResult(0);
            zzd(com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes.SIGN_IN_CURRENTLY_IN_PROGRESS);
            return;
        }
        zzfg = true;
        android.content.Intent intent2 = new android.content.Intent(action);
        intent2.setPackage(action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") ? "com.google.android.gms" : getPackageName());
        intent2.putExtra("config", this.zzfi);
        try {
            startActivityForResult(intent2, 40962);
        } catch (android.content.ActivityNotFoundException unused) {
            this.zzfh = true;
            zzd(17);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.zzfj);
        if (this.zzfj) {
            bundle.putInt("signInResultCode", this.zzfk);
            bundle.putParcelable("signInResultData", this.zzfl);
        }
    }

    private final void zzd(int i17) {
        com.google.android.gms.common.api.Status status = new com.google.android.gms.common.api.Status(i17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        zzfg = false;
    }
}
