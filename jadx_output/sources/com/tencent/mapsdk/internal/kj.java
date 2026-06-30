package com.tencent.mapsdk.internal;

/* loaded from: classes7.dex */
public final class kj<Key, Value> {

    /* renamed from: a, reason: collision with root package name */
    private int f50087a;

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.mapsdk.internal.kj<Key, Value>.a f50088b;

    /* renamed from: c, reason: collision with root package name */
    private com.tencent.mapsdk.internal.kj<Key, Value>.a f50089c;

    /* renamed from: d, reason: collision with root package name */
    private java.util.HashMap<Key, com.tencent.mapsdk.internal.kj<Key, Value>.a> f50090d = new java.util.HashMap<>();

    /* loaded from: classes6.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        Key f50091a;

        /* renamed from: b, reason: collision with root package name */
        Value f50092b;

        /* renamed from: c, reason: collision with root package name */
        com.tencent.mapsdk.internal.kj<Key, Value>.a f50093c;

        /* renamed from: d, reason: collision with root package name */
        com.tencent.mapsdk.internal.kj<Key, Value>.a f50094d;

        public /* synthetic */ a(com.tencent.mapsdk.internal.kj kjVar, java.lang.Object obj, java.lang.Object obj2, byte b17) {
            this(obj, obj2);
        }

        private a(Key key, Value value) {
            this.f50091a = key;
            this.f50092b = value;
        }
    }

    private kj(int i17) {
        this.f50087a = i17;
    }

    private void a(Key key, Value value) {
        if (this.f50090d.containsKey(key)) {
            com.tencent.mapsdk.internal.kj<Key, Value>.a aVar = this.f50088b;
            while (true) {
                if (aVar == null) {
                    aVar = null;
                    break;
                } else if (aVar.f50091a.equals(key)) {
                    break;
                } else {
                    aVar = aVar.f50094d;
                }
            }
            if (aVar != null) {
                a((com.tencent.mapsdk.internal.kj.a) aVar);
                return;
            }
            return;
        }
        if (this.f50090d.size() >= this.f50087a) {
            a();
        }
        com.tencent.mapsdk.internal.kj<Key, Value>.a aVar2 = new com.tencent.mapsdk.internal.kj.a(this, key, value, (byte) 0);
        com.tencent.mapsdk.internal.kj<Key, Value>.a aVar3 = this.f50089c;
        if (aVar3 == null) {
            this.f50089c = aVar2;
            this.f50088b = aVar2;
        } else {
            aVar3.f50094d = aVar2;
            aVar2.f50093c = aVar3;
            this.f50089c = aVar2;
        }
        this.f50090d.put(key, aVar2);
    }

    private boolean b(Key key) {
        return this.f50090d.remove(key) != null;
    }

    private boolean c() {
        return this.f50090d.isEmpty();
    }

    private int d() {
        return this.f50090d.size();
    }

    private void e() {
        this.f50090d.clear();
        this.f50089c = null;
        this.f50088b = null;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("header: \n");
        com.tencent.mapsdk.internal.kj<Key, Value>.a aVar = this.f50088b;
        if (aVar.f50093c != null) {
            java.lang.System.out.println("header的pre不为NULL!");
        }
        while (aVar != null) {
            sb6.append(aVar.f50091a + "->");
            aVar = aVar.f50094d;
        }
        sb6.append("\ntail: \n");
        com.tencent.mapsdk.internal.kj<Key, Value>.a aVar2 = this.f50089c;
        if (aVar2.f50094d != null) {
            java.lang.System.out.println("tail的next不为NULL!");
        }
        while (aVar2 != null) {
            sb6.append(aVar2.f50091a + "<-");
            aVar2 = aVar2.f50093c;
        }
        sb6.append("\n");
        return sb6.toString();
    }

    private boolean b() {
        return a();
    }

    private com.tencent.mapsdk.internal.kj<Key, Value>.a c(Key key) {
        for (com.tencent.mapsdk.internal.kj<Key, Value>.a aVar = this.f50088b; aVar != null; aVar = aVar.f50094d) {
            if (aVar.f50091a.equals(key)) {
                return aVar;
            }
        }
        return null;
    }

    private boolean a() {
        com.tencent.mapsdk.internal.kj<Key, Value>.a aVar = this.f50088b;
        com.tencent.mapsdk.internal.kj<Key, Value>.a aVar2 = aVar.f50094d;
        this.f50088b = aVar2;
        aVar2.f50093c = null;
        Key key = aVar.f50091a;
        return (key == null || this.f50090d.remove(key) == null) ? false : true;
    }

    private Value a(Key key) {
        com.tencent.mapsdk.internal.kj<Key, Value>.a aVar = this.f50090d.get(key);
        if (aVar == null) {
            return null;
        }
        a((com.tencent.mapsdk.internal.kj.a) aVar);
        return aVar.f50092b;
    }

    private void a(com.tencent.mapsdk.internal.kj<Key, Value>.a aVar) {
        com.tencent.mapsdk.internal.kj<Key, Value>.a aVar2;
        if (aVar == null || (aVar2 = this.f50089c) == aVar) {
            return;
        }
        com.tencent.mapsdk.internal.kj<Key, Value>.a aVar3 = this.f50088b;
        if (aVar3 == aVar) {
            com.tencent.mapsdk.internal.kj<Key, Value>.a aVar4 = aVar3.f50094d;
            this.f50088b = aVar4;
            aVar4.f50093c = null;
        } else {
            com.tencent.mapsdk.internal.kj<Key, Value>.a aVar5 = aVar.f50093c;
            aVar5.f50094d = aVar.f50094d;
            aVar.f50094d.f50093c = aVar5;
        }
        aVar2.f50094d = aVar;
        aVar.f50093c = aVar2;
        this.f50089c = aVar;
        aVar.f50094d = null;
    }
}
