package uj3;

/* loaded from: classes14.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.b1 f509748d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(uj3.b1 b1Var) {
        super(2);
        this.f509748d = b1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenProjectReportHelper", "markClickThumb");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1538L, 10L, 1L);
        uj3.b1 b1Var = this.f509748d;
        if (intValue != b1Var.f509768m) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("thumb_flip_target_position", intValue);
            b1Var.f509757b.f(uj3.a.f509733n, bundle);
            if (b1Var.f509763h != null && intValue >= 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(intValue + 1);
                sb6.append('/');
                sb6.append(b1Var.f509769n);
                java.lang.String sb7 = sb6.toString();
                uj3.y0 y0Var = b1Var.f509765j;
                if (y0Var != null) {
                    y0Var.e(sb7);
                }
                xj3.b bVar = b1Var.f509762g;
                if (bVar != null) {
                    bVar.f536399i = intValue;
                    bVar.m8146xced61ae5();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.p1893xe821e364.C16593x8cfa3099 c16593x8cfa3099 = b1Var.f509760e;
                if (c16593x8cfa3099 != null) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = b1Var.f509763h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1163xf1deaba4);
                    c16593x8cfa3099.mo7942xd1b4653f(c1163xf1deaba4, new p012xc85e97e9.p103xe821e364.p104xd1075a44.h3(), intValue);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenProjectReportHelper", "markClickThumbFlipPage");
                g0Var.C(1538L, 11L, 1L);
            }
        }
        return jz5.f0.f384359a;
    }
}
