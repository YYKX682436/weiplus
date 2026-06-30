package w6;

/* loaded from: classes13.dex */
public final class h implements t6.h {

    /* renamed from: b, reason: collision with root package name */
    public final t6.h f524655b;

    /* renamed from: c, reason: collision with root package name */
    public final t6.h f524656c;

    public h(t6.h hVar, t6.h hVar2) {
        this.f524655b = hVar;
        this.f524656c = hVar2;
    }

    @Override // t6.h
    public void b(java.security.MessageDigest messageDigest) {
        this.f524655b.b(messageDigest);
        this.f524656c.b(messageDigest);
    }

    @Override // t6.h
    /* renamed from: equals */
    public boolean mo743xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof w6.h)) {
            return false;
        }
        w6.h hVar = (w6.h) obj;
        return this.f524655b.mo743xb2c87fbf(hVar.f524655b) && this.f524656c.mo743xb2c87fbf(hVar.f524656c);
    }

    @Override // t6.h
    /* renamed from: hashCode */
    public int mo744x8cdac1b() {
        return (this.f524655b.mo744x8cdac1b() * 31) + this.f524656c.mo744x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m173238x9616526c() {
        return "DataCacheKey{sourceKey=" + this.f524655b + ", signature=" + this.f524656c + '}';
    }
}
