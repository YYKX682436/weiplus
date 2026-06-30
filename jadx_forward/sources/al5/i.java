package al5;

/* loaded from: classes3.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22598x77e1a40b f87456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f87457e;

    public i(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22598x77e1a40b c22598x77e1a40b, yz5.a aVar) {
        this.f87456d = c22598x77e1a40b;
        this.f87457e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/BasePopupWindow$showOnAnchor$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22598x77e1a40b c22598x77e1a40b = this.f87456d;
        c22598x77e1a40b.dismiss();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c22598x77e1a40b.f292777a, "contentView onClick");
        yz5.a aVar = this.f87457e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/BasePopupWindow$showOnAnchor$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
