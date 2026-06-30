package ke3;

/* loaded from: classes7.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.scl.p1846x76b02844.ui.ActivityC16457xffd292c f388541d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.scl.p1846x76b02844.ui.ActivityC16457xffd292c activityC16457xffd292c) {
        this.f388541d = activityC16457xffd292c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/scl/commonstarter/ui/MagicSclCommonStarterDemoUI$initDynamicCardEnv$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.scl.p1846x76b02844.ui.ActivityC16457xffd292c activityC16457xffd292c = this.f388541d;
        if (activityC16457xffd292c.f229662e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclCommonStarterDemoUI", "bizHandle is null");
        } else {
            gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar);
            iq0.c cVar = activityC16457xffd292c.f229662e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
            ((nq0.p) tVar).bj(cVar, "mb.JSBridge.invoke(\"insertFrameSet\", \n            {\n              \"frameSetName\": \"mock_123\",\n              \"bizName\": \"MagicSclNativeDemo\",\n              \"viewId\": -100,\n              \"frameSetRootPath\": \"frames\",\n              \"frameSetData\": \n          {\n          \"type\": 1,\n          \"data\": \"{\\\"iconUrl\\\":\\\"https://dldir1v6.qq.com/weixin/checkresupdate/shopicon_51fca260daa5429ca68962e278c6eef5.png\\\",\\\"pagIconUrl\\\":\\\"\\\",\\\"iconType\\\":0,\\\"recommendReason\\\":\\\"商品\\\",\\\"wording\\\":\\\"古琴零基础入门年课\\\"}\"\n          }\n         ,\n              \"frameJson\": {\n                \"subBizType\": 0,\n                \"viewParam\": {\n                  \"position\": { \"left\": 0, \"top\": 0, \"width\": 400, \"height\": 889 }\n                }\n              }\n            }\n        )", null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/scl/commonstarter/ui/MagicSclCommonStarterDemoUI$initDynamicCardEnv$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
