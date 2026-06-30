package xt1;

/* loaded from: classes15.dex */
public class e extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f537993e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe.B1, "UserCardInfo"), "CREATE INDEX IF NOT EXISTS  stickyIndexIndex ON UserCardInfo ( stickyIndex ) "};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f537994d;

    public e(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe.B1, "UserCardInfo", null);
        this.f537994d = k0Var;
    }

    public android.database.Cursor y0(xt1.r rVar) {
        java.lang.String str = "update UserCardInfo set stickyIndex=0, stickyEndTime=0 where stickyIndex>0 and (" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() + ">stickyEndTime and stickyEndTime<>0)";
        l75.k0 k0Var = this.f537994d;
        k0Var.A("UserCardInfo", str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select * from UserCardInfo");
        switch (rVar) {
            case NORMAL_TYPE:
                sb6.append(" where (status=0 OR status=5)");
                break;
            case INVALID_TYPE:
                sb6.append(" where (status=1 OR status=2 OR status=3 OR status=4 OR status=6)");
                break;
            case CAN_GIFT_TYPE:
                sb6.append(" where (status=0 OR status=5) and (block_mask= '1' OR block_mask= '0' )");
                break;
            case GENERAL_TYPE:
                sb6.append(" where (status=0 OR status=5) AND card_type!=10");
                break;
            case MEMBER_CARD_TYPE:
            case HOME_MEMBER_CARD_TYPE:
                sb6.append(" where (status=0 OR status=5) AND card_type=10");
                break;
            case GENERAL_WITHOUT_INVOICE_TYPE:
                sb6.append(" where (status=0 OR status=5) AND card_type!=10 AND card_type!=30");
                break;
        }
        sb6.append(" order by stickyIndex desc, status asc , updateTime desc");
        if (rVar == xt1.r.HOME_MEMBER_CARD_TYPE) {
            int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_HOME_PAGE_CARD_NUM_INT_SYNC, 3)).intValue();
            sb6.append(" LIMIT ");
            sb6.append(intValue);
        }
        return k0Var.B(sb6.toString(), null);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe z0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe();
        c13038x357affe.f67736x95970a65 = str;
        if (super.get(c13038x357affe, new java.lang.String[0])) {
            return c13038x357affe;
        }
        return null;
    }
}
