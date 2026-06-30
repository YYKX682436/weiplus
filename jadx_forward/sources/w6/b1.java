package w6;

/* loaded from: classes13.dex */
public final class b1 implements t6.h {

    /* renamed from: j, reason: collision with root package name */
    public static final q7.k f524598j = new q7.k(50);

    /* renamed from: b, reason: collision with root package name */
    public final x6.b f524599b;

    /* renamed from: c, reason: collision with root package name */
    public final t6.h f524600c;

    /* renamed from: d, reason: collision with root package name */
    public final t6.h f524601d;

    /* renamed from: e, reason: collision with root package name */
    public final int f524602e;

    /* renamed from: f, reason: collision with root package name */
    public final int f524603f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Class f524604g;

    /* renamed from: h, reason: collision with root package name */
    public final t6.l f524605h;

    /* renamed from: i, reason: collision with root package name */
    public final t6.p f524606i;

    public b1(x6.b bVar, t6.h hVar, t6.h hVar2, int i17, int i18, t6.p pVar, java.lang.Class cls, t6.l lVar) {
        this.f524599b = bVar;
        this.f524600c = hVar;
        this.f524601d = hVar2;
        this.f524602e = i17;
        this.f524603f = i18;
        this.f524606i = pVar;
        this.f524604g = cls;
        this.f524605h = lVar;
    }

    @Override // t6.h
    public void b(java.security.MessageDigest messageDigest) {
        java.lang.Object e17;
        java.lang.Object obj;
        x6.l lVar = (x6.l) this.f524599b;
        synchronized (lVar) {
            x6.j jVar = (x6.j) lVar.f533691b.b();
            jVar.f533688b = 8;
            jVar.f533689c = byte[].class;
            e17 = lVar.e(jVar, byte[].class);
        }
        byte[] bArr = (byte[]) e17;
        java.nio.ByteBuffer.wrap(bArr).putInt(this.f524602e).putInt(this.f524603f).array();
        this.f524601d.b(messageDigest);
        this.f524600c.b(messageDigest);
        messageDigest.update(bArr);
        t6.p pVar = this.f524606i;
        if (pVar != null) {
            pVar.b(messageDigest);
        }
        this.f524605h.b(messageDigest);
        q7.k kVar = f524598j;
        java.lang.Class cls = this.f524604g;
        synchronized (kVar) {
            obj = ((java.util.LinkedHashMap) kVar.f441835a).get(cls);
        }
        byte[] bArr2 = (byte[]) obj;
        if (bArr2 == null) {
            bArr2 = cls.getName().getBytes(t6.h.f497500a);
            kVar.c(cls, bArr2);
        }
        messageDigest.update(bArr2);
        ((x6.l) this.f524599b).g(bArr);
    }

    @Override // t6.h
    /* renamed from: equals */
    public boolean mo743xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof w6.b1)) {
            return false;
        }
        w6.b1 b1Var = (w6.b1) obj;
        return this.f524603f == b1Var.f524603f && this.f524602e == b1Var.f524602e && q7.p.a(this.f524606i, b1Var.f524606i) && this.f524604g.equals(b1Var.f524604g) && this.f524600c.mo743xb2c87fbf(b1Var.f524600c) && this.f524601d.mo743xb2c87fbf(b1Var.f524601d) && this.f524605h.mo743xb2c87fbf(b1Var.f524605h);
    }

    @Override // t6.h
    /* renamed from: hashCode */
    public int mo744x8cdac1b() {
        int mo744x8cdac1b = (((((this.f524600c.mo744x8cdac1b() * 31) + this.f524601d.mo744x8cdac1b()) * 31) + this.f524602e) * 31) + this.f524603f;
        t6.p pVar = this.f524606i;
        if (pVar != null) {
            mo744x8cdac1b = (mo744x8cdac1b * 31) + pVar.hashCode();
        }
        return (((mo744x8cdac1b * 31) + this.f524604g.hashCode()) * 31) + this.f524605h.mo744x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m173236x9616526c() {
        return "ResourceCacheKey{sourceKey=" + this.f524600c + ", signature=" + this.f524601d + ", width=" + this.f524602e + ", height=" + this.f524603f + ", decodedResourceClass=" + this.f524604g + ", transformation='" + this.f524606i + "', options=" + this.f524605h + '}';
    }
}
