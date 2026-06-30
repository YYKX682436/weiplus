package p5;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final p5.c f433499b = new p5.c();

    /* renamed from: c, reason: collision with root package name */
    public static final int f433500c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f433501d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.Executor f433502a = new p5.b(null);

    static {
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        f433500c = availableProcessors + 1;
        f433501d = (availableProcessors * 2) + 1;
    }
}
