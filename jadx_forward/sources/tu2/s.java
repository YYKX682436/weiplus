package tu2;

/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final tu2.s f503685a = new tu2.s();

    /* renamed from: b, reason: collision with root package name */
    public static final lb2.k f503686b = new lb2.k("发表相机红点重置", tu2.p.f503682d);

    /* renamed from: c, reason: collision with root package name */
    public static final lb2.k f503687c;

    /* renamed from: d, reason: collision with root package name */
    public static final lb2.k f503688d;

    /* renamed from: e, reason: collision with root package name */
    public static final lb2.k f503689e;

    /* renamed from: f, reason: collision with root package name */
    public static final lb2.k f503690f;

    /* renamed from: g, reason: collision with root package name */
    public static final lb2.k f503691g;

    /* renamed from: h, reason: collision with root package name */
    public static final lb2.k f503692h;

    /* renamed from: i, reason: collision with root package name */
    public static final lb2.k f503693i;

    /* renamed from: j, reason: collision with root package name */
    public static final lb2.k f503694j;

    /* renamed from: k, reason: collision with root package name */
    public static final lb2.k f503695k;

    /* renamed from: l, reason: collision with root package name */
    public static final lb2.k f503696l;

    static {
        new lb2.k("清除全屏tab红点标记", tu2.g.f503673d).f399278p = "T5";
        f503687c = new lb2.k("清理首页文件缓存", tu2.k.f503677d);
        f503688d = new lb2.k("附近直播清理首页文件缓存", tu2.n.f503680d);
        f503689e = new lb2.k("清理发表队列", tu2.l.f503678d);
        f503690f = new lb2.k("查看Finder缓存大小", tu2.e.f503671d);
        f503691g = new lb2.k("插入10W条假session", tu2.m.f503679d);
        f503692h = new lb2.k("显示视频编码配置", tu2.r.f503684d);
        f503693i = new lb2.k("双击与展开教育/收藏红点重置", tu2.h.f503674d);
        new lb2.k("清除直播广场的滑动引导", tu2.o.f503681d).f399278p = "T5";
        new lb2.k("跳通用选择器页面", tu2.j.f503676d).f399278p = "T6";
        f503694j = new lb2.k("OPENSDK DEEPLINK分享测试", tu2.q.f503683d);
        f503695k = new lb2.k("把所有feed改为仅自己可见", tu2.i.f503675d);
        f503696l = new lb2.k("清空通知lastBuffer", tu2.f.f503672d);
    }

    public final lb2.k a() {
        return f503690f;
    }

    public final lb2.k b() {
        return f503696l;
    }

    public final lb2.k c() {
        return f503693i;
    }

    public final lb2.k d() {
        return f503695k;
    }

    public final lb2.k e() {
        return f503687c;
    }

    public final lb2.k f() {
        return f503689e;
    }

    public final lb2.k g() {
        return f503691g;
    }

    public final lb2.k h() {
        return f503688d;
    }

    public final com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d i() {
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d;
        int i17;
        int bj6 = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).bj();
        ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
        d11.s fj6 = d11.s.fj();
        fj6.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (fj6.f307218t == null) {
            fj6.f307218t = fj6.tj("PublishMegaVideoConfig");
        }
        if (fj6.f307218t != null) {
            int i18 = 0;
            while (true) {
                d11.v[] vVarArr = fj6.f307218t;
                if (i18 >= vVarArr.length) {
                    break;
                }
                d11.v vVar = vVarArr[i18];
                if (vVar != null && vVar.c()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "it busy time, try to get story Record config.");
                    c11120x15dce88d = vVar.a(0);
                    break;
                }
                i18++;
            }
        }
        c11120x15dce88d = null;
        if (c11120x15dce88d == null) {
            c11120x15dce88d = fj6.Vi();
        }
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1 && (i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("finder_config_sp_key", 0).getInt("SWITCH_POST_VIDEO_RATE", -1)) > 0) {
            c11120x15dce88d.f152727g = i17;
        }
        c11120x15dce88d.f152732o = 44100;
        c11120x15dce88d.f152737t = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf;
        fj6.aj(c11120x15dce88d, 4);
        c11120x15dce88d.f152728h = bj6;
        c11120x15dce88d.f152729i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ultron_album_video_max_duration_android, 60);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "get finder record para cost %d. %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), c11120x15dce88d);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_long_video_max_bitrate, 0);
        if (Ni > 0) {
            c11120x15dce88d.f152727g = Ni;
        }
        return c11120x15dce88d;
    }

    public final lb2.k j() {
        return f503686b;
    }

    public final lb2.k k() {
        return f503694j;
    }

    public final lb2.k l() {
        return f503692h;
    }
}
