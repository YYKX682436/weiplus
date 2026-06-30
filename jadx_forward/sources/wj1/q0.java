package wj1;

/* loaded from: classes14.dex */
public class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.C12703xefb74f45 f528163d;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.C12703xefb74f45 c12703xefb74f45) {
        this.f528163d = c12703xefb74f45;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.C12703xefb74f45 c12703xefb74f45 = this.f528163d;
        wj1.m0 m0Var = c12703xefb74f45.f171084d;
        if (m0Var != null) {
            wj1.c0 c0Var = (wj1.c0) m0Var;
            c0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a5 = c0Var.f528109a;
            g0Var.d(14943, activityC12702xc32382a5.f171065e, 6, activityC12702xc32382a5.f171072o.f463494s);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) c12703xefb74f45.mo7438x76847179(), 1, false);
        k0Var.f293405n = new wj1.o0(this);
        k0Var.f293414s = new wj1.p0(this);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
