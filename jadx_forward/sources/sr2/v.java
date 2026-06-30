package sr2;

/* loaded from: classes2.dex */
public final class v implements mv2.w0 {
    @Override // mv2.w0
    /* renamed from: onPostErr */
    public void mo56114x385435c6(long j17, boolean z17) {
    }

    @Override // mv2.w0
    /* renamed from: onPostFakeOk */
    public void mo56115x10614c10(long j17) {
    }

    @Override // mv2.w0
    /* renamed from: onPostNotify */
    public void mo56116x1ed18348(long j17, boolean z17) {
    }

    @Override // mv2.w0
    /* renamed from: onPostOk */
    public void mo56117x5465d15b(long j17, long j18) {
        jz5.f0 f0Var;
        r45.kc4 kc4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(j18);
        if (h17 == null || (kc4Var = (r45.kc4) h17.m59277xa8f45ee4().m75936x14adae67(18)) == null) {
            f0Var = null;
        } else {
            int m75939xb282bd08 = kc4Var.m75939xb282bd08(5);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderPostToCommentListener", "onPostOk: localId=" + j17 + ", svrID=" + pm0.v.u(j18) + " refFeedInfoType:" + kc4Var.m75939xb282bd08(4) + " needPostToComment:" + m75939xb282bd08);
            if (m75939xb282bd08 == 0) {
                return;
            }
            cu2.m mVar = cu2.m.f303953a;
            long m75942xfb822ef2 = kc4Var.m75942xfb822ef2(0);
            java.lang.String m75945x2fec8307 = kc4Var.m75945x2fec8307(1);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            java.lang.String m59299x6bf53a6c = h17.m59299x6bf53a6c();
            java.lang.String m75945x2fec83072 = kc4Var.m75945x2fec8307(2);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            java.lang.String m75945x2fec83073 = kc4Var.m75945x2fec8307(2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 c17 = mVar.c(m75942xfb822ef2, m75945x2fec8307, m59299x6bf53a6c, m75945x2fec83072, null, "", m75945x2fec83073 == null ? "" : m75945x2fec83073, "", "", "", 1, c01.id.c(), false, null, null, 0, kz5.p0.f395529d, null, 0, new cu2.a(false, false, kc4Var.m75945x2fec8307(7), 3, null), null);
            i95.m c18 = i95.n0.c(cq.k.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            r45.l60 l60Var = new r45.l60();
            l60Var.set(1, java.lang.Integer.valueOf(kc4Var.m75939xb282bd08(4)));
            l60Var.set(0, java.lang.Long.valueOf(j18));
            new bq.m(c17, null, l60Var, null, 0).l().q(new cq.w(null, null));
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderPostToCommentListener", "onPostOk: localId=" + j17 + ", svrID=" + pm0.v.u(j18));
        }
    }

    @Override // mv2.w0
    /* renamed from: onPostStart */
    public void mo55429x74e3dc83(long j17) {
    }
}
