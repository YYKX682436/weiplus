package v11;

/* loaded from: classes11.dex */
public final class o extends v11.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f513984a;

    /* renamed from: b, reason: collision with root package name */
    public final v11.s f513985b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String content, v11.s sVar) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        this.f513984a = content;
        this.f513985b = sVar;
    }

    /* renamed from: equals */
    public boolean m170936xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.o)) {
            return false;
        }
        v11.o oVar = (v11.o) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513984a, oVar.f513984a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513985b, oVar.f513985b);
    }

    /* renamed from: hashCode */
    public int m170937x8cdac1b() {
        int hashCode = this.f513984a.hashCode() * 31;
        v11.s sVar = this.f513985b;
        return hashCode + (sVar == null ? 0 : sVar.m170946x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m170938x9616526c() {
        return "MathBlock(content=" + this.f513984a + ", sourceRange=" + this.f513985b + ')';
    }
}
