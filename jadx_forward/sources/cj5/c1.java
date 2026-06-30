package cj5;

/* loaded from: classes.dex */
public final class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.d1 f123613d;

    public c1(cj5.d1 d1Var) {
        this.f123613d = d1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        j75.f m67437x4bd5310;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/mvvm/uic/base/SelectContactBottomMenuUIC$updateBottomMenuVisible$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = this.f123613d.P6();
        if (P6 != null && (m67437x4bd5310 = P6.m67437x4bd5310()) != null) {
            m67437x4bd5310.B3(new wi5.c());
        }
        yj0.a.h(this, "com/tencent/mm/ui/mvvm/uic/base/SelectContactBottomMenuUIC$updateBottomMenuVisible$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
