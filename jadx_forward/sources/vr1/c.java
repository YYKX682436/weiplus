package vr1;

/* loaded from: classes8.dex */
public final class c implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr1.o f521084d;

    public c(vr1.o oVar) {
        this.f521084d = oVar;
    }

    @Override // in5.u
    public boolean a(android.view.View itemView, android.view.MotionEvent event, in5.c cVar, int i17) {
        xr1.e item = (xr1.e) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (event.getAction() != 0) {
            return false;
        }
        int rawX = (int) event.getRawX();
        vr1.o oVar = this.f521084d;
        oVar.f521125q = rawX;
        oVar.f521126r = (int) event.getRawY();
        return false;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        xr1.e data = (xr1.e) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data.f537718e == xr1.n.f537737f) {
            vr1.o oVar = this.f521084d;
            oVar.f521115d.add(data);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6345x39a3b02d c6345x39a3b02d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6345x39a3b02d();
            c6345x39a3b02d.f136949d = 1L;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = oVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI");
            c6345x39a3b02d.f136950e = ((com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1295x37f74295.p1296x14eafa71.ActivityC12994x7e10022b) m158354x19263085).f175597e;
            r45.yk ykVar = data.f537717d;
            c6345x39a3b02d.f136951f = c6345x39a3b02d.b("bizuin", ykVar.f472702n, true);
            c6345x39a3b02d.f136952g = ykVar.f472703o;
            c6345x39a3b02d.f136953h = ykVar.f472704p;
            c6345x39a3b02d.f136954i = 0L;
            c6345x39a3b02d.f136955j = java.lang.System.currentTimeMillis();
            c6345x39a3b02d.k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "onClick jump to title:" + ykVar.f472697f + ", url:" + ykVar.f472696e);
            android.content.Intent intent = new android.content.Intent();
            java.lang.String a17 = ot0.g0.a(ykVar.f472696e, 90, 245, ((int) java.lang.System.currentTimeMillis()) / 1000);
            intent.putExtra("rawUrl", a17);
            intent.putExtra("geta8key_scene", 56);
            intent.putExtra("srcDisplayname", ykVar.f472698g);
            intent.putExtra("key_enable_fts_quick", true);
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(1)) {
                if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).E(oVar.m80379x76847179(), a17, ykVar.f472701m, false, 90, 245, intent)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "jump to TmplWebview");
                    return;
                }
            }
            j45.l.j(oVar.m80379x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }

    @Override // in5.u
    public boolean v(android.view.View itemView, in5.c cVar, int i17) {
        xr1.e data = (xr1.e) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data.f537718e != xr1.n.f537737f) {
            return false;
        }
        vr1.o oVar = this.f521084d;
        oVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("popMenu, title:");
        r45.yk ykVar = data.f537717d;
        sb6.append(ykVar.f472697f);
        sb6.append(", url:");
        sb6.append(ykVar.f472696e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, sb6.toString());
        rl5.r rVar = new rl5.r(oVar.m80379x76847179());
        rVar.C = false;
        rVar.h(itemView, new vr1.l(oVar), new vr1.m(oVar, data, i17), oVar.f521125q, oVar.f521126r);
        return true;
    }
}
