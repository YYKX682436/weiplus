package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes4.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f272632d;

    public s(android.widget.ImageView imageView) {
        this.f272632d = imageView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/AvatarDrawable$Factory$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = (android.view.View) view.getParent();
        while (true) {
            if (view2 == null) {
                break;
            }
            if (!view2.isClickable()) {
                view2 = view2.getParent() instanceof android.view.View ? (android.view.View) view2.getParent() : null;
            } else if (view2 instanceof android.widget.AdapterView) {
                java.lang.Object tag = this.f272632d.getTag();
                if (tag instanceof java.lang.Integer) {
                    ((android.widget.AdapterView) view2).performItemClick(null, ((java.lang.Integer) tag).intValue(), -1L);
                }
            } else {
                view2.performClick();
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/AvatarDrawable$Factory$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
