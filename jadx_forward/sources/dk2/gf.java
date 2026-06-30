package dk2;

/* loaded from: classes3.dex */
public final class gf {

    /* renamed from: a, reason: collision with root package name */
    public final dk2.hf f315061a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f315062b;

    public gf(dk2.hf triggerScene, java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(triggerScene, "triggerScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        this.f315061a = triggerScene;
        this.f315062b = sessionId;
    }

    /* renamed from: equals */
    public boolean m124575xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.gf)) {
            return false;
        }
        dk2.gf gfVar = (dk2.gf) obj;
        return this.f315061a == gfVar.f315061a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315062b, gfVar.f315062b);
    }

    /* renamed from: hashCode */
    public int m124576x8cdac1b() {
        return (this.f315061a.hashCode() * 31) + this.f315062b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124577x9616526c() {
        return "ShowBtnContext(triggerScene=" + this.f315061a + ", sessionId=" + this.f315062b + ')';
    }
}
