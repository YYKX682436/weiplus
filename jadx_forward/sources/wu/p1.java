package wu;

/* loaded from: classes9.dex */
public final class p1 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(hu.f uiParams, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiParams, "uiParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        java.lang.String P;
        ot0.q v17;
        java.lang.String d17;
        bw5.g60 e17;
        bw5.mc0 b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = (com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905) containerView.findViewById(com.p314xaae8f345.mm.R.id.uxi);
        if (abstractC11172x705e5905 == null || (P = item.f366530e.P()) == null) {
            return;
        }
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(P);
        if (cVar.k() == null || (v17 = ot0.q.v(P)) == null) {
            return;
        }
        il4.a aVar = (il4.a) v17.y(il4.a.class);
        bw5.o50 o50Var = aVar != null ? aVar.f373628e : null;
        z01.f0 f0Var = new z01.f0();
        f0Var.f550541d = containerView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.piq);
        android.content.res.Resources resources = containerView.getContext().getResources();
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String m12487x8010e5e4 = (o50Var == null || (b17 = o50Var.b()) == null) ? null : b17.m12487x8010e5e4();
        if (m12487x8010e5e4 == null) {
            m12487x8010e5e4 = "";
        }
        objArr[0] = m12487x8010e5e4;
        java.lang.String m12637xfb82e301 = o50Var != null ? o50Var.m12637xfb82e301() : null;
        objArr[1] = m12637xfb82e301 != null ? m12637xfb82e301 : "";
        f0Var.f550542e = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pir, objArr);
        java.util.List b18 = kz5.b0.b();
        java.util.LinkedList linkedList = (o50Var == null || (e17 = o50Var.e()) == null) ? null : e17.f109234e;
        if (!(linkedList == null || linkedList.isEmpty())) {
            ((lz5.e) b18).addAll(kz5.n0.K0(linkedList, 4));
        } else if (o50Var != null && (d17 = o50Var.d()) != null) {
            java.lang.String str = d17.length() > 0 ? d17 : null;
            if (str != null) {
                ((lz5.e) b18).add(str);
            }
        }
        java.util.List a17 = kz5.b0.a(b18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "<set-?>");
        f0Var.f550544g = a17;
        f0Var.f550543f = com.p314xaae8f345.mm.R.C30861xcebc809e.d87;
        f0Var.f550545h = new wu.o1(this, item);
        abstractC11172x705e5905.m48330xfcfee142(f0Var);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        java.lang.String j17;
        bw5.o50 v17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        s15.f0 V = item.f366530e.V();
        if (V == null || (j17 = V.j()) == null || (v17 = il4.d.v(j17)) == null) {
            return;
        }
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ((rk4.k8) aj6).E(context, v17);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        int i18 = q31.r.f441452c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        r31.n Ai = ((q31.t) ((q31.r) c17)).Ai();
        android.content.Context context = containerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 o17 = ((bf5.a) Ai).o(context);
        o17.setId(com.p314xaae8f345.mm.R.id.uxi);
        containerView.addView(o17, -2, -2);
    }
}
