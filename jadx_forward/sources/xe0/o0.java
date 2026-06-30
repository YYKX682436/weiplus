package xe0;

/* loaded from: classes4.dex */
public final class o0 implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f535295d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f535296e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f535297f;

    public o0(java.lang.String username, java.lang.String snsFeedId, java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsFeedId, "snsFeedId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        this.f535295d = username;
        this.f535296e = snsFeedId;
        this.f535297f = sessionId;
    }

    /* renamed from: equals */
    public boolean m175401xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe0.o0)) {
            return false;
        }
        xe0.o0 o0Var = (xe0.o0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535295d, o0Var.f535295d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535296e, o0Var.f535296e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535297f, o0Var.f535297f);
    }

    /* renamed from: hashCode */
    public int m175402x8cdac1b() {
        return (((this.f535295d.hashCode() * 31) + this.f535296e.hashCode()) * 31) + this.f535297f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m175403x9616526c() {
        return "StatusIconReportSnsParams(username=" + this.f535295d + ", snsFeedId=" + this.f535296e + ", sessionId=" + this.f535297f + ')';
    }

    public /* synthetic */ o0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, (i17 & 2) != 0 ? "" : str2, (i17 & 4) != 0 ? "" : str3);
    }
}
