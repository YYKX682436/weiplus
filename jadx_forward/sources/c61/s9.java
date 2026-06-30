package c61;

@j95.b
/* loaded from: classes3.dex */
public final class s9 extends i95.w implements c50.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f120827d = new java.util.HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r4 < 1.3166667f) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jz5.o Ai(android.content.Context r4, int r5, int r6) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto Lf
            android.app.Activity r4 = (android.app.Activity) r4
            android.content.Context r4 = r4.getBaseContext()
        Lf:
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.heightPixels
            if (r0 <= r4) goto L26
            r0 = r4
        L26:
            float r4 = (float) r6
            r1 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 * r1
            float r2 = (float) r5
            float r4 = r4 / r2
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER_CROP
            int r2 = r2.ordinal()
            int r5 = r5 - r6
            int r5 = java.lang.Math.abs(r5)
            r6 = 10
            if (r5 > r6) goto L3d
            r4 = r0
            goto L54
        L3d:
            r5 = 1058013184(0x3f100000, float:0.5625)
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 >= 0) goto L45
        L43:
            r4 = r5
            goto L51
        L45:
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 >= 0) goto L4a
            goto L51
        L4a:
            r5 = 1068009609(0x3fa88889, float:1.3166667)
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 >= 0) goto L43
        L51:
            float r5 = (float) r0
            float r5 = r5 * r4
            int r4 = (int) r5
        L54:
            jz5.o r5 = new jz5.o
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.<init>(r6, r0, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.s9.Ai(android.content.Context, int, int):jz5.o");
    }

    public final void Bi(ug5.v vVar, boolean z17) {
        ug5.g gVar = vVar.f509191a;
        float f17 = (gVar.A * 1000.0f) / ((float) gVar.f509135p);
        android.view.Window window = gVar.f509121b;
        int a17 = window != null ? ug5.x.a(window) : 0;
        ug5.b action = vVar.f509191a.f509120a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        if (ug5.b.f509115e == action) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentReporter", "return for exit");
            ez2.g.f339435a = null;
        } else {
            ez2.e eVar = ez2.g.f339435a;
            if (eVar != null) {
                eVar.h(z17, f17, a17);
            }
        }
        vVar.b(false);
    }

    public void Di(android.content.Intent intent, long j17, android.view.View view, android.widget.ImageView thumbView, ez2.a scene, yz5.l onAnimationEndCallback) {
        yz5.l lVar;
        android.graphics.Rect rect;
        int intValue;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e first;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e first2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbView, "thumbView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        boolean Ui = Ui();
        android.view.KeyEvent.Callback findViewWithTag = view.findViewWithTag("sns_video_preview_view_tag");
        zy2.g5 g5Var = findViewWithTag instanceof zy2.g5 ? (zy2.g5) findViewWithTag : null;
        if (g5Var == null) {
            android.view.KeyEvent.Callback findViewWithTag2 = view.findViewWithTag("nearby-video-preview-view-tag");
            g5Var = findViewWithTag2 instanceof zy2.g5 ? (zy2.g5) findViewWithTag2 : null;
        }
        boolean z17 = g5Var != null && g5Var.mo58787xc00617a4();
        boolean z18 = g5Var != null && g5Var.getE();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 ml6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ml(j17, "", 38, false, false, "", null);
        if (!Ui || !z17 || !z18 || ml6 == null) {
            onAnimationEndCallback.mo146xb9724478(java.lang.Boolean.FALSE);
            zy2.p7 p7Var = g5Var instanceof zy2.p7 ? (zy2.p7) g5Var : null;
            if (p7Var == null || (lVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15176x3a5a59de) p7Var).f212072w2) == null) {
                return;
            }
            lVar.mo146xb9724478(-1);
            return;
        }
        android.graphics.Rect c17 = ug5.x.c(view, false, 1, null);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = ml6.m76802x2dd01666();
        int m76632x755bd410 = (m76802x2dd01666 == null || (m76962x74cd162e2 = m76802x2dd01666.m76962x74cd162e()) == null || (first2 = m76962x74cd162e2.getFirst()) == null) ? 0 : (int) first2.m76632x755bd410();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = ml6.m76802x2dd01666();
        int m76605x1c4fb41d = (m76802x2dd016662 == null || (m76962x74cd162e = m76802x2dd016662.m76962x74cd162e()) == null || (first = m76962x74cd162e.getFirst()) == null) ? 0 : (int) first.m76605x1c4fb41d();
        i95.m c18 = i95.n0.c(zy2.b6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        float h37 = zy2.b6.h3((zy2.b6) c18, "fluentEnterVideo", ml6, false, 4, null);
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i17 = b17.x;
        int i18 = b17.y;
        java.lang.System.nanoTime();
        boolean z19 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!z19) {
            if (i18 >= i17) {
                i17 = i18;
            }
            i18 = i17;
        }
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        int c19 = i18 - com.p314xaae8f345.mm.ui.bl.c((android.app.Activity) context);
        i95.m c27 = i95.n0.c(zy2.b6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
        android.content.Context context2 = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
        jz5.l a17 = hc2.f1.a((android.app.Activity) context2, h37, c19, "fluentEnterVideo", j17, 0, 0, 32, null);
        jz5.o oVar = (jz5.o) a17.f384366d;
        int intValue2 = ((java.lang.Number) oVar.f384376f).intValue();
        java.lang.Object obj = a17.f384367e;
        if (intValue2 == 17) {
            jz5.l lVar2 = (jz5.l) obj;
            int intValue3 = ((java.lang.Number) lVar2.f384367e).intValue();
            int intValue4 = ((c19 - intValue3) / 2) + ((java.lang.Number) oVar.f384374d).intValue();
            rect = new android.graphics.Rect(0, intValue4, ((java.lang.Number) lVar2.f384366d).intValue(), intValue3 + intValue4);
        } else {
            jz5.l lVar3 = (jz5.l) obj;
            rect = new android.graphics.Rect(0, ((java.lang.Number) oVar.f384374d).intValue(), ((java.lang.Number) lVar3.f384366d).intValue(), ((java.lang.Number) oVar.f384374d).intValue() + ((java.lang.Number) lVar3.f384367e).intValue());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSurfaceViewService", "fluentEnterVideo: targetRect=" + rect + ", fromRect=" + c17 + ", videoWidth=" + m76632x755bd410 + ", videoHeight=" + m76605x1c4fb41d + ", ratioHW=" + h37);
        android.content.Context context3 = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context3, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g5Var);
        c61.n9 n9Var = new c61.n9(intent, j17, onAnimationEndCallback);
        boolean z27 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209577ye).mo141623x754a37bb()).r()).intValue() == 1;
        zy2.p7 p7Var2 = g5Var instanceof zy2.p7 ? (zy2.p7) g5Var : null;
        if (p7Var2 != null) {
            p7Var2.mo61225x198638e3(true);
        }
        ug5.c cVar = new ug5.c(ug5.b.f509114d);
        ug5.g gVar = cVar.f509117a;
        gVar.f509139t = -16777216;
        cVar.e(c17);
        cVar.i(rect);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(rect.width(), rect.height());
        if (((java.lang.Number) oVar.f384376f).intValue() == 17) {
            int centerY = rect.centerY();
            android.graphics.Point b18 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            int i19 = b18.x;
            int i27 = b18.y;
            java.lang.System.nanoTime();
            if (!(com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A())) {
                if (i27 >= i19) {
                    i19 = i27;
                }
                i27 = i19;
            }
            intValue = centerY - (i27 / 2);
        } else {
            intValue = ((java.lang.Number) oVar.f384374d).intValue();
        }
        layoutParams.topMargin = intValue;
        layoutParams.bottomMargin = ((java.lang.Number) oVar.f384375e).intValue();
        layoutParams.gravity = ((java.lang.Number) oVar.f384376f).intValue();
        gVar.f509133n = layoutParams;
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
        jz5.l lVar4 = (jz5.l) obj;
        layoutParams2.width = ((java.lang.Number) lVar4.f384366d).intValue();
        layoutParams2.height = ((java.lang.Number) lVar4.f384367e).intValue();
        layoutParams2.gravity = 17;
        gVar.f509134o = layoutParams2;
        gVar.f509135p = 240L;
        gVar.f509137r = 3000L;
        gVar.f509144y = false;
        cVar.g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14105xea00b870.class, false);
        cVar.f(new android.view.animation.LinearInterpolator());
        cVar.c("key_feed_id", java.lang.Long.valueOf(j17));
        cVar.c("key_video_w", java.lang.Integer.valueOf(m76632x755bd410));
        cVar.c("key_video_h", java.lang.Integer.valueOf(m76605x1c4fb41d));
        cVar.c("key_player", g5Var);
        gVar.f509123d = new c61.j9(z27, g5Var, m76632x755bd410, m76605x1c4fb41d, j17);
        gVar.f509125f = new c61.m9(g5Var, intent, j17, n9Var, this);
        cVar.a().g(activity);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Ni(long r46, java.lang.String r48, int r49, long r50, zy2.g5 r52, zy2.ub r53, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r54) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.s9.Ni(long, java.lang.String, int, long, zy2.g5, zy2.ub, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public zy2.g5 Ri(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feed, java.lang.String commentScene, long j17, zy2.g5 g5Var, zy2.ub ubVar, zy2.mc mcVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentScene, "commentScene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSurfaceViewService", "getPlayerView: commentScene=" + commentScene + ", feedId=" + pm0.v.u(feed.m76784x5db1b11()) + ", continuePlayIntervalMs=" + j17 + ", reuseVideoView=" + g5Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(feed, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15176x3a5a59de c15176x3a5a59de = g5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15176x3a5a59de ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15176x3a5a59de) g5Var : null;
        if (c15176x3a5a59de == null) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            c15176x3a5a59de = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15176x3a5a59de(context);
        }
        c15176x3a5a59de.m61190xf0c430f7(j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88.f36135x233c02ec.b(a17);
        r45.mb4 mb4Var = b17.m59135x7efe73ec().get(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mb4Var, "get(...)");
        c15176x3a5a59de.n(ds2.h.f324399a.c(feed.m76784x5db1b11(), mb4Var, false), false, b17);
        c15176x3a5a59de.mo56716x4121a19(true);
        if (ubVar != null) {
            c15176x3a5a59de.mo56704x526554de(ubVar);
        }
        c15176x3a5a59de.mo56708x764cf626(true);
        c15176x3a5a59de.mo56709x764d819b(true);
        if (mcVar != null) {
            c15176x3a5a59de.m61407x1b99416f(new c61.r9(mcVar));
        }
        Zi(pm0.v.u(b17.getFeedId()) + '_' + c15176x3a5a59de.hashCode(), c15176x3a5a59de);
        return c15176x3a5a59de;
    }

    public final boolean Ui() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209559xe).mo141623x754a37bb()).r()).intValue() != 1 || com.p314xaae8f345.mm.ui.bk.A() || com.p314xaae8f345.mm.ui.bk.Q()) ? false : true;
    }

    public zy2.g5 Vi(java.lang.String feedId_playerHash) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId_playerHash, "feedId_playerHash");
        zy2.g5 g5Var = (zy2.g5) this.f120827d.remove(feedId_playerHash);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSurfaceViewService", "removePlayerView " + feedId_playerHash + " ret:" + g5Var);
        return g5Var;
    }

    public final void Zi(java.lang.String feedId_playerHash, zy2.g5 player) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId_playerHash, "feedId_playerHash");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        if (Ui()) {
            java.util.HashMap hashMap = this.f120827d;
            if (hashMap.get(feedId_playerHash) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderVideoSurfaceViewService", "savePlayView invalid state ".concat(feedId_playerHash));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSurfaceViewService", "savePlayView " + feedId_playerHash + " size:" + hashMap.size());
            hashMap.put(feedId_playerHash, player);
        }
    }

    public void wi(android.app.Activity activity) {
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderVideoSurfaceViewService", "abortTransaction return for null. ");
            return;
        }
        java.lang.String stringExtra = activity.getIntent().getStringExtra("intent_key_view_performer");
        if (stringExtra == null) {
            stringExtra = "";
        }
        ug5.v a17 = ug5.v.f509188g.a(stringExtra);
        if (a17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSurfaceViewService", "abortTransaction");
            Bi(a17, false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderVideoSurfaceViewService", "abortTransaction findViewPerformer == null, mediaId: " + stringExtra + ' ');
        }
    }
}
