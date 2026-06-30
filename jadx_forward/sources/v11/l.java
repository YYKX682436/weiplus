package v11;

/* loaded from: classes11.dex */
public final class l extends v11.r {

    /* renamed from: a, reason: collision with root package name */
    public final int f513967a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f513968b;

    /* renamed from: c, reason: collision with root package name */
    public final v11.s f513969c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i17, java.util.List runs, v11.s sVar) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runs, "runs");
        this.f513967a = i17;
        this.f513968b = runs;
        this.f513969c = sVar;
    }

    /* renamed from: equals */
    public boolean m170917xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.l)) {
            return false;
        }
        v11.l lVar = (v11.l) obj;
        return this.f513967a == lVar.f513967a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513968b, lVar.f513968b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513969c, lVar.f513969c);
    }

    /* renamed from: hashCode */
    public int m170918x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f513967a) * 31) + this.f513968b.hashCode()) * 31;
        v11.s sVar = this.f513969c;
        return hashCode + (sVar == null ? 0 : sVar.m170946x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m170919x9616526c() {
        return "Heading(level=" + this.f513967a + ", runs=" + this.f513968b + ", sourceRange=" + this.f513969c + ')';
    }
}
