package b5;

/* loaded from: classes13.dex */
public class c implements a5.j0 {

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.j0 f17852c = new androidx.lifecycle.j0();

    /* renamed from: d, reason: collision with root package name */
    public final l5.m f17853d = new l5.m();

    public c() {
        a(a5.j0.f1403b);
    }

    public void a(a5.i0 i0Var) {
        this.f17852c.postValue(i0Var);
        boolean z17 = i0Var instanceof a5.h0;
        l5.m mVar = this.f17853d;
        if (z17) {
            mVar.i((a5.h0) i0Var);
        } else if (i0Var instanceof a5.f0) {
            mVar.j(((a5.f0) i0Var).f1393a);
        }
    }
}
