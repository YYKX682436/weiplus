package hr3;

/* loaded from: classes11.dex */
public class hb extends hr3.va {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 f365144f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668) {
        super(c16861xdcf09668);
        this.f365144f = c16861xdcf09668;
    }

    @Override // hr3.va
    public void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = this.f365144f;
        android.view.View view = c16861xdcf09668.f235267x0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$QrcodeHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$QrcodeHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = c16861xdcf09668.f235271z1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$QrcodeHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$QrcodeHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c16861xdcf09668.C1.setVisibility(8);
        c16861xdcf09668.D1.setVisibility(8);
        c16861xdcf09668.G1.setVisibility(8);
        c16861xdcf09668.E1.setVisibility(8);
        c16861xdcf09668.F1.setVisibility(8);
        c16861xdcf09668.H1.setVisibility(8);
        c16861xdcf09668.B1.setOnClickListener(new hr3.gb(this));
    }

    @Override // hr3.va
    public void g() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f365144f.L;
        if (z3Var == null || !z3Var.r2()) {
            k(false, true);
        } else {
            j();
        }
    }
}
