package ws3;

/* loaded from: classes9.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws3.y f530724d;

    public t(ws3.y yVar) {
        this.f530724d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/form/MobileHistoryAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ws3.y yVar = this.f530724d;
        yVar.f530736m.dismissDropDown();
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4.ViewOnFocusChangeListenerC16962x770823dd viewOnFocusChangeListenerC16962x770823dd = yVar.f530737n;
        if (viewOnFocusChangeListenerC16962x770823dd.L) {
            viewOnFocusChangeListenerC16962x770823dd.m67842xd454f3ba().clearFocus();
        } else {
            viewOnFocusChangeListenerC16962x770823dd.L = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/form/MobileHistoryAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
