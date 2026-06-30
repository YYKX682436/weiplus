package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class h implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22355xfc758206.AppBrandServiceConversationFmUI f289243d;

    public h(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22355xfc758206.AppBrandServiceConversationFmUI appBrandServiceConversationFmUI) {
        this.f289243d = appBrandServiceConversationFmUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 o2Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var;
        java.lang.String str;
        int i18;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 o2Var2;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 o2Var3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$7", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22355xfc758206.AppBrandServiceConversationFmUI appBrandServiceConversationFmUI = this.f289243d;
        o2Var = appBrandServiceConversationFmUI.f39521xbb6ca34f;
        appBrandServiceConversationFmUI.f39525x2c1ddc83 = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) o2Var.getItem(i17);
        l4Var = appBrandServiceConversationFmUI.f39525x2c1ddc83;
        if (l4Var == null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            o2Var2 = appBrandServiceConversationFmUI.f39521xbb6ca34f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandServiceConversationFmUI", "user should not be null. position:%d, size:%d", valueOf, java.lang.Integer.valueOf(o2Var2.getCount()));
            o2Var3 = appBrandServiceConversationFmUI.f39521xbb6ca34f;
            o2Var3.notifyDataSetChanged();
            yj0.a.h(this, "com/tencent/mm/ui/conversation/AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$7", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        appBrandServiceConversationFmUI.f39532xcb7bc659 = l4Var.h1();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("finish_direct", false);
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        boolean a17 = z65.c.a();
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        if (e0Var != null) {
            a17 = ((h62.d) e0Var).fj(e42.d0.clicfg_android_appbrand_contact_support_send_video, a17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandContactABTests", "isSupportSendVideo#get, " + a17);
        if (!a17) {
            bundle.putBoolean("key_need_send_video", false);
        }
        str = appBrandServiceConversationFmUI.f39530x1037e19a;
        bundle.putString("key_scene_id", str);
        i18 = appBrandServiceConversationFmUI.f39527x41e4b02;
        bundle.putInt("app_brand_chatting_from_scene", i18);
        bundle.putInt("app_brand_chatting_from_scene_new", 3);
        appBrandServiceConversationFmUI.f288820ui.m80491x5d4f20c8(l4Var.h1(), bundle, true);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$7", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
