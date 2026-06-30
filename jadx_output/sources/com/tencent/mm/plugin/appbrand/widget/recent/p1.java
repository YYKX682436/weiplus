package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class p1 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f92029d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f92030e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f92031f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f92032g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f92033h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f92034i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView f92035m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView baseAppBrandRecentView, android.view.View view) {
        super(view);
        this.f92035m = baseAppBrandRecentView;
        this.f92032g = view;
        view.setOnClickListener(new com.tencent.mm.plugin.appbrand.widget.recent.n1(this, baseAppBrandRecentView));
        view.setOnLongClickListener(new com.tencent.mm.plugin.appbrand.widget.recent.o1(this, baseAppBrandRecentView));
        view.getLayoutParams().width = baseAppBrandRecentView.getResources().getDisplayMetrics().widthPixels / 4;
        this.f92029d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h5n);
        this.f92030e = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f485288h62);
        this.f92031f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc);
        this.f92033h = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o2y);
        this.f92034i = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h_2);
    }
}
