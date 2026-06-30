package lm5;

/* loaded from: classes12.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final lm5.j f401133a = new lm5.j(android.os.Looper.getMainLooper(), "Vending.UI");

    /* renamed from: b, reason: collision with root package name */
    public static final lm5.j f401134b = new lm5.j(mm5.b.f411231b.f411232a.getLooper(), "Vending.LOGIC");

    /* renamed from: c, reason: collision with root package name */
    public static final lm5.j f401135c = new lm5.j(mm5.a.f411229b.f411230a.getLooper(), "Vending.HEAVY_WORK");

    static {
        lm5.i.f();
    }

    public abstract void a(java.lang.Runnable runnable);

    public abstract void b(java.lang.Runnable runnable, long j17);

    public abstract void c();

    public abstract java.lang.String d();
}
