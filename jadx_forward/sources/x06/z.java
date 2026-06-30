package x06;

/* loaded from: classes15.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final f16.o f532871a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Collection f532872b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f532873c;

    public z(f16.o oVar, java.util.Collection collection, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(oVar, collection, (i17 & 4) != 0 ? oVar.f340293a == f16.n.f340290f : z17);
    }

    /* renamed from: equals */
    public boolean m174889xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x06.z)) {
            return false;
        }
        x06.z zVar = (x06.z) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f532871a, zVar.f532871a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f532872b, zVar.f532872b) && this.f532873c == zVar.f532873c;
    }

    /* renamed from: hashCode */
    public int m174890x8cdac1b() {
        return (((this.f532871a.m128731x8cdac1b() * 31) + this.f532872b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f532873c);
    }

    /* renamed from: toString */
    public java.lang.String m174891x9616526c() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f532871a + ", qualifierApplicabilityTypes=" + this.f532872b + ", definitelyNotNull=" + this.f532873c + ')';
    }

    public z(f16.o nullabilityQualifier, java.util.Collection qualifierApplicabilityTypes, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nullabilityQualifier, "nullabilityQualifier");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f532871a = nullabilityQualifier;
        this.f532872b = qualifierApplicabilityTypes;
        this.f532873c = z17;
    }
}
