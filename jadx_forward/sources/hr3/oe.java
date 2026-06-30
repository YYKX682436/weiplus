package hr3;

/* loaded from: classes.dex */
public final class oe implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f365397d;

    public oe(hr3.pf pfVar) {
        this.f365397d = pfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiPictureUIC$initForSayHiPictureUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureUIC", "addPhotoLayout onClick called");
        hr3.pf pfVar = this.f365397d;
        pfVar.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) pfVar.m158354x19263085(), 1, true);
        k0Var.f293405n = new hr3.jf(pfVar);
        k0Var.f293414s = new hr3.kf(pfVar);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiPictureUIC$initForSayHiPictureUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
