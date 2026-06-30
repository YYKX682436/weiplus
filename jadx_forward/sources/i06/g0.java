package i06;

/* loaded from: classes16.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.k0 f368181d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i06.k0 k0Var) {
        super(0);
        this.f368181d = k0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.reflect.Type[] lowerBounds;
        i06.k0 k0Var = this.f368181d;
        java.lang.reflect.Type type = null;
        if (k0Var.mo128642x6f0de7b2()) {
            java.lang.Object k07 = kz5.n0.k0(k0Var.i().a());
            java.lang.reflect.ParameterizedType parameterizedType = k07 instanceof java.lang.reflect.ParameterizedType ? (java.lang.reflect.ParameterizedType) k07 : null;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(parameterizedType != null ? parameterizedType.getRawType() : null, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57.class)) {
                java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(actualTypeArguments, "getActualTypeArguments(...)");
                java.lang.Object l07 = kz5.z.l0(actualTypeArguments);
                java.lang.reflect.WildcardType wildcardType = l07 instanceof java.lang.reflect.WildcardType ? (java.lang.reflect.WildcardType) l07 : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    type = (java.lang.reflect.Type) kz5.z.L(lowerBounds);
                }
            }
        }
        return type == null ? k0Var.i().mo140167x3df4e080() : type;
    }
}
