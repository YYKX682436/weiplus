package c20;

/* loaded from: classes8.dex */
public final class f extends y10.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String name) {
        super(name);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
    }

    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        try {
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            android.content.Context c17 = context.c();
            if (c17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ECS_O.NativeHandler.Live", "context.context is null");
                callback.c("context.context is null");
            } else if (w0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ECS_O.NativeHandler.Live", "IFinderLiveFeatureService not available");
                callback.c("IFinderLiveFeatureService not available");
            } else {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).rj(c17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ECS_O.NativeHandler.Live", "Successfully enterFinderLiveShoppingManagerUIForResultFromECS");
                callback.d(null);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ECS_O.NativeHandler.Live", "handle error: " + e17.getMessage());
            callback.c("e: " + e17.getMessage());
        }
    }
}
