package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class d8 implements com.p176xb6135e39.p283xc50a8b8b.z8 {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f126558a;

    /* renamed from: b, reason: collision with root package name */
    public volatile com.p176xb6135e39.p283xc50a8b8b.c8 f126559b;

    /* renamed from: c, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.b8 f126560c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f126561d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.w7 f126562e;

    public d8(com.p176xb6135e39.p283xc50a8b8b.w7 w7Var, com.p176xb6135e39.p283xc50a8b8b.c8 c8Var, java.util.Map map) {
        this.f126562e = w7Var;
        this.f126558a = true;
        this.f126559b = c8Var;
        this.f126560c = new com.p176xb6135e39.p283xc50a8b8b.b8(this, map);
        this.f126561d = null;
    }

    public final com.p176xb6135e39.p283xc50a8b8b.b8 a(java.util.List list) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p176xb6135e39.p283xc50a8b8b.k8 k8Var = (com.p176xb6135e39.p283xc50a8b8b.k8) it.next();
            ((com.p176xb6135e39.p283xc50a8b8b.x7) this.f126562e).getClass();
            com.p176xb6135e39.p283xc50a8b8b.t7 t7Var = (com.p176xb6135e39.p283xc50a8b8b.t7) k8Var;
            linkedHashMap.put(t7Var.f127082d, t7Var.f127083e);
        }
        return new com.p176xb6135e39.p283xc50a8b8b.b8(this, linkedHashMap);
    }

    public final java.util.List b(com.p176xb6135e39.p283xc50a8b8b.b8 b8Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((com.p176xb6135e39.p283xc50a8b8b.a8) b8Var.entrySet()).iterator();
        while (true) {
            com.p176xb6135e39.p283xc50a8b8b.z7 z7Var = (com.p176xb6135e39.p283xc50a8b8b.z7) it;
            if (!z7Var.hasNext()) {
                return arrayList;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) z7Var.next();
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            com.p176xb6135e39.p283xc50a8b8b.q7 mo20596xab31548 = ((com.p176xb6135e39.p283xc50a8b8b.x7) this.f126562e).f127217a.mo20596xab31548();
            mo20596xab31548.f126982e = key;
            mo20596xab31548.f126984g = true;
            mo20596xab31548.f126983f = value;
            mo20596xab31548.f126985h = true;
            arrayList.add(new com.p176xb6135e39.p283xc50a8b8b.t7(mo20596xab31548.f126981d, key, value));
        }
    }

    public void c() {
        if (!this.f126558a) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public java.util.List d() {
        com.p176xb6135e39.p283xc50a8b8b.c8 c8Var = this.f126559b;
        com.p176xb6135e39.p283xc50a8b8b.c8 c8Var2 = com.p176xb6135e39.p283xc50a8b8b.c8.MAP;
        if (c8Var == c8Var2) {
            synchronized (this) {
                if (this.f126559b == c8Var2) {
                    this.f126561d = b(this.f126560c);
                    this.f126559b = com.p176xb6135e39.p283xc50a8b8b.c8.BOTH;
                }
            }
        }
        return java.util.Collections.unmodifiableList(this.f126561d);
    }

    public java.util.Map e() {
        com.p176xb6135e39.p283xc50a8b8b.c8 c8Var = this.f126559b;
        com.p176xb6135e39.p283xc50a8b8b.c8 c8Var2 = com.p176xb6135e39.p283xc50a8b8b.c8.LIST;
        if (c8Var == c8Var2) {
            synchronized (this) {
                if (this.f126559b == c8Var2) {
                    this.f126560c = a(this.f126561d);
                    this.f126559b = com.p176xb6135e39.p283xc50a8b8b.c8.BOTH;
                }
            }
        }
        return java.util.Collections.unmodifiableMap(this.f126560c);
    }

    /* renamed from: equals */
    public boolean m20618xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof com.p176xb6135e39.p283xc50a8b8b.d8) {
            return com.p176xb6135e39.p283xc50a8b8b.e8.e(e(), ((com.p176xb6135e39.p283xc50a8b8b.d8) obj).e());
        }
        return false;
    }

    public java.util.List f() {
        com.p176xb6135e39.p283xc50a8b8b.c8 c8Var = this.f126559b;
        com.p176xb6135e39.p283xc50a8b8b.c8 c8Var2 = com.p176xb6135e39.p283xc50a8b8b.c8.LIST;
        if (c8Var != c8Var2) {
            if (this.f126559b == com.p176xb6135e39.p283xc50a8b8b.c8.MAP) {
                this.f126561d = b(this.f126560c);
            }
            this.f126560c = null;
            this.f126559b = c8Var2;
        }
        return this.f126561d;
    }

    public java.util.Map g() {
        com.p176xb6135e39.p283xc50a8b8b.c8 c8Var = this.f126559b;
        com.p176xb6135e39.p283xc50a8b8b.c8 c8Var2 = com.p176xb6135e39.p283xc50a8b8b.c8.MAP;
        if (c8Var != c8Var2) {
            if (this.f126559b == com.p176xb6135e39.p283xc50a8b8b.c8.LIST) {
                this.f126560c = a(this.f126561d);
            }
            this.f126561d = null;
            this.f126559b = c8Var2;
        }
        return this.f126560c;
    }

    /* renamed from: hashCode */
    public int m20619x8cdac1b() {
        return com.p176xb6135e39.p283xc50a8b8b.e8.a(e());
    }

    public d8(com.p176xb6135e39.p283xc50a8b8b.t7 t7Var, com.p176xb6135e39.p283xc50a8b8b.c8 c8Var, java.util.Map map) {
        this(new com.p176xb6135e39.p283xc50a8b8b.x7(t7Var), c8Var, map);
    }
}
