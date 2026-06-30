package wn4;

/* loaded from: classes11.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb f529096d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb) {
        this.f529096d = c16114x800e8cdb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        wn4.x xVar = wn4.x.f529104a;
        java.lang.String h07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h0(this.f529096d.f223948n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h07, "getSizeMB(...)");
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k3x, new java.lang.Object[]{h07});
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        u1Var.g(string);
        u1Var.b(wn4.q.f529094a);
        u1Var.e(wn4.r.f529095d);
        u1Var.a(true);
        u1Var.q(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "hotPatchInstallSuccessDialog show");
    }
}
