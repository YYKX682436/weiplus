package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.a1 f100722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI f100723e;

    public g0(com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI, com.tencent.mm.plugin.fav.ui.detail.a1 a1Var) {
        this.f100723e = favoriteImgDetailUI;
        this.f100722d = a1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        r45.bq0 bq0Var;
        r45.jq0 jq0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/detail/FavoriteImgDetailUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteImgDetailUI", "request deal QBAR string");
        com.tencent.mm.plugin.fav.ui.detail.a1 a1Var = this.f100722d;
        if (a1Var.f100685c.i()) {
            a1Var.f100685c.u();
        }
        com.tencent.mm.autogen.events.DealQBarStrEvent dealQBarStrEvent = new com.tencent.mm.autogen.events.DealQBarStrEvent();
        am.r3 r3Var = dealQBarStrEvent.f54079g;
        com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI = this.f100723e;
        r3Var.f7781b = favoriteImgDetailUI;
        r3Var.f7780a = a1Var.f100687e;
        r3Var.f7782c = a1Var.f100688f;
        r3Var.f7784e = 7;
        r3Var.f7788i = 39;
        r3Var.f7792m = a1Var.f100690h;
        r3Var.f7794o = true;
        r3Var.f7796q = a1Var.f100691i;
        r45.gp0 gp0Var = a1Var.f100683a;
        if (gp0Var != null) {
            r3Var.f7789j = gp0Var.f375434s;
            r3Var.f7790k = gp0Var.f375438u;
        }
        r3Var.f7783d = a1Var.f100689g;
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putInt("stat_scene", 5);
        int i17 = com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI.f100624w;
        favoriteImgDetailUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteImgDetailUI", "addStatInfo4AppBrand, from fav");
        bundle.putInt("LaunchCodeScene_ScanScene", 4);
        o72.r2 r2Var = favoriteImgDetailUI.f100627o;
        if (r2Var != null && (bq0Var = r2Var.field_favProto) != null && (jq0Var = bq0Var.f370962d) != null) {
            bundle.putString("stat_chat_talker_username", o72.c3.b(jq0Var));
            bundle.putString("stat_send_msg_user", jq0Var.f378036f);
            bundle.putString("stat_msg_id", jq0Var.f378046s);
        }
        r3Var.f7791l = bundle;
        dealQBarStrEvent.e();
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteImgDetailUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
