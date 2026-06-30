package r02;

/* loaded from: classes8.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d f449831d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d c13249xf095011d) {
        this.f449831d = c13249xf095011d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/ui/TaskItemView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d c13249xf095011d = this.f449831d;
        r02.m0 m0Var = c13249xf095011d.D;
        if (m0Var != null && ((r02.n) m0Var).a(view, 2)) {
            yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.o.d(c13249xf095011d.getContext(), c13249xf095011d.B);
            yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
