package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes15.dex */
public class o7 implements ph3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 f273344a;

    public o7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4) {
        this.f273344a = c19745xad58a1a4;
    }

    @Override // ph3.d
    public void a(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4 = this.f273344a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c19745xad58a1a4.f272981h, "video size changed size[%d, %d] degrees[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        c19745xad58a1a4.f272980J.c();
        c19745xad58a1a4.f272986p = i19;
        c19745xad58a1a4.f272985o = i17;
        c19745xad58a1a4.f272984n = i18;
        c19745xad58a1a4.J();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = c19745xad58a1a4.f272993w;
        if (a4Var != null) {
            a4Var.T4(c19745xad58a1a4.f272985o, c19745xad58a1a4.f272984n);
        }
    }

    @Override // ph3.d
    /* renamed from: onCompletion */
    public void mo75862xa6db431b() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = this.f273344a.f272993w;
        if (a4Var != null) {
            a4Var.mo9755xa6db431b();
        }
    }

    @Override // ph3.d
    /* renamed from: onError */
    public void mo75863xaf8aa769(int i17, int i18) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = this.f273344a.f272993w;
        if (a4Var != null) {
            a4Var.mo9756xaf8aa769(i17, i18);
        }
    }

    @Override // ph3.d
    /* renamed from: onPrepared */
    public void mo75864x58d5b73c() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4 = this.f273344a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c19745xad58a1a4.f272981h, "%s onPrepared, path:%s", java.lang.Integer.valueOf(hashCode()), c19745xad58a1a4.getF256131m());
        c19745xad58a1a4.f272987q = true;
        c19745xad58a1a4.mo69318x764d819b(c19745xad58a1a4.f272988r);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = c19745xad58a1a4.f272993w;
        if (a4Var != null) {
            a4Var.mo9757x58d5b73c();
        }
        c19745xad58a1a4.requestLayout();
    }

    @Override // ph3.d
    /* renamed from: onSeekComplete */
    public void mo75865xe1fdf750() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4 = this.f273344a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c4 c4Var = c19745xad58a1a4.f272995y;
        if (c4Var != null) {
            c4Var.z(c19745xad58a1a4.f272989s);
        }
        if (!c19745xad58a1a4.f272989s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c19745xad58a1a4.f272981h, "player seek done, but don't play now.");
            c19745xad58a1a4.f272989s = true;
            return;
        }
        ph3.k kVar = c19745xad58a1a4.f272983m;
        if (kVar != null) {
            java.lang.String str = c19745xad58a1a4.f272981h;
            kVar.m();
            c19745xad58a1a4.f272983m.mo158546x68ac462();
        }
    }
}
