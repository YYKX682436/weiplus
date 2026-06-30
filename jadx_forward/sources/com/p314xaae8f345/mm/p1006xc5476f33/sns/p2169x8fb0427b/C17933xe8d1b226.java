package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* renamed from: com.tencent.mm.plugin.sns.storage.SnsInfo */
/* loaded from: classes4.dex */
public class C17933xe8d1b226 extends dm.va {

    /* renamed from: COL_ID */
    public static final java.lang.String f38305x76d1ec5a = "rowid";

    /* renamed from: SECONDS_OF_DAY */
    public static final long f38306x251f8af4 = 86400;

    /* renamed from: SECONDS_OF_HOUR */
    public static final long f38307x7ed3d96c = 3600;

    /* renamed from: SECONDS_OF_MINUTE */
    public static final long f38308x2173c39c = 60;

    /* renamed from: TABLEINDEXHEAD */
    public static final java.lang.String f38309x29874da4 = "serverSnsTimeHeadIndex";

    /* renamed from: TABLEINDEXLOCALFLAG */
    public static final java.lang.String f38310xf8b6f3f3 = "snsLocalflagIndex";

    /* renamed from: TABLEINDEXMULTI1 */
    public static final java.lang.String f38311xee596cfc = "snsMultiIndex1";

    /* renamed from: TABLEINDEXMULTI2 */
    public static final java.lang.String f38312xee596cfd = "snsMultiIndex2";

    /* renamed from: TABLEINDEXMULTI3 */
    public static final java.lang.String f38313xee596cfe = "snsMultiIndex3";

    /* renamed from: TABLEINDEXSOURCE */
    public static final java.lang.String f38314xf84602df = "serverSnsTimeSourceTypeIndex";

    /* renamed from: TABLEINDEXTIME */
    public static final java.lang.String f38315x298cd291 = "serverSnsTimeIndex";

    /* renamed from: TABLEINDEXUSERNAME */
    public static final java.lang.String f38316x86e37e9a = "serverSnsNameIndex";
    private static final java.lang.String TAG = "MicroMsg.SnsInfo";

    /* renamed from: adsnsinfo */
    private com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 f38321x478b3ca3;

    /* renamed from: localid */
    public int f38324x142bbdc6;

    /* renamed from: info */
    protected static l75.e0 f38319x3164ae = dm.va.m125574x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.class);

    /* renamed from: cacheTimeLine */
    protected static java.util.Map<java.lang.String, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720> f38318x46ba03 = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: cacheMediaPost */
    protected static java.util.Map<java.lang.String, r45.kj4> f38317x8704ad42 = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: contentByteMd5 */
    public java.lang.String f38322x2a5be89d = null;

    /* renamed from: postinfoMd5 */
    public java.lang.String f38326x30a0d550 = null;

    /* renamed from: ExtFlag */
    public int f38320x15579d0d = 0;

    /* renamed from: withTaUsername */
    public java.lang.CharSequence f38327x15490bc9 = "";

    /* renamed from: isAd */
    private boolean f38323x3172ed = false;

    /* renamed from: postInfo */
    private r45.kj4 f38325x2d1a216e = null;

    public C17933xe8d1b226() {
    }

    /* renamed from: formatUnixTime */
    public static int m70333xed21118c(long j17) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("formatUnixTime", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date(1000 * j17));
        try {
            i17 = java.lang.Integer.valueOf(format).intValue();
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "error valueOf  " + format);
            i17 = (int) (j17 / 86400);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatUnixTime", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i17;
    }

    /* renamed from: getNewSnsInfo */
    public static com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 m70334x974cac7c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNewSnsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
        c17933xe8d1b2262.f38324x142bbdc6 = c17933xe8d1b226.f38324x142bbdc6;
        c17933xe8d1b2262.f68891x29d1292e = c17933xe8d1b226.f68891x29d1292e;
        c17933xe8d1b2262.f68896xdde069b = c17933xe8d1b226.f68896xdde069b;
        c17933xe8d1b2262.f68886x52c1d072 = c17933xe8d1b226.f68886x52c1d072;
        c17933xe8d1b2262.f68883xac3be4e = c17933xe8d1b226.f68883xac3be4e;
        c17933xe8d1b2262.f68884x225c7205 = c17933xe8d1b226.f68884x225c7205;
        c17933xe8d1b2262.f68887xa4146ebd = c17933xe8d1b226.f68887xa4146ebd;
        c17933xe8d1b2262.f68895x2262335f = c17933xe8d1b226.f68895x2262335f;
        c17933xe8d1b2262.f68892x76e81a5a = c17933xe8d1b226.f68892x76e81a5a;
        c17933xe8d1b2262.f68885x5f778948 = c17933xe8d1b226.f68885x5f778948;
        c17933xe8d1b2262.f68889xcb0372e6 = c17933xe8d1b226.f68889xcb0372e6;
        c17933xe8d1b2262.f68893x8f55c989 = c17933xe8d1b226.f68893x8f55c989;
        c17933xe8d1b2262.f68882xad49e234 = c17933xe8d1b226.f68882xad49e234;
        c17933xe8d1b2262.f68881x4c58c87d = c17933xe8d1b226.f68881x4c58c87d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNewSnsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return c17933xe8d1b2262;
    }

    /* renamed from: isPhotoType */
    public static boolean m70336x13b21a82(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPhotoType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = true;
        if (i17 != 54 && i17 != 1) {
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPhotoType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: release */
    public static synchronized void m70337x41012807() {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.class) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("release", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            f38318x46ba03.clear();
            f38317x8704ad42.clear();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("release", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        }
    }

    /* renamed from: addSourceFlag */
    public void m70338xbeec15a8(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addSourceFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68892x76e81a5a = i17 | this.f68892x76e81a5a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSourceFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: canDeal */
    public boolean m70339x20bd885c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canDeal", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = this.f68891x29d1292e != 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canDeal", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: cleanPostHolding */
    public void m70340xb2d65bfa() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanPostHolding", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68886x52c1d072 &= -513;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanPostHolding", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: cleanWsFoldFlag */
    public void m70341xbcb87932() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanWsFoldFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68886x52c1d072 &= -1025;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanWsFoldFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: clearItemDie */
    public void m70342x7cb6f560() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearItemDie", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68886x52c1d072 &= -33;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearItemDie", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: clearWsFeedTypeFlag */
    public void m70343xacb0922d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearWsFeedTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68886x52c1d072 &= -4097;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearWsFeedTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    @Override // dm.va, l75.f0
    /* renamed from: convertFrom */
    public void mo9015xbf5d97fd(android.database.Cursor cursor) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        super.mo9015xbf5d97fd(cursor);
        this.f38324x142bbdc6 = (int) this.f72763xa3c65b86;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: dumpAd */
    public java.lang.String m70345xb1489537() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dumpAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 m70351xaa22b9ed = m70351xaa22b9ed();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f68893x8f55c989);
        stringBuffer.append(m70351xaa22b9ed.f67593x28cf0d8f);
        stringBuffer.append(" <createtime " + this.f68883xac3be4e + ">");
        stringBuffer.append(" <exposuretime " + m70351xaa22b9ed.f67600xa9e31799 + ">");
        stringBuffer.append(" <adcreatetime " + m70351xaa22b9ed.f67597x480f98d1 + "> ");
        stringBuffer.append(m70351xaa22b9ed.m70311x485d7().f39013x4c306a8a);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dumpAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return stringBuffer2;
    }

    /* renamed from: getAdInfo */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (m70377x3172ed() && this.f38321x478b3ca3 == null) {
            this.f38321x478b3ca3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(this.f68891x29d1292e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883 = this.f38321x478b3ca3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771 = c17932x22276883 == null ? new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771(null) : c17932x22276883.m70299x10413e67();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return c17902x72cc1771;
    }

    /* renamed from: getAdInfoLink */
    public java.lang.String m70348x7741d701() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdInfoLink", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = m70346x10413e67();
        if (m70346x10413e67 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdInfoLink", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return "";
        }
        java.lang.String str = m70346x10413e67.f38062xf8d4efd3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdInfoLink", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return str;
    }

    /* renamed from: getAdLink */
    public java.lang.String m70349x104289b3() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdLink", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70354x74235b3e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdLink", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return "";
        }
        java.lang.String str = m70354x74235b3e.f38137xf8d4efd3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdLink", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return str;
    }

    /* renamed from: getAdRecSrc */
    public int m70350x13c652ad() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdRecSrc", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70354x74235b3e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdRecSrc", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return 0;
        }
        int i17 = m70354x74235b3e.f38271xc8460334;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdRecSrc", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i17;
    }

    /* renamed from: getAdSnsInfo */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 m70351xaa22b9ed() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdSnsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (m70377x3172ed() && this.f38321x478b3ca3 == null) {
            this.f38321x478b3ca3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(this.f68891x29d1292e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883 = this.f38321x478b3ca3;
        if (c17932x22276883 != null) {
            c17932x22276883.f67598xac3be4e = this.f68883xac3be4e;
            c17932x22276883.f67615xdde069b = this.f68896xdde069b;
            c17932x22276883.f67603x5f778948 = this.f68885x5f778948;
            c17932x22276883.f67595x4c58c87d = this.f68881x4c58c87d;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdSnsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return c17932x22276883;
    }

    /* renamed from: getAdTitle */
    public java.lang.String m70352xf87f7fbf() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdTitle", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70354x74235b3e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdTitle", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return "";
        }
        java.lang.String str = m70354x74235b3e.f38145x2239dd9f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdTitle", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return str;
    }

    /* renamed from: getAdType */
    public int m70353x104668f3() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return -1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = m70371x485d7();
        if (m70354x74235b3e.m70147xe6739387()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return 3;
        }
        if (m70354x74235b3e.m70135xd6a8f11d() || m70354x74235b3e.m70141x35f5a38c()) {
            if (m70371x485d7 == null || m70371x485d7.f39014x86965dde.f451370e != 15 || m70371x485d7.f39035x65f3785d == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
                return 4;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return 5;
        }
        if (m70354x74235b3e.m70138x335a70cf()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return 9;
        }
        if (m70354x74235b3e.m70160x35b2ea06()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return 10;
        }
        if (m70354x74235b3e.m70151x59316745()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return 12;
        }
        if (m70354x74235b3e.m70139x9b8322ea()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return 13;
        }
        int i17 = this.f68895x2262335f != 1 ? 2 : 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i17;
    }

    /* renamed from: getAdXml */
    public synchronized com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdXml", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (m70377x3172ed() && this.f38321x478b3ca3 == null) {
            this.f38321x478b3ca3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(this.f68891x29d1292e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883 = this.f38321x478b3ca3;
        c17903x3b438f4 = c17932x22276883 == null ? new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4(null) : c17932x22276883.m70300x74235b3e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdXml", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return c17903x3b438f4;
    }

    /* renamed from: getAid */
    public java.lang.String m70355xb5882a06() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = m70346x10413e67();
        java.lang.String str = m70346x10413e67 == null ? "" : m70346x10413e67.aid;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return str;
    }

    /* renamed from: getAtAdInfo */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70356x450e1efa() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAtAdInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (m70377x3172ed() && this.f38321x478b3ca3 == null) {
            this.f38321x478b3ca3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(this.f68891x29d1292e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883 = this.f38321x478b3ca3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771 = c17932x22276883 == null ? new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771(null) : c17932x22276883.m70301x450e1efa();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAtAdInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return c17902x72cc1771;
    }

    /* renamed from: getCreateTime */
    public int m70357x3fdd41df() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCreateTime", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i17 = this.f68883xac3be4e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCreateTime", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i17;
    }

    @Override // dm.va, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        l75.e0 e0Var = f38319x3164ae;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return e0Var;
    }

    /* renamed from: getDynamicInfoId */
    public java.lang.String m70358xc9f597d2() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDynamicInfoId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        java.lang.String m70122xc9f597d2 = m70354x74235b3e().m70122xc9f597d2();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDynamicInfoId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return m70122xc9f597d2;
    }

    /* renamed from: getHead */
    public int m70359xfb803656() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHead", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i17 = this.f68884x225c7205;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHead", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i17;
    }

    /* renamed from: getLikeFlag */
    public int m70360xbd8ebd19() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLikeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i17 = this.f68885x5f778948;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLikeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i17;
    }

    /* renamed from: getLocalFlag */
    public int m70361xb79116c1() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLocalFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i17 = this.f68886x52c1d072;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLocalFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i17;
    }

    /* renamed from: getLocalPrivate */
    public int m70362xf8db520e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLocalPrivate", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i17 = this.f68887xa4146ebd;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLocalPrivate", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i17;
    }

    /* renamed from: getLocalid */
    public java.lang.String m70363x51f8f990() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLocalid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (m70377x3172ed()) {
            java.lang.String j17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.j("ad_table_", this.f38324x142bbdc6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLocalid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return j17;
        }
        java.lang.String j18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.j("sns_table_", this.f38324x142bbdc6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLocalid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return j18;
    }

    /* renamed from: getPostBuf */
    public byte[] m70364x267b657d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPostBuf", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        byte[] bArr = this.f68888x5d40d76e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPostBuf", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return bArr;
    }

    /* renamed from: getPostInfo */
    public r45.kj4 m70365xa8f45ee4() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPostInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        byte[] bArr = this.f68888x5d40d76e;
        if (bArr == null) {
            r45.kj4 kj4Var = new r45.kj4();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPostInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return kj4Var;
        }
        if (this.f38326x30a0d550 == null) {
            this.f38326x30a0d550 = kk.k.g(bArr);
        }
        if (f38317x8704ad42.containsKey(this.f38326x30a0d550)) {
            r45.kj4 kj4Var2 = f38317x8704ad42.get(this.f38326x30a0d550);
            this.f38325x2d1a216e = kj4Var2;
            if (kj4Var2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPostInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
                return kj4Var2;
            }
        }
        try {
            r45.kj4 kj4Var3 = (r45.kj4) new r45.kj4().mo11468x92b714fd(this.f68888x5d40d76e);
            this.f38325x2d1a216e = kj4Var3;
            f38317x8704ad42.put(this.f38326x30a0d550, kj4Var3);
            r45.kj4 kj4Var4 = this.f38325x2d1a216e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPostInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return kj4Var4;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "error get snsinfo timeline!");
            r45.kj4 kj4Var5 = new r45.kj4();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPostInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return kj4Var5;
        }
    }

    /* renamed from: getPravited */
    public int m70366x291aa6b7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPravited", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i17 = this.f68889xcb0372e6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPravited", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i17;
    }

    /* renamed from: getSnsId */
    public java.lang.String m70367x7525eefd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        java.lang.String m70335x7525eefd = m70335x7525eefd(m70377x3172ed(), this.f68891x29d1292e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return m70335x7525eefd;
    }

    /* renamed from: getSnsInfo */
    public java.lang.String m70368xc3665610() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        java.lang.String str = "snsId: " + this.f68893x8f55c989 + " \n  localFlag: " + this.f68886x52c1d072 + " #\u3000 \n  type: " + this.f68895x2262335f + " lp: " + this.f68887xa4146ebd + " \n  isPr: " + this.f68889xcb0372e6 + " head: " + this.f68884x225c7205 + " \n  time: " + this.f68883xac3be4e + " \n ";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return str;
    }

    /* renamed from: getSourceType */
    public int m70369xac019deb() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSourceType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i17 = this.f68892x76e81a5a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSourceType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i17;
    }

    /* renamed from: getStringSeq */
    public java.lang.String m70370xf4250fd8() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStringSeq", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        java.lang.String str = this.f68893x8f55c989;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStringSeq", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return str;
    }

    /* renamed from: getTimeLine */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (this.f68882xad49e234 == null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 i17 = m21.y.i();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return i17;
        }
        if (this.f38322x2a5be89d == null) {
            this.f38322x2a5be89d = kk.k.g(this.f68882xad49e234) + kk.k.g(this.f68881x4c58c87d);
        }
        if (f38318x46ba03.containsKey(this.f38322x2a5be89d) && (c19807x593d1720 = f38318x46ba03.get(this.f38322x2a5be89d)) != null && c19807x593d1720.f39014x86965dde != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return c19807x593d1720;
        }
        try {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d17202 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720().mo11468x92b714fd(this.f68882xad49e234);
            if (c19807x593d17202 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "error timeLineObj is null!");
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 i18 = m21.y.i();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
                return i18;
            }
            if (c19807x593d17202.f39014x86965dde != null) {
                f38318x46ba03.put(this.f38322x2a5be89d, c19807x593d17202);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
                return c19807x593d17202;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "error timeLineObj.ContentObj is null!");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 i19 = m21.y.i();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return i19;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "error get snsinfo timeline!");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 i27 = m21.y.i();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return i27;
        }
    }

    /* renamed from: getTraceid */
    public java.lang.String m70372xfe2dfcea() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTraceid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = m70346x10413e67();
        java.lang.String str = m70346x10413e67 == null ? "" : m70346x10413e67.f38103xc060c120;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTraceid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return str;
    }

    /* renamed from: getTypeFlag */
    public int m70373x5384133c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i17 = this.f68895x2262335f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return i17;
    }

    /* renamed from: getUserName */
    public java.lang.String m70374x6bf53a6c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUserName", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        java.lang.String str = this.f68896xdde069b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserName", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return str;
    }

    /* renamed from: getUxinfo */
    public java.lang.String m70375x338a8cc7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUxinfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = m70346x10413e67();
        if (m70346x10413e67 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUxinfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return "";
        }
        java.lang.String str = m70346x10413e67.f38104xce64ddf1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUxinfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return str;
    }

    /* renamed from: hasAdDynamicInfo */
    public boolean m70376xaa9e0f0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasAdDynamicInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = m70377x3172ed() && m70354x74235b3e() != null && m70354x74235b3e().m70128xaa9e0f0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasAdDynamicInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isAd */
    public boolean m70377x3172ed() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean m70414xa57c8812 = m70414xa57c8812(32);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return m70414xa57c8812;
    }

    /* renamed from: isAdForbidAutoPlay */
    public boolean m70378x4c74e984() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdForbidAutoPlay", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdForbidAutoPlay", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70354x74235b3e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdForbidAutoPlay", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        boolean m70140xf2f65501 = m70354x74235b3e.m70140xf2f65501();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdForbidAutoPlay", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return m70140xf2f65501;
    }

    /* renamed from: isAdIpInteractVideo */
    public boolean m70379x7e206751() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdIpInteractVideo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdIpInteractVideo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70354x74235b3e != null && m70354x74235b3e.m70132x7e206751()) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdIpInteractVideo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isBreakFrameAd */
    public boolean m70380x4b83eebb() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isBreakFrameAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isBreakFrameAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70354x74235b3e != null && m70354x74235b3e.m70131xa5a206c0()) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isBreakFrameAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isBreakFrameGestureAd */
    public boolean m70381xf5d0b9b4() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isBreakFrameGestureAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isBreakFrameGestureAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70354x74235b3e != null && m70354x74235b3e.m70134xf5d0b9b4()) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isBreakFrameGestureAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isCardAd */
    public boolean m70382xd6a8f11d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = m70377x3172ed() && m70354x74235b3e() != null && m70354x74235b3e().m70135xd6a8f11d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isCollectedAd */
    public boolean m70383x1a72c1c2() {
        s34.e1 e1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isCollectedAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCollectedAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70354x74235b3e != null && (e1Var = m70354x74235b3e.f38234xd35781a) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isCollectedAd", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
            boolean z18 = e1Var.f484159a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCollectedAd", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
            if (z18) {
                z17 = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCollectedAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isCombinedGridAD */
    public boolean m70384xbd5ce118() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isCombinedGridAD", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = m70377x3172ed() && m70354x74235b3e() != null && m70354x74235b3e().m70136xbd5ce118();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCombinedGridAD", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isCoverPostFailed */
    public boolean m70385xe531c98a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isCoverPostFailed", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (this.f68886x52c1d072 & 2048) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCoverPostFailed", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isDeadSource */
    public boolean m70386x7517269() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDeadSource", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (this.f68892x76e81a5a & 270) == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDeadSource", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isDieItem */
    public boolean m70387x403f7b29() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDieItem", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (this.f68886x52c1d072 & 32) > 0 && this.f68891x29d1292e == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDieItem", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isDragAd */
    public boolean m70388xd945aa41() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDragAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDragAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70396x35f5a38c() && m70354x74235b3e != null && (nVar = m70354x74235b3e.f38182x86831750) != null && nVar.f38337x4c39e945 != null) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDragAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isDynamicAD */
    public boolean m70389xb10b9698() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDynamicAD", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = m70377x3172ed() && m70354x74235b3e() != null && m70354x74235b3e().m70137xb10b9698();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDynamicAD", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isExposures */
    public boolean m70390x5f796642() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExposures", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (this.f68886x52c1d072 & 128) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExposures", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isExtFlag */
    public boolean m70391x8f904ca3() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExtFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (this.f68886x52c1d072 & 2) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExtFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isFinderAd */
    public boolean m70392xa843b633() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFinderAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFinderAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = m70346x10413e67();
        if (m70354x74235b3e != null && m70354x74235b3e.f38174xaf3f2677 != null && m70346x10413e67 != null && m70346x10413e67.f38067xf8d8cf13 == 9) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFinderAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isFinderTopicCardAd */
    public boolean m70393xc6818152() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFinderTopicCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = m70377x3172ed() && m70354x74235b3e() != null && m70354x74235b3e().m70138x335a70cf();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFinderTopicCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isFireworkCheerAd */
    public boolean m70394x2cf577f() {
        mb4.c cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFireworkCheerAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFireworkCheerAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70396x35f5a38c() && m70354x74235b3e != null && (cVar = m70354x74235b3e.f38211x1b3eca3e) != null && cVar.f406921m != null) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFireworkCheerAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isFlipCardAd */
    public boolean m70395x9b8322ea() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFlipCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = m70377x3172ed() && m70354x74235b3e() != null && m70354x74235b3e().m70139x9b8322ea();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFlipCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isFullCardAd */
    public boolean m70396x35f5a38c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFullCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = m70377x3172ed() && m70354x74235b3e() != null && m70354x74235b3e().m70141x35f5a38c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFullCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isGestureAd */
    public boolean m70397x79a17942() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isGestureAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isGestureAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70354x74235b3e != null && m70354x74235b3e.m70142x79a17942()) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isGestureAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isInValid */
    public boolean m70398x507e494d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isInValid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = this.f68891x29d1292e == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isInValid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isLocalInvisible */
    public boolean m70399xd479b04c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLocalInvisible", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (this.f68886x52c1d072 & 256) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLocalInvisible", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isLongPressGestureAd */
    public boolean m70400xed24eaaf() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLongPressGestureAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLongPressGestureAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70354x74235b3e != null && m70354x74235b3e.m70148xed24eaaf()) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLongPressGestureAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isLookbookCardAd */
    public boolean m70401x59316745() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLookbookCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = m70377x3172ed() && m70354x74235b3e() != null && m70354x74235b3e().m70151x59316745();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLookbookCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isNoCopy */
    public boolean m70402xea1e5aa0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isNoCopy", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (this.f68890x658b81e5 & 128) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isNoCopy", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isOmittedFailResend */
    public boolean m70403x896c7879() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isOmittedFailResend", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (this.f68886x52c1d072 & 64) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOmittedFailResend", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isPatAd */
    public boolean m70404x7b40c91c() {
        mb4.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPatAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPatAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70412xa290b704() && (aVar = m70354x74235b3e.f38211x1b3eca3e.f406922n) != null && aVar.a() != null && m70354x74235b3e.f38211x1b3eca3e.f406922n.a().d() && m70354x74235b3e.f38211x1b3eca3e.f406922n.b() != null && m70354x74235b3e.f38211x1b3eca3e.f406922n.b().d()) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPatAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isPhoto */
    public boolean m70405x7b43eb28() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPhoto", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int i17 = this.f68895x2262335f;
        boolean z17 = true;
        if (i17 != 54 && i17 != 1) {
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPhoto", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isRecExpAd */
    public boolean m70406x9ec757ba() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isRecExpAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isRecExpAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70354x74235b3e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isRecExpAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        boolean m70155x9ec757ba = m70354x74235b3e.m70155x9ec757ba();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isRecExpAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return m70155x9ec757ba;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (m70365xa8f45ee4().S == false) goto L10;
     */
    /* renamed from: isSecurityNeedVerifyDieItem */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m70407x5f660a9a() {
        /*
            r4 = this;
            java.lang.String r0 = "isSecurityNeedVerifyDieItem"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            boolean r2 = r4.m70387x403f7b29()
            if (r2 == 0) goto L20
            r45.kj4 r2 = r4.m70365xa8f45ee4()
            int r2 = r2.R
            r3 = 1
            if (r2 != r3) goto L20
            r45.kj4 r2 = r4.m70365xa8f45ee4()
            boolean r2 = r2.S
            if (r2 != 0) goto L20
            goto L21
        L20:
            r3 = 0
        L21:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.m70407x5f660a9a():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (m70365xa8f45ee4().S != false) goto L10;
     */
    /* renamed from: isSecurityPassDieItem */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m70408x3dd1d178() {
        /*
            r4 = this;
            java.lang.String r0 = "isSecurityPassDieItem"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            boolean r2 = r4.m70387x403f7b29()
            if (r2 == 0) goto L20
            r45.kj4 r2 = r4.m70365xa8f45ee4()
            int r2 = r2.R
            r3 = 1
            if (r2 != r3) goto L20
            r45.kj4 r2 = r4.m70365xa8f45ee4()
            boolean r2 = r2.S
            if (r2 == 0) goto L20
            goto L21
        L20:
            r3 = 0
        L21:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.m70408x3dd1d178():boolean");
    }

    /* renamed from: isShakeAd */
    public boolean m70409x57def53f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isShakeAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShakeAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70354x74235b3e != null && m70354x74235b3e.m70157x57def53f()) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShakeAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isSlideCardAd */
    public boolean m70410x5869fcda() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSlideCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = m70377x3172ed() && m70354x74235b3e() != null && m70354x74235b3e().m70159x16bc2e57();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSlideCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isSlideFullCardAd */
    public boolean m70411x94a088c9() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSlideFullCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = m70377x3172ed() && m70354x74235b3e() != null && m70354x74235b3e().m70160x35b2ea06();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSlideFullCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isSocialAttitudeAd */
    public boolean m70412xa290b704() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSocialAttitudeAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSocialAttitudeAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70354x74235b3e != null && m70354x74235b3e.f38211x1b3eca3e != null) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSocialAttitudeAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isSolidBreakFrameAd */
    public boolean m70413xd8243ab2() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSolidBreakFrameAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSolidBreakFrameAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70354x74235b3e != null && m70354x74235b3e.m70133x90460dcf()) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSolidBreakFrameAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isSourceExist */
    public boolean m70414xa57c8812(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSourceExist", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (i17 & this.f68892x76e81a5a) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSourceExist", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isSphereCardAd */
    public boolean m70415xc14c77ca() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSphereCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = m70377x3172ed() && m70354x74235b3e() != null && m70354x74235b3e().m70161xc14c77ca();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSphereCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isTimeLimit */
    public boolean m70416x475c02e4(int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isTimeLimit", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_post_retry_limit, 50);
        if (Ni > 0 && i17 >= Ni) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTimeLimit", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(j17 / 1000) > 7200) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTimeLimit", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTimeLimit", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return false;
    }

    /* renamed from: isTurnCardAd */
    public boolean m70417x6b0d56fa() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isTurnCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = m70371x485d7() != null && m70371x485d7().f39014x86965dde.f451370e == 27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTurnCardAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isTwistAd */
    public boolean m70418xa6d27920() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isTwistAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTwistAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70354x74235b3e != null && m70354x74235b3e.m70162xa6d27920()) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTwistAd", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isValid */
    public boolean m70419x7b953cf2() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = this.f68891x29d1292e != 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isValidAdBrandTopicInfo */
    public boolean m70420x734f0ecb() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValidAdBrandTopicInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidAdBrandTopicInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70354x74235b3e != null && m70354x74235b3e.f38151xe359b1b9 != null) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidAdBrandTopicInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isValidAdHeadStateInfo */
    public boolean m70421xaf68c82a() {
        x84.e eVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValidAdHeadStateInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidAdHeadStateInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70354x74235b3e != null && (eVar = m70354x74235b3e.f38185x37270f7c) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUnreadStateImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h1 h1Var = eVar.f534119a;
            f06.v[] vVarArr = x84.e.f534118f;
            java.lang.String str = (java.lang.String) ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0) h1Var).a(eVar, vVarArr[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUnreadStateImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            x84.e eVar2 = m70354x74235b3e.f38185x37270f7c;
            eVar2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUnreadStateDarkImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            java.lang.String str2 = (java.lang.String) ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0) eVar2.f534120b).a(eVar2, vVarArr[1]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUnreadStateDarkImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            x84.e eVar3 = m70354x74235b3e.f38185x37270f7c;
            eVar3.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReadStateImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            java.lang.String str3 = (java.lang.String) ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0) eVar3.f534121c).a(eVar3, vVarArr[2]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReadStateImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            x84.e eVar4 = m70354x74235b3e.f38185x37270f7c;
            eVar4.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReadStateDarkImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            java.lang.String str4 = (java.lang.String) ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0) eVar4.f534122d).a(eVar4, vVarArr[3]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReadStateDarkImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str, str2, str3, str4)) {
                z17 = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidAdHeadStateInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isValidAdHighLightInfo */
    public boolean m70422xc1e3f8ad() {
        u84.l lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValidAdHighLightInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidAdHighLightInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70354x74235b3e != null && (lVar = m70354x74235b3e.f38186xfe1dfe57) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            java.lang.String str = lVar.f507109a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str, m70354x74235b3e.f38186xfe1dfe57.a())) {
                z17 = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidAdHighLightInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isValidAdHotDiscussedBarInfo */
    public boolean m70423xd31b2d5a() {
        u84.h0 h0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValidAdHotDiscussedBarInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidAdHotDiscussedBarInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70354x74235b3e != null && (h0Var = m70354x74235b3e.f38187xe0872f2c) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
            java.lang.String str = h0Var.f507074c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str, m70354x74235b3e.f38187xe0872f2c.a())) {
                z17 = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidAdHotDiscussedBarInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isValidAdRandomSelectCardInfo */
    public boolean m70424x69f960f2() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValidAdRandomSelectCardInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidAdRandomSelectCardInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70354x74235b3e != null && m70354x74235b3e.f38269x78c3fa0 != null) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidAdRandomSelectCardInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isValidAdRockPaperScissorsInfo */
    public boolean m70425x3b12277() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValidAdRockPaperScissorsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidAdRockPaperScissorsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70354x74235b3e != null && m70354x74235b3e.f38203x6623f7c9 != null) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidAdRockPaperScissorsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isValidAdStateSettingBarInfo */
    public boolean m70426x79442aed() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValidAdStateSettingBarInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidAdStateSettingBarInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        u84.o1 o1Var = m70354x74235b3e().f38213x86b02cbf;
        if (o1Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidAdStateSettingBarInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        if (o1Var.b() == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getJumpLinkTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            java.lang.String str = o1Var.f507162d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getJumpLinkTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidAdStateSettingBarInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return z17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getJumpLinkTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
        java.lang.String str2 = o1Var.f507162d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getJumpLinkTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
        boolean z18 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str2, o1Var.a());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidAdStateSettingBarInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z18;
    }

    /* renamed from: isValidAdWorldCupAvatarInfo */
    public boolean m70427x988f09a8() {
        m84.w wVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValidAdWorldCupAvatarInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidAdWorldCupAvatarInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70354x74235b3e != null && (wVar = m70354x74235b3e.f38221xeb928596) != null && wVar.c()) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidAdWorldCupAvatarInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isValidGeneralPAGInfo */
    public boolean m70428x74fdee() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.d0 d0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValidGeneralPAGInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidGeneralPAGInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.a aVar = m70354x74235b3e().f38148x45aae8e9;
        if (aVar == null || (d0Var = aVar.f244860d) == null || !d0Var.d()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidGeneralPAGInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        if (aVar.f244857a > 0 && aVar.f244858b > 0 && aVar.f244859c > 0) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidGeneralPAGInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isValidSingleProductInfo */
    public boolean m70429x5f360203() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValidSingleProductInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidSingleProductInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        s34.t1 t1Var = m70354x74235b3e().f38273xf07fbcd5;
        if (t1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBrandImageUrl", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
            java.lang.String str = (java.lang.String) ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0) t1Var.f484310d).a(t1Var, s34.t1.f484306j[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBrandImageUrl", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str, t1Var.f484311e)) {
                if (t1Var.f484307a > 0 && t1Var.f484308b > 0 && t1Var.f484309c > 0) {
                    z17 = true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidSingleProductInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
                return z17;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidSingleProductInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return false;
    }

    /* renamed from: isWaitPost */
    public boolean m70430xdf5582ff() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isWaitPost", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (this.f68886x52c1d072 & 16) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWaitPost", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isWithMe */
    public boolean m70431xf93b92c8() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isWithMe", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (this.f68886x52c1d072 & 1) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWithMe", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isWsFeedType */
    public boolean m70432xa2b6bdbe() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isWsFeedType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (this.f68886x52c1d072 & 4096) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWsFeedType", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isWsFold */
    public boolean m70433xf9b3b2c7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isWsFold", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = (this.f68886x52c1d072 & 1024) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWsFold", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: isWxWork */
    public boolean m70434xfa01e35c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isWxWork", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 f07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(this.f68896xdde069b);
        boolean z17 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(this.f68896xdde069b) && "3552365301".equals(f07 == null ? null : f07.Q0());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWxWork", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: needDynamicViewUpdate */
    public boolean m70435x4b407f77() {
        s34.l lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("needDynamicViewUpdate", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        boolean z17 = false;
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("needDynamicViewUpdate", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = m70354x74235b3e();
        if (m70354x74235b3e != null && (lVar = m70354x74235b3e.f38168x6891f311) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNumberRequestParams", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicFeedUpdateInfo");
            java.lang.String str = lVar.f484231a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNumberRequestParams", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicFeedUpdateInfo");
            if (!android.text.TextUtils.isEmpty(str)) {
                z17 = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("needDynamicViewUpdate", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return z17;
    }

    /* renamed from: printInfo */
    public void m70436x94df6cfb() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("printInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("printInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: readFromBundle */
    public void m70437x9c96ff02(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("readFromBundle", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (bundle == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("readFromBundle", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return;
        }
        m70344xbf5d97fd((android.content.ContentValues) bundle.getParcelable("values"));
        this.f38324x142bbdc6 = bundle.getInt("localid");
        android.os.Bundle bundle2 = bundle.getBundle("adValues");
        if (bundle2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883();
            c17932x22276883.m70319x9c96ff02(bundle2);
            this.f38321x478b3ca3 = c17932x22276883;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("readFromBundle", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: removeSourceFlag */
    public void m70438xfb6d55cb(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeSourceFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68892x76e81a5a = (~i17) & this.f68892x76e81a5a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeSourceFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setAdSnsInfo */
    public void m70439x6767a61(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 c17932x22276883) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdSnsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f38321x478b3ca3 = c17932x22276883;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdSnsInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setAttrBuf */
    public void m70440x8904a400(byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAttrBuf", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68881x4c58c87d = bArr;
        this.f38322x2a5be89d = kk.k.g(this.f68882xad49e234) + kk.k.g(this.f68881x4c58c87d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAttrBuf", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setContent */
    public boolean m70441xe9f5bdb7(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setContent", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        try {
            this.f68882xad49e234 = m21.y.q(str).mo14344x5f01b1f6();
            this.f38322x2a5be89d = kk.k.g(this.f68882xad49e234) + kk.k.g(this.f68881x4c58c87d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContent", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContent", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
    }

    /* renamed from: setCoverPostFailed */
    public void m70442xd1a4c352() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCoverPostFailed", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68886x52c1d072 |= 2048;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCoverPostFailed", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setCreateTime */
    public void m70443x6e018feb(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCreateTime", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "setCreateTime >> lastCreateTime: %d, currentCreateTime: %d, localId: %d", java.lang.Integer.valueOf(this.f68883xac3be4e), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f38324x142bbdc6));
        int i18 = this.f68883xac3be4e;
        if (i17 - i18 >= 180 || i17 - i18 < 0) {
            this.f68883xac3be4e = i17;
            m70446x764afd62(m70333xed21118c(i17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCreateTime", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        } else {
            if (this.f68884x225c7205 == 0) {
                m70446x764afd62(m70333xed21118c(i18));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCreateTime", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        }
    }

    /* renamed from: setExposures */
    public void m70444x74fd560a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setExposures", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68886x52c1d072 |= 128;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setExposures", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setExtFlag */
    public void m70445x635d8e6b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setExtFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68886x52c1d072 |= 2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setExtFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setHead */
    public void m70446x764afd62(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setHead", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68884x225c7205 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHead", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setItemDie */
    public void m70447x2f60ddab() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setItemDie", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68886x52c1d072 |= 32;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setItemDie", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setLikeFlag */
    public void m70448xb8471e25(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLikeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68885x5f778948 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLikeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setLocalFlag */
    public void m70449x13e4d735(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLocalFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68886x52c1d072 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLocalFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setLocalInvisible */
    public void m70450xe45c5d84() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLocalInvisible", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68886x52c1d072 |= 256;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLocalInvisible", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setLocalPrivate */
    public void m70451x2f244d1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLocalPrivate", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68887xa4146ebd |= 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLocalPrivate", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setLocalVisible */
    public void m70452x5db51809() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLocalVisible", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68886x52c1d072 &= -257;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLocalVisible", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setLocalid */
    public void m70453xc56a4704(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLocalid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f38324x142bbdc6 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLocalid", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setOmittedFailResend */
    public void m70454x25082041() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOmittedFailResend", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68886x52c1d072 |= 64;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOmittedFailResend", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setPostBuf */
    public void m70455x99ecb2f1(byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPostBuf", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68888x5d40d76e = bArr;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPostBuf", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setPostFinish */
    public void m70456x661b1f55() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPostFinish", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68886x52c1d072 &= -17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPostFinish", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setPostHolding */
    public void m70457xd133bc41() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPostHolding", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68886x52c1d072 |= 512;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPostHolding", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setPostInfo */
    public void m70458xa3acbff0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPostInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        try {
            m70455x99ecb2f1(this.f38325x2d1a216e.mo14344x5f01b1f6());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "toByteArray error");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPostInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setPostWaiting */
    public void m70459xd2aa5bcb() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPostWaiting", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68886x52c1d072 |= 16;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPostWaiting", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setPravited */
    public void m70460x23d307c3(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPravited", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68889xcb0372e6 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPravited", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setSecurityVerifyPass */
    public void m70461x961ba38c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSecurityVerifyPass", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        m70365xa8f45ee4().S = true;
        m70458xa3acbff0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSecurityVerifyPass", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setSnsId */
    public void m70462x53b40971(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68891x29d1292e = j17;
        if (j17 != 0) {
            m70463x5078d04c(j17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setStringSeq */
    public void m70464x5078d04c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStringSeq", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68893x8f55c989 = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStringSeq", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setSubTypeFlag */
    public void m70465x963f7264(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSubTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68894x5334f55 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSubTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setTimeLine */
    public void m70466xfabce6e3(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        try {
            this.f68882xad49e234 = c19807x593d1720.mo14344x5f01b1f6();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
        this.f38322x2a5be89d = kk.k.g(this.f68882xad49e234) + kk.k.g(this.f68881x4c58c87d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setTypeFlag */
    public void m70467x4e3c7448(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68895x2262335f = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setUserName */
    public void m70468x66ad9b78(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUserName", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68896xdde069b = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUserName", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setWithMe */
    public void m70469x295af800() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setWithMe", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68886x52c1d072 |= 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setWithMe", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setWsFeedTypeFlag */
    public void m70470xd989cf82() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setWsFeedTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68886x52c1d072 |= 4096;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setWsFeedTypeFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: setWsFoldFlag */
    public void m70471x5a9a740b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setWsFoldFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68886x52c1d072 |= 1024;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setWsFoldFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: unLocalPrivate */
    public void m70472x585e04d1() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unLocalPrivate", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68887xa4146ebd = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unLocalPrivate", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: unSetExtFlag */
    public void m70473x58a4cde4() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unSetExtFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68886x52c1d072 &= -3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unSetExtFlag", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: unSetWithMe */
    public void m70474xa4e16567() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unSetWithMe", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68886x52c1d072 &= -2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unSetWithMe", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: unsetOmittedFailResend */
    public void m70475x9dfe85a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unsetOmittedFailResend", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (m70403x896c7879()) {
            this.f68886x52c1d072 &= -65;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unsetOmittedFailResend", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: useNewAdSocialLogic */
    public boolean m70476xc7eb81b5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("useNewAdSocialLogic", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (!m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useNewAdSocialLogic", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return false;
        }
        boolean m70404x7b40c91c = m70404x7b40c91c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useNewAdSocialLogic", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return m70404x7b40c91c;
    }

    /* renamed from: writeToBundle */
    public android.os.Bundle m70477xb128fdc() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("writeToBundle", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("values", super.mo9763xeb27878e());
        bundle.putInt("localid", this.f38324x142bbdc6);
        if (m70351xaa22b9ed() != null) {
            bundle.putBundle("adValues", m70351xaa22b9ed().m70331xb128fdc());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("writeToBundle", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return bundle;
    }

    /* renamed from: getSnsId */
    public static java.lang.String m70335x7525eefd(boolean z17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (z17) {
            java.lang.String j18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.j("ad_table_", j17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return j18;
        }
        java.lang.String j19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.j("sns_table_", j17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return j19;
    }

    /* renamed from: setStringSeq */
    public void m70463x5078d04c(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStringSeq", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68893x8f55c989 = ca4.z0.s0(j17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStringSeq", "com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    /* renamed from: convertFrom */
    public android.content.ContentValues m70344xbf5d97fd(android.content.ContentValues contentValues) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        this.f68891x29d1292e = contentValues.getAsLong("snsId").longValue();
        this.f68896xdde069b = contentValues.getAsString("userName");
        this.f68886x52c1d072 = contentValues.getAsInteger("localFlag").intValue();
        this.f68883xac3be4e = contentValues.getAsInteger("createTime").intValue();
        this.f68884x225c7205 = contentValues.getAsInteger("head").intValue();
        this.f68887xa4146ebd = contentValues.getAsInteger("localPrivate").intValue();
        this.f68895x2262335f = contentValues.getAsInteger("type").intValue();
        this.f68892x76e81a5a = contentValues.getAsInteger("sourceType").intValue();
        this.f68885x5f778948 = contentValues.getAsInteger("likeFlag").intValue();
        this.f68889xcb0372e6 = contentValues.getAsInteger("pravited").intValue();
        this.f68893x8f55c989 = contentValues.getAsString("stringSeq");
        this.f68882xad49e234 = contentValues.getAsByteArray("content");
        this.f68881x4c58c87d = contentValues.getAsByteArray("attrBuf");
        this.f68888x5d40d76e = contentValues.getAsByteArray("postBuf");
        this.f68894x5334f55 = contentValues.getAsInteger("subType").intValue();
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return contentValues;
    }

    /* renamed from: getAdInfo */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70347x10413e67(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70356x450e1efa = m70356x450e1efa();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
            return m70356x450e1efa;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = m70346x10413e67();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdInfo", "com.tencent.mm.plugin.sns.storage.SnsInfo");
        return m70346x10413e67;
    }

    public C17933xe8d1b226(long j17) {
        m70462x53b40971(j17);
    }
}
