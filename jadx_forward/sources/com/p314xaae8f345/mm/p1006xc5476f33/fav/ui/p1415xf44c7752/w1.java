package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class w1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f182625d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f182626e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f182627f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f182628g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f182629h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.CheckBox f182630i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f182631m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.x1 f182632n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.x1 x1Var, android.view.View view) {
        super(view);
        this.f182632n = x1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.v1 v1Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.v1(this);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.gtj);
        this.f182625d = imageView;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.p0s);
        this.f182626e = findViewById;
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.mwq);
        this.f182629h = findViewById2;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.p0p);
        this.f182627f = textView;
        this.f182628g = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.gtn);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.jdh);
        this.f182630i = checkBox;
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.jdi);
        this.f182631m = findViewById3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        checkBox.setVisibility(8);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(8);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.q1(this, x1Var));
        imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r1(this, x1Var));
        imageView.setOnLongClickListener(v1Var);
        findViewById3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.s1(this, x1Var));
    }
}
