package kr;

/* loaded from: classes15.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.C10440xb448ef38 f392825d;

    public d(com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.C10440xb448ef38 c10440xb448ef38) {
        this.f392825d = c10440xb448ef38;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/emoji/panel/SmileyPanelView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 textOperationListener = this.f392825d.getTextOperationListener();
        if (textOperationListener != null) {
            textOperationListener.b();
        }
        yj0.a.h(this, "com/tencent/mm/emoji/panel/SmileyPanelView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
