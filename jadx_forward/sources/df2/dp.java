package df2;

/* loaded from: classes15.dex */
public final class dp extends if2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
        mm2.e1 e1Var;
        super.mo8997x8001c97e();
        mm2.e1 e1Var2 = (mm2.e1) m56788xbba4bfc0(mm2.e1.class);
        long m75942xfb822ef2 = e1Var2.f410521r.m75942xfb822ef2(0);
        ym5.l2 l2Var = ym5.l2.f544957a;
        ym5.i2 i2Var = (ym5.i2) ((jz5.n) ym5.l2.f544958b).mo141623x754a37bb();
        long j17 = i2Var.f544915a;
        if (j17 == m75942xfb822ef2) {
            e1Var = e1Var2;
        } else {
            if (j17 != 0) {
                i2Var.f544915a = 0L;
            }
            i2Var.f544915a = m75942xfb822ef2;
            e1Var = e1Var2;
            i2Var.f544916b = new ym5.h2(m75942xfb822ef2, 0, 0, 0.0d, 0.0d, 0, 0, 0.0d, 0.0d, ac1.g.f19x366c91de, null);
        }
        ym5.u1.f545080b = new df2.cp(pm0.v.u(m75942xfb822ef2), e1Var.R6());
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        ym5.h2 h2Var = null;
        ym5.u1.f545080b = null;
        ym5.l2 l2Var = ym5.l2.f544957a;
        ym5.i2 i2Var = (ym5.i2) ((jz5.n) ym5.l2.f544958b).mo141623x754a37bb();
        if (i2Var.f544915a != 0) {
            i2Var.f544915a = 0L;
            h2Var = i2Var.f544916b;
        }
        if (h2Var != null) {
            long j17 = h2Var.f544896a;
            if (j17 != 0) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6526xcfd7ad15 c6526xcfd7ad15 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6526xcfd7ad15();
                c6526xcfd7ad15.f138793f = c6526xcfd7ad15.b("LiveId", pm0.v.u(j17), true);
                int i17 = h2Var.f544901f;
                c6526xcfd7ad15.f138791d = i17;
                if (i17 > 0) {
                    c6526xcfd7ad15.f138794g = (long) ((h2Var.f544904i * 1000.0d) / h2Var.f544902g);
                    c6526xcfd7ad15.f138796i = (long) (h2Var.f544903h * 1000.0d);
                }
                int i18 = h2Var.f544897b;
                c6526xcfd7ad15.f138792e = i18;
                if (i18 > 0) {
                    c6526xcfd7ad15.f138795h = (long) ((h2Var.f544900e * 1000.0d) / h2Var.f544898c);
                    c6526xcfd7ad15.f138797j = (long) (h2Var.f544899d * 1000.0d);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LivePAGReportController", "report31499 liveId:" + c6526xcfd7ad15.f138793f + ", mainGiftPagCnt:" + c6526xcfd7ad15.f138791d + ", mainGiftPagAvgFrameTimeF:" + c6526xcfd7ad15.f138794g + ", mainGiftPagAvgFrameTimeMaxF:" + c6526xcfd7ad15.f138796i + ",mainGiftRfxCnt:" + c6526xcfd7ad15.f138792e + ", mainGiftRfxAvgFrameTimeF:" + c6526xcfd7ad15.f138795h + ", mainGiftRfxAvgFrameTimeMaxF:" + c6526xcfd7ad15.f138797j);
                c6526xcfd7ad15.k();
            }
        }
    }
}
