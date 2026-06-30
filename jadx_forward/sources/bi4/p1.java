package bi4;

/* loaded from: classes5.dex */
public final class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f102609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f102611f;

    public p1(android.graphics.Bitmap bitmap, java.lang.String str, yz5.l lVar) {
        this.f102609d = bitmap;
        this.f102610e = str;
        this.f102611f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String path = this.f102610e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path, "$path");
        dj4.w.c(this.f102609d, path);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path, "$path");
        this.f102611f.mo146xb9724478(path);
    }
}
