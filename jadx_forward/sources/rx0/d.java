package rx0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b f482445a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3996x128b8fa f482446b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.d01 f482447c;

    public d(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3996x128b8fa c3996x128b8fa, r45.d01 svrResp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(svrResp, "svrResp");
        this.f482445a = c4093x6b88526b;
        this.f482446b = c3996x128b8fa;
        this.f482447c = svrResp;
    }

    /* renamed from: equals */
    public boolean m163373xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx0.d)) {
            return false;
        }
        rx0.d dVar = (rx0.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482445a, dVar.f482445a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482446b, dVar.f482446b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482447c, dVar.f482447c);
    }

    /* renamed from: hashCode */
    public int m163374x8cdac1b() {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b = this.f482445a;
        int hashCode = (c4093x6b88526b == null ? 0 : c4093x6b88526b.hashCode()) * 31;
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3996x128b8fa c3996x128b8fa = this.f482446b;
        return ((hashCode + (c3996x128b8fa != null ? c3996x128b8fa.hashCode() : 0)) * 31) + this.f482447c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m163375x9616526c() {
        return "MJAIGCSubmitRespExt(error=" + this.f482445a + ", mjResp=" + this.f482446b + ", svrResp=" + this.f482447c + ')';
    }
}
