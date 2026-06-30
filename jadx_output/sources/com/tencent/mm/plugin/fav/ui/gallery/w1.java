package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class w1 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f101092d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f101093e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f101094f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f101095g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f101096h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.CheckBox f101097i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f101098m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.x1 f101099n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.tencent.mm.plugin.fav.ui.gallery.x1 x1Var, android.view.View view) {
        super(view);
        this.f101099n = x1Var;
        com.tencent.mm.plugin.fav.ui.gallery.v1 v1Var = new com.tencent.mm.plugin.fav.ui.gallery.v1(this);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.gtj);
        this.f101092d = imageView;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.p0s);
        this.f101093e = findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.mwq);
        this.f101096h = findViewById2;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.p0p);
        this.f101094f = textView;
        this.f101095g = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.gtn);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.jdh);
        this.f101097i = checkBox;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.jdi);
        this.f101098m = findViewById3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
        imageView.setOnTouchListener(new com.tencent.mm.plugin.fav.ui.gallery.q1(this, x1Var));
        imageView.setOnClickListener(new com.tencent.mm.plugin.fav.ui.gallery.r1(this, x1Var));
        imageView.setOnLongClickListener(v1Var);
        findViewById3.setOnClickListener(new com.tencent.mm.plugin.fav.ui.gallery.s1(this, x1Var));
    }
}
