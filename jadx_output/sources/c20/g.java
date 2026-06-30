package c20;

/* loaded from: classes8.dex */
public final class g extends y10.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String name) {
        super(name);
        kotlin.jvm.internal.o.g(name, "name");
    }

    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            android.content.Context c17 = context.c();
            if (c17 == null) {
                com.tencent.mars.xlog.Log.e("ECS_O.NativeHandler.Live", "handle error: context is null");
                callback.c("handle error: context is null");
            } else {
                ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Ai(c17, jumpInfo);
                callback.d(null);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ECS_O.NativeHandler.Live", "handle error: " + e17.getMessage());
            callback.c("handle error");
        }
    }
}
