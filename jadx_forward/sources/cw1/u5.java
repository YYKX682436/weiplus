package cw1;

/* loaded from: classes5.dex */
public final class u5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 f304888d;

    public u5(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 c13121x39a05fa9) {
        this.f304888d = c13121x39a05fa9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f304888d.f177295f;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("background");
            throw null;
        }
        view2.callOnClick();
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
