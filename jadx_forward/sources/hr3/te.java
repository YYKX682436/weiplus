package hr3;

/* loaded from: classes5.dex */
public final class te implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f365561d;

    public te(hr3.pf pfVar) {
        this.f365561d = pfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiPictureUIC$initForSayHiWithSnsPermissionUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hr3.pf pfVar = this.f365561d;
        java.lang.String obj = pfVar.S6().m79028xfb85ada3().toString();
        hr3.pf.P6(pfVar, 1, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj) ? 1 : 0);
        pfVar.X6(obj);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiPictureUIC$initForSayHiWithSnsPermissionUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
