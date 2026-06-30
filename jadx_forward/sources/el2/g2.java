package el2;

/* loaded from: classes3.dex */
public final class g2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.rc2 f335334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.i2 f335335e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(r45.rc2 rc2Var, el2.i2 i2Var) {
        super(0);
        this.f335334d = rc2Var;
        this.f335335e = i2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        byte[] bArr = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var = k0Var != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0.class) : null;
        el2.i2 i2Var = this.f335335e;
        if (ea0Var != null) {
            r45.rc2 rc2Var = this.f335334d;
            r45.f52 f52Var = (r45.f52) rc2Var.m75936x14adae67(3);
            if (f52Var != null && f52Var.m75939xb282bd08(0) == 5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i2Var.f335362m, "[startPollingPromoteInfo] need_reexpose_report, trigger reReportExpose");
                r45.y23 y23Var = new r45.y23();
                r45.f52 f52Var2 = (r45.f52) rc2Var.m75936x14adae67(3);
                if (f52Var2 != null && (m75934xbce7f2f = f52Var2.m75934xbce7f2f(2)) != null) {
                    bArr = m75934xbce7f2f.g();
                }
                if (bArr != null) {
                    try {
                        y23Var.mo11468x92b714fd(bArr);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                    }
                }
                boolean z17 = ((mm2.f6) ea0Var.P0(mm2.f6.class)).f410582w instanceof cm2.m0;
                java.lang.String str = ea0Var.f193923t;
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "tryReportBubbleReExpose");
                    xt2.e3 y17 = ea0Var.y1();
                    y17.getClass();
                    int mo11219xd0598cf8 = y17.f538236e.mo11219xd0598cf8();
                    java.lang.String str2 = y17.f538239h;
                    if (mo11219xd0598cf8 != 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "reReportExpose return, role != VISITOR");
                    } else if (y23Var.m75942xfb822ef2(0) == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "reReportExpose return, productData is null or invalid");
                    } else if (y17.R == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "reReportExpose return, liveData is null");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "reReportExpose, productId=" + y23Var.m75942xfb822ef2(0));
                        y17.g(124, y23Var);
                        y17.h(new cm2.m0(y23Var));
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "tryReportBubbleReExpose return, no product bubble shown");
                }
                return jz5.f0.f384359a;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i2Var.f335362m, "[startPollingPromoteInfo] need rereport expose but no product bubble plugin or not product type");
        return jz5.f0.f384359a;
    }
}
