package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdSnsInfo */
/* loaded from: classes4.dex */
public class C17932x22276883 extends dm.n {

    /* renamed from: COL_ID */
    public static final java.lang.String f38292x76d1ec5a = "rowid";

    /* renamed from: TABLEINDEXHEAD */
    public static final java.lang.String f38293x29874da4 = "serverAdSnsTimeHeadIndex";

    /* renamed from: TABLEINDEXLOCALFLAG */
    public static final java.lang.String f38294xf8b6f3f3 = "AdsnsLocalflagIndex";

    /* renamed from: TABLEINDEXMULTI1 */
    public static final java.lang.String f38295xee596cfc = "adsnsMultiIndex1";

    /* renamed from: TABLEINDEXMULTI2 */
    public static final java.lang.String f38296xee596cfd = "adsnsMultiIndex2";

    /* renamed from: TABLEINDEXSOURCE */
    public static final java.lang.String f38297xf84602df = "serverAdSnsTimeSourceTypeIndex";

    /* renamed from: TABLEINDEXTIME */
    public static final java.lang.String f38298x298cd291 = "serverAdSnsTimeIndex";

    /* renamed from: TABLEINDEXUSERNAME */
    public static final java.lang.String f38299x86e37e9a = "serverAdSnsNameIndex";
    public static final java.lang.String TAG = "MicroMsg.AdSnsInfo";

    /* renamed from: contentByteMd5 */
    public java.lang.String f38303x2a5be89d = null;

    /* renamed from: localid */
    protected int f38304x142bbdc6;

    /* renamed from: info */
    protected static l75.e0 f38302x3164ae = dm.n.m125242x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883.class);

    /* renamed from: cacheAdXml */
    protected static java.util.Map<java.lang.String, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4> f38301xd7692 = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: cacheAdInfo */
    protected static java.util.Map<java.lang.String, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771> f38300x19a8d93 = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: getADXmlCache */
    public static com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70295xd7d9dac4(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getADXmlCache", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !f38301xd7692.containsKey(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getADXmlCache", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4 = f38301xd7692.get(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getADXmlCache", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return c17903x3b438f4;
    }

    /* renamed from: addSourceFlag */
    public void m70296xbeec15a8(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addSourceFlag", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.f67611x76e81a5a = i17 | this.f67611x76e81a5a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSourceFlag", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    @Override // dm.n, l75.f0
    /* renamed from: convertFrom */
    public void mo9015xbf5d97fd(android.database.Cursor cursor) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertFrom", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        super.mo9015xbf5d97fd(cursor);
        this.f38304x142bbdc6 = (int) this.f72763xa3c65b86;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertFrom", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    /* renamed from: convertToSnsInfo */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 m70298xd15b2ed8() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertToSnsInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
        c17933xe8d1b226.m70466xfabce6e3(m70311x485d7());
        c17933xe8d1b226.m70453xc56a4704(this.f38304x142bbdc6);
        c17933xe8d1b226.m70468x66ad9b78(this.f67615xdde069b);
        c17933xe8d1b226.m70443x6e018feb(this.f67598xac3be4e);
        c17933xe8d1b226.m70448xb8471e25(this.f67603x5f778948);
        c17933xe8d1b226.m70462x53b40971(this.f67610x29d1292e);
        c17933xe8d1b226.f68892x76e81a5a = this.f67611x76e81a5a;
        c17933xe8d1b226.f68882xad49e234 = this.f67596xad49e234;
        c17933xe8d1b226.m70338xbeec15a8(2);
        c17933xe8d1b226.m70338xbeec15a8(32);
        c17933xe8d1b226.f68881x4c58c87d = this.f67595x4c58c87d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
        m70371x485d7.f39018xf3f56116 = this.f67615xdde069b;
        c17933xe8d1b226.m70460x23d307c3(m70371x485d7.f39017xbebdef61);
        c17933xe8d1b226.m70445x635d8e6b();
        c17933xe8d1b226.m70466xfabce6e3(m70371x485d7);
        r45.a90 a90Var = m70371x485d7.f39014x86965dde;
        if (a90Var != null) {
            c17933xe8d1b226.m70467x4e3c7448(a90Var.f451370e);
            c17933xe8d1b226.m70465x963f7264(m70371x485d7.f39014x86965dde.f451374i);
        }
        c17933xe8d1b226.m70439x6767a61(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertToSnsInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return c17933xe8d1b226;
    }

    /* renamed from: getAdInfo */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70299x10413e67() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        java.lang.String str = this.f67592xf10bd636;
        if (str == null) {
            c17902x72cc1771 = null;
        } else {
            if (f38300x19a8d93.containsKey(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc17712 = f38300x19a8d93.get(this.f67592xf10bd636);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
                return c17902x72cc17712;
            }
            c17902x72cc1771 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771(this.f67592xf10bd636);
            f38300x19a8d93.put(this.f67592xf10bd636, c17902x72cc1771);
        }
        if (c17902x72cc1771 == null) {
            c17902x72cc1771 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return c17902x72cc1771;
    }

    /* renamed from: getAdXml */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70300x74235b3e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdXml", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        java.lang.String str = this.f67593x28cf0d8f;
        if (str == null) {
            c17903x3b438f4 = null;
        } else {
            if (f38301xd7692.containsKey(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f42 = f38301xd7692.get(this.f67593x28cf0d8f);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdXml", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
                return c17903x3b438f42;
            }
            c17903x3b438f4 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4(this.f67593x28cf0d8f);
            m44.a.f(c17903x3b438f4, ca4.z0.t0(this.f67610x29d1292e));
            f38301xd7692.put(this.f67593x28cf0d8f, c17903x3b438f4);
        }
        if (c17903x3b438f4 == null) {
            c17903x3b438f4 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdXml", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return c17903x3b438f4;
    }

    /* renamed from: getAtAdInfo */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70301x450e1efa() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAtAdInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        java.lang.String str = this.f67594xe7057709;
        if (str == null) {
            c17902x72cc1771 = null;
        } else {
            if (f38300x19a8d93.containsKey(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc17712 = f38300x19a8d93.get(this.f67594xe7057709);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAtAdInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
                return c17902x72cc17712;
            }
            c17902x72cc1771 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771(this.f67594xe7057709);
            f38300x19a8d93.put(this.f67594xe7057709, c17902x72cc1771);
        }
        if (c17902x72cc1771 == null) {
            c17902x72cc1771 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAtAdInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return c17902x72cc1771;
    }

    /* renamed from: getAtFriendRemindInfoSelfInfo */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m70302xec4a6114() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAtFriendRemindInfoSelfInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        if (m70308xe0bbc4b6() == null || m70308xe0bbc4b6().f463395e == null || m70308xe0bbc4b6().f463395e.f462248f == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAtFriendRemindInfoSelfInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return null;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = m70308xe0bbc4b6().f463395e.f462248f.f453374f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAtFriendRemindInfoSelfInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return gVar;
    }

    /* renamed from: getAtFriendRemindInfoSourceInfo */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m70303x1b6a23e3() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAtFriendRemindInfoSourceInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        if (m70308xe0bbc4b6() == null || m70308xe0bbc4b6().f463395e == null || m70308xe0bbc4b6().f463395e.f462247e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAtFriendRemindInfoSourceInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return null;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = m70308xe0bbc4b6().f463395e.f462247e.f453374f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAtFriendRemindInfoSourceInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return gVar;
    }

    @Override // dm.n, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDBInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        l75.e0 e0Var = f38302x3164ae;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDBInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return e0Var;
    }

    /* renamed from: getExpId */
    public int m70304x74652662() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExpId", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70307x2d5d385d = m70307x2d5d385d();
        int i17 = m70307x2d5d385d == null ? 0 : m70307x2d5d385d.f38270xce0fb168;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExpId", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return i17;
    }

    /* renamed from: getLocalid */
    public java.lang.String m70305x51f8f990() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLocalid", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        java.lang.String i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.i("ad_table_", this.f38304x142bbdc6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLocalid", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return i17;
    }

    /* renamed from: getRecSrc */
    public int m70306x2d5d262a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRecSrc", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70307x2d5d385d = m70307x2d5d385d();
        int i17 = m70307x2d5d385d == null ? 0 : m70307x2d5d385d.f38271xc8460334;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRecSrc", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return i17;
    }

    /* renamed from: getRecXml */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70307x2d5d385d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRecXml", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        java.lang.String str = this.f67608xe19bc6c;
        if (str == null) {
            c17903x3b438f4 = null;
        } else {
            if (f38301xd7692.containsKey(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f42 = f38301xd7692.get(this.f67608xe19bc6c);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRecXml", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
                return c17903x3b438f42;
            }
            c17903x3b438f4 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4(this.f67608xe19bc6c);
            m44.a.f(c17903x3b438f4, ca4.z0.t0(this.f67610x29d1292e));
            f38301xd7692.put(this.f67608xe19bc6c, c17903x3b438f4);
        }
        if (c17903x3b438f4 == null) {
            c17903x3b438f4 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRecXml", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return c17903x3b438f4;
    }

    /* renamed from: getRemindInfoGroup */
    public r45.o3 m70308xe0bbc4b6() {
        r45.o3 o3Var;
        java.lang.Exception e17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRemindInfoGroup", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        r45.o3 o3Var2 = null;
        try {
        } catch (java.lang.Exception e18) {
            o3Var = null;
            e17 = e18;
        }
        if (this.f67609x4becb5a7 != null) {
            o3Var = new r45.o3();
            try {
                o3Var.mo11468x92b714fd(this.f67609x4becb5a7);
            } catch (java.lang.Exception e19) {
                e17 = e19;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "parse remindInfo error! " + e17.getMessage());
                o3Var2 = o3Var;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRemindInfoGroup", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
                return o3Var2;
            }
            o3Var2 = o3Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRemindInfoGroup", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return o3Var2;
    }

    /* renamed from: getSnsId */
    public java.lang.String m70309x7525eefd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsId", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        java.lang.String j17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.j("ad_table_", this.f67610x29d1292e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsId", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return j17;
    }

    /* renamed from: getSource */
    public int m70310x2fa78b11() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSource", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70307x2d5d385d = m70307x2d5d385d();
        int i17 = m70307x2d5d385d == null ? 0 : m70307x2d5d385d.f38271xc8460334;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSource", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return i17;
    }

    /* renamed from: getTimeLine */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70311x485d7() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        java.lang.String t07 = ca4.z0.t0(this.f67610x29d1292e);
        if (this.f67596xad49e234 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46354x528304bf, 124);
            ca4.q.c("error timeLineObject, field==null, snsId=" + t07, new java.lang.RuntimeException("field_content==null"));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 i17 = m21.y.i();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return i17;
        }
        if (this.f38303x2a5be89d == null) {
            this.f38303x2a5be89d = kk.k.g(this.f67596xad49e234) + kk.k.g(this.f67595x4c58c87d);
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.f38318x46ba03.containsKey(this.f38303x2a5be89d) && (c19807x593d1720 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.f38318x46ba03.get(this.f38303x2a5be89d)) != null && c19807x593d1720.f39014x86965dde != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return c19807x593d1720;
        }
        try {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d17202 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720().mo11468x92b714fd(this.f67596xad49e234);
            if (c19807x593d17202 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "error timeLineObj is null! snsid = " + m70309x7525eefd());
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46354x528304bf, 124);
                ca4.q.c("error timeLineObject, timeLineObj==null, snsId=" + t07, new java.lang.RuntimeException("timeLineObj==null"));
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 i18 = m21.y.i();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
                return i18;
            }
            if (c19807x593d17202.f39014x86965dde != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.f38318x46ba03.put(this.f38303x2a5be89d, c19807x593d17202);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
                return c19807x593d17202;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "error timeLineObj.ContentObj is null!  snsid = " + m70309x7525eefd());
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46354x528304bf, 124);
            ca4.q.c("error timeLineObject, ContentObj==null, snsId=" + t07, new java.lang.RuntimeException("ContentObj==null"));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 i19 = m21.y.i();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return i19;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "error get snsinfo timeline! parse exp=" + e17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46354x528304bf, 124);
            ca4.q.c("error timeLineObject, parse exp, snsId=" + t07, e17);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 i27 = m21.y.i();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return i27;
        }
    }

    /* renamed from: getTimelineRemindInfoSelfInfo */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m70312x94afa0a4() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTimelineRemindInfoSelfInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        if (m70308xe0bbc4b6() == null || m70308xe0bbc4b6().f463394d == null || m70308xe0bbc4b6().f463394d.f462248f == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimelineRemindInfoSelfInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return null;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = m70308xe0bbc4b6().f463394d.f462248f.f453374f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimelineRemindInfoSelfInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return gVar;
    }

    /* renamed from: getTimelineRemindInfoSourceInfo */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m70313x3f7dbf73() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTimelineRemindInfoSourceInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        if (m70308xe0bbc4b6() == null || m70308xe0bbc4b6().f463394d == null || m70308xe0bbc4b6().f463394d.f462247e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimelineRemindInfoSourceInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return null;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = m70308xe0bbc4b6().f463394d.f462247e.f453374f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimelineRemindInfoSourceInfo", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return gVar;
    }

    /* renamed from: isCollectedAd */
    public boolean m70314x1a72c1c2() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isCollectedAd", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70300x74235b3e = m70300x74235b3e();
        boolean z17 = false;
        if (m70300x74235b3e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCollectedAd", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return false;
        }
        s34.e1 e1Var = m70300x74235b3e.f38234xd35781a;
        if (e1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isCollectedAd", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
            boolean z18 = e1Var.f484159a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCollectedAd", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
            if (z18) {
                z17 = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCollectedAd", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return z17;
    }

    /* renamed from: isExposured */
    public boolean m70315x5f796633() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExposured", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        boolean z17 = (this.f67604x52c1d072 & 128) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExposured", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return z17;
    }

    /* renamed from: isLocalInvisible */
    public boolean m70316xd479b04c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLocalInvisible", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        boolean z17 = (this.f67604x52c1d072 & 256) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLocalInvisible", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return z17;
    }

    /* renamed from: isRecExpAd */
    public boolean m70317x9ec757ba() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isRecExpAd", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70300x74235b3e = m70300x74235b3e();
        if (m70300x74235b3e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isRecExpAd", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return false;
        }
        boolean m70155x9ec757ba = m70300x74235b3e.m70155x9ec757ba();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isRecExpAd", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return m70155x9ec757ba;
    }

    /* renamed from: isSourceExist */
    public boolean m70318xa57c8812(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSourceExist", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        boolean z17 = (i17 & this.f67611x76e81a5a) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSourceExist", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return z17;
    }

    /* renamed from: readFromBundle */
    public void m70319x9c96ff02(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("readFromBundle", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        if (bundle == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("readFromBundle", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return;
        }
        m70297xbf5d97fd((android.content.ContentValues) bundle.getParcelable("values"));
        this.f38304x142bbdc6 = bundle.getInt("localid");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("readFromBundle", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    /* renamed from: removeSourceFlag */
    public void m70320xfb6d55cb(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeSourceFlag", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.f67611x76e81a5a = (~i17) & this.f67611x76e81a5a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeSourceFlag", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    /* renamed from: setAttrBuf */
    public void m70321x8904a400(byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAttrBuf", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.f67595x4c58c87d = bArr;
        this.f38303x2a5be89d = kk.k.g(this.f67596xad49e234) + kk.k.g(this.f67595x4c58c87d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAttrBuf", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    /* renamed from: setContent */
    public boolean m70322xe9f5bdb7(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setContent", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        try {
            this.f67596xad49e234 = m21.y.q(str).mo14344x5f01b1f6();
            this.f38303x2a5be89d = kk.k.g(this.f67596xad49e234) + kk.k.g(this.f67595x4c58c87d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContent", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContent", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
            return false;
        }
    }

    /* renamed from: setExposures */
    public void m70323x74fd560a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setExposures", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.f67604x52c1d072 |= 128;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setExposures", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    /* renamed from: setLocalInvisible */
    public void m70324xe45c5d84() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLocalInvisible", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.f67604x52c1d072 |= 256;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLocalInvisible", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    /* renamed from: setLocalVisible */
    public void m70325x5db51809() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLocalVisible", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.f67604x52c1d072 &= -257;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLocalVisible", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    /* renamed from: setNotExposured */
    public void m70326xb6afa42c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNotExposured", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.f67604x52c1d072 &= -129;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNotExposured", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    /* renamed from: setRemindInfoGroup */
    public void m70327x17925e2a(r45.o3 o3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRemindInfoGroup", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        try {
            this.f67609x4becb5a7 = o3Var.mo14344x5f01b1f6();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "remindInfo toBytes error! " + e17.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRemindInfoGroup", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    /* renamed from: setSnsId */
    public void m70328x53b40971(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsId", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.f67610x29d1292e = j17;
        if (j17 != 0) {
            m70329x5078d04c(j17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsId", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    /* renamed from: setStringSeq */
    public void m70329x5078d04c(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStringSeq", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        java.lang.String t07 = ca4.z0.t0(j17);
        this.f67612x8f55c989 = t07;
        this.f67612x8f55c989 = ca4.z0.A(t07);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStringSeq", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    /* renamed from: setTimeLine */
    public void m70330xfabce6e3(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        try {
            this.f67596xad49e234 = c19807x593d1720.mo14344x5f01b1f6();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTimeLine", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
    }

    /* renamed from: writeToBundle */
    public android.os.Bundle m70331xb128fdc() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("writeToBundle", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("values", super.mo9763xeb27878e());
        bundle.putInt("localid", this.f38304x142bbdc6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("writeToBundle", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return bundle;
    }

    /* renamed from: convertFrom */
    public android.content.ContentValues m70297xbf5d97fd(android.content.ContentValues contentValues) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertFrom", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        this.f67610x29d1292e = contentValues.getAsLong("snsId").longValue();
        this.f67615xdde069b = contentValues.getAsString("userName");
        this.f67604x52c1d072 = contentValues.getAsInteger("localFlag").intValue();
        this.f67598xac3be4e = contentValues.getAsInteger("createTime").intValue();
        this.f67602x225c7205 = contentValues.getAsInteger("head").intValue();
        this.f67605xa4146ebd = contentValues.getAsInteger("localPrivate").intValue();
        this.f67614x2262335f = contentValues.getAsInteger("type").intValue();
        this.f67611x76e81a5a = contentValues.getAsInteger("sourceType").intValue();
        this.f67603x5f778948 = contentValues.getAsInteger("likeFlag").intValue();
        this.f67607xcb0372e6 = contentValues.getAsInteger("pravited").intValue();
        this.f67612x8f55c989 = contentValues.getAsString("stringSeq");
        this.f67596xad49e234 = contentValues.getAsByteArray("content");
        this.f67595x4c58c87d = contentValues.getAsByteArray("attrBuf");
        this.f67606x5d40d76e = contentValues.getAsByteArray("postBuf");
        this.f67592xf10bd636 = contentValues.getAsString(dm.n.f67492x9b6bc710);
        this.f67593x28cf0d8f = contentValues.getAsString(dm.n.f67493x36901555);
        this.f67597x480f98d1 = contentValues.getAsInteger(dm.n.f67497x510691eb).intValue();
        this.f67600xa9e31799 = contentValues.getAsInteger(dm.n.f67500x7c3efcd3).intValue();
        this.f67601x912e119f = contentValues.getAsInteger(dm.n.f67501xfcb109f9).intValue();
        this.f67608xe19bc6c = contentValues.getAsString(dm.n.f67508xb879ad46);
        this.f67613x5334f55 = contentValues.getAsInteger("subType").intValue();
        this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        this.f67594xe7057709 = contentValues.getAsString(dm.n.f67494xafc7a943);
        this.f67609x4becb5a7 = contentValues.getAsByteArray(dm.n.f67509xed6dfa2d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertFrom", "com.tencent.mm.plugin.sns.storage.AdSnsInfo");
        return contentValues;
    }
}
