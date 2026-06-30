package se2;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static org.p3363xbe4143f1.C29690xfae77312 f488429b;

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.mm.rfx.C20942x379cf5ee f488430c;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f488435h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f488436i;

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f488437j;

    /* renamed from: k, reason: collision with root package name */
    public static final jz5.g f488438k;

    /* renamed from: a, reason: collision with root package name */
    public static final se2.w f488428a = new se2.w();

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f488431d = jz5.h.b(se2.k.f488393d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f488432e = jz5.h.b(se2.v.f488427d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f488433f = jz5.h.b(se2.j.f488392d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f488434g = jz5.h.b(se2.u.f488426d);

    static {
        jz5.g b17 = jz5.h.b(se2.h.f488390d);
        f488435h = b17;
        f488436i = ((java.lang.Number) ((jz5.n) b17).mo141623x754a37bb()).intValue();
        f488437j = jz5.h.b(se2.f.f488388d);
        f488438k = jz5.h.b(se2.i.f488391d);
    }

    public static final boolean a(se2.w wVar, android.content.Context context, lm2.c cVar) {
        wVar.getClass();
        return (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar.c(), c01.z1.r()) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar.c(), xy2.c.e(context)) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar.c(), c01.z1.k())) ? false : true;
    }

    public final void b(android.content.Context context, gk2.e buContext, lm2.c msg) {
        km2.r rVar;
        km2.r rVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        r45.qt2 qt2Var = new r45.qt2();
        dk2.ef efVar = dk2.ef.f314905a;
        km2.n nVar = dk2.ef.H;
        qt2Var.set(7, java.lang.Integer.valueOf((nVar == null || (rVar2 = nVar.f390684c) == null) ? 0 : rVar2.f390739k));
        km2.n nVar2 = dk2.ef.H;
        qt2Var.set(5, java.lang.Integer.valueOf((nVar2 == null || (rVar = nVar2.f390684c) == null) ? 0 : rVar.f390739k));
        ke2.p0 p0Var = ke2.q0.f388514w;
        long e17 = msg.e();
        java.lang.String a17 = msg.a();
        r45.qm1 qm1Var = new r45.qm1();
        int i17 = qs5.v.f448005a;
        qm1Var.set(0, 1);
        qm1Var.set(1, a17);
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(3, java.lang.Long.valueOf(e17));
        ch1Var.set(1, 20008);
        r45.ci1 ci1Var = new r45.ci1();
        ci1Var.set(0, qm1Var);
        ch1Var.set(4, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(ci1Var.mo14344x5f01b1f6()));
        ch1Var.set(2, zl2.q4.f555466a.m());
        new ke2.q0(ch1Var, buContext, qt2Var, null).l();
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.daj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        db5.t7.f(context, string, se2.l.f488394a);
    }

    public final java.lang.String c(java.lang.String usernameTag, java.lang.String content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usernameTag, "usernameTag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        java.lang.String str = " " + usernameTag + content;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
        return str;
    }

    public final boolean d(java.lang.String tag, gk2.e buContext, lm2.c msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        boolean a17 = se2.e.f488380a.a(msg);
        if (!a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(tag, "dislike failed,msg " + msg.h() + " seq:" + msg.e() + ",canLike:" + a17);
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.x xVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.x.f197275a;
        r45.ch1 ch1Var = msg.f400905e;
        int i17 = msg.f400906f;
        int i18 = qs5.u.f448004a;
        r45.ch1 b17 = xVar.b(ch1Var, i17, 2);
        zl2.r4.f555483a.M2(tag, "boxCommentLikeTrack dislike msg seq:" + msg.e() + ",likeCount:" + msg.f400906f);
        if (b17 != null) {
            ((mm2.e0) buContext.a(mm2.e0.class)).R6(tag, b17);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(tag, "dislike failed, boxId is null");
        return false;
    }

    public final int e() {
        return ((java.lang.Number) ((jz5.n) f488431d).mo141623x754a37bb()).intValue();
    }

    public final java.lang.String f(android.content.Context context, android.text.TextPaint paint, lm2.c feed) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.x xVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.x.f197275a;
        java.lang.String a17 = feed.a();
        java.lang.String c17 = feed.c();
        java.lang.String b17 = feed.b();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        java.lang.String e17 = xVar.e(a17, c17, b17, false);
        android.content.res.Resources resources = context.getResources();
        i95.m c18 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        java.lang.String string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gc8, c61.yb.nf((c61.yb) c18, context, paint, e17, 0, 8, null));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    public final void g(android.content.Context context, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", username);
        j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }

    public final boolean h(java.lang.String tag, gk2.e buContext, lm2.c msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        boolean a17 = se2.e.f488380a.a(msg);
        if (!a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(tag, "like failed,msg " + msg.h() + " seq:" + msg.e() + ",canLike:" + a17);
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.x xVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.x.f197275a;
        r45.ch1 ch1Var = msg.f400905e;
        int i17 = msg.f400906f;
        int i18 = qs5.u.f448004a;
        r45.ch1 b17 = xVar.b(ch1Var, i17, 1);
        zl2.r4 r4Var = zl2.r4.f555483a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("boxCommentLikeTrack like msg seq:");
        sb6.append(msg.e());
        sb6.append(",localClientMsgId:");
        java.lang.String m75945x2fec8307 = msg.f400905e.m75945x2fec8307(14);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        sb6.append(m75945x2fec8307);
        sb6.append(",likeCount:");
        sb6.append(msg.f400906f);
        r4Var.M2(tag, sb6.toString());
        if (b17 != null) {
            ((mm2.e0) buContext.a(mm2.e0.class)).R6(tag, b17);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(tag, "like failed, boxId is null");
        return false;
    }

    public final void i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14369xe0f0e9a5 contentTv, java.lang.String username, int i17, int i18, int i19, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 userMessage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentTv, "contentTv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userMessage, "userMessage");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.z zVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.z(username);
        zVar.setCallback(contentTv);
        zVar.setBounds(0, 0, i19, i19);
        int i27 = gm2.m.f354962e;
        gm2.l lVar = new gm2.l(null, 0, 0, 7, null);
        lVar.f354957a = zVar;
        lVar.f354959c = gm2.c1.f354853a.k();
        android.graphics.drawable.BitmapDrawable bitmapDrawable = lVar.f354957a;
        jz5.f0 f0Var = null;
        gm2.m mVar = bitmapDrawable != null ? new gm2.m(bitmapDrawable) : null;
        if (mVar != null) {
            mVar.f354963d = lVar;
        }
        if (mVar != null) {
            userMessage.c(mVar, i17, i18, 33);
            contentTv.m57546xab957da4(username);
            contentTv.b(userMessage);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveGroupCommentHelper", "loadWxAvatar err create drawable fail!");
        }
    }

    public final boolean j(in5.s0 holder, lm2.c item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean z18 = false;
        if (!(list == null || list.isEmpty())) {
            for (java.lang.Object obj : list) {
                if (obj instanceof java.lang.Integer) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 101)) {
                        f488428a.r(holder, item, (java.lang.Integer) obj);
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 102)) {
                    }
                    z18 = true;
                }
            }
        }
        return z18;
    }

    public final void k(p3325xe03a0797.p3326xc267989b.y0 y0Var, dk2.zf msg, android.view.View view, gk2.e buContext, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        mm2.j2 j2Var = (mm2.j2) buContext.a(mm2.j2.class);
        java.lang.String f17 = msg.f();
        if (f17 == null) {
            f17 = "";
        }
        j2Var.a7(new jz5.l(f17, 1));
        l(y0Var, msg, view, buContext, context, true);
    }

    public final void l(p3325xe03a0797.p3326xc267989b.y0 y0Var, dk2.zf msg, android.view.View view, gk2.e buContext, android.content.Context context, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!(msg instanceof dk2.cg)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGroupCommentHelper", "processCommentLikeAction seq:" + msg.m() + " localClientMsgId:" + msg.f());
            return;
        }
        dk2.cg cgVar = (dk2.cg) msg;
        boolean o17 = cgVar.o();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.x xVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.x.f197275a;
        if (!o17) {
            if (!z17) {
                xVar.i(msg, true, buContext, context);
                return;
            }
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.c7g);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            t(y0Var, findViewById, new se2.n(msg, buContext, context));
            return;
        }
        xVar.i(msg, false, buContext, context);
        boolean o18 = cgVar.o();
        int s17 = cgVar.s();
        zl2.r4.f555483a.M2("FinderLiveGroupCommentHelper", "live CommentLikeTrack: setLike isLike:" + o18 + ",likeCnt:" + s17);
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.c7g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        m(findViewById2, o18, s17, null);
    }

    public final void m(android.view.View likeRoot, boolean z17, int i17, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(likeRoot, "likeRoot");
        android.view.View findViewById = likeRoot.findViewById(com.p314xaae8f345.mm.R.id.c7d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById;
        android.view.View findViewById2 = likeRoot.findViewById(com.p314xaae8f345.mm.R.id.c7f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById2;
        android.view.View findViewById3 = likeRoot.findViewById(com.p314xaae8f345.mm.R.id.c7e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        textView.setText(i17 <= 0 ? "" : java.lang.String.valueOf(i17));
        int i18 = mm2.e0.f410498v;
        int i19 = 4;
        if (i17 <= i18) {
            if (i18 > 1) {
                zl2.r4 r4Var = zl2.r4.f555483a;
                android.content.Context context = likeRoot.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                r4Var.f3(context, "(DEBUG)赞数达到" + mm2.e0.f410498v + "个才展示");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(likeRoot, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper", "processLikeInternal", "(Landroid/view/View;ZILjava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            likeRoot.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(likeRoot, "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper", "processLikeInternal", "(Landroid/view/View;ZILjava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 > 0) {
            if (z17) {
                textView.setTextColor(likeRoot.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560581oc));
                c22699x3dcdb352.m82040x7541828(likeRoot.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560581oc));
            } else {
                textView.setTextColor(likeRoot.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
                c22699x3dcdb352.m82040x7541828(likeRoot.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
            }
            if (!c22789xd23e9a9b.f()) {
                c22699x3dcdb352.setVisibility(0);
                c22789xd23e9a9b.setVisibility(8);
            } else if (num == null) {
                c22789xd23e9a9b.n();
            }
            i19 = 0;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(likeRoot, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper", "processLikeInternal", "(Landroid/view/View;ZILjava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        likeRoot.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(likeRoot, "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper", "processLikeInternal", "(Landroid/view/View;ZILjava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final boolean n(bm2.h1 holder, dk2.zf msg, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        boolean z17 = false;
        if (!(list == null || list.isEmpty())) {
            for (java.lang.Object obj : list) {
                if ((obj instanceof java.lang.Integer) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 1)) {
                    dk2.cg cgVar = msg instanceof dk2.cg ? (dk2.cg) msg : null;
                    if (cgVar != null) {
                        f488428a.s(holder, cgVar, (java.lang.Integer) obj);
                    }
                    z17 = true;
                }
            }
        }
        return z17;
    }

    public final void o(java.lang.String tag, in5.s0 holder, boolean z17, lm2.c msg, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (holder.o().getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb) {
            view.setOnClickListener(new se2.o(tag, msg, holder, z17));
        }
    }

    public final void p(java.lang.String tag, in5.s0 holder, lm2.c msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.c7g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        if (holder.o().getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb) {
            p17.setOnClickListener(new se2.q(holder, msg, tag, p17));
        }
    }

    public final void q(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 contentTv) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentTv, "contentTv");
        contentTv.m84176x8e6ff544(contentTv.getContext().getResources().getConfiguration().orientation == 2 ? ((java.lang.Number) ((jz5.n) f488437j).mo141623x754a37bb()).intValue() : ((java.lang.Number) ((jz5.n) f488438k).mo141623x754a37bb()).intValue());
    }

    public final void r(in5.s0 holder, lm2.c item, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean z17 = item.f400907g;
        int i17 = item.f400906f;
        zl2.r4.f555483a.M2("FinderLiveGroupCommentHelper", "boxCommentLikeTrack content:" + item.j() + " seq:" + item.e() + " setBoxLike isLike:" + z17 + ",likeCnt:" + i17 + ",textHeight:0");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.c7g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        m(p17, z17, i17, num);
    }

    public final void s(bm2.h1 holder, dk2.cg msg, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        boolean o17 = msg.o();
        int s17 = msg.s();
        zl2.r4.f555483a.M2("FinderLiveGroupCommentHelper", "live CommentLikeTrack: setLike isLike:" + o17 + ",likeCnt:" + s17);
        m(holder.f103464i, o17, s17, num);
    }

    public final void t(p3325xe03a0797.p3326xc267989b.y0 y0Var, android.view.View likeRoot, yz5.a postLikeCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(likeRoot, "likeRoot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postLikeCallback, "postLikeCallback");
        android.view.View findViewById = likeRoot.findViewById(com.p314xaae8f345.mm.R.id.c7d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById;
        android.view.View findViewById2 = likeRoot.findViewById(com.p314xaae8f345.mm.R.id.c7f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById2;
        android.view.View findViewById3 = likeRoot.findViewById(com.p314xaae8f345.mm.R.id.c7e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        if (y0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGroupCommentHelper", "showLikeAnimAndPostLike scope is null");
        }
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new se2.t(likeRoot, c22699x3dcdb352, c22789xd23e9a9b, textView, postLikeCallback, null), 2, null);
        }
    }
}
