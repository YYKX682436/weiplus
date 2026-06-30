package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class n8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob f205536d;

    public n8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar) {
        this.f205536d = obVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar = this.f205536d;
        java.lang.String stringExtra = obVar.m158359x1e885992().getStringExtra("key_extra_info");
        if (stringExtra == null) {
            stringExtra = "";
        }
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Tj(obVar.h7().W0, 40, 1, false);
        cy1.a aVar2 = (cy1.a) aVar.ik(obVar.h7().W0, 40, 24617);
        aVar2.pk(obVar.h7().W0, "finder_profile_letter");
        android.widget.FrameLayout frameLayout = obVar.h7().W0;
        jz5.l[] lVarArr = new jz5.l[10];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(obVar.m158354x19263085());
        lVarArr[0] = new jz5.l("finder_tab_context_id", e17 != null ? e17.f216919r : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar.e(obVar.m158354x19263085());
        lVarArr[1] = new jz5.l("finder_context_id", e18 != null ? e18.f216915p : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e19 = iyVar.e(obVar.m158354x19263085());
        lVarArr[2] = new jz5.l("behaviour_session_id", e19 != null ? e19.f216918q : null);
        lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(obVar.m58738xfe9224be().m75939xb282bd08(7)));
        lVarArr[4] = new jz5.l("author_finder_username", obVar.m58741x6c03c64c());
        android.app.Activity context = obVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        lVarArr[5] = new jz5.l("profile_state_type", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class)).m58744xb9a8ab96() ? 1 : 2));
        lVarArr[6] = new jz5.l("profile_screen_type", java.lang.Integer.valueOf(obVar.m58704xd2e07a89() ? 2 : 1));
        lVarArr[7] = new jz5.l("extrainfo", stringExtra);
        lVarArr[8] = new jz5.l("feed_id", pm0.v.u(obVar.P1));
        lVarArr[9] = new jz5.l("session_buffer", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(obVar.P1, obVar.R1, obVar.m58738xfe9224be().m75939xb282bd08(7)));
        aVar2.gk(frameLayout, kz5.c1.k(lVarArr));
    }
}
