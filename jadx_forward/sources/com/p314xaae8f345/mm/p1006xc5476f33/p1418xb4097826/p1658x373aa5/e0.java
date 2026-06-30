package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15213xbf81077c f213482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f213483e;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15213xbf81077c c15213xbf81077c, boolean z17) {
        this.f213482d = c15213xbf81077c;
        this.f213483e = z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        if (r7 < (r5 == null ? r5.length() : 0)) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r0 = r9.f213482d
            com.tencent.mm.plugin.finder.view.EllipsizedTextView r1 = r0.f212353p
            android.text.Layout r1 = r1.getLayout()
            if (r1 != 0) goto Lb
            return
        Lb:
            int r2 = r1.getLineCount()
            com.tencent.mm.plugin.finder.view.EllipsizedTextView r3 = r0.f212353p
            int r3 = r3.getMaxLines()
            if (r2 <= r3) goto L18
            r2 = r3
        L18:
            int r2 = r2 + (-1)
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r2 = r1.getOffsetForHorizontal(r2, r3)
            float r1 = r1.getPrimaryHorizontal(r2)
            com.tencent.mm.plugin.finder.view.EllipsizedTextView r2 = r0.f212353p
            int r2 = r2.getF212378h()
            float r2 = (float) r2
            float r1 = r1 + r2
            android.widget.TextView r2 = r0.f212354q
            android.text.TextPaint r2 = r2.getPaint()
            boolean r3 = r9.f213483e
            if (r3 == 0) goto L43
            android.content.Context r3 = r0.getContext()
            r4 = 2131758909(0x7f100f3d, float:1.9148795E38)
            java.lang.String r3 = r3.getString(r4)
            goto L4e
        L43:
            android.content.Context r3 = r0.getContext()
            r4 = 2131761700(0x7f101a24, float:1.9154456E38)
            java.lang.String r3 = r3.getString(r4)
        L4e:
            float r2 = r2.measureText(r3)
            r3 = 1067030938(0x3f99999a, float:1.2)
            float r3 = r3 * r2
            int r4 = r0.getExpandLeftPadding()
            float r4 = (float) r4
            float r3 = r3 + r4
            com.tencent.mm.plugin.finder.view.EllipsizedTextView r4 = r0.f212353p
            android.text.Layout r5 = r4.getLayout()
            r6 = 0
            int r7 = r0.f212352o     // Catch: java.lang.Exception -> L78
            int r8 = r5.getLineCount()     // Catch: java.lang.Exception -> L78
            if (r7 <= r8) goto L6c
            r7 = r8
        L6c:
            int r7 = r7 + (-1)
            if (r7 < 0) goto L7a
            r8 = 1176256512(0x461c4000, float:10000.0)
            int r7 = r5.getOffsetForHorizontal(r7, r8)     // Catch: java.lang.Exception -> L78
            goto L7b
        L78:
            java.lang.String r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
        L7a:
            r7 = r6
        L7b:
            android.widget.TextView r8 = r0.f212354q
            r8.getVisibility()
            if (r5 == 0) goto L92
            if (r7 <= 0) goto L92
            java.lang.CharSequence r5 = r4.getF212379i()
            if (r5 == 0) goto L8f
            int r5 = r5.length()
            goto L90
        L8f:
            r5 = r6
        L90:
            if (r7 < r5) goto La3
        L92:
            boolean r4 = r4.b()
            if (r4 != 0) goto La3
            boolean r4 = r0.isForceEllipsized
            if (r4 == 0) goto L9d
            goto La3
        L9d:
            r4 = 8
            r8.setVisibility(r4)
            goto La6
        La3:
            r8.setVisibility(r6)
        La6:
            r8.getVisibility()
            float r1 = r1 + r2
            int r2 = r0.getWidth()
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto Lc2
            android.widget.TextView r1 = r0.f212354q
            int r1 = r1.getVisibility()
            if (r1 != 0) goto Lc2
            com.tencent.mm.plugin.finder.view.EllipsizedTextView r0 = r0.f212353p
            int r1 = (int) r3
            r0.m61631xc934b3a7(r1)
            goto Lc7
        Lc2:
            com.tencent.mm.plugin.finder.view.EllipsizedTextView r0 = r0.f212353p
            r0.m61631xc934b3a7(r6)
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e0.run():void");
    }
}
