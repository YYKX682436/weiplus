package ob0;

/* loaded from: classes10.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f425431a;

    /* renamed from: b, reason: collision with root package name */
    public int f425432b;

    public e(ob0.d callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f425431a = this;
    }

    public final int a() {
        int i17;
        synchronized (this.f425431a) {
            i17 = this.f425432b;
        }
        return i17;
    }

    public abstract boolean b(java.util.List list);
}
