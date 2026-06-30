package wu;

/* loaded from: classes9.dex */
public final class i0 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(hu.f uiParams, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiParams, "uiParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        o15.a aVar;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = (com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905) containerView.findViewById(com.p314xaae8f345.mm.R.id.uxi);
        if (abstractC11172x705e5905 == null) {
            return;
        }
        z01.s sVar = new z01.s();
        s15.h hVar = item.f366530e;
        s15.y E = hVar.E();
        if (E != null) {
            aVar = new o15.a();
            aVar.E(E.k());
            aVar.F(E.l());
            aVar.C(E.o());
            aVar.y(E.j());
            aVar.B(E.m163626x25dda7bf());
            aVar.A(E.n());
            aVar.z("0");
        } else {
            aVar = null;
        }
        sVar.f550691f = aVar;
        sVar.f550689d = java.lang.Long.valueOf(hVar.A());
        s15.i p17 = hVar.p();
        if (p17 == null || (str = p17.j()) == null) {
            str = "";
        }
        sVar.f550690e = str;
        sVar.f550692g = com.p314xaae8f345.mm.R.C30861xcebc809e.d87;
        abstractC11172x705e5905.m48330xfcfee142(sVar);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        o15.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        s15.y E = item.f366530e.E();
        if (E != null) {
            java.text.SimpleDateFormat simpleDateFormat = vu.a.f521579a;
            aVar = new o15.a();
            aVar.E(E.k());
            aVar.F(E.l());
            aVar.C(E.o());
            aVar.y(E.j());
            aVar.B(E.m163626x25dda7bf());
            aVar.A(E.n());
            aVar.z("0");
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 1);
        intent.putExtra("kwebmap_slat", aVar.u());
        intent.putExtra("kwebmap_lng", aVar.w());
        intent.putExtra("kPoiName", aVar.s());
        intent.putExtra("Kwebmap_locaion", aVar.l());
        intent.putExtra("kShowshare", false);
        intent.putExtra("key_is_forward_preview", true);
        j45.l.j(context, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, null);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        r31.n Ai = ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 l17 = ((bf5.a) Ai).l(context);
        l17.setId(com.p314xaae8f345.mm.R.id.uxi);
        containerView.addView(l17, -2, -2);
    }
}
