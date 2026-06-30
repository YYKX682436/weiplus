package if3;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f372701a = gm0.j1.b().h();

    /* renamed from: b, reason: collision with root package name */
    public static volatile java.util.concurrent.Future f372702b;

    public static final java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(b() ? com.p314xaae8f345.mm.vfs.q7.c("MassSendImg") : com.p314xaae8f345.mm.vfs.q7.c("image"));
        sb6.append('/');
        return sb6.toString();
    }

    public static final boolean b() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("masssend_image_migration_enabled_" + f372701a, false);
    }

    public static final void c(boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("masssend_image_migration_done_" + f372701a, false) || !b()) {
            return;
        }
        java.util.concurrent.Future future = f372702b;
        if (future == null) {
            future = ((ku5.t0) ku5.t0.f394148d).a(if3.e0.f372699d);
            f372702b = future;
        }
        if (z17) {
            future.get();
        }
    }
}
