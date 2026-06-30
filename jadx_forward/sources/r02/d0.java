package r02;

/* loaded from: classes8.dex */
public class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d f449827d;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d c13249xf095011d) {
        this.f449827d = c13249xf095011d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/ui/TaskItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d c13249xf095011d = this.f449827d;
        r02.m0 m0Var = c13249xf095011d.D;
        if (m0Var != null && ((r02.n) m0Var).a(view, 1)) {
            yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        h02.a d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(c13249xf095011d.B.f178850f);
        if (d17 == null) {
            c13249xf095011d.c();
            yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (d17.f68441x10a0fed7 == 1) {
            android.content.Context context = c13249xf095011d.getContext();
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var = c13249xf095011d.B;
            h02.a d18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(r0Var.f178850f);
            if (d18 != null) {
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().o(d18.f68408x32b20428);
                o02.a.b(10, o02.a.a(r0Var.f178847c), r0Var.f178848d, 5, d18.f68404x28d45f97, "", "");
                k02.l.f(context, d18, new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.g(d18, r0Var, context));
            }
        } else {
            android.content.Context context2 = c13249xf095011d.getContext();
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var2 = c13249xf095011d.B;
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.o.f(context2, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(r0Var2.f178850f), r0Var2, true, new r02.b0(this));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
