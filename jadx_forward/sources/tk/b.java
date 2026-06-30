package tk;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f501392a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f501393b;

    public b(android.view.View bizPublishView, java.lang.String bizCntWording) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizPublishView, "bizPublishView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizCntWording, "bizCntWording");
        this.f501392a = bizPublishView;
        this.f501393b = bizCntWording;
    }

    /* renamed from: equals */
    public boolean m166684xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk.b)) {
            return false;
        }
        tk.b bVar = (tk.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f501392a, bVar.f501392a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f501393b, bVar.f501393b);
    }

    /* renamed from: hashCode */
    public int m166685x8cdac1b() {
        return (this.f501392a.hashCode() * 31) + this.f501393b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m166686x9616526c() {
        return "BizPublishedInfo(bizPublishView=" + this.f501392a + ", bizCntWording=" + this.f501393b + ')';
    }
}
