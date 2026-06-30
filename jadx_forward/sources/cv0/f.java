package cv0;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final cv0.e f304067a;

    /* renamed from: b, reason: collision with root package name */
    public final cv0.e f304068b;

    /* renamed from: c, reason: collision with root package name */
    public final cv0.e f304069c;

    public f(cv0.e eVar, cv0.e inFirstPanel, cv0.e inEditPanel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eVar, "default");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inFirstPanel, "inFirstPanel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inEditPanel, "inEditPanel");
        this.f304067a = eVar;
        this.f304068b = inFirstPanel;
        this.f304069c = inEditPanel;
    }

    /* renamed from: equals */
    public boolean m122780xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv0.f)) {
            return false;
        }
        cv0.f fVar = (cv0.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f304067a, fVar.f304067a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f304068b, fVar.f304068b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f304069c, fVar.f304069c);
    }

    /* renamed from: hashCode */
    public int m122781x8cdac1b() {
        return (((this.f304067a.m122778x8cdac1b() * 31) + this.f304068b.m122778x8cdac1b()) * 31) + this.f304069c.m122778x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m122782x9616526c() {
        return "HandleBoxShowOptions(default=" + this.f304067a + ", inFirstPanel=" + this.f304068b + ", inEditPanel=" + this.f304069c + ')';
    }
}
