package lp3;

/* loaded from: classes5.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401822d;

    public j(lp3.l lVar, java.lang.String str) {
        this.f401822d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.d1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574508ii5));
        f9Var.m124850x7650bebc(10000);
        f9Var.j1(0);
        f9Var.u1(this.f401822d);
        f9Var.e1(java.lang.System.currentTimeMillis());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatMsgExtension", "insert pat failed msg %d", java.lang.Long.valueOf(c01.w9.x(f9Var)));
    }
}
