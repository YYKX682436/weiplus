package bp4;

/* loaded from: classes10.dex */
public final class j2 implements dl.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bp4.k2 f23204a;

    public j2(bp4.k2 k2Var) {
        this.f23204a = k2Var;
    }

    @Override // dl.f
    public final boolean a(android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.o.d(motionEvent);
        bp4.k2.z(this.f23204a, motionEvent);
        return false;
    }
}
