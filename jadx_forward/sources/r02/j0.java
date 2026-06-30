package r02;

/* loaded from: classes8.dex */
public class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d f449841d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d c13249xf095011d) {
        this.f449841d = c13249xf095011d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/ui/TaskItemView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d c13249xf095011d = this.f449841d;
        bundle.putString("rawUrl", c13249xf095011d.B.f178857m.f306826x);
        ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Bi(c13249xf095011d.getContext(), bundle);
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
