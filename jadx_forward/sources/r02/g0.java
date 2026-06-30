package r02;

/* loaded from: classes8.dex */
public class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d f449833d;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d c13249xf095011d) {
        this.f449833d = c13249xf095011d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        d02.b bVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/ui/TaskItemView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d c13249xf095011d = this.f449833d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var = c13249xf095011d.B;
        if (r0Var != null && (bVar = r0Var.f178859o) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f306808g)) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("rawUrl", c13249xf095011d.B.f178859o.f306808g);
            ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Bi(c13249xf095011d.getContext(), bundle);
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var2 = c13249xf095011d.B;
            o02.a.b(10, 1006, r0Var2.f178848d, 40, r0Var2.f178850f, "", "");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
