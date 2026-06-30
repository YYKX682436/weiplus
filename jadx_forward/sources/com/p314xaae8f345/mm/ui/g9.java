package com.p314xaae8f345.mm.ui;

/* loaded from: classes3.dex */
public class g9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f290158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f290159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.i9 f290160f;

    public g9(com.p314xaae8f345.mm.ui.i9 i9Var, android.content.DialogInterface.OnClickListener onClickListener, boolean z17) {
        this.f290160f = i9Var;
        this.f290158d = onClickListener;
        this.f290159e = z17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/LiteDependDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.i9 i9Var = this.f290160f;
        android.content.DialogInterface.OnClickListener onClickListener = this.f290158d;
        if (onClickListener != null) {
            onClickListener.onClick(i9Var, -1);
        }
        if (this.f290159e) {
            i9Var.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/ui/LiteDependDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
