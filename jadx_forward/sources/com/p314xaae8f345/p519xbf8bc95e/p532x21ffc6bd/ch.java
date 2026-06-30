package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public abstract class ch implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cj {

    /* renamed from: a, reason: collision with root package name */
    java.lang.String f130664a;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.Set<com.tencent.mapsdk.internal.ch.a> f130666f = new java.util.concurrent.ConcurrentSkipListSet(new java.util.Comparator<com.tencent.mapsdk.internal.ch.a>() { // from class: com.tencent.mapsdk.internal.ch.1
        private static int a(com.tencent.mapsdk.internal.ch.a aVar, com.tencent.mapsdk.internal.ch.a aVar2) {
            return aVar.f130668a.compareTo(aVar2.f130668a);
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(com.tencent.mapsdk.internal.ch.a aVar, com.tencent.mapsdk.internal.ch.a aVar2) {
            return aVar.f130668a.compareTo(aVar2.f130668a);
        }
    });

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cs f130665b = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cs();

    /* loaded from: classes13.dex */
    public static class a<S extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cn> {

        /* renamed from: a, reason: collision with root package name */
        java.lang.String f130668a;

        /* renamed from: b, reason: collision with root package name */
        java.lang.Class<S> f130669b;

        /* renamed from: c, reason: collision with root package name */
        java.lang.reflect.Method f130670c;

        /* renamed from: d, reason: collision with root package name */
        java.util.Map<java.lang.String, java.lang.String> f130671d;

        /* renamed from: e, reason: collision with root package name */
        S f130672e;

        public a(java.lang.String str, java.lang.Class cls, java.lang.reflect.Method method) {
            this.f130668a = str;
            this.f130669b = cls;
            this.f130670c = method;
        }
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cs c() {
        return this.f130665b;
    }

    private com.tencent.mapsdk.internal.ch.a d(java.lang.String str) {
        for (com.tencent.mapsdk.internal.ch.a aVar : this.f130666f) {
            if (aVar.f130668a.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    private <S extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cn> S e(java.lang.Class<S> cls) {
        java.util.Iterator<com.tencent.mapsdk.internal.ch.a> it = this.f130666f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mapsdk.internal.ch.a next = it.next();
            if (next.f130669b == cls) {
                java.lang.reflect.Method method = next.f130670c;
                if (method != null) {
                    try {
                        method.setAccessible(true);
                        java.lang.Object invoke = method.invoke(this, next.f130669b);
                        if (invoke != null && invoke.getClass() == cls) {
                            S s17 = (S) invoke;
                            s17.a(next.f130671d);
                            next.f130672e = s17;
                            return s17;
                        }
                    } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
                    }
                }
            }
        }
        return (S) b(cls);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cj
    public final java.lang.String a() {
        return this.f130664a;
    }

    public abstract <S extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cn> S b(java.lang.Class<S> cls);

    public final <S extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cn> S b(java.lang.String str) {
        com.tencent.mapsdk.internal.ch.a d17 = d(str);
        if (d17 == null) {
            return null;
        }
        S s17 = d17.f130672e;
        return s17 != null ? s17 : (S) e(d17.f130669b);
    }

    private void c(java.lang.String str) {
        this.f130664a = str;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cm
    public final com.tencent.mapsdk.internal.cm.a a(java.lang.String str) {
        return b(str);
    }

    private com.tencent.mapsdk.internal.ch.a d(java.lang.Class cls) {
        for (com.tencent.mapsdk.internal.ch.a aVar : this.f130666f) {
            if (aVar.f130669b.equals(cls)) {
                return aVar;
            }
        }
        return null;
    }

    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cl clVar) {
        java.util.Iterator<java.lang.Class<? extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p>> it = clVar.b().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.o.a(it.next());
        }
        java.util.Map<java.lang.String, java.lang.Class<? extends com.tencent.mapsdk.internal.cm.a>> a17 = clVar.a();
        this.f130666f.clear();
        for (java.util.Map.Entry<java.lang.String, java.lang.Class<? extends com.tencent.mapsdk.internal.cm.a>> entry : a17.entrySet()) {
            try {
                this.f130666f.add(new com.tencent.mapsdk.internal.ch.a(entry.getKey(), entry.getValue(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ch.class.getDeclaredMethod("b", java.lang.Class.class)));
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

    public final <S extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cn> S c(java.lang.Class<S> cls) {
        com.tencent.mapsdk.internal.ch.a aVar;
        java.util.Iterator<com.tencent.mapsdk.internal.ch.a> it = this.f130666f.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
            if (aVar.f130669b.equals(cls)) {
                break;
            }
        }
        if (aVar != null) {
            S s17 = aVar.f130672e;
            return s17 != null ? s17 : (S) e(aVar.f130669b);
        }
        return (S) b(cls);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ck
    public final /* bridge */ /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cr b() {
        return this.f130665b;
    }

    private void a(java.lang.String str, java.lang.String str2) {
        for (com.tencent.mapsdk.internal.ch.a aVar : this.f130666f) {
            if (aVar.f130671d == null) {
                aVar.f130671d = new java.util.HashMap();
            }
            aVar.f130671d.put(str, str2);
            S s17 = aVar.f130672e;
            if (s17 != 0) {
                s17.a(aVar.f130671d);
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cm
    public final <T extends com.tencent.mapsdk.internal.cm.a> void a(java.lang.String str, java.lang.Class<T> cls) {
        try {
            this.f130666f.add(new com.tencent.mapsdk.internal.ch.a(str, cls, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ch.class.getDeclaredMethod("b", java.lang.Class.class)));
        } catch (java.lang.NoSuchMethodException e17) {
            throw new java.lang.IllegalStateException(e17);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cm
    public final <T extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p> void a(java.lang.Class<T> cls) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.o.a(cls);
    }
}
