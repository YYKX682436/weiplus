package c61;

@j95.b
/* loaded from: classes3.dex */
public final class s9 extends i95.w implements c50.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f39294d = new java.util.HashMap();

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
            kotlin.jvm.internal.o.g(r4, r0)
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
        ug5.g gVar = vVar.f427658a;
        float f17 = (gVar.A * 1000.0f) / ((float) gVar.f427602p);
        android.view.Window window = gVar.f427588b;
        int a17 = window != null ? ug5.x.a(window) : 0;
        ug5.b action = vVar.f427658a.f427587a;
        kotlin.jvm.internal.o.g(action, "action");
        if (ug5.b.f427582e == action) {
            com.tencent.mars.xlog.Log.i("ViewFluentReporter", "return for exit");
            ez2.g.f257902a = null;
        } else {
            ez2.e eVar = ez2.g.f257902a;
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
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia first;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media2;
        com.tencent.mm.protocal.protobuf.FinderMedia first2;
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(thumbView, "thumbView");
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        boolean Ui = Ui();
        android.view.KeyEvent.Callback findViewWithTag = view.findViewWithTag("sns_video_preview_view_tag");
        zy2.g5 g5Var = findViewWithTag instanceof zy2.g5 ? (zy2.g5) findViewWithTag : null;
        if (g5Var == null) {
            android.view.KeyEvent.Callback findViewWithTag2 = view.findViewWithTag("nearby-video-preview-view-tag");
            g5Var = findViewWithTag2 instanceof zy2.g5 ? (zy2.g5) findViewWithTag2 : null;
        }
        boolean z17 = g5Var != null && g5Var.isPlaying();
        boolean z18 = g5Var != null && g5Var.getE();
        com.tencent.mm.protocal.protobuf.FinderObject ml6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ml(j17, "", 38, false, false, "", null);
        if (!Ui || !z17 || !z18 || ml6 == null) {
            onAnimationEndCallback.invoke(java.lang.Boolean.FALSE);
            zy2.p7 p7Var = g5Var instanceof zy2.p7 ? (zy2.p7) g5Var : null;
            if (p7Var == null || (lVar = ((com.tencent.mm.plugin.finder.video.FinderFluentVideoView) p7Var).f130539w2) == null) {
                return;
            }
            lVar.invoke(-1);
            return;
        }
        android.graphics.Rect c17 = ug5.x.c(view, false, 1, null);
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = ml6.getObjectDesc();
        int width = (objectDesc == null || (media2 = objectDesc.getMedia()) == null || (first2 = media2.getFirst()) == null) ? 0 : (int) first2.getWidth();
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = ml6.getObjectDesc();
        int height = (objectDesc2 == null || (media = objectDesc2.getMedia()) == null || (first = media.getFirst()) == null) ? 0 : (int) first.getHeight();
        i95.m c18 = i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        float h37 = zy2.b6.h3((zy2.b6) c18, "fluentEnterVideo", ml6, false, 4, null);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i17 = b17.x;
        int i18 = b17.y;
        java.lang.System.nanoTime();
        boolean z19 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!z19) {
            if (i18 >= i17) {
                i17 = i18;
            }
            i18 = i17;
        }
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        int c19 = i18 - com.tencent.mm.ui.bl.c((android.app.Activity) context);
        i95.m c27 = i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.f(c27, "getService(...)");
        android.content.Context context2 = view.getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
        jz5.l a17 = hc2.f1.a((android.app.Activity) context2, h37, c19, "fluentEnterVideo", j17, 0, 0, 32, null);
        jz5.o oVar = (jz5.o) a17.f302833d;
        int intValue2 = ((java.lang.Number) oVar.f302843f).intValue();
        java.lang.Object obj = a17.f302834e;
        if (intValue2 == 17) {
            jz5.l lVar2 = (jz5.l) obj;
            int intValue3 = ((java.lang.Number) lVar2.f302834e).intValue();
            int intValue4 = ((c19 - intValue3) / 2) + ((java.lang.Number) oVar.f302841d).intValue();
            rect = new android.graphics.Rect(0, intValue4, ((java.lang.Number) lVar2.f302833d).intValue(), intValue3 + intValue4);
        } else {
            jz5.l lVar3 = (jz5.l) obj;
            rect = new android.graphics.Rect(0, ((java.lang.Number) oVar.f302841d).intValue(), ((java.lang.Number) lVar3.f302833d).intValue(), ((java.lang.Number) oVar.f302841d).intValue() + ((java.lang.Number) lVar3.f302834e).intValue());
        }
        com.tencent.mars.xlog.Log.i("FinderVideoSurfaceViewService", "fluentEnterVideo: targetRect=" + rect + ", fromRect=" + c17 + ", videoWidth=" + width + ", videoHeight=" + height + ", ratioHW=" + h37);
        android.content.Context context3 = view.getContext();
        kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context3;
        kotlin.jvm.internal.o.d(g5Var);
        c61.n9 n9Var = new c61.n9(intent, j17, onAnimationEndCallback);
        boolean z27 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128044ye).getValue()).r()).intValue() == 1;
        zy2.p7 p7Var2 = g5Var instanceof zy2.p7 ? (zy2.p7) g5Var : null;
        if (p7Var2 != null) {
            p7Var2.setFluentView(true);
        }
        ug5.c cVar = new ug5.c(ug5.b.f427581d);
        ug5.g gVar = cVar.f427584a;
        gVar.f427606t = -16777216;
        cVar.e(c17);
        cVar.i(rect);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(rect.width(), rect.height());
        if (((java.lang.Number) oVar.f302843f).intValue() == 17) {
            int centerY = rect.centerY();
            android.graphics.Point b18 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
            int i19 = b18.x;
            int i27 = b18.y;
            java.lang.System.nanoTime();
            if (!(com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A())) {
                if (i27 >= i19) {
                    i19 = i27;
                }
                i27 = i19;
            }
            intValue = centerY - (i27 / 2);
        } else {
            intValue = ((java.lang.Number) oVar.f302841d).intValue();
        }
        layoutParams.topMargin = intValue;
        layoutParams.bottomMargin = ((java.lang.Number) oVar.f302842e).intValue();
        layoutParams.gravity = ((java.lang.Number) oVar.f302843f).intValue();
        gVar.f427600n = layoutParams;
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
        jz5.l lVar4 = (jz5.l) obj;
        layoutParams2.width = ((java.lang.Number) lVar4.f302833d).intValue();
        layoutParams2.height = ((java.lang.Number) lVar4.f302834e).intValue();
        layoutParams2.gravity = 17;
        gVar.f427601o = layoutParams2;
        gVar.f427602p = 240L;
        gVar.f427604r = 3000L;
        gVar.f427611y = false;
        cVar.g(com.tencent.mm.plugin.finder.feed.ui.FinderVideoFluentTransparentActivity.class, false);
        cVar.f(new android.view.animation.LinearInterpolator());
        cVar.c("key_feed_id", java.lang.Long.valueOf(j17));
        cVar.c("key_video_w", java.lang.Integer.valueOf(width));
        cVar.c("key_video_h", java.lang.Integer.valueOf(height));
        cVar.c("key_player", g5Var);
        gVar.f427590d = new c61.j9(z27, g5Var, width, height, j17);
        gVar.f427592f = new c61.m9(g5Var, intent, j17, n9Var, this);
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
    public java.lang.Object Ni(long r46, java.lang.String r48, int r49, long r50, zy2.g5 r52, zy2.ub r53, kotlin.coroutines.Continuation r54) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.s9.Ni(long, java.lang.String, int, long, zy2.g5, zy2.ub, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public zy2.g5 Ri(com.tencent.mm.protocal.protobuf.FinderObject feed, java.lang.String commentScene, long j17, zy2.g5 g5Var, zy2.ub ubVar, zy2.mc mcVar) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(commentScene, "commentScene");
        com.tencent.mars.xlog.Log.i("FinderVideoSurfaceViewService", "getPlayerView: commentScene=" + commentScene + ", feedId=" + pm0.v.u(feed.getId()) + ", continuePlayIntervalMs=" + j17 + ", reuseVideoView=" + g5Var);
        com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(feed, 0);
        com.tencent.mm.plugin.finder.video.FinderFluentVideoView finderFluentVideoView = g5Var instanceof com.tencent.mm.plugin.finder.video.FinderFluentVideoView ? (com.tencent.mm.plugin.finder.video.FinderFluentVideoView) g5Var : null;
        if (finderFluentVideoView == null) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            finderFluentVideoView = new com.tencent.mm.plugin.finder.video.FinderFluentVideoView(context);
        }
        finderFluentVideoView.setContinuePlayTimeLimitMs(j17);
        com.tencent.mm.plugin.finder.storage.FeedData b17 = com.tencent.mm.plugin.finder.storage.FeedData.Companion.b(a17);
        r45.mb4 mb4Var = b17.getMediaList().get(0);
        kotlin.jvm.internal.o.f(mb4Var, "get(...)");
        finderFluentVideoView.n(ds2.h.f242866a.c(feed.getId(), mb4Var, false), false, b17);
        finderFluentVideoView.setVideoViewFocused(true);
        if (ubVar != null) {
            finderFluentVideoView.setIMMVideoViewCallback(ubVar);
        }
        finderFluentVideoView.setLoop(true);
        finderFluentVideoView.setMute(true);
        if (mcVar != null) {
            finderFluentVideoView.setDownloadCallback(new c61.r9(mcVar));
        }
        Zi(pm0.v.u(b17.getFeedId()) + '_' + finderFluentVideoView.hashCode(), finderFluentVideoView);
        return finderFluentVideoView;
    }

    public final boolean Ui() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128026xe).getValue()).r()).intValue() != 1 || com.tencent.mm.ui.bk.A() || com.tencent.mm.ui.bk.Q()) ? false : true;
    }

    public zy2.g5 Vi(java.lang.String feedId_playerHash) {
        kotlin.jvm.internal.o.g(feedId_playerHash, "feedId_playerHash");
        zy2.g5 g5Var = (zy2.g5) this.f39294d.remove(feedId_playerHash);
        com.tencent.mars.xlog.Log.i("FinderVideoSurfaceViewService", "removePlayerView " + feedId_playerHash + " ret:" + g5Var);
        return g5Var;
    }

    public final void Zi(java.lang.String feedId_playerHash, zy2.g5 player) {
        kotlin.jvm.internal.o.g(feedId_playerHash, "feedId_playerHash");
        kotlin.jvm.internal.o.g(player, "player");
        if (Ui()) {
            java.util.HashMap hashMap = this.f39294d;
            if (hashMap.get(feedId_playerHash) != null) {
                com.tencent.mars.xlog.Log.e("FinderVideoSurfaceViewService", "savePlayView invalid state ".concat(feedId_playerHash));
            }
            com.tencent.mars.xlog.Log.i("FinderVideoSurfaceViewService", "savePlayView " + feedId_playerHash + " size:" + hashMap.size());
            hashMap.put(feedId_playerHash, player);
        }
    }

    public void wi(android.app.Activity activity) {
        if (activity == null) {
            com.tencent.mars.xlog.Log.w("FinderVideoSurfaceViewService", "abortTransaction return for null. ");
            return;
        }
        java.lang.String stringExtra = activity.getIntent().getStringExtra("intent_key_view_performer");
        if (stringExtra == null) {
            stringExtra = "";
        }
        ug5.v a17 = ug5.v.f427655g.a(stringExtra);
        if (a17 != null) {
            com.tencent.mars.xlog.Log.i("FinderVideoSurfaceViewService", "abortTransaction");
            Bi(a17, false);
        } else {
            com.tencent.mars.xlog.Log.w("FinderVideoSurfaceViewService", "abortTransaction findViewPerformer == null, mediaId: " + stringExtra + ' ');
        }
    }
}
