package qr2;

/* loaded from: classes2.dex */
public final class b implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f447597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 f447598b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qr2.c f447599c;

    public b(r45.qt2 qt2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var, qr2.c cVar) {
        this.f447597a = qt2Var;
        this.f447598b = z1Var;
        this.f447599c = cVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        r45.dm2 m76806xdef68064;
        r45.vx0 vx0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject3;
        r45.dm2 m76806xdef680642;
        r45.vx0 vx0Var2;
        java.lang.String m75945x2fec8307;
        jz5.l[] lVarArr = new jz5.l[8];
        java.lang.String str3 = "";
        r45.qt2 qt2Var = this.f447597a;
        if (qt2Var == null || (str2 = qt2Var.m75945x2fec8307(2)) == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str2);
        if (qt2Var != null && (m75945x2fec8307 = qt2Var.m75945x2fec8307(1)) != null) {
            str3 = m75945x2fec8307;
        }
        lVarArr[1] = new jz5.l("finder_context_id", str3);
        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var = this.f447598b;
        lVarArr[3] = new jz5.l("collection_id", java.lang.Long.valueOf(z1Var.f204043f));
        qr2.c cVar = this.f447599c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var2 = cVar.f447601f;
        java.lang.Integer num = null;
        lVarArr[4] = new jz5.l("feedid", z1Var2 != null ? java.lang.Long.valueOf(z1Var2.f204042e) : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var3 = cVar.f447601f;
        lVarArr[5] = new jz5.l("feed_episode", (z1Var3 == null || (feedObject2 = z1Var3.getFeedObject()) == null || (feedObject3 = feedObject2.getFeedObject()) == null || (m76806xdef680642 = feedObject3.m76806xdef68064()) == null || (vx0Var2 = (r45.vx0) m76806xdef680642.m75936x14adae67(0)) == null) ? null : java.lang.Integer.valueOf(vx0Var2.m75939xb282bd08(6)));
        lVarArr[6] = new jz5.l("click_feedid", java.lang.Long.valueOf(z1Var.mo2128x1ed62e84()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject4 = z1Var.getFeedObject();
        if (feedObject4 != null && (feedObject = feedObject4.getFeedObject()) != null && (m76806xdef68064 = feedObject.m76806xdef68064()) != null && (vx0Var = (r45.vx0) m76806xdef68064.m75936x14adae67(0)) != null) {
            num = java.lang.Integer.valueOf(vx0Var.m75939xb282bd08(6));
        }
        lVarArr[7] = new jz5.l("click_feed_episode", num);
        return kz5.c1.k(lVarArr);
    }
}
