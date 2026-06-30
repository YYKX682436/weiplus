package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes7.dex */
public final class kj<Key, Value> {

    /* renamed from: a, reason: collision with root package name */
    private int f131620a;

    /* renamed from: b, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kj<Key, Value>.a f131621b;

    /* renamed from: c, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kj<Key, Value>.a f131622c;

    /* renamed from: d, reason: collision with root package name */
    private java.util.HashMap<Key, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kj<Key, Value>.a> f131623d = new java.util.HashMap<>();

    /* loaded from: classes6.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        Key f131624a;

        /* renamed from: b, reason: collision with root package name */
        Value f131625b;

        /* renamed from: c, reason: collision with root package name */
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kj<Key, Value>.a f131626c;

        /* renamed from: d, reason: collision with root package name */
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kj<Key, Value>.a f131627d;

        public /* synthetic */ a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kj kjVar, java.lang.Object obj, java.lang.Object obj2, byte b17) {
            this(obj, obj2);
        }

        private a(Key key, Value value) {
            this.f131624a = key;
            this.f131625b = value;
        }
    }

    private kj(int i17) {
        this.f131620a = i17;
    }

    private void a(Key key, Value value) {
        if (this.f131623d.containsKey(key)) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kj<Key, Value>.a aVar = this.f131621b;
            while (true) {
                if (aVar == null) {
                    aVar = null;
                    break;
                } else if (aVar.f131624a.equals(key)) {
                    break;
                } else {
                    aVar = aVar.f131627d;
                }
            }
            if (aVar != null) {
                a((com.tencent.mapsdk.internal.kj.a) aVar);
                return;
            }
            return;
        }
        if (this.f131623d.size() >= this.f131620a) {
            a();
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kj<Key, Value>.a aVar2 = new com.tencent.mapsdk.internal.kj.a(this, key, value, (byte) 0);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kj<Key, Value>.a aVar3 = this.f131622c;
        if (aVar3 == null) {
            this.f131622c = aVar2;
            this.f131621b = aVar2;
        } else {
            aVar3.f131627d = aVar2;
            aVar2.f131626c = aVar3;
            this.f131622c = aVar2;
        }
        this.f131623d.put(key, aVar2);
    }

    private boolean b(Key key) {
        return this.f131623d.remove(key) != null;
    }

    private boolean c() {
        return this.f131623d.isEmpty();
    }

    private int d() {
        return this.f131623d.size();
    }

    private void e() {
        this.f131623d.clear();
        this.f131622c = null;
        this.f131621b = null;
    }

    /* renamed from: toString */
    public final java.lang.String m36811x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("header: \n");
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kj<Key, Value>.a aVar = this.f131621b;
        if (aVar.f131626c != null) {
            java.lang.System.out.println("header的pre不为NULL!");
        }
        while (aVar != null) {
            sb6.append(aVar.f131624a + "->");
            aVar = aVar.f131627d;
        }
        sb6.append("\ntail: \n");
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kj<Key, Value>.a aVar2 = this.f131622c;
        if (aVar2.f131627d != null) {
            java.lang.System.out.println("tail的next不为NULL!");
        }
        while (aVar2 != null) {
            sb6.append(aVar2.f131624a + "<-");
            aVar2 = aVar2.f131626c;
        }
        sb6.append("\n");
        return sb6.toString();
    }

    private boolean b() {
        return a();
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kj<Key, Value>.a c(Key key) {
        for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kj<Key, Value>.a aVar = this.f131621b; aVar != null; aVar = aVar.f131627d) {
            if (aVar.f131624a.equals(key)) {
                return aVar;
            }
        }
        return null;
    }

    private boolean a() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kj<Key, Value>.a aVar = this.f131621b;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kj<Key, Value>.a aVar2 = aVar.f131627d;
        this.f131621b = aVar2;
        aVar2.f131626c = null;
        Key key = aVar.f131624a;
        return (key == null || this.f131623d.remove(key) == null) ? false : true;
    }

    private Value a(Key key) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kj<Key, Value>.a aVar = this.f131623d.get(key);
        if (aVar == null) {
            return null;
        }
        a((com.tencent.mapsdk.internal.kj.a) aVar);
        return aVar.f131625b;
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kj<Key, Value>.a aVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kj<Key, Value>.a aVar2;
        if (aVar == null || (aVar2 = this.f131622c) == aVar) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kj<Key, Value>.a aVar3 = this.f131621b;
        if (aVar3 == aVar) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kj<Key, Value>.a aVar4 = aVar3.f131627d;
            this.f131621b = aVar4;
            aVar4.f131626c = null;
        } else {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kj<Key, Value>.a aVar5 = aVar.f131626c;
            aVar5.f131627d = aVar.f131627d;
            aVar.f131627d.f131626c = aVar5;
        }
        aVar2.f131627d = aVar;
        aVar.f131626c = aVar2;
        this.f131622c = aVar;
        aVar.f131627d = null;
    }
}
