package c6;

/* loaded from: classes14.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final p135x2eae8f.p136xbfc2bd01.AbstractC1415x223acdfc f120388a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f120389b;

    /* renamed from: c, reason: collision with root package name */
    public final v5.d f120390c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f120391d;

    public k(p135x2eae8f.p136xbfc2bd01.AbstractC1415x223acdfc abstractC1415x223acdfc, boolean z17, v5.d dataSource, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSource, "dataSource");
        this.f120388a = abstractC1415x223acdfc;
        this.f120389b = z17;
        this.f120390c = dataSource;
        this.f120391d = z18;
    }

    /* renamed from: equals */
    public boolean m14210xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6.k)) {
            return false;
        }
        c6.k kVar = (c6.k) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f120388a, kVar.f120388a) && this.f120389b == kVar.f120389b && this.f120390c == kVar.f120390c && this.f120391d == kVar.f120391d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: hashCode */
    public int m14211x8cdac1b() {
        p135x2eae8f.p136xbfc2bd01.AbstractC1415x223acdfc abstractC1415x223acdfc = this.f120388a;
        int hashCode = (abstractC1415x223acdfc == null ? 0 : abstractC1415x223acdfc.hashCode()) * 31;
        boolean z17 = this.f120389b;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        int hashCode2 = (((hashCode + i17) * 31) + this.f120390c.hashCode()) * 31;
        boolean z18 = this.f120391d;
        return hashCode2 + (z18 ? 1 : z18 ? 1 : 0);
    }

    /* renamed from: toString */
    public java.lang.String m14212x9616526c() {
        return "Metadata(memoryCacheKey=" + this.f120388a + ", isSampled=" + this.f120389b + ", dataSource=" + this.f120390c + ", isPlaceholderMemoryCacheKeyPresent=" + this.f120391d + ')';
    }
}
