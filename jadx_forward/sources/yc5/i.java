package yc5;

/* loaded from: classes3.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ em.v1 f542441d;

    public i(em.v1 v1Var) {
        this.f542441d = v1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/helpers/MsgHistoryGalleryHelper$showConfirmBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f542441d.a().setChecked(!r7.a().isChecked());
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/helpers/MsgHistoryGalleryHelper$showConfirmBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
