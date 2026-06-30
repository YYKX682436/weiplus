package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.zact */
/* loaded from: classes13.dex */
public final class BinderC1868x38edd8 extends com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.p237x21ffc6bd.zac implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener {
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1731x2722202e zaa = com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.zad.zac;
    private final android.content.Context zab;
    private final android.os.Handler zac;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1731x2722202e zad;
    private final java.util.Set zae;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e zaf;
    private com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.zae zag;
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1867x38edd7 zah;

    public BinderC1868x38edd8(android.content.Context context, android.os.Handler handler, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e c1904x2257e52e) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1731x2722202e abstractC1731x2722202e = zaa;
        this.zab = context;
        this.zac = handler;
        this.zaf = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(c1904x2257e52e, "ClientSettings must not be null");
        this.zae = c1904x2257e52e.m18143x80a4fe14();
        this.zad = abstractC1731x2722202e;
    }

    public static /* bridge */ /* synthetic */ void zad(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.BinderC1868x38edd8 binderC1868x38edd8, com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.p237x21ffc6bd.zak zakVar) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb zaa2 = zakVar.zaa();
        if (zaa2.m17605x6e268779()) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zav zavVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zav) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(zakVar.zab());
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb zaa3 = zavVar.zaa();
            if (!zaa3.m17605x6e268779()) {
                java.lang.String valueOf = java.lang.String.valueOf(zaa3);
                android.util.Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new java.lang.Exception());
                binderC1868x38edd8.zah.zae(zaa3);
                binderC1868x38edd8.zag.mo17708x1f9d589c();
                return;
            }
            binderC1868x38edd8.zah.zaf(zavVar.zab(), binderC1868x38edd8.zae);
        } else {
            binderC1868x38edd8.zah.zae(zaa2);
        }
        binderC1868x38edd8.zag.mo17708x1f9d589c();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1772x6c072b70
    /* renamed from: onConnected */
    public final void mo17884xdba42fea(android.os.Bundle bundle) {
        this.zag.zad(this);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1784xee64ffae
    /* renamed from: onConnectionFailed */
    public final void mo17932xce9394ba(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb) {
        this.zah.zae(c1700xff0c58bb);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1772x6c072b70
    /* renamed from: onConnectionSuspended */
    public final void mo17885x4511603e(int i17) {
        this.zah.zag(i17);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.p237x21ffc6bd.zac, com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.p237x21ffc6bd.zae
    public final void zab(com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.p237x21ffc6bd.zak zakVar) {
        this.zac.post(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.RunnableC1866x38edd6(this, zakVar));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.common.api.Api$Client, com.google.android.gms.signin.zae] */
    public final void zae(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1867x38edd7 interfaceC1867x38edd7) {
        com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.zae zaeVar = this.zag;
        if (zaeVar != null) {
            zaeVar.mo17708x1f9d589c();
        }
        this.zaf.zae(java.lang.Integer.valueOf(java.lang.System.identityHashCode(this)));
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1731x2722202e abstractC1731x2722202e = this.zad;
        android.content.Context context = this.zab;
        android.os.Handler handler = this.zac;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e c1904x2257e52e = this.zaf;
        this.zag = abstractC1731x2722202e.mo17329x6a949bd9(context, handler.getLooper(), c1904x2257e52e, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e) c1904x2257e52e.zaa(), (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks) this, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener) this);
        this.zah = interfaceC1867x38edd7;
        java.util.Set set = this.zae;
        if (set == null || set.isEmpty()) {
            this.zac.post(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.RunnableC1865x38edd5(this));
        } else {
            this.zag.zab();
        }
    }

    public final void zaf() {
        com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.zae zaeVar = this.zag;
        if (zaeVar != null) {
            zaeVar.mo17708x1f9d589c();
        }
    }
}
