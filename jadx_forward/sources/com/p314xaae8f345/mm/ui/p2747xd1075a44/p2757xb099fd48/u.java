package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes9.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f0 f293525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f293526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f293527f;

    public u(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f0 f0Var, android.widget.ImageView imageView) {
        this.f293527f = j0Var;
        this.f293525d = f0Var;
        this.f293526e = imageView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMAlertDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f0 f0Var = this.f293525d;
        if (f0Var != null) {
            f0Var.a(true);
        }
        android.widget.ImageView imageView = this.f293526e;
        boolean isSelected = imageView.isSelected();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f293527f;
        if (isSelected) {
            j0Var.C.startAnimation(j0Var.f293358J);
            j0Var.f293358J.setAnimationListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.m(this));
            android.animation.ObjectAnimator.ofFloat(imageView, "rotation", 180.0f, 0.0f).setDuration(200L).start();
            imageView.setSelected(false);
        } else {
            j0Var.C.startAnimation(j0Var.H);
            j0Var.H.setAnimationListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.n(this));
            android.animation.ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 180.0f).setDuration(200L).start();
            imageView.setSelected(true);
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMAlertDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
