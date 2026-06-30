package com.p314xaae8f345.p2845xc516c4b6;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001f\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u0007¢\u0006\u0002\u0010\u000eR$\u0010\u0005\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tencent/pigeon/MMFlutterApiProvider;", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "(Lio/flutter/plugin/common/BinaryMessenger;)V", "apiCreatorMap", "", "Ljava/lang/Class;", "Lkotlin/Function0;", "apiInstanceMap", "", "getApi", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "apiClass", "(Ljava/lang/Class;)Ljava/lang/Object;", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.MMFlutterApiProvider */
/* loaded from: classes11.dex */
public final class C23046x45204e2f {
    private final java.util.Map<java.lang.Class<?>, yz5.a> apiCreatorMap;
    private final java.util.Map<java.lang.Class<?>, java.lang.Object> apiInstanceMap;

    public C23046x45204e2f(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 binaryMessenger) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binaryMessenger, "binaryMessenger");
        this.apiCreatorMap = kz5.b1.e(new jz5.l(com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24552xf068bd30.class, new com.p314xaae8f345.p2845xc516c4b6.C23047xa86d48e2(binaryMessenger)));
        this.apiInstanceMap = new java.util.LinkedHashMap();
    }

    /* renamed from: getApi */
    public final <T> T m84664xb5882ae4(java.lang.Class<T> apiClass) {
        T t17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiClass, "apiClass");
        synchronized (this) {
            if (this.apiInstanceMap.containsKey(apiClass)) {
                t17 = (T) this.apiInstanceMap.get(apiClass);
            } else {
                yz5.a aVar = this.apiCreatorMap.get(apiClass);
                t17 = aVar != null ? (T) aVar.mo152xb9724478() : null;
                if (t17 != null) {
                    this.apiInstanceMap.put(apiClass, t17);
                }
            }
            if (t17 == null) {
                throw new java.lang.RuntimeException(apiClass + " not found");
            }
        }
        return t17;
    }
}
