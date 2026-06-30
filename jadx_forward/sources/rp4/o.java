package rp4;

/* loaded from: classes5.dex */
public final class o implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.C18821x16ce7839 f480210a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f480211b;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.C18821x16ce7839 c18821x16ce7839, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        this.f480210a = c18821x16ce7839;
        this.f480211b = y0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map k17 = kz5.c1.k(new jz5.l("view_id", "video_edit_other_miaojian_jump_ack"), new jz5.l("post_session_id", ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi()));
        cy1.a aVar = (cy1.a) rVar;
        if (aVar.oj()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(32337);
            if (aVar.oj()) {
                aVar.Dj("view_clk", null, k17, 0, arrayList, true, false, false);
            }
        }
        rp4.n nVar = rp4.n.f480209d;
        dw3.n0 n0Var = dw3.o0.f325774e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.C18821x16ce7839 c18821x16ce7839 = this.f480210a;
        dw3.o0 a17 = n0Var.a(c18821x16ce7839.L, c18821x16ce7839.D());
        java.lang.Integer num = c18821x16ce7839.L;
        java.lang.String str = (num != null && num.intValue() == 1) ? "session" : "moments";
        java.lang.Integer num2 = c18821x16ce7839.L;
        p3325xe03a0797.p3326xc267989b.l.d(this.f480211b, null, null, new rp4.m(this.f480210a, str, a17, (num2 != null && num2.intValue() == 1) ? 0 : null, nVar, null), 3, null);
    }
}
