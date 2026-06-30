package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public abstract class l2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f294575a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f294576b = kz5.c0.i("${data}", "${extData}");

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f294577c = {"${data}/.vfs", "${data}/lib", "${data}/code_cache", "${extData}", "${dataCache}", "${extCache}", "${data}/MicroMsg/${account}", "${extData}/MicroMsg/${accountSd}", "${dataCache}/${account}", "${extCache}/${accountSd}", "${data}/MicroMsg/${accountAllOther}", "${extData}/MicroMsg/${accountAllOther}", "${dataCache}/${accountAllOther}", "${extCache}/${accountAllOther}", "${storage}/tencent/MicroMsg", "${storage}/tencent/MicroMsg/${accountSd}", "${storage}/tencent/MicroMsg/${accountAllOther}", "${data}/shared_prefs", "${data}/.auth_cache", "${data}/cert", "${data}/MicroMsg/last_avatar_dir", "${data}/app_lib", "${data}/app_dex", "${data}/app_recover_lib", "${data}/MicroMsg/recovery", "${data}/${xwebKeepOld}", "${storage}/tencent/MicroMsg/WeiXin", "${storage}/tencent/MicroMsg/WeChat"};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f294578d = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 131072, 4096, 4096, 8192, 8192, 8192, 8192, 16384, 16384, 16384, 16384, 32768, 8192, 16384, 12, 12, 12, 12, 65536, 65536, 65536, 65536, 65546, 65536, 65536};

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f294579e = kz5.c1.k(new jz5.l("SnsMicroMsg", 4), new jz5.l("UnEncryptNewBiz", 5), new jz5.l("AppBrandComm", 6), new jz5.l("enFavorite", 7));

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashSet f294580f = kz5.p1.d("PreDownloadCheck", "SnsMicroMsg");

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f294581g;

    /* renamed from: h, reason: collision with root package name */
    public static final yz5.p[] f294582h;

    /* renamed from: i, reason: collision with root package name */
    public static final r26.t f294583i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String[] f294584j;

    /* renamed from: k, reason: collision with root package name */
    public static final yz5.p[] f294585k;

    /* renamed from: l, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.k6 f294586l;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.List f294587m;

    /* renamed from: n, reason: collision with root package name */
    public static volatile java.util.List f294588n;

    /* renamed from: o, reason: collision with root package name */
    public static volatile java.util.List f294589o;

    /* renamed from: p, reason: collision with root package name */
    public static volatile java.util.List f294590p;

    /* renamed from: q, reason: collision with root package name */
    public static volatile java.util.List f294591q;

    /* renamed from: r, reason: collision with root package name */
    public static volatile java.util.List f294592r;

    /* renamed from: s, reason: collision with root package name */
    public static volatile java.lang.String f294593s;

    /* renamed from: t, reason: collision with root package name */
    public static volatile java.util.List f294594t;

    /* renamed from: u, reason: collision with root package name */
    public static volatile java.util.List f294595u;

    /* renamed from: v, reason: collision with root package name */
    public static volatile java.util.List f294596v;

    /* renamed from: w, reason: collision with root package name */
    public static volatile boolean f294597w;

    static {
        com.p314xaae8f345.mm.vfs.c2 c2Var = com.p314xaae8f345.mm.vfs.c2.f294400d;
        com.p314xaae8f345.mm.vfs.d2 d2Var = com.p314xaae8f345.mm.vfs.d2.f294426d;
        f294581g = new java.lang.String[]{"${data}/files/mmkv", "${data}/shared_prefs", "${data}", "${data}/MicroMsg", "${data}/files", "${extData}", "${extData}/MicroMsg", "${data}/MicroMsg/${account}", "${data}/MicroMsg/${accountAllOther}", "${data}/MicroMsg/${account}/corrupted", "${data}/MicroMsg/${accountAllOther}/corrupted"};
        f294582h = new yz5.p[]{com.p314xaae8f345.mm.vfs.h2.f294504d, com.p314xaae8f345.mm.vfs.i2.f294524d, com.p314xaae8f345.mm.vfs.j2.f294544d, d2Var, d2Var, d2Var, d2Var, c2Var, c2Var, c2Var, c2Var};
        f294583i = new r26.t("^[0-9a-zA-Z_:]+_([0-9]{8})\\.xlog$");
        f294584j = new java.lang.String[]{"WxaCodePkgsCacheGlobal", "xlogPrivate", "XWebEngine"};
        f294585k = new yz5.p[]{com.p314xaae8f345.mm.vfs.e2.f294438d, com.p314xaae8f345.mm.vfs.f2.f294456d, com.p314xaae8f345.mm.vfs.g2.f294481d};
        f294586l = new com.p314xaae8f345.mm.vfs.k6(0, null, new com.p314xaae8f345.mm.vfs.x1(com.p314xaae8f345.mm.vfs.C22759xc55eb7d2.f(), "", "", 0L, 0L, 0L, false));
        f294587m = kz5.c0.i(new jz5.l("CheckResUpdate", ""), new jz5.l("PublicResource", "live"), new jz5.l("XNetLib", ""));
        kz5.p0 p0Var = kz5.p0.f395529d;
        f294588n = p0Var;
        f294589o = p0Var;
        f294590p = p0Var;
        f294591q = p0Var;
        f294592r = p0Var;
        f294594t = p0Var;
        f294595u = p0Var;
        f294596v = p0Var;
    }
}
