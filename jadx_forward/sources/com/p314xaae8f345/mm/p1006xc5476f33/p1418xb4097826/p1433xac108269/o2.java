package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class o2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o2 f183954a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o2();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f183955b = new java.util.concurrent.ConcurrentHashMap();

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if ((r26.i0.n(r20, r2, false)) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.widget.FrameLayout r17, int r18, int r19, java.lang.String r20, java.lang.CharSequence r21) {
        /*
            r16 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            java.lang.String r3 = "container"
            r4 = r17
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r3)
            java.lang.String r3 = "mediaId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r3)
            java.lang.String r3 = "nickname"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r3)
            if (r0 > 0) goto L1c
            return
        L1c:
            java.util.concurrent.ConcurrentHashMap r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o2.f183955b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r18)
            java.lang.Object r3 = r3.get(r5)
            if (r3 != 0) goto L2a
            kz5.p0 r3 = kz5.p0.f395529d
        L2a:
            java.util.List r3 = (java.util.List) r3
            r5 = r19
            java.lang.Object r3 = kz5.n0.a0(r3, r5)
            so2.j5 r3 = (so2.j5) r3
            r5 = 1
            if (r3 == 0) goto L73
            boolean r6 = r3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5
            r7 = 0
            if (r6 == 0) goto L72
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) r3
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r3.getFeedObject()
            java.lang.String r6 = r6.m59273x80025a04()
            boolean r2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r6)
            if (r2 == 0) goto L72
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r3.getFeedObject()
            java.util.LinkedList r2 = r2.m59264x7efe73ec()
            java.lang.Object r2 = kz5.n0.Z(r2)
            r45.mb4 r2 = (r45.mb4) r2
            if (r2 == 0) goto L64
            r3 = 9
            java.lang.String r2 = r2.m75945x2fec8307(r3)
            if (r2 != 0) goto L66
        L64:
            java.lang.String r2 = "."
        L66:
            boolean r1 = r26.i0.n(r1, r2, r7)
            if (r1 != r5) goto L6e
            r1 = r5
            goto L6f
        L6e:
            r1 = r7
        L6f:
            if (r1 == 0) goto L72
            goto L73
        L72:
            r5 = r7
        L73:
            if (r5 != 0) goto L8c
            r16.b(r17)
            xy2.b r6 = xy2.b.f539688b
            java.lang.String r7 = "FinderFeedMatcher.check.1"
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            com.tencent.mm.plugin.finder.assist.m2 r13 = new com.tencent.mm.plugin.finder.assist.m2
            r13.<init>(r0)
            r14 = 60
            r15 = 0
            pm0.z.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o2.a(android.widget.FrameLayout, int, int, java.lang.String, java.lang.CharSequence):void");
    }

    public final void b(android.view.ViewGroup viewGroup) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Number) t70Var.M().r()).intValue() < 1 || !((java.lang.Boolean) t70Var.o0().r()).booleanValue()) {
                return;
            }
            java.lang.Object tag = viewGroup.getTag(com.p314xaae8f345.mm.R.id.e5k);
            android.view.View view = tag instanceof android.view.View ? (android.view.View) tag : null;
            if (view != null) {
                viewGroup.removeView(view);
            }
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(viewGroup.getContext());
            frameLayout.setAlpha(0.5f);
            viewGroup.setTag(com.p314xaae8f345.mm.R.id.e5k, frameLayout);
            frameLayout.setBackgroundColor(-65536);
            android.widget.TextView textView = new android.widget.TextView(viewGroup.getContext());
            textView.setText("feed match error!\n by changelcai");
            textView.setTextColor(-1);
            textView.setTextSize(1, 22.0f);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            frameLayout.addView(textView, layoutParams);
            viewGroup.addView(frameLayout, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
    }
}
