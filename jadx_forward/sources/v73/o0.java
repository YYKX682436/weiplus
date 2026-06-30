package v73;

/* loaded from: classes9.dex */
public class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ax3 f515252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa f515253e;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa activityC16102xafeab7fa, r45.ax3 ax3Var) {
        this.f515253e = activityC16102xafeab7fa;
        this.f515252d = ax3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/honey_pay/ui/HoneyPayMainUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.ax3 ax3Var = this.f515252d;
        java.lang.String str = ax3Var.f451869i;
        java.lang.String str2 = ax3Var.f451870m;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa.f223867u;
        this.f515253e.W6(str, false, str2);
        yj0.a.h(this, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayMainUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
