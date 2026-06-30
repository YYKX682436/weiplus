package ed5;

/* loaded from: classes5.dex */
public final class r extends ed5.s {

    /* renamed from: a, reason: collision with root package name */
    public final int f332913a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f332914b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f332915c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f332916d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i17, java.lang.String sectionKey, java.lang.String displayText, android.view.View anchorView) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sectionKey, "sectionKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayText, "displayText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorView, "anchorView");
        this.f332913a = i17;
        this.f332914b = sectionKey;
        this.f332915c = displayText;
        this.f332916d = anchorView;
    }

    @Override // ed5.s
    public android.view.View a() {
        return this.f332916d;
    }

    /* renamed from: equals */
    public boolean m127341xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed5.r)) {
            return false;
        }
        ed5.r rVar = (ed5.r) obj;
        return this.f332913a == rVar.f332913a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f332914b, rVar.f332914b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f332915c, rVar.f332915c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f332916d, rVar.f332916d);
    }

    /* renamed from: hashCode */
    public int m127342x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f332913a) * 31) + this.f332914b.hashCode()) * 31) + this.f332915c.hashCode()) * 31) + this.f332916d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m127343x9616526c() {
        return "TimelineItem(adapterPosition=" + this.f332913a + ", sectionKey=" + this.f332914b + ", displayText=" + this.f332915c + ", anchorView=" + this.f332916d + ')';
    }
}
