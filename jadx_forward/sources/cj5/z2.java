package cj5;

/* loaded from: classes.dex */
public final class z2 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f123818d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f123819e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f123820f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f123819e = "";
        this.f123820f = "";
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        this.f123818d = c01.id.c();
        this.f123819e = m158354x19263085().getClass().getSimpleName() + '-' + m158359x1e885992().getIntExtra("list_type", -1);
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        this.f123820f = uuid;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f123820f)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6783xcc9bb806 c6783xcc9bb806 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6783xcc9bb806();
            c6783xcc9bb806.f141150d = c6783xcc9bb806.b("Type", this.f123819e, true);
            c6783xcc9bb806.f141151e = c6783xcc9bb806.b("SessionId", this.f123820f, true);
            c6783xcc9bb806.f141153g = 0L;
            c6783xcc9bb806.f141152f = c01.id.c() - this.f123818d;
            c6783xcc9bb806.k();
            c6783xcc9bb806.o();
            this.f123820f = "";
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        android.content.Intent m158359x1e885992 = m158359x1e885992();
        iy1.c cVar = iy1.c.MainUI;
        cy1.a aVar = (cy1.a) rVar;
        aVar.Zj(m158354x19263085, m158359x1e885992.getIntExtra("key_select_contact_report_page_id", 1107));
        aVar.Rj(m158354x19263085(), iy1.a.NewGroupChat);
    }
}
