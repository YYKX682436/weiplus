package v75;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Object f515493b;

    /* renamed from: a, reason: collision with root package name */
    public static final v75.g f515492a = new v75.g();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f515494c = jz5.h.b(v75.f.f515491d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f515495d = jz5.h.b(v75.d.f515489d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f515496e = jz5.h.b(v75.e.f515490d);

    public final int a() {
        java.lang.reflect.Constructor<?>[] constructors;
        java.lang.reflect.Constructor constructor;
        jz5.g gVar = f515496e;
        if (((jz5.n) gVar).mo141623x754a37bb() == null) {
            return -1;
        }
        try {
            jz5.g gVar2 = f515495d;
            java.lang.Class cls = (java.lang.Class) ((jz5.n) gVar2).mo141623x754a37bb();
            java.lang.Object obj = null;
            java.lang.reflect.Method method = cls != null ? cls.getMethod("setNonce", java.lang.String.class) : null;
            java.lang.Class cls2 = (java.lang.Class) ((jz5.n) gVar2).mo141623x754a37bb();
            java.lang.reflect.Method method2 = cls2 != null ? cls2.getMethod("setAppId", java.lang.String.class) : null;
            java.lang.Class cls3 = (java.lang.Class) ((jz5.n) gVar2).mo141623x754a37bb();
            java.lang.reflect.Method method3 = cls3 != null ? cls3.getMethod("setAlg", java.lang.String.class) : null;
            if (method != null) {
                method.invoke(((jz5.n) gVar).mo141623x754a37bb(), "");
            }
            if (method2 != null) {
                method2.invoke(((jz5.n) gVar).mo141623x754a37bb(), "104419772");
            }
            if (method3 != null) {
                method3.invoke(((jz5.n) gVar).mo141623x754a37bb(), "");
            }
            java.lang.Class cls4 = (java.lang.Class) ((jz5.n) f515494c).mo141623x754a37bb();
            if (cls4 != null && (constructors = cls4.getConstructors()) != null && (constructor = (java.lang.reflect.Constructor) kz5.z.O(constructors)) != null) {
                obj = constructor.newInstance(((jz5.n) gVar).mo141623x754a37bb());
            }
            f515493b = obj;
            return 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Honor.FraudAppDetect", th6, "initFraudAppDetectObject", new java.lang.Object[0]);
            return -1;
        }
    }

    public final java.lang.String b(java.lang.Object obj) {
        java.lang.Class<?> cls;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.nio.charset.Charset charset;
        if (obj == null || (method = (cls = obj.getClass()).getMethod("getErrorCode", new java.lang.Class[0])) == null) {
            return "error";
        }
        java.lang.Object invoke = method.invoke(obj, new java.lang.Object[0]);
        java.lang.Integer num = invoke instanceof java.lang.Integer ? (java.lang.Integer) invoke : null;
        if (num == null || num.intValue() != 0 || (method2 = cls.getMethod("getResultInfo", new java.lang.Class[0])) == null) {
            return "error";
        }
        java.lang.Object invoke2 = method2.invoke(obj, new java.lang.Object[0]);
        java.lang.String str = invoke2 instanceof java.lang.String ? (java.lang.String) invoke2 : null;
        try {
            java.util.List f07 = r26.n0.f0(str == null ? "" : str, new java.lang.String[]{"."}, false, 0, 6, null);
            if (f07.size() != 3) {
                return "error";
            }
            java.lang.String str2 = (java.lang.String) f07.get(1);
            java.util.Base64.Decoder urlDecoder = java.util.Base64.getUrlDecoder();
            byte[] decode = urlDecoder != null ? urlDecoder.decode(str2) : null;
            if (decode != null && (charset = java.nio.charset.StandardCharsets.UTF_8) != null) {
                org.json.JSONObject optJSONObject = new org.json.JSONObject(new java.lang.String(decode, charset)).optJSONObject("detail");
                java.lang.String jSONObject = optJSONObject != null ? optJSONObject.toString() : null;
                return jSONObject == null ? "" : jSONObject;
            }
            return "error";
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Honor.FraudAppDetect", e17, "parseJwsResult", new java.lang.Object[0]);
            return "error";
        }
    }
}
