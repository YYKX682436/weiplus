package wu;

/* loaded from: classes9.dex */
public final class u1 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(hu.f uiParams, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiParams, "uiParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        java.lang.String m75945x2fec8307;
        s15.f n17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = (com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905) containerView.findViewById(com.p314xaae8f345.mm.R.id.uxi);
        if (abstractC11172x705e5905 == null) {
            return;
        }
        z01.g0 g0Var = new z01.g0();
        s15.h hVar = item.f366530e;
        s15.h0 d07 = hVar.d0();
        if (((d07 == null || (n17 = d07.n()) == null) ? -1 : n17.j()) >= 0) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = containerView.getContext();
            java.lang.String q17 = q(hVar);
            ((ke0.e) xVar).getClass();
            g0Var.f550564d = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, q17);
        } else {
            g0Var.f550564d = q(hVar);
        }
        s15.h0 d08 = hVar.d0();
        if (d08 == null || (m75945x2fec8307 = d08.j()) == null) {
            m75945x2fec8307 = hVar.m75945x2fec8307(hVar.f384955d + 1);
        }
        g0Var.f550565e = m75945x2fec8307;
        g0Var.f550566f = com.p314xaae8f345.mm.R.C30861xcebc809e.d87;
        g0Var.f550570m = new wu.r1(item, this);
        g0Var.f550569i = new wu.s1(item, containerView);
        g0Var.f550571n = new wu.t1(this, abstractC11172x705e5905, item);
        abstractC11172x705e5905.m48330xfcfee142(g0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b8, code lost:
    
        if (r3 == null) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009b A[RETURN] */
    @Override // wu.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(android.view.View r21, hu.b r22) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wu.u1.o(android.view.View, hu.b):void");
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        r31.n Ai = ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 q17 = ((bf5.a) Ai).q(context);
        q17.setId(com.p314xaae8f345.mm.R.id.uxi);
        containerView.addView(q17, -2, -2);
    }

    public final java.lang.String q(s15.h hVar) {
        java.lang.String m163592x7531c8a2;
        s15.h0 d07 = hVar.d0();
        return (d07 == null || (m163592x7531c8a2 = d07.m163592x7531c8a2()) == null) ? hVar.m75945x2fec8307(hVar.f384955d + 0) : m163592x7531c8a2;
    }
}
