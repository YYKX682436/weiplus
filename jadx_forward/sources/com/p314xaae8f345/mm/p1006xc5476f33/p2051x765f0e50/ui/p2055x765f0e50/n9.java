package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class n9 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.o9 f242886a;

    public n9(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.o9 o9Var) {
        this.f242886a = o9Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            l14.a.b(true);
            l14.a.a("care_mode_btn", true);
            if (gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_CARE_MODE_LARGE_FONT_BOOLEAN, true)) {
                l14.a.a("large_font_btn", true);
            }
            if (gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_CARE_MODE_LISTEN_BOOLEAN, true)) {
                l14.a.a("listen_text_msg_btn", true);
            }
            if (gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_CARE_MODE_MUTE_BOOLEAN, true)) {
                l14.a.a("silent_mode_btn", true);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.o9 o9Var = this.f242886a;
            float n17 = i65.a.n(o9Var.f242917d.mo55332x76847179());
            o9Var.f242917d.mo55332x76847179();
            int f17 = j65.c.f(n17);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putFloat("before_care_mode_text_size_scale_key", n17);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FontUtil", "TEXT_SIZE_BEFOR_CARE_MODE_KEY put result:%s, currentFont:%s ", bool, java.lang.Float.valueOf(n17));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putInt("before_care_mode_text_size_index_key", f17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FontUtil", "set TEXT_INDEX_BEFOR_CARE_MODE_KEY result:%s, sliderIndex:%s", bool, java.lang.Integer.valueOf(f17));
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = o9Var.f242917d.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p8) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p8.class)).f242962f = true;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = o9Var.f242917d.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p8) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p8.class)).T6();
        }
    }
}
