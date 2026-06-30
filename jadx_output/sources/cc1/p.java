package cc1;

/* loaded from: classes7.dex */
public abstract class p extends com.tencent.mm.plugin.appbrand.jsapi.f {

    /* renamed from: g, reason: collision with root package name */
    public static final cc1.m f40444g = new cc1.m(null);

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f40445h = {"ECB", "CBC", "CTR", "GCM"};

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f40446i = {"AES"};

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f40447m = {"RSA", "EC"};

    /* renamed from: n, reason: collision with root package name */
    public static java.security.KeyStore f40448n;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l env, org.json.JSONObject data, int i17) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310568a, null, new cc1.o(this, env, data, i17, null), 2, null);
    }

    public abstract java.lang.Object C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, kotlin.coroutines.Continuation continuation);
}
