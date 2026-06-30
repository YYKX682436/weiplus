package yo2;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final yo2.e f545670a = new yo2.e();

    /* renamed from: b, reason: collision with root package name */
    public static final lb2.j f545671b;

    /* renamed from: c, reason: collision with root package name */
    public static final lb2.j f545672c;

    /* renamed from: d, reason: collision with root package name */
    public static final lb2.k f545673d;

    /* renamed from: e, reason: collision with root package name */
    public static final lb2.k f545674e;

    /* renamed from: f, reason: collision with root package name */
    public static final lb2.j f545675f;

    static {
        ob2.a aVar = new ob2.a(0, "生成直达直播间红点", null, null, 12, null);
        aVar.a("FIND_NEARBY_INDEPENDENT_LIVE_ROOM", kz5.c0.i(0, 1, 2, 3, 4, 5), kz5.c0.i("开预加载+开预推荐", "开预加载+关预推荐", "关预加载+关预推荐", "关预加载+开预推荐", "开模型预加载+关预推荐", "开模型预加载+开预推荐"));
        aVar.f399276n = yo2.a.f545666d;
        f545671b = aVar;
        ob2.a aVar2 = new ob2.a(0, "生成直达直播广场红点", null, null, 12, null);
        aVar2.a("FIND_NEARBY_INDEPENDENT_LIVE_SQUARE", kz5.c0.i(0, 1, 2, 3, 4, 5), kz5.c0.i("开预加载+开预推荐", "开预加载+关预推荐", "关预加载+关预推荐", "关预加载+开预推荐", "开模型预加载+关预推荐", "开模型预加载+开预推荐"));
        aVar2.f399276n = yo2.b.f545667d;
        f545672c = aVar2;
        f545673d = new lb2.k("生成 - 附近直播 - 直达直播间红点", yo2.c.f545668d);
        f545674e = new lb2.k("生成 - 附近直播 - 直达直播广场红点", yo2.d.f545669d);
        ob2.a aVar3 = new ob2.a(0, "直播广场是否开启声音", null, null, 12, null);
        aVar3.a("FIND_NEARBY_LIVE_SQUARE_ENABLE_VOICE", kz5.c0.i(0, 1), kz5.c0.i("默认", "开启"));
        f545675f = aVar3;
    }

    public final void a(yz5.a block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            block.mo152xb9724478();
        }
    }

    public final lb2.k b() {
        return f545673d;
    }

    public final lb2.k c() {
        return f545674e;
    }
}
