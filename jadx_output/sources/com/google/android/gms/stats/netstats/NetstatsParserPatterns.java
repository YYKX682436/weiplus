package com.google.android.gms.stats.netstats;

/* loaded from: classes13.dex */
public class NetstatsParserPatterns {
    public static final java.lang.String BUCKET_PATTERN;
    public static final java.lang.String HISTORY_PATTERN = ".*bucketDuration=(?<duration>[0-9]+).*";
    public static final java.lang.String IDENTS_PATTERN = " *ident=\\[(?<idents>.*)\\](?: uid=(?<uid>-?[0-9]+))?(?: set=(?<set>\\w+))?(?: tag=0x(?<tag>[0-9a-f]+))?.*";
    public static final java.lang.String IDENT_PATTERN;
    public static final java.lang.String NEW_BUCKET_PATTERN = " *st=(?<start>[0-9]+)(?: rb=(?<rxBytes>[0-9]+))?(?: rp=(?<rxPackets>[0-9]+))?(?: tb=(?<txBytes>[0-9]+))?(?: tp=(?<txPackets>[0-9]+))?(?: op=(?<operations>[0-9]+))?.*";
    public static final java.lang.String NEW_IDENT_PATTERN = "[\\[{](?:type=(?<type>-1|\\w+))[, ]*(?:subType=(?<subtype>[^,]+))?[, ]*(?:subscriberId=(?<subscriberId>[0-9]+)(?:...)?)?[, ]*(?<roaming>ROAMING)?[^\\]}]*[\\]}]";
    public static final int NEW_TS_TO_MILLIS = 1000;
    public static final java.lang.String OLD_BUCKET_PATTERN = " *bucketStart=(?<start>[0-9]+)(?: activeTime=(?<active>[0-9]+))?(?: rxBytes=(?<rxBytes>[0-9]+))?(?: rxPackets=(?<rxPackets>[0-9]+))?(?: txBytes=(?<txBytes>[0-9]+))?(?: txPackets=(?<txPackets>[0-9]+))?(?: operations=(?<operations>[0-9]+))?.*";
    public static final java.lang.String OLD_IDENT_PATTERN = "\\[(?:type=(?<type>-1|\\w+))[, ]*(?:subType=(?<subtype>[^,]+))?[, ]*(?:subscriberId=(?<subscriberId>[0-9]+)(?:...)?)?[, ]*(?<roaming>ROAMING)?[^]]*\\]";
    public static final int OLD_TS_TO_MILLIS = 1;
    public static final int TS_TO_MILLIS;
    public static final java.lang.String TYPE_BACKGROUND_PATTERN = "DEFAULT";
    public static final java.lang.String TYPE_BOTH_PATTERN = "ALL";
    public static final java.lang.String TYPE_DEBUG_VPN_IN_PATTERN = "DBG_VPN_IN";
    public static final java.lang.String TYPE_DEBUG_VPN_OUT_PATTERN = "DBG_VPN_OUT";
    public static final java.lang.String TYPE_FOREGROUND_PATTERN = "FOREGROUND";
    public static final java.lang.String UID_STATS_START_PATTERN = "UID stats:|Detailed UID stats:";
    public static final java.lang.String UID_TAG_STATS_START_PATTERN = "UID tag stats:";
    private static final java.util.regex.Pattern zzafe;
    private java.util.regex.Pattern zzaen;
    private java.util.Map<java.lang.String, java.lang.Integer> zzaeo;
    private java.util.regex.Pattern zzaep;
    private java.util.Map<java.lang.String, java.lang.Integer> zzaeq;
    private java.util.regex.Pattern zzaer;
    private java.util.Map<java.lang.String, java.lang.Integer> zzaes;
    private java.util.regex.Pattern zzaet;
    private java.util.Map<java.lang.String, java.lang.Integer> zzaeu;
    private java.util.regex.Pattern zzaev;
    private java.util.regex.Pattern zzaew;
    private java.util.regex.Pattern zzaex;
    private java.util.regex.Pattern zzaey;
    private java.util.regex.Pattern zzaez;
    private java.util.regex.Pattern zzafa;
    private java.util.regex.Pattern zzafb;
    private int zzafc;
    private int zzafd;

    /* loaded from: classes7.dex */
    public static class NetstatsMatcher {
        private java.util.regex.Matcher zzaff;
        private java.util.Map<java.lang.String, java.lang.Integer> zzafg;

        public NetstatsMatcher(java.util.regex.Matcher matcher, java.util.Map<java.lang.String, java.lang.Integer> map) {
            this.zzaff = matcher;
            this.zzafg = map;
        }

        public boolean find() {
            return this.zzaff.find();
        }

        public java.lang.String get(java.lang.String str) {
            if (this.zzafg.containsKey(str)) {
                return this.zzaff.group(this.zzafg.get(str).intValue());
            }
            java.lang.String valueOf = java.lang.String.valueOf(str);
            throw new java.lang.IllegalArgumentException(valueOf.length() != 0 ? "Unknown group ".concat(valueOf) : new java.lang.String("Unknown group "));
        }

        public boolean matches() {
            return this.zzaff.matches();
        }
    }

    static {
        IDENT_PATTERN = com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipopMR1() ? NEW_IDENT_PATTERN : OLD_IDENT_PATTERN;
        BUCKET_PATTERN = com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipopMR1() ? NEW_BUCKET_PATTERN : OLD_BUCKET_PATTERN;
        TS_TO_MILLIS = com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipopMR1() ? 1000 : 1;
        zzafe = java.util.regex.Pattern.compile("\\?<([a-zA-Z0-9]+)>");
    }

    public NetstatsParserPatterns() {
        java.lang.String binderSafe = com.google.android.gms.stats.internal.G.netStats.patterns.IDENTS.getBinderSafe();
        this.zzaen = zzp(binderSafe);
        this.zzaeo = zzo(binderSafe);
        java.lang.String binderSafe2 = com.google.android.gms.stats.internal.G.netStats.patterns.IDENT.getBinderSafe();
        this.zzaep = zzp(binderSafe2);
        this.zzaeq = zzo(binderSafe2);
        java.lang.String binderSafe3 = com.google.android.gms.stats.internal.G.netStats.patterns.HISTORY.getBinderSafe();
        this.zzaer = zzp(binderSafe3);
        this.zzaes = zzo(binderSafe3);
        java.lang.String binderSafe4 = com.google.android.gms.stats.internal.G.netStats.patterns.BUCKET.getBinderSafe();
        this.zzaet = zzp(binderSafe4);
        this.zzaeu = zzo(binderSafe4);
        this.zzaev = java.util.regex.Pattern.compile(com.google.android.gms.stats.internal.G.netStats.patterns.UID_STATS_START.getBinderSafe());
        this.zzaew = java.util.regex.Pattern.compile(com.google.android.gms.stats.internal.G.netStats.patterns.UID_TAG_STATS_START.getBinderSafe());
        this.zzaex = java.util.regex.Pattern.compile(com.google.android.gms.stats.internal.G.netStats.patterns.TYPE_BOTH.getBinderSafe());
        this.zzaey = java.util.regex.Pattern.compile(com.google.android.gms.stats.internal.G.netStats.patterns.TYPE_BACKGROUND.getBinderSafe());
        this.zzaez = java.util.regex.Pattern.compile(com.google.android.gms.stats.internal.G.netStats.patterns.TYPE_FOREGROUND.getBinderSafe());
        this.zzafa = java.util.regex.Pattern.compile(com.google.android.gms.stats.internal.G.netStats.patterns.TYPE_DEBUG_VPN_IN_PATTERN.getBinderSafe());
        this.zzafb = java.util.regex.Pattern.compile(com.google.android.gms.stats.internal.G.netStats.patterns.TYPE_DEBUG_VPN_OUT_PATTERN.getBinderSafe());
        this.zzafc = com.google.android.gms.stats.internal.G.netStats.patterns.TAG_RADIX.getBinderSafe().intValue();
        this.zzafd = com.google.android.gms.stats.internal.G.netStats.patterns.TS_TO_MILLIS.getBinderSafe().intValue();
    }

    private static java.util.Map<java.lang.String, java.lang.Integer> zzo(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.regex.Matcher matcher = zzafe.matcher(str);
        int i17 = 1;
        while (matcher.find()) {
            hashMap.put(matcher.group(1), java.lang.Integer.valueOf(i17));
            i17++;
        }
        return hashMap;
    }

    private static java.util.regex.Pattern zzp(java.lang.String str) {
        return java.util.regex.Pattern.compile(zzafe.matcher(str).replaceAll(""));
    }

    public com.google.android.gms.stats.netstats.NetstatsParserPatterns.NetstatsMatcher bucket(java.lang.String str) {
        return new com.google.android.gms.stats.netstats.NetstatsParserPatterns.NetstatsMatcher(this.zzaet.matcher(str), this.zzaeu);
    }

    public com.google.android.gms.stats.netstats.NetstatsParserPatterns.NetstatsMatcher history(java.lang.String str) {
        return new com.google.android.gms.stats.netstats.NetstatsParserPatterns.NetstatsMatcher(this.zzaer.matcher(str), this.zzaes);
    }

    public com.google.android.gms.stats.netstats.NetstatsParserPatterns.NetstatsMatcher ident(java.lang.String str) {
        return new com.google.android.gms.stats.netstats.NetstatsParserPatterns.NetstatsMatcher(this.zzaep.matcher(str), this.zzaeq);
    }

    public com.google.android.gms.stats.netstats.NetstatsParserPatterns.NetstatsMatcher idents(java.lang.String str) {
        return new com.google.android.gms.stats.netstats.NetstatsParserPatterns.NetstatsMatcher(this.zzaen.matcher(str), this.zzaeo);
    }

    public boolean isTypeBackground(java.lang.String str) {
        return this.zzaey.matcher(str).matches();
    }

    public boolean isTypeBoth(java.lang.String str) {
        return this.zzaex.matcher(str).matches();
    }

    public boolean isTypeDebugVpn(java.lang.String str) {
        return this.zzafa.matcher(str).matches() || this.zzafb.matcher(str).matches();
    }

    public boolean isTypeForeground(java.lang.String str) {
        return this.zzaez.matcher(str).matches();
    }

    public boolean isUidStart(java.lang.String str) {
        return this.zzaev.matcher(str).matches();
    }

    public boolean isUidTagStart(java.lang.String str) {
        return this.zzaew.matcher(str).matches();
    }

    public int tagRadix() {
        return this.zzafc;
    }

    public long toMillis(long j17) {
        return j17 * this.zzafd;
    }
}
