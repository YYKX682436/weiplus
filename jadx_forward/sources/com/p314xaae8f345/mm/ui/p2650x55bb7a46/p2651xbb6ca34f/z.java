package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f;

/* loaded from: classes12.dex */
public class z extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f279988d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f279989e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f279990f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f279991g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.CheckBox f279992h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f279993i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f279994m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.a0 f279995n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.a0 a0Var, android.view.View view) {
        super(view);
        this.f279995n = a0Var;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.gtj);
        this.f279988d = imageView;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.p0s);
        this.f279989e = findViewById;
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.mwq);
        this.f279991g = findViewById2;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.p0p);
        this.f279990f = textView;
        android.widget.CheckBox checkBox = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.jdh);
        this.f279992h = checkBox;
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.jdi);
        this.f279993i = findViewById3;
        this.f279994m = view.findViewById(com.p314xaae8f345.mm.R.id.f564452rs);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        checkBox.setVisibility(8);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(8);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.x(this, a0Var));
        findViewById3.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.y(this, a0Var));
    }
}
