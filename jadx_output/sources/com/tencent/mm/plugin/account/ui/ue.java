package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class ue implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f74251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI f74252e;

    public ue(com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI, boolean[] zArr) {
        this.f74252e = regByMobileRegAIOUI;
        this.f74251d = zArr;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean[] zArr = this.f74251d;
        boolean z17 = zArr[0];
        com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI = this.f74252e;
        if (z17) {
            zArr[0] = false;
        } else {
            regByMobileRegAIOUI.U = fo3.l.a(1);
            fo3.s sVar = fo3.s.INSTANCE;
            sVar.qb("ce_reg", "<Reg>", regByMobileRegAIOUI.U);
            sVar.H2("ce_reg", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
            sVar.Qa("ce_reg");
        }
        regByMobileRegAIOUI.f73579w.d();
        if (!regByMobileRegAIOUI.f73579w.b()) {
            yj0.a.h(this, "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ck5.f b17 = ck5.f.b(regByMobileRegAIOUI.C.getContentEditText());
        b17.f42561f = 1;
        b17.f42560e = 32;
        b17.f42556a = true;
        b17.d(new com.tencent.mm.plugin.account.ui.te(this));
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
