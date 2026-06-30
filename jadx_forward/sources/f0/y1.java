package f0;

/* loaded from: classes14.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f339807a;

    /* renamed from: b, reason: collision with root package name */
    public final int f339808b;

    /* renamed from: c, reason: collision with root package name */
    public final int f339809c;

    /* renamed from: d, reason: collision with root package name */
    public final f0.v1 f339810d;

    /* renamed from: e, reason: collision with root package name */
    public final f0.k1 f339811e;

    /* renamed from: f, reason: collision with root package name */
    public final f0.k2 f339812f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.p f339813g;

    public y1(boolean z17, java.util.List slotSizesSums, int i17, int i18, int i19, f0.v1 measuredItemProvider, f0.k1 spanLayoutProvider, f0.k2 measuredLineFactory) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slotSizesSums, "slotSizesSums");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measuredItemProvider, "measuredItemProvider");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spanLayoutProvider, "spanLayoutProvider");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measuredLineFactory, "measuredLineFactory");
        this.f339807a = z17;
        this.f339808b = i18;
        this.f339809c = i19;
        this.f339810d = measuredItemProvider;
        this.f339811e = spanLayoutProvider;
        this.f339812f = measuredLineFactory;
        this.f339813g = new f0.x1(slotSizesSums, i17, this);
    }

    public final f0.w1 a(int i17) {
        f0.i1 b17 = this.f339811e.b(i17);
        java.util.List spans = b17.f339650b;
        int size = spans.size();
        int i18 = b17.f339649a;
        int i19 = (size == 0 || i18 + size == this.f339808b) ? 0 : this.f339809c;
        f0.u1[] u1VarArr = new f0.u1[size];
        int i27 = 0;
        for (int i28 = 0; i28 < size; i28++) {
            int i29 = (int) ((f0.d) spans.get(i28)).f339573a;
            long j17 = ((p2.c) ((f0.x1) this.f339813g).mo149xb9724478(java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i29))).f432910a;
            i27 += i29;
            u1VarArr[i28] = this.f339810d.a(i18 + i28, i19, j17);
        }
        f0.i0 i0Var = (f0.i0) this.f339812f;
        i0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spans, "spans");
        return new f0.w1(i17, u1VarArr, spans, i0Var.f339645a, i0Var.f339646b.size(), ((p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.s) i0Var.f339647c).mo7007x6fcfed3f(), i19, i0Var.f339648d, null);
    }
}
