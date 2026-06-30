package lu2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lu2.b f402893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lu2.c f402894e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f402895f;

    public a(lu2.b bVar, lu2.c cVar, int i17) {
        this.f402893d = bVar;
        this.f402894e = cVar;
        this.f402895f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/tools/DebugDialog$RvAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lu2.b bVar = this.f402893d;
        android.content.DialogInterface.OnClickListener onClickListener = bVar.f402897e;
        if (onClickListener == null) {
            lu2.c cVar = this.f402894e;
            android.widget.TextView textView = cVar.f402899d;
            java.lang.CharSequence text = textView != null ? textView.getText() : null;
            if (text == null) {
                text = "";
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(text);
            dp.a.m125854x26a183b(cVar.f3639x46306858.getContext(), "copy done", 0).show();
        } else {
            onClickListener.onClick(bVar.f402898f, this.f402895f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/tools/DebugDialog$RvAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
