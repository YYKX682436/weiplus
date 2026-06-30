package ea2;

/* loaded from: classes2.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 f332114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f332115e;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 c13650x1bf60d72, p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787) {
        this.f332114d = c13650x1bf60d72;
        this.f332115e = c1073x7e08a787;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        r45.hj2 hj2Var;
        r45.hj2 hj2Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initMusic$2$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 c13650x1bf60d72 = this.f332114d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = c13650x1bf60d72.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        if (nyVar == null || (str = nyVar.f216915p) == null) {
            str = "";
        }
        java.lang.String str2 = str + '_' + java.lang.System.currentTimeMillis();
        r45.r03 r03Var = (r45.r03) c13650x1bf60d72.f534252d;
        if (r03Var != null && (hj2Var2 = (r45.hj2) r03Var.m75936x14adae67(19)) != null) {
            c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) hj2Var2.m75936x14adae67(16);
        }
        if (c19786x6a1e2862 != null) {
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 clListenCompleteSong = c13650x1bf60d72.d7().f516247c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(clListenCompleteSong, "clListenCompleteSong");
            hc2.v0.d(clListenCompleteSong, "listen_whole_song_qq", "view_clk", false, c13650x1bf60d72.b7(str2), null, 20, null);
        } else {
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 clListenCompleteSong2 = c13650x1bf60d72.d7().f516247c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(clListenCompleteSong2, "clListenCompleteSong");
            hc2.v0.d(clListenCompleteSong2, "listen_whole_song", "view_clk", false, c13650x1bf60d72.a7(), null, 20, null);
        }
        r45.r03 r03Var2 = (r45.r03) c13650x1bf60d72.f534252d;
        if (r03Var2 != null && (hj2Var = (r45.hj2) r03Var2.m75936x14adae67(19)) != null) {
            if (c13650x1bf60d72.k7()) {
                c13650x1bf60d72.m7();
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) hj2Var.m75936x14adae67(16);
            if (c19786x6a1e28622 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicTopicHeaderUIC", "click listen complete song, switch on, go listen_whole_music_jump_info");
                r45.k74 m76504xa819f0c7 = c19786x6a1e28622.m76504xa819f0c7();
                if (m76504xa819f0c7 != null) {
                    m76504xa819f0c7.set(2, xc2.r0.a(m76504xa819f0c7.m75945x2fec8307(2), kz5.c1.k(new jz5.l("from_scene", 1), new jz5.l("jumper_click_sessionid", str2))));
                }
                xc2.y2.i(xc2.y2.f534876a, c13650x1bf60d72.m158354x19263085(), new xc2.p0(c19786x6a1e28622), 0, null, 12, null);
            } else {
                r45.zi2 zi2Var = (r45.zi2) hj2Var.m75936x14adae67(3);
                if (zi2Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicTopicHeaderUIC", "click listen complete song, switch on, goToTingPage");
                    c13650x1bf60d72.s7(zi2Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.cd0 cd0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.cd0.f208113a;
                    android.content.Context context2 = this.f332115e.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                    java.lang.String m75945x2fec8307 = zi2Var.m75945x2fec8307(0);
                    java.lang.String str3 = m75945x2fec8307 != null ? m75945x2fec8307 : "";
                    bw5.ar0 ar0Var = bw5.ar0.TingScene_FinderMusicEvent;
                    bw5.lp0 c17 = cd0Var.c(zi2Var, str3);
                    qk.f9.b(((rk4.z8) cd0Var.e()).aj(), context2, true, c17, new il4.e(null, 0, 1604, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554419, null), null, null, ar0Var, null, 176, null);
                    ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ri(c17, ar0Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k0.f206625a.a(context2, "Ting");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initMusic$2$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
