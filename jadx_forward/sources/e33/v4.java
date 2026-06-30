package e33;

/* loaded from: classes10.dex */
public class v4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 f329050d;

    public v4(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561) {
        this.f329050d = activityC15656x6f26b561;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561 = this.f329050d;
        java.lang.String i17 = activityC15656x6f26b561.f220112e.i(activityC15656x6f26b561.f220126o.intValue());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImagePreviewUI", "get path error, position %d", activityC15656x6f26b561.f220126o);
            yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        jz5.l Ri = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Ri();
        java.lang.Object obj = Ri.f384366d;
        java.lang.Object obj2 = Ri.f384367e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewUI", "edit video path:%s thumb path:%s", obj, obj2);
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = (java.lang.String) obj2;
        if (activityC15656x6f26b561.K) {
            c17 = ((ee0.b4) ((fe0.a4) i95.n0.c(fe0.a4.class))).wi(i17, activityC15656x6f26b561.P * 1000, str, str2, 33, activityC15656x6f26b561.d7());
        } else {
            c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.c(i17, str, str2);
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
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) activityC15656x6f26b561.f220112e.k(activityC15656x6f26b561.f220126o.intValue())).f219979x >= (activityC15656x6f26b561.P * 1000) + 500) {
            activityC15656x6f26b561.C1 = true;
        }
        if (!activityC15656x6f26b561.B1) {
            dx1.g.f326022a.j("SnsPublishProcess", "actionTrace_", 5, bx1.u.f117844f);
            activityC15656x6f26b561.B1 = true;
        }
        ut3.m.f512715a.f(activityC15656x6f26b561.mo55332x76847179(), 4370, com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, -1, c16993xacc19624, 2, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
