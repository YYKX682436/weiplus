package com.google.protobuf;

/* loaded from: classes16.dex */
public class d8 implements com.google.protobuf.z8 {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f45025a;

    /* renamed from: b, reason: collision with root package name */
    public volatile com.google.protobuf.c8 f45026b;

    /* renamed from: c, reason: collision with root package name */
    public com.google.protobuf.b8 f45027c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f45028d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.protobuf.w7 f45029e;

    public d8(com.google.protobuf.w7 w7Var, com.google.protobuf.c8 c8Var, java.util.Map map) {
        this.f45029e = w7Var;
        this.f45025a = true;
        this.f45026b = c8Var;
        this.f45027c = new com.google.protobuf.b8(this, map);
        this.f45028d = null;
    }

    public final com.google.protobuf.b8 a(java.util.List list) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.protobuf.k8 k8Var = (com.google.protobuf.k8) it.next();
            ((com.google.protobuf.x7) this.f45029e).getClass();
            com.google.protobuf.t7 t7Var = (com.google.protobuf.t7) k8Var;
            linkedHashMap.put(t7Var.f45549d, t7Var.f45550e);
        }
        return new com.google.protobuf.b8(this, linkedHashMap);
    }

    public final java.util.List b(com.google.protobuf.b8 b8Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((com.google.protobuf.a8) b8Var.entrySet()).iterator();
        while (true) {
            com.google.protobuf.z7 z7Var = (com.google.protobuf.z7) it;
            if (!z7Var.hasNext()) {
                return arrayList;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) z7Var.next();
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            com.google.protobuf.q7 newBuilderForType = ((com.google.protobuf.x7) this.f45029e).f45684a.newBuilderForType();
            newBuilderForType.f45449e = key;
            newBuilderForType.f45451g = true;
            newBuilderForType.f45450f = value;
            newBuilderForType.f45452h = true;
            arrayList.add(new com.google.protobuf.t7(newBuilderForType.f45448d, key, value));
        }
    }

    public void c() {
        if (!this.f45025a) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public java.util.List d() {
        com.google.protobuf.c8 c8Var = this.f45026b;
        com.google.protobuf.c8 c8Var2 = com.google.protobuf.c8.MAP;
        if (c8Var == c8Var2) {
            synchronized (this) {
                if (this.f45026b == c8Var2) {
                    this.f45028d = b(this.f45027c);
                    this.f45026b = com.google.protobuf.c8.BOTH;
                }
            }
        }
        return java.util.Collections.unmodifiableList(this.f45028d);
    }

    public java.util.Map e() {
        com.google.protobuf.c8 c8Var = this.f45026b;
        com.google.protobuf.c8 c8Var2 = com.google.protobuf.c8.LIST;
        if (c8Var == c8Var2) {
            synchronized (this) {
                if (this.f45026b == c8Var2) {
                    this.f45027c = a(this.f45028d);
                    this.f45026b = com.google.protobuf.c8.BOTH;
                }
            }
        }
        return java.util.Collections.unmodifiableMap(this.f45027c);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.protobuf.d8) {
            return com.google.protobuf.e8.e(e(), ((com.google.protobuf.d8) obj).e());
        }
        return false;
    }

    public java.util.List f() {
        com.google.protobuf.c8 c8Var = this.f45026b;
        com.google.protobuf.c8 c8Var2 = com.google.protobuf.c8.LIST;
        if (c8Var != c8Var2) {
            if (this.f45026b == com.google.protobuf.c8.MAP) {
                this.f45028d = b(this.f45027c);
            }
            this.f45027c = null;
            this.f45026b = c8Var2;
        }
        return this.f45028d;
    }

    public java.util.Map g() {
        com.google.protobuf.c8 c8Var = this.f45026b;
        com.google.protobuf.c8 c8Var2 = com.google.protobuf.c8.MAP;
        if (c8Var != c8Var2) {
            if (this.f45026b == com.google.protobuf.c8.LIST) {
                this.f45027c = a(this.f45028d);
            }
            this.f45028d = null;
            this.f45026b = c8Var2;
        }
        return this.f45027c;
    }

    public int hashCode() {
        return com.google.protobuf.e8.a(e());
    }

    public d8(com.google.protobuf.t7 t7Var, com.google.protobuf.c8 c8Var, java.util.Map map) {
        this(new com.google.protobuf.x7(t7Var), c8Var, map);
    }
}
