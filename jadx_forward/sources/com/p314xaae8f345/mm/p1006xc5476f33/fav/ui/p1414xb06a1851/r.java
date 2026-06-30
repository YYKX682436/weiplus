package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes4.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d f182317d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d) {
        this.f182317d = activityC13590x9555381d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        o72.k3 k3Var = o72.k3.EnterCompleteVideo;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d = this.f182317d;
        o72.o3.b(k3Var, activityC13590x9555381d.E);
        r45.gp0 gp0Var = activityC13590x9555381d.F;
        r45.jp0 jp0Var = gp0Var.O1;
        java.lang.String X = o72.x1.X(gp0Var);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KFromTimeLine", false);
        intent.putExtra("KStremVideoUrl", jp0Var.f459531d);
        intent.putExtra("StreamWording", jp0Var.f459533f);
        intent.putExtra("StremWebUrl", jp0Var.f459534g);
        intent.putExtra("KBlockFav", true);
        intent.putExtra("KThumUrl", jp0Var.f459536i);
        intent.putExtra("KThumbPath", X);
        intent.putExtra("KMediaId", "fakeid_" + activityC13590x9555381d.E.f67643xc8a07680);
        intent.putExtra("KMediaVideoTime", jp0Var.f459532e);
        intent.putExtra("KMediaTitle", activityC13590x9555381d.F.f456937d);
        intent.putExtra("KSta_StremVideoAduxInfo", jp0Var.f459537m);
        intent.putExtra("KSta_StremVideoPublishId", jp0Var.f459538n);
        intent.putExtra("KSta_SourceType", 1);
        intent.putExtra("KSta_Scene", o72.l3.Fav.f424929d);
        intent.putExtra("KSta_FromUserName", activityC13590x9555381d.E.f67642xd3939c3a);
        intent.putExtra("KSta_FavID", activityC13590x9555381d.E.f67643xc8a07680);
        intent.putExtra("KSta_SnsStatExtStr", activityC13590x9555381d.F.R1);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_landing_page_new_stream_video, 1) > 0) {
            j45.l.j(activityC13590x9555381d, "sns", ".ui.SnsAdStreamVideoPlayUI", intent, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteFileDetailUI", "use new stream video play UI");
        } else {
            j45.l.j(activityC13590x9555381d, "sns", ".ui.VideoAdPlayerUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
