package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes9.dex */
public final class r2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f276797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f276798e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.s1 f276799f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f276800g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(java.util.Map map, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var, android.content.Context context) {
        super(0);
        this.f276797d = map;
        this.f276798e = i17;
        this.f276799f = s1Var;
        this.f276800g = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Map map = this.f276797d;
        java.lang.String str = (java.lang.String) map.get(".msg.fromusername");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".msg.appmsg.mmreader.");
        int i17 = this.f276798e;
        sb6.append(com.p314xaae8f345.mm.p2621x8fb0427b.s2.g(i17));
        sb6.append(".weapp_username");
        java.lang.String str2 = (java.lang.String) map.get(sb6.toString());
        java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.mmreader." + com.p314xaae8f345.mm.p2621x8fb0427b.s2.g(i17) + ".weapp_path");
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader." + com.p314xaae8f345.mm.p2621x8fb0427b.s2.g(i17) + ".weapp_version"), 0);
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader." + com.p314xaae8f345.mm.p2621x8fb0427b.s2.g(i17) + ".weapp_state"), 0);
        java.lang.String str4 = (java.lang.String) map.get(".msg.appmsg.template_id");
        if (str4 == null) {
            str4 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = this.f276799f;
        sb7.append(s1Var.f67293xd09be28e);
        sb7.append(':');
        sb7.append(str);
        sb7.append(':');
        sb7.append(s1Var.f67306x114ef53e);
        sb7.append(':');
        sb7.append(str4);
        c12559xbdae8559.f169324g = sb7.toString();
        if (((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(str)) {
            c12559xbdae8559.f169323f = 1174;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).aj(this.f276800g, str2, null, P2, P, str3, c12559xbdae8559);
        } else {
            c12559xbdae8559.f169323f = 1174;
            qk.o b17 = r01.z.b(str);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).Vi(this.f276800g, str2, null, P2, P, str3, c12559xbdae8559, b17 == null ? null : b17.f66730x28d45f97);
        }
        return jz5.f0.f384359a;
    }
}
