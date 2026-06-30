package h7;

/* loaded from: classes13.dex */
public class j extends n7.c {

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Handler f360877g;

    /* renamed from: h, reason: collision with root package name */
    public final int f360878h;

    /* renamed from: i, reason: collision with root package name */
    public final long f360879i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Bitmap f360880m;

    public j(android.os.Handler handler, int i17, long j17) {
        this.f360877g = handler;
        this.f360878h = i17;
        this.f360879i = j17;
    }

    @Override // n7.h
    public void b(android.graphics.drawable.Drawable drawable) {
        this.f360880m = null;
    }

    @Override // n7.h
    public void c(java.lang.Object obj, o7.c cVar) {
        this.f360880m = (android.graphics.Bitmap) obj;
        android.os.Handler handler = this.f360877g;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f360879i);
    }
}
