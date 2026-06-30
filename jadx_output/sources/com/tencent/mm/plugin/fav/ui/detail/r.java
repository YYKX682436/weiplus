package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes4.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI f100784d;

    public r(com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI) {
        this.f100784d = favoriteFileDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        o72.k3 k3Var = o72.k3.EnterCompleteVideo;
        com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI = this.f100784d;
        o72.o3.b(k3Var, favoriteFileDetailUI.E);
        r45.gp0 gp0Var = favoriteFileDetailUI.F;
        r45.jp0 jp0Var = gp0Var.O1;
        java.lang.String X = o72.x1.X(gp0Var);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KFromTimeLine", false);
        intent.putExtra("KStremVideoUrl", jp0Var.f377998d);
        intent.putExtra("StreamWording", jp0Var.f378000f);
        intent.putExtra("StremWebUrl", jp0Var.f378001g);
        intent.putExtra("KBlockFav", true);
        intent.putExtra("KThumUrl", jp0Var.f378003i);
        intent.putExtra("KThumbPath", X);
        intent.putExtra("KMediaId", "fakeid_" + favoriteFileDetailUI.E.field_id);
        intent.putExtra("KMediaVideoTime", jp0Var.f377999e);
        intent.putExtra("KMediaTitle", favoriteFileDetailUI.F.f375404d);
        intent.putExtra("KSta_StremVideoAduxInfo", jp0Var.f378004m);
        intent.putExtra("KSta_StremVideoPublishId", jp0Var.f378005n);
        intent.putExtra("KSta_SourceType", 1);
        intent.putExtra("KSta_Scene", o72.l3.Fav.f343396d);
        intent.putExtra("KSta_FromUserName", favoriteFileDetailUI.E.field_fromUser);
        intent.putExtra("KSta_FavID", favoriteFileDetailUI.E.field_id);
        intent.putExtra("KSta_SnsStatExtStr", favoriteFileDetailUI.F.R1);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_landing_page_new_stream_video, 1) > 0) {
            j45.l.j(favoriteFileDetailUI, "sns", ".ui.SnsAdStreamVideoPlayUI", intent, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteFileDetailUI", "use new stream video play UI");
        } else {
            j45.l.j(favoriteFileDetailUI, "sns", ".ui.VideoAdPlayerUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
