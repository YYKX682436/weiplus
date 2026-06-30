package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class co extends com.tencent.mm.plugin.finder.feed.a1 {
    public int A;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f106485u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f106486v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f106487w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f106488x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.rm f106489y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f106490z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public co(com.tencent.mm.plugin.finder.feed.ui.FinderPoiRelateListUI r10, int r11, int r12, boolean r13, int r14, kotlin.jvm.internal.i r15) {
        /*
            r9 = this;
            r14 = r14 & 8
            if (r14 == 0) goto L5
            r13 = 0
        L5:
            r4 = r13
            java.lang.String r13 = "context"
            kotlin.jvm.internal.o.g(r10, r13)
            r5 = 0
            r6 = 0
            r7 = 48
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.co.<init>(com.tencent.mm.plugin.finder.feed.ui.FinderPoiRelateListUI, int, int, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void K(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        android.widget.CheckBox checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bdj);
        int size = z().f107156e.getSize();
        int i18 = i17 - 1;
        if (checkBox != null) {
            if (size > 0 && i18 < size) {
                so2.j5 j5Var = (so2.j5) z().f107156e.getDataListJustForAdapter().get(i18);
                if (j5Var instanceof so2.m4) {
                    so2.m4 m4Var = (so2.m4) j5Var;
                    boolean z17 = !checkBox.isChecked();
                    m4Var.f410482e = z17;
                    if (z17) {
                        this.A++;
                    } else {
                        this.A--;
                    }
                    com.tencent.mars.xlog.Log.i("Finder.FinderPoiRelateUIContract", "[onGridItemClick], " + i17 + ", " + i18 + ", " + this.A + ", " + m4Var.f410482e);
                }
            }
            checkBox.setChecked(!checkBox.isChecked());
            Y();
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void M() {
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void N(boolean z17) {
        android.view.View t17 = t();
        if (t17 != null) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) t17.findViewById(com.tencent.mm.R.id.m2c);
            if (!z17) {
                if (weImageView == null) {
                    return;
                }
                weImageView.setVisibility(8);
            } else if (weImageView != null) {
                weImageView.setVisibility(0);
                weImageView.setOnClickListener(new com.tencent.mm.plugin.finder.feed.bo(t17));
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void P() {
        this.f106489y = new com.tencent.mm.plugin.finder.view.rm(this.f106174d, null, 2, null);
        android.view.View view = this.f106485u;
        if (view != null) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.iig);
            if (linearLayout != null) {
                linearLayout.setOnClickListener(new com.tencent.mm.plugin.finder.feed.zn(this));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.pnr);
            if (weImageView != null) {
                weImageView.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ao(this));
            }
        }
        super.P();
    }

    public final void W() {
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this.f106174d, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 64, null, null)) {
            X();
        }
    }

    public final void X() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 8);
        intent.putExtra("type_tag", -1);
        intent.putExtra("type_pick_location_btn", 2);
        j45.l.n(this.f106174d, ya.b.LOCATION, ".ui.RedirectUI", intent, 16666);
        com.tencent.mm.plugin.report.service.b1.f(5, 10);
    }

    public final void Y() {
        if (this.A > 0) {
            android.widget.TextView textView = this.f106488x;
            if (textView != null) {
                textView.setBackgroundResource(com.tencent.mm.R.drawable.aan);
                textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.aay));
                return;
            }
            return;
        }
        android.widget.TextView textView2 = this.f106488x;
        if (textView2 != null) {
            textView2.setBackgroundResource(com.tencent.mm.R.drawable.aao);
            textView2.setTextColor(textView2.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
        }
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f106174d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.String s(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View t() {
        return this.f106174d.findViewById(com.tencent.mm.R.id.f484229dg3);
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View w() {
        android.view.View inflate = android.view.View.inflate(this.f106174d, com.tencent.mm.R.layout.b5b, null);
        this.f106485u = inflate;
        return inflate;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.p2 x() {
        return new com.tencent.mm.plugin.finder.feed.un();
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.RecyclerView.LayoutManager y(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = new com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager(1, 1);
        finderStaggeredGridLayoutManager.setItemPrefetchEnabled(true);
        return finderStaggeredGridLayoutManager;
    }
}
