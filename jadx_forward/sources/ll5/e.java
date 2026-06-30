package ll5;

/* loaded from: classes5.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 f400811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ll5.a f400812e;

    public e(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 c22675xc8629185, ll5.a aVar) {
        this.f400811d = c22675xc8629185;
        this.f400812e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/code/CodeItemView$onUpdateViewModel$1$expandClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 c22675xc8629185 = this.f400811d;
        if (c22675xc8629185.f293166n) {
            yj0.a.h(this, "com/tencent/mm/ui/widget/code/CodeItemView$onUpdateViewModel$1$expandClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ll5.a aVar = this.f400812e;
        aVar.f400803h = !aVar.f400803h;
        android.view.View.OnClickListener onClickListener = aVar.f400807o;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        c22675xc8629185.m48330xfcfee142(aVar);
        yz5.l itemClickListener = c22675xc8629185.getItemClickListener();
        if (itemClickListener != null) {
            itemClickListener.mo146xb9724478(c22675xc8629185);
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/code/CodeItemView$onUpdateViewModel$1$expandClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
