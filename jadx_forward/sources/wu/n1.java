package wu;

/* loaded from: classes9.dex */
public final class n1 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(hu.f uiParams, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiParams, "uiParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a c18734x8eb4224a = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a) containerView.findViewById(com.p314xaae8f345.mm.R.id.uxi);
        if (c18734x8eb4224a == null) {
            return;
        }
        hu.f fVar = this.f531143e;
        java.lang.String d17 = vu.a.d(item, fVar.q(), fVar.n(), fVar.p());
        s15.h hVar = item.f366530e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hVar, "<this>");
        v05.b bVar = new v05.b();
        java.lang.String U = hVar.U();
        int i19 = bVar.f449898d;
        bVar.set(i19 + 9, U);
        java.lang.String S = hVar.S();
        int i27 = bVar.f513848e;
        bVar.set(i27 + 2, S);
        bVar.set(i27 + 0, hVar.T());
        bVar.set(i27 + 3, hVar.T());
        bVar.set(i27 + 46, hVar.J());
        bVar.set(i27 + 47, hVar.K());
        int i28 = hVar.f384955d;
        bVar.set(i19 + 2, hVar.m75945x2fec8307(i28 + 0));
        bVar.set(i19 + 3, hVar.m75945x2fec8307(i28 + 1));
        bVar.set(i27 + 10, 3);
        bVar.set(i27 + 14, hVar.m75945x2fec8307(i28 + 12));
        bVar.set(i19 + 0, hVar.m163586x74292566());
        int i29 = i28 + 2;
        if (hVar.m75939xb282bd08(i29) == 32) {
            bVar.set(i19 + 6, 92);
        } else if (hVar.m75939xb282bd08(i29) == 21) {
            bVar.set(i19 + 6, 76);
        }
        l15.c cVar = new l15.c();
        cVar.q(bVar);
        ff0.y yVar = (ff0.y) i95.n0.c(ff0.y.class);
        v05.b k17 = cVar.k();
        ((r35.g4) yVar).getClass();
        c18734x8eb4224a.c(r35.f4.a(d17, k17));
        c18734x8eb4224a.setOnClickListener(new wu.m1(this, item));
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        q(view, item);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        android.content.Context context = containerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a c18734x8eb4224a = new com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a(context);
        c18734x8eb4224a.setId(com.p314xaae8f345.mm.R.id.uxi);
        containerView.addView(c18734x8eb4224a, i65.a.h(containerView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.amc), -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(android.view.View r38, hu.b r39) {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wu.n1.q(android.view.View, hu.b):void");
    }
}
