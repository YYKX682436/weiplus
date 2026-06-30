package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007;

/* loaded from: classes8.dex */
public class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f223101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 f223102e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f223103f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.o0 f223104g;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.o0 o0Var, android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var, android.widget.ImageView imageView) {
        this.f223104g = o0Var;
        this.f223101d = textView;
        this.f223102e = e1Var;
        this.f223103f = imageView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.TextView textView = this.f223101d;
        boolean equals = textView.getText().equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.fml));
        android.widget.ImageView imageView = this.f223103f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.o0 o0Var = this.f223104g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var = this.f223102e;
        if (equals) {
            e1Var.f68461xef5c29ba = true;
            textView.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.fmm));
            textView.setTextColor(o0Var.D.f223026f2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560706rx));
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79434xb4b46040);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a.q1(o0Var.D, e1Var.K2.f222098w, 2, "", 1, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a.l1(o0Var.D, e1Var.K2.f222098w, true, e1Var.f68477xfc824e7b);
        } else {
            e1Var.f68461xef5c29ba = false;
            textView.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.fml));
            textView.setTextColor(o0Var.D.f223026f2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79433x86f2ba31);
            } else {
                imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79432xfd9234a4);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a.q1(o0Var.D, e1Var.K2.f222098w, 2, "", 2, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a.l1(o0Var.D, e1Var.K2.f222098w, false, e1Var.f68477xfc824e7b);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
