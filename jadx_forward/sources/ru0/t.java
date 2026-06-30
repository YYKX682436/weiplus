package ru0;

/* loaded from: classes5.dex */
public abstract class t {
    public static final java.util.List a(org.json.JSONArray jSONArray, java.lang.String wordKey, java.lang.String beginTimeKey, java.lang.String endTimeKey, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONArray, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wordKey, "wordKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(beginTimeKey, "beginTimeKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(endTimeKey, "endTimeKey");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ru0.p pVar = new ru0.p(z17, jSONArray, wordKey, beginTimeKey, endTimeKey, arrayList);
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(i17), jSONArray.get(i17));
        }
        return arrayList;
    }

    public static final java.util.List b(java.util.List list, java.lang.String langId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(langId, "langId");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ru0.n nVar = (ru0.n) it.next();
            java.lang.String e17 = e(nVar.f481223a, "__");
            java.lang.String t17 = r26.i0.t(e17, "__", "", false);
            if (t17.length() > 0) {
                arrayList2.add(new ru0.n(t17, nVar.f481224b, nVar.f481225c));
            }
            if (r26.i0.n(e17, "__", false)) {
                arrayList.addAll(f(arrayList2, langId, i17));
                arrayList2.clear();
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.addAll(f(arrayList2, langId, i17));
        }
        if (arrayList.isEmpty()) {
            return arrayList;
        }
        int i18 = 2;
        if (arrayList.size() <= 2) {
            return kz5.c0.d(new ru0.f(kz5.n0.g0(arrayList, "\n", null, null, arrayList.size(), null, ru0.r.f481234d, 22, null), ((ru0.f) kz5.n0.X(arrayList)).f481201b, ((ru0.f) kz5.n0.i0(arrayList)).f481202c));
        }
        kz5.s1.a(2, 2);
        int size = arrayList.size();
        java.util.ArrayList arrayList3 = new java.util.ArrayList((size / 2) + (size % 2 == 0 ? 0 : 1));
        kz5.f1 f1Var = new kz5.f1(arrayList);
        int i19 = 0;
        while (true) {
            if (!(i19 >= 0 && i19 < size)) {
                break;
            }
            int i27 = size - i19;
            if (i18 <= i27) {
                i27 = i18;
            }
            if (i27 < i18) {
                break;
            }
            int i28 = i27 + i19;
            kz5.h.f395506d.a(i19, i28, f1Var.f395500e.size());
            f1Var.f395501f = i19;
            f1Var.f395502g = i28 - i19;
            ru0.f fVar = (ru0.f) kz5.n0.X(f1Var);
            ru0.f fVar2 = (ru0.f) kz5.n0.k0(f1Var);
            arrayList3.add(new ru0.f(kz5.n0.g0(f1Var, "\n", null, null, f1Var.size(), null, ru0.s.f481235d, 22, null), fVar.f481201b, (fVar2 == null ? fVar : fVar2).f481202c));
            i19 += 2;
            i18 = 2;
        }
        return arrayList3;
    }

    public static final int c(java.lang.String langId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(langId, "langId");
        java.lang.Integer num = (java.lang.Integer) ((java.util.concurrent.ConcurrentHashMap) ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).Bi()).get(langId);
        int intValue = num != null ? num.intValue() : 12;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Word_Ext", "getRecommendedTextLength: langId " + langId + " recommendedLength " + intValue);
        return intValue;
    }

    public static final boolean d(java.lang.String input) {
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("^[a-zA-Z]+(['-][a-zA-Z]+)*$");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        return compile.matcher(input).matches();
    }

    public static final java.lang.String e(java.lang.String str, java.lang.String newValue) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newValue, "newValue");
        java.lang.String replaceAll = java.util.regex.Pattern.compile("[\\p{P}\\p{S}]").matcher(r26.i0.u(str, (char) 12289, ' ', false, 4, null)).replaceAll(newValue);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public static final java.util.ArrayList f(java.util.List list, java.lang.String str, int i17) {
        java.util.ArrayList arrayList;
        if (list.isEmpty()) {
            return new java.util.ArrayList();
        }
        if (i17 <= c(str) || list.size() <= 1) {
            arrayList = new java.util.ArrayList();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = list.iterator();
            long j17 = 0;
            int i18 = 0;
            int i19 = 0;
            while (it.hasNext()) {
                int i27 = i18 + 1;
                ru0.n nVar = (ru0.n) it.next();
                if (j17 == 0) {
                    j17 = nVar.f481224b;
                }
                int length = nVar.f481223a.length() + i19;
                java.lang.String str2 = nVar.f481223a;
                if (length >= i17) {
                    sb6.append(str2);
                    long j18 = nVar.f481225c;
                    java.lang.String sb7 = sb6.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
                    arrayList.add(new ru0.f(sb7, j17, j18));
                    r26.e0.d(sb6);
                    j17 = 0;
                    i19 = 0;
                } else {
                    sb6.append(str2);
                    i19 += str2.length();
                    if (i18 == kz5.c0.h(list)) {
                        long j19 = nVar.f481225c;
                        java.lang.String sb8 = sb6.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb8, "toString(...)");
                        arrayList.add(new ru0.f(sb8, j17, j19));
                    }
                }
                i18 = i27;
            }
        } else {
            int i28 = i17 / 2;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
            java.util.ArrayList arrayList3 = new java.util.ArrayList(list.size());
            java.util.ArrayList arrayList4 = new java.util.ArrayList(list.size());
            java.util.ArrayList arrayList5 = new java.util.ArrayList(list.size());
            arrayList = new java.util.ArrayList();
            java.util.Iterator it6 = list.iterator();
            int i29 = 0;
            int i37 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                int i38 = i29 + 1;
                ru0.n nVar2 = (ru0.n) it6.next();
                if (nVar2.f481223a.length() > i28) {
                    arrayList4.add(nVar2);
                    if (i29 < kz5.c0.h(list)) {
                        arrayList5.addAll(list.subList(i38, list.size()));
                    }
                } else {
                    java.lang.String str3 = nVar2.f481223a;
                    if (str3.length() + i37 <= i28) {
                        arrayList2.add(nVar2);
                    } else {
                        arrayList3.add(nVar2);
                    }
                    i37 += str3.length();
                    i29 = i38;
                }
            }
            if (!arrayList2.isEmpty()) {
                java.util.Iterator it7 = arrayList2.iterator();
                int i39 = 0;
                while (it7.hasNext()) {
                    i39 += ((ru0.n) it7.next()).f481223a.length();
                }
                arrayList.addAll(f(arrayList2, str, i39));
            }
            if (!arrayList3.isEmpty()) {
                java.util.Iterator it8 = arrayList3.iterator();
                int i47 = 0;
                while (it8.hasNext()) {
                    i47 += ((ru0.n) it8.next()).f481223a.length();
                }
                arrayList.addAll(f(arrayList3, str, i47));
            }
            if (!arrayList4.isEmpty()) {
                java.util.Iterator it9 = arrayList4.iterator();
                int i48 = 0;
                while (it9.hasNext()) {
                    i48 += ((ru0.n) it9.next()).f481223a.length();
                }
                arrayList.addAll(f(arrayList4, str, i48));
            }
            if (!arrayList5.isEmpty()) {
                java.util.Iterator it10 = arrayList5.iterator();
                int i49 = 0;
                while (it10.hasNext()) {
                    i49 += ((ru0.n) it10.next()).f481223a.length();
                }
                arrayList.addAll(f(arrayList5, str, i49));
            }
        }
        return arrayList;
    }
}
