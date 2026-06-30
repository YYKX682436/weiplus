package cx5;

/* loaded from: classes8.dex */
public final class a extends com.p314xaae8f345.p3178x498cab9f.p3188x60b7c31.p3189x2e06d1.AbstractC27737x928eaf96 {

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f306188c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.p3178x498cab9f.p3188x60b7c31.p3189x2e06d1.AbstractC27738x9ba4b491 context, java.util.Set jsApiList) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApiList, "jsApiList");
        int d17 = kz5.b1.d(kz5.d0.q(jsApiList, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        java.util.Iterator it = jsApiList.iterator();
        if (!it.hasNext()) {
            this.f306188c = linkedHashMap;
            return;
        }
        java.lang.Object newInstance = ((java.lang.Class) it.next()).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance, "null cannot be cast to non-null type com.tencent.wemagic.jsapi.base.MBJsApiAsyncBase<out T of com.tencent.wemagic.jsapi.base.MBJsAdaptor.jsApiNameToClass$lambda$0>");
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(newInstance);
        throw null;
    }

    @Override // com.p314xaae8f345.p3178x498cab9f.p3188x60b7c31.p3189x2e06d1.AbstractC27737x928eaf96
    public java.util.Set b() {
        return ((java.util.LinkedHashMap) this.f306188c).keySet();
    }

    @Override // com.p314xaae8f345.p3178x498cab9f.p3188x60b7c31.p3189x2e06d1.AbstractC27737x928eaf96
    public void c(java.lang.String apiName, java.lang.String apiData, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiName, "apiName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiData, "apiData");
        try {
            java.lang.Object obj = ((java.util.LinkedHashMap) this.f306188c).get(apiName);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            java.lang.Object newInstance = ((java.lang.Class) obj).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance, "null cannot be cast to non-null type com.tencent.wemagic.jsapi.base.MBJsApiAsyncBase<T of com.tencent.wemagic.jsapi.base.MBJsAdaptor>");
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(newInstance);
            throw null;
        } catch (java.lang.Exception e17) {
            java.lang.String otherMsg = apiName + e17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(otherMsg, "otherMsg");
            this.f301631a.b(j17, 4, "fail:internal error ".concat(otherMsg), "");
        }
    }
}
