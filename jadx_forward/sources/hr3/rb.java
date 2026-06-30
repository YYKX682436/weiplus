package hr3;

/* loaded from: classes11.dex */
public class rb extends hr3.nb {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 f365481h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668) {
        super(c16861xdcf09668);
        this.f365481h = c16861xdcf09668;
    }

    @Override // hr3.nb, hr3.eb, hr3.va
    public void f() {
        super.f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = this.f365481h;
        android.view.View view = c16861xdcf09668.f235267x0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c16861xdcf09668.C1.setVisibility(8);
        c16861xdcf09668.D1.setVisibility(8);
        c16861xdcf09668.G1.setVisibility(8);
        c16861xdcf09668.E1.setVisibility(8);
        c16861xdcf09668.F1.setVisibility(8);
        android.view.View view2 = c16861xdcf09668.f235271z1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c16861xdcf09668.H1.setVisibility(8);
        c16861xdcf09668.f235270y1.setVisibility(0);
        android.view.View view3 = c16861xdcf09668.f235268x1;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (c16861xdcf09668.L.o2()) {
            c16861xdcf09668.f235266p1.setText(c16861xdcf09668.K1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bfh));
            c16861xdcf09668.H1.setVisibility(0);
        } else {
            c16861xdcf09668.f235266p1.setText(c16861xdcf09668.K1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bfc));
        }
        c16861xdcf09668.f235269y0.setOnClickListener(new hr3.ob(this));
        c16861xdcf09668.f235266p1.setOnClickListener(new hr3.qb(this));
    }

    @Override // hr3.va
    public void g() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f365481h.L;
        if (z3Var == null || !z3Var.r2()) {
            k(false, true);
        } else {
            j();
        }
    }

    @Override // hr3.nb, hr3.eb, hr3.va
    public void i() {
        super.i();
    }

    @Override // hr3.nb, hr3.va, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        super.mo815x76e0bfae(i17, i18, str, m1Var);
    }
}
