package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ff implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f215935a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f215936b;

    public ff(r45.qt2 qt2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        this.f215935a = qt2Var;
        this.f215936b = c14994x9b99c079;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        r45.oz2 m76978x4bc145c2;
        r45.oz2 m76978x4bc145c22;
        jz5.l[] lVarArr = new jz5.l[6];
        java.lang.String str2 = null;
        r45.qt2 qt2Var = this.f215935a;
        lVarArr[0] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(1) : null);
        lVarArr[1] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(2) : null);
        lVarArr[2] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f215936b;
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(c14994x9b99c079.m59251x5db1b11()));
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c14994x9b99c079.getFeedObject().m76802x2dd01666();
        lVarArr[4] = new jz5.l("template_type", (m76802x2dd01666 == null || (m76978x4bc145c22 = m76802x2dd01666.m76978x4bc145c2()) == null) ? null : java.lang.Integer.valueOf(m76978x4bc145c22.m75939xb282bd08(1)));
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = c14994x9b99c079.getFeedObject().m76802x2dd01666();
        if (m76802x2dd016662 != null && (m76978x4bc145c2 = m76802x2dd016662.m76978x4bc145c2()) != null) {
            str2 = m76978x4bc145c2.m75945x2fec8307(0);
        }
        lVarArr[5] = new jz5.l("templateid", str2);
        return kz5.c1.k(lVarArr);
    }
}
