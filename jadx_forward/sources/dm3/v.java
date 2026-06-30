package dm3;

/* loaded from: classes10.dex */
public final class v implements bi4.k0 {

    /* renamed from: f, reason: collision with root package name */
    public static int f323276f;

    /* renamed from: d, reason: collision with root package name */
    public final dm3.j f323277d = new dm3.j();

    /* renamed from: e, reason: collision with root package name */
    public boolean f323278e;

    @Override // bi4.r0
    public al5.a0 A1(java.lang.String str, android.widget.FrameLayout container, pj4.j0 j0Var, pj4.t pullDownParam) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pullDownParam, "pullDownParam");
        int i17 = pullDownParam.f436822e;
        if (i17 == 0) {
            return null;
        }
        boolean z17 = true;
        if (i17 != 1 && i17 != 3) {
            z17 = false;
        }
        if (z17) {
            return new dm3.o(str, container, j0Var, pullDownParam, f323276f);
        }
        if (i17 == 2) {
            return new dm3.i(str, container, j0Var, pullDownParam, f323276f);
        }
        return null;
    }

    @Override // bi4.r0
    /* renamed from: release */
    public void mo10634x41012807() {
    }

    @Override // bi4.r0
    public bi4.o0 w7(java.lang.String str) {
        this.f323278e = true;
        return new dm3.u(str, this);
    }
}
