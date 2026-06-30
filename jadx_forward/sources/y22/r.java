package y22;

/* loaded from: classes10.dex */
public final class r implements ph3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7 f540643a;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7 c13390xb12545d7) {
        this.f540643a = c13390xb12545d7;
    }

    @Override // ph3.d
    public void a(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7 c13390xb12545d7 = this.f540643a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13390xb12545d7.f180155h, "video size changed size[%d, %d] degrees[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        c13390xb12545d7.f180161q = i17;
        c13390xb12545d7.f180160p = i18;
        c13390xb12545d7.f180157m.f540617d.u(i17, i18);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = c13390xb12545d7.f180165u;
        if (a4Var != null) {
            a4Var.T4(c13390xb12545d7.f180161q, c13390xb12545d7.f180160p);
        }
    }

    @Override // ph3.d
    /* renamed from: onCompletion */
    public void mo75862xa6db431b() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = this.f540643a.f180165u;
        if (a4Var != null) {
            a4Var.mo9755xa6db431b();
        }
    }

    @Override // ph3.d
    /* renamed from: onError */
    public void mo75863xaf8aa769(int i17, int i18) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = this.f540643a.f180165u;
        if (a4Var != null) {
            a4Var.mo9756xaf8aa769(i17, i18);
        }
    }

    @Override // ph3.d
    /* renamed from: onPrepared */
    public void mo75864x58d5b73c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7 c13390xb12545d7 = this.f540643a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13390xb12545d7.f180155h, "onPrepared: ");
        c13390xb12545d7.f180162r = true;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = c13390xb12545d7.f180165u;
        if (a4Var != null) {
            a4Var.mo9757x58d5b73c();
        }
        c13390xb12545d7.requestLayout();
    }

    @Override // ph3.d
    /* renamed from: onSeekComplete */
    public void mo75865xe1fdf750() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7.f180154z;
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7 c13390xb12545d7 = this.f540643a;
        c13390xb12545d7.getClass();
        if (!c13390xb12545d7.f180163s) {
            java.lang.String str = c13390xb12545d7.f180155h;
            c13390xb12545d7.f180163s = true;
            return;
        }
        java.lang.String str2 = c13390xb12545d7.f180155h;
        ph3.k kVar = c13390xb12545d7.f180159o;
        if (kVar != null) {
            kVar.m();
        }
        ph3.k kVar2 = c13390xb12545d7.f180159o;
        if (kVar2 != null) {
            kVar2.mo158546x68ac462();
        }
    }
}
