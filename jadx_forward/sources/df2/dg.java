package df2;

/* loaded from: classes3.dex */
public final class dg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ug f311508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f311509e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg(df2.ug ugVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e) {
        super(2);
        this.f311508d = ugVar;
        this.f311509e = c14197x319b1b9e;
    }

    public static final void a(df2.ug ugVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e, dk2.zf zfVar, android.view.View view, wp.i iVar) {
        java.lang.String f17 = zfVar.f();
        if (f17 != null) {
            ((mm2.j2) c14197x319b1b9e.getLiveRoomData().a(mm2.j2.class)).a7(new jz5.l(f17, 2));
        }
        se2.w wVar = se2.w.f488428a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = ugVar.f372632e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar : null;
        yg2.b m57691xa0fa63f9 = k0Var != null ? k0Var.m57691xa0fa63f9() : null;
        gk2.e liveRoomData = c14197x319b1b9e.getLiveRoomData();
        java.lang.Object obj = ugVar.f372632e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type android.view.View");
        android.content.Context context = ((android.view.View) obj).getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        wVar.l(m57691xa0fa63f9, zfVar, view, liveRoomData, context, false);
        xs2.u uVar = ugVar.f313059q;
        if (uVar != null) {
            uVar.b(iVar);
        }
    }

    public static final void d(zp.m mVar, df2.ug ugVar, xs2.p0 p0Var) {
        long j17 = mVar.f556455a;
        float f17 = p0Var.f529871i - xp.d.f().f537381e;
        long j18 = p0Var.f529866d;
        float f18 = f17 - (((float) (j17 - j18)) * p0Var.G);
        if (f18 <= 0.0f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ugVar.f313055m, "showEntireDanmaku waitToShowWidth:" + f18);
            return;
        }
        gm2.c1 c1Var = gm2.c1.f354853a;
        jz5.g gVar = gm2.c1.f354865m;
        float intValue = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() + f18;
        p0Var.f529866d -= (((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() + f18) / p0Var.G;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ugVar.f313055m, "showEntireDanmaku waitToShowWidth:" + f18 + ",forwardDistance:" + intValue + ",sourceFirstDrawTime:" + j18 + ",after forward firstDrawTime:" + p0Var.f529866d);
        xs2.u uVar = ugVar.f313059q;
        if (uVar != null) {
            uVar.d(p0Var);
        }
        float f19 = mVar.f556458d - intValue;
        float f27 = mVar.f556459e;
        mVar.f556458d = f19;
        mVar.f556459e = f27;
    }

    public static final boolean e(zp.m mVar, android.view.View view) {
        if (view.getVisibility() == 0 && mVar.f556456b.x - mVar.f556458d >= view.getLeft()) {
            android.graphics.Point point = mVar.f556456b;
            if (point.x - mVar.f556458d <= view.getRight() && point.y - mVar.f556459e >= view.getTop() && point.y - mVar.f556459e <= view.getBottom()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x01dc, code lost:
    
        if (r0 == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0857  */
    @Override // yz5.p
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo149xb9724478(java.lang.Object r54, java.lang.Object r55) {
        /*
            Method dump skipped, instructions count: 2170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.dg.mo149xb9724478(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
