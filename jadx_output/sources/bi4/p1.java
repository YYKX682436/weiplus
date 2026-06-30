package bi4;

/* loaded from: classes5.dex */
public final class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f21076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f21077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f21078f;

    public p1(android.graphics.Bitmap bitmap, java.lang.String str, yz5.l lVar) {
        this.f21076d = bitmap;
        this.f21077e = str;
        this.f21078f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String path = this.f21077e;
        kotlin.jvm.internal.o.f(path, "$path");
        dj4.w.c(this.f21076d, path);
        kotlin.jvm.internal.o.f(path, "$path");
        this.f21078f.invoke(path);
    }
}
