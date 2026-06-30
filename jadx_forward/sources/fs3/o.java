package fs3;

/* loaded from: classes15.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d f347846d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d activityC16925x87b5f55d) {
        this.f347846d = activityC16925x87b5f55d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d activityC16925x87b5f55d = this.f347846d;
        activityC16925x87b5f55d.f236299t = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d.T6(activityC16925x87b5f55d, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
