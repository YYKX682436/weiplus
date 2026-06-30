package df2;

/* loaded from: classes3.dex */
public final class wo implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.zo f313236d;

    public wo(df2.zo zoVar) {
        this.f313236d = zoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0034, code lost:
    
        if (r11.isShown() != false) goto L8;
     */
    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo525x7bb163d5(java.lang.Object r11) {
        /*
            r10 = this;
            jz5.l r11 = (jz5.l) r11
            java.lang.Object r0 = r11.f384366d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r11.f384367e
            int[] r1 = (int[]) r1
            df2.zo r2 = r10.f313236d
            java.lang.String r3 = r2.f313512m
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "[outerGiftAnimLiveData] receive giftId:"
            r4.<init>(r5)
            r4.append(r11)
            java.lang.String r11 = r4.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r11)
            java.lang.Class<com.tencent.mm.plugin.finder.live.plugin.ag0> r11 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class
            com.tencent.mm.plugin.finder.live.plugin.l r11 = r2.R6(r11)
            com.tencent.mm.plugin.finder.live.plugin.ag0 r11 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) r11
            r3 = 0
            if (r11 == 0) goto L37
            el2.i1 r11 = r11.H
            android.widget.ImageView r11 = r11.j()
            boolean r4 = r11.isShown()
            if (r4 == 0) goto L37
            goto L38
        L37:
            r11 = r3
        L38:
            java.util.Map r4 = dk2.u7.f315718e
            java.lang.Object r0 = r4.get(r0)
            ce2.i r0 = (ce2.i) r0
            if (r0 == 0) goto L44
            java.lang.String r3 = r0.f67819x7194d06c
        L44:
            if (r11 == 0) goto Le2
            r0 = 0
            r4 = 1
            if (r3 == 0) goto L53
            int r5 = r3.length()
            if (r5 != 0) goto L51
            goto L53
        L51:
            r5 = r0
            goto L54
        L53:
            r5 = r4
        L54:
            if (r5 == 0) goto L58
            goto Le2
        L58:
            android.widget.ImageView r5 = new android.widget.ImageView
            android.content.Context r6 = r2.O6()
            r5.<init>(r6)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            jz5.g r7 = r2.f313514o
            r8 = r7
            jz5.n r8 = (jz5.n) r8
            java.lang.Object r8 = r8.mo141623x754a37bb()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            jz5.n r7 = (jz5.n) r7
            java.lang.Object r7 = r7.mo141623x754a37bb()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r6.<init>(r8, r7)
            r5.setLayoutParams(r6)
            mn2.g1 r6 = mn2.g1.f411508a
            vo0.d r7 = r6.e()
            mn2.q3 r8 = new mn2.q3
            com.tencent.mm.plugin.finder.storage.y90 r9 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f
            r8.<init>(r3, r9)
            mn2.f1 r3 = mn2.f1.f411486d
            yo0.i r3 = r6.h(r3)
            r7.c(r8, r5, r3)
            r3 = 4
            r5.setVisibility(r3)
            int[] r11 = pm0.v.t(r11)
            r3 = r1[r0]
            r6 = r1[r4]
            if (r3 <= 0) goto Ldb
            if (r6 > 0) goto Lab
            goto Ldb
        Lab:
            android.widget.FrameLayout r3 = r2.Z6()
            if (r3 == 0) goto Lb4
            r3.addView(r5)
        Lb4:
            r3 = r11[r0]
            float r3 = (float) r3
            r5.setX(r3)
            r3 = r11[r4]
            float r3 = (float) r3
            r5.setY(r3)
            r3 = r1[r0]
            r0 = r11[r0]
            int r3 = r3 - r0
            float r0 = (float) r3
            r1 = r1[r4]
            r11 = r11[r4]
            int r1 = r1 - r11
            float r11 = (float) r1
            android.widget.FrameLayout r1 = r2.Z6()
            if (r1 == 0) goto Le2
            df2.yo r3 = new df2.yo
            r3.<init>(r5, r0, r11, r2)
            r1.post(r3)
            goto Le2
        Ldb:
            java.lang.String r11 = "end point is illegal , return"
            java.lang.String r0 = r2.f313512m
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r11)
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.wo.mo525x7bb163d5(java.lang.Object):void");
    }
}
