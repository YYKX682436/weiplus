package im2;

/* loaded from: classes.dex */
public final class s3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f374057d;

    public s3(im2.z3 z3Var) {
        this.f374057d = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$showPurchaseView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        im2.z3 z3Var = this.f374057d;
        z3Var.getClass();
        android.content.Intent intent = new android.content.Intent(z3Var.m158354x19263085(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14024xae8cf4a6.class);
        intent.putExtra("KEY_PARAMS_WHITE_LIST", z3Var.f374203y1.mo14344x5f01b1f6());
        z3Var.m158354x19263085().startActivityForResult(intent, 3);
        z3Var.m158354x19263085().overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$showPurchaseView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
