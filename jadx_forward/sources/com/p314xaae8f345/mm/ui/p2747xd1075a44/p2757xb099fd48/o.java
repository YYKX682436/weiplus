package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes3.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f293466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f293467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f293468f;

    public o(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var, android.content.DialogInterface.OnClickListener onClickListener, boolean z17) {
        this.f293468f = j0Var;
        this.f293466d = onClickListener;
        this.f293467e = z17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMAlertDialog$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f293468f;
        android.content.DialogInterface.OnClickListener onClickListener = this.f293466d;
        if (onClickListener != null) {
            onClickListener.onClick(j0Var, -1);
        }
        if (this.f293467e) {
            j0Var.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMAlertDialog$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
