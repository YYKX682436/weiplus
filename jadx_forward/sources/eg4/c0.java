package eg4;

/* loaded from: classes3.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f334214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f334215e;

    public c0(android.widget.TextView textView, android.widget.TextView textView2) {
        this.f334214d = textView;
        this.f334215e = textView2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f334214d.setVisibility(8);
        android.widget.TextView textView = this.f334215e;
        if (textView != null) {
            textView.setSingleLine(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
