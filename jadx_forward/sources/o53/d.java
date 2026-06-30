package o53;

/* loaded from: classes8.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o53.e f424650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15924x61e54211 f424651e;

    public d(o53.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15924x61e54211 c15924x61e54211) {
        this.f424650d = eVar;
        this.f424651e = c15924x61e54211;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15777x5c9b169f c15777x5c9b169f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/liteapp/GameLiteSettingActionBar$initTopIcon$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15923xcaadde67 c15923xcaadde67 = this.f424651e.f221712g;
        o53.e eVar = this.f424650d;
        eVar.getClass();
        if (c15923xcaadde67 != null) {
            java.lang.String str = c15923xcaadde67.f221706e;
            int i17 = c15923xcaadde67.f221705d;
            if (i17 == 4) {
                android.net.Uri parse = android.net.Uri.parse(str);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(parse.getPath(), "chat")) {
                    long e17 = eVar.e(parse, "sourceid");
                    long e18 = eVar.e(parse, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f);
                    long e19 = eVar.e(parse, "chatVcSelectTab");
                    android.content.Intent intent = new android.content.Intent(eVar.getContext(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC15995xdf941836.class);
                    if (e19 != 0) {
                        intent.putExtra("game_msg_center_tab_type", (int) e19);
                    }
                    intent.putExtra("game_report_sourceid", e17);
                    intent.putExtra("game_report_ssid", e18);
                    intent.putExtra("game_need_bottom_tab", false);
                    android.content.Context context = eVar.getContext();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/liteapp/GameLiteSettingActionBar", "handleJumpInfo", "(Lcom/tencent/mm/plugin/game/model/LocalJumpInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/game/ui/liteapp/GameLiteSettingActionBar", "handleJumpInfo", "(Lcom/tencent/mm/plugin/game/model/LocalJumpInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    eVar.f(true, eVar.Q);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameLiteSettingActionBar", "gamelog handleJumpInfo HOST IS unSupport");
                }
            } else {
                android.content.Context context2 = eVar.getContext();
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c();
                c15780xf49d6a1c.f36742x28d6c0ab = i17;
                c15780xf49d6a1c.f36743xf0cd21de = str;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15838x34f4a78f c15838x34f4a78f = null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15922xf05fa42a c15922xf05fa42a = c15923xcaadde67.f221708g;
                if (c15922xf05fa42a != null) {
                    c15777x5c9b169f = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15777x5c9b169f();
                    c15777x5c9b169f.f36732x368f3a = c15922xf05fa42a.f221702d;
                    c15777x5c9b169f.f36730xd371e91 = c15922xf05fa42a.f221703e;
                    c15777x5c9b169f.f36731x3474cd60 = c15922xf05fa42a.f221704f;
                } else {
                    c15777x5c9b169f = null;
                }
                c15780xf49d6a1c.f36741x68a8edf8 = c15777x5c9b169f;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15926x985e4f6f c15926x985e4f6f = c15923xcaadde67.f221707f;
                if (c15926x985e4f6f != null) {
                    c15838x34f4a78f = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15838x34f4a78f();
                    c15838x34f4a78f.f36918x58b82fc = c15926x985e4f6f.f221720d;
                    c15838x34f4a78f.f36919x346425 = c15926x985e4f6f.f221721e;
                }
                c15780xf49d6a1c.f36745x92fd8573 = c15838x34f4a78f;
                s33.y.h(context2, c15780xf49d6a1c);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/liteapp/GameLiteSettingActionBar$initTopIcon$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
