package yc5;

/* loaded from: classes3.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f542443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ em.v1 f542444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f542445f;

    public k(yz5.l lVar, em.v1 v1Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f542443d = lVar;
        this.f542444e = v1Var;
        this.f542445f = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/helpers/MsgHistoryGalleryHelper$showConfirmBottomSheet$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f542443d.mo146xb9724478(java.lang.Boolean.valueOf(this.f542444e.a().isChecked()));
        this.f542445f.q();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/helpers/MsgHistoryGalleryHelper$showConfirmBottomSheet$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
