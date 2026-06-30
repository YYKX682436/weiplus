package b36;

/* loaded from: classes14.dex */
public abstract class f {
    public static final int a(int i17, boolean z17) {
        return f36.a.c(i17) + 1;
    }

    public static final int b(int i17, com.tencent.mm.protobuf.g gVar) {
        if (gVar == null) {
            return 0;
        }
        return f36.a.c(i17) + f36.a.a(gVar.f192156a.length) + gVar.f192156a.length;
    }

    public static final int c(int i17, double d17) {
        return f36.a.c(i17) + 8;
    }

    public static final int d(int i17, float f17) {
        return f36.a.c(i17) + 4;
    }

    public static final int e(int i17, int i18) {
        return i18 >= 0 ? f36.a.c(i17) + f36.a.a(i18) : f36.a.c(i17) + 10;
    }

    public static final int f(int i17, int i18) {
        return e(i17, i18);
    }

    public static final int g(int i17, int i18, java.util.LinkedList linkedList) {
        int i19 = 0;
        if (linkedList != null) {
            switch (i18) {
                case 1:
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        i19 += j(i17, (java.lang.String) it.next());
                    }
                    break;
                case 2:
                    java.util.Iterator it6 = linkedList.iterator();
                    while (it6.hasNext()) {
                        java.lang.Object next = it6.next();
                        kotlin.jvm.internal.o.e(next, "null cannot be cast to non-null type kotlin.Int");
                        i19 += e(i17, ((java.lang.Integer) next).intValue());
                    }
                    break;
                case 3:
                    java.util.Iterator it7 = linkedList.iterator();
                    while (it7.hasNext()) {
                        java.lang.Object next2 = it7.next();
                        kotlin.jvm.internal.o.e(next2, "null cannot be cast to non-null type kotlin.Long");
                        i19 += h(i17, ((java.lang.Long) next2).longValue());
                    }
                    break;
                case 4:
                    java.util.Iterator it8 = linkedList.iterator();
                    while (it8.hasNext()) {
                        java.lang.Object next3 = it8.next();
                        kotlin.jvm.internal.o.e(next3, "null cannot be cast to non-null type kotlin.Double");
                        i19 += c(i17, ((java.lang.Double) next3).doubleValue());
                    }
                    break;
                case 5:
                    java.util.Iterator it9 = linkedList.iterator();
                    while (it9.hasNext()) {
                        java.lang.Object next4 = it9.next();
                        kotlin.jvm.internal.o.e(next4, "null cannot be cast to non-null type kotlin.Float");
                        i19 += d(i17, ((java.lang.Float) next4).floatValue());
                    }
                    break;
                case 6:
                    java.util.Iterator it10 = linkedList.iterator();
                    while (it10.hasNext()) {
                        i19 += b(i17, (com.tencent.mm.protobuf.g) it10.next());
                    }
                    break;
                case 7:
                    java.util.Iterator it11 = linkedList.iterator();
                    while (it11.hasNext()) {
                        java.lang.Object next5 = it11.next();
                        kotlin.jvm.internal.o.e(next5, "null cannot be cast to non-null type kotlin.Boolean");
                        i19 += a(i17, ((java.lang.Boolean) next5).booleanValue());
                    }
                    break;
                case 8:
                    java.util.Iterator it12 = linkedList.iterator();
                    while (it12.hasNext()) {
                        java.lang.Object next6 = it12.next();
                        kotlin.jvm.internal.o.e(next6, "null cannot be cast to non-null type com.tencent.mm.protobuf.BaseProtoBuf");
                        i19 += i(i17, ((com.tencent.mm.protobuf.f) next6).computeSize());
                    }
                    break;
                default:
                    throw new java.lang.IllegalArgumentException("The data type was not found, the id used was " + i18);
            }
        }
        return i19;
    }

    public static final int h(int i17, long j17) {
        return f36.a.c(i17) + f36.a.b(j17);
    }

    public static final int i(int i17, int i18) {
        return f36.a.c(i17) + f36.a.a(i18) + i18;
    }

    public static final int j(int i17, java.lang.String str) {
        if (str == null) {
            return 0;
        }
        try {
            byte[] bytes = str.getBytes(com.tencent.mapsdk.internal.rv.f51270c);
            return f36.a.c(i17) + f36.a.a(bytes.length) + bytes.length;
        } catch (java.io.UnsupportedEncodingException unused) {
            throw new java.lang.IllegalStateException("UTF-8 not supported.");
        }
    }

    public static final int k(int i17, int i18, java.util.LinkedList linkedList) {
        if (linkedList == null || !(!linkedList.isEmpty())) {
            return 0;
        }
        int l17 = l(i18, linkedList) + 0;
        return l17 + f36.a.a(l17) + f36.a.c(i17);
    }

    public static final int l(int i17, java.util.LinkedList linkedList) {
        yz5.l lVar;
        int i18 = 0;
        if (linkedList != null && (!linkedList.isEmpty())) {
            if (i17 == 2) {
                lVar = b36.a.f17756d;
            } else if (i17 == 3) {
                lVar = b36.b.f17757d;
            } else if (i17 == 4) {
                lVar = b36.c.f17758d;
            } else if (i17 == 5) {
                lVar = b36.e.f17760d;
            } else {
                if (i17 != 7) {
                    throw new java.lang.IllegalArgumentException("The data type was not found, the id used was " + i17);
                }
                lVar = b36.d.f17759d;
            }
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                i18 += ((java.lang.Number) lVar.invoke(it.next())).intValue();
            }
        }
        return i18;
    }
}
