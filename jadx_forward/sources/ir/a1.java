package ir;

/* loaded from: classes12.dex */
public final class a1 extends ir.u0 {

    /* renamed from: b, reason: collision with root package name */
    public final gr.c0 f375347b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f375348c;

    /* renamed from: d, reason: collision with root package name */
    public final int f375349d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(gr.c0 smileyInfo, boolean z17, int i17) {
        super(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(smileyInfo, "smileyInfo");
        this.f375347b = smileyInfo;
        this.f375348c = z17;
        this.f375349d = i17;
    }

    @Override // ir.u0
    /* renamed from: equals */
    public boolean mo139714xb2c87fbf(java.lang.Object obj) {
        if (super.mo139714xb2c87fbf(obj) && (obj instanceof ir.a1)) {
            ir.a1 a1Var = (ir.a1) obj;
            if (a1Var.f375348c == this.f375348c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a1Var.f375347b.f356196a, this.f375347b.f356196a)) {
                return true;
            }
        }
        return false;
    }
}
