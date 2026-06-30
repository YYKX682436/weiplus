package uf5;

/* loaded from: classes8.dex */
public class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22345x3d5f486e f508730d;

    public a0(com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22345x3d5f486e activityC22345x3d5f486e) {
        this.f508730d = activityC22345x3d5f486e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/privacy/CommonSelectChatRoomUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() != null && (view.getTag() instanceof com.p314xaae8f345.mm.p2621x8fb0427b.z3)) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22345x3d5f486e.w7(this.f508730d, (com.p314xaae8f345.mm.p2621x8fb0427b.z3) view.getTag());
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/privacy/CommonSelectChatRoomUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
