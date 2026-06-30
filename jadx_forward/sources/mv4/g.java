package mv4;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f413205a;

    /* renamed from: b, reason: collision with root package name */
    public final jv4.m f413206b;

    public g(java.lang.String id6, jv4.m type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f413205a = id6;
        this.f413206b = type;
    }

    /* renamed from: equals */
    public boolean m148472xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv4.g)) {
            return false;
        }
        mv4.g gVar = (mv4.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413205a, gVar.f413205a) && this.f413206b == gVar.f413206b;
    }

    /* renamed from: hashCode */
    public int m148473x8cdac1b() {
        return (this.f413205a.hashCode() * 31) + this.f413206b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m148474x9616526c() {
        return "FTSTeachRecyclerCacheItem(id=" + this.f413205a + ", type=" + this.f413206b + ')';
    }
}
