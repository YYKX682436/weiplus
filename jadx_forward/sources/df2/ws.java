package df2;

/* loaded from: classes10.dex */
public final class ws implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.h f313239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.lt f313240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f313241f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f313242g;

    public ws(dk2.h hVar, df2.lt ltVar, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f313239d = hVar;
        this.f313240e = ltVar;
        this.f313241f = z17;
        this.f313242g = h0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        int itemId = menuItem.getItemId();
        java.lang.String str2 = df2.lt.W;
        if (itemId != 0) {
            if (menuItem.getItemId() == df2.lt.f312231p0) {
                rl2.f fVar = (rl2.f) ((jz5.n) ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).f148534y).mo141623x754a37bb();
                synchronized (fVar) {
                    fVar.f478728f.clear();
                    fVar.m145256x1d3f4980("delete * from " + fVar.mo145255x88e404c3(), new java.lang.String[0]);
                }
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "click dislike banner menu");
        r45.bm1 bm1Var = this.f313239d.f315078h;
        if (bm1Var == null || (str = bm1Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        df2.lt ltVar = this.f313240e;
        dk2.h hVar = this.f313239d;
        ltVar.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.LivePromoteBannerController", "dislikeId is empty");
        } else {
            java.lang.String str3 = ((mm2.c1) ltVar.m56788xbba4bfc0(mm2.c1.class)).f410385o;
            if (zl2.r4.f555483a.w1()) {
                str3 = xy2.c.e(ltVar.O6());
            }
            new db2.y1(((mm2.e1) ltVar.m56788xbba4bfc0(mm2.e1.class)).f410516m, ((mm2.e1) ltVar.m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(((mm2.e1) ltVar.m56788xbba4bfc0(mm2.e1.class)).f410518o), str3, ((mm2.e1) ltVar.m56788xbba4bfc0(mm2.e1.class)).f410525v, str).l().K(df2.rr.f312797a);
            pm0.v.X(new df2.ur(ltVar, str, hVar));
        }
        df2.lt ltVar2 = this.f313240e;
        ltVar2.t7(ltVar2.k7(str, 3));
        if (this.f313241f) {
            df2.lt ltVar3 = this.f313240e;
            ltVar3.t7(ltVar3.k7(str, 5));
        } else {
            df2.lt ltVar4 = this.f313240e;
            ltVar4.t7(ltVar4.k7(str, 4));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f313240e.f372632e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar : null;
        if (k0Var != null) {
            qo0.c.a(k0Var, qo0.b.J4, null, 2, null);
        }
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0) this.f313242g.f391656d).u();
    }
}
