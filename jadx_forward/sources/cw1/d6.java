package cw1;

/* loaded from: classes12.dex */
public final class d6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.l6 f304408d;

    public d6(cw1.l6 l6Var) {
        this.f304408d = l6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanHalfBottomDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cw1.l6 l6Var = this.f304408d;
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = l6Var.f304655q;
        if (c26987xeef691ab != null) {
            c26987xeef691ab.m108007xae7a2e7a();
        }
        l6Var.f304645g.setVisibility(8);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = l6Var.f304646h;
        c22699x3dcdb352.setVisibility(0);
        c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f81441x86452437, com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84);
        android.content.Context context = l6Var.f304639a;
        l6Var.f304647i.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b8k));
        l6Var.f304648j.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572450d74, fp.n0.a(l6Var.f304654p)));
        android.view.View view2 = l6Var.f304649k;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanHalfBottomDialog", "onCanceled", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanHalfBottomDialog", "onCanceled", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = l6Var.f304650l;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanHalfBottomDialog", "onCanceled", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanHalfBottomDialog", "onCanceled", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanHalfBottomDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
