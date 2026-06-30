package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    protected java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, byte[]>> f130613a = new java.util.HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    protected java.util.HashMap<java.lang.String, java.lang.Object> f130614b = new java.util.HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private java.util.HashMap<java.lang.String, java.lang.Object> f130617e = new java.util.HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    protected java.lang.String f130615c = "GBK";

    /* renamed from: d, reason: collision with root package name */
    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m f130616d = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m();

    public java.lang.String a() {
        return this.f130615c;
    }

    public void b() {
        this.f130617e.clear();
    }

    public java.util.Set<java.lang.String> c() {
        return java.util.Collections.unmodifiableSet(this.f130613a.keySet());
    }

    public boolean d() {
        return this.f130613a.isEmpty();
    }

    public int e() {
        return this.f130613a.size();
    }

    public byte[] f() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n(0);
        nVar.a(this.f130615c);
        nVar.a((java.util.Map) this.f130613a, 0);
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a(nVar.f132017a);
    }

    private java.lang.Object d(java.lang.String str, boolean z17, java.lang.ClassLoader classLoader) {
        java.lang.String a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.o.a(str);
        if (a17 != null && !"".equals(a17)) {
            str = a17;
        }
        if (this.f130614b.containsKey(str)) {
            return this.f130614b.get(str);
        }
        java.lang.Object a18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.a.a(str, z17, classLoader);
        this.f130614b.put(str, a18);
        return a18;
    }

    public void a(java.lang.String str) {
        this.f130615c = str;
    }

    public boolean b(java.lang.String str) {
        return this.f130613a.containsKey(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T c(java.lang.String str, boolean z17, java.lang.ClassLoader classLoader) {
        java.lang.String str2;
        byte[] bArr;
        if (!this.f130613a.containsKey(str)) {
            return null;
        }
        byte[] bArr2 = new byte[0];
        java.util.Iterator<java.util.Map.Entry<java.lang.String, byte[]>> it = this.f130613a.remove(str).entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry<java.lang.String, byte[]> next = it.next();
            str2 = next.getKey();
            bArr = next.getValue();
        } else {
            str2 = "";
            bArr = bArr2;
        }
        try {
            java.lang.Object a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.a.a(str2, z17, classLoader);
            this.f130616d.a(bArr);
            this.f130616d.a(this.f130615c);
            return (T) this.f130616d.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m) a17, 0, true);
        } catch (java.lang.Exception e17) {
            throw new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.b(e17);
        }
    }

    public <T> void a(java.lang.String str, T t17) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("put key can not is null");
        }
        if (t17 != null) {
            if (!(t17 instanceof java.util.Set)) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n();
                nVar.a(this.f130615c);
                nVar.a(t17, 0);
                byte[] a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a(nVar.f132017a);
                java.util.HashMap<java.lang.String, byte[]> hashMap = new java.util.HashMap<>(1);
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(1);
                a(arrayList, t17);
                hashMap.put(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.a.a(arrayList), a17);
                this.f130617e.remove(str);
                this.f130613a.put(str, hashMap);
                return;
            }
            throw new java.lang.IllegalArgumentException("can not support Set");
        }
        throw new java.lang.IllegalArgumentException("put value can not is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T b(java.lang.String str, boolean z17, java.lang.ClassLoader classLoader) {
        java.lang.String str2 = null;
        if (!this.f130613a.containsKey(str)) {
            return null;
        }
        if (this.f130617e.containsKey(str)) {
            return (T) this.f130617e.get(str);
        }
        byte[] bArr = new byte[0];
        java.util.Iterator<java.util.Map.Entry<java.lang.String, byte[]>> it = this.f130613a.get(str).entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry<java.lang.String, byte[]> next = it.next();
            str2 = next.getKey();
            bArr = next.getValue();
        }
        try {
            java.lang.Object d17 = d(str2, z17, classLoader);
            this.f130616d.a(bArr);
            this.f130616d.a(this.f130615c);
            T t17 = (T) this.f130616d.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m) d17, 0, true);
            b(str, t17);
            return t17;
        } catch (java.lang.Exception e17) {
            throw new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.b(e17);
        }
    }

    private void b(java.lang.String str, java.lang.Object obj) {
        this.f130617e.put(str, obj);
    }

    public <T> T a(java.lang.String str, boolean z17, java.lang.ClassLoader classLoader) {
        java.lang.String str2 = null;
        if (!this.f130613a.containsKey(str)) {
            return null;
        }
        if (this.f130617e.containsKey(str)) {
            return (T) this.f130617e.get(str);
        }
        byte[] bArr = new byte[0];
        java.util.Iterator<java.util.Map.Entry<java.lang.String, byte[]>> it = this.f130613a.get(str).entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry<java.lang.String, byte[]> next = it.next();
            str2 = next.getKey();
            bArr = next.getValue();
        }
        try {
            java.lang.Object d17 = d(str2, z17, classLoader);
            this.f130616d.a(bArr);
            this.f130616d.a(this.f130615c);
            T t17 = (T) this.f130616d.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p) d17);
            b(str, t17);
            return t17;
        } catch (java.lang.Exception e17) {
            throw new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.b(e17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T a(java.lang.String str, java.lang.Object obj, boolean z17, java.lang.ClassLoader classLoader) {
        java.lang.String str2;
        byte[] bArr;
        if (!this.f130613a.containsKey(str)) {
            return obj;
        }
        if (this.f130617e.containsKey(str)) {
            return (T) this.f130617e.get(str);
        }
        byte[] bArr2 = new byte[0];
        java.util.Iterator<java.util.Map.Entry<java.lang.String, byte[]>> it = this.f130613a.get(str).entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry<java.lang.String, byte[]> next = it.next();
            str2 = next.getKey();
            bArr = next.getValue();
        } else {
            str2 = "";
            bArr = bArr2;
        }
        try {
            java.lang.Object d17 = d(str2, z17, classLoader);
            this.f130616d.a(bArr);
            this.f130616d.a(this.f130615c);
            T t17 = (T) this.f130616d.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m) d17, 0, true);
            b(str, t17);
            return t17;
        } catch (java.lang.Exception unused) {
            b(str, obj);
            return obj;
        }
    }

    private void a(java.util.ArrayList<java.lang.String> arrayList, java.lang.Object obj) {
        while (true) {
            if (obj.getClass().isArray()) {
                if (obj.getClass().getComponentType().toString().equals("byte")) {
                    if (java.lang.reflect.Array.getLength(obj) > 0) {
                        arrayList.add("java.util.List");
                        obj = java.lang.reflect.Array.get(obj, 0);
                    } else {
                        arrayList.add("Array");
                        arrayList.add("?");
                        return;
                    }
                } else {
                    throw new java.lang.IllegalArgumentException("only byte[] is supported");
                }
            } else if (!(obj instanceof java.lang.reflect.Array)) {
                if (obj instanceof java.util.List) {
                    arrayList.add("java.util.List");
                    java.util.List list = (java.util.List) obj;
                    if (list.size() > 0) {
                        obj = list.get(0);
                    } else {
                        arrayList.add("?");
                        return;
                    }
                } else if (obj instanceof java.util.Map) {
                    arrayList.add("java.util.Map");
                    java.util.Map map = (java.util.Map) obj;
                    if (map.size() > 0) {
                        java.lang.Object obj2 = map.get(map.keySet().iterator().next());
                        arrayList.add(a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.c) obj));
                        obj = obj2;
                    } else {
                        arrayList.add("?");
                        arrayList.add("?");
                        return;
                    }
                } else {
                    arrayList.add(a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.c) obj));
                    return;
                }
            } else {
                throw new java.lang.IllegalArgumentException("can not support Array, please use List");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> java.lang.String a(T t17) {
        java.lang.String mo36073xff691c23 = t17 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p ? ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p) t17).mo36073xff691c23() : "";
        return "".equals(mo36073xff691c23) ? t17.getClass().getName() : mo36073xff691c23;
    }

    public void a(byte[] bArr) {
        this.f130616d.a(bArr);
        this.f130616d.a(this.f130615c);
        java.util.HashMap hashMap = new java.util.HashMap(1);
        java.util.HashMap hashMap2 = new java.util.HashMap(1);
        hashMap2.put("", new byte[0]);
        hashMap.put("", hashMap2);
        this.f130613a = this.f130616d.a((java.util.Map) hashMap, 0, false);
    }
}
