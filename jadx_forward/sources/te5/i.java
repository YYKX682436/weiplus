package te5;

/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f500202a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f500203b;

    /* renamed from: c, reason: collision with root package name */
    public int f500204c;

    /* renamed from: d, reason: collision with root package name */
    public int f500205d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f500206e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f500207f;

    /* renamed from: g, reason: collision with root package name */
    public int f500208g;

    public i(int i17) {
        this.f500202a = i17;
        this.f500205d = com.p314xaae8f345.mm.R.raw.f81274x46732e63;
        this.f500206e = "";
        this.f500207f = "";
        this.f500208g = com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj;
    }

    /* renamed from: equals */
    public boolean m166366xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te5.i) && this.f500202a == ((te5.i) obj).f500202a;
    }

    /* renamed from: hashCode */
    public int m166367x8cdac1b() {
        return java.lang.Integer.hashCode(this.f500202a);
    }

    /* renamed from: toString */
    public java.lang.String m166368x9616526c() {
        return "FavFileBubbleModel(fileBubbleStatus=" + this.f500202a + ')';
    }

    public /* synthetic */ i(int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17);
    }
}
