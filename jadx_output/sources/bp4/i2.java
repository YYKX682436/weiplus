package bp4;

/* loaded from: classes10.dex */
public final class i2 implements dl.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bp4.k2 f23197a;

    public i2(bp4.k2 k2Var) {
        this.f23197a = k2Var;
    }

    @Override // dl.f
    public final boolean a(android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.o.d(motionEvent);
        bp4.k2.z(this.f23197a, motionEvent);
        return false;
    }
}
