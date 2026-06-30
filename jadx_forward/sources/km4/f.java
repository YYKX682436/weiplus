package km4;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final km4.f f390807a = new km4.f();

    public static final bw5.g20 a(java.util.Map args) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        bw5.g20 g20Var = new bw5.g20();
        for (java.util.Map.Entry entry : args.entrySet()) {
            if (entry.getKey() instanceof java.lang.String) {
                bw5.h20 b17 = f390807a.b(entry.getValue());
                java.util.LinkedList linkedList = g20Var.f109177d;
                java.lang.Object key = entry.getKey();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(key, "null cannot be cast to non-null type kotlin.String");
                linkedList.add((java.lang.String) key);
                g20Var.f109178e.add(b17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HybridRouterMapHelper", "parseFromMap: key is not string");
            }
        }
        return g20Var;
    }

    public static final java.util.Map c(bw5.g20 pb6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pb6, "pb");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedList linkedList = pb6.f109177d;
        int size = linkedList.size();
        for (int i17 = 0; i17 < size; i17++) {
            km4.f fVar = f390807a;
            java.lang.Object obj = pb6.f109178e.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            java.lang.Object d17 = fVar.d((bw5.h20) obj);
            if (d17 != null) {
                java.lang.Object obj2 = linkedList.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                linkedHashMap.put(obj2, d17);
            }
        }
        return linkedHashMap;
    }

    public final bw5.h20 b(java.lang.Object obj) {
        long longValue;
        int intValue;
        bw5.h20 h20Var = new bw5.h20();
        boolean z17 = obj instanceof java.lang.Short;
        boolean z18 = z17 ? true : obj instanceof java.lang.Integer ? true : obj instanceof java.lang.Long;
        boolean[] zArr = h20Var.f109595o;
        if (z18) {
            h20Var.c(bw5.i20.intType);
            if (z17) {
                intValue = ((java.lang.Number) obj).shortValue();
            } else if (obj instanceof java.lang.Integer) {
                intValue = ((java.lang.Number) obj).intValue();
            } else {
                longValue = obj instanceof java.lang.Long ? ((java.lang.Number) obj).longValue() : 0L;
                h20Var.f109588e = longValue;
                zArr[2] = true;
            }
            longValue = intValue;
            h20Var.f109588e = longValue;
            zArr[2] = true;
        } else {
            boolean z19 = obj instanceof java.lang.Float;
            if (z19 ? true : obj instanceof java.lang.Double) {
                h20Var.c(bw5.i20.floatType);
                h20Var.f109589f = z19 ? ((java.lang.Number) obj).floatValue() : obj instanceof java.lang.Double ? (float) ((java.lang.Number) obj).doubleValue() : 0.0f;
                zArr[3] = true;
            } else if (obj instanceof java.lang.Boolean) {
                h20Var.c(bw5.i20.boolType);
                h20Var.f109590g = ((java.lang.Boolean) obj).booleanValue();
                zArr[4] = true;
            } else if (obj instanceof java.lang.String) {
                h20Var.c(bw5.i20.stringType);
                h20Var.f109591h = (java.lang.String) obj;
                zArr[5] = true;
            } else {
                boolean z27 = obj instanceof com.p314xaae8f345.mm.p2495xc50a8b8b.g;
                if (z27 ? true : obj instanceof byte[]) {
                    h20Var.c(bw5.i20.bytesType);
                    h20Var.f109592i = z27 ? (com.p314xaae8f345.mm.p2495xc50a8b8b.g) obj : obj instanceof byte[] ? new com.p314xaae8f345.mm.p2495xc50a8b8b.g((byte[]) obj) : com.p314xaae8f345.mm.p2495xc50a8b8b.g.c("");
                    zArr[6] = true;
                } else if (obj instanceof java.util.Map) {
                    h20Var.c(bw5.i20.mapType);
                    h20Var.f109593m = a((java.util.Map) obj);
                    zArr[7] = true;
                } else {
                    boolean z28 = obj instanceof java.util.List;
                    if (z28 ? true : obj instanceof java.lang.Object[]) {
                        h20Var.c(bw5.i20.listType);
                        java.util.List f17 = z28 ? (java.util.List) obj : obj instanceof java.lang.Object[] ? kz5.v.f((java.lang.Object[]) obj) : kz5.p0.f395529d;
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        java.util.Iterator it = f17.iterator();
                        while (it.hasNext()) {
                            linkedList.add(f390807a.b(it.next()));
                        }
                        h20Var.f109594n = linkedList;
                        zArr[8] = true;
                    } else if (obj == null) {
                        h20Var.c(bw5.i20.nullType);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HybridRouterMapHelper", "parseFromMapInner unknown type " + obj.getClass());
                        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    }
                }
            }
        }
        return h20Var;
    }

    public final java.lang.Object d(bw5.h20 h20Var) {
        java.lang.Object obj;
        bw5.i20 i20Var = h20Var.f109595o[1] ? h20Var.f109587d : bw5.i20.nullType;
        int i17 = i20Var == null ? -1 : km4.e.f390806a[i20Var.ordinal()];
        boolean[] zArr = h20Var.f109595o;
        switch (i17) {
            case 1:
            default:
                return null;
            case 2:
                return java.lang.Long.valueOf(h20Var.f109588e);
            case 3:
                return java.lang.Float.valueOf(h20Var.f109589f);
            case 4:
                return java.lang.Boolean.valueOf(h20Var.f109590g);
            case 5:
                if (!zArr[5]) {
                    obj = "";
                    break;
                } else {
                    obj = h20Var.f109591h;
                    break;
                }
            case 6:
                if (!zArr[6]) {
                    obj = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
                    break;
                } else {
                    obj = h20Var.f109592i;
                    break;
                }
            case 7:
                bw5.g20 g20Var = zArr[7] ? h20Var.f109593m : new bw5.g20();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g20Var, "getMapValue(...)");
                return c(g20Var);
            case 8:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = h20Var.f109594n.iterator();
                while (it.hasNext()) {
                    bw5.h20 h20Var2 = (bw5.h20) it.next();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h20Var2);
                    arrayList.add(d(h20Var2));
                }
                return arrayList;
        }
        return obj;
    }
}
