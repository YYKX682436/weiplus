package wu;

/* loaded from: classes9.dex */
public final class d extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(hu.f uiParams, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiParams, "uiParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        s05.d dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = (com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905) containerView.findViewById(com.p314xaae8f345.mm.R.id.uxi);
        if (abstractC11172x705e5905 == null) {
            return;
        }
        z01.c cVar = new z01.c();
        cVar.f550504t = 1096;
        s15.h hVar = item.f366530e;
        s15.e j17 = hVar.j();
        if (j17 != null) {
            dVar = new s05.d();
            dVar.E(j17.m163575x74292566());
            dVar.R(j17.m163579x6c03c64c());
            dVar.Q(2);
            dVar.S(j17.m163580x52c258a2());
            dVar.T(j17.m163576x9f7ace00());
            dVar.O(j17.m163577xce6ddd64());
            dVar.N(j17.n());
            dVar.H(j17.j());
            dVar.J(j17.k());
            s05.e eVar = new s05.e();
            eVar.k(j17.l());
            dVar.K(eVar);
        } else {
            dVar = null;
        }
        cVar.f550494g = dVar;
        cVar.f550496i = new wu.c(item, this);
        cVar.f550497m = com.p314xaae8f345.mm.R.C30861xcebc809e.d87;
        cVar.f550491d = hVar.m75945x2fec8307(hVar.f384955d + 0);
        hu.f fVar = this.f531143e;
        cVar.f550492e = vu.a.d(item, fVar.q(), fVar.n(), fVar.p());
        s15.e j18 = hVar.j();
        cVar.f550493f = j18 != null ? j18.m163579x6c03c64c() : null;
        cVar.f550499o = k01.d.a(fVar.q());
        cVar.f550500p = fVar.o();
        cVar.f550501q = fVar.q();
        abstractC11172x705e5905.m48330xfcfee142(cVar);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        s15.e j17 = item.f366530e.j();
        if (j17 == null) {
            return;
        }
        hu.f fVar = this.f531143e;
        int a17 = k01.d.a(fVar.q());
        l81.b1 b1Var = new l81.b1();
        b1Var.f398565k = 1096;
        int i17 = 0;
        if (fVar.o().length() > 0) {
            b1Var.f398567l = fVar.o();
        }
        b1Var.f398545a = j17.m163579x6c03c64c();
        java.lang.String k17 = j17.k();
        if (k17 == null) {
            k17 = "";
        }
        b1Var.f398555f = k17;
        b1Var.f398549c = j17.l();
        b1Var.f398551d = -1;
        b1Var.f398547b = j17.m163575x74292566();
        b1Var.Q = a17;
        if (!android.text.TextUtils.isEmpty(b1Var.f398567l)) {
            b1Var.f398567l += ':' + a17 + ':' + fVar.q();
        }
        if (a17 == 1 || a17 == 2) {
            i17 = 1;
        } else if (a17 == 3 || a17 == 4) {
            i17 = 2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
        c11812xa040dc98.f158855d = 6;
        java.lang.String j18 = j17.j();
        c11812xa040dc98.f158859h = j18 != null ? j18 : "";
        b1Var.f398568m = i17;
        b1Var.f398569n = fVar.o() + ':' + fVar.q();
        b1Var.f398574s = c11812xa040dc98;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(view.getContext(), b1Var);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        r31.n Ai = ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 b17 = ((bf5.a) Ai).b(context);
        b17.setId(com.p314xaae8f345.mm.R.id.uxi);
        containerView.addView(b17, -2, -2);
    }
}
