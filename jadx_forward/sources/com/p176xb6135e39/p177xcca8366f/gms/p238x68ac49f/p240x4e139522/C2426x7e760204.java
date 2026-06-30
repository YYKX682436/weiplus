package com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p240x4e139522;

/* renamed from: com.google.android.gms.stats.netstats.NetstatsParserPatterns */
/* loaded from: classes13.dex */
public class C2426x7e760204 {

    /* renamed from: BUCKET_PATTERN */
    public static final java.lang.String f7418x15a1d21b;

    /* renamed from: HISTORY_PATTERN */
    public static final java.lang.String f7419xced1daa5 = ".*bucketDuration=(?<duration>[0-9]+).*";

    /* renamed from: IDENTS_PATTERN */
    public static final java.lang.String f7420xf6197bb4 = " *ident=\\[(?<idents>.*)\\](?: uid=(?<uid>-?[0-9]+))?(?: set=(?<set>\\w+))?(?: tag=0x(?<tag>[0-9a-f]+))?.*";

    /* renamed from: IDENT_PATTERN */
    public static final java.lang.String f7421xcd39f801;

    /* renamed from: NEW_BUCKET_PATTERN */
    public static final java.lang.String f7422xb8dc62ba = " *st=(?<start>[0-9]+)(?: rb=(?<rxBytes>[0-9]+))?(?: rp=(?<rxPackets>[0-9]+))?(?: tb=(?<txBytes>[0-9]+))?(?: tp=(?<txPackets>[0-9]+))?(?: op=(?<operations>[0-9]+))?.*";

    /* renamed from: NEW_IDENT_PATTERN */
    public static final java.lang.String f7423x882b5782 = "[\\[{](?:type=(?<type>-1|\\w+))[, ]*(?:subType=(?<subtype>[^,]+))?[, ]*(?:subscriberId=(?<subscriberId>[0-9]+)(?:...)?)?[, ]*(?<roaming>ROAMING)?[^\\]}]*[\\]}]";

    /* renamed from: NEW_TS_TO_MILLIS */
    public static final int f7424x89342f29 = 1000;

    /* renamed from: OLD_BUCKET_PATTERN */
    public static final java.lang.String f7425xf43fdf53 = " *bucketStart=(?<start>[0-9]+)(?: activeTime=(?<active>[0-9]+))?(?: rxBytes=(?<rxBytes>[0-9]+))?(?: rxPackets=(?<rxPackets>[0-9]+))?(?: txBytes=(?<txBytes>[0-9]+))?(?: txPackets=(?<txPackets>[0-9]+))?(?: operations=(?<operations>[0-9]+))?.*";

    /* renamed from: OLD_IDENT_PATTERN */
    public static final java.lang.String f7426x588963c9 = "\\[(?:type=(?<type>-1|\\w+))[, ]*(?:subType=(?<subtype>[^,]+))?[, ]*(?:subscriberId=(?<subscriberId>[0-9]+)(?:...)?)?[, ]*(?<roaming>ROAMING)?[^]]*\\]";

    /* renamed from: OLD_TS_TO_MILLIS */
    public static final int f7427x1c4ffe02 = 1;

    /* renamed from: TS_TO_MILLIS */
    public static final int f7428x51a002ca;

    /* renamed from: TYPE_BACKGROUND_PATTERN */
    public static final java.lang.String f7429x859b4284 = "DEFAULT";

    /* renamed from: TYPE_BOTH_PATTERN */
    public static final java.lang.String f7430xad573197 = "ALL";

    /* renamed from: TYPE_DEBUG_VPN_IN_PATTERN */
    public static final java.lang.String f7431xcef12e12 = "DBG_VPN_IN";

    /* renamed from: TYPE_DEBUG_VPN_OUT_PATTERN */
    public static final java.lang.String f7432xeaebbf23 = "DBG_VPN_OUT";

    /* renamed from: TYPE_FOREGROUND_PATTERN */
    public static final java.lang.String f7433x1d947199 = "FOREGROUND";

    /* renamed from: UID_STATS_START_PATTERN */
    public static final java.lang.String f7434x3daba24 = "UID stats:|Detailed UID stats:";

    /* renamed from: UID_TAG_STATS_START_PATTERN */
    public static final java.lang.String f7435xdb91e95f = "UID tag stats:";

    /* renamed from: zzafe */
    private static final java.util.regex.Pattern f7436x6f021a0;

    /* renamed from: zzaen */
    private java.util.regex.Pattern f7437x6f0218a;

    /* renamed from: zzaeo */
    private java.util.Map<java.lang.String, java.lang.Integer> f7438x6f0218b;

    /* renamed from: zzaep */
    private java.util.regex.Pattern f7439x6f0218c;

    /* renamed from: zzaeq */
    private java.util.Map<java.lang.String, java.lang.Integer> f7440x6f0218d;

    /* renamed from: zzaer */
    private java.util.regex.Pattern f7441x6f0218e;

    /* renamed from: zzaes */
    private java.util.Map<java.lang.String, java.lang.Integer> f7442x6f0218f;

    /* renamed from: zzaet */
    private java.util.regex.Pattern f7443x6f02190;

    /* renamed from: zzaeu */
    private java.util.Map<java.lang.String, java.lang.Integer> f7444x6f02191;

    /* renamed from: zzaev */
    private java.util.regex.Pattern f7445x6f02192;

    /* renamed from: zzaew */
    private java.util.regex.Pattern f7446x6f02193;

    /* renamed from: zzaex */
    private java.util.regex.Pattern f7447x6f02194;

    /* renamed from: zzaey */
    private java.util.regex.Pattern f7448x6f02195;

    /* renamed from: zzaez */
    private java.util.regex.Pattern f7449x6f02196;

    /* renamed from: zzafa */
    private java.util.regex.Pattern f7450x6f0219c;

    /* renamed from: zzafb */
    private java.util.regex.Pattern f7451x6f0219d;

    /* renamed from: zzafc */
    private int f7452x6f0219e;

    /* renamed from: zzafd */
    private int f7453x6f0219f;

    /* renamed from: com.google.android.gms.stats.netstats.NetstatsParserPatterns$NetstatsMatcher */
    /* loaded from: classes7.dex */
    public static class NetstatsMatcher {

        /* renamed from: zzaff */
        private java.util.regex.Matcher f7454x6f021a1;

        /* renamed from: zzafg */
        private java.util.Map<java.lang.String, java.lang.Integer> f7455x6f021a2;

        public NetstatsMatcher(java.util.regex.Matcher matcher, java.util.Map<java.lang.String, java.lang.Integer> map) {
            this.f7454x6f021a1 = matcher;
            this.f7455x6f021a2 = map;
        }

        /* renamed from: find */
        public boolean m19566x2ff5b9() {
            return this.f7454x6f021a1.find();
        }

        public java.lang.String get(java.lang.String str) {
            if (this.f7455x6f021a2.containsKey(str)) {
                return this.f7454x6f021a1.group(this.f7455x6f021a2.get(str).intValue());
            }
            java.lang.String valueOf = java.lang.String.valueOf(str);
            throw new java.lang.IllegalArgumentException(valueOf.length() != 0 ? "Unknown group ".concat(valueOf) : new java.lang.String("Unknown group "));
        }

        /* renamed from: matches */
        public boolean m19567x321e8933() {
            return this.f7454x6f021a1.matches();
        }
    }

    static {
        f7421xcd39f801 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18603x73a91c35() ? f7423x882b5782 : f7426x588963c9;
        f7418x15a1d21b = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18603x73a91c35() ? f7422xb8dc62ba : f7425xf43fdf53;
        f7428x51a002ca = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18603x73a91c35() ? 1000 : 1;
        f7436x6f021a0 = java.util.regex.Pattern.compile("\\?<([a-zA-Z0-9]+)>");
    }

    public C2426x7e760204() {
        java.lang.String m17983x41e71c4d = com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p239x21ffc6bd.G.C2425x4c50a502.patterns.f7408x80709083.m17983x41e71c4d();
        this.f7437x6f0218a = zzp(m17983x41e71c4d);
        this.f7438x6f0218b = zzo(m17983x41e71c4d);
        java.lang.String m17983x41e71c4d2 = com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p239x21ffc6bd.G.C2425x4c50a502.patterns.f7407x424a9d0.m17983x41e71c4d();
        this.f7439x6f0218c = zzp(m17983x41e71c4d2);
        this.f7440x6f0218d = zzo(m17983x41e71c4d2);
        java.lang.String m17983x41e71c4d3 = com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p239x21ffc6bd.G.C2425x4c50a502.patterns.f7406x620b7074.m17983x41e71c4d();
        this.f7441x6f0218e = zzp(m17983x41e71c4d3);
        this.f7442x6f0218f = zzo(m17983x41e71c4d3);
        java.lang.String m17983x41e71c4d4 = com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p239x21ffc6bd.G.C2425x4c50a502.patterns.f7405x756d3dea.m17983x41e71c4d();
        this.f7443x6f02190 = zzp(m17983x41e71c4d4);
        this.f7444x6f02191 = zzo(m17983x41e71c4d4);
        this.f7445x6f02192 = java.util.regex.Pattern.compile(com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p239x21ffc6bd.G.C2425x4c50a502.patterns.f7416x6acf3ef3.m17983x41e71c4d());
        this.f7446x6f02193 = java.util.regex.Pattern.compile(com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p239x21ffc6bd.G.C2425x4c50a502.patterns.f7417x46fad92e.m17983x41e71c4d());
        this.f7447x6f02194 = java.util.regex.Pattern.compile(com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p239x21ffc6bd.G.C2425x4c50a502.patterns.f7412xc6c7d966.m17983x41e71c4d());
        this.f7448x6f02195 = java.util.regex.Pattern.compile(com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p239x21ffc6bd.G.C2425x4c50a502.patterns.f7411xac4e2753.m17983x41e71c4d());
        this.f7449x6f02196 = java.util.regex.Pattern.compile(com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p239x21ffc6bd.G.C2425x4c50a502.patterns.f7415x71fe3b68.m17983x41e71c4d());
        this.f7450x6f0219c = java.util.regex.Pattern.compile(com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p239x21ffc6bd.G.C2425x4c50a502.patterns.f7413xcef12e12.m17983x41e71c4d());
        this.f7451x6f0219d = java.util.regex.Pattern.compile(com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p239x21ffc6bd.G.C2425x4c50a502.patterns.f7414xeaebbf23.m17983x41e71c4d());
        this.f7452x6f0219e = com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p239x21ffc6bd.G.C2425x4c50a502.patterns.f7409x5939bedf.m17983x41e71c4d().intValue();
        this.f7453x6f0219f = com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p239x21ffc6bd.G.C2425x4c50a502.patterns.f7410x51a002ca.m17983x41e71c4d().intValue();
    }

    private static java.util.Map<java.lang.String, java.lang.Integer> zzo(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.regex.Matcher matcher = f7436x6f021a0.matcher(str);
        int i17 = 1;
        while (matcher.find()) {
            hashMap.put(matcher.group(1), java.lang.Integer.valueOf(i17));
            i17++;
        }
        return hashMap;
    }

    private static java.util.regex.Pattern zzp(java.lang.String str) {
        return java.util.regex.Pattern.compile(f7436x6f021a0.matcher(str).replaceAll(""));
    }

    /* renamed from: bucket */
    public com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p240x4e139522.C2426x7e760204.NetstatsMatcher m19554xadda49ea(java.lang.String str) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p240x4e139522.C2426x7e760204.NetstatsMatcher(this.f7443x6f02190.matcher(str), this.f7444x6f02191);
    }

    /* renamed from: history */
    public com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p240x4e139522.C2426x7e760204.NetstatsMatcher m19555x373fe494(java.lang.String str) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p240x4e139522.C2426x7e760204.NetstatsMatcher(this.f7441x6f0218e.matcher(str), this.f7442x6f0218f);
    }

    /* renamed from: ident */
    public com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p240x4e139522.C2426x7e760204.NetstatsMatcher m19556x5f6a1f0(java.lang.String str) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p240x4e139522.C2426x7e760204.NetstatsMatcher(this.f7439x6f0218c.matcher(str), this.f7440x6f0218d);
    }

    /* renamed from: idents */
    public com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p240x4e139522.C2426x7e760204.NetstatsMatcher m19557xb8dd9c83(java.lang.String str) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p240x4e139522.C2426x7e760204.NetstatsMatcher(this.f7437x6f0218a.matcher(str), this.f7438x6f0218b);
    }

    /* renamed from: isTypeBackground */
    public boolean m19558xfe7607d2(java.lang.String str) {
        return this.f7448x6f02195.matcher(str).matches();
    }

    /* renamed from: isTypeBoth */
    public boolean m19559xa85fb925(java.lang.String str) {
        return this.f7447x6f02194.matcher(str).matches();
    }

    /* renamed from: isTypeDebugVpn */
    public boolean m19560x32d8c145(java.lang.String str) {
        return this.f7450x6f0219c.matcher(str).matches() || this.f7451x6f0219d.matcher(str).matches();
    }

    /* renamed from: isTypeForeground */
    public boolean m19561xc4261be7(java.lang.String str) {
        return this.f7449x6f02196.matcher(str).matches();
    }

    /* renamed from: isUidStart */
    public boolean m19562xac7be93c(java.lang.String str) {
        return this.f7445x6f02192.matcher(str).matches();
    }

    /* renamed from: isUidTagStart */
    public boolean m19563xaaff39ce(java.lang.String str) {
        return this.f7446x6f02193.matcher(str).matches();
    }

    /* renamed from: tagRadix */
    public int m19564xd1b9148a() {
        return this.f7452x6f0219e;
    }

    /* renamed from: toMillis */
    public long m19565x8b3b8ca1(long j17) {
        return j17 * this.f7453x6f0219f;
    }
}
