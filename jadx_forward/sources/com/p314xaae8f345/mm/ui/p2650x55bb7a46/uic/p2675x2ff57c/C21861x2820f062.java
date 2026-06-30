package com.p314xaae8f345.mm.ui.p2650x55bb7a46.uic.p2675x2ff57c;

/* renamed from: com.tencent.mm.ui.chatting.uic.file.FileQBUIC */
/* loaded from: classes8.dex */
public final class C21861x2820f062 extends wm3.a implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.w3 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f284287d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f284288e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21861x2820f062(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f284287d = jz5.h.b(new qe5.v1(this));
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f284288e = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5859xba7191d9>(a0Var) { // from class: com.tencent.mm.ui.chatting.uic.file.FileQBUIC$mLoadEndListener$1
            {
                this.f39173x3fe91575 = -1362078743;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5859xba7191d9 c5859xba7191d9) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5859xba7191d9 event = c5859xba7191d9;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.uic.p2675x2ff57c.C21861x2820f062 c21861x2820f062 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.uic.p2675x2ff57c.C21861x2820f062.this;
                kd5.e T6 = c21861x2820f062.T6();
                if ((T6 != null ? T6.K : false) && (P6 = c21861x2820f062.P6()) != null) {
                    P6.finish();
                }
                return false;
            }
        };
    }

    public final kd5.e T6() {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            return (kd5.e) Q6.mo140437x75286adb();
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.w3
    public ty.l0 i5() {
        jz5.g gVar = this.f284287d;
        return new ty.l0(false, ((em.d0) ((jz5.n) gVar).mo141623x754a37bb()).h().getText().toString(), ((em.d0) ((jz5.n) gVar).mo141623x754a37bb()).g().getText().toString(), "", ((em.d0) ((jz5.n) gVar).mo141623x754a37bb()).h().getVisibility() == 0, ((em.d0) ((jz5.n) gVar).mo141623x754a37bb()).g().getVisibility() == 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        this.f284288e.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.f284288e.mo48814x2efc64();
    }
}
