package al5;

/* loaded from: classes3.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.BasePopupWindow f5923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f5924e;

    public i(com.tencent.mm.ui.widget.BasePopupWindow basePopupWindow, yz5.a aVar) {
        this.f5923d = basePopupWindow;
        this.f5924e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/BasePopupWindow$showOnAnchor$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.BasePopupWindow basePopupWindow = this.f5923d;
        basePopupWindow.dismiss();
        com.tencent.mars.xlog.Log.i(basePopupWindow.f211244a, "contentView onClick");
        yz5.a aVar = this.f5924e;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/BasePopupWindow$showOnAnchor$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
