package wu;

/* loaded from: classes9.dex */
public final class v extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(hu.f uiParams, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiParams, "uiParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = (com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905) containerView.findViewById(com.p314xaae8f345.mm.R.id.uxi);
        if (abstractC11172x705e5905 == null) {
            return;
        }
        z01.k kVar = new z01.k();
        s15.h hVar = item.f366530e;
        s15.l r17 = hVar.r();
        if (r17 != null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ui(r17);
            kVar.t(r17.m163606xb5885648());
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            return;
        }
        kVar.q(c01.id.c());
        kVar.o(hVar.m163586x74292566());
        abstractC11172x705e5905.m48330xfcfee142(kVar);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        int i17 = ct.r2.B0;
        i95.m c17 = i95.n0.c(ct.r2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        android.content.Context context = view.getContext();
        s15.h hVar = item.f366530e;
        s15.l r17 = hVar.r();
        if (r17 == null || (str = r17.m163606xb5885648()) == null) {
            str = "";
        }
        te5.t.f500282a.j(context, str, hVar.m163586x74292566(), "");
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22076x79b79a85 c22076x79b79a85 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22076x79b79a85(context, null, 0, 6, null);
        c22076x79b79a85.setId(com.p314xaae8f345.mm.R.id.uxi);
        containerView.addView(c22076x79b79a85, -2, -2);
    }
}
