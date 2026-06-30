package uh1;

/* loaded from: classes13.dex */
public final class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uh1.y1 f509446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uh1.p1 f509447e;

    public v1(uh1.y1 y1Var, uh1.p1 p1Var) {
        this.f509446d = y1Var;
        this.f509447e = p1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f509446d.f509472a;
        uh1.p1 p1Var = this.f509447e;
        if (copyOnWriteArraySet.remove(p1Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkProvider", "provide, timeout");
            p1Var.a(null);
        }
    }
}
