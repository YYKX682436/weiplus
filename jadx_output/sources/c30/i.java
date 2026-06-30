package c30;

/* loaded from: classes11.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f38129e = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(c30.i.class, "lastFetchDataTimeMillis", "getLastFetchDataTimeMillis()J", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(c30.i.class, "fetchDataTimeIntervalMillis", "getFetchDataTimeIntervalMillis()J", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f38130a;

    /* renamed from: b, reason: collision with root package name */
    public final b30.c f38131b;

    /* renamed from: c, reason: collision with root package name */
    public final b30.c f38132c;

    /* renamed from: d, reason: collision with root package name */
    public final c30.h f38133d;

    public i(yz5.a task) {
        kotlin.jvm.internal.o.g(task, "task");
        this.f38130a = task;
        this.f38131b = new b30.c(0L, gm0.j1.b().h() + ".ecs.WeShop.FetchDataTrigger.LastFetchDataTime");
        this.f38132c = new b30.c(10800000L, gm0.j1.b().h() + ".ecs.WeShop.FetchDataTrigger.FetchDataTimeInterval");
        this.f38133d = new c30.h(this);
    }
}
