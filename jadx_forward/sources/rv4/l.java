package rv4;

/* loaded from: classes12.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f482053d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.util.Map map) {
        super(2);
        this.f482053d = map;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String key = (java.lang.String) obj;
        org.json.JSONObject value = (org.json.JSONObject) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.a(key);
        if (a17 > 0) {
            this.f482053d.put(key, new rv4.m(a17, value));
        }
        return jz5.f0.f384359a;
    }
}
