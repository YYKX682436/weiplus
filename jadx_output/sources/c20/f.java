package c20;

/* loaded from: classes8.dex */
public final class f extends y10.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String name) {
        super(name);
        kotlin.jvm.internal.o.g(name, "name");
    }

    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            android.content.Context c17 = context.c();
            if (c17 == null) {
                com.tencent.mars.xlog.Log.e("ECS_O.NativeHandler.Live", "context.context is null");
                callback.c("context.context is null");
            } else if (w0Var == null) {
                com.tencent.mars.xlog.Log.w("ECS_O.NativeHandler.Live", "IFinderLiveFeatureService not available");
                callback.c("IFinderLiveFeatureService not available");
            } else {
                ((com.tencent.mm.feature.finder.live.v4) w0Var).rj(c17);
                com.tencent.mars.xlog.Log.i("ECS_O.NativeHandler.Live", "Successfully enterFinderLiveShoppingManagerUIForResultFromECS");
                callback.d(null);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ECS_O.NativeHandler.Live", "handle error: " + e17.getMessage());
            callback.c("e: " + e17.getMessage());
        }
    }
}
