package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class m9 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.h9 f274400a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.i9(this);

    /* renamed from: b, reason: collision with root package name */
    public r.a f274401b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.j9(this);

    public static java.lang.Object a(java.lang.String str, com.p314xaae8f345.mm.sdk.p2603x2137b148.h9 h9Var) {
        int i17;
        int indexOf = str.indexOf("${");
        if (indexOf < 0) {
            return str;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(5);
        while (true) {
            if (indexOf > 0) {
                arrayList.add(str.substring(0, indexOf));
                str = str.substring(indexOf);
                indexOf = str.indexOf("${");
            } else {
                if (indexOf < 0) {
                    arrayList.add(str);
                    return arrayList;
                }
                int indexOf2 = str.indexOf("}");
                if (indexOf2 < 0 || (i17 = indexOf + 2) >= str.length() - 1) {
                    break;
                }
                if (i17 == indexOf2) {
                    int i18 = indexOf2 + 1;
                    arrayList.add(str.substring(indexOf, i18));
                    str = str.substring(i18);
                    indexOf = str.indexOf("${");
                } else {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.k9 k9Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.k9(str.substring(i17, indexOf2));
                    k9Var.f274348b = h9Var;
                    arrayList.add(k9Var);
                    if (indexOf2 == str.length() - 1) {
                        return arrayList;
                    }
                    str = str.substring(indexOf2 + 1);
                    indexOf = str.indexOf("${");
                }
            }
        }
        arrayList.add(str);
        return arrayList;
    }
}
