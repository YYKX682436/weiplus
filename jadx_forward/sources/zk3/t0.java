package zk3;

/* loaded from: classes8.dex */
public final class t0 implements oa5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f555039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f555040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f555041c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f555042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zk3.w0 f555043e;

    public t0(int i17, int i18, float f17, android.graphics.Rect rect, zk3.w0 w0Var) {
        this.f555039a = i17;
        this.f555040b = i18;
        this.f555041c = f17;
        this.f555042d = rect;
        this.f555043e = w0Var;
    }

    @Override // oa5.a
    public final void a(float f17) {
        float f18 = this.f555039a;
        int i17 = this.f555040b;
        float f19 = this.f555041c;
        float f27 = 1;
        float f28 = f27 - f17;
        float height = (((i17 * f19) - this.f555042d.height()) / 2) * f28 * (f27 / f19);
        float f29 = i17 - height;
        zk3.w0 w0Var = this.f555043e;
        bk3.a aVar = w0Var.f555050d;
        if (aVar != null) {
            aVar.mo10674x57005f90((int) (255 * f28));
        }
        bk3.a aVar2 = w0Var.f555050d;
        if (aVar2 != null) {
            aVar2.a(0.0f, height, f18, f29);
        }
        bk3.a aVar3 = w0Var.f555050d;
        if (aVar3 != null) {
            int i18 = ek3.e.f335142u;
            int i19 = ek3.e.f335142u;
            aVar3.b(0.0f, 0.0f, 0.0f, 0.0f, (i19 * f28) / f19, (i19 * f28) / f19, (i19 * f28) / f19, (i19 * f28) / f19);
        }
        bk3.a aVar4 = w0Var.f555050d;
        if (aVar4 != null) {
            aVar4.postInvalidate();
        }
    }
}
