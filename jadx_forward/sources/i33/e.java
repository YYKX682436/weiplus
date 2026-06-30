package i33;

/* loaded from: classes10.dex */
public final class e extends i33.c {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f369707f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f369708g;

    /* renamed from: h, reason: collision with root package name */
    public final int f369709h;

    /* renamed from: i, reason: collision with root package name */
    public final int f369710i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f369711m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f369707f = "MicroMsg.AlbumCommonEventSdkReportUIC";
        this.f369708g = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        this.f369709h = 31754;
        this.f369710i = 50098;
    }

    public final int W6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(i33.c0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        if (((i33.c0) a17).Z6()) {
            return 2;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd) m158354x19263085 : null;
        if (activityC15653x403456cd != null) {
            return activityC15653x403456cd.B7() ? 1 : 3;
        }
        return 4;
    }

    public final void X6(java.lang.String viewId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        java.util.Map k17 = kz5.c1.k(new jz5.l("album_session_id", this.f369708g), new jz5.l("view_id", viewId));
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            ((cy1.a) rVar).Gj(this.f369710i, "view_clk", k17, this.f369709h);
        }
        k17.toString();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        super.mo2277xb2f1ab1a(bundle);
        java.util.Map k17 = kz5.c1.k(new jz5.l("cur_album_purview", java.lang.String.valueOf(W6())), new jz5.l("album_session_id", this.f369708g));
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            ((cy1.a) rVar).Ej("in_album", k17, this.f369709h);
        }
        k17.toString();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (this.f369711m) {
            this.f369711m = false;
            java.util.Map k17 = kz5.c1.k(new jz5.l("purview_result", java.lang.String.valueOf(W6())), new jz5.l("album_session_id", this.f369708g));
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            if (rVar != null) {
                ((cy1.a) rVar).Ej("album_purview_result_cgi_resp", k17, this.f369709h);
            }
            k17.toString();
        }
    }
}
