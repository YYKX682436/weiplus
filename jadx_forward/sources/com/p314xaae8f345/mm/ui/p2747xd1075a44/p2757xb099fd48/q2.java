package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes12.dex */
public class q2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p2 f293486d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v2 f293487e;

    public q2(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l2 l2Var) {
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p2 p2Var = this.f293486d;
        if (p2Var == null) {
            return 0;
        }
        return p2Var.a();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.r2 r2Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.r2) k3Var;
        r2Var.f293494d.setText(this.f293486d.c(i17));
        java.lang.CharSequence b17 = this.f293486d.b(i17);
        android.widget.TextView textView = r2Var.f293495e;
        if (b17 != null) {
            textView.setVisibility(0);
            textView.setText(b17);
        } else {
            textView.setVisibility(8);
        }
        boolean z17 = this.f293486d.f293480c == i17;
        android.widget.ImageView imageView = r2Var.f293496f;
        if (z17) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.byf, viewGroup, false);
        final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.r2 r2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.r2(inflate);
        inflate.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.widget.dialog.q2$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v2 v2Var;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q2 q2Var = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q2.this;
                q2Var.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.r2 r2Var2 = r2Var;
                arrayList.add(r2Var2);
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/ui/widget/dialog/MMFilterDialog$DropdownAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", q2Var, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(r2Var2);
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/ui/widget/dialog/MMFilterDialog$DropdownAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", q2Var, array2);
                int m8183xf806b362 = r2Var2.m8183xf806b362();
                if (m8183xf806b362 == -1 || (v2Var = q2Var.f293487e) == null) {
                    yj0.a.h(q2Var, "com/tencent/mm/ui/widget/dialog/MMFilterDialog$DropdownAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    yj0.a.h(q2Var, "com/tencent/mm/ui/widget/dialog/MMFilterDialog$DropdownAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                } else {
                    v2Var.a(m8183xf806b362, q2Var.f293486d);
                    yj0.a.h(q2Var, "com/tencent/mm/ui/widget/dialog/MMFilterDialog$DropdownAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    yj0.a.h(q2Var, "com/tencent/mm/ui/widget/dialog/MMFilterDialog$DropdownAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            }
        });
        return r2Var;
    }
}
