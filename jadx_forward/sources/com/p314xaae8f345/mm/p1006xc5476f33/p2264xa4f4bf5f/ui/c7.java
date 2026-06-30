package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class c7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 f255300d;

    public c7(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9) {
        this.f255300d = activityC18635xb8188ef9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$initCustomStatusView$1$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9 = this.f255300d;
        activityC18635xb8188ef9.d7().f554879h.f445445b++;
        activityC18635xb8188ef9.N = "userdefine";
        android.widget.ImageView imageView = activityC18635xb8188ef9.F;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = activityC18635xb8188ef9.C;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setText("");
        }
        bk4.f.V(activityC18635xb8188ef9.c7(), activityC18635xb8188ef9.F, activityC18635xb8188ef9.N, null, null, null, false, false, 124, null);
        activityC18635xb8188ef9.Z6();
        activityC18635xb8188ef9.mo48674x36654fab();
        activityC18635xb8188ef9.g7();
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$initCustomStatusView$1$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
