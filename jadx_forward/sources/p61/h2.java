package p61;

/* loaded from: classes5.dex */
public class h2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11365x86ed685 f433813d;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11365x86ed685 activityC11365x86ed685) {
        this.f433813d = activityC11365x86ed685;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindMobileStatusUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11365x86ed685 activityC11365x86ed685 = this.f433813d;
        activityC11365x86ed685.f154552n = java.lang.Boolean.valueOf(!activityC11365x86ed685.f154552n.booleanValue());
        if (activityC11365x86ed685.f154552n.booleanValue()) {
            activityC11365x86ed685.f154550i.setImageResource(com.p314xaae8f345.mm.R.raw.f78834xa20f9397);
        } else {
            activityC11365x86ed685.f154550i.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562789oo);
        }
        activityC11365x86ed685.a7(!activityC11365x86ed685.f154552n.booleanValue(), 512, 8);
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMobileStatusUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
