package m31;

/* loaded from: classes9.dex */
public final class w0 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m31.y0 f404758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f404759b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f404760c;

    public w0(m31.y0 y0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        this.f404758a = y0Var;
        this.f404759b = k3Var;
        this.f404760c = i17;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        this.f404758a.y(z17, this.f404759b, this.f404760c);
    }
}
