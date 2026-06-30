package ae1;

/* loaded from: classes7.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final jc1.d f84944a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f84945b;

    public u(jc1.d errors, java.util.Map resultPack) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errors, "errors");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultPack, "resultPack");
        this.f84944a = errors;
        this.f84945b = resultPack;
    }

    /* renamed from: equals */
    public boolean m1175xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae1.u)) {
            return false;
        }
        ae1.u uVar = (ae1.u) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f84944a, uVar.f84944a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f84945b, uVar.f84945b);
    }

    /* renamed from: hashCode */
    public int m1176x8cdac1b() {
        return (this.f84944a.m140612x8cdac1b() * 31) + this.f84945b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m1177x9616526c() {
        return "SmCryptoOperateResult(errors=" + this.f84944a + ", resultPack=" + this.f84945b + ')';
    }

    public /* synthetic */ u(jc1.d dVar, java.util.Map map, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(dVar, (i17 & 2) != 0 ? kz5.q0.f395534d : map);
    }
}
