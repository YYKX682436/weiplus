package ni3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static final ni3.r f419237e;

    /* renamed from: f, reason: collision with root package name */
    public static final ni3.r f419238f;

    /* renamed from: g, reason: collision with root package name */
    public static final ni3.r f419239g;

    /* renamed from: h, reason: collision with root package name */
    public static final ni3.r f419240h;

    /* renamed from: i, reason: collision with root package name */
    public static final ni3.r f419241i;

    /* renamed from: m, reason: collision with root package name */
    public static final ni3.r f419242m;

    /* renamed from: n, reason: collision with root package name */
    public static final ni3.r f419243n;

    /* renamed from: o, reason: collision with root package name */
    public static final ni3.r f419244o;

    /* renamed from: p, reason: collision with root package name */
    public static final ni3.r f419245p;

    /* renamed from: q, reason: collision with root package name */
    public static final ni3.r f419246q;

    /* renamed from: r, reason: collision with root package name */
    public static final ni3.r f419247r;

    /* renamed from: s, reason: collision with root package name */
    public static final ni3.r f419248s;

    /* renamed from: t, reason: collision with root package name */
    public static final ni3.r f419249t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ ni3.r[] f419250u;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f419251d;

    static {
        ni3.r rVar = new ni3.r("DOWNLOADER_IDLE", 0, "未启动");
        f419237e = rVar;
        ni3.r rVar2 = new ni3.r("DOWNLOADER_START", 1, "启动下载");
        f419238f = rVar2;
        ni3.r rVar3 = new ni3.r("DOWNLOADER_RUNNING", 2, "下载中");
        f419239g = rVar3;
        ni3.r rVar4 = new ni3.r("DOWNLOADER_COMPLETE", 3, "下载完成");
        f419240h = rVar4;
        ni3.r rVar5 = new ni3.r("DOWNLOADER_STOP", 4, "停止下载");
        f419241i = rVar5;
        ni3.r rVar6 = new ni3.r("DOWNLOADER_LOCAL_CACHE", 5, "本地缓存");
        f419242m = rVar6;
        ni3.r rVar7 = new ni3.r("PLAYER_IDLE", 6, "未启动");
        f419243n = rVar7;
        ni3.r rVar8 = new ni3.r("PLAYER_PRE_RENDER", 7, "预渲染");
        f419244o = rVar8;
        ni3.r rVar9 = new ni3.r("PLAYER_PRE_RENDER_COMPLETE", 8, "预渲染完成");
        f419245p = rVar9;
        ni3.r rVar10 = new ni3.r("PLAYER_START", 9, "启动播放");
        f419246q = rVar10;
        ni3.r rVar11 = new ni3.r("PLAYER_RUNNING", 10, "播放中");
        f419247r = rVar11;
        ni3.r rVar12 = new ni3.r("PLAYER_PAUSE", 11, "暂停播放");
        f419248s = rVar12;
        ni3.r rVar13 = new ni3.r("PLAYER_STOP", 12, "停止播放");
        f419249t = rVar13;
        ni3.r[] rVarArr = {rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9, rVar10, rVar11, rVar12, rVar13, new ni3.r("PLAYER_DESTROY", 13, "播放器被销毁")};
        f419250u = rVarArr;
        rz5.b.a(rVarArr);
    }

    public r(java.lang.String str, int i17, java.lang.String str2) {
        this.f419251d = str2;
    }

    /* renamed from: valueOf */
    public static ni3.r m149672xdce0328(java.lang.String str) {
        return (ni3.r) java.lang.Enum.valueOf(ni3.r.class, str);
    }

    /* renamed from: values */
    public static ni3.r[] m149673xcee59d22() {
        return (ni3.r[]) f419250u.clone();
    }
}
