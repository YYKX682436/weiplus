package sm2;

/* loaded from: classes3.dex */
public final class m9 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f491109a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f491110b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f491111c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f491112d;

    public m9(java.lang.Integer num, java.lang.Integer num2, yz5.a init, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(init, "init");
        this.f491109a = num;
        this.f491110b = num2;
        this.f491111c = init;
        this.f491112d = lVar;
    }

    /* renamed from: equals */
    public boolean m164792xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm2.m9)) {
            return false;
        }
        sm2.m9 m9Var = (sm2.m9) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f491109a, m9Var.f491109a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f491110b, m9Var.f491110b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f491111c, m9Var.f491111c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f491112d, m9Var.f491112d);
    }

    /* renamed from: hashCode */
    public int m164793x8cdac1b() {
        java.lang.Integer num = this.f491109a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.Integer num2 = this.f491110b;
        int hashCode2 = (((hashCode + (num2 == null ? 0 : num2.hashCode())) * 31) + this.f491111c.hashCode()) * 31;
        yz5.l lVar = this.f491112d;
        return hashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m164794x9616526c() {
        return "PluginConfig(stubId=" + this.f491109a + ", defaultVisibility=" + this.f491110b + ", init=" + this.f491111c + ", afterInit=" + this.f491112d + ')';
    }
}
