package androidx.work;

/* loaded from: classes12.dex */
public final class WorkManagerInitializer implements r4.b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f12463a = a5.a0.e("WrkMgrInitializer");

    @Override // r4.b
    public java.util.List dependencies() {
        return java.util.Collections.emptyList();
    }

    @Override // r4.b
    public java.lang.Object l0(android.content.Context context) {
        a5.a0.c().a(f12463a, "Initializing WorkManager with default configuration.", new java.lang.Throwable[0]);
        b5.w.d(context, new a5.d(new a5.c()));
        return b5.w.c(context);
    }
}
