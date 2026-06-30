package dw2;

/* loaded from: classes2.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.da f325703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f325704e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15205x28f20815 f325705f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f325706g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(cw2.da daVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15205x28f20815 c15205x28f20815, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        super(1);
        this.f325703d = daVar;
        this.f325704e = c15188xd8bd4bd;
        this.f325705f = c15205x28f20815;
        this.f325706g = k3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b8, code lost:
    
        if (r9 == false) goto L52;
     */
    @Override // yz5.l
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo146xb9724478(java.lang.Object r9) {
        /*
            r8 = this;
            cw2.da r9 = (cw2.da) r9
            java.lang.String r0 = "view"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            android.view.View r0 = r9.mo56698x4ee17f0a()
            r1 = 1
            r2 = 0
            cw2.da r3 = r8.f325703d
            if (r3 == 0) goto L19
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r3)
            if (r3 == 0) goto L19
            r3 = r1
            goto L1a
        L19:
            r3 = r2
        L1a:
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r4 = r8.f325704e
            if (r4 == 0) goto L26
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r4)
            if (r0 == 0) goto L26
            r0 = r1
            goto L27
        L26:
            r0 = r2
        L27:
            if (r3 != 0) goto Lbb
            if (r0 != 0) goto Lbb
            com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager r0 = r8.f325705f
            r0.getClass()
            java.lang.Class<cq.k> r0 = cq.k.class
            i95.m r0 = i95.n0.c(r0)
            java.lang.String r3 = "getService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r3)
            cq.k r0 = (cq.k) r0
            com.tencent.mm.plugin.finder.storage.t70 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a
            lb2.j r0 = r0.M1()
            java.lang.Object r0 = r0.r()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L51
            goto Lb7
        L51:
            androidx.recyclerview.widget.k3 r0 = r8.f325706g
            boolean r3 = r0 instanceof in5.s0
            if (r3 != 0) goto L59
            goto Lb7
        L59:
            in5.s0 r0 = (in5.s0) r0
            java.lang.Object r3 = r0.f374658i
            boolean r4 = r3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5
            r5 = 0
            if (r4 == 0) goto L65
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) r3
            goto L66
        L65:
            r3 = r5
        L66:
            if (r3 != 0) goto L69
            goto Lb7
        L69:
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.getFeedObject()
            int r3 = r3.getMediaType()
            r4 = 2
            if (r3 == r4) goto L75
            goto Lb7
        L75:
            r3 = 2131307753(0x7f092ce9, float:1.8233742E38)
            android.view.View r0 = r0.p(r3)
            com.tencent.mm.plugin.finder.view.image.FinderImageBanner r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041) r0
            if (r0 == 0) goto Lb7
            tw2.h r3 = r0.imageAdapter
            int r3 = r3.mo1894x7e414b06()
            r4 = r2
        L87:
            if (r4 >= r3) goto Lb7
            android.view.View r6 = r0.m61652x7f02fdf3()
            com.tencent.mm.plugin.finder.view.FinderHorizontalViewPager r6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15299xde732234) r6
            androidx.recyclerview.widget.k3 r6 = r6.p0(r4)
            if (r6 == 0) goto La3
            android.view.View r6 = r6.f3639x46306858
            if (r6 == 0) goto La3
            r7 = 2131305033(0x7f092249, float:1.8228225E38)
            android.view.View r6 = r6.findViewById(r7)
            com.tencent.mm.plugin.finder.view.image.FinderLivePhotoLayout r6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15402xc40c224a) r6
            goto La4
        La3:
            r6 = r5
        La4:
            if (r6 == 0) goto Lab
            cw2.da r6 = r6.getVideoView()
            goto Lac
        Lab:
            r6 = r5
        Lac:
            boolean r6 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6, r9)
            if (r6 == 0) goto Lb4
            r9 = r1
            goto Lb8
        Lb4:
            int r4 = r4 + 1
            goto L87
        Lb7:
            r9 = r2
        Lb8:
            if (r9 != 0) goto Lbb
            goto Lbc
        Lbb:
            r1 = r2
        Lbc:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dw2.x.mo146xb9724478(java.lang.Object):java.lang.Object");
    }
}
