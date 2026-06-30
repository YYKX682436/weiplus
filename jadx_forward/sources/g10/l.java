package g10;

/* loaded from: classes7.dex */
public final class l implements xq0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f349064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.x7 f349065e;

    public l(int i17, bw5.x7 x7Var) {
        this.f349064d = i17;
        this.f349065e = x7Var;
    }

    @Override // qp0.c
    public void ca(java.lang.String event, java.util.HashMap hashMap, yz5.q callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "handleJsEvent, event = ".concat(event));
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(event, "getBizPreloadData")) {
            callback.mo147xb9724478(1, "event not handle", null);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getBizPreloadData, preloadType = ");
        int i17 = this.f349064d;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", sb6.toString());
        callback.mo147xb9724478(0, "", kz5.c1.i(new jz5.l("preloadType", java.lang.Integer.valueOf(i17)), new jz5.l("initParams", this.f349065e.e().c())));
    }
}
