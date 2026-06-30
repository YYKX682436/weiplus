package ir1;

/* loaded from: classes3.dex */
public final class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow f375488d;

    public d1(android.widget.PopupWindow popupWindow) {
        this.f375488d = popupWindow;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/conversation/ui/BizFansHalfScreenProfileView$showPrivateMsgEducationIfNeed$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f375488d.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansHalfScreenProfileView$showPrivateMsgEducationIfNeed$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
