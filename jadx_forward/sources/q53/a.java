package q53;

/* loaded from: classes8.dex */
public final class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.l {
    /* JADX WARN: Multi-variable type inference failed */
    public a(sd.x xVar, sd.o0 o0Var, android.os.Bundle bundle, java.lang.String str) {
        super(xVar, o0Var, bundle);
        java.lang.String str2;
        java.lang.String str3;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1 y1Var = this.f263719t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(y1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.game.ui.web.GameWebSettingActionBar");
        final q53.f fVar = (q53.f) y1Var;
        fVar.B1 = str;
        android.os.Bundle bundle2 = fVar.W;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 c16008xdb77bd65 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65) bundle2.getParcelable("game_tab_data");
        java.lang.String str4 = fVar.B1;
        boolean z18 = false;
        if (str4 == null || str4.length() == 0) {
            fVar.f441734z1 = true;
            str2 = bundle2.getString("game_tab_key");
        } else {
            str2 = fVar.B1;
        }
        if (c16008xdb77bd65 != null) {
            if (str2 == null || str2.length() == 0) {
                return;
            }
            fVar.a(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem tabItem = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem) c16008xdb77bd65.f222684d.get(str2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var = fVar.V;
            if (x0Var.f488190n.getBoolean("from_find_more_friend", false) && com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.k() != null && !com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.k().f405511g && tabItem != null && !tabItem.G) {
                fVar.k();
            }
            if (tabItem != null) {
                java.util.List list = tabItem.F;
                if (list == null || ((java.util.ArrayList) list).isEmpty()) {
                    return;
                }
                java.util.List topCornerSettings = tabItem.F;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(topCornerSettings, "topCornerSettings");
                java.util.Iterator it = ((java.util.ArrayList) topCornerSettings).iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15924x61e54211 c15924x61e54211 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15924x61e54211) it.next();
                    android.view.LayoutInflater b17 = com.p314xaae8f345.mm.ui.id.b(fVar.getContext());
                    android.widget.LinearLayout linearLayout = fVar.f264233o;
                    android.view.View inflate = b17.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bdp, linearLayout, z18);
                    android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566935hk5);
                    fVar.f441732y0.add(imageView);
                    boolean b18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c15924x61e54211.f221709d, "chat");
                    java.lang.String str5 = c15924x61e54211.f221711f;
                    java.lang.String str6 = c15924x61e54211.f221710e;
                    if (b18) {
                        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(""), com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb.b.class, null);
                        fVar.f441728p0 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gii);
                        fVar.f441730x0 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.avs);
                        android.content.Context context = x0Var.f488143d;
                        if (context instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) {
                            ((p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) context).mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.game.ui.web.GameWebSettingActionBar$initChatTab$1
                                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
                                /* renamed from: onResume */
                                public final void m64829x57429eec() {
                                    q53.f.this.m159519xef1b8414().mo48813x58998cd();
                                }
                            });
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15923xcaadde67 c15923xcaadde67 = c15924x61e54211.f221712g;
                        if (c15923xcaadde67 != null && c15923xcaadde67.f221705d == 4) {
                            android.net.Uri parse = android.net.Uri.parse(c15923xcaadde67.f221706e);
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(parse.getPath(), "chat")) {
                                try {
                                    fVar.f441729p1 = java.lang.Integer.parseInt(parse.getQueryParameter("sourceSence"));
                                } catch (java.lang.NumberFormatException unused) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameWebSettingActionBar", "gamelog parse reportSourceScene error");
                                }
                            }
                        }
                        if (com.p314xaae8f345.mm.ui.bk.C()) {
                            if (str5 == null || str5.length() == 0) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                                fVar.m(imageView, com.p314xaae8f345.mm.R.raw.f79456x6a8b26);
                                z17 = true;
                            }
                        }
                        if (!com.p314xaae8f345.mm.ui.bk.C()) {
                            if (str6 == null || str6.length() == 0) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                                fVar.m(imageView, com.p314xaae8f345.mm.R.raw.f79456x6a8b26);
                                z17 = true;
                            }
                        }
                        vo0.a aVar = vo0.e.f520001b;
                        str5 = com.p314xaae8f345.mm.ui.bk.C() ? str5 : str6;
                        str3 = str5 != null ? str5 : "";
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                        yo0.f fVar2 = new yo0.f();
                        fVar2.f545611b = true;
                        fVar2.f545610a = true;
                        aVar.h(str3, imageView, fVar2.a(), new q53.c(c15924x61e54211, imageView, fVar));
                        z17 = true;
                    } else {
                        vo0.a aVar2 = vo0.e.f520001b;
                        str5 = com.p314xaae8f345.mm.ui.bk.C() ? str5 : str6;
                        str3 = str5 != null ? str5 : "";
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                        yo0.f fVar3 = new yo0.f();
                        z17 = true;
                        fVar3.f545611b = true;
                        fVar3.f545610a = true;
                        aVar2.h(str3, imageView, fVar3.a(), new q53.d(c15924x61e54211, imageView));
                    }
                    inflate.setOnClickListener(new q53.e(fVar, c15924x61e54211));
                    linearLayout.addView(inflate, 0);
                    z18 = false;
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.l
    public void W(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        super.W(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) ((java.util.concurrent.ConcurrentHashMap) this.f221443j2).get(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1 y1Var = x0Var != null ? x0Var.f263719t : null;
        if (y1Var == null || !(y1Var instanceof q53.f)) {
            return;
        }
        q53.f fVar = (q53.f) y1Var;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, fVar.B1)) {
            fVar.f441734z1 = true;
            if (fVar.f441727l1 || !fVar.A1) {
                return;
            }
            fVar.f441727l1 = true;
            fVar.o(false, str);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.l
    public void a0(java.lang.String str, java.lang.String str2, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        java.util.Map mTabPageMap = this.f221443j2;
        if (((java.util.concurrent.ConcurrentHashMap) mTabPageMap).containsKey(str) || this.f221446m2 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameTabSettingWebPage", "insertTabHomeWeb, tabKey:%s, url:%s", str, str2);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putAll(this.f488190n);
        bundle.putString("rawUrl", str2);
        q53.a aVar = new q53.a(this.f488145f, null, bundle, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1 y1Var = aVar.f263719t;
        if (y1Var != null) {
            y1Var.b();
        }
        aVar.V1 = this;
        aVar.W1 = z17;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f221451r2;
        if (abstractActivityC21394xb3d2c0cf != null && abstractActivityC21394xb3d2c0cf.mo78538xecd98af8() && z17) {
            aVar.Y1 = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameTabSettingWebPage", "mockFetchFcp, url:%s", str2);
        }
        c0(aVar, str);
        this.f221446m2.addView(aVar.f488187h, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
        aVar.b(str2, bundle);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mTabPageMap, "mTabPageMap");
        ((java.util.concurrent.ConcurrentHashMap) mTabPageMap).put(str, aVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.l
    public void b0() {
        android.content.Context context = this.f488143d;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC15995xdf941836.class);
        intent.putExtra("game_need_bottom_tab", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameTabSettingWebPage", "jumpToChat chatClassName = " + com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC15995xdf941836.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/web/GameTabSettingWebPage", "jumpToChat", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/game/ui/web/GameTabSettingWebPage", "jumpToChat", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0
    public android.view.View m() {
        android.os.Bundle bundle = this.f488190n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bundle, "getParams(...)");
        this.f263719t = new q53.f(this, bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameTabSettingWebPage", "createActionBar GameWebSettingActionBar");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1 mActionBar = this.f263719t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mActionBar, "mActionBar");
        return mActionBar;
    }
}
