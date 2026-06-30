package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd;

/* renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity */
/* loaded from: classes13.dex */
public class ActivityC1691x1b6915e2 extends p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f {

    /* renamed from: zzfg */
    private static boolean f5685x394c01;

    /* renamed from: zzfh */
    private boolean f5686x394c02 = false;

    /* renamed from: zzfi */
    private com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1690xfec9ac34 f5687x394c03;

    /* renamed from: zzfj */
    private boolean f5688x394c04;

    /* renamed from: zzfk */
    private int f5689x394c05;

    /* renamed from: zzfl */
    private android.content.Intent f5690x394c06;

    /* renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity$zzd */
    /* loaded from: classes13.dex */
    public class zzd implements a4.a {
        private zzd() {
        }

        @Override // a4.a
        /* renamed from: onCreateLoader */
        public final p012xc85e97e9.p094xbe953013.p095x38b73479.e mo517xc48c9bae(int i17, android.os.Bundle bundle) {
            return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzf(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.ActivityC1691x1b6915e2.this, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.m17768x7476751d());
        }

        @Override // a4.a
        /* renamed from: onLoadFinished */
        public final /* synthetic */ void mo518x99a02ef7(p012xc85e97e9.p094xbe953013.p095x38b73479.e eVar, java.lang.Object obj) {
            com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.ActivityC1691x1b6915e2 activityC1691x1b6915e2 = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.ActivityC1691x1b6915e2.this;
            activityC1691x1b6915e2.setResult(activityC1691x1b6915e2.f5689x394c05, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.ActivityC1691x1b6915e2.this.f5690x394c06);
            com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.ActivityC1691x1b6915e2.this.finish();
        }

        @Override // a4.a
        /* renamed from: onLoaderReset */
        public final void mo519x40d6999d(p012xc85e97e9.p094xbe953013.p095x38b73479.e eVar) {
        }
    }

    private final void zzu() {
        a4.b m7596x8181a101 = m7596x8181a101();
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.ActivityC1691x1b6915e2.zzd zzdVar = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.ActivityC1691x1b6915e2.zzd();
        a4.g gVar = (a4.g) m7596x8181a101;
        a4.f fVar = gVar.f82701b;
        if (fVar.f82699e) {
            throw new java.lang.IllegalStateException("Called while creating a loader");
        }
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("initLoader must be called on the main thread");
        }
        x.o oVar = fVar.f82698d;
        a4.c cVar = (a4.c) oVar.e(0, null);
        p012xc85e97e9.p093xedfae76a.y yVar = gVar.f82700a;
        if (cVar == null) {
            try {
                fVar.f82699e = true;
                p012xc85e97e9.p094xbe953013.p095x38b73479.e mo517xc48c9bae = zzdVar.mo517xc48c9bae(0, null);
                if (mo517xc48c9bae == null) {
                    throw new java.lang.IllegalArgumentException("Object returned from onCreateLoader must not be null");
                }
                if (mo517xc48c9bae.getClass().isMemberClass() && !java.lang.reflect.Modifier.isStatic(mo517xc48c9bae.getClass().getModifiers())) {
                    throw new java.lang.IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + mo517xc48c9bae);
                }
                a4.c cVar2 = new a4.c(0, null, mo517xc48c9bae, null);
                oVar.g(0, cVar2);
                fVar.f82699e = false;
                a4.d dVar = new a4.d(cVar2.f82690f, zzdVar);
                cVar2.mo7806x9d92d11c(yVar, dVar);
                a4.d dVar2 = cVar2.f82692h;
                if (dVar2 != null) {
                    cVar2.mo522xb5bdeb7a(dVar2);
                }
                cVar2.f82691g = yVar;
                cVar2.f82692h = dVar;
            } catch (java.lang.Throwable th6) {
                fVar.f82699e = false;
                throw th6;
            }
        } else {
            a4.d dVar3 = new a4.d(cVar.f82690f, zzdVar);
            cVar.mo7806x9d92d11c(yVar, dVar3);
            a4.d dVar4 = cVar.f82692h;
            if (dVar4 != null) {
                cVar.mo522xb5bdeb7a(dVar4);
            }
            cVar.f82691g = yVar;
            cVar.f82692h = dVar3;
        }
        f5685x394c01 = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (this.f5686x394c02) {
            return;
        }
        setResult(0);
        if (i17 != 40962) {
            return;
        }
        if (intent != null) {
            com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1687x633b87eb c1687x633b87eb = (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1687x633b87eb) intent.getParcelableExtra(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.InterfaceC1680x45dd509f.f5659x38725a66);
            if (c1687x633b87eb != null && c1687x633b87eb.m17542x76a2ab1c() != null) {
                com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 m17542x76a2ab1c = c1687x633b87eb.m17542x76a2ab1c();
                com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzq.zze(this).zzd(this.f5687x394c03.zzt(), m17542x76a2ab1c);
                intent.removeExtra(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.InterfaceC1680x45dd509f.f5659x38725a66);
                intent.putExtra("googleSignInAccount", m17542x76a2ab1c);
                this.f5688x394c04 = true;
                this.f5689x394c05 = i18;
                this.f5690x394c06 = intent;
                zzu();
                return;
            }
            if (intent.hasExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993)) {
                zzd(intent.getIntExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, 8));
                return;
            }
        }
        zzd(8);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        java.lang.String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            zzd(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1685x4087f8d9.f5676x70326095);
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
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1690xfec9ac34 c1690xfec9ac34 = (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1690xfec9ac34) intent.getBundleExtra("config").getParcelable("config");
        this.f5687x394c03 = c1690xfec9ac34;
        if (c1690xfec9ac34 == null) {
            setResult(0);
            finish();
            return;
        }
        if (!(bundle == null)) {
            boolean z17 = bundle.getBoolean("signingInGoogleApiClients");
            this.f5688x394c04 = z17;
            if (z17) {
                this.f5689x394c05 = bundle.getInt("signInResultCode");
                this.f5690x394c06 = (android.content.Intent) bundle.getParcelable("signInResultData");
                zzu();
                return;
            }
            return;
        }
        if (f5685x394c01) {
            setResult(0);
            zzd(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1685x4087f8d9.f5675xa7e4b696);
            return;
        }
        f5685x394c01 = true;
        android.content.Intent intent2 = new android.content.Intent(action);
        intent2.setPackage(action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") ? "com.google.android.gms" : getPackageName());
        intent2.putExtra("config", this.f5687x394c03);
        try {
            startActivityForResult(intent2, 40962);
        } catch (android.content.ActivityNotFoundException unused) {
            this.f5686x394c02 = true;
            zzd(17);
        }
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f5688x394c04);
        if (this.f5688x394c04) {
            bundle.putInt("signInResultCode", this.f5689x394c05);
            bundle.putParcelable("signInResultData", this.f5690x394c06);
        }
    }

    private final void zzd(int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(i17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("googleSignInStatus", c1763x9432bc12);
        setResult(0, intent);
        finish();
        f5685x394c01 = false;
    }
}
