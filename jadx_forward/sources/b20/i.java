package b20;

/* loaded from: classes9.dex */
public final class i extends y10.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String name) {
        super(name);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
    }

    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        bw5.v7 g17 = jumpInfo.g();
        java.lang.String c17 = g17 != null ? g17.c() : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ECS_O.NativeHandler.GivePreviewPOI", "handle params nil");
            callback.c("handle params nil");
            return;
        }
        try {
            ((j00.k1) ((c00.e3) i95.n0.c(c00.e3.class))).pj(context.c(), b00.p0.f98280a.e(new org.json.JSONObject(c17)));
            callback.d(null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ECS_O.NativeHandler.GivePreviewPOI", "handle error:" + e17);
            callback.c("handle error");
        }
    }
}
