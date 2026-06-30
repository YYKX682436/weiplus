package bu3;

/* loaded from: classes10.dex */
public final class f implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f24594d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f24595e;

    /* renamed from: f, reason: collision with root package name */
    public ju3.d0 f24596f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f24597g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.GridView f24598h;

    /* renamed from: i, reason: collision with root package name */
    public int f24599i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.RelativeLayout f24600m;

    public f(boolean z17, android.widget.RelativeLayout mRootView) {
        kotlin.jvm.internal.o.g(mRootView, "mRootView");
        this.f24594d = 32;
        this.f24595e = new java.util.ArrayList();
        this.f24599i = 2;
        b(z17, mRootView);
    }

    public final void a(int i17) {
        if (i17 == 99) {
            ju3.d0 d0Var = this.f24596f;
            if (d0Var != null) {
                ju3.d0.k(d0Var, ju3.c0.N1, null, 2, null);
                return;
            }
            return;
        }
        if (i17 == 100) {
            ju3.d0 d0Var2 = this.f24596f;
            if (d0Var2 != null) {
                ju3.d0.k(d0Var2, ju3.c0.O1, null, 2, null);
                return;
            }
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("EDIT_PHOTO_DOODLE_PENCIL_INDEX_INT", i17);
        ju3.d0 d0Var3 = this.f24596f;
        if (d0Var3 != null) {
            d0Var3.w(ju3.c0.P1, bundle);
        }
    }

    public final void b(boolean z17, android.widget.RelativeLayout rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View inflate = android.view.LayoutInflater.from(rootView.getContext()).inflate(z17 ? com.tencent.mm.R.layout.ci7 : com.tencent.mm.R.layout.ci6, rootView);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate;
        this.f24600m = relativeLayout;
        android.widget.ImageView imageView = (android.widget.ImageView) relativeLayout.findViewById(com.tencent.mm.R.id.llb);
        this.f24597g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(rootView.getContext(), com.tencent.mm.R.raw.icons_filled_previous, -1));
        }
        android.widget.ImageView imageView2 = this.f24597g;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new bu3.d(this));
        }
        android.widget.GridView gridView = (android.widget.GridView) rootView.findViewById(com.tencent.mm.R.id.f483832c61);
        this.f24598h = gridView;
        if (z17 && gridView != null) {
            android.content.Context context = rootView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            int i17 = com.tencent.mm.ui.bl.b(context).x;
            int i18 = com.tencent.mm.ui.bl.b(context).y;
            if (i17 > i18) {
                i17 = i18;
            }
            gridView.setVerticalSpacing((i17 - com.tencent.mm.ui.zk.a(context, 314)) / 7);
        }
        java.util.ArrayList arrayList = this.f24595e;
        if (z17) {
            arrayList.clear();
            bu3.b bVar = new bu3.b();
            bVar.f24588a = -7054596;
            bVar.f24589b = 6;
            arrayList.add(bVar);
            bu3.b bVar2 = new bu3.b();
            bVar2.f24588a = -15172610;
            bVar2.f24589b = 5;
            arrayList.add(bVar2);
            bu3.b bVar3 = new bu3.b();
            bVar3.f24588a = -16535286;
            bVar3.f24589b = 4;
            arrayList.add(bVar3);
            bu3.b bVar4 = new bu3.b();
            bVar4.f24588a = -17592;
            bVar4.f24589b = 3;
            arrayList.add(bVar4);
            bu3.b bVar5 = new bu3.b();
            bVar5.f24588a = -707825;
            bVar5.f24589b = 2;
            arrayList.add(bVar5);
            bu3.b bVar6 = new bu3.b();
            bVar6.f24588a = -16777216;
            bVar6.f24589b = 1;
            arrayList.add(bVar6);
            bu3.b bVar7 = new bu3.b();
            bVar7.f24588a = -855310;
            bVar7.f24589b = 0;
            arrayList.add(bVar7);
        } else {
            arrayList.clear();
            bu3.b bVar8 = new bu3.b();
            bVar8.f24588a = -855310;
            bVar8.f24589b = 0;
            arrayList.add(bVar8);
            bu3.b bVar9 = new bu3.b();
            bVar9.f24588a = -16777216;
            bVar9.f24589b = 1;
            arrayList.add(bVar9);
            bu3.b bVar10 = new bu3.b();
            bVar10.f24588a = -707825;
            bVar10.f24589b = 2;
            arrayList.add(bVar10);
            bu3.b bVar11 = new bu3.b();
            bVar11.f24588a = -17592;
            bVar11.f24589b = 3;
            arrayList.add(bVar11);
            bu3.b bVar12 = new bu3.b();
            bVar12.f24588a = -16535286;
            bVar12.f24589b = 4;
            arrayList.add(bVar12);
            bu3.b bVar13 = new bu3.b();
            bVar13.f24588a = -15172610;
            bVar13.f24589b = 5;
            arrayList.add(bVar13);
            bu3.b bVar14 = new bu3.b();
            bVar14.f24588a = -7054596;
            bVar14.f24589b = 6;
            arrayList.add(bVar14);
        }
        android.widget.GridView gridView2 = this.f24598h;
        if (gridView2 != null) {
            gridView2.setAdapter((android.widget.ListAdapter) new bu3.c(this, arrayList));
        }
        android.widget.GridView gridView3 = this.f24598h;
        if (gridView3 == null) {
            return;
        }
        gridView3.setOnItemClickListener(new bu3.e(this));
    }

    public final void c(java.lang.Integer num) {
        android.view.View childAt;
        android.widget.RelativeLayout relativeLayout;
        if (num != null && (relativeLayout = this.f24600m) != null) {
            relativeLayout.setVisibility(num.intValue());
        }
        if (num != null && num.intValue() == 0) {
            int i17 = 0;
            for (java.lang.Object obj : this.f24595e) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                android.widget.GridView gridView = this.f24598h;
                if ((gridView != null ? gridView.getChildAt(i17) : null) != null) {
                    android.widget.GridView gridView2 = this.f24598h;
                    android.view.View childAt2 = gridView2 != null ? gridView2.getChildAt(i17) : null;
                    kotlin.jvm.internal.o.e(childAt2, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                    if (((bu3.a) childAt2).getType() != this.f24599i) {
                        android.widget.GridView gridView3 = this.f24598h;
                        childAt = gridView3 != null ? gridView3.getChildAt(i17) : null;
                        kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                        ((bu3.a) childAt).setHasSelected(false);
                    } else {
                        android.widget.GridView gridView4 = this.f24598h;
                        childAt = gridView4 != null ? gridView4.getChildAt(i17) : null;
                        kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                        ((bu3.a) childAt).setHasSelected(true);
                    }
                }
                i17 = i18;
            }
            a(this.f24599i);
        }
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        android.widget.RelativeLayout relativeLayout = this.f24600m;
        java.lang.Integer valueOf = relativeLayout != null ? java.lang.Integer.valueOf(relativeLayout.getVisibility()) : null;
        if (valueOf == null || valueOf.intValue() != 0) {
            return false;
        }
        c(4);
        return true;
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        android.view.View childAt;
        if (i17 == 0) {
            int i18 = 0;
            for (java.lang.Object obj : this.f24595e) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                android.widget.GridView gridView = this.f24598h;
                if ((gridView != null ? gridView.getChildAt(i18) : null) != null) {
                    android.widget.GridView gridView2 = this.f24598h;
                    android.view.View childAt2 = gridView2 != null ? gridView2.getChildAt(i18) : null;
                    kotlin.jvm.internal.o.e(childAt2, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                    if (((bu3.a) childAt2).getType() != this.f24599i) {
                        android.widget.GridView gridView3 = this.f24598h;
                        childAt = gridView3 != null ? gridView3.getChildAt(i18) : null;
                        kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                        ((bu3.a) childAt).setHasSelected(false);
                    } else {
                        android.widget.GridView gridView4 = this.f24598h;
                        childAt = gridView4 != null ? gridView4.getChildAt(i18) : null;
                        kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                        ((bu3.a) childAt).setHasSelected(true);
                    }
                }
                i18 = i19;
            }
            a(this.f24599i);
        }
        android.widget.GridView gridView5 = this.f24598h;
        if (gridView5 != null) {
            gridView5.setVisibility(i17);
        }
        android.widget.ImageView imageView = this.f24597g;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(i17);
    }
}
