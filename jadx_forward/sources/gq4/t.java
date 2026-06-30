package gq4;

/* loaded from: classes14.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gq4.v f356138d;

    public t(gq4.v vVar) {
        this.f356138d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f356138d.f356141f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.t0 t0Var = this.f356138d.f356141f[0];
            if (t0Var != null) {
                t0Var.a(true);
                this.f356138d.f356141f[0] = null;
            }
        }
    }
}
