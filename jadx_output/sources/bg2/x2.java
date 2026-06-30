package bg2;

/* loaded from: classes3.dex */
public final class x2 extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public r45.xg6 f20636e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f20637f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f20638g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View.OnLayoutChangeListener f20639h;

    /* renamed from: i, reason: collision with root package name */
    public final int f20640i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f20639h = new bg2.o2(this);
        this.f20640i = 46;
    }

    public static final void Y6(bg2.x2 x2Var) {
        x2Var.getClass();
        com.tencent.mars.xlog.Log.i("LiveConvertSearchComponentController", "start polling");
        bg2.g2 g2Var = (bg2.g2) x2Var.N6(bg2.g2.class);
        if (g2Var != null) {
            g2Var.Y6(x2Var.f20640i, x2Var.Z6(), true, new bg2.u2(x2Var, r45.nc2.class));
        }
    }

    @Override // tc2.c
    public void P6() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.kr0 styleInfo;
        java.util.LinkedList list;
        java.lang.Object obj;
        tc2.g gVar = this.f417141d;
        in5.s0 s0Var = gVar.f417149i;
        this.f20637f = s0Var != null ? s0Var.p(com.tencent.mm.R.id.f484253t93) : null;
        in5.s0 s0Var2 = gVar.f417149i;
        android.view.View p17 = s0Var2 != null ? s0Var2.p(com.tencent.mm.R.id.f486340sa4) : null;
        this.f20638g = p17;
        if (p17 != null) {
            p17.addOnLayoutChangeListener(this.f20639h);
        }
        c7();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
        if (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (styleInfo = feedObject.getStyleInfo()) == null || (list = styleInfo.getList(12)) == null) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            boolean z17 = false;
            if (((r45.kz3) obj).getInteger(0) == 26) {
                z17 = true;
            }
            if (z17) {
                break;
            }
        }
        r45.kz3 kz3Var = (r45.kz3) obj;
        this.f20636e = kz3Var != null ? (r45.xg6) kz3Var.getCustom(17) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    @Override // tc2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Q6() {
        /*
            r11 = this;
            tc2.g r0 = r11.f417141d
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f417148h
            boolean r2 = r1 instanceof so2.h1
            r3 = 0
            if (r2 == 0) goto Lc
            so2.h1 r1 = (so2.h1) r1
            goto Ld
        Lc:
            r1 = r3
        Ld:
            if (r1 != 0) goto L10
            return
        L10:
            so2.g1 r2 = r1.f410384n
            int r4 = r2.f410356a
            r5 = 1
            r6 = 0
            if (r4 <= 0) goto L1a
            r4 = r5
            goto L1b
        L1a:
            r4 = r6
        L1b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "has fetched "
            r7.<init>(r8)
            r7.append(r4)
            java.lang.String r8 = " has data "
            r7.append(r8)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r8 = r11.b7()
            if (r8 == 0) goto L32
            r8 = r5
            goto L33
        L32:
            r8 = r6
        L33:
            r7.append(r8)
            java.lang.String r8 = " showType "
            r7.append(r8)
            r45.xg6 r8 = r11.f20636e
            if (r8 == 0) goto L4e
            int r8 = r8.getInteger(r6)
            if (r8 == 0) goto L4b
            if (r8 == r5) goto L48
            goto L4e
        L48:
            r45.yg6 r8 = r45.yg6.ShowType_BackToPreview
            goto L4f
        L4b:
            r45.yg6 r8 = r45.yg6.ShowType_StayPreview
            goto L4f
        L4e:
            r8 = r3
        L4f:
            if (r8 != 0) goto L6e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "unknown value "
            r8.<init>(r9)
            r45.xg6 r9 = r11.f20636e
            if (r9 == 0) goto L66
            int r9 = r9.getInteger(r6)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L67
        L66:
            r9 = r3
        L67:
            r8.append(r9)
            java.lang.String r8 = r8.toString()
        L6e:
            r7.append(r8)
            java.lang.String r8 = " delay "
            r7.append(r8)
            r45.xg6 r8 = r11.f20636e
            if (r8 == 0) goto L83
            int r5 = r8.getInteger(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L84
        L83:
            r5 = r3
        L84:
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.String r7 = "LiveConvertSearchComponentController"
            com.tencent.mars.xlog.Log.i(r7, r5)
            if (r4 == 0) goto L95
            r11.d7()
        L95:
            r45.xg6 r4 = r11.f20636e
            if (r4 != 0) goto L9a
            return
        L9a:
            int r5 = r4.getInteger(r6)
            if (r5 != 0) goto La4
            boolean r5 = r1.f410383m
            if (r5 == 0) goto La8
        La4:
            int r2 = r2.f410356a
            if (r2 <= 0) goto Lb8
        La8:
            kotlinx.coroutines.y0 r5 = r0.f417147g
            if (r5 == 0) goto Lb8
            r6 = 0
            r7 = 0
            bg2.p2 r8 = new bg2.p2
            r8.<init>(r1, r4, r11, r3)
            r9 = 3
            r10 = 0
            kotlinx.coroutines.l.d(r5, r6, r7, r8, r9, r10)
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.x2.Q6():void");
    }

    @Override // tc2.c
    public void U6() {
        android.view.View view = this.f20637f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertSearchComponentController", "onUnFocusFeedCenter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertSearchComponentController", "onUnFocusFeedCenter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // tc2.c
    public void X6() {
        android.view.View view = this.f20638g;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.f20639h);
        }
    }

    public final r45.mc2 Z6() {
        so2.g1 g1Var;
        r45.mc2 mc2Var = new r45.mc2();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f417141d.f417148h;
        so2.h1 h1Var = baseFinderFeed instanceof so2.h1 ? (so2.h1) baseFinderFeed : null;
        mc2Var.set(0, java.lang.Long.valueOf(((h1Var == null || (g1Var = h1Var.f410384n) == null) ? 0 : g1Var.f410356a) + 1));
        return mc2Var;
    }

    public final java.util.LinkedList a7(boolean z17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.v92 v92Var = new r45.v92();
        v92Var.set(0, 1);
        v92Var.set(1, b7());
        r45.u92 u92Var = new r45.u92();
        u92Var.set(0, java.lang.Integer.valueOf(z17 ? 7 : 8));
        u92Var.set(3, v92Var);
        linkedList.add(u92Var);
        return linkedList;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo b7() {
        so2.g1 g1Var;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f417141d.f417148h;
        so2.h1 h1Var = baseFinderFeed instanceof so2.h1 ? (so2.h1) baseFinderFeed : null;
        if (h1Var == null || (g1Var = h1Var.f410384n) == null) {
            return null;
        }
        return g1Var.f410357b;
    }

    public final void c7() {
        android.view.View view;
        android.view.View view2 = this.f20637f;
        if (view2 == null || (view = this.f20638g) == null) {
            return;
        }
        android.view.ViewParent parent = view2.getParent();
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = parent instanceof androidx.constraintlayout.widget.ConstraintLayout ? (androidx.constraintlayout.widget.ConstraintLayout) parent : null;
        if (constraintLayout == null) {
            return;
        }
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.d(constraintLayout);
        cVar.e(view2.getId(), 4, view.getVisibility() == 0 ? view.getId() : com.tencent.mm.R.id.f484049hh3, 3);
        cVar.b(constraintLayout);
        constraintLayout.setConstraintSet(null);
    }

    public final void d7() {
        kotlinx.coroutines.y0 y0Var;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo b76 = b7();
        java.lang.String e76 = e7(b76);
        if ((e76 != null && e76.length() > 0) && (y0Var = this.f417141d.f417147g) != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new bg2.w2(this, b76, null), 3, null);
        }
    }

    public final java.lang.String e7(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        java.util.LinkedList<r45.wf6> style;
        r45.wf6 wf6Var;
        r45.iw4 iw4Var;
        if (finderJumpInfo == null || (style = finderJumpInfo.getStyle()) == null || (wf6Var = (r45.wf6) kz5.n0.Z(style)) == null || (iw4Var = (r45.iw4) wf6Var.getCustom(3)) == null) {
            return null;
        }
        return iw4Var.getString(1);
    }

    @Override // tc2.h
    public void onLiveStart(r45.hc1 hc1Var) {
        kotlinx.coroutines.y0 y0Var;
        r45.xg6 xg6Var = this.f20636e;
        if (xg6Var == null) {
            return;
        }
        tc2.g gVar = this.f417141d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
        so2.h1 h1Var = baseFinderFeed instanceof so2.h1 ? (so2.h1) baseFinderFeed : null;
        if (h1Var != null && h1Var.f410384n.f410356a <= 0 && xg6Var.getInteger(0) == 1 && h1Var.f410383m && (y0Var = gVar.f417147g) != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new bg2.q2(this, null), 3, null);
        }
    }
}
