package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes5.dex */
public final class l2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 f206644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f206645e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7, boolean z17) {
        super(0);
        this.f206644d = c19783xd9a946b7;
        this.f206645e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String m75945x2fec8307;
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        if (m7Var.Zi()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = this.f206644d;
            java.util.Map j17 = p2Var.j(c19783xd9a946b7);
            j17.put("FeedID", "0");
            boolean z17 = this.f206645e;
            j17.put("PostState", z17 ? "4" : "3");
            java.lang.String m76303xf7b7088 = c19783xd9a946b7.m76303xf7b7088();
            java.lang.String str = "";
            if (m76303xf7b7088 == null) {
                m76303xf7b7088 = "";
            }
            r45.ke4 m76302x72d1d7f7 = c19783xd9a946b7.m76302x72d1d7f7();
            if (m76302x72d1d7f7 != null && (m75945x2fec8307 = m76302x72d1d7f7.m75945x2fec8307(0)) != null) {
                str = m75945x2fec8307;
            }
            m7Var.pj(m76303xf7b7088, str, j17);
            java.util.Map k17 = p2Var.k(c19783xd9a946b7);
            k17.put("feed_id", "0");
            java.lang.String str2 = z17 ? "post_save_exit" : "post_exit";
            k17.put("view_id", str2);
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.yj(str2, null, k17, 6, false);
            k17.put("view_id", "post_out");
            k17.put("post_state", z17 ? "4" : "3");
            aVar.yj("post_out", null, k17, 6, false);
        }
        return jz5.f0.f384359a;
    }
}
