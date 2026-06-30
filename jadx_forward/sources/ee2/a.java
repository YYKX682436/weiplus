package ee2;

/* loaded from: classes3.dex */
public final class a implements he2.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f333113d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f333114e;

    /* renamed from: f, reason: collision with root package name */
    public final long f333115f;

    /* renamed from: g, reason: collision with root package name */
    public final he2.b f333116g;

    public a(java.lang.String groupId, java.lang.String groupName, long j17, he2.b commentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupId, "groupId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupName, "groupName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentView, "commentView");
        this.f333113d = groupId;
        this.f333114e = groupName;
        this.f333115f = j17;
        this.f333116g = commentView;
    }

    @Override // he2.b
    public android.view.View W() {
        return this.f333116g.W();
    }

    /* renamed from: equals */
    public boolean m127514xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee2.a)) {
            return false;
        }
        ee2.a aVar = (ee2.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f333113d, aVar.f333113d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f333114e, aVar.f333114e) && this.f333115f == aVar.f333115f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f333116g, aVar.f333116g);
    }

    /* renamed from: hashCode */
    public int m127515x8cdac1b() {
        return (((((this.f333113d.hashCode() * 31) + this.f333114e.hashCode()) * 31) + java.lang.Long.hashCode(this.f333115f)) * 31) + this.f333116g.hashCode();
    }

    @Override // he2.b
    public void j(boolean z17) {
        this.f333116g.j(z17);
    }

    /* renamed from: toString */
    public java.lang.String m127516x9616526c() {
        return "ViewPagerItemSelect(groupId=" + this.f333113d + ", groupName=" + this.f333114e + ", lastEnterTimeStamp=" + this.f333115f + ", commentView=" + this.f333116g + ')';
    }

    @Override // he2.b
    public void w(int i17) {
        this.f333116g.w(i17);
    }
}
