package nf4;

/* loaded from: classes4.dex */
public final class h extends dm.y7 {

    /* renamed from: q, reason: collision with root package name */
    public static final l75.e0 f418386q = dm.y7.m125710x3593deb(nf4.j.class);

    /* renamed from: p, reason: collision with root package name */
    public nf4.j f418387p = new nf4.j();

    @Override // dm.y7, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        l75.e0 info = f418386q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(info, "info");
        return info;
    }

    public final java.lang.String t0() {
        java.lang.String field_date = this.f69196x225a93d3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_date, "field_date");
        return field_date;
    }

    /* renamed from: toString */
    public java.lang.String m149515x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("StoryHistoryInfo[localId:");
        nf4.j jVar = this.f418387p;
        sb6.append(jVar != null ? java.lang.Integer.valueOf((int) jVar.f72763xa3c65b86) : null);
        sb6.append(" date:");
        sb6.append(t0());
        sb6.append(" count:");
        sb6.append(this.f69195x28f0318a);
        sb6.append(']');
        return sb6.toString();
    }
}
