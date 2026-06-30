package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes9.dex */
public final class jb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.lb f271969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f271970e;

    public jb(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.lb lbVar, android.content.Context context) {
        this.f271969d = lbVar;
        this.f271970e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/WetypeGuideHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WetypeGuideHolder", "VoiceInputWetypeGuideHolder onClick");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.lb lbVar = this.f271969d;
        boolean d17 = lbVar.d();
        cl0.g gVar = new cl0.g();
        try {
            gVar.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, lbVar.f272002f);
            android.util.Pair c17 = rn3.i.Di().c(new vn3.c(47));
            if (c17.first == com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT && c17.second != null) {
                gVar.o("redDot", 1);
            }
            cl0.g gVar2 = new cl0.g();
            gVar2.h("wetype", gVar);
            gVar2.o("log_version", 20260409);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WetypeGuideHolder", "query:%s", gVar2.toString());
            wd0.z1 z1Var = (wd0.z1) i95.n0.c(wd0.z1.class);
            android.content.Context context = this.f271970e;
            java.lang.String gVar3 = gVar2.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar3, "toString(...)");
            ((vd0.o3) z1Var).bj(context, gVar3);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WetypeGuideHolder", e17, "", new java.lang.Object[0]);
        }
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(lbVar.a());
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(48);
        if (lbVar.f272002f == 4) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_wetype").putBoolean("mmkv_key_full_text_config_has_click", true);
        }
        if (lbVar.f272002f == 10) {
            lbVar.getClass();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("chat_username", lbVar.f272008o);
            hashMap.put("is_red_dot", java.lang.Integer.valueOf(d17 ? 1 : 0));
            hashMap.put("log_version", "20260409");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("wechat_keyboard_promote", "view_clk", hashMap, 36465);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WetypeGuideHolder", "reportWetypeGuideClick: chat_username=" + lbVar.f272008o + ", is_red_dot=" + hashMap.get("is_red_dot"));
        }
        lbVar.f272001e.a(d17);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/WetypeGuideHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
