package dz4;

/* loaded from: classes11.dex */
public final class g extends dz4.i {

    /* renamed from: m, reason: collision with root package name */
    public final int f326777m;

    /* renamed from: n, reason: collision with root package name */
    public final int f326778n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f326779o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f326780p;

    /* renamed from: q, reason: collision with root package name */
    public final int f326781q;

    /* renamed from: r, reason: collision with root package name */
    public final long f326782r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f326783s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i17, int i18, boolean z17, java.lang.String xml, int i19, long j17, boolean z18) {
        super(i19, z17, xml, j17, 0, 0, false, 0, null, null, null, null, 4080, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xml, "xml");
        this.f326777m = i17;
        this.f326778n = i18;
        this.f326779o = z17;
        this.f326780p = xml;
        this.f326781q = i19;
        this.f326782r = j17;
        this.f326783s = z18;
    }

    /* renamed from: equals */
    public boolean m126495xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz4.g)) {
            return false;
        }
        dz4.g gVar = (dz4.g) obj;
        return this.f326777m == gVar.f326777m && this.f326778n == gVar.f326778n && this.f326779o == gVar.f326779o && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326780p, gVar.f326780p) && this.f326781q == gVar.f326781q && this.f326782r == gVar.f326782r && this.f326783s == gVar.f326783s;
    }

    /* renamed from: hashCode */
    public int m126496x8cdac1b() {
        return (((((((((((java.lang.Integer.hashCode(this.f326777m) * 31) + java.lang.Integer.hashCode(this.f326778n)) * 31) + java.lang.Boolean.hashCode(this.f326779o)) * 31) + this.f326780p.hashCode()) * 31) + java.lang.Integer.hashCode(this.f326781q)) * 31) + java.lang.Long.hashCode(this.f326782r)) * 31) + java.lang.Boolean.hashCode(this.f326783s);
    }

    /* renamed from: toString */
    public java.lang.String m126497x9616526c() {
        return "Fav(favId=" + this.f326777m + ", favUpdateSeq=" + this.f326778n + ", editable=" + this.f326779o + ", xml=" + this.f326780p + ", scene=" + this.f326781q + ", noteLocalId=" + this.f326782r + ", openFromFavConvertNote=" + this.f326783s + ')';
    }
}
