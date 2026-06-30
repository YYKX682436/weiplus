package rx0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b f482442a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3990xb891c88 f482443b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.r41 f482444c;

    public c(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3990xb891c88 c3990xb891c88, r45.r41 r41Var) {
        this.f482442a = c4093x6b88526b;
        this.f482443b = c3990xb891c88;
        this.f482444c = r41Var;
    }

    /* renamed from: equals */
    public boolean m163370xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx0.c)) {
            return false;
        }
        rx0.c cVar = (rx0.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482442a, cVar.f482442a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482443b, cVar.f482443b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482444c, cVar.f482444c);
    }

    /* renamed from: hashCode */
    public int m163371x8cdac1b() {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b = this.f482442a;
        int hashCode = (c4093x6b88526b == null ? 0 : c4093x6b88526b.hashCode()) * 31;
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3990xb891c88 c3990xb891c88 = this.f482443b;
        int hashCode2 = (hashCode + (c3990xb891c88 == null ? 0 : c3990xb891c88.hashCode())) * 31;
        r45.r41 r41Var = this.f482444c;
        return hashCode2 + (r41Var != null ? r41Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m163372x9616526c() {
        return "MJAIGCQueryRespExt(error=" + this.f482442a + ", mjResp=" + this.f482443b + ", svrResp=" + this.f482444c + ')';
    }
}
