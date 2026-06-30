package a45;

/* loaded from: classes9.dex */
public final class a extends a45.j {
    @Override // a45.j
    public void n(android.widget.FrameLayout containerView, oi3.e eVar, int i17, int i18) {
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905;
        java.lang.String r17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        if (eVar == null || (abstractC11172x705e5905 = (com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905) containerView.findViewById(com.p314xaae8f345.mm.R.id.uz9)) == null) {
            return;
        }
        v05.b bVar = new v05.b();
        bVar.m126728xdc93280d(eVar.m75945x2fec8307(eVar.f427150d + 13));
        z01.m mVar = new z01.m();
        java.lang.String wi6 = ((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).wi(bVar);
        if (wi6 == null) {
            wi6 = "";
        }
        mVar.f550631i = wi6;
        int i19 = bVar.f513848e;
        v05.a aVar = (v05.a) bVar.m75936x14adae67(i19 + 8);
        java.lang.String f07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(aVar != null ? aVar.m75942xfb822ef2(aVar.f449897d + 0) : 0L);
        if (f07 == null) {
            f07 = "";
        }
        mVar.f550632m = f07;
        mVar.f550633n = com.p314xaae8f345.mm.R.C30861xcebc809e.d89;
        v05.a aVar2 = (v05.a) bVar.m75936x14adae67(i19 + 8);
        java.lang.String str = (aVar2 == null || (r17 = aVar2.r()) == null) ? "" : r17;
        i95.m c17 = i95.n0.c(pt.m0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        mVar.f550636q = pt.m0.oa((pt.m0) c17, false, str, false, false, 12, null);
        abstractC11172x705e5905.m48330xfcfee142(mVar);
    }

    @Override // a45.j
    public void o(android.widget.FrameLayout containerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        r31.n Ai = ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 s17 = ((bf5.a) Ai).s(context);
        s17.setId(com.p314xaae8f345.mm.R.id.uz9);
        containerView.addView(s17, -2, -2);
    }
}
