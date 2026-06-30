package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes12.dex */
public class g5 {
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public int F;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f275484a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f275485b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f275486c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f275487d;

    /* renamed from: e, reason: collision with root package name */
    public int f275488e;

    /* renamed from: f, reason: collision with root package name */
    public int f275489f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f275490g;

    /* renamed from: h, reason: collision with root package name */
    public long f275491h;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f275494k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f275495l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f275496m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f275497n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f275498o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f275499p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f275500q;

    /* renamed from: s, reason: collision with root package name */
    public int f275502s;

    /* renamed from: t, reason: collision with root package name */
    public int f275503t;

    /* renamed from: u, reason: collision with root package name */
    public long f275504u;

    /* renamed from: v, reason: collision with root package name */
    public int f275505v;

    /* renamed from: w, reason: collision with root package name */
    public int f275506w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f275507x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f275508y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f275509z;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f275492i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f275493j = "";

    /* renamed from: r, reason: collision with root package name */
    public boolean f275501r = true;

    public static com.p314xaae8f345.mm.p2621x8fb0427b.g5 a(java.util.Map map, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (map == null) {
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.g5 g5Var = new com.p314xaae8f345.mm.p2621x8fb0427b.g5();
        g5Var.f275492i = str2;
        g5Var.f275484a = str;
        g5Var.f275486c = (java.lang.String) map.get(".msg.emoji.$idbuffer");
        g5Var.f275485b = (java.lang.String) map.get(".msg.emoji.$fromusername");
        java.lang.String str4 = (java.lang.String) map.get(".msg.emoji.$androidmd5");
        g5Var.f275487d = str4;
        if (str4 == null) {
            g5Var.f275487d = (java.lang.String) map.get(".msg.emoji.$md5");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g5Var.f275487d)) {
            g5Var.f275487d = g5Var.f275487d.toLowerCase();
        }
        try {
            g5Var.f275488e = java.lang.Integer.valueOf((java.lang.String) map.get(".msg.emoji.$type")).intValue();
            if (map.get(".msg.emoji.$androidlen") != null) {
                g5Var.f275489f = java.lang.Integer.valueOf((java.lang.String) map.get(".msg.emoji.$androidlen")).intValue();
            } else if (map.get(".msg.emoji.$len") != null) {
                g5Var.f275489f = java.lang.Integer.valueOf((java.lang.String) map.get(".msg.emoji.$len")).intValue();
            }
            if (map.get(".msg.gameext.$type") != null) {
                java.lang.Integer.valueOf((java.lang.String) map.get(".msg.gameext.$type")).intValue();
            }
            if (map.get(".msg.gameext.$content") != null) {
                java.lang.Integer.valueOf((java.lang.String) map.get(".msg.gameext.$content")).intValue();
            }
            if (map.get(".msg.emoji.$productid") != null) {
                g5Var.f275490g = (java.lang.String) map.get(".msg.emoji.$productid");
            }
            if (map.get(".msg.emoji.$cdnurl") != null) {
                g5Var.f275494k = (java.lang.String) map.get(".msg.emoji.$cdnurl");
            }
            if (map.get(".msg.emoji.$tpurl") != null) {
                g5Var.f275507x = (java.lang.String) map.get(".msg.emoji.$tpurl");
            }
            if (map.get(".msg.emoji.$tpauthkey") != null) {
                g5Var.f275508y = (java.lang.String) map.get(".msg.emoji.$tpauthkey");
            }
            if (map.get(".msg.emoji.$designerid") != null) {
                g5Var.f275495l = (java.lang.String) map.get(".msg.emoji.$designerid");
            }
            if (map.get(".msg.emoji.$thumburl") != null) {
                g5Var.f275496m = (java.lang.String) map.get(".msg.emoji.$thumburl");
            }
            if (map.get(".msg.emoji.$encrypturl") != null) {
                g5Var.f275497n = (java.lang.String) map.get(".msg.emoji.$encrypturl");
            }
            if (map.get(".msg.emoji.$aeskey") != null) {
                g5Var.f275498o = (java.lang.String) map.get(".msg.emoji.$aeskey");
            }
            if (map.get(".msg.emoji.$width") != null) {
                g5Var.f275505v = java.lang.Integer.valueOf((java.lang.String) map.get(".msg.emoji.$width")).intValue();
            }
            if (map.get(".msg.emoji.$height") != null) {
                g5Var.f275506w = java.lang.Integer.valueOf((java.lang.String) map.get(".msg.emoji.$height")).intValue();
            }
            if (map.get(".msg.emoji.$externurl") != null) {
                g5Var.f275499p = (java.lang.String) map.get(".msg.emoji.$externurl");
            }
            if (map.get(".msg.emoji.$externmd5") != null) {
                g5Var.f275500q = (java.lang.String) map.get(".msg.emoji.$externmd5");
            }
            if (map.get(".msg.emoji.$activityid") != null) {
                g5Var.f275509z = (java.lang.String) map.get(".msg.emoji.$activityid");
            }
            if (map.get(".msg.emoji.$attachedtext") != null) {
                g5Var.B = (java.lang.String) map.get(".msg.emoji.$attachedtext");
            }
            if (map.get(".msg.emoji.$attachedtextcolor") != null) {
                g5Var.D = (java.lang.String) map.get(".msg.emoji.$attachedtextcolor");
            }
            if (map.get(".msg.emoji.$lensid") != null) {
                g5Var.C = (java.lang.String) map.get(".msg.emoji.$lensid");
            }
            if (map.get(".msg.emoji.$linkid") != null) {
                g5Var.A = (java.lang.String) map.get(".msg.emoji.$linkid");
            }
            if (map.get(".msg.emoji.$desc") != null) {
                g5Var.E = (java.lang.String) map.get(".msg.emoji.$desc");
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                g5Var.f275493j = str3;
            }
            if (map.get(".msg.storeunique") != null) {
                g5Var.F = java.lang.Integer.valueOf((java.lang.String) map.get(".msg.storeunique")).intValue();
            }
            return g5Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiMsgInfo", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return null;
        }
    }
}
