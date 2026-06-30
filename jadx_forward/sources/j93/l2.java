package j93;

/* loaded from: classes.dex */
public final class l2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.p2 f379967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f379968e;

    public l2(j93.p2 p2Var, wi5.n0 n0Var) {
        this.f379967d = p2Var;
        this.f379968e = n0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        ym3.o oVar = (ym3.o) obj;
        if ((oVar != null ? oVar.f544710a : null) == ym3.p.f544714f) {
            j93.p2 p2Var = this.f379967d;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = p2Var.W6().k();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
            if (((a17 == null || (arrayList = a17.f233598o) == null) ? 0 : arrayList.size()) > 0) {
                if (!p2Var.f380013h) {
                    p2Var.f380013h = true;
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k18 = p2Var.W6().k();
                    android.view.ViewGroup.LayoutParams layoutParams = k18.getLayoutParams();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj));
                    k18.setLayoutParams(marginLayoutParams);
                    em.l2 W6 = p2Var.W6();
                    if (W6.f336101y == null) {
                        W6.f336101y = (android.widget.FrameLayout) W6.f336077a.findViewById(com.p314xaae8f345.mm.R.id.gbu);
                    }
                    android.widget.FrameLayout frameLayout = W6.f336101y;
                    if (frameLayout != null) {
                        lj5.c cVar = new lj5.c();
                        cVar.a(p2Var.m158354x19263085());
                        mj5.a aVar = new mj5.a();
                        aVar.f408619d = p2Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573899mb4);
                        aVar.f408621f = p2Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mbe);
                        aVar.f408620e = new j93.i2(p2Var);
                        aVar.f408622g = new j93.j2(p2Var);
                        mj5.a aVar2 = cVar.f400525b;
                        cVar.f400525b = aVar;
                        cVar.c(aVar2, aVar);
                        frameLayout.addView(cVar.f400524a, new android.widget.FrameLayout.LayoutParams(-1, -2));
                    }
                }
                j93.p2.V6(p2Var, true);
            } else {
                j93.p2.V6(p2Var, false);
            }
            if (this.f379968e.e()) {
                j93.p2.V6(p2Var, false);
            }
        }
    }
}
