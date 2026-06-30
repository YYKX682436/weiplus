package io.p3284xd2ae381c.p3319x36f002;

/* renamed from: io.flutter.util.HandlerCompat */
/* loaded from: classes12.dex */
public final class C28967xf5fe874c {
    /* renamed from: createAsyncHandler */
    public static android.os.Handler m139409x287dc44a(android.os.Looper looper) {
        return android.os.Build.VERSION.SDK_INT >= 28 ? android.os.Handler.createAsync(looper) : new android.os.Handler(looper);
    }
}
