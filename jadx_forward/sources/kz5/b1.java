package kz5;

/* loaded from: classes12.dex */
public abstract class b1 extends kz5.a1 {
    public static final java.util.Map b(java.util.Map builder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        lz5.m mVar = (lz5.m) builder;
        mVar.c();
        mVar.f403950s = true;
        if (mVar.f403946o > 0) {
            return mVar;
        }
        lz5.m mVar2 = lz5.m.f403937t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mVar2, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mVar2;
    }

    public static final java.util.Map c() {
        return new lz5.m();
    }

    public static final int d(int i17) {
        if (i17 < 0) {
            return i17;
        }
        if (i17 < 3) {
            return i17 + 1;
        }
        if (i17 < 1073741824) {
            return (int) ((i17 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final java.util.Map e(jz5.l pair) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pair, "pair");
        java.util.Map singletonMap = java.util.Collections.singletonMap(pair.f384366d, pair.f384367e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static final java.util.Map f(java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "<this>");
        java.util.Map.Entry entry = (java.util.Map.Entry) map.entrySet().iterator().next();
        java.util.Map singletonMap = java.util.Collections.singletonMap(entry.getKey(), entry.getValue());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(singletonMap, "with(...)");
        return singletonMap;
    }

    public static final java.util.SortedMap g(java.util.Map map, java.util.Comparator comparator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comparator, "comparator");
        java.util.TreeMap treeMap = new java.util.TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
