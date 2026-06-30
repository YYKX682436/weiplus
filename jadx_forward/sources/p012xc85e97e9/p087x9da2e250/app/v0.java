package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public abstract class v0 extends p012xc85e97e9.p087x9da2e250.app.s0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f93026d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f93027e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f93028f;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d f93029g = new p012xc85e97e9.p087x9da2e250.app.C1105xd50f42dd();

    public v0(android.app.Activity activity, android.content.Context context, android.os.Handler handler, int i17) {
        this.f93026d = activity;
        m3.h.d(context, "context == null");
        this.f93027e = context;
        m3.h.d(handler, "handler == null");
        this.f93028f = handler;
    }

    public abstract void d(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr);

    public abstract java.lang.Object e();

    public abstract android.view.LayoutInflater f();

    public void g(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, java.lang.String[] strArr, int i17) {
    }

    public abstract boolean h(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670);

    public abstract boolean i(java.lang.String str);

    public void j(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, android.content.Intent intent, int i17, android.os.Bundle bundle) {
        if (i17 != -1) {
            throw new java.lang.IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        b3.l.m9722xa4df9991(this.f93027e, intent, bundle);
    }

    public void k(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27, android.os.Bundle bundle) {
        if (i17 != -1) {
            throw new java.lang.IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        android.app.Activity activity = this.f93026d;
        int i28 = z2.h.f550981a;
        z2.a.c(activity, intentSender, i17, intent, i18, i19, i27, bundle);
    }

    public abstract void l();
}
