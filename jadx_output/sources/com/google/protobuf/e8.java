package com.google.protobuf;

/* loaded from: classes16.dex */
public final class e8 extends java.util.LinkedHashMap {

    /* renamed from: e, reason: collision with root package name */
    public static final com.google.protobuf.e8 f45062e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f45063d;

    static {
        com.google.protobuf.e8 e8Var = new com.google.protobuf.e8();
        f45062e = e8Var;
        e8Var.f45063d = false;
    }

    public e8() {
        this.f45063d = true;
    }

    public static int a(java.util.Map map) {
        int i17 = 0;
        for (java.util.Map.Entry entry : map.entrySet()) {
            i17 += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i17;
    }

    public static int b(java.lang.Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof com.google.protobuf.p6) {
                throw new java.lang.UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        java.nio.charset.Charset charset = com.google.protobuf.w6.f45648a;
        int length = bArr.length;
        int i17 = length;
        for (int i18 = 0; i18 < 0 + length; i18++) {
            i17 = (i17 * 31) + bArr[i18];
        }
        if (i17 == 0) {
            return 1;
        }
        return i17;
    }

    public static java.util.Map c(java.util.Map map) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                value = java.util.Arrays.copyOf(bArr, bArr.length);
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    public static boolean e(java.util.Map map, java.util.Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey())) {
                return false;
            }
            java.lang.Object value = entry.getValue();
            java.lang.Object obj = map2.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj instanceof byte[])) ? java.util.Arrays.equals((byte[]) value, (byte[]) obj) : value.equals(obj))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        d();
        super.clear();
    }

    public final void d() {
        if (!this.f45063d) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public java.util.Set entrySet() {
        return isEmpty() ? java.util.Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof java.util.Map) && e(this, (java.util.Map) obj);
    }

    public com.google.protobuf.e8 f() {
        return isEmpty() ? new com.google.protobuf.e8() : new com.google.protobuf.e8(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        d();
        java.nio.charset.Charset charset = com.google.protobuf.w6.f45648a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map map) {
        d();
        for (java.lang.Object obj : map.keySet()) {
            java.nio.charset.Charset charset = com.google.protobuf.w6.f45648a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        d();
        return super.remove(obj);
    }

    public e8(java.util.Map map) {
        super(map);
        this.f45063d = true;
    }
}
