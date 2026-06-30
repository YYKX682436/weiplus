package e33;

/* loaded from: classes10.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f328649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e33.c2 f328650e;

    public a2(e33.c2 c2Var, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.f328650e = c2Var;
        this.f328649d = atomicReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d0183 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183) this.f328649d.get();
        if (c15630x7d8d0183 == null) {
            return;
        }
        t23.n1 n1Var = t23.p0.k().f496829e;
        if (!c15630x7d8d0183.f219956o || n1Var == null || ((t23.f) n1Var).f496677g) {
            return;
        }
        try {
            java.lang.System.currentTimeMillis();
            int i17 = c15630x7d8d0183.f219952h;
            t23.p0.n().c(new e33.z1(this, c15630x7d8d0183.f219950f, i17));
            java.lang.System.currentTimeMillis();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GalleryAdapter", th6, "counting album size fail", new java.lang.Object[0]);
        }
    }
}
