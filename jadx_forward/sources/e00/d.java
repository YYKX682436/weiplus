package e00;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final bw5.ue0 f327283a;

    /* renamed from: b, reason: collision with root package name */
    public final long f327284b;

    public d(bw5.ue0 shopCard, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shopCard, "shopCard");
        this.f327283a = shopCard;
        this.f327284b = j17;
    }

    /* renamed from: equals */
    public boolean m126548xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e00.d)) {
            return false;
        }
        e00.d dVar = (e00.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f327283a, dVar.f327283a) && this.f327284b == dVar.f327284b;
    }

    /* renamed from: hashCode */
    public int m126549x8cdac1b() {
        return (this.f327283a.hashCode() * 31) + java.lang.Long.hashCode(this.f327284b);
    }

    /* renamed from: toString */
    public java.lang.String m126550x9616526c() {
        return "ShopCardCache(shopCard=" + this.f327283a + ", cacheTimeSecond=" + this.f327284b + ')';
    }
}
