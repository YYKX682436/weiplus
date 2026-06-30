package com.p314xaae8f345.p3133xd0ce8b26.aff.ovc;

/* renamed from: com.tencent.wechat.aff.ovc.ZIDL_fglmgqe6B */
/* loaded from: classes11.dex */
class C27488x418a8dbd extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.h {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.i f299000a;

    /* renamed from: ZIDL_CX */
    private native void m116619x1964d1bd(long j17, long j18);

    /* renamed from: ZIDL_DX */
    private native void m116620x1964d1dc(long j17, long j18);

    /* renamed from: ZIDL_FI */
    private native void m116621x1964d20b(long j17, java.lang.String str, boolean z17);

    /* renamed from: ZIDL_GI */
    private native void m116622x1964d22a(long j17);

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.h
    public void H() {
        m116622x1964d22a(this.f60633xf042a733);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.h
    public void K1(java.lang.String str, boolean z17) {
        m116621x1964d20b(this.f60633xf042a733, str, z17);
    }

    /* renamed from: ZIDL_B */
    public boolean m116623x9db8edfa(java.lang.String username) {
        h41.o0 o0Var = (h41.o0) this.f299000a;
        o0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        return !o0Var.f360378k && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o0Var.f360373d, username);
    }

    /* renamed from: ZIDL_CV */
    public void m116624x1964d1bb(long j17, java.lang.String str, java.lang.String str2) {
        h41.o0 o0Var = (h41.o0) this.f299000a;
        o0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCMsgUI", "showAsync called: taskId=" + j17 + ", username=" + str + ", preInput=" + str2);
        if (o0Var.f360378k) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCMsgUI", "showAsync: already released");
            com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.h hVar = o0Var.f360370a;
            if (hVar != null) {
                ((com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.C27488x418a8dbd) hVar).c(j17);
                return;
            }
            return;
        }
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCMsgUI", "showAsync: username is empty");
            com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.h hVar2 = o0Var.f360370a;
            if (hVar2 != null) {
                ((com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.C27488x418a8dbd) hVar2).c(j17);
                return;
            }
            return;
        }
        if (o0Var.f360371b != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCMsgUI", "showAsync: already shown");
            com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.h hVar3 = o0Var.f360370a;
            if (hVar3 != null) {
                ((com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.C27488x418a8dbd) hVar3).c(j17);
                return;
            }
            return;
        }
        o0Var.f360372c = j17;
        o0Var.f360373d = str;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = o0Var.f360377j;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        o0Var.f360377j = p3325xe03a0797.p3326xc267989b.l.d(o0Var.f360375h, null, null, new h41.n0(o0Var, str, null), 3, null);
    }

    /* renamed from: ZIDL_DV */
    public void m116625x1964d1da(long j17) {
        h41.o0 o0Var = (h41.o0) this.f299000a;
        p3325xe03a0797.p3326xc267989b.l.d(o0Var.f360375h, null, null, new h41.l0(o0Var, j17, null), 3, null);
    }

    /* renamed from: ZIDL_E */
    public void m116626x9db8edfd(java.lang.String username, java.lang.String str) {
        h41.o0 o0Var = (h41.o0) this.f299000a;
        if (o0Var.f360378k) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCMsgUI", "setEditingText: already released");
            return;
        }
        boolean z17 = false;
        if ((username == null || username.length() == 0) || str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCMsgUI", "setEditingText: invalid params");
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        if (!o0Var.f360378k && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o0Var.f360373d, username)) {
            z17 = true;
        }
        if (z17) {
            p3325xe03a0797.p3326xc267989b.l.d(o0Var.f360375h, null, null, new h41.m0(o0Var, str, null), 3, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCMsgUI", "setEditingText: not verify " + username + ' ' + o0Var.f360373d);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.i iVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.i) obj;
        this.f299000a = iVar;
        ((h41.o0) iVar).f360370a = this;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.h
    public void b(long j17) {
        m116620x1964d1dc(this.f60633xf042a733, j17);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.h
    public void c(long j17) {
        m116619x1964d1bd(this.f60633xf042a733, j17);
    }
}
