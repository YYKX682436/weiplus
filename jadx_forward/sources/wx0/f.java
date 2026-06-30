package wx0;

/* loaded from: classes5.dex */
public final class f extends mx0.a {

    /* renamed from: p, reason: collision with root package name */
    public static final wx0.d f532009p = new wx0.d(null);

    /* renamed from: g, reason: collision with root package name */
    public final yx0.b8 f532010g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.FrameLayout f532011h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.FrameLayout f532012i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4019xd47cd265 f532013m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4019xd47cd265 f532014n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f532015o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(android.view.ViewGroup r2, android.view.ViewGroup r3, yx0.b8 r4) {
        /*
            r1 = this;
            java.lang.String r0 = "sideToolbar"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r0)
            java.lang.String r0 = "rootView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            java.lang.String r0 = "templateCorePlugin"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            r0 = 2131299126(0x7f090b36, float:1.8216245E38)
            android.view.View r2 = r2.findViewById(r0)
            java.lang.String r0 = "findViewById(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r0)
            r1.<init>(r2)
            r1.f532010g = r4
            r2 = 2131299139(0x7f090b43, float:1.821627E38)
            android.view.View r2 = r3.findViewById(r2)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r0)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r1.f532011h = r2
            r4 = 2131299156(0x7f090b54, float:1.8216305E38)
            android.view.View r3 = r3.findViewById(r4)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r0)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r1.f532012i = r3
            com.tencent.maas.camstudio.MJCamSegmentationDesc r4 = new com.tencent.maas.camstudio.MJCamSegmentationDesc
            r0 = 1077936128(0x40400000, float:3.0)
            r4.<init>(r0)
            r1.f532013m = r4
            r1.f532014n = r4
            android.view.View r4 = r1.f413347d
            wx0.a r0 = new wx0.a
            r0.<init>(r1)
            r4.setOnClickListener(r0)
            wx0.b r4 = new wx0.b
            r4.<init>(r1)
            r2.setOnClickListener(r4)
            wx0.c r2 = new wx0.c
            r2.<init>(r1)
            r3.setOnClickListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wx0.f.<init>(android.view.ViewGroup, android.view.ViewGroup, yx0.b8):void");
    }

    public final void b() {
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4019xd47cd265 segmentationDesc = this.f532015o ? this.f532014n : new com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4019xd47cd265();
        yx0.b8 b8Var = this.f532010g;
        b8Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentationDesc, "segmentationDesc");
        p3325xe03a0797.p3326xc267989b.l.d(b8Var.M, null, null, new yx0.q5(b8Var, segmentationDesc, null), 3, null);
        c();
    }

    public final void c() {
        android.view.View view = this.f413347d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c.C10992x3dae1b94 c10992x3dae1b94 = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c.C10992x3dae1b94) view;
        boolean z17 = this.f532015o;
        android.widget.FrameLayout frameLayout = this.f532012i;
        android.widget.FrameLayout frameLayout2 = this.f532011h;
        if (!z17) {
            c10992x3dae1b94.m47408x8d516947(com.p314xaae8f345.mm.R.C30861xcebc809e.f562578da5);
            frameLayout2.setVisibility(8);
            frameLayout.setVisibility(8);
            return;
        }
        c10992x3dae1b94.m47408x8d516947(com.p314xaae8f345.mm.R.C30861xcebc809e.da6);
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.x0 x0Var = this.f532014n.f129431a;
        int i17 = x0Var == null ? -1 : wx0.e.f532006a[x0Var.ordinal()];
        if (i17 == 1) {
            frameLayout2.setVisibility(0);
            frameLayout.setVisibility(8);
        } else if (i17 != 2) {
            wx0.d.a(f532009p, false, null, 2, null);
        } else {
            frameLayout2.setVisibility(0);
            frameLayout.setVisibility(0);
        }
    }

    @Override // yt3.r2
    /* renamed from: onActivityResult */
    public void mo47332x9d4787cb(int i17, int i18, android.content.Intent intent) {
        qg.c cVar;
        java.util.ArrayList parcelableArrayListExtra;
        if (i17 == 672) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_select_mix_media_list")) == null) ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) kz5.n0.a0(parcelableArrayListExtra, 0);
            if (i18 != -1 || abstractC15633xee433078 == null) {
                return;
            }
            int mo63659xfb85f7b0 = abstractC15633xee433078.mo63659xfb85f7b0();
            if (mo63659xfb85f7b0 == 1) {
                cVar = qg.c.Image;
            } else if (mo63659xfb85f7b0 != 2) {
                return;
            } else {
                cVar = qg.c.Video;
            }
            this.f532014n = new com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4019xd47cd265(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1(qg.a.Filepath, abstractC15633xee433078.f219963e, cVar));
            b();
        }
    }

    @Override // mx0.a, yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        if (i17 != 4 && i17 != 8) {
            android.view.View view = this.f413347d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/BackgroundPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/BackgroundPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c();
            return;
        }
        android.view.View view2 = this.f413347d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/BackgroundPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/BackgroundPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f532011h.setVisibility(8);
        this.f532012i.setVisibility(8);
    }
}
