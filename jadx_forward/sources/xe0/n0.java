package xe0;

/* loaded from: classes9.dex */
public final class n0 implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f535291d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f535292e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f535293f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f535294g;

    public n0(java.lang.String username, java.lang.String chatName, java.lang.String enterSessionId, java.lang.String uniqueId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatName, "chatName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterSessionId, "enterSessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniqueId, "uniqueId");
        this.f535291d = username;
        this.f535292e = chatName;
        this.f535293f = enterSessionId;
        this.f535294g = uniqueId;
    }

    /* renamed from: equals */
    public boolean m175398xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe0.n0)) {
            return false;
        }
        xe0.n0 n0Var = (xe0.n0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535291d, n0Var.f535291d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535292e, n0Var.f535292e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535293f, n0Var.f535293f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535294g, n0Var.f535294g);
    }

    /* renamed from: hashCode */
    public int m175399x8cdac1b() {
        return (((((this.f535291d.hashCode() * 31) + this.f535292e.hashCode()) * 31) + this.f535293f.hashCode()) * 31) + this.f535294g.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m175400x9616526c() {
        return "StatusIconReportChatParams(username=" + this.f535291d + ", chatName=" + this.f535292e + ", enterSessionId=" + this.f535293f + ", uniqueId=" + this.f535294g + ')';
    }
}
