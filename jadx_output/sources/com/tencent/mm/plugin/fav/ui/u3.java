package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class u3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent f101466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ImageQBarDataBean f101467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavImgGalleryUI f101468f;

    public u3(com.tencent.mm.plugin.fav.ui.FavImgGalleryUI favImgGalleryUI, com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent, com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean) {
        this.f101468f = favImgGalleryUI;
        this.f101466d = recogQBarOfImageFileResultEvent;
        this.f101467e = imageQBarDataBean;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        r45.bq0 bq0Var;
        r45.jq0 jq0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavImgGalleryUI", "request deal QBAR string");
        com.tencent.mm.plugin.fav.ui.FavImgGalleryUI favImgGalleryUI = this.f101468f;
        if (favImgGalleryUI.f100361h.i()) {
            favImgGalleryUI.f100361h.u();
        }
        com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = this.f101466d;
        if (recogQBarOfImageFileResultEvent == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.fav.ui.gallery.r item = favImgGalleryUI.f100359f.getItem(favImgGalleryUI.f100357d);
        com.tencent.mm.plugin.fav.ui.y3 y3Var = (com.tencent.mm.plugin.fav.ui.y3) ((java.util.HashMap) favImgGalleryUI.f100364n).get(item.j());
        if (y3Var != null && y3Var.f101616a != null) {
            com.tencent.mm.autogen.events.DealQBarStrEvent dealQBarStrEvent = new com.tencent.mm.autogen.events.DealQBarStrEvent();
            am.r3 r3Var = dealQBarStrEvent.f54079g;
            r3Var.f7781b = favImgGalleryUI;
            com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean = this.f101467e;
            r3Var.f7780a = imageQBarDataBean.f158619d;
            r3Var.f7782c = imageQBarDataBean.f158620e;
            r3Var.f7784e = 7;
            r3Var.f7788i = 39;
            r3Var.f7789j = item.f();
            r3Var.f7790k = item.e();
            r3Var.f7792m = recogQBarOfImageFileResultEvent.f54661g.f6368a;
            r3Var.f7794o = true;
            r3Var.f7796q = imageQBarDataBean.f158630r;
            r3Var.f7783d = imageQBarDataBean.f158621f;
            android.os.Bundle bundle = new android.os.Bundle(1);
            bundle.putInt("stat_scene", 5);
            o72.r2 p17 = item.p();
            favImgGalleryUI.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.FavImgGalleryUI", "addStatInfo4AppBrand, from fav");
            bundle.putInt("LaunchCodeScene_ScanScene", 4);
            if (p17 != null && (bq0Var = p17.field_favProto) != null && (jq0Var = bq0Var.f370962d) != null) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(jq0Var.f378042o)) {
                    c01.z1.r().equals(jq0Var.f378036f);
                }
                bundle.putString("stat_chat_talker_username", o72.c3.b(jq0Var));
                bundle.putString("stat_send_msg_user", jq0Var.f378036f);
                bundle.putString("stat_msg_id", jq0Var.f378046s);
            }
            favImgGalleryUI.getClass();
            bundle.putInt("KMsgType", 49);
            bundle.putInt("KAppMsgType", 19);
            r3Var.f7791l = bundle;
            dealQBarStrEvent.e();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
