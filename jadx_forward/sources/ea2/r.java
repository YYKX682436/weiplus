package ea2;

/* loaded from: classes2.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 f332112d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 c13650x1bf60d72) {
        this.f332112d = c13650x1bf60d72;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View contentView;
        r45.hj2 hj2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initFav$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 c13650x1bf60d72 = this.f332112d;
        c13650x1bf60d72.f183293h = !c13650x1bf60d72.f183293h;
        c13650x1bf60d72.u7();
        r45.r03 r03Var = (r45.r03) c13650x1bf60d72.f534252d;
        if (r03Var != null && (hj2Var = (r45.hj2) r03Var.m75936x14adae67(19)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicTopicHeaderUIC", "handleClickFav: isLikeSong=" + c13650x1bf60d72.f183293h + ", listen_song_id=" + pm0.v.u(hj2Var.m75942xfb822ef2(11)) + ", hasCopyRight=" + c13650x1bf60d72.f7());
            android.app.Activity m80379x76847179 = c13650x1bf60d72.m80379x76847179();
            bw5.g80 g80Var = new bw5.g80();
            g80Var.f109256d = pm0.v.u(hj2Var.m75942xfb822ef2(11));
            boolean[] zArr = g80Var.f109273x;
            zArr[2] = true;
            bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
            g80Var.f109266q = 1604;
            zArr[12] = true;
            g80Var.f109258f = !c13650x1bf60d72.f183293h;
            zArr[3] = true;
            g80Var.f109260h = 2;
            zArr[6] = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) c13650x1bf60d72.c7().f384367e;
            g80Var.f109262m = abstractC14490x69736cb5 != null ? pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()) : "";
            zArr[8] = true;
            g80Var.f109265p = 3;
            zArr[11] = true;
            g80Var.f109259g = false;
            zArr[5] = true;
            ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Di(new qk.aa(m80379x76847179, g80Var, false, null, null, 28, null), null);
        }
        if (c13650x1bf60d72.f183293h) {
            boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.M5).mo141623x754a37bb()).r()).intValue() == 1;
            if (c13650x1bf60d72.f183303u == null) {
                c13650x1bf60d72.f183303u = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rf(c13650x1bf60d72.m158354x19263085(), new ea2.h0(c13650x1bf60d72, z17));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rf rfVar = c13650x1bf60d72.f183303u;
            if (rfVar != null) {
                if (z17) {
                    android.widget.TextView textView = (android.widget.TextView) rfVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.fth);
                    if (textView != null) {
                        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573479mr0);
                    }
                    android.widget.TextView textView2 = (android.widget.TextView) rfVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.ftg);
                    if (textView2 != null) {
                        textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ms_);
                    }
                    android.widget.TextView textView3 = (android.widget.TextView) rfVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.ftg);
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                } else if (c13650x1bf60d72.f7()) {
                    android.widget.TextView textView4 = (android.widget.TextView) rfVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.fth);
                    if (textView4 != null) {
                        textView4.setText(com.p314xaae8f345.mm.R.C30867xcad56011.eqc);
                    }
                    android.widget.TextView textView5 = (android.widget.TextView) rfVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.ftg);
                    if (textView5 != null) {
                        textView5.setVisibility(0);
                    }
                } else {
                    android.widget.TextView textView6 = (android.widget.TextView) rfVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.fth);
                    if (textView6 != null) {
                        textView6.setText(com.p314xaae8f345.mm.R.C30867xcad56011.lev);
                    }
                    android.widget.TextView textView7 = (android.widget.TextView) rfVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.ftg);
                    if (textView7 != null) {
                        textView7.setVisibility(8);
                    }
                }
                rfVar.dismiss();
                rfVar.f214490f = -c13650x1bf60d72.m158354x19263085().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
                android.widget.LinearLayout musicTopicHeaderFav = c13650x1bf60d72.d7().f516251g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(musicTopicHeaderFav, "musicTopicHeaderFav");
                if (!rfVar.f214489e) {
                    rfVar.getContentView().measure(0, 0);
                    rfVar.f214489e = true;
                }
                int height = musicTopicHeaderFav.getHeight();
                int width = musicTopicHeaderFav.getWidth();
                int[] iArr = new int[2];
                musicTopicHeaderFav.getLocationInWindow(iArr);
                int i17 = iArr[1] + height;
                int measuredWidth = ((iArr[0] + width) - rfVar.getContentView().getMeasuredWidth()) - rfVar.f214490f;
                rfVar.setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f576143rl);
                rfVar.showAtLocation(musicTopicHeaderFav, 0, measuredWidth, i17);
                long j17 = rfVar.f214488d;
                if (j17 > 0 && (contentView = rfVar.getContentView()) != null) {
                    contentView.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qf(rfVar.f214491g), j17);
                }
            }
        } else {
            java.lang.String string = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.M5).mo141623x754a37bb()).r()).intValue() == 1 ? c13650x1bf60d72.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mgf) : c13650x1bf60d72.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572824cn5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(string, null, c13650x1bf60d72.m158354x19263085(), null, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72.p7(this.f332112d, 106, null, null, 0, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        hc2.v0.d(view, "music_topic_page_like", "view_clk", false, c13650x1bf60d72.a7(), null, 20, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initFav$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
