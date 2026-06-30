package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00050\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/n5;", "Lcom/tencent/mm/ipcinvoker/j;", "", "", "", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
final class n5 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        if (rVar != null) {
            if ((c01.z1.j() & 2097152) != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiJumpToTabFind", "jumpToTabFind, force open SearchOneSearch!");
                ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.x3 x3Var = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17397x56ca4f48.f241753x;
                java.lang.Object l17 = gm0.j1.u().c().l(147457, null);
                java.lang.Long l18 = l17 instanceof java.lang.Long ? (java.lang.Long) l17 : null;
                gm0.j1.u().c().w(147457, java.lang.Long.valueOf((l18 != null ? l18.longValue() : 0L) & (-2097153)));
                r45.p53 p53Var = new r45.p53();
                p53Var.f464294d = 50;
                p53Var.f464295e = 1;
                ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingManageFindMoreDetailUI", "switchChange, switch  " + p53Var.f464294d + ' ' + p53Var.f464295e);
            }
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p5.f267961d, 300L);
            if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo48674x36654fab();
            }
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(268435456);
            intent.addFlags(67108864);
            intent.putExtra("LauncherUI.switch.tab", "tab_find_friend");
            intent.putExtra("LauncherUI.FindMore.HighLightPreference", "find_friends_by_search");
            intent.setClassName(context, "com.tencent.mm.ui.LauncherUI");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiJumpToTabFind", "jumpToTabFind", "(Ljava/util/Map;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiJumpToTabFind", "jumpToTabFind", "(Ljava/util/Map;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(true));
        }
    }
}
