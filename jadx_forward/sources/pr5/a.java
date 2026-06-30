package pr5;

/* loaded from: classes13.dex */
public abstract class a implements pr5.b {

    /* renamed from: a, reason: collision with root package name */
    public volatile int f439578a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f439579b = java.util.Collections.synchronizedList(new java.util.ArrayList());

    public a(android.content.Context context) {
    }

    public final void a() {
        or5.b.a("changeNetwork call", new java.lang.Object[0]);
        synchronized (this.f439579b) {
            try {
                java.util.Iterator it = this.f439579b.iterator();
                while (it.hasNext()) {
                    ((bs5.m) ((pr5.c) it.next())).a();
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
    }

    public void b(android.content.Context context) {
        boolean z17 = true;
        if (context != null) {
            try {
                int a17 = sr5.g.a(context);
                if (this.f439578a == -1) {
                    this.f439578a = a17;
                } else if (this.f439578a != a17) {
                    this.f439578a = a17;
                }
                z17 = false;
            } catch (java.lang.Exception e17) {
                or5.b.c(3, e17, "mayChangeNetwork exception occur", new java.lang.Object[0]);
                return;
            }
        }
        if (z17) {
            a();
        }
    }
}
