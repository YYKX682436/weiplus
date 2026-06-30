package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class wf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f281705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf f281706e;

    public wf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf rfVar, int i17) {
        this.f281706e = rfVar;
        this.f281705d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf rfVar = this.f281706e;
        rfVar.f281365h = 2;
        com.p314xaae8f345.mm.p642xad8b531f.g3 g3Var = com.p314xaae8f345.mm.p642xad8b531f.h3.f144912q.f144917e;
        if (g3Var != null) {
            g3Var.f144905i = 2;
        }
        sb5.t0 t0Var = (sb5.t0) rfVar.f280113d.f542241c.a(sb5.t0.class);
        rfVar.f280113d.x();
        t0Var.getClass();
        sc5.a.f488094a.a(rfVar.f280113d.x(), null, ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().S6(rfVar.f280113d.x(), rfVar.f281364g - 1));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf.n0(rfVar, rfVar.A);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.B3(rfVar.f280113d.x())) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.s2 s2Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.s2) ((sb5.o) rfVar.f280113d.f542241c.a(sb5.o.class));
            if (s2Var.n0()) {
                s2Var.m0(10, 0L, 0, null, 0, 0, 0L, 0, null, null, null);
            }
        }
        try {
            if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h0) ((sb5.g) rfVar.f280113d.f542241c.a(sb5.g.class))).n0()) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a aVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a.f297578b;
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.y yVar = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.y();
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.x xVar = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.x();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                xVar.f300747f = java.lang.System.currentTimeMillis();
                xVar.f300748g = com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.w.Click;
                xVar.f300745d = aVar.b();
                xVar.f300749h = "102_1";
                xVar.f300750i = "elevator";
                cl0.g gVar = new cl0.g();
                gVar.o("new_noti_count", this.f281705d);
                xVar.f300755q = gVar.toString();
                yVar.f300787d = xVar;
                aVar.f(yVar);
            }
        } catch (cl0.f e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HistoryMsgTongueComponent", "json error: %s", e17);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
