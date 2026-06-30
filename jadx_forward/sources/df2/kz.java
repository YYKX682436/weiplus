package df2;

/* loaded from: classes3.dex */
public final class kz extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.lz f312145b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(df2.lz lzVar, java.lang.Class cls) {
        super(cls);
        this.f312145b = lzVar;
    }

    @Override // dk2.cb
    public void a(int i17, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312145b.f312263m, "[polling] failed. retCode = " + i17 + ", errMsg = " + errMsg);
    }

    @Override // dk2.cb
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.nt1 result = (r45.nt1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        df2.lz lzVar = this.f312145b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lzVar.f312263m, "info: " + pm0.b0.g(result));
        lzVar.f312268r = false;
        ((mm2.f6) lzVar.m56788xbba4bfc0(mm2.f6.class)).B1.mo7808x76db6cb1((r45.aq4) result.m75936x14adae67(0));
        if (result.m75933x41a8a7f2(1)) {
            java.lang.String str = lzVar.f312265o + result.m75945x2fec8307(2);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(lzVar.f312264n);
            long j17 = M.getLong(str, -1L);
            long c17 = c01.id.c();
            if (j17 < 0) {
                r45.aq4 aq4Var = (r45.aq4) result.m75936x14adae67(0);
                if (aq4Var != null) {
                    lzVar.d7(aq4Var);
                }
                M.putLong(str, c17);
            }
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new df2.xy(M, c17, null), 2, null);
        }
    }
}
