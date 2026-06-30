package ro2;

/* loaded from: classes2.dex */
public abstract class r {
    /* JADX WARN: Code restructure failed: missing block: B:103:0x020a, code lost:
    
        if ((r3 != null && r3.f491888f == r8) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01f9, code lost:
    
        if (r2 < r8) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x020c, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe r20, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r21, int r22, java.lang.String r23, r45.zu0 r24) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ro2.r.a(com.tencent.mm.plugin.finder.convert.qe, com.tencent.mm.plugin.finder.model.BaseFinderFeed, int, java.lang.String, r45.zu0):boolean");
    }

    public static final java.util.Map b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qeVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        java.lang.String ek6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(item.getFeedObject().m59251x5db1b11(), item.w(), V6 != null ? V6.m75939xb282bd08(5) : 0);
        so2.g mileStoneShowInfo = item.getMileStoneShowInfo();
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("session_buffer", ek6);
        lVarArr[1] = new jz5.l("feed_id", pm0.v.u(item.getFeedObject().m59251x5db1b11()));
        lVarArr[2] = new jz5.l("author_finder_username", item.getFeedObject().m59299x6bf53a6c());
        lVarArr[3] = new jz5.l("poster_type", mileStoneShowInfo != null ? java.lang.Integer.valueOf(mileStoneShowInfo.f491884b) : null);
        lVarArr[4] = new jz5.l("poster_num", mileStoneShowInfo != null ? java.lang.Integer.valueOf(mileStoneShowInfo.f491885c) : null);
        return kz5.c1.k(lVarArr);
    }

    public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, in5.s0 holder) {
        so2.g mileStoneShowInfo;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qeVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) holder.f374658i;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.g4y);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15326x96ed1d6f c15326x96ed1d6f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15326x96ed1d6f) holder.p(com.p314xaae8f345.mm.R.id.trt);
        if (c15326x96ed1d6f != null && c15326x96ed1d6f.getVisibility() == 0) {
            if (c15326x96ed1d6f != null) {
                android.animation.AnimatorSet animatorSet = c15326x96ed1d6f.f212849w;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                c15326x96ed1d6f.f212849w = null;
            }
            if (c15326x96ed1d6f != null) {
                c15326x96ed1d6f.setVisibility(8);
            }
            if (c15326x96ed1d6f != null) {
                c15326x96ed1d6f.c();
            }
            qeVar.K1(findViewById, 8);
            android.view.View view = holder.f3639x46306858;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 c15379x1d4ea971 = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971) view : null;
            if (c15379x1d4ea971 != null) {
                c15379x1d4ea971.a(false, "Finder.FeedFullConvert");
            }
        }
        so2.g mileStoneShowInfo2 = abstractC14490x69736cb5.getMileStoneShowInfo();
        if ((mileStoneShowInfo2 != null ? mileStoneShowInfo2.f491883a : null) == so2.h.f491904e && (mileStoneShowInfo = abstractC14490x69736cb5.getMileStoneShowInfo()) != null) {
            mileStoneShowInfo.f491883a = so2.h.f491905f;
        }
        g(holder);
    }

    public static final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, in5.s0 holder, android.view.View btnIv, android.view.View view, int i17, int i18, boolean z17) {
        android.view.ViewGroup.LayoutParams layoutParams;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qeVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(btnIv, "btnIv");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) holder.f374658i;
        android.view.View view2 = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2;
        android.content.Context context = viewGroup.getContext();
        abstractC14490x69736cb5.w1(new so2.g(so2.h.f491904e, i17, i18, java.lang.System.currentTimeMillis(), false, i18, 16, null));
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        java.lang.String username = abstractC14490x69736cb5.getFeedObject().m59299x6bf53a6c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        dq.b bVar = ((cq.k) c17).f302759g;
        bVar.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = bVar.f323819c;
        if (o4Var != null) {
            java.lang.String concat = "KEY_FINDER_INTERACTION_MILE_STONE_POINT_PREFIX_".concat(username);
            if (o4Var.T(concat, java.lang.Integer.valueOf(i18))) {
                if (o4Var.U()) {
                    java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = o4Var.f274434g;
                    readLock.lock();
                    o4Var.c(o4Var.f274432e);
                    o4Var.f274431d.m84106xc5c55e60(concat, i18, 1296000);
                    readLock.unlock();
                } else {
                    o4Var.f274431d.m84106xc5c55e60(concat, i18, 1296000);
                }
            }
        }
        boolean z18 = i17 == 1;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.setId(com.p314xaae8f345.mm.R.id.trk);
        if (viewGroup instanceof android.widget.RelativeLayout) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(13);
            layoutParams = layoutParams2;
        } else {
            android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            layoutParams = layoutParams3;
        }
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setVisibility(8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(context);
        c22789xd23e9a9b.setId(com.p314xaae8f345.mm.R.id.trj);
        int dimension = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561208cc);
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(dimension, dimension);
        layoutParams4.gravity = 17;
        c22789xd23e9a9b.setLayoutParams(layoutParams4);
        c22789xd23e9a9b.m82583xcde73672(1);
        c22789xd23e9a9b.m82582x3ae760af(0.0d);
        java.lang.String str = z18 ? "finder_mile_stone_like_animate.pag" : "finder_mile_stone_fav_animate.pag";
        if (c22789xd23e9a9b.getUseRfx()) {
            c22789xd23e9a9b.mo82566x3e3ac3e8(com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77390x243906(context.getAssets(), str));
        } else {
            c22789xd23e9a9b.mo82568x3e3ac3e8(org.p3363xbe4143f1.C29690xfae77312.m154715x243906(context.getAssets(), str));
        }
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        android.widget.FrameLayout.LayoutParams layoutParams5 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 81;
        linearLayout.setLayoutParams(layoutParams5);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        int dimension2 = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
        linearLayout.setPadding(dimension2, 0, dimension2, 0);
        int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77909xe61cad90);
        float h17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561207cb);
        int color2 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
        int i19 = z18 ? com.p314xaae8f345.mm.R.raw.f79472xe7e9e18e : com.p314xaae8f345.mm.R.raw.f81191xe57d3dfe;
        int h18 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ohi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        textView.setTextSize(0, h17);
        textView.setTextColor(color2);
        textView.setShadowLayer(20.0f, 0.0f, 8.0f, color);
        textView.setLineSpacing(i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn), 1.0f);
        android.content.Context context2 = textView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        textView.setText(hc2.x0.k(string, context2, '#', i19, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an, h18, h18, 0, 0, 2, 192, null));
        android.widget.TextView textView2 = new android.widget.TextView(context);
        textView2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -2, 1.0f));
        ya2.b2 contact = abstractC14490x69736cb5.getContact();
        textView2.setText(contact != null ? contact.w0() : "");
        textView2.setTextSize(0, h17);
        textView2.setTextColor(color2);
        textView2.setShadowLayer(20.0f, 0.0f, 8.0f, color);
        textView2.setLineSpacing(i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn), 1.0f);
        textView2.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView2.setMaxLines(1);
        android.widget.TextView textView3 = new android.widget.TextView(context);
        android.widget.LinearLayout.LayoutParams layoutParams6 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj);
        textView3.setLayoutParams(layoutParams6);
        textView3.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.olx, java.lang.Integer.valueOf(i18)));
        textView3.setTextSize(0, h17);
        textView3.setTextColor(color2);
        textView3.setShadowLayer(20.0f, 0.0f, 8.0f, color);
        textView3.setLineSpacing(i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn), 1.0f);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(textView3);
        frameLayout.addView(c22789xd23e9a9b);
        frameLayout.addView(linearLayout);
        viewGroup.addView(frameLayout);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.g4y);
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(findViewById, "alpha", 1.0f).setDuration(200L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration, "setDuration(...)");
        android.animation.ObjectAnimator duration2 = android.animation.ObjectAnimator.ofFloat(frameLayout, "alpha", 1.0f).setDuration(200L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration2, "setDuration(...)");
        animatorSet.addListener(new ro2.a(qeVar, findViewById, holder, frameLayout, qeVar, findViewById, c22789xd23e9a9b, z18, btnIv, view));
        c22789xd23e9a9b.a(new ro2.b(qeVar, findViewById, holder, i17, i18, z17));
        animatorSet.playTogether(duration, duration2);
        frameLayout.post(new ro2.d(qeVar, animatorSet));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15326x96ed1d6f c15326x96ed1d6f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15326x96ed1d6f) holder.p(com.p314xaae8f345.mm.R.id.trt);
        if (c15326x96ed1d6f == null) {
            android.view.ViewStub viewStub = (android.view.ViewStub) holder.p(com.p314xaae8f345.mm.R.id.tfo);
            android.view.View inflate = viewStub != null ? viewStub.inflate() : null;
            c15326x96ed1d6f = inflate instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15326x96ed1d6f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15326x96ed1d6f) inflate : null;
        }
        if (c15326x96ed1d6f != null) {
            c15326x96ed1d6f.setVisibility(8);
        }
        if (c15326x96ed1d6f != null) {
            android.widget.ImageView mileStoneLeftAvatar = c15326x96ed1d6f.getMileStoneLeftAvatar();
            android.widget.ImageView mileStoneRightAvatar = c15326x96ed1d6f.getMileStoneRightAvatar();
            ng5.a.a(mileStoneLeftAvatar, c01.z1.r());
            java.lang.String n17 = abstractC14490x69736cb5.n();
            if (n17 == null) {
                n17 = "";
            }
            boolean f17 = ya2.d.f(abstractC14490x69736cb5.getContact());
            mn2.g1 g1Var = mn2.g1.f411508a;
            if (f17) {
                g1Var.a().c(new mn2.n("", null, 2, null), mileStoneRightAvatar, g1Var.h(mn2.f1.f411490h));
            } else {
                g1Var.a().c(new mn2.n(n17, null, 2, null), mileStoneRightAvatar, g1Var.h(mn2.f1.f411490h));
            }
        }
    }

    public static final void e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qeVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209130a6).mo141623x754a37bb()).r()).booleanValue()) {
            so2.g mileStoneShowInfo = item.getMileStoneShowInfo();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (mileStoneShowInfo == null || mileStoneShowInfo.f491883a != so2.h.f491904e || currentTimeMillis - mileStoneShowInfo.f491886d >= 60000 || mileStoneShowInfo.f491887e) {
                c(qeVar, holder);
            } else {
                mileStoneShowInfo.f491887e = true;
                i(qeVar, holder, mileStoneShowInfo.f491884b, mileStoneShowInfo.f491885c, false, true);
            }
        }
    }

    public static final void f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qeVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15326x96ed1d6f c15326x96ed1d6f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15326x96ed1d6f) holder.p(com.p314xaae8f345.mm.R.id.trt);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) holder.f374658i;
        android.content.Context context = holder.f374654e;
        if (c15326x96ed1d6f != null) {
            ro2.e eVar = new ro2.e(c15326x96ed1d6f, qeVar, context, abstractC14490x69736cb5);
            c15326x96ed1d6f.mileStoneScreenShotCallback = eVar;
            i95.m c17 = i95.n0.c(ct.d3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            android.content.Context context2 = c15326x96ed1d6f.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) c17)).wi(context2, eVar);
            ro2.f fVar = new ro2.f(context, c15326x96ed1d6f, qeVar, holder, abstractC14490x69736cb5);
            c15326x96ed1d6f.mileStoneOnBackPressedCallback = fVar;
            android.content.Context context3 = c15326x96ed1d6f.getContext();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context3 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context3 : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                abstractActivityC21394xb3d2c0cf.m78487x199f61f0(fVar);
            }
            ro2.g gVar = new ro2.g(qeVar, context, abstractC14490x69736cb5);
            c15326x96ed1d6f.mileStoneAppForegroundListener = gVar;
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4679x33de8120.f19966x4fbc8495.mo40973x40b15f2e(gVar);
        }
    }

    public static final void g(in5.s0 s0Var) {
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.trk);
        if (p17 != null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) s0Var.p(com.p314xaae8f345.mm.R.id.trj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/milestone/FinderFeedFullConvert_FinderMileStoneKt", "removeMileStonePag", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/milestone/FinderFeedFullConvert_FinderMileStoneKt", "removeMileStonePag", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (c22789xd23e9a9b != null) {
                c22789xd23e9a9b.n();
            }
            p17.post(new ro2.h(p17));
        }
    }

    public static final void h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, ro2.t type, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qeVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.util.Map t17 = kz5.c1.t(b(qeVar, context, item));
        t17.put("poster_unexp_type", java.lang.Integer.valueOf(type.f479634d));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a.h(context, "finder_poster", "view_unexp", false, t17);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe r39, in5.s0 r40, int r41, int r42, boolean r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ro2.r.i(com.tencent.mm.plugin.finder.convert.qe, in5.s0, int, int, boolean, boolean):void");
    }
}
