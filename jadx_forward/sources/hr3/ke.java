package hr3;

/* loaded from: classes.dex */
public final class ke implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f365257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f365258e;

    public ke(hr3.pf pfVar, android.widget.TextView textView) {
        this.f365257d = pfVar;
        this.f365258e = textView;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiPictureUIC$initCommonSayHi$1$1$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        hr3.pf pfVar = this.f365257d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) pfVar.m158354x19263085(), 1, true);
        k0Var.q(pfVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hns), 17);
        k0Var.f293405n = new hr3.ie(pfVar);
        k0Var.f293414s = new hr3.je(pfVar, this.f365258e);
        k0Var.v();
        yj0.a.i(false, this, "com/tencent/mm/plugin/profile/ui/SayHiPictureUIC$initCommonSayHi$1$1$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
