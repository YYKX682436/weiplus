package f0;

/* loaded from: classes14.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final f0.q f339784a;

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.r f339785b;

    /* renamed from: c, reason: collision with root package name */
    public final int f339786c;

    /* renamed from: d, reason: collision with root package name */
    public final f0.j2 f339787d;

    public v1(f0.q itemProvider, p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.r measureScope, int i17, f0.j2 measuredItemFactory) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemProvider, "itemProvider");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measureScope, "measureScope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measuredItemFactory, "measuredItemFactory");
        this.f339784a = itemProvider;
        this.f339785b = measureScope;
        this.f339786c = i17;
        this.f339787d = measuredItemFactory;
    }

    public final f0.u1 a(int i17, int i18, long j17) {
        int i19;
        java.lang.Object c17 = ((f0.s) this.f339784a).c(i17);
        s1.o1[] b17 = ((p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.s) this.f339785b).b(i17, j17);
        if (p2.c.f(j17)) {
            i19 = p2.c.j(j17);
        } else {
            if (!p2.c.e(j17)) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            i19 = p2.c.i(j17);
        }
        int i27 = i19;
        f0.h0 h0Var = (f0.h0) this.f339787d;
        h0Var.getClass();
        return new f0.u1(i17, c17, h0Var.f339637d, i27, i18, h0Var.f339638e, ((p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.s) h0Var.f339634a).mo7007x6fcfed3f(), h0Var.f339639f, h0Var.f339640g, b17, h0Var.f339641h, p2.n.a(h0Var.f339635b, h0Var.f339636c), null);
    }
}
