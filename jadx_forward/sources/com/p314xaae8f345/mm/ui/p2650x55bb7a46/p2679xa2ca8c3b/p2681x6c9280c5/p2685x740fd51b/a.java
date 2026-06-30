package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b;

/* loaded from: classes13.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.AbstractC22098xdb6634aa f286301d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.AbstractC22098xdb6634aa abstractC22098xdb6634aa) {
        super(0);
        this.f286301d = abstractC22098xdb6634aa;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.AbstractC22098xdb6634aa.f286233i;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.AbstractC22098xdb6634aa abstractC22098xdb6634aa = this.f286301d;
        for (java.lang.Class<?> cls = abstractC22098xdb6634aa.getClass(); cls != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls, java.lang.Object.class); cls = cls.getSuperclass()) {
            java.lang.reflect.Type genericSuperclass = cls.getGenericSuperclass();
            if (genericSuperclass instanceof java.lang.reflect.ParameterizedType) {
                java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) genericSuperclass;
                java.lang.reflect.Type rawType = parameterizedType.getRawType();
                java.lang.Class cls2 = rawType instanceof java.lang.Class ? (java.lang.Class) rawType : null;
                if (cls2 != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.AbstractC22098xdb6634aa.class)) {
                    java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(actualTypeArguments, "getActualTypeArguments(...)");
                    java.lang.Class h17 = abstractC22098xdb6634aa.h((java.lang.reflect.Type) kz5.z.O(actualTypeArguments));
                    if (h17 != null && b11.a.class.isAssignableFrom(h17)) {
                        return h17;
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingMediaGroupBaseItemMvvmView", "resolveViewModelClazz failed, fallback to IMediaViewModel");
        return b11.a.class;
    }
}
