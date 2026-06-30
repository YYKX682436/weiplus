package yj4;

/* loaded from: classes11.dex */
public final class f extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public qj4.k f544230d;

    /* renamed from: e, reason: collision with root package name */
    public final iy1.c f544231e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f544230d = qj4.k.f445457g;
        this.f544231e = iy1.c.StatusPublishEditPage;
    }

    public final void O6(qj4.j clickOption) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickOption, "clickOption");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        qj4.j jVar = qj4.j.f445450e;
        if (clickOption != jVar) {
            linkedHashMap.put("status_edit_2ensure_panel_opt", java.lang.Integer.valueOf(clickOption.f445454d));
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078) m158354x19263085 : null;
        bi4.d1 d1Var = activityC18639xf6f98078 != null ? activityC18639xf6f98078.f255146x1 : null;
        jz5.l[] lVarArr = new jz5.l[2];
        java.lang.String str = d1Var != null ? d1Var.G : null;
        if (str == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("status_clipostid", str);
        java.lang.String str2 = d1Var != null ? d1Var.f436474h : null;
        lVarArr[1] = new jz5.l("status_sessionid", str2 != null ? str2 : "");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("status_edit_2ensure_panel", clickOption != jVar ? "view_clk" : "view_exp", kz5.c1.m(kz5.c1.k(lVarArr), linkedHashMap), 33629);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            cy1.a aVar = (cy1.a) rVar;
            aVar.Zj(m158354x19263085(), this.f544231e.f377392d);
            aVar.ik(m158354x19263085(), 12, 33629);
            aVar.Ai(m158354x19263085(), new yj4.e(this));
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078) m158354x19263085 : null;
        if (activityC18639xf6f98078 != null) {
            android.view.View view = activityC18639xf6f98078.btnBack;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("btnBack");
                throw null;
            }
            cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar2.pk(view, "status_page_x");
            dy1.r ik6 = aVar2.ik(view, 40, 33629);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f980782 = m158354x192630852 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078) m158354x192630852 : null;
            bi4.d1 d1Var = activityC18639xf6f980782 != null ? activityC18639xf6f980782.f255146x1 : null;
            kz5.q0 q0Var = kz5.q0.f395534d;
            jz5.l[] lVarArr = new jz5.l[2];
            java.lang.String str = d1Var != null ? d1Var.G : null;
            if (str == null) {
                str = "";
            }
            lVarArr[0] = new jz5.l("status_clipostid", str);
            java.lang.String str2 = d1Var != null ? d1Var.f436474h : null;
            lVarArr[1] = new jz5.l("status_sessionid", str2 != null ? str2 : "");
            java.util.Map m17 = kz5.c1.m(kz5.c1.k(lVarArr), q0Var);
            m17.toString();
            ((cy1.a) ik6).gk(view, m17);
        }
    }
}
