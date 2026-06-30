package q83;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f442281a = false;

    public abstract void a();

    public final void b() {
        if (this.f442281a) {
            a();
            this.f442281a = false;
        }
    }

    public void c() {
    }

    public void d() {
        c();
        this.f442281a = true;
    }
}
