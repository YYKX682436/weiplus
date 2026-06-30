package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes.dex */
public class r implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f272625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272626e;

    public r(android.widget.ImageView imageView, java.lang.String str) {
        this.f272625d = imageView;
        this.f272626e = str;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/AvatarDrawable$Factory$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.widget.ImageView imageView = this.f272625d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(imageView.getContext(), "UserName:", this.f272626e, null);
        dp.a.m125853x26a183b(imageView.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f571894st, 0).show();
        yj0.a.i(true, this, "com/tencent/mm/pluginsdk/ui/AvatarDrawable$Factory$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
