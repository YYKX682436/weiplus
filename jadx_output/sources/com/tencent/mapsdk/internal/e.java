package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class e extends com.tencent.mapsdk.internal.c {

    /* renamed from: e, reason: collision with root package name */
    protected java.util.HashMap<java.lang.String, byte[]> f49224e = null;

    /* renamed from: g, reason: collision with root package name */
    private java.util.HashMap<java.lang.String, java.lang.Object> f49226g = new java.util.HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    com.tencent.mapsdk.internal.m f49225f = new com.tencent.mapsdk.internal.m();

    private <T> T f(java.lang.String str, T t17) {
        if (!this.f49224e.containsKey(str)) {
            return null;
        }
        if (t17 != null) {
            return (T) a(this.f49224e.remove(str), t17);
        }
        this.f49224e.remove(str);
        return null;
    }

    @Override // com.tencent.mapsdk.internal.c
    public final /* bridge */ /* synthetic */ java.lang.String a() {
        return super.a();
    }

    @Override // com.tencent.mapsdk.internal.c
    public final void b() {
        this.f49226g.clear();
    }

    @Override // com.tencent.mapsdk.internal.c
    public final java.util.Set<java.lang.String> c() {
        java.util.HashMap<java.lang.String, byte[]> hashMap = this.f49224e;
        if (hashMap != null) {
            return java.util.Collections.unmodifiableSet(hashMap.keySet());
        }
        return java.util.Collections.unmodifiableSet(this.f49080a.keySet());
    }

    @Override // com.tencent.mapsdk.internal.c
    public final boolean d() {
        java.util.HashMap<java.lang.String, byte[]> hashMap = this.f49224e;
        if (hashMap != null) {
            return hashMap.isEmpty();
        }
        return this.f49080a.isEmpty();
    }

    @Override // com.tencent.mapsdk.internal.c
    public final int e() {
        java.util.HashMap<java.lang.String, byte[]> hashMap = this.f49224e;
        if (hashMap != null) {
            return hashMap.size();
        }
        return this.f49080a.size();
    }

    public void g() {
        this.f49224e = new java.util.HashMap<>();
    }

    @Override // com.tencent.mapsdk.internal.c
    public final /* bridge */ /* synthetic */ java.lang.String a(java.lang.Object obj) {
        return super.a((com.tencent.mapsdk.internal.e) obj);
    }

    @Override // com.tencent.mapsdk.internal.c
    public final boolean b(java.lang.String str) {
        java.util.HashMap<java.lang.String, byte[]> hashMap = this.f49224e;
        if (hashMap != null) {
            return hashMap.containsKey(str);
        }
        return this.f49080a.containsKey(str);
    }

    @Override // com.tencent.mapsdk.internal.c
    public final /* bridge */ /* synthetic */ void a(java.lang.String str) {
        super.a(str);
    }

    private <T> T c(java.lang.String str, T t17) {
        java.util.HashMap<java.lang.String, byte[]> hashMap = this.f49224e;
        if (hashMap != null) {
            if (!hashMap.containsKey(str)) {
                return null;
            }
            if (this.f49226g.containsKey(str)) {
                return (T) this.f49226g.get(str);
            }
            try {
                T t18 = (T) a(this.f49224e.get(str), t17);
                if (t18 != null) {
                    d(str, t18);
                }
                return t18;
            } catch (java.lang.Exception e17) {
                throw new com.tencent.mapsdk.internal.b(e17);
            }
        }
        if (!this.f49080a.containsKey(str)) {
            return null;
        }
        if (this.f49226g.containsKey(str)) {
            return (T) this.f49226g.get(str);
        }
        byte[] bArr = new byte[0];
        java.util.Iterator<java.util.Map.Entry<java.lang.String, byte[]>> it = this.f49080a.get(str).entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry<java.lang.String, byte[]> next = it.next();
            next.getKey();
            bArr = next.getValue();
        }
        try {
            this.f49225f.a(bArr);
            this.f49225f.a(this.f49082c);
            T t19 = (T) this.f49225f.a((com.tencent.mapsdk.internal.m) t17, 0, true);
            d(str, t19);
            return t19;
        } catch (java.lang.Exception e18) {
            throw new com.tencent.mapsdk.internal.b(e18);
        }
    }

    private void d(java.lang.String str, java.lang.Object obj) {
        this.f49226g.put(str, obj);
    }

    private <T> T e(java.lang.String str, java.lang.Object obj) {
        return (T) a(str, obj, true, null);
    }

    @Override // com.tencent.mapsdk.internal.c
    public <T> void a(java.lang.String str, T t17) {
        if (this.f49224e == null) {
            super.a(str, (java.lang.String) t17);
            return;
        }
        if (str == null) {
            throw new java.lang.IllegalArgumentException("put key can not is null");
        }
        if (t17 != null) {
            if (!(t17 instanceof java.util.Set)) {
                com.tencent.mapsdk.internal.n nVar = new com.tencent.mapsdk.internal.n();
                nVar.a(this.f49082c);
                nVar.a(t17, 0);
                this.f49224e.put(str, com.tencent.mapsdk.internal.q.a(nVar.f50484a));
                return;
            }
            throw new java.lang.IllegalArgumentException("can not support Set");
        }
        throw new java.lang.IllegalArgumentException("put value can not is null");
    }

    private <T> T b(java.lang.String str, T t17) {
        if (!this.f49224e.containsKey(str)) {
            return null;
        }
        if (this.f49226g.containsKey(str)) {
            return (T) this.f49226g.get(str);
        }
        try {
            T t18 = (T) a(this.f49224e.get(str), t17);
            if (t18 != null) {
                d(str, t18);
            }
            return t18;
        } catch (java.lang.Exception e17) {
            throw new com.tencent.mapsdk.internal.b(e17);
        }
    }

    private <T> T d(java.lang.String str) {
        return (T) b(str, true, (java.lang.ClassLoader) null);
    }

    private <T> T e(java.lang.String str) {
        return (T) c(str, true, null);
    }

    @Override // com.tencent.mapsdk.internal.c
    public byte[] f() {
        if (this.f49224e != null) {
            com.tencent.mapsdk.internal.n nVar = new com.tencent.mapsdk.internal.n(0);
            nVar.a(this.f49082c);
            nVar.a((java.util.Map) this.f49224e, 0);
            return com.tencent.mapsdk.internal.q.a(nVar.f50484a);
        }
        return super.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> T b(java.lang.String str, T t17, java.lang.Object obj) {
        return !this.f49224e.containsKey(str) ? obj : (T) c(str, t17);
    }

    @Override // com.tencent.mapsdk.internal.c
    public final <T> T b(java.lang.String str, boolean z17, java.lang.ClassLoader classLoader) {
        if (this.f49224e == null) {
            return (T) super.b(str, z17, classLoader);
        }
        throw new java.lang.RuntimeException("data is encoded by new version, please use getByClass(String name, T proxy)");
    }

    private <T> T a(java.lang.String str, T t17, T t18) {
        java.util.HashMap<java.lang.String, byte[]> hashMap = this.f49224e;
        if (hashMap != null) {
            if (!hashMap.containsKey(str)) {
                return t18;
            }
            if (this.f49226g.containsKey(str)) {
                return (T) this.f49226g.get(str);
            }
            try {
                T t19 = (T) a(this.f49224e.get(str), t17);
                if (t19 != null) {
                    d(str, t19);
                }
                return t19;
            } catch (java.lang.Exception e17) {
                throw new com.tencent.mapsdk.internal.b(e17);
            }
        }
        if (!this.f49080a.containsKey(str)) {
            return t18;
        }
        if (this.f49226g.containsKey(str)) {
            return (T) this.f49226g.get(str);
        }
        byte[] bArr = new byte[0];
        java.util.Iterator<java.util.Map.Entry<java.lang.String, byte[]>> it = this.f49080a.get(str).entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry<java.lang.String, byte[]> next = it.next();
            next.getKey();
            bArr = next.getValue();
        }
        try {
            this.f49225f.a(bArr);
            this.f49225f.a(this.f49082c);
            T t27 = (T) this.f49225f.a((com.tencent.mapsdk.internal.m) t17, 0, true);
            d(str, t27);
            return t27;
        } catch (java.lang.Exception e18) {
            throw new com.tencent.mapsdk.internal.b(e18);
        }
    }

    public void b(byte[] bArr) {
        this.f49225f.a(bArr);
        this.f49225f.a(this.f49082c);
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("", new byte[0]);
        this.f49224e = this.f49225f.a((java.util.Map) hashMap, 0, false);
    }

    private <T> T c(java.lang.String str) {
        return (T) a(str, true, (java.lang.ClassLoader) null);
    }

    @Override // com.tencent.mapsdk.internal.c
    public final <T> T c(java.lang.String str, boolean z17, java.lang.ClassLoader classLoader) {
        java.util.HashMap<java.lang.String, byte[]> hashMap = this.f49224e;
        if (hashMap != null) {
            if (!hashMap.containsKey(str)) {
                return null;
            }
            this.f49224e.remove(str);
            return null;
        }
        return (T) super.c(str, z17, classLoader);
    }

    public void c(byte[] bArr) {
        super.a(bArr);
    }

    private java.lang.Object a(byte[] bArr, java.lang.Object obj) {
        this.f49225f.a(bArr);
        this.f49225f.a(this.f49082c);
        return this.f49225f.a((com.tencent.mapsdk.internal.m) obj, 0, true);
    }

    @Override // com.tencent.mapsdk.internal.c
    public final <T> T a(java.lang.String str, boolean z17, java.lang.ClassLoader classLoader) {
        if (this.f49224e == null) {
            return (T) super.a(str, z17, classLoader);
        }
        throw new java.lang.RuntimeException("data is encoded by new version, please use getJceStruct(String name,T proxy)");
    }

    @Override // com.tencent.mapsdk.internal.c
    public final <T> T a(java.lang.String str, java.lang.Object obj, boolean z17, java.lang.ClassLoader classLoader) {
        if (this.f49224e == null) {
            return (T) super.a(str, obj, z17, classLoader);
        }
        throw new java.lang.RuntimeException("data is encoded by new version, please use getByClass(String name, T proxy, Object defaultValue)");
    }

    @Override // com.tencent.mapsdk.internal.c
    public void a(byte[] bArr) {
        try {
            super.a(bArr);
        } catch (java.lang.Exception unused) {
            this.f49225f.a(bArr);
            this.f49225f.a(this.f49082c);
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("", new byte[0]);
            this.f49224e = this.f49225f.a((java.util.Map) hashMap, 0, false);
        }
    }
}
