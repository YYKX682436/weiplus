package vf2;

/* loaded from: classes3.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vf2.w f517893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f517894e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(vf2.w wVar, boolean z17) {
        super(0);
        this.f517893d = wVar;
        this.f517894e = z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        if (r1.isShown() == true) goto L38;
     */
    @Override // yz5.a
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo152xb9724478() {
        /*
            r6 = this;
            vf2.w r0 = r6.f517893d
            boolean r1 = r0.f517896m
            boolean r2 = r6.f517894e
            if (r1 == r2) goto L34
            r0.f517896m = r2
            java.lang.Class<com.tencent.mm.plugin.finder.live.plugin.le0> r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le0.class
            if (r2 == 0) goto L29
            com.tencent.mm.plugin.finder.live.view.ub r3 = r0.f372632e
            boolean r4 = r3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0
            if (r4 == 0) goto L17
            com.tencent.mm.plugin.finder.live.view.k0 r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) r3
            goto L18
        L17:
            r3 = 0
        L18:
            if (r3 == 0) goto L1d
            r3.m57648x167921cd()
        L1d:
            com.tencent.mm.plugin.finder.live.plugin.l r1 = r0.R6(r1)
            com.tencent.mm.plugin.finder.live.plugin.le0 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le0) r1
            if (r1 == 0) goto L34
            r1.t1()
            goto L34
        L29:
            com.tencent.mm.plugin.finder.live.plugin.l r1 = r0.R6(r1)
            com.tencent.mm.plugin.finder.live.plugin.le0 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le0) r1
            if (r1 == 0) goto L34
            r1.t1()
        L34:
            java.lang.Class<mm2.e1> r1 = mm2.e1.class
            androidx.lifecycle.c1 r1 = r0.m56788xbba4bfc0(r1)
            mm2.e1 r1 = (mm2.e1) r1
            boolean r1 = r1.f7()
            r3 = 8
            if (r1 == 0) goto Lc4
            android.view.ViewGroup r1 = r0.a7()
            r4 = 0
            if (r1 != 0) goto L4c
            goto L54
        L4c:
            if (r2 == 0) goto L50
            r5 = r4
            goto L51
        L50:
            r5 = r3
        L51:
            r1.setVisibility(r5)
        L54:
            if (r2 == 0) goto Laf
            android.view.ViewGroup r1 = r0.a7()
            if (r1 != 0) goto L5d
            goto L60
        L5d:
            r1.setVisibility(r4)
        L60:
            android.view.ViewGroup r1 = vf2.w.Z6(r0)
            if (r1 == 0) goto L6e
            boolean r1 = r1.isShown()
            r2 = 1
            if (r1 != r2) goto L6e
            goto L6f
        L6e:
            r2 = r4
        L6f:
            if (r2 != 0) goto Ld8
            java.lang.String r1 = "FinderLiveVisitorScreenCastLivingStatusController"
            java.lang.String r2 = "#screenCastSceneListener show pauseBgRootView"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)
            android.view.ViewGroup r1 = vf2.w.Z6(r0)
            if (r1 != 0) goto L7f
            goto L82
        L7f:
            r1.setVisibility(r4)
        L82:
            android.view.ViewGroup r1 = vf2.w.Z6(r0)
            if (r1 == 0) goto Ld8
            r2 = 2131319302(0x7f095a06, float:1.8257166E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r1 == 0) goto Ld8
            java.lang.Class<mm2.c1> r2 = mm2.c1.class
            androidx.lifecycle.c1 r0 = r0.m56788xbba4bfc0(r2)
            mm2.c1 r0 = (mm2.c1) r0
            java.lang.String r0 = r0.t7()
            java.lang.Class<vd2.i5> r2 = vd2.i5.class
            i95.m r2 = i95.n0.c(r2)
            vd2.i5 r2 = (vd2.i5) r2
            mn2.f1 r3 = mn2.f1.B
            c61.i8 r2 = (c61.i8) r2
            r2.Ni(r0, r1, r3)
            goto Ld8
        Laf:
            android.view.ViewGroup r1 = r0.a7()
            if (r1 != 0) goto Lb6
            goto Lb9
        Lb6:
            r1.setVisibility(r3)
        Lb9:
            android.view.ViewGroup r0 = vf2.w.Z6(r0)
            if (r0 != 0) goto Lc0
            goto Ld8
        Lc0:
            r0.setVisibility(r3)
            goto Ld8
        Lc4:
            android.view.ViewGroup r1 = r0.a7()
            if (r1 != 0) goto Lcb
            goto Lce
        Lcb:
            r1.setVisibility(r3)
        Lce:
            android.view.ViewGroup r0 = vf2.w.Z6(r0)
            if (r0 != 0) goto Ld5
            goto Ld8
        Ld5:
            r0.setVisibility(r3)
        Ld8:
            jz5.f0 r0 = jz5.f0.f384359a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vf2.u.mo152xb9724478():java.lang.Object");
    }
}
