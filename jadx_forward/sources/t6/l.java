package t6;

/* loaded from: classes13.dex */
public final class l implements t6.h {

    /* renamed from: b, reason: collision with root package name */
    public final x.b f497506b = new q7.d();

    @Override // t6.h
    public void b(java.security.MessageDigest messageDigest) {
        int i17 = 0;
        while (true) {
            x.b bVar = this.f497506b;
            if (i17 >= bVar.f532379f) {
                return;
            }
            t6.k kVar = (t6.k) bVar.h(i17);
            java.lang.Object l17 = this.f497506b.l(i17);
            t6.j jVar = kVar.f497503b;
            if (kVar.f497505d == null) {
                kVar.f497505d = kVar.f497504c.getBytes(t6.h.f497500a);
            }
            jVar.a(kVar.f497505d, l17, messageDigest);
            i17++;
        }
    }

    public java.lang.Object c(t6.k kVar) {
        x.b bVar = this.f497506b;
        return bVar.m174748xc6607c0(kVar) ? bVar.m174751x4aabfc28(kVar, null) : kVar.f497502a;
    }

    @Override // t6.h
    /* renamed from: equals */
    public boolean mo743xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof t6.l) {
            return this.f497506b.m174750xb2c87fbf(((t6.l) obj).f497506b);
        }
        return false;
    }

    @Override // t6.h
    /* renamed from: hashCode */
    public int mo744x8cdac1b() {
        return this.f497506b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m165946x9616526c() {
        return "Options{values=" + this.f497506b + '}';
    }
}
