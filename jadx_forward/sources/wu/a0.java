package wu;

/* loaded from: classes9.dex */
public final class a0 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(hu.f uiParams, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiParams, "uiParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = (com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905) containerView.findViewById(com.p314xaae8f345.mm.R.id.uxi);
        if (abstractC11172x705e5905 == null) {
            return;
        }
        z01.o oVar = new z01.o();
        x05.k kVar = new x05.k();
        s15.r u17 = item.f366530e.u();
        if (u17 == null || (str = u17.m126747x696739c()) == null) {
            str = "";
        }
        kVar.m126728xdc93280d(str);
        oVar.f550667d = kVar;
        abstractC11172x705e5905.m48330xfcfee142(oVar);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        x05.k kVar = new x05.k();
        s15.r u17 = item.f366530e.u();
        if (u17 == null || (str = u17.m126747x696739c()) == null) {
            str = "";
        }
        kVar.m126728xdc93280d(str);
        int i17 = ct.r2.B0;
        i95.m c17 = i95.n0.c(ct.r2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        te5.t.f500282a.h(view, kVar, "");
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22079xc38c2e3d c22079xc38c2e3d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22079xc38c2e3d(context, null, 0, 6, null);
        c22079xc38c2e3d.setId(com.p314xaae8f345.mm.R.id.uxi);
        containerView.addView(c22079xc38c2e3d, -2, -2);
    }
}
