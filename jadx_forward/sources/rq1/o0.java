package rq1;

/* loaded from: classes10.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f480305d;

    public o0(java.lang.String str) {
        this.f480305d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (rq1.e0.j(this.f480305d) == 0) {
                rq1.e0.b(true);
                rq1.e0.g(rq1.e0.e(false));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Box.PluginBox", e17, "[updateWordBankRes]", new java.lang.Object[0]);
        }
    }
}
