package hd5;

/* loaded from: classes9.dex */
public final class j implements hd5.m {

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f362142h;

    /* renamed from: a, reason: collision with root package name */
    public final yb5.q f362143a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f362144b;

    /* renamed from: c, reason: collision with root package name */
    public final yb5.d f362145c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f362146d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.LruCache f362147e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f362148f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f362149g;

    static {
        new hd5.b(null);
        f362142h = jz5.h.b(hd5.a.f362121d);
    }

    public j(yb5.d chattingContext, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        this.f362143a = chattingContext.v();
        this.f362146d = jz5.h.b(hd5.i.f362141d);
        this.f362147e = new android.util.LruCache(800);
        boolean z17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20004x14fe807()) == 1;
        this.f362148f = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingDataCallbackV2", "init isFilterSpecialTextNew:%s", java.lang.Boolean.valueOf(z17));
        this.f362144b = list;
        this.f362145c = chattingContext;
        this.f362149g = new hd5.h(this);
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingDataCallbackV2", "removeOverTimeTask() called");
        this.f362145c.q().mo50300x3fa464aa(this.f362149g);
    }
}
