package ea2;

/* loaded from: classes2.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 f332116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.zi2 f332117e;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 c13650x1bf60d72, r45.zi2 zi2Var) {
        this.f332116d = c13650x1bf60d72;
        this.f332117e = zi2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.hj2 hj2Var;
        r45.zi2 zi2Var;
        r45.hj2 hj2Var2;
        r45.zi2 zi2Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initMusic$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 c13650x1bf60d72 = this.f332116d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72.p7(c13650x1bf60d72, 103, kz5.b1.e(new jz5.l("play_state", java.lang.Integer.valueOf(c13650x1bf60d72.k7() ? 1 : 0))), null, 0, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        hc2.v0.d(view, "musician_play", "view_clk", false, c13650x1bf60d72.a7(), null, 20, null);
        if (c13650x1bf60d72.f183294i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicTopicHeaderUIC", "click song cover, switch on, playFeedVideoBgm");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72.V6(c13650x1bf60d72);
        } else if (c13650x1bf60d72.f7()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click song cover, switch off, playMusicWithTing, hasCopyright = ");
            sb6.append(c13650x1bf60d72.f7());
            sb6.append(", mediaStreamingUrl = ");
            r45.r03 r03Var = (r45.r03) c13650x1bf60d72.f534252d;
            sb6.append((r03Var == null || (hj2Var2 = (r45.hj2) r03Var.m75936x14adae67(19)) == null || (zi2Var2 = (r45.zi2) hj2Var2.m75936x14adae67(3)) == null) ? null : zi2Var2.m75945x2fec8307(5));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicTopicHeaderUIC", sb6.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicTopicHeaderUIC", "playMusicWithTing");
            r45.r03 r03Var2 = (r45.r03) c13650x1bf60d72.f534252d;
            if (r03Var2 != null && (hj2Var = (r45.hj2) r03Var2.m75936x14adae67(19)) != null && (zi2Var = (r45.zi2) hj2Var.m75936x14adae67(3)) != null) {
                boolean i76 = c13650x1bf60d72.i7();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.cd0 cd0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.cd0.f208113a;
                if (i76) {
                    cd0Var.a("", c13650x1bf60d72.f7());
                } else {
                    if (c13650x1bf60d72.k7()) {
                        c13650x1bf60d72.m7();
                    }
                    c13650x1bf60d72.s7(zi2Var);
                    android.app.Activity context = c13650x1bf60d72.m80379x76847179();
                    boolean f76 = c13650x1bf60d72.f7();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    java.lang.String m75945x2fec8307 = zi2Var.m75945x2fec8307(0);
                    java.lang.String str = m75945x2fec8307 == null ? "" : m75945x2fec8307;
                    r45.xs4 xs4Var = new r45.xs4();
                    xs4Var.set(4, zi2Var.m75945x2fec8307(3));
                    xs4Var.set(5, zi2Var.m75945x2fec8307(4));
                    xs4Var.set(10, java.lang.Integer.valueOf(zi2Var.m75939xb282bd08(9)));
                    xs4Var.set(14, zi2Var.m75945x2fec8307(2));
                    xs4Var.set(16, zi2Var.m75945x2fec8307(1));
                    xs4Var.set(13, zi2Var.m75945x2fec8307(1));
                    xs4Var.set(2, zi2Var.m75945x2fec8307(1));
                    java.lang.String m75945x2fec83072 = zi2Var.m75945x2fec8307(0);
                    xs4Var.set(11, m75945x2fec83072 != null ? m75945x2fec83072 : "");
                    pf5.z zVar = pf5.z.f435481a;
                    if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.d6) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.d6.class)).f205146f = false;
                    ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().X(false);
                    cd0Var.g(context, zi2Var, str, 0, xs4Var, f76, bw5.ar0.TingScene_FinderMusicEvent);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicTopicHeaderUIC", "click song cover, switch off, playFeedVideoBgm");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72.V6(c13650x1bf60d72);
        }
        if (this.f332117e != null) {
            fa2.a aVar = fa2.a.f342239a;
            android.app.Activity m80379x76847179 = c13650x1bf60d72.m80379x76847179();
            r45.r03 r03Var3 = (r45.r03) c13650x1bf60d72.f534252d;
            fa2.a.a(aVar, m80379x76847179, "music_play", 1, 0, r03Var3 != null ? (r45.hj2) r03Var3.m75936x14adae67(19) : null, null, 40, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initMusic$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
