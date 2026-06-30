package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class y6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob f205915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f205916e;

    public y6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar, ya2.b2 b2Var) {
        this.f205915d = obVar;
        this.f205916e = b2Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        ec2.d e27;
        if (menuItem.getItemId() == 10021) {
            ya2.b2 b2Var = this.f205916e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar = this.f205915d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob.O6(obVar, b2Var);
            if (lk5.s.b(obVar.m158354x19263085())) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = obVar.m158354x19263085();
                com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 ? (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) m158354x19263085 : null;
                if (abstractActivityC22579xbed01a37 != null && abstractActivityC22579xbed01a37.m81193x1252e2cf() != null) {
                    android.app.Activity context = obVar.m80379x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                    if (nyVar != null && (e27 = zy2.ra.e2(nyVar, 0, 1, null)) != null) {
                        e27.a(new ec2.a(26, obVar.P1, obVar.R1));
                    }
                }
            }
            obVar.S1 = null;
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[4];
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(obVar.m158354x19263085());
            lVarArr[0] = new jz5.l("behaviour_session_id", e17 != null ? e17.f216918q : null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar.e(obVar.m158354x19263085());
            lVarArr[1] = new jz5.l("finder_context_id", e18 != null ? e18.f216915p : null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e19 = iyVar.e(obVar.m158354x19263085());
            lVarArr[2] = new jz5.l("finder_tab_context_id", e19 != null ? e19.f216919r : null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e28 = iyVar.e(obVar.m158354x19263085());
            lVarArr[3] = new jz5.l("comment_scene", e28 != null ? java.lang.Integer.valueOf(e28.f216913n) : null);
            ((cy1.a) rVar).Cj("un_follow_click", null, kz5.c1.k(lVarArr), 24617);
        }
    }
}
