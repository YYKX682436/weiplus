package cf;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f40815a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f40816b;

    /* renamed from: c, reason: collision with root package name */
    public final int f40817c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40818d;

    public a(android.app.Activity activity, long j17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f40815a = j17;
        this.f40816b = new java.lang.ref.WeakReference(activity);
        this.f40817c = activity.getTaskId();
    }
}
