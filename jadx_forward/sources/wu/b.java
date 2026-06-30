package wu;

/* loaded from: classes9.dex */
public final class b extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hu.f uiParams, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiParams, "uiParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        java.lang.String P;
        java.lang.String m75945x2fec8307;
        s05.d dVar;
        s05.d dVar2;
        s05.a o17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = (com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905) containerView.findViewById(com.p314xaae8f345.mm.R.id.uxi);
        if (abstractC11172x705e5905 == null || (P = item.f366530e.P()) == null) {
            return;
        }
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(P);
        z01.a aVar = new z01.a();
        v05.b k17 = cVar.k();
        aVar.f550461f = k17 != null ? (s05.d) k17.m75936x14adae67(k17.f513848e + 39) : null;
        aVar.f550464i = new wu.a(item, this);
        v05.b k18 = cVar.k();
        aVar.f550463h = k18 != null ? k18.m75945x2fec8307(k18.f449898d + 3) : null;
        aVar.f550465m = com.p314xaae8f345.mm.R.C30861xcebc809e.d87;
        v05.b k19 = cVar.k();
        aVar.f550459d = k19 != null ? k19.m75945x2fec8307(k19.f449898d + 2) : null;
        v05.b k27 = cVar.k();
        if (k27 == null || (dVar2 = (s05.d) k27.m75936x14adae67(k27.f513848e + 39)) == null || (o17 = dVar2.o()) == null || (m75945x2fec8307 = o17.m163510xabfe893c()) == null) {
            v05.b k28 = cVar.k();
            m75945x2fec8307 = k28 != null ? k28.m75945x2fec8307(k28.f513848e + 12) : null;
        }
        aVar.f550460e = m75945x2fec8307;
        hu.f fVar = this.f531143e;
        aVar.f550466n = k01.d.a(fVar.q());
        aVar.f550467o = fVar.o();
        aVar.f550468p = fVar.q();
        v05.b k29 = cVar.k();
        aVar.f550469q = (k29 == null || (dVar = (s05.d) k29.m75936x14adae67(k29.f513848e + 39)) == null) ? null : dVar.o();
        v05.b k37 = cVar.k();
        aVar.f550462g = k37 != null ? (v05.a) k37.m75936x14adae67(k37.f513848e + 8) : null;
        abstractC11172x705e5905.m48330xfcfee142(aVar);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22069x8b12505d c22069x8b12505d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22069x8b12505d(context, null, 0, 6, null);
        c22069x8b12505d.setId(com.p314xaae8f345.mm.R.id.uxi);
        containerView.addView(c22069x8b12505d, -2, -2);
    }
}
