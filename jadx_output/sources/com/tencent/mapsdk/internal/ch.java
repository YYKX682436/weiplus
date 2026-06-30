package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public abstract class ch implements com.tencent.mapsdk.internal.cj {

    /* renamed from: a, reason: collision with root package name */
    java.lang.String f49131a;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.Set<com.tencent.mapsdk.internal.ch.a> f49133f = new java.util.concurrent.ConcurrentSkipListSet(new java.util.Comparator<com.tencent.mapsdk.internal.ch.a>() { // from class: com.tencent.mapsdk.internal.ch.1
        private static int a(com.tencent.mapsdk.internal.ch.a aVar, com.tencent.mapsdk.internal.ch.a aVar2) {
            return aVar.f49135a.compareTo(aVar2.f49135a);
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(com.tencent.mapsdk.internal.ch.a aVar, com.tencent.mapsdk.internal.ch.a aVar2) {
            return aVar.f49135a.compareTo(aVar2.f49135a);
        }
    });

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.cs f49132b = new com.tencent.mapsdk.internal.cs();

    /* loaded from: classes13.dex */
    public static class a<S extends com.tencent.mapsdk.internal.cn> {

        /* renamed from: a, reason: collision with root package name */
        java.lang.String f49135a;

        /* renamed from: b, reason: collision with root package name */
        java.lang.Class<S> f49136b;

        /* renamed from: c, reason: collision with root package name */
        java.lang.reflect.Method f49137c;

        /* renamed from: d, reason: collision with root package name */
        java.util.Map<java.lang.String, java.lang.String> f49138d;

        /* renamed from: e, reason: collision with root package name */
        S f49139e;

        public a(java.lang.String str, java.lang.Class cls, java.lang.reflect.Method method) {
            this.f49135a = str;
            this.f49136b = cls;
            this.f49137c = method;
        }
    }

    private com.tencent.mapsdk.internal.cs c() {
        return this.f49132b;
    }

    private com.tencent.mapsdk.internal.ch.a d(java.lang.String str) {
        for (com.tencent.mapsdk.internal.ch.a aVar : this.f49133f) {
            if (aVar.f49135a.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    private <S extends com.tencent.mapsdk.internal.cn> S e(java.lang.Class<S> cls) {
        java.util.Iterator<com.tencent.mapsdk.internal.ch.a> it = this.f49133f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mapsdk.internal.ch.a next = it.next();
            if (next.f49136b == cls) {
                java.lang.reflect.Method method = next.f49137c;
                if (method != null) {
                    try {
                        method.setAccessible(true);
                        java.lang.Object invoke = method.invoke(this, next.f49136b);
                        if (invoke != null && invoke.getClass() == cls) {
                            S s17 = (S) invoke;
                            s17.a(next.f49138d);
                            next.f49139e = s17;
                            return s17;
                        }
                    } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
                    }
                }
            }
        }
        return (S) b(cls);
    }

    @Override // com.tencent.mapsdk.internal.cj
    public final java.lang.String a() {
        return this.f49131a;
    }

    public abstract <S extends com.tencent.mapsdk.internal.cn> S b(java.lang.Class<S> cls);

    public final <S extends com.tencent.mapsdk.internal.cn> S b(java.lang.String str) {
        com.tencent.mapsdk.internal.ch.a d17 = d(str);
        if (d17 == null) {
            return null;
        }
        S s17 = d17.f49139e;
        return s17 != null ? s17 : (S) e(d17.f49136b);
    }

    private void c(java.lang.String str) {
        this.f49131a = str;
    }

    @Override // com.tencent.mapsdk.internal.cm
    public final com.tencent.mapsdk.internal.cm.a a(java.lang.String str) {
        return b(str);
    }

    private com.tencent.mapsdk.internal.ch.a d(java.lang.Class cls) {
        for (com.tencent.mapsdk.internal.ch.a aVar : this.f49133f) {
            if (aVar.f49136b.equals(cls)) {
                return aVar;
            }
        }
        return null;
    }

    public final void a(com.tencent.mapsdk.internal.cl clVar) {
        java.util.Iterator<java.lang.Class<? extends com.tencent.mapsdk.internal.p>> it = clVar.b().iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.o.a(it.next());
        }
        java.util.Map<java.lang.String, java.lang.Class<? extends com.tencent.mapsdk.internal.cm.a>> a17 = clVar.a();
        this.f49133f.clear();
        for (java.util.Map.Entry<java.lang.String, java.lang.Class<? extends com.tencent.mapsdk.internal.cm.a>> entry : a17.entrySet()) {
            try {
                this.f49133f.add(new com.tencent.mapsdk.internal.ch.a(entry.getKey(), entry.getValue(), com.tencent.mapsdk.internal.ch.class.getDeclaredMethod("b", java.lang.Class.class)));
            } catch (java.lang.NoSuchMethodException e17) {
                throw new java.lang.IllegalStateException(e17);
            }
        }
        java.util.Map<java.lang.String, java.lang.String> a_ = clVar.a_();
        if (a_ == null || a_.isEmpty()) {
            return;
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry2 : a_.entrySet()) {
            a(entry2.getKey(), entry2.getValue());
        }
    }

    public final <S extends com.tencent.mapsdk.internal.cn> S c(java.lang.Class<S> cls) {
        com.tencent.mapsdk.internal.ch.a aVar;
        java.util.Iterator<com.tencent.mapsdk.internal.ch.a> it = this.f49133f.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
            if (aVar.f49136b.equals(cls)) {
                break;
            }
        }
        if (aVar != null) {
            S s17 = aVar.f49139e;
            return s17 != null ? s17 : (S) e(aVar.f49136b);
        }
        return (S) b(cls);
    }

    @Override // com.tencent.mapsdk.internal.ck
    public final /* bridge */ /* synthetic */ com.tencent.mapsdk.internal.cr b() {
        return this.f49132b;
    }

    private void a(java.lang.String str, java.lang.String str2) {
        for (com.tencent.mapsdk.internal.ch.a aVar : this.f49133f) {
            if (aVar.f49138d == null) {
                aVar.f49138d = new java.util.HashMap();
            }
            aVar.f49138d.put(str, str2);
            S s17 = aVar.f49139e;
            if (s17 != 0) {
                s17.a(aVar.f49138d);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.cm
    public final <T extends com.tencent.mapsdk.internal.cm.a> void a(java.lang.String str, java.lang.Class<T> cls) {
        try {
            this.f49133f.add(new com.tencent.mapsdk.internal.ch.a(str, cls, com.tencent.mapsdk.internal.ch.class.getDeclaredMethod("b", java.lang.Class.class)));
        } catch (java.lang.NoSuchMethodException e17) {
            throw new java.lang.IllegalStateException(e17);
        }
    }

    @Override // com.tencent.mapsdk.internal.cm
    public final <T extends com.tencent.mapsdk.internal.p> void a(java.lang.Class<T> cls) {
        com.tencent.mapsdk.internal.o.a(cls);
    }
}
