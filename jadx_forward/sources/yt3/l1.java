package yt3;

/* loaded from: classes10.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.o1 f547056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f547057e;

    public l1(yt3.o1 o1Var, ju3.d0 d0Var) {
        this.f547056d = o1Var;
        this.f547057e = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMRecordUI", "onTextureUpdate");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4 = this.f547056d.f547092d;
        if (c19745xad58a1a4 != null) {
            c19745xad58a1a4.setAlpha(1.0f);
        }
        ju3.d0.k(this.f547057e, ju3.c0.D, null, 2, null);
    }
}
