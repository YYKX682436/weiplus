package r02;

/* loaded from: classes8.dex */
public class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d f449829d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d c13249xf095011d) {
        this.f449829d = c13249xf095011d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/ui/TaskItemView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d c13249xf095011d = this.f449829d;
        r02.m0 m0Var = c13249xf095011d.D;
        if (m0Var != null && ((r02.n) m0Var).a(view, 3)) {
            yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var = c13249xf095011d.B;
        if (r0Var.f178847c == 6) {
            android.content.Context context = c13249xf095011d.getContext();
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var2 = c13249xf095011d.B;
            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(context, r0Var2.f178857m.f306810e)) {
                k02.l.c(context, r0Var2.f178860p, r0Var2.f178850f, r0Var2.f178853i);
                o02.a.b(10, o02.a.a(r0Var2.f178847c), r0Var2.f178848d, 22, r0Var2.f178850f, "", "");
            } else {
                db5.e1.C(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572114z2), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572115z3), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574368i23), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jq7), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.e(context, r0Var2), new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.f());
            }
        } else {
            h02.a d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(r0Var.f178850f);
            if (d17 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.o.b(c13249xf095011d.getContext(), c13249xf095011d.B, false);
            } else if (!c13249xf095011d.f178938o.getText().equals(c13249xf095011d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gtk))) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.o.b(c13249xf095011d.getContext(), c13249xf095011d.B, false);
            } else if (!com.p314xaae8f345.mm.vfs.w6.j(d17.f68419xf1e9b966)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.o.b(c13249xf095011d.getContext(), c13249xf095011d.B, false);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
