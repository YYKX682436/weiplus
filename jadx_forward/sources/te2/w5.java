package te2;

/* loaded from: classes3.dex */
public final class w5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f500043d;

    public w5(te2.p8 p8Var) {
        this.f500043d = p8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te2.p8 p8Var = this.f500043d;
        p8Var.g7().m82040x7541828(p8Var.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
        p8Var.h7().m82040x7541828(p8Var.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aby));
        p8Var.i7().setVisibility(4);
        te2.p8.Q6(p8Var);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
