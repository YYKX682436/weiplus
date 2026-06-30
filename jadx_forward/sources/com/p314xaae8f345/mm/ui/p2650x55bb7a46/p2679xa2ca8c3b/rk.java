package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes12.dex */
public class rk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final yb5.d f286991d;

    public rk(yb5.d dVar) {
        this.f286991d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemEmojiBase$EmojiCaptureTipsClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureTipsClickListener", "onClick: ");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_CAPTURE_PANEL_FROM_TIPS_TIME_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15982, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", 0, 0);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5326x794c50e5 c5326x794c50e5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5326x794c50e5();
        c5326x794c50e5.f135638g.f89332a = 2;
        c5326x794c50e5.e();
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5897xc57a522().e();
        boolean z17 = c5326x794c50e5.f135639h.f89402a;
        yb5.d dVar = this.f286991d;
        if (!z17) {
            h65.c.f360853b.a(-29414086, "capture");
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) dVar.f542241c.a(sb5.s0.class))).f280796e.m75485xcf24e678("capture");
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) dVar.f542241c.a(sb5.s0.class))).f280796e.x1();
        dVar.K();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemEmojiBase$EmojiCaptureTipsClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
