package dk2;

/* loaded from: classes3.dex */
public final class q2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315467a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f315468b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f315469c;

    public q2(dk2.r4 r4Var, yz5.p pVar, long j17) {
        this.f315467a = r4Var;
        this.f315468b = pVar;
        this.f315469c = j17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        long j17 = this.f315469c;
        yz5.p pVar = this.f315468b;
        dk2.r4 r4Var = this.f315467a;
        if (i17 != 0 || fVar.f152149b != 0 || fVar.f152151d == null) {
            f0Var = f0Var2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4Var.f315542d, "[WeCoin] getWeCoinBalance rsp error, errType: " + fVar.f152148a + " errCode: " + fVar.f152149b);
            if (pVar != null) {
                pVar.mo149xb9724478(-1L, java.lang.Long.valueOf(j17));
                return f0Var;
            }
            return null;
        }
        mm2.v5 v5Var = (mm2.v5) r4Var.m(mm2.v5.class);
        float m75942xfb822ef2 = (float) ((r45.rr1) fVar.f152151d).m75942xfb822ef2(4);
        v5Var.f411018h = m75942xfb822ef2;
        long c17 = c01.id.c() - v5Var.f411022o;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveRestrictConsumeSlice", "checkUpdateHistoryConsumeBalanceCNY historyBalanceCNY: " + m75942xfb822ef2 + " curHistoryConsumeBalanceCNY: " + v5Var.f411018h + " offestTime: " + c17);
        if (c17 > 30000) {
            v5Var.f411018h = m75942xfb822ef2;
        }
        mm2.v5 v5Var2 = (mm2.v5) r4Var.m(mm2.v5.class);
        float m75942xfb822ef22 = (float) ((r45.rr1) fVar.f152151d).m75942xfb822ef2(2);
        f0Var = f0Var2;
        long c18 = c01.id.c() - v5Var2.f411022o;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveRestrictConsumeSlice", "checkUpdateCurConsumeBalanceCNY newConsumeBalanceCNY: " + m75942xfb822ef22 + " curConsumeBalanceCNY: " + v5Var2.f411017g + " offestTime: " + c18);
        if (c18 > 30000) {
            v5Var2.f411017g = m75942xfb822ef22;
        }
        mm2.v5 v5Var3 = (mm2.v5) r4Var.m(mm2.v5.class);
        km2.j jVar = new km2.j(((r45.rr1) fVar.f152151d).m75942xfb822ef2(1));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4Var.f315542d, "[WeCoin] getWeCoinBalance rsp success data = " + jVar + " curConsumeBalanceCNY: " + ((mm2.v5) r4Var.m(mm2.v5.class)).f411017g + " curHistoryConsumeBalanceCNY: " + ((mm2.v5) r4Var.m(mm2.v5.class)).f411018h);
        v5Var3.f411020m = jVar;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Long.valueOf(((r45.rr1) fVar.f152151d).m75942xfb822ef2(1)), java.lang.Long.valueOf(j17));
            return f0Var;
        }
        return null;
    }
}
