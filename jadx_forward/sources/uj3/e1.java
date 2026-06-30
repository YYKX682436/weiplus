package uj3;

/* loaded from: classes14.dex */
public final class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.f1 f509793d;

    public e1(uj3.f1 f1Var) {
        this.f509793d = f1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.content.res.Resources resources;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectTopUI$applyClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uj3.f1 f1Var = this.f509793d;
        java.lang.Integer num = null;
        if (f1Var.f509797b.mo168117x430e7715()) {
            android.content.Context context = f1Var.f509796a;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
            android.content.res.Resources resources2 = f1Var.f509796a.getResources();
            aVar.f293262s = resources2 != null ? resources2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibt) : null;
            aVar.f293265v = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibs);
            aVar.E = new uj3.c1(f1Var);
            android.content.Context context2 = f1Var.f509796a;
            if (context2 != null && (resources = context2.getResources()) != null) {
                num = java.lang.Integer.valueOf(resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            aVar.W = num.intValue();
            aVar.f293266w = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
            aVar.F = uj3.d1.f509790d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
            j0Var.e(aVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
            if (d0Var != null) {
                d0Var.a(j0Var.f293370r);
            }
            j0Var.show();
        } else {
            f1Var.getClass();
            android.view.View view2 = f1Var.f509799d;
            if (view2 != null) {
                view2.setBackground(com.p314xaae8f345.mm.ui.uk.e(f1Var.f509796a, com.p314xaae8f345.mm.R.C30861xcebc809e.aft, android.graphics.Color.parseColor("#FA5151")));
            }
            android.widget.TextView textView = f1Var.f509800e;
            if (textView != null) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ibl);
            }
            uj3.b.a(f1Var.f509797b, uj3.a.f509726d, null, 2, null);
            f1Var.getClass();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectTopUI$applyClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
