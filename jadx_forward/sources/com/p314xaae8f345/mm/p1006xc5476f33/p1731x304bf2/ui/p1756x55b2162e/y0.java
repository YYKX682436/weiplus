package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public long f222872d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb f222873e;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb c16009xd65d32cb) {
        this.f222873e = c16009xd65d32cb;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String stringExtra;
        java.lang.String str;
        java.lang.Object tag;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/chat_tab/GameTabWidget2$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem tabItem = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem) view.getTag();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            stringExtra = this.f222873e.f222719d.getIntent().getStringExtra("game_tab_key");
            str = tabItem.f222689d;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameTabWidget2", "selectTab err:%s", e17.getMessage());
        }
        if (str.equals(stringExtra)) {
            if (currentTimeMillis - this.f222872d < 300) {
                ((sd.u0) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.b().getLast()).f488188i.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.w0(this));
            }
            this.f222872d = currentTimeMillis;
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/chat_tab/GameTabWidget2$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int i17 = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWidget2", "currentTabKey:%s, nextTabKey:%s", stringExtra, tabItem.f222689d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb c16009xd65d32cb = this.f222873e;
        if (c16009xd65d32cb.f222721f && !c16009xd65d32cb.f222722g) {
            int intExtra = c16009xd65d32cb.f222719d.getIntent().getIntExtra("game_tab_type", -1);
            long longExtra = this.f222873e.f222719d.getIntent().getLongExtra("turn_page_time", 0L);
            if (tabItem.f222699q != intExtra && java.lang.System.currentTimeMillis() - longExtra < 500) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWidget2", "switch interval > %d", 500L);
                yj0.a.h(this, "com/tencent/mm/plugin/game/ui/chat_tab/GameTabWidget2$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (tabItem.f222699q != intExtra) {
                this.f222873e.f222723h = false;
                ku5.u0 u0Var = ku5.t0.f394148d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.x0 x0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.x0(this);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(x0Var, 500L, false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.c1 c1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.c1) ((java.util.HashMap) this.f222873e.f222720e.f222791h).get(tabItem.f222689d);
            if (c1Var != null && (tag = c1Var.f222783d.getTag()) != null && (tag instanceof java.lang.Integer)) {
                i17 = ((java.lang.Integer) tag).intValue();
            }
            tabItem.B = i17;
            android.app.Activity activity = this.f222873e.f222719d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb.d(activity, null, tabItem, null, null, activity.getIntent(), false);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f222873e.f222719d.getIntent().getStringExtra("game_red_dot_tab_key"))) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.c1 c1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.c1) ((java.util.HashMap) this.f222873e.f222720e.f222791h).get(tabItem.f222689d);
                if (c1Var2 != null) {
                    c1Var2.f222782c.setVisibility(8);
                }
            }
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/chat_tab/GameTabWidget2$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWidget2", "tab switch disable");
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/chat_tab/GameTabWidget2$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
