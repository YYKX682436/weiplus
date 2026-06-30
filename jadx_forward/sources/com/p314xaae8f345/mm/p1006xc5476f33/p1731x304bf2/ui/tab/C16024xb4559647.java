package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab;

/* renamed from: com.tencent.mm.plugin.game.ui.tab.GameTabWidget */
/* loaded from: classes8.dex */
public class C16024xb4559647 extends android.widget.LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public static int f223304f;

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f223305d;

    /* renamed from: e, reason: collision with root package name */
    public p53.c f223306e;

    /* renamed from: com.tencent.mm.plugin.game.ui.tab.GameTabWidget$a */
    /* loaded from: classes7.dex */
    public static class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
        @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
        /* renamed from: invoke */
        public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
            android.os.Bundle bundle = (android.os.Bundle) obj;
            if (rVar != null) {
                rVar.a(bundle);
            }
        }
    }

    public C16024xb4559647(android.content.Context context) {
        super(context);
        b(context);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.C16024xb4559647 c16024xb4559647) {
        int count = c16024xb4559647.f223306e.getCount();
        if (count == 0) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i65.a.B(c16024xb4559647.f223305d) / count, -1);
        for (int i17 = 0; i17 < count; i17++) {
            android.view.View view = c16024xb4559647.f223306e.getView(i17, null, c16024xb4559647);
            view.setOnClickListener(new p53.m(c16024xb4559647));
            view.setLayoutParams(layoutParams);
            c16024xb4559647.addView(view);
        }
    }

    public static void c(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.TabItem tabItem, boolean z17, boolean z18, boolean z19) {
        boolean z27;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.StatusBar statusBar;
        if (activity == null || tabItem == null || r53.f.c(activity, tabItem.f221690f)) {
            return;
        }
        java.lang.String stringExtra = activity.getIntent().getStringExtra("tab_key");
        java.lang.String str2 = tabItem.f221688d;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.equals(stringExtra)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWidget", "current_page:%s, next_page:%s, hasAnimation:%b", activity.getClass().getSimpleName(), tabItem.f221697p, java.lang.Boolean.valueOf(z17));
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(activity, tabItem.f221697p);
        android.os.Bundle extras = activity.getIntent().getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        } else {
            extras = new android.os.Bundle();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("tab_key", tabItem.f221688d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d c15921xfed2506d = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d) extras.getParcelable("tab_data");
        if (c15921xfed2506d != null) {
            java.util.LinkedHashMap linkedHashMap = c15921xfed2506d.f221684d;
            if (stringExtra == null) {
                stringExtra = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.TabItem tabItem2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.TabItem) linkedHashMap.get(stringExtra);
            if (tabItem2 != null) {
                tabItem2.f221698q = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.TabItem tabItem3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.TabItem) c15921xfed2506d.f221684d.get(tabItem.f221688d);
            boolean z28 = tabItem3 != null ? tabItem3.f221698q : false;
            bundle.putParcelable("tab_data", c15921xfed2506d);
            z27 = z28;
        } else {
            z27 = false;
        }
        if (z19) {
            str = "game_report_from_scene";
        } else {
            str = "game_report_from_scene";
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(activity, 18, tabItem.f221699r, tabItem.f221700s, 2, null, activity.getIntent().getIntExtra("game_report_from_scene", 0), n53.a.e(tabItem.f221701t));
        }
        if (!tabItem.f221692h) {
            bundle.putString("rawUrl", tabItem.f221690f);
            bundle.putBoolean("KRightBtn", true);
            bundle.putBoolean("isWebwx", true);
            bundle.putBoolean("show_bottom", false);
            bundle.putString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fq7));
            bundle.putBoolean("forceHideShare", true);
            bundle.putBoolean("disable_swipe_back", true);
            bundle.putBoolean("show_native_web_view", true);
            bundle.putBoolean("disable_progress_bar", true);
            bundle.putBoolean("disable_bounce_scroll", true);
            bundle.putInt("screen_orientation", 1);
            bundle.putString("KPublisherId", "game_center_entrance");
            bundle.putInt("geta8key_scene", 32);
            if (c15921xfed2506d != null && (statusBar = c15921xfed2506d.f221685e) != null) {
                bundle.putString("status_bar_style", statusBar.f221686d);
                bundle.putInt("customize_status_bar_color", c15921xfed2506d.f221685e.f221687e);
            }
            bundle.putBoolean("game_check_float", z19);
            java.lang.String string = bundle.getString("rawUrl");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                if (z19) {
                    boolean booleanExtra = intent.getBooleanExtra("from_find_more_friend", false);
                    int intExtra = intent.getIntExtra(str, 0);
                    if (booleanExtra) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 k17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().k();
                        bundle.putString("rawUrl", com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d0.a(string, k17, null, true));
                        if (k17 != null) {
                            k17.t0();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.h0 h0Var = k17.f221824p2;
                            if (h0Var.f221859d) {
                                bundle.putString("game_transparent_float_url", h0Var.f221856a);
                            }
                            bundle.putInt("game_sourceScene", intExtra);
                        }
                    }
                } else {
                    bundle.remove("game_transparent_float_url");
                    bundle.remove("game_sourceScene");
                }
            }
        }
        intent.putExtras(bundle);
        d(activity, intent, z17, z18, z27, tabItem.f221692h);
    }

    public static void d(android.app.Activity activity, android.content.Intent intent, boolean z17, boolean z18, boolean z19, boolean z27) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = intent.getComponent() == null ? "" : intent.getComponent().getClassName();
        objArr[1] = java.lang.Boolean.valueOf(z19);
        objArr[2] = java.lang.Boolean.valueOf(z17);
        objArr[3] = java.lang.Boolean.valueOf(z18);
        objArr[4] = java.lang.Boolean.valueOf(z27);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWidget", "(%s isActivityExist):%b, hasAnimation:%b, forceFinish:%b, isNative:%b", objArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWidget", (z19 || z27) ? "straight to jump" : "jump to bridge");
        if (!z19 && z27) {
            ((h80.k) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0.class))).getClass();
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.e(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10771x8ab5e24d.f149995e, null, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.C16024xb4559647.a.class, null, null);
        }
        if (z19 || z27) {
            f223304f = 0;
            intent.addFlags(131072);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/tab/GameTabWidget", "turnPage", "(Landroid/app/Activity;Landroid/content/Intent;ZZZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/game/ui/tab/GameTabWidget", "turnPage", "(Landroid/app/Activity;Landroid/content/Intent;ZZZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            android.content.Intent intent2 = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.ActivityC16019x54473720.class);
            intent2.putExtras(intent.getExtras());
            intent2.putExtra("next_tab_component", intent.getComponent());
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/tab/GameTabWidget", "turnPage", "(Landroid/app/Activity;Landroid/content/Intent;ZZZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/game/ui/tab/GameTabWidget", "turnPage", "(Landroid/app/Activity;Landroid/content/Intent;ZZZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        if (z18 && !activity.isDestroyed() && !activity.isFinishing()) {
            activity.finish();
        }
        if (z17) {
            activity.overridePendingTransition(com.p314xaae8f345.mm.ui.uc.f292611a, com.p314xaae8f345.mm.ui.uc.f292612b);
        } else {
            activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559348c9, com.p314xaae8f345.mm.R.C30854x2dc211.f559348c9);
        }
    }

    public final void b(android.content.Context context) {
        this.f223305d = (android.app.Activity) context;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560721sc);
        setOrientation(0);
    }

    /* renamed from: setAdapter */
    public void m64824x6cab2c8d(p53.c cVar) {
        this.f223306e = cVar;
        cVar.registerDataSetObserver(new p53.l(this));
        cVar.notifyDataSetChanged();
    }

    public C16024xb4559647(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }

    public C16024xb4559647(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        b(context);
    }
}
