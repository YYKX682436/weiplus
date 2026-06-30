package com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7;

/* renamed from: com.tencent.wechat.zidl.JniTypeUtils */
/* loaded from: classes15.dex */
public class C27668xfb982792 {
    /* renamed from: java2JniVV */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> java.lang.Object[] m119316x9af6b8b5(T[] tArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t17 : tArr) {
            arrayList.add(t17.mo20648x5f01b1f6());
        }
        return arrayList.toArray();
    }

    /* renamed from: jni2JavaVV */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> java.util.ArrayList<T> m119317x4ff823ef(T t17, java.util.ArrayList<byte[]> arrayList) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.b0 b0Var = (java.util.ArrayList<T>) new java.util.ArrayList();
        java.util.Iterator<byte[]> it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] next = it.next();
            com.p176xb6135e39.p283xc50a8b8b.h5 mo20596xab31548 = t17.mo20596xab31548();
            try {
                com.p176xb6135e39.p283xc50a8b8b.y yVar = com.p176xb6135e39.p283xc50a8b8b.y.f127245e;
                mo20596xab31548.mo20529x60f45402(com.p176xb6135e39.p283xc50a8b8b.y.g(next, 0, next.length));
                b0Var.add(mo20596xab31548.mo20556x59bc66e());
            } catch (com.p176xb6135e39.p283xc50a8b8b.y6 unused) {
            }
        }
        return b0Var;
    }
}
