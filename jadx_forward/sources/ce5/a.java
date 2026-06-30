package ce5;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f122326a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f122327b;

    /* renamed from: c, reason: collision with root package name */
    public final long f122328c;

    /* renamed from: d, reason: collision with root package name */
    public final long f122329d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f122330e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f122331f;

    public a(java.lang.String query, boolean z17, long j17, long j18, java.util.ArrayList picDataList, java.util.ArrayList ocrDataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(picDataList, "picDataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ocrDataList, "ocrDataList");
        this.f122326a = query;
        this.f122327b = z17;
        this.f122328c = j17;
        this.f122329d = j18;
        this.f122330e = picDataList;
        this.f122331f = ocrDataList;
    }

    /* renamed from: equals */
    public boolean m14718xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce5.a)) {
            return false;
        }
        ce5.a aVar = (ce5.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f122326a, aVar.f122326a) && this.f122327b == aVar.f122327b && this.f122328c == aVar.f122328c && this.f122329d == aVar.f122329d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f122330e, aVar.f122330e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f122331f, aVar.f122331f);
    }

    /* renamed from: hashCode */
    public int m14719x8cdac1b() {
        return (((((((((this.f122326a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f122327b)) * 31) + java.lang.Long.hashCode(this.f122328c)) * 31) + java.lang.Long.hashCode(this.f122329d)) * 31) + this.f122330e.hashCode()) * 31) + this.f122331f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m14720x9616526c() {
        return "LoadMoreDataBean(query=" + this.f122326a + ", isLastData=" + this.f122327b + ", firstTimeStamp=" + this.f122328c + ", lastTimeStamp=" + this.f122329d + ", picDataList=" + this.f122330e + ", ocrDataList=" + this.f122331f + ')';
    }
}
