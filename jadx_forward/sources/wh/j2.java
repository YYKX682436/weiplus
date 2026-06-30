package wh;

/* loaded from: classes12.dex */
public abstract class j2 {
    public static wh.i2 a(java.util.List list, long j17, long j18, wh.e2 e2Var) {
        long j19;
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        if (!arrayList.isEmpty()) {
            wh.f2 a17 = e2Var.a("CURR_STAMP");
            if (a17.f527308b - ((wh.f2) arrayList.get(0)).f527308b > j18) {
                arrayList.add(0, a17);
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        long j27 = Long.MIN_VALUE;
        if (j17 > 0) {
            java.util.Iterator it = arrayList.iterator();
            long j28 = Long.MIN_VALUE;
            long j29 = Long.MIN_VALUE;
            j19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                wh.f2 f2Var = (wh.f2) it.next();
                if (j28 != j27) {
                    long j37 = f2Var.f527308b;
                    if (j28 < j37) {
                        break;
                    }
                    long j38 = j28 - j37;
                    long j39 = j19 + j38;
                    long j47 = f2Var.f527309c;
                    java.lang.String str = f2Var.f527307a;
                    if (j39 >= j17) {
                        long j48 = j17 - j19;
                        j19 += j48;
                        wh.g2 g2Var = (wh.g2) hashMap.get(str);
                        if (g2Var == null) {
                            g2Var = new wh.g2();
                            hashMap.put(str, g2Var);
                        }
                        g2Var.f527323a += j48;
                        g2Var.f527324b = ((float) g2Var.f527324b) + (((float) (j29 - j47)) * (((float) j48) / ((float) j38)));
                    } else {
                        wh.g2 g2Var2 = (wh.g2) hashMap.get(str);
                        if (g2Var2 == null) {
                            g2Var2 = new wh.g2();
                            hashMap.put(str, g2Var2);
                        }
                        g2Var2.f527323a += j38;
                        g2Var2.f527324b += j29 - j47;
                        j19 = j39;
                    }
                }
                j28 = f2Var.f527308b;
                j29 = f2Var.f527309c;
                j27 = Long.MIN_VALUE;
            }
        } else {
            java.util.Iterator it6 = arrayList.iterator();
            j19 = 0;
            long j49 = Long.MIN_VALUE;
            long j57 = Long.MIN_VALUE;
            while (it6.hasNext()) {
                wh.f2 f2Var2 = (wh.f2) it6.next();
                if (j49 != Long.MIN_VALUE) {
                    long j58 = f2Var2.f527308b;
                    if (j49 < j58) {
                        break;
                    }
                    long j59 = j49 - j58;
                    j19 += j59;
                    java.lang.String str2 = f2Var2.f527307a;
                    wh.g2 g2Var3 = (wh.g2) hashMap.get(str2);
                    if (g2Var3 == null) {
                        g2Var3 = new wh.g2();
                        hashMap.put(str2, g2Var3);
                    }
                    g2Var3.f527323a += j59;
                    g2Var3.f527324b += j57 - f2Var2.f527309c;
                }
                j49 = f2Var2.f527308b;
                j57 = f2Var2.f527309c;
            }
        }
        wh.i2 i2Var = new wh.i2();
        if (j19 <= 0) {
            i2Var.f527337c = false;
        } else {
            if (j17 > j19) {
                i2Var.f527337c = false;
            }
            i2Var.f527335a = j19;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                java.lang.String str3 = (java.lang.String) entry.getKey();
                wh.g2 g2Var4 = (wh.g2) entry.getValue();
                long round = java.lang.Math.round((g2Var4.f527323a / j19) * 100.0d);
                wh.h2 h2Var = new wh.h2(str3, round >= 100 ? 100 : round <= 0 ? 0 : (int) round);
                h2Var.f527331c = g2Var4.f527324b;
                arrayList2.add(h2Var);
            }
            java.util.Collections.sort(arrayList2, new wh.d2());
            i2Var.f527336b = arrayList2;
        }
        return i2Var;
    }

    public static void b(java.util.List list) {
        int size;
        int size2;
        int i17;
        if (list != null && (size2 = (size = list.size()) / 2) < size - 1) {
            list.subList(size2, i17).clear();
        }
    }
}
