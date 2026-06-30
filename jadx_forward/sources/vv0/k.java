package vv0;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: f, reason: collision with root package name */
    public static final vv0.k f521916f;

    /* renamed from: g, reason: collision with root package name */
    public static final vv0.k f521917g;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f521918a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f521919b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f521920c;

    /* renamed from: d, reason: collision with root package name */
    public final int f521921d;

    /* renamed from: e, reason: collision with root package name */
    public final zu0.i f521922e;

    static {
        zu0.i iVar = zu0.i.f557209f;
        f521916f = new vv0.k("NONE", "NONE", "NONE", Integer.MIN_VALUE, iVar);
        f521917g = new vv0.k("DIVIDER", "DIVIDER", "DIVIDER", Integer.MIN_VALUE, iVar);
    }

    public k(java.lang.String filterID, java.lang.String filterName, java.lang.String previewImageURL, int i17, zu0.i materialLoadState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filterID, "filterID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filterName, "filterName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewImageURL, "previewImageURL");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialLoadState, "materialLoadState");
        this.f521918a = filterID;
        this.f521919b = filterName;
        this.f521920c = previewImageURL;
        this.f521921d = i17;
        this.f521922e = materialLoadState;
    }

    /* renamed from: equals */
    public boolean m172698xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv0.k)) {
            return false;
        }
        vv0.k kVar = (vv0.k) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521918a, kVar.f521918a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521919b, kVar.f521919b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521920c, kVar.f521920c) && this.f521921d == kVar.f521921d && this.f521922e == kVar.f521922e;
    }

    /* renamed from: hashCode */
    public int m172699x8cdac1b() {
        return (((((((this.f521918a.hashCode() * 31) + this.f521919b.hashCode()) * 31) + this.f521920c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f521921d)) * 31) + this.f521922e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m172700x9616526c() {
        return "FilterInfo(filterID=" + this.f521918a + ", filterName=" + this.f521919b + ", previewImageURL=" + this.f521920c + ", categoryID=" + this.f521921d + ", materialLoadState=" + this.f521922e + ')';
    }
}
