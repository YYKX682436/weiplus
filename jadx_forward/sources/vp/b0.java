package vp;

/* loaded from: classes16.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f520266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vp.c0 f520267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vp.d0 f520268f;

    public b0(vp.d0 d0Var, java.util.List list, vp.c0 c0Var) {
        this.f520268f = d0Var;
        this.f520266d = list;
        this.f520267e = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (wp.a aVar : this.f520266d) {
            vp.d0.b(this.f520268f.f520299d, aVar);
            vp.c0 c0Var = this.f520267e;
            if (c0Var != null) {
                c0Var.a(aVar);
            }
        }
    }
}
