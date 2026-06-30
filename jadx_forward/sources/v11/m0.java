package v11;

/* loaded from: classes5.dex */
public final class m0 implements q31.p {

    /* renamed from: d, reason: collision with root package name */
    public final v11.n0 f513975d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f513976e;

    public m0(v11.n0 thinkingState, yz5.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thinkingState, "thinkingState");
        this.f513975d = thinkingState;
        this.f513976e = pVar;
    }

    /* renamed from: clone */
    public java.lang.Object m170926x5a5dd5d() {
        return super.clone();
    }

    /* renamed from: equals */
    public boolean m170927xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.m0)) {
            return false;
        }
        v11.m0 m0Var = (v11.m0) obj;
        return this.f513975d == m0Var.f513975d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513976e, m0Var.f513976e);
    }

    /* renamed from: hashCode */
    public int m170928x8cdac1b() {
        int hashCode = this.f513975d.hashCode() * 31;
        yz5.p pVar = this.f513976e;
        return hashCode + (pVar == null ? 0 : pVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m170929x9616526c() {
        return "ThinkingAreaViewModel(thinkingState=" + this.f513975d + ", onSwitch=" + this.f513976e + ')';
    }
}
