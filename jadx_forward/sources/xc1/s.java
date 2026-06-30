package xc1;

/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final xc1.s f534590a = new xc1.s();

    /* renamed from: b, reason: collision with root package name */
    public static final ik1.x f534591b = new ik1.x();

    public final void a(java.lang.String appId, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaToNativeCallbacksRegistry", "appId:" + appId + ", data:" + data);
        f534591b.b(appId, new xc1.r(appId, data));
    }
}
