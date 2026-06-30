package e00;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final bw5.qe0 f327278a;

    /* renamed from: b, reason: collision with root package name */
    public final long f327279b;

    public c(bw5.qe0 productInfo, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productInfo, "productInfo");
        this.f327278a = productInfo;
        this.f327279b = j17;
    }

    /* renamed from: equals */
    public boolean m126545xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e00.c)) {
            return false;
        }
        e00.c cVar = (e00.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f327278a, cVar.f327278a) && this.f327279b == cVar.f327279b;
    }

    /* renamed from: hashCode */
    public int m126546x8cdac1b() {
        return (this.f327278a.hashCode() * 31) + java.lang.Long.hashCode(this.f327279b);
    }

    /* renamed from: toString */
    public java.lang.String m126547x9616526c() {
        return "ProductInfoCache(productInfo=" + this.f327278a + ", cacheTimeSecond=" + this.f327279b + ')';
    }
}
