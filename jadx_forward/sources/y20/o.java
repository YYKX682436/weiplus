package y20;

/* loaded from: classes.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qq.g f540549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qq.c0 f540550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f540551f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(qq.g gVar, qq.c0 c0Var, yz5.l lVar) {
        super(1);
        this.f540549d = gVar;
        this.f540550e = c0Var;
        this.f540551f = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        qq.c option = (qq.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        qq.c0 testService = this.f540550e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(testService, "$testService");
        qq.g gVar = this.f540549d;
        gVar.getClass();
        java.lang.Object value = option.f447394b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        qq.s sVar = (qq.s) testService;
        java.lang.String key = gVar.f447404e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        try {
            java.lang.String concat = "ecs_test_".concat(key);
            if (value instanceof java.lang.Integer) {
                sVar.Di().putInt(concat, ((java.lang.Number) value).intValue());
            } else if (value instanceof java.lang.Long) {
                sVar.Di().putLong(concat, ((java.lang.Number) value).longValue());
            } else if (value instanceof java.lang.String) {
                sVar.Di().putString(concat, (java.lang.String) value);
            } else if (value instanceof java.lang.Boolean) {
                sVar.Di().putBoolean(concat, ((java.lang.Boolean) value).booleanValue());
            } else if (value instanceof java.lang.Float) {
                sVar.Di().putFloat(concat, ((java.lang.Number) value).floatValue());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EcsTestService", "setStringConfig failed for key: " + key + ", value: " + value);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsTestService", "setStringConfig: " + key + " = " + value);
            sVar.wi(key, value);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EcsTestService", "setStringConfig failed for key: " + key + ", value: " + value, e17);
        }
        this.f540551f.mo146xb9724478(value);
        return jz5.f0.f384359a;
    }
}
