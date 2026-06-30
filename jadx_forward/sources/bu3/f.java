package bu3;

/* loaded from: classes10.dex */
public final class f implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f106127d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f106128e;

    /* renamed from: f, reason: collision with root package name */
    public ju3.d0 f106129f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f106130g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.GridView f106131h;

    /* renamed from: i, reason: collision with root package name */
    public int f106132i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.RelativeLayout f106133m;

    public f(boolean z17, android.widget.RelativeLayout mRootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mRootView, "mRootView");
        this.f106127d = 32;
        this.f106128e = new java.util.ArrayList();
        this.f106132i = 2;
        b(z17, mRootView);
    }

    public final void a(int i17) {
        if (i17 == 99) {
            ju3.d0 d0Var = this.f106129f;
            if (d0Var != null) {
                ju3.d0.k(d0Var, ju3.c0.N1, null, 2, null);
                return;
            }
            return;
        }
        if (i17 == 100) {
            ju3.d0 d0Var2 = this.f106129f;
            if (d0Var2 != null) {
                ju3.d0.k(d0Var2, ju3.c0.O1, null, 2, null);
                return;
            }
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("EDIT_PHOTO_DOODLE_PENCIL_INDEX_INT", i17);
        ju3.d0 d0Var3 = this.f106129f;
        if (d0Var3 != null) {
            d0Var3.w(ju3.c0.P1, bundle);
        }
    }

    public final void b(boolean z17, android.widget.RelativeLayout rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.view.View inflate = android.view.LayoutInflater.from(rootView.getContext()).inflate(z17 ? com.p314xaae8f345.mm.R.C30864xbddafb2a.ci7 : com.p314xaae8f345.mm.R.C30864xbddafb2a.ci6, rootView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate;
        this.f106133m = relativeLayout;
        android.widget.ImageView imageView = (android.widget.ImageView) relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.llb);
        this.f106130g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(rootView.getContext(), com.p314xaae8f345.mm.R.raw.f79868x8752620f, -1));
        }
        android.widget.ImageView imageView2 = this.f106130g;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new bu3.d(this));
        }
        android.widget.GridView gridView = (android.widget.GridView) rootView.findViewById(com.p314xaae8f345.mm.R.id.f565365c61);
        this.f106131h = gridView;
        if (z17 && gridView != null) {
            android.content.Context context = rootView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            int i17 = com.p314xaae8f345.mm.ui.bl.b(context).x;
            int i18 = com.p314xaae8f345.mm.ui.bl.b(context).y;
            if (i17 > i18) {
                i17 = i18;
            }
            gridView.setVerticalSpacing((i17 - com.p314xaae8f345.mm.ui.zk.a(context, 314)) / 7);
        }
        java.util.ArrayList arrayList = this.f106128e;
        if (z17) {
            arrayList.clear();
            bu3.b bVar = new bu3.b();
            bVar.f106121a = -7054596;
            bVar.f106122b = 6;
            arrayList.add(bVar);
            bu3.b bVar2 = new bu3.b();
            bVar2.f106121a = -15172610;
            bVar2.f106122b = 5;
            arrayList.add(bVar2);
            bu3.b bVar3 = new bu3.b();
            bVar3.f106121a = -16535286;
            bVar3.f106122b = 4;
            arrayList.add(bVar3);
            bu3.b bVar4 = new bu3.b();
            bVar4.f106121a = -17592;
            bVar4.f106122b = 3;
            arrayList.add(bVar4);
            bu3.b bVar5 = new bu3.b();
            bVar5.f106121a = -707825;
            bVar5.f106122b = 2;
            arrayList.add(bVar5);
            bu3.b bVar6 = new bu3.b();
            bVar6.f106121a = -16777216;
            bVar6.f106122b = 1;
            arrayList.add(bVar6);
            bu3.b bVar7 = new bu3.b();
            bVar7.f106121a = -855310;
            bVar7.f106122b = 0;
            arrayList.add(bVar7);
        } else {
            arrayList.clear();
            bu3.b bVar8 = new bu3.b();
            bVar8.f106121a = -855310;
            bVar8.f106122b = 0;
            arrayList.add(bVar8);
            bu3.b bVar9 = new bu3.b();
            bVar9.f106121a = -16777216;
            bVar9.f106122b = 1;
            arrayList.add(bVar9);
            bu3.b bVar10 = new bu3.b();
            bVar10.f106121a = -707825;
            bVar10.f106122b = 2;
            arrayList.add(bVar10);
            bu3.b bVar11 = new bu3.b();
            bVar11.f106121a = -17592;
            bVar11.f106122b = 3;
            arrayList.add(bVar11);
            bu3.b bVar12 = new bu3.b();
            bVar12.f106121a = -16535286;
            bVar12.f106122b = 4;
            arrayList.add(bVar12);
            bu3.b bVar13 = new bu3.b();
            bVar13.f106121a = -15172610;
            bVar13.f106122b = 5;
            arrayList.add(bVar13);
            bu3.b bVar14 = new bu3.b();
            bVar14.f106121a = -7054596;
            bVar14.f106122b = 6;
            arrayList.add(bVar14);
        }
        android.widget.GridView gridView2 = this.f106131h;
        if (gridView2 != null) {
            gridView2.setAdapter((android.widget.ListAdapter) new bu3.c(this, arrayList));
        }
        android.widget.GridView gridView3 = this.f106131h;
        if (gridView3 == null) {
            return;
        }
        gridView3.setOnItemClickListener(new bu3.e(this));
    }

    public final void c(java.lang.Integer num) {
        android.view.View childAt;
        android.widget.RelativeLayout relativeLayout;
        if (num != null && (relativeLayout = this.f106133m) != null) {
            relativeLayout.setVisibility(num.intValue());
        }
        if (num != null && num.intValue() == 0) {
            int i17 = 0;
            for (java.lang.Object obj : this.f106128e) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                android.widget.GridView gridView = this.f106131h;
                if ((gridView != null ? gridView.getChildAt(i17) : null) != null) {
                    android.widget.GridView gridView2 = this.f106131h;
                    android.view.View childAt2 = gridView2 != null ? gridView2.getChildAt(i17) : null;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt2, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                    if (((bu3.a) childAt2).m11315xfb85f7b0() != this.f106132i) {
                        android.widget.GridView gridView3 = this.f106131h;
                        childAt = gridView3 != null ? gridView3.getChildAt(i17) : null;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                        ((bu3.a) childAt).m11319x62966993(false);
                    } else {
                        android.widget.GridView gridView4 = this.f106131h;
                        childAt = gridView4 != null ? gridView4.getChildAt(i17) : null;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                        ((bu3.a) childAt).m11319x62966993(true);
                    }
                }
                i17 = i18;
            }
            a(this.f106132i);
        }
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        android.widget.RelativeLayout relativeLayout = this.f106133m;
        java.lang.Integer valueOf = relativeLayout != null ? java.lang.Integer.valueOf(relativeLayout.getVisibility()) : null;
        if (valueOf == null || valueOf.intValue() != 0) {
            return false;
        }
        c(4);
        return true;
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        android.view.View childAt;
        if (i17 == 0) {
            int i18 = 0;
            for (java.lang.Object obj : this.f106128e) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                android.widget.GridView gridView = this.f106131h;
                if ((gridView != null ? gridView.getChildAt(i18) : null) != null) {
                    android.widget.GridView gridView2 = this.f106131h;
                    android.view.View childAt2 = gridView2 != null ? gridView2.getChildAt(i18) : null;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt2, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                    if (((bu3.a) childAt2).m11315xfb85f7b0() != this.f106132i) {
                        android.widget.GridView gridView3 = this.f106131h;
                        childAt = gridView3 != null ? gridView3.getChildAt(i18) : null;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                        ((bu3.a) childAt).m11319x62966993(false);
                    } else {
                        android.widget.GridView gridView4 = this.f106131h;
                        childAt = gridView4 != null ? gridView4.getChildAt(i18) : null;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                        ((bu3.a) childAt).m11319x62966993(true);
                    }
                }
                i18 = i19;
            }
            a(this.f106132i);
        }
        android.widget.GridView gridView5 = this.f106131h;
        if (gridView5 != null) {
            gridView5.setVisibility(i17);
        }
        android.widget.ImageView imageView = this.f106130g;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(i17);
    }
}
