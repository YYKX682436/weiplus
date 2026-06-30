package qj4;

/* loaded from: classes11.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f445460a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f445461b;

    /* renamed from: c, reason: collision with root package name */
    public final long f445462c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f445463d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f445464e;

    /* renamed from: f, reason: collision with root package name */
    public final bw5.jn0 f445465f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f445466g;

    public l(java.lang.String username, boolean z17, long j17, java.lang.String statusId, java.lang.String publishSessionId, bw5.jn0 publishActionSheetScene, java.util.Map map, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        statusId = (i17 & 8) != 0 ? "" : statusId;
        publishSessionId = (i17 & 16) != 0 ? "" : publishSessionId;
        publishActionSheetScene = (i17 & 32) != 0 ? bw5.jn0.STATUS_UNKNOWN : publishActionSheetScene;
        map = (i17 & 64) != 0 ? null : map;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusId, "statusId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(publishSessionId, "publishSessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(publishActionSheetScene, "publishActionSheetScene");
        this.f445460a = username;
        this.f445461b = z17;
        this.f445462c = j17;
        this.f445463d = statusId;
        this.f445464e = publishSessionId;
        this.f445465f = publishActionSheetScene;
        this.f445466g = map;
    }

    /* renamed from: equals */
    public boolean m160266xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj4.l)) {
            return false;
        }
        qj4.l lVar = (qj4.l) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f445460a, lVar.f445460a) && this.f445461b == lVar.f445461b && this.f445462c == lVar.f445462c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f445463d, lVar.f445463d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f445464e, lVar.f445464e) && this.f445465f == lVar.f445465f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f445466g, lVar.f445466g);
    }

    /* renamed from: hashCode */
    public int m160267x8cdac1b() {
        int hashCode = ((((((((((this.f445460a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f445461b)) * 31) + java.lang.Long.hashCode(this.f445462c)) * 31) + this.f445463d.hashCode()) * 31) + this.f445464e.hashCode()) * 31) + this.f445465f.hashCode()) * 31;
        java.util.Map map = this.f445466g;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m160268x9616526c() {
        return "PublishEntranceViewReportObj(username=" + this.f445460a + ", isFromCardView=" + this.f445461b + ", enterScene=" + this.f445462c + ", statusId=" + this.f445463d + ", publishSessionId=" + this.f445464e + ", publishActionSheetScene=" + this.f445465f + ", customParams=" + this.f445466g + ')';
    }
}
