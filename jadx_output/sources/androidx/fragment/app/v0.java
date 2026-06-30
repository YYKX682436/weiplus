package androidx.fragment.app;

/* loaded from: classes14.dex */
public abstract class v0 extends androidx.fragment.app.s0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f11493d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f11494e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f11495f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.fragment.app.FragmentManager f11496g = new androidx.fragment.app.FragmentManagerImpl();

    public v0(android.app.Activity activity, android.content.Context context, android.os.Handler handler, int i17) {
        this.f11493d = activity;
        m3.h.d(context, "context == null");
        this.f11494e = context;
        m3.h.d(handler, "handler == null");
        this.f11495f = handler;
    }

    public abstract void d(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr);

    public abstract java.lang.Object e();

    public abstract android.view.LayoutInflater f();

    public void g(androidx.fragment.app.Fragment fragment, java.lang.String[] strArr, int i17) {
    }

    public abstract boolean h(androidx.fragment.app.Fragment fragment);

    public abstract boolean i(java.lang.String str);

    public void j(androidx.fragment.app.Fragment fragment, android.content.Intent intent, int i17, android.os.Bundle bundle) {
        if (i17 != -1) {
            throw new java.lang.IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        b3.l.startActivity(this.f11494e, intent, bundle);
    }

    public void k(androidx.fragment.app.Fragment fragment, android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27, android.os.Bundle bundle) {
        if (i17 != -1) {
            throw new java.lang.IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        android.app.Activity activity = this.f11493d;
        int i28 = z2.h.f469448a;
        z2.a.c(activity, intentSender, i17, intent, i18, i19, i27, bundle);
    }

    public abstract void l();
}
