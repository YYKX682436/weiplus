package mi1;

/* loaded from: classes7.dex */
public final class l2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View.OnClickListener f408147d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f408148e;

    public l2(android.view.View.OnClickListener onClickListener, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f408147d = onClickListener;
        this.f408148e = runtime;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/capsulebar/OptionBtnClickListenerHooker", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mi1.z0 z0Var = mi1.z0.f408272e;
        mi1.q1 q1Var = this.f408148e.f156354z.f408240f;
        mi1.h2 h2Var = q1Var.f408198f;
        if (h2Var.f408100a > 0) {
            mi1.r1 e17 = q1Var.e(h2Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
            i17 = e17.f408209e | 0;
        } else {
            i17 = 0;
        }
        if (this.f408148e.f156354z.b().j() != Integer.MIN_VALUE) {
            i17 |= mi1.a1.e(this.f408148e.f156354z.b().j()).f408280d;
        }
        if ((this.f408148e.f156354z.d().f172567e != null) && this.f408148e.f156354z.b().d() != Integer.MIN_VALUE) {
            int d17 = this.f408148e.f156354z.b().d();
            i17 |= (d17 == 1 ? mi1.z0.f408277m : d17 == 0 ? mi1.z0.f408278n : mi1.z0.f408272e).f408280d;
        }
        this.f408148e.D1(i17);
        android.view.View.OnClickListener onClickListener = this.f408147d;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/capsulebar/OptionBtnClickListenerHooker", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
