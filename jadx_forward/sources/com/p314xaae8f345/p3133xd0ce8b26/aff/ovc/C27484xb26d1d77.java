package com.p314xaae8f345.p3133xd0ce8b26.aff.ovc;

/* renamed from: com.tencent.wechat.aff.ovc.ZIDL_fglmE4rQcB */
/* loaded from: classes11.dex */
class C27484xb26d1d77 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.l {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.m f298996a;

    /* renamed from: ZIDL_BX */
    private native void m116591x1964d19e(long j17, long j18);

    /* renamed from: ZIDL_CX */
    private native void m116592x1964d1bd(long j17, long j18);

    /* renamed from: ZIDL_EI */
    private native void m116593x1964d1ec(long j17);

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.l
    public void H() {
        m116593x1964d1ec(this.f60633xf042a733);
    }

    /* renamed from: ZIDL_BV */
    public void m116594x1964d19c(long j17, java.lang.String[] strArr, java.lang.String scene) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.m mVar = this.f298996a;
        java.util.ArrayList<java.lang.String> usernames = com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119642x3ed538a1(strArr);
        h41.y0 y0Var = (h41.y0) mVar;
        y0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usernames, "usernames");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        if (y0Var.f360434j) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCSelectContactUI", "show: already released");
            com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.l lVar = y0Var.f360427a;
            if (lVar != null) {
                ((com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.C27484xb26d1d77) lVar).c(j17);
                return;
            }
            return;
        }
        if (y0Var.f360428b != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCSelectContactUI", "show: already shown");
            com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.l lVar2 = y0Var.f360427a;
            if (lVar2 != null) {
                ((com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.C27484xb26d1d77) lVar2).c(j17);
                return;
            }
            return;
        }
        y0Var.f360429c = j17;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = y0Var.f360433i;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        y0Var.f360433i = p3325xe03a0797.p3326xc267989b.l.d(y0Var.f360431g, null, null, new h41.w0(y0Var, scene, usernames, null), 3, null);
    }

    /* renamed from: ZIDL_CV */
    public void m116595x1964d1bb(long j17) {
        h41.y0 y0Var = (h41.y0) this.f298996a;
        p3325xe03a0797.p3326xc267989b.l.d(y0Var.f360431g, null, null, new h41.v0(y0Var, j17, null), 3, null);
    }

    /* renamed from: ZIDL_D */
    public void m116596x9db8edfc(java.lang.String[] strArr, java.lang.String scene) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.m mVar = this.f298996a;
        java.util.ArrayList<java.lang.String> usernames = com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119642x3ed538a1(strArr);
        h41.y0 y0Var = (h41.y0) mVar;
        y0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usernames, "usernames");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        if (y0Var.f360434j) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCSelectContactUI", "updateContacts: already released");
        } else {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var.f360431g, null, null, new h41.x0(y0Var, usernames, scene, null), 3, null);
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.m mVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.m) obj;
        this.f298996a = mVar;
        ((h41.y0) mVar).f360427a = this;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.l
    public void b(long j17) {
        m116592x1964d1bd(this.f60633xf042a733, j17);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.l
    public void c(long j17) {
        m116591x1964d19e(this.f60633xf042a733, j17);
    }
}
