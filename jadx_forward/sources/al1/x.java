package al1;

/* loaded from: classes7.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12763x195d5f32 f87352d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12763x195d5f32 c12763x195d5f32) {
        this.f87352d = c12763x195d5f32;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandTranslateLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12763x195d5f32 c12763x195d5f32 = this.f87352d;
        al1.a0 a0Var = c12763x195d5f32.f172582q;
        if (a0Var != null) {
            int i17 = c12763x195d5f32.f172579n;
            mi1.v vVar = ((mi1.q) a0Var).f408194a;
            if (i17 == 0) {
                tj1.f.f501226a.a(vVar.f408235a);
            } else if (i17 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime = vVar.f408235a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) runtime.r0(), 1, true);
                k0Var.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m0u), 17);
                k0Var.f293405n = tj1.c.f501223d;
                k0Var.f293414s = new tj1.d(runtime);
                k0Var.v();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandTranslateLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
