package com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13;

/* loaded from: classes.dex */
public final class l1 implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f288425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.q1 f288426e;

    public l1(java.util.ArrayList arrayList, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.q1 q1Var) {
        this.f288425d = arrayList;
        this.f288426e = q1Var;
    }

    @Override // in5.y
    public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 o17;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.q1 q1Var;
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.ui.p2690x38b72420.v8 v8Var;
        com.p314xaae8f345.mm.ui.p2690x38b72420.w8 w8Var;
        java.lang.String str;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecentForwardListDataItem", "onItemLongClick() called with: adapter = " + adapter + ", view = " + view + ", position = " + i17 + ", holder = " + holder);
        if (((com.p314xaae8f345.mm.ui.p2690x38b72420.v8) this.f288425d.get(i17)).f288754e != 1 && (o17 = holder.o()) != null && (arrayList = (q1Var = this.f288426e).C) != null && (v8Var = (com.p314xaae8f345.mm.ui.p2690x38b72420.v8) arrayList.get(i17)) != null && (w8Var = v8Var.f288753d) != null && (str = w8Var.f288764a) != null) {
            rl5.r rVar = q1Var.F;
            if (rVar != null) {
                rVar.a();
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = o17.getLayoutManager();
            android.view.View mo7935xa188593e = layoutManager != null ? layoutManager.mo7935xa188593e(i17) : null;
            android.view.View findViewById = mo7935xa188593e != null ? mo7935xa188593e.findViewById(com.p314xaae8f345.mm.R.id.a9o) : null;
            if (findViewById == null) {
                findViewById = mo7935xa188593e;
            }
            if (findViewById != null) {
                rl5.r rVar2 = new rl5.r(findViewById.getContext());
                rVar2.C = true;
                rVar2.L = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.m1(q1Var);
                q1Var.F = rVar2;
                int[] iArr = {0, 0};
                findViewById.getLocationInWindow(iArr);
                com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n1 n1Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n1(q1Var, str, i17);
                int f17 = i65.a.f(findViewById.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
                rl5.r rVar3 = q1Var.F;
                if (rVar3 != null) {
                    int width = (int) (iArr[0] + (findViewById.getWidth() / 2.0f));
                    int i18 = iArr[1] - f17;
                    rVar3.f478887x = n1Var;
                    rVar3.f478871f = mo7935xa188593e;
                    if (!(mo7935xa188593e instanceof android.widget.TextView) && (width == 0 || i18 == 0)) {
                        rVar3.l();
                    }
                    rVar3.f478889z.clear();
                    rVar3.f478889z.b(0, com.p314xaae8f345.mm.R.C30867xcad56011.ify, com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
                    if (width == 0 && i18 == 0) {
                        rVar3.m();
                    } else {
                        rVar3.n(width, i18);
                    }
                }
                com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.q(i17, str);
            }
        }
        return true;
    }
}
