package qx4;

/* loaded from: classes8.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qx4.d0 f448924d;

    public c0(qx4.d0 d0Var) {
        this.f448924d = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f448924d.f448929e = true;
        qx4.d dVar = this.f448924d.f448935k;
        if (dVar != null) {
            ((qx4.y) dVar).mo14837xb03baf04();
        }
    }
}
