package xh2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f536055a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedHashMap f536056b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Rect f536057c;

    /* renamed from: d, reason: collision with root package name */
    public final int f536058d;

    /* renamed from: e, reason: collision with root package name */
    public final int f536059e;

    /* renamed from: f, reason: collision with root package name */
    public final int f536060f;

    /* renamed from: g, reason: collision with root package name */
    public final int f536061g;

    /* renamed from: h, reason: collision with root package name */
    public final float f536062h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f536063i;

    public b(java.util.LinkedHashMap micViewRect, java.util.LinkedHashMap micLayoutInfo, android.graphics.Rect viewRootRect, int i17, int i18, int i19, int i27, float f17, java.util.LinkedList micCoverDataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micViewRect, "micViewRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micLayoutInfo, "micLayoutInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewRootRect, "viewRootRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micCoverDataList, "micCoverDataList");
        this.f536055a = micViewRect;
        this.f536056b = micLayoutInfo;
        this.f536057c = viewRootRect;
        this.f536058d = i17;
        this.f536059e = i18;
        this.f536060f = i19;
        this.f536061g = i27;
        this.f536062h = f17;
        this.f536063i = micCoverDataList;
    }

    /* renamed from: equals */
    public boolean m175536xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh2.b)) {
            return false;
        }
        xh2.b bVar = (xh2.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536055a, bVar.f536055a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536056b, bVar.f536056b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536057c, bVar.f536057c) && this.f536058d == bVar.f536058d && this.f536059e == bVar.f536059e && this.f536060f == bVar.f536060f && this.f536061g == bVar.f536061g && java.lang.Float.compare(this.f536062h, bVar.f536062h) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536063i, bVar.f536063i);
    }

    /* renamed from: hashCode */
    public int m175537x8cdac1b() {
        return (((((((((((((((this.f536055a.hashCode() * 31) + this.f536056b.hashCode()) * 31) + this.f536057c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f536058d)) * 31) + java.lang.Integer.hashCode(this.f536059e)) * 31) + java.lang.Integer.hashCode(this.f536060f)) * 31) + java.lang.Integer.hashCode(this.f536061g)) * 31) + java.lang.Float.hashCode(this.f536062h)) * 31) + this.f536063i.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m175538x9616526c() {
        return "FinderLiveMicInfoData(micViewRect=" + this.f536055a + ", micLayoutInfo=" + this.f536056b + ", viewRootRect=" + this.f536057c + ", mode=" + this.f536058d + ", voiceMode=" + this.f536059e + ", liveMode=" + this.f536060f + ", liveSubMode=" + this.f536061g + ", anchorVideoRate=" + this.f536062h + ", micCoverDataList=" + this.f536063i + ')';
    }
}
