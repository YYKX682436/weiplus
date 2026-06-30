package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class k7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7 f232788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm3.u f232789e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f232790f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 f232791g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f232792h;

    public k7(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7 q7Var, fm3.u uVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 n0Var, in5.s0 s0Var) {
        this.f232788d = q7Var;
        this.f232789e = uVar;
        this.f232790f = i17;
        this.f232791g = n0Var;
        this.f232792h = s0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        r45.ef2 m76971x25b90ced;
        java.util.LinkedList m75941xfb821914;
        int i18;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662;
        java.lang.String str;
        java.lang.StringBuilder sb6;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7 q7Var = this.f232788d;
        q7Var.f232922e = true;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.g8 g8Var = q7Var.f232921d;
        if (g8Var != null) {
            g8Var.a(java.lang.System.currentTimeMillis(), 4, "2", 10, null);
        }
        int itemId = menuItem.getItemId();
        int i19 = 3;
        int i27 = 2;
        fm3.u musicMv = this.f232789e;
        switch (itemId) {
            case 201:
                java.lang.Object obj = null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicMv, "musicMv");
                android.content.Intent intent = new android.content.Intent();
                android.app.Activity context = q7Var.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 n0Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) a17;
                r45.ss4 ss4Var = new r45.ss4();
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
                java.lang.Long l17 = musicMv.f345656c;
                c19792x256d27252.m76877x684351d(l17 != null ? l17.longValue() : 0L);
                c19792x256d27252.m76896xfefec3e9(musicMv.f345657d);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56();
                r45.ef2 ef2Var = new r45.ef2();
                ef2Var.set(1, n0Var.f232843i);
                r45.gf2 gf2Var = new r45.gf2();
                gf2Var.set(0, java.lang.Float.valueOf(0.0f));
                gf2Var.set(1, java.lang.Float.valueOf(0.0f));
                ef2Var.set(2, gf2Var);
                int i28 = musicMv.f345669p;
                if (i28 == 1) {
                    ef2Var.set(0, musicMv.f345660g);
                } else if (i28 == 4 && (c19792x256d2725 = musicMv.f345673t) != null && (m76802x2dd01666 = c19792x256d2725.m76802x2dd01666()) != null && (m76971x25b90ced = m76802x2dd01666.m76971x25b90ced()) != null && (m75941xfb821914 = m76971x25b90ced.m75941xfb821914(0)) != null) {
                    ef2Var.set(0, m75941xfb821914);
                }
                ef2Var.set(6, 1);
                c19793xceab7f56.m77009x18ee40f9(ef2Var);
                c19792x256d27252.m76895x5bf46472(c19793xceab7f56);
                ss4Var.set(0, c19792x256d27252);
                int i29 = musicMv.f345669p;
                if (i29 == 1) {
                    ss4Var.set(1, musicMv.f345668o);
                    i18 = 4;
                } else {
                    i18 = 4;
                    if (i29 == 4) {
                        ss4Var.set(1, musicMv.f345674u);
                    }
                }
                ss4Var.set(6, java.lang.Integer.valueOf(n0Var.f232852u));
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ss4Var.m75936x14adae67(0);
                if (c19792x256d27253 != null && (m76802x2dd016662 = c19792x256d27253.m76802x2dd01666()) != null) {
                    obj = m76802x2dd016662.m76971x25b90ced();
                }
                ss4Var.set(5, obj);
                ss4Var.set(2, q7Var.P6(musicMv));
                intent.putExtra("key_track_data", ss4Var.mo14344x5f01b1f6());
                intent.putExtra("key_mv_music_duration", n0Var.f232843i.m75939xb282bd08(14));
                if (this.f232790f != 3) {
                    i18 = 3;
                }
                intent.putExtra("key_mv_enter_maker_ui_from_scene", i18);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Qk(q7Var.m158354x19263085(), intent);
                r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(q7Var.m80379x76847179(), 7, r45.bt4.class);
                if (bt4Var == null) {
                    return;
                }
                bt4Var.f452573h = 1;
                return;
            case 202:
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(q7Var.m80379x76847179());
                u1Var.g(q7Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h3x));
                u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0);
                u1Var.k(q7Var.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31));
                u1Var.j(q7Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
                u1Var.f293529a.f293354b.V = q7Var.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
                u1Var.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.j7(q7Var, musicMv));
                u1Var.q(false);
                return;
            case 203:
                java.lang.Long l18 = musicMv.f345656c;
                if (l18 != null) {
                    long longValue = l18.longValue();
                    ka0.r0 r0Var = (ka0.r0) i95.n0.c(ka0.r0.class);
                    android.app.Activity m80379x76847179 = q7Var.m80379x76847179();
                    java.lang.String u17 = pm0.v.u(longValue);
                    ((ja0.o0) r0Var).getClass();
                    int i37 = ll3.j2.f400718a;
                    java.lang.String format = java.lang.String.format("https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fys) + "/security/readtemplate?t=weixin_report/w_type&scene=%d&content_ID=%s", 69, u17);
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("rawUrl", format);
                    j45.l.j(m80379x76847179, "webview", ".ui.tools.WebViewUI", intent2, null);
                    return;
                }
                return;
            case 204:
                this.f232791g.f232851t = true;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.gbk);
                java.util.Set D0 = kz5.z.D0(new java.lang.Integer[]{java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.ndq), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.bzk), valueOf, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.gcd)});
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = q7Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                pf5.z zVar2 = pf5.z.f435481a;
                boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) zVar2.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class)).f232851t;
                in5.s0 s0Var = this.f232792h;
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.m8 m8Var = q7Var.f232925h;
                if (z17) {
                    m8Var.a(s0Var.f3639x46306858);
                    m8Var.b(D0);
                    m8Var.f232836b.clear();
                } else {
                    kz5.q1.h(D0, valueOf);
                    m8Var.a(s0Var.f3639x46306858);
                    m8Var.c(D0);
                    m8Var.f232836b.clear();
                }
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = q7Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                if (((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) zVar2.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class)).f232851t) {
                    android.view.View findViewById = s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.im7);
                    if (findViewById != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View findViewById2 = s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567215im3);
                    if (findViewById2 == null) {
                        return;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                int i38 = musicMv.f345669p;
                if (i38 == 1) {
                    android.view.View findViewById3 = s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.im7);
                    if (findViewById3 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(findViewById3, "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View findViewById4 = s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567215im3);
                    if (findViewById4 == null) {
                        return;
                    }
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(findViewById4, "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                if (i38 == 2) {
                    android.view.View findViewById5 = s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.im7);
                    if (findViewById5 != null) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                        arrayList5.add(0);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(findViewById5, "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View findViewById6 = s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567215im3);
                    if (findViewById6 == null) {
                        return;
                    }
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(findViewById6, arrayList6.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(findViewById6, "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                if (i38 != 3) {
                    if (i38 != 4) {
                        return;
                    }
                    android.view.View findViewById7 = s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.im7);
                    if (findViewById7 != null) {
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
                        arrayList7.add(8);
                        java.util.Collections.reverse(arrayList7);
                        yj0.a.d(findViewById7, arrayList7.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                        yj0.a.f(findViewById7, "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View findViewById8 = s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567215im3);
                    if (findViewById8 == null) {
                        return;
                    }
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
                    arrayList8.add(8);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(findViewById8, arrayList8.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(findViewById8, "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                android.view.View findViewById9 = s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.im7);
                if (findViewById9 != null) {
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal9 = zj0.c.f554818a;
                    arrayList9.add(0);
                    java.util.Collections.reverse(arrayList9);
                    yj0.a.d(findViewById9, arrayList9.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                    yj0.a.f(findViewById9, "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById10 = s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567215im3);
                if (findViewById10 != null) {
                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal10 = zj0.c.f554818a;
                    arrayList10.add(0);
                    java.util.Collections.reverse(arrayList10);
                    yj0.a.d(findViewById10, arrayList10.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                    yj0.a.f(findViewById10, "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById11 = s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567215im3);
                if (findViewById11 != null) {
                    findViewById11.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.p7(musicMv));
                    return;
                }
                return;
            case 205:
                android.app.Activity context2 = q7Var.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                pf5.z zVar3 = pf5.z.f435481a;
                if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t0 t0Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t0) zVar3.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t0.class);
                t0Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicMv, "musicMv");
                int i39 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
                if ((i39 == 788529167 || i39 == 788529166) || z65.c.a()) {
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = t0Var.m158354x19263085();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
                    r45.hf2 hf2Var = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) zVar3.a(activity3).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class)).f232843i;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("songId", hf2Var.m75945x2fec8307(5));
                    jSONObject.put("songName", hf2Var.m75945x2fec8307(0));
                    jSONObject.put("singer", hf2Var.m75945x2fec8307(1));
                    jSONObject.put("albumName", hf2Var.m75945x2fec8307(7));
                    jSONObject.put("albumUrl", hf2Var.m75945x2fec8307(8));
                    jSONObject.put("musicWebUrl", hf2Var.m75945x2fec8307(4));
                    jSONObject.put("musicDataUrl", hf2Var.m75945x2fec8307(2));
                    jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37653xb5f52253, hf2Var.m75945x2fec8307(9));
                    jSONObject.put("publicTime", hf2Var.m75945x2fec8307(10));
                    jSONObject.put("musicAppId", hf2Var.m75945x2fec8307(3));
                    jSONObject.put("publicTimeS", hf2Var.m75942xfb822ef2(11));
                    jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96, hf2Var.m75945x2fec8307(12));
                    jSONObject.put("identification", hf2Var.m75945x2fec8307(13));
                    r45.if2 if2Var = (r45.if2) hf2Var.m75936x14adae67(17);
                    if (if2Var == null || (str = if2Var.m75945x2fec8307(0)) == null) {
                        str = "";
                    }
                    jSONObject.put("operationUrl", str);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l a18 = kl3.t.g().a();
                    jSONObject.put("duration", a18 != null ? java.lang.Integer.valueOf(a18.mo67219x51e8b0a()) : null);
                    jSONObject.put("musicDuration", hf2Var.m75939xb282bd08(14));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l a19 = kl3.t.g().a();
                    jSONObject.put("currentPosition", a19 != null ? java.lang.Integer.valueOf(a19.a()) : null);
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put(dm.i4.f66867x2a5c95c7, musicMv.f345654a);
                    jSONObject2.put("localCoverPath", musicMv.f345655b);
                    jSONObject2.put("mvObjectId", musicMv.f345656c);
                    java.lang.Long l19 = musicMv.f345656c;
                    jSONObject2.put("unsignedMvObjectId", pm0.v.u(l19 != null ? l19.longValue() : 0L));
                    jSONObject2.put("mvObjectNonceId", musicMv.f345657d);
                    jSONObject2.put("mvMakerNickName", musicMv.f345659f);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = musicMv.f345663j;
                    jSONObject2.put("mvMakerUsername", c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null);
                    jSONObject2.put("coverUrl", musicMv.f345658e);
                    jSONObject2.put("likeCount", musicMv.f345664k);
                    jSONObject2.put("forwardCount", musicMv.f345665l);
                    jSONObject2.put("commentCount", musicMv.f345666m);
                    jSONObject2.put("mvPostStatus", musicMv.f345669p);
                    jSONObject2.put("isDelete", musicMv.f345671r);
                    r45.gf2 gf2Var2 = musicMv.f345662i;
                    jSONObject2.put("originality", gf2Var2 != null ? java.lang.Float.valueOf(gf2Var2.m75938x746dc8a6(0)) : null);
                    r45.gf2 gf2Var3 = musicMv.f345662i;
                    jSONObject2.put("completion", gf2Var3 != null ? java.lang.Float.valueOf(gf2Var3.m75938x746dc8a6(1)) : null);
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    int i47 = 0;
                    for (java.lang.Object obj2 : musicMv.f345660g) {
                        int i48 = i47 + 1;
                        if (i47 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        r45.jf2 jf2Var = (r45.jf2) obj2;
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put(ya.b.f77479x42930b2, i47);
                        jSONObject3.put("refObjectId", jf2Var.m75942xfb822ef2(i27));
                        jSONObject3.put("unsignedRefObjectId", pm0.v.u(jf2Var.m75942xfb822ef2(i27)));
                        jSONObject3.put("refNonceId", jf2Var.m75945x2fec8307(i19));
                        jSONObject3.put("timeOffsetInMvMs", jf2Var.m75942xfb822ef2(0));
                        jSONObject3.put("timeLengthInMvMs", jf2Var.m75939xb282bd08(1));
                        jSONObject3.put("timeOffsetInClipMs", jf2Var.m75942xfb822ef2(4));
                        jSONObject3.put("isFirstUpload", jf2Var.m75939xb282bd08(6));
                        jSONArray.put(jSONObject3);
                        jSONObject2 = jSONObject2;
                        i47 = i48;
                        i19 = 3;
                        i27 = 2;
                    }
                    org.json.JSONObject jSONObject4 = jSONObject2;
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    int i49 = 0;
                    for (java.lang.Object obj3 : musicMv.f345668o) {
                        int i57 = i49 + 1;
                        if (i49 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27254 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj3;
                        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                        jSONObject5.put(ya.b.f77479x42930b2, i49);
                        org.json.JSONObject jSONObject6 = jSONObject4;
                        jSONObject5.put(dm.i4.f66865x76d1ec5a, c19792x256d27254.m76784x5db1b11());
                        jSONObject5.put("unsignedId", pm0.v.u(c19792x256d27254.m76784x5db1b11()));
                        jSONObject5.put("objectNonceId", c19792x256d27254.m76803x6c285d75());
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = c19792x256d27254.m76760x76845fea();
                        jSONObject5.put(dm.i4.f66875xa013b0d5, m76760x76845fea != null ? m76760x76845fea.m76197x6c03c64c() : null);
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea2 = c19792x256d27254.m76760x76845fea();
                        jSONObject5.put("nickname", m76760x76845fea2 != null ? m76760x76845fea2.m76184x8010e5e4() : null);
                        if (c19792x256d27254.m76784x5db1b11() != 0) {
                            sb6 = new java.lang.StringBuilder("video_");
                            sb6.append(c19792x256d27254.m76784x5db1b11());
                        } else {
                            sb6 = new java.lang.StringBuilder("video_");
                            sb6.append(c19792x256d27254.m76803x6c285d75());
                        }
                        java.lang.String mediaId = sb6.toString();
                        jSONObject5.put("mediaId", mediaId);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
                        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(ll3.i1.f400715a.c(mediaId)).o();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                        jSONObject5.put("videoPath", o17);
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016663 = c19792x256d27254.m76802x2dd01666();
                        if (m76802x2dd016663 != null && (m76962x74cd162e = m76802x2dd016663.m76962x74cd162e()) != null && (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) != null) {
                            jSONObject5.put("video_url", c19788xd7cfd73e.m76625xb5887639() + c19788xd7cfd73e.m76628xfece4473());
                            jSONObject5.put("decodeKey", c19788xd7cfd73e.m76588x1e2296db());
                            jSONObject5.put("fileSize", c19788xd7cfd73e.m76591x50026913());
                            jSONObject5.put("width", java.lang.Float.valueOf(c19788xd7cfd73e.m76632x755bd410()));
                            jSONObject5.put("height", java.lang.Float.valueOf(c19788xd7cfd73e.m76605x1c4fb41d()));
                            jSONObject5.put("videoDuration", c19788xd7cfd73e.m76629x36bbd779());
                            jSONObject5.put("mediaType", c19788xd7cfd73e.m76613x7f025288());
                            jSONObject5.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, c19788xd7cfd73e.m76581x37b4b737());
                            jSONObject5.put("coverUrl", c19788xd7cfd73e.m76585x66e287ae());
                        }
                        jSONArray2.put(jSONObject5);
                        i49 = i57;
                        jSONObject4 = jSONObject6;
                    }
                    org.json.JSONObject jSONObject7 = jSONObject4;
                    java.util.Map k17 = kz5.c1.k(new jz5.l(5286, "NetSceneMusicMvCheckPermission"), new jz5.l(3710, "NetSceneMusicMvFinderLike"), new jz5.l(5904, "NetSceneMusicMvGetBeatTrack"), new jz5.l(6860, "NetSceneMusicMvGetRecommendList"), new jz5.l(3966, "NetSceneMusicMvGetFinderFavFeed"), new jz5.l(3763, "NetSceneMusicMvGetFinderFeedDetail"), new jz5.l(3965, "NetSceneMusicMvGetFinderLikeFeed"), new jz5.l(5292, "NetSceneMusicMvGetSongStatus"), new jz5.l(6820, "NetSceneMusicMvHeartbeat"), new jz5.l(6893, "NetSceneMusicMvJoin"), new jz5.l(6672, "NetSceneMusicMvPostLiveMsg"));
                    org.json.JSONObject jSONObject8 = new org.json.JSONObject();
                    for (java.util.Map.Entry entry : hm3.a.f363754h.entrySet()) {
                        java.lang.String str2 = (java.lang.String) k17.get(entry.getKey());
                        if (str2 == null) {
                            str2 = java.lang.String.valueOf(((java.lang.Number) entry.getKey()).intValue());
                        }
                        jSONObject8.put(str2, ((hm3.b) entry.getValue()).m133751x9616526c());
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) t0Var.m158354x19263085(), 0, false);
                    k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.o0(t0Var);
                    k0Var.f293407o = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.p0(t0Var);
                    k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q0(jSONObject, t0Var, jSONObject7, jSONArray, jSONArray2, jSONObject8);
                    k0Var.f293417v = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.r0(t0Var, jSONObject, jSONObject7, jSONArray, jSONArray2, jSONObject8);
                    k0Var.f293387d = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s0.f232945d;
                    k0Var.v();
                    java.lang.String str3 = t0Var.f232983d;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "MV START####################################################START");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "songInfoText: " + jSONObject);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "mvHeadInfoText: " + jSONObject7);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "mvTrackInfoText: " + jSONArray);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "mvRefObjInfoText: " + jSONArray2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "cgiInfo: " + jSONArray2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "MV END  ####################################################  END");
                }
                return;
            default:
                return;
        }
    }
}
