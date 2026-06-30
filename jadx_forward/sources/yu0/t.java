package yu0;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f547368a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f547369b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f547370c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f547371d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f547372e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f547373f;

    /* renamed from: g, reason: collision with root package name */
    public final dw0.a f547374g;

    public t(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, java.lang.String roleID, java.lang.String roleName, java.lang.String originNarrationFilePath, java.util.List captionItems, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a totalDurationIncludingExpandable, dw0.a materialPrefix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleID, "roleID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleName, "roleName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originNarrationFilePath, "originNarrationFilePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(captionItems, "captionItems");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(totalDurationIncludingExpandable, "totalDurationIncludingExpandable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialPrefix, "materialPrefix");
        this.f547368a = segmentID;
        this.f547369b = roleID;
        this.f547370c = roleName;
        this.f547371d = originNarrationFilePath;
        this.f547372e = captionItems;
        this.f547373f = totalDurationIncludingExpandable;
        this.f547374g = materialPrefix;
    }

    /* renamed from: equals */
    public boolean m177682xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0.t)) {
            return false;
        }
        yu0.t tVar = (yu0.t) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547368a, tVar.f547368a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547369b, tVar.f547369b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547370c, tVar.f547370c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547371d, tVar.f547371d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547372e, tVar.f547372e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547373f, tVar.f547373f) && this.f547374g == tVar.f547374g;
    }

    /* renamed from: hashCode */
    public int m177683x8cdac1b() {
        return (((((((((((this.f547368a.m32423x8cdac1b() * 31) + this.f547369b.hashCode()) * 31) + this.f547370c.hashCode()) * 31) + this.f547371d.hashCode()) * 31) + this.f547372e.hashCode()) * 31) + this.f547373f.hashCode()) * 31) + this.f547374g.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m177684x9616526c() {
        return "TimbreRequestGroup(segmentID=" + this.f547368a + ", roleID=" + this.f547369b + ", roleName=" + this.f547370c + ", originNarrationFilePath=" + this.f547371d + ", captionItems=" + this.f547372e + ", totalDurationIncludingExpandable=" + this.f547373f + ", materialPrefix=" + this.f547374g + ')';
    }
}
