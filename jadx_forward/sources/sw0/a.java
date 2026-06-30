package sw0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ol5 f494945a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f494946b;

    public a(r45.ol5 titleInfo, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(titleInfo, "titleInfo");
        this.f494945a = titleInfo;
        this.f494946b = z17;
    }

    /* renamed from: equals */
    public boolean m165388xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw0.a)) {
            return false;
        }
        sw0.a aVar = (sw0.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f494945a, aVar.f494945a) && this.f494946b == aVar.f494946b;
    }

    /* renamed from: hashCode */
    public int m165389x8cdac1b() {
        return (this.f494945a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f494946b);
    }

    /* renamed from: toString */
    public java.lang.String m165390x9616526c() {
        return "RecommendTitleItem(titleInfo=" + this.f494945a + ", selected=" + this.f494946b + ')';
    }
}
