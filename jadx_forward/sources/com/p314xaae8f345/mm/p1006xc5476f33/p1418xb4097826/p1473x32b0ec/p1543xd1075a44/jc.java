package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class jc extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n8 {

    /* renamed from: p, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cc f200279p = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cc(null);

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f200280h;

    /* renamed from: i, reason: collision with root package name */
    public final gk2.e f200281i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f200282m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f200283n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.jk f200284o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jc(android.view.ViewGroup r3, gk2.e r4) {
        /*
            r2 = this;
            java.lang.String r0 = "container"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            java.lang.String r0 = "buContext"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            r2.<init>(r0)
            r2.f200280h = r3
            r2.f200281i = r4
            java.lang.String r3 = "FinderLiveCommentDanmakuSettingWidget"
            r2.f200282m = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jc.<init>(android.view.ViewGroup, gk2.e):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jc r5, boolean r6, boolean r7, int r8, java.lang.Object r9) {
        /*
            r9 = r8 & 1
            r0 = 0
            if (r9 == 0) goto L6
            r6 = r0
        L6:
            r9 = 2
            r8 = r8 & r9
            r1 = 1
            if (r8 == 0) goto Lc
            r7 = r1
        Lc:
            android.view.View r8 = r5.f200283n
            if (r8 == 0) goto Lbb
            if (r6 == 0) goto L8f
            com.tencent.mm.plugin.finder.view.jk r6 = r5.f200284o
            if (r6 == 0) goto L94
            com.tencent.mm.plugin.finder.live.widget.dc r2 = new com.tencent.mm.plugin.finder.live.widget.dc
            r2.<init>(r8)
            android.animation.ObjectAnimator r3 = r6.f213981c
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r3.getTarget()
            boolean r4 = r3 instanceof android.view.View
            if (r4 == 0) goto L2a
            android.view.View r3 = (android.view.View) r3
            goto L2b
        L2a:
            r3 = 0
        L2b:
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3, r8)
            if (r3 == 0) goto L4e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "slideToRightAnim view:"
            r9.<init>(r1)
            int r1 = r8.hashCode()
            r9.append(r1)
            java.lang.String r1 = " reuseAnim"
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            java.lang.String r1 = "FinderLiveSlideAnimHelper"
            r6.a(r1, r9)
            goto L7f
        L4e:
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            android.graphics.Point r3 = com.p314xaae8f345.mm.ui.bl.b(r3)
            int r3 = r3.x
            float r3 = (float) r3
            float[] r9 = new float[r9]
            r4 = 0
            r9[r0] = r4
            r9[r1] = r3
            java.lang.String r1 = "translationX"
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r8, r1, r9)
            r6.f213981c = r9
            com.tencent.mm.plugin.finder.view.ik r1 = r6.f213982d
            if (r1 != 0) goto L70
            com.tencent.mm.plugin.finder.view.ik r1 = new com.tencent.mm.plugin.finder.view.ik
            r1.<init>()
        L70:
            r6.f213982d = r1
            if (r9 == 0) goto L77
            r9.addListener(r1)
        L77:
            android.animation.ObjectAnimator r9 = r6.f213981c
            if (r9 != 0) goto L7c
            goto L7f
        L7c:
            r9.setTarget(r8)
        L7f:
            com.tencent.mm.plugin.finder.view.ik r9 = r6.f213982d
            if (r9 == 0) goto L87
            r9.f213844d = r8
            r9.f213845e = r2
        L87:
            android.animation.ObjectAnimator r6 = r6.f213981c
            if (r6 == 0) goto L94
            r6.start()
            goto L94
        L8f:
            zl2.r4 r6 = zl2.r4.f555483a
            r6.Q2(r8)
        L94:
            if (r7 == 0) goto Lbb
            gk2.e r6 = r5.f200281i
            java.lang.Class<mm2.c1> r7 = mm2.c1.class
            androidx.lifecycle.c1 r6 = r6.a(r7)
            mm2.c1 r6 = (mm2.c1) r6
            r6.N1 = r0
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r7 = "PARAM_FINDER_LIVE_SCREEN_CLEAR"
            r6.putBoolean(r7, r0)
            com.tencent.mm.plugin.finder.live.plugin.l r5 = r5.m58104xb7f4f95a()
            if (r5 == 0) goto Lbb
            com.tencent.mm.plugin.finder.live.view.k0 r5 = r5.R0()
            qo0.b r7 = qo0.b.Z2
            r5.mo46557x60d69242(r7, r6)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jc.b(com.tencent.mm.plugin.finder.live.widget.jc, boolean, boolean, int, java.lang.Object):void");
    }

    public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jc jcVar, int i17, mm2.b2 b2Var, int i18) {
        android.widget.TextView textView;
        android.view.View view = jcVar.f200283n;
        if (view == null || (textView = (android.widget.TextView) view.findViewById(i17)) == null) {
            return;
        }
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hc(jcVar, b2Var, i18));
    }

    public static final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jc jcVar, int i17, mm2.d2 d2Var, int i18) {
        android.widget.TextView textView;
        android.view.View view = jcVar.f200283n;
        if (view == null || (textView = (android.widget.TextView) view.findViewById(i17)) == null) {
            return;
        }
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ic(jcVar, d2Var, i18));
    }

    public final void e(mm2.b2 b2Var) {
        if (mm2.j2.F.c()) {
            android.view.View view = this.f200283n;
            android.view.View findViewById = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.li8) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget", "updateDanmakuRange", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveDanmakuSlice$DanmakuRange;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget", "updateDanmakuRange", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveDanmakuSlice$DanmakuRange;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = this.f200283n;
            android.view.View findViewById2 = view2 != null ? view2.findViewById(com.p314xaae8f345.mm.R.id.li7) : null;
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget", "updateDanmakuRange", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveDanmakuSlice$DanmakuRange;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget", "updateDanmakuRange", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveDanmakuSlice$DanmakuRange;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = this.f200283n;
        android.view.View findViewById3 = view3 != null ? view3.findViewById(com.p314xaae8f345.mm.R.id.li8) : null;
        if (findViewById3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget", "updateDanmakuRange", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveDanmakuSlice$DanmakuRange;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget", "updateDanmakuRange", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveDanmakuSlice$DanmakuRange;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view4 = this.f200283n;
        android.view.View findViewById4 = view4 != null ? view4.findViewById(com.p314xaae8f345.mm.R.id.li7) : null;
        if (findViewById4 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget", "updateDanmakuRange", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveDanmakuSlice$DanmakuRange;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget", "updateDanmakuRange", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveDanmakuSlice$DanmakuRange;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        jz5.l[] lVarArr = new jz5.l[3];
        mm2.b2 b2Var2 = mm2.b2.f410292d;
        android.view.View view5 = this.f200283n;
        lVarArr[0] = new jz5.l(b2Var2, view5 != null ? (android.widget.TextView) view5.findViewById(com.p314xaae8f345.mm.R.id.li9) : null);
        mm2.b2 b2Var3 = mm2.b2.f410293e;
        android.view.View view6 = this.f200283n;
        lVarArr[1] = new jz5.l(b2Var3, view6 != null ? (android.widget.TextView) view6.findViewById(com.p314xaae8f345.mm.R.id.li6) : null);
        mm2.b2 b2Var4 = mm2.b2.f410294f;
        android.view.View view7 = this.f200283n;
        lVarArr[2] = new jz5.l(b2Var4, view7 != null ? (android.widget.TextView) view7.findViewById(com.p314xaae8f345.mm.R.id.f568052li4) : null);
        for (java.util.Map.Entry entry : kz5.c1.k(lVarArr).entrySet()) {
            mm2.b2 b2Var5 = (mm2.b2) entry.getKey();
            android.widget.TextView textView = (android.widget.TextView) entry.getValue();
            if (textView != null) {
                g(textView, b2Var5 == b2Var);
            }
        }
    }

    public final void f(mm2.d2 d2Var) {
        android.view.View view = this.f200283n;
        android.view.View findViewById = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.oiq) : null;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget", "updateDanmakuTrans", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveDanmakuSlice$DanmakuTrans;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget", "updateDanmakuTrans", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveDanmakuSlice$DanmakuTrans;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f200283n;
        android.view.View findViewById2 = view2 != null ? view2.findViewById(com.p314xaae8f345.mm.R.id.oix) : null;
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget", "updateDanmakuTrans", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveDanmakuSlice$DanmakuTrans;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget", "updateDanmakuTrans", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveDanmakuSlice$DanmakuTrans;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        jz5.l[] lVarArr = new jz5.l[3];
        mm2.d2 d2Var2 = mm2.d2.f410488f;
        android.view.View view3 = this.f200283n;
        lVarArr[0] = new jz5.l(d2Var2, view3 != null ? (android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.oiy) : null);
        mm2.d2 d2Var3 = mm2.d2.f410487e;
        android.view.View view4 = this.f200283n;
        lVarArr[1] = new jz5.l(d2Var3, view4 != null ? (android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.oit) : null);
        mm2.d2 d2Var4 = mm2.d2.f410486d;
        android.view.View view5 = this.f200283n;
        lVarArr[2] = new jz5.l(d2Var4, view5 != null ? (android.widget.TextView) view5.findViewById(com.p314xaae8f345.mm.R.id.ois) : null);
        for (java.util.Map.Entry entry : kz5.c1.k(lVarArr).entrySet()) {
            mm2.d2 d2Var5 = (mm2.d2) entry.getKey();
            android.widget.TextView textView = (android.widget.TextView) entry.getValue();
            if (textView != null) {
                g(textView, d2Var5 == d2Var);
            }
        }
    }

    public final void g(android.widget.TextView textView, boolean z17) {
        if (z17) {
            textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a0z);
        } else {
            textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
            textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a7s);
        }
    }

    /* renamed from: getBuContext */
    public final gk2.e m58078xd7793f26() {
        return this.f200281i;
    }

    /* renamed from: getContainer */
    public final android.view.ViewGroup m58079xe6eebdcb() {
        return this.f200280h;
    }

    /* renamed from: getTAG */
    public final java.lang.String m58080xb5886c64() {
        return this.f200282m;
    }
}
