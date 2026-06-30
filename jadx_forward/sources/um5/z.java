package um5;

/* loaded from: classes10.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f510761a;

    /* renamed from: b, reason: collision with root package name */
    public final um5.a0 f510762b;

    /* renamed from: c, reason: collision with root package name */
    public final um5.b0 f510763c;

    public z(java.lang.String key, um5.a0 data, um5.b0 b0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f510761a = key;
        this.f510762b = data;
        this.f510763c = b0Var;
    }

    /* renamed from: equals */
    public boolean m168266xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um5.z)) {
            return false;
        }
        um5.z zVar = (um5.z) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f510761a, zVar.f510761a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f510762b, zVar.f510762b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f510763c, zVar.f510763c);
    }

    /* renamed from: hashCode */
    public int m168267x8cdac1b() {
        int hashCode = ((this.f510761a.hashCode() * 31) + this.f510762b.m168257x8cdac1b()) * 31;
        um5.b0 b0Var = this.f510763c;
        return hashCode + (b0Var == null ? 0 : b0Var.m168260x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m168268x9616526c() {
        return "EffectInputTexture(key=" + this.f510761a + ", data=" + this.f510762b + ", animate=" + this.f510763c + ')';
    }
}
