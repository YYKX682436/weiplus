package oj0;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f427269a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.HandlerThread f427270b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.Handler f427271c;

    /* renamed from: d, reason: collision with root package name */
    public android.os.HandlerThread f427272d;

    /* renamed from: e, reason: collision with root package name */
    public android.media.ImageReader f427273e;

    /* renamed from: f, reason: collision with root package name */
    public rs0.h f427274f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f427275g;

    /* renamed from: h, reason: collision with root package name */
    public int f427276h;

    /* renamed from: i, reason: collision with root package name */
    public int f427277i;

    /* renamed from: j, reason: collision with root package name */
    public rh0.d0 f427278j;

    /* renamed from: k, reason: collision with root package name */
    public int f427279k;

    /* renamed from: l, reason: collision with root package name */
    public int f427280l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f427281m = new java.util.ArrayList();

    public h() {
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("FilterRenderHandlerThread", 5);
        this.f427270b = a17;
        a17.start();
        this.f427269a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(a17.getLooper());
    }

    public final android.graphics.Bitmap a() {
        android.graphics.Bitmap bitmap = this.f427275g;
        if (bitmap != null) {
            return bitmap;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputBitmap");
        throw null;
    }
}
