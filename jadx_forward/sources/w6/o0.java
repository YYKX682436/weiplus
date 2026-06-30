package w6;

/* loaded from: classes13.dex */
public class o0 implements t6.h {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f524710b;

    /* renamed from: c, reason: collision with root package name */
    public final int f524711c;

    /* renamed from: d, reason: collision with root package name */
    public final int f524712d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Class f524713e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Class f524714f;

    /* renamed from: g, reason: collision with root package name */
    public final t6.h f524715g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f524716h;

    /* renamed from: i, reason: collision with root package name */
    public final t6.l f524717i;

    /* renamed from: j, reason: collision with root package name */
    public int f524718j;

    public o0(java.lang.Object obj, t6.h hVar, int i17, int i18, java.util.Map map, java.lang.Class cls, java.lang.Class cls2, t6.l lVar) {
        q7.n.b(obj);
        this.f524710b = obj;
        if (hVar == null) {
            throw new java.lang.NullPointerException("Signature must not be null");
        }
        this.f524715g = hVar;
        this.f524711c = i17;
        this.f524712d = i18;
        q7.n.b(map);
        this.f524716h = map;
        if (cls == null) {
            throw new java.lang.NullPointerException("Resource class must not be null");
        }
        this.f524713e = cls;
        if (cls2 == null) {
            throw new java.lang.NullPointerException("Transcode class must not be null");
        }
        this.f524714f = cls2;
        q7.n.b(lVar);
        this.f524717i = lVar;
    }

    @Override // t6.h
    public void b(java.security.MessageDigest messageDigest) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // t6.h
    /* renamed from: equals */
    public boolean mo743xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof w6.o0)) {
            return false;
        }
        w6.o0 o0Var = (w6.o0) obj;
        return this.f524710b.equals(o0Var.f524710b) && this.f524715g.mo743xb2c87fbf(o0Var.f524715g) && this.f524712d == o0Var.f524712d && this.f524711c == o0Var.f524711c && this.f524716h.equals(o0Var.f524716h) && this.f524713e.equals(o0Var.f524713e) && this.f524714f.equals(o0Var.f524714f) && this.f524717i.mo743xb2c87fbf(o0Var.f524717i);
    }

    @Override // t6.h
    /* renamed from: hashCode */
    public int mo744x8cdac1b() {
        if (this.f524718j == 0) {
            int hashCode = this.f524710b.hashCode();
            this.f524718j = hashCode;
            int mo744x8cdac1b = (((((hashCode * 31) + this.f524715g.mo744x8cdac1b()) * 31) + this.f524711c) * 31) + this.f524712d;
            this.f524718j = mo744x8cdac1b;
            int hashCode2 = (mo744x8cdac1b * 31) + this.f524716h.hashCode();
            this.f524718j = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f524713e.hashCode();
            this.f524718j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f524714f.hashCode();
            this.f524718j = hashCode4;
            this.f524718j = (hashCode4 * 31) + this.f524717i.mo744x8cdac1b();
        }
        return this.f524718j;
    }

    /* renamed from: toString */
    public java.lang.String m173242x9616526c() {
        return "EngineKey{model=" + this.f524710b + ", width=" + this.f524711c + ", height=" + this.f524712d + ", resourceClass=" + this.f524713e + ", transcodeClass=" + this.f524714f + ", signature=" + this.f524715g + ", hashCode=" + this.f524718j + ", transformations=" + this.f524716h + ", options=" + this.f524717i + '}';
    }
}
