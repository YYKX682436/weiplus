package e33;

/* loaded from: classes10.dex */
public class u4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 f329023d;

    public u4(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561) {
        this.f329023d = activityC15656x6f26b561;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561 = this.f329023d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 k17 = activityC15656x6f26b561.f220112e.k(activityC15656x6f26b561.f220126o.intValue());
        if (k17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewUI", "[mEditVideoBtnInNormalFooter click] raw:%s orignal:%s", k17.f219964f, k17.f219963e);
            java.lang.String str = k17.f219964f;
            activityC15656x6f26b561.f220129p1 = str;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || activityC15656x6f26b561.f220127p) {
                activityC15656x6f26b561.f220129p1 = k17.f219963e;
                activityC15656x6f26b561.f220139x1 = "";
            } else {
                activityC15656x6f26b561.f220139x1 = k17.f219963e;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImagePreviewUI", "[mEditVideoBtnInNormalFooter click] item == null mPosition:%s", activityC15656x6f26b561.f220126o);
            activityC15656x6f26b561.f220129p1 = activityC15656x6f26b561.f220112e.i(activityC15656x6f26b561.f220126o.intValue());
            long intValue = activityC15656x6f26b561.f220126o.intValue();
            java.lang.String str2 = activityC15656x6f26b561.f220108b2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.b(2, intValue, str2, str2, "video_edit");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(b17);
            t23.p0.p(arrayList2);
        }
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC15656x6f26b561.f220139x1) ? activityC15656x6f26b561.f220129p1 : activityC15656x6f26b561.f220139x1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewUI", "editVideoMaxTimeLength : %d", java.lang.Integer.valueOf(activityC15656x6f26b561.P));
        jz5.l Ri = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Ri();
        java.lang.Object obj = Ri.f384366d;
        java.lang.Object obj2 = Ri.f384367e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewUI", "edit video path:%s thumb path:%s", obj, obj2);
        java.lang.String str4 = (java.lang.String) obj;
        java.lang.String str5 = (java.lang.String) obj2;
        if (activityC15656x6f26b561.K) {
            c17 = ((ee0.b4) ((fe0.a4) i95.n0.c(fe0.a4.class))).wi(str3, activityC15656x6f26b561.P * 1000, str4, str5, 34, activityC15656x6f26b561.d7());
            c17.f237221z = false;
            c17.f237216u = java.lang.Boolean.TRUE;
            c17.f237218w = 600000;
            c17.M.putBoolean("key_edit_video_remux_show_progress", ((pc0.y1) ((qc0.b1) i95.n0.c(qc0.b1.class))).wi());
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd();
            c17.I = c16995x8ab634cd;
            c16995x8ab634cd.f237223d = 1;
        } else if (activityC15656x6f26b561.A1) {
            c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.c(str3, "", "");
            ((pc0.s2) ((qc0.k1) i95.n0.c(qc0.k1.class))).wi(c17, true);
            c17.f237218w = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_imagepreview_c2c_edit_max_video_duration, 3600) * 1000;
            c17.f237221z = false;
            c17.f237216u = java.lang.Boolean.TRUE;
            c17.F = activityC15656x6f26b561.r7();
            c17.a(2, "com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout");
            c17.M.putBoolean("key_edit_video_remux_show_progress", ((pc0.y1) ((qc0.b1) i95.n0.c(qc0.b1.class))).wi());
            c17.M.putBoolean("key_edit_video_need_remux_by_edit_change", true);
            c17.M.putInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 2);
        } else {
            c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.c(str3, str4, str5);
            c17.f237218w = activityC15656x6f26b561.P * 1000;
            c17.F = activityC15656x6f26b561.r7();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = c17;
        c16993xacc19624.f237209n = d11.s.fj().nj();
        if (activityC15656x6f26b561.E1) {
            c16993xacc19624.M.putInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 65);
        }
        com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468 c10402x5bc41468 = new com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468((hp.a) null);
        java.util.Map map = c10402x5bc41468.f146312h;
        ((java.util.HashMap) map).put("plugin_filter", java.lang.Boolean.TRUE);
        ((java.util.HashMap) map).put("plugin_poi", true);
        ((java.util.HashMap) map).put("plugin_tip", true);
        ((java.util.HashMap) map).put("plugin_menu", true);
        c16993xacc19624.f237210o = c10402x5bc41468;
        if (!activityC15656x6f26b561.B1) {
            dx1.g.f326022a.j("SnsPublishProcess", "actionTrace_", 5, bx1.u.f117844f);
            activityC15656x6f26b561.B1 = true;
        }
        ut3.m.f512715a.f(activityC15656x6f26b561.mo55332x76847179(), 4370, com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, -1, c16993xacc19624, 2, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
