package st2;

/* loaded from: classes3.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f493932d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(st2.h1 h1Var) {
        super(2);
        this.f493932d = h1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        l81.b1 bundle = (l81.b1) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        st2.h1 h1Var = this.f493932d;
        h1Var.r();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = h1Var.f493870h;
        boolean z17 = lVar != null && lVar.x0();
        zl2.r4 r4Var = zl2.r4.f555483a;
        boolean x17 = r4Var.x1();
        boolean L9 = ((mm2.c1) h1Var.f493868f.a(mm2.c1.class)).L9();
        boolean y17 = com.p314xaae8f345.mm.ui.bk.y();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "openHalfScreenMiniprogram isLandscape:" + z17 + ", isAnchorMainDevice:" + x17 + ", supportRotate:" + L9 + ", inMagicWindowMode:" + y17);
        if (!z17 || r4Var.x1() || !L9 || y17) {
            h1Var.F(bundle);
        } else if (lVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l.s1(lVar, "PORTRAIT_ACTION_HALF_SCREEN_MINIPRO", bundle, 0, 4, null);
        }
        l81.p0 p0Var = bundle.f398561i;
        dk2.ah ahVar = p0Var instanceof dk2.ah ? (dk2.ah) p0Var : null;
        java.lang.String u17 = pm0.v.u(ahVar != null ? ahVar.f314745e : 0L);
        if (intValue == 1) {
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 R0 = lVar != null ? lVar.R0() : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419 = R0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419) R0 : null;
            ((c61.p2) ybVar).Kj(c14353xe7c1f419 != null ? c14353xe7c1f419.getReportObj() : null, 18054, zl2.r4.k0(r4Var, h1Var.f493868f, 28, u17, 0, null, 24, null));
        } else if (intValue == 2) {
            c61.yb ybVar2 = (c61.yb) i95.n0.c(c61.yb.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 R02 = lVar != null ? lVar.R0() : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f4192 = R02 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419) R02 : null;
            ((c61.p2) ybVar2).Kj(c14353xe7c1f4192 != null ? c14353xe7c1f4192.getReportObj() : null, 18054, zl2.r4.k0(r4Var, h1Var.f493868f, 27, u17, 0, null, 24, null));
        }
        return jz5.f0.f384359a;
    }
}
