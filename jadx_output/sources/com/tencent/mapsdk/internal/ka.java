package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ka {

    /* renamed from: a, reason: collision with root package name */
    com.tencent.mapsdk.internal.ln f50058a = new com.tencent.mapsdk.internal.ln();

    /* renamed from: b, reason: collision with root package name */
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, com.tencent.mapsdk.internal.jy>> f50059b = new java.util.concurrent.ConcurrentHashMap<>();

    public final <D extends com.tencent.mapsdk.internal.jz, C extends com.tencent.mapsdk.internal.jy<D>> C a(java.lang.Class<D> cls, com.tencent.mapsdk.internal.jy.a aVar, java.lang.Class<C> cls2) {
        C c17;
        java.util.Map<java.lang.String, com.tencent.mapsdk.internal.jy> map = this.f50059b.get(cls2.getName());
        java.lang.String a17 = com.tencent.mapsdk.internal.kc.a(cls.getName() + aVar.toString());
        java.lang.String name = cls2.getName();
        java.lang.reflect.Constructor<?> constructor = null;
        if (map != null) {
            c17 = (C) map.get(a17);
            if (c17 != null) {
                return c17;
            }
        } else {
            c17 = null;
        }
        for (java.lang.reflect.Constructor<?> constructor2 : cls2.getDeclaredConstructors()) {
            java.lang.Class<?>[] parameterTypes = constructor2.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0] == aVar.getClass()) {
                constructor = constructor2;
            }
        }
        if (constructor != null) {
            try {
                c17 = (C) ((com.tencent.mapsdk.internal.jy) constructor.newInstance(aVar));
            } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            }
        }
        if (c17 != null) {
            if (map == null) {
                map = new java.util.HashMap<>();
            }
            map.put(a17, c17);
            this.f50059b.put(name, map);
        }
        return c17;
    }

    /* loaded from: classes13.dex */
    public static class a<D extends com.tencent.mapsdk.internal.jz> extends com.tencent.mapsdk.internal.lg<java.lang.String, D> {

        /* renamed from: a, reason: collision with root package name */
        private com.tencent.mapsdk.internal.jy.b<D> f50060a;

        public a(int i17, com.tencent.mapsdk.internal.jy.b<D> bVar) {
            super(i17);
            this.f50060a = bVar;
        }

        @Override // com.tencent.mapsdk.internal.lg
        public final /* bridge */ /* synthetic */ int a(java.lang.Object obj) {
            com.tencent.mapsdk.internal.jz jzVar = (com.tencent.mapsdk.internal.jz) obj;
            if (jzVar != null) {
                return jzVar.a();
            }
            return 0;
        }

        @Override // com.tencent.mapsdk.internal.lg
        public final /* bridge */ /* synthetic */ void a(boolean z17, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
            com.tencent.mapsdk.internal.jy.b<D> bVar;
            com.tencent.mapsdk.internal.jz jzVar = (com.tencent.mapsdk.internal.jz) obj;
            if (!z17 || (bVar = this.f50060a) == null) {
                return;
            }
            bVar.a(jzVar);
        }

        private static int a(D d17) {
            if (d17 != null) {
                return d17.a();
            }
            return 0;
        }

        private void a(boolean z17, D d17) {
            com.tencent.mapsdk.internal.jy.b<D> bVar;
            if (!z17 || (bVar = this.f50060a) == null) {
                return;
            }
            bVar.a(d17);
        }
    }

    private java.lang.String a(java.lang.String str) {
        return this.f50058a.a(str);
    }
}
