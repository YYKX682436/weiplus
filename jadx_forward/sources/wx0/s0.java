package wx0;

/* loaded from: classes5.dex */
public final class s0 extends mx0.a {

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f532070g;

    /* renamed from: h, reason: collision with root package name */
    public final mx0.z f532071h;

    /* renamed from: i, reason: collision with root package name */
    public final yx0.b8 f532072i;

    /* renamed from: m, reason: collision with root package name */
    public wx0.m0 f532073m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c.C10991xb30eef44 f532074n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f532075o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s0(android.view.ViewGroup r3, android.view.ViewGroup r4, android.view.View r5, mx0.z r6, yx0.b8 r7) {
        /*
            r2 = this;
            java.lang.String r0 = "sideToolbar"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            java.lang.String r0 = "rootView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            java.lang.String r0 = "frontMask"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            java.lang.String r0 = "controller"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            java.lang.String r0 = "templateCorePlugin"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            r0 = 2131299174(0x7f090b66, float:1.8216342E38)
            android.view.View r0 = r3.findViewById(r0)
            java.lang.String r1 = "findViewById(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            r2.<init>(r0)
            r2.f532070g = r5
            r2.f532071h = r6
            r2.f532072i = r7
            wx0.m0 r5 = wx0.m0.f532045d
            r2.f532073m = r5
            wx0.q0 r5 = wx0.q0.f532063d
            jz5.g r5 = jz5.h.b(r5)
            r2.f532075o = r5
            android.view.View r5 = r2.f413347d
            wx0.l0 r6 = new wx0.l0
            r6.<init>(r2, r3, r4)
            r5.setOnClickListener(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wx0.s0.<init>(android.view.ViewGroup, android.view.ViewGroup, android.view.View, mx0.z, yx0.b8):void");
    }

    public final void b(boolean z17) {
        if (z17) {
            android.view.View view = this.f532070g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/FlashControlPlugin", "refreshFrontFlashMask", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/FlashControlPlugin", "refreshFrontFlashMask", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f532070g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/FlashControlPlugin", "refreshFrontFlashMask", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/FlashControlPlugin", "refreshFrontFlashMask", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void c(wx0.m0 flashMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flashMode, "flashMode");
        this.f532073m = flashMode;
        android.view.View view = this.f413347d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c.C10992x3dae1b94 c10992x3dae1b94 = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c.C10992x3dae1b94) view;
        int ordinal = this.f532073m.ordinal();
        mx0.z zVar = this.f532071h;
        if (ordinal == 0) {
            c10992x3dae1b94.m47408x8d516947(com.p314xaae8f345.mm.R.C30861xcebc809e.cyr);
            ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) zVar).i1(false);
            yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.m6(m7Var, null), 3, null);
            return;
        }
        if (ordinal == 1) {
            c10992x3dae1b94.m47408x8d516947(com.p314xaae8f345.mm.R.C30861xcebc809e.ckz);
            ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) zVar).i1(true);
            yy0.m7 m7Var2 = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            p3325xe03a0797.p3326xc267989b.l.d(m7Var2.Di(), null, null, new yy0.o6(m7Var2, null), 3, null);
            return;
        }
        if (ordinal != 2) {
            return;
        }
        c10992x3dae1b94.m47408x8d516947(com.p314xaae8f345.mm.R.C30861xcebc809e.cky);
        ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) zVar).i1(false);
        yy0.m7 m7Var3 = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        p3325xe03a0797.p3326xc267989b.l.d(m7Var3.Di(), null, null, new yy0.n6(m7Var3, null), 3, null);
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c.C10991xb30eef44 c10991xb30eef44 = this.f532074n;
        if (c10991xb30eef44 != null) {
            return c10991xb30eef44.a();
        }
        return false;
    }
}
