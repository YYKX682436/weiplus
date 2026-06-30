package fs0;

/* loaded from: classes4.dex */
public final class r implements fs0.d {
    @Override // fs0.d
    public void a(long j17, java.util.List frames, int i17, int i18, java.util.Map parents, java.util.Map outPts) {
        java.lang.String str;
        long j18;
        int i19;
        java.lang.String str2;
        long j19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frames, "frames");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parents, "parents");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outPts, "outPts");
        java.lang.String str3 = "DecodeStrategy";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DecodeStrategy", "use vfr decode strategy");
        java.util.Iterator it = frames.iterator();
        int i27 = 0;
        while (it.hasNext()) {
            int i28 = i27 + 1;
            if (((java.lang.Number) it.next()).longValue() >= j17) {
                int size = frames.size() - i27;
                int i29 = (size * i18) / i17;
                java.util.List L0 = kz5.n0.L0(frames, size);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                fs0.e eVar = fs0.e.f347743a;
                int size2 = L0.size();
                java.util.ArrayList arrayList = new java.util.ArrayList(size2);
                for (int i37 = 0; i37 < size2; i37++) {
                    arrayList.add(java.lang.Boolean.FALSE);
                }
                int i38 = i29 + 1;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(i38);
                for (int i39 = 0; i39 < i38; i39++) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(size2);
                    for (int i47 = 0; i47 < size2; i47++) {
                        arrayList3.add(2305843009213693952L);
                    }
                    arrayList2.add(arrayList3);
                }
                java.util.ArrayList arrayList4 = new java.util.ArrayList(i38);
                int i48 = 0;
                while (i48 < i38) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList(size2);
                    int i49 = i38;
                    for (int i57 = 0; i57 < size2; i57++) {
                        arrayList5.add(-1);
                    }
                    arrayList4.add(arrayList5);
                    i48++;
                    i38 = i49;
                }
                int i58 = 1;
                ((java.util.List) arrayList2.get(1)).set(0, 0L);
                ((java.util.List) arrayList4.get(1)).set(0, 0);
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                int i59 = 2;
                if (2 <= i29) {
                    while (true) {
                        arrayList6.clear();
                        arrayList6.add(java.lang.Integer.valueOf(i59 - 2));
                        int i66 = i59 - 1;
                        int i67 = i66;
                        while (i67 < size2) {
                            while (true) {
                                if (arrayList6.size() <= i58) {
                                    str2 = str3;
                                    j19 = currentTimeMillis;
                                    break;
                                }
                                str2 = str3;
                                j19 = currentTimeMillis;
                                if (eVar.b(((java.lang.Number) arrayList6.get(i58)).intValue(), ((java.lang.Number) arrayList6.get(0)).intValue(), (java.util.List) arrayList2.get(i66), L0) >= ((java.lang.Number) L0.get(i67)).doubleValue() * eVar.a(((java.lang.Number) arrayList6.get(1)).intValue(), ((java.lang.Number) arrayList6.get(0)).intValue(), L0)) {
                                    break;
                                }
                                arrayList6.remove(0);
                                currentTimeMillis = j19;
                                str3 = str2;
                                i58 = 1;
                            }
                            int intValue = ((java.lang.Number) kz5.n0.X(arrayList6)).intValue();
                            ((java.util.List) arrayList2.get(i59)).set(i67, java.lang.Long.valueOf(((java.lang.Number) ((java.util.List) arrayList2.get(i66)).get(intValue)).longValue() + ((((java.lang.Number) L0.get(i67)).longValue() - ((java.lang.Number) L0.get(intValue)).longValue()) * (((java.lang.Number) L0.get(i67)).longValue() - ((java.lang.Number) L0.get(intValue)).longValue()))));
                            ((java.util.List) arrayList4.get(i59)).set(i67, java.lang.Integer.valueOf(intValue));
                            while (arrayList6.size() > 1 && eVar.b(i67, ((java.lang.Number) arrayList6.get(kz5.c0.h(arrayList6))).intValue(), (java.util.List) arrayList2.get(i66), L0) * eVar.a(((java.lang.Number) arrayList6.get(kz5.c0.h(arrayList6))).intValue(), ((java.lang.Number) arrayList6.get(kz5.c0.h(arrayList6) - 1)).intValue(), L0) < eVar.b(((java.lang.Number) arrayList6.get(kz5.c0.h(arrayList6))).intValue(), ((java.lang.Number) arrayList6.get(kz5.c0.h(arrayList6) - 1)).intValue(), (java.util.List) arrayList2.get(i66), L0) * eVar.a(i67, ((java.lang.Number) arrayList6.get(kz5.c0.h(arrayList6))).intValue(), L0)) {
                                arrayList6.remove(kz5.c0.h(arrayList6));
                            }
                            arrayList6.add(java.lang.Integer.valueOf(i67));
                            i67++;
                            currentTimeMillis = j19;
                            str3 = str2;
                            i58 = 1;
                        }
                        str = str3;
                        j18 = currentTimeMillis;
                        if (i59 == i29) {
                            break;
                        }
                        i59++;
                        currentTimeMillis = j18;
                        str3 = str;
                        i58 = 1;
                    }
                    i19 = 1;
                } else {
                    str = "DecodeStrategy";
                    j18 = currentTimeMillis;
                    i19 = 1;
                }
                int i68 = size2 - i19;
                for (int i69 = i29; i69 > 0; i69--) {
                    arrayList.set(i68, java.lang.Boolean.TRUE);
                    i68 = ((java.lang.Number) ((java.util.List) arrayList4.get(i69)).get(i68)).intValue();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "DropFrame, total frames = " + L0.size() + ", remain frames = " + i29 + ", cost " + (java.lang.System.currentTimeMillis() - j18) + "ms");
                java.util.Iterator it6 = ((java.util.ArrayList) kz5.n0.a1(arrayList, L0)).iterator();
                long j27 = -1;
                while (it6.hasNext()) {
                    jz5.l lVar = (jz5.l) it6.next();
                    boolean booleanValue = ((java.lang.Boolean) lVar.f384366d).booleanValue();
                    long longValue = ((java.lang.Number) lVar.f384367e).longValue();
                    if (booleanValue) {
                        parents.put(java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(j27));
                        outPts.put(java.lang.Long.valueOf(longValue), kz5.c0.k(java.lang.Long.valueOf(longValue)));
                        j27 = longValue;
                    }
                }
                return;
            }
            i27 = i28;
        }
    }
}
