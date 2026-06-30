package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public class p0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.r0 f291017d;

    public p0(com.p314xaae8f345.mm.ui.r0 r0Var) {
        this.f291017d = r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGlobalLayout() {
        /*
            r11 = this;
            com.tencent.mm.ui.r0 r0 = r11.f291017d
            r0.getClass()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.view.View r2 = r0.f291113d
            r2.getWindowVisibleDisplayFrame(r1)
            r1.toString()
            boolean r3 = r0.f291111b
            if (r3 == 0) goto L1c
            int r3 = r1.bottom
            int r1 = r1.top
            int r3 = r3 - r1
            goto L1e
        L1c:
            int r3 = r1.bottom
        L1e:
            int r1 = r0.f291114e
            if (r3 == r1) goto Lae
            android.view.View r1 = r2.getRootView()
            int r1 = r1.getHeight()
            int r4 = r1 - r3
            android.content.Context r5 = r0.f291110a
            boolean r6 = com.p314xaae8f345.mm.ui.dl.f(r5)
            r7 = 0
            if (r6 == 0) goto L3a
            int r5 = com.p314xaae8f345.mm.ui.dl.e(r5)
            goto L3b
        L3a:
            r5 = r7
        L3b:
            java.lang.String r6 = android.os.Build.BRAND
            boolean r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6)
            r9 = 1
            if (r8 != 0) goto L60
            java.lang.String r6 = r6.toLowerCase()
            java.lang.String r8 = "huawei"
            boolean r8 = r6.contains(r8)
            if (r8 != 0) goto L58
            java.lang.String r8 = "honor"
            boolean r6 = r6.contains(r8)
            if (r6 == 0) goto L60
        L58:
            int r6 = android.os.Build.VERSION.SDK_INT
            r8 = 24
            if (r6 != r8) goto L60
            r6 = r9
            goto L61
        L60:
            r6 = r7
        L61:
            com.tencent.mm.ui.q0 r8 = r0.f291112c
            android.view.ViewGroup$LayoutParams r10 = r0.f291115f
            if (r6 == 0) goto L91
            int r6 = r1 / 4
            if (r4 <= r6) goto L81
            int r1 = r1 - r4
            float r4 = (float) r3
            int r5 = r0.f291117h
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r0.f291116g
            float r5 = (float) r5
            float r4 = r4 * r5
            int r4 = (int) r4
            int r1 = r1 + r4
            r10.height = r1
            if (r8 == 0) goto La9
            com.tencent.mm.plugin.sns.ui.dc r8 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dc) r8
            r8.a(r9)
            goto La9
        L81:
            int r1 = r1 - r5
            r10.height = r1
            r0.f291117h = r3
            int r1 = r1 - r3
            r0.f291116g = r1
            if (r8 == 0) goto La9
            com.tencent.mm.plugin.sns.ui.dc r8 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dc) r8
            r8.a(r7)
            goto La9
        L91:
            int r5 = r1 / 4
            if (r4 <= r5) goto La0
            int r1 = r1 - r4
            r10.height = r1
            if (r8 == 0) goto La9
            com.tencent.mm.plugin.sns.ui.dc r8 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dc) r8
            r8.a(r9)
            goto La9
        La0:
            r10.height = r3
            if (r8 == 0) goto La9
            com.tencent.mm.plugin.sns.ui.dc r8 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dc) r8
            r8.a(r7)
        La9:
            r2.requestLayout()
            r0.f291114e = r3
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p0.onGlobalLayout():void");
    }
}
