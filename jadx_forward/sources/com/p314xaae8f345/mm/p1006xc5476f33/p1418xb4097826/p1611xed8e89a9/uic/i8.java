package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class i8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob f205323d;

    public i8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar) {
        this.f205323d = obVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String m75945x2fec8307;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar = this.f205323d;
        java.lang.String stringExtra = obVar.m158359x1e885992().getStringExtra("key_extra_info");
        java.lang.String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = obVar.m158354x19263085();
        android.widget.FrameLayout finderProfileFollowBtn = obVar.h7().F;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderProfileFollowBtn, "finderProfileFollowBtn");
        java.lang.String finderUsername = obVar.m58741x6c03c64c();
        long j17 = obVar.Q1;
        android.app.Activity context = obVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        boolean m58744xb9a8ab96 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class)).m58744xb9a8ab96();
        boolean m58704xd2e07a89 = obVar.m58704xd2e07a89();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(activity);
        r45.qt2 V6 = e17 != null ? e17.V6() : null;
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        if (V6 != null && (m75945x2fec8307 = V6.m75945x2fec8307(1)) != null) {
            str = m75945x2fec8307;
        }
        jz5.o Tk = ((c61.l7) b6Var).Tk(str);
        int intValue = ((java.lang.Number) Tk.f384374d).intValue();
        int intValue2 = ((java.lang.Number) Tk.f384375e).intValue();
        jz5.l[] lVarArr = new jz5.l[13];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar.e(activity);
        lVarArr[0] = new jz5.l("behaviour_session_id", e18 != null ? e18.f216918q : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e19 = iyVar.e(activity);
        lVarArr[1] = new jz5.l("finder_context_id", e19 != null ? e19.f216915p : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e27 = iyVar.e(activity);
        jz5.l lVar = new jz5.l("finder_tab_context_id", e27 != null ? e27.f216919r : null);
        int i17 = 2;
        lVarArr[2] = lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e28 = iyVar.e(activity);
        lVarArr[3] = new jz5.l("comment_scene", e28 != null ? java.lang.Integer.valueOf(e28.f216913n) : null);
        lVarArr[4] = new jz5.l("finderusername", finderUsername);
        lVarArr[5] = new jz5.l("profile_state_type", java.lang.Integer.valueOf(m58744xb9a8ab96 ? 1 : 2));
        lVarArr[6] = new jz5.l("profile_screen_type", java.lang.Integer.valueOf(m58704xd2e07a89 ? 2 : 1));
        lVarArr[7] = new jz5.l("extrainfo", stringExtra);
        if (activity.getIntent().getIntExtra("key_click_avatar_type", 0) == 1 || activity.getIntent().getIntExtra("key_enter_profile_type", 0) == 11) {
            i17 = 1;
        } else if (!activity.getIntent().getBooleanExtra("key_is_from_slide", false)) {
            i17 = 3;
        }
        lVarArr[8] = new jz5.l("enter_profile_method", java.lang.Integer.valueOf(i17));
        lVarArr[9] = new jz5.l("ref_commentscene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(7)) : null);
        lVarArr[10] = new jz5.l("enter_scene", java.lang.Integer.valueOf(intValue));
        lVarArr[11] = new jz5.l("enter_type", java.lang.Integer.valueOf(intValue2));
        lVarArr[12] = new jz5.l("ref_feedid", pm0.v.u(j17));
        java.util.Map k17 = kz5.c1.k(lVarArr);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(finderProfileFollowBtn, "finder_profile_follow");
        aVar.gk(finderProfileFollowBtn, k17);
        aVar.ik(finderProfileFollowBtn, 40, 24617);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(finderProfileFollowBtn, 40, 1, false);
    }
}
