package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public enum a3 {
    ;

    public static void a(int i17, android.os.Bundle bundle, java.util.LinkedList linkedList, k91.e5 e5Var) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.pc7 pc7Var = (r45.pc7) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pc7Var.f464477d)) {
                hashSet.add(pc7Var.f464477d);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(hashSet.size());
        arrayList.addAll(hashSet);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.q.c(arrayList, i17 == 3 ? k91.h1.RECENTS_LIST : k91.h1.DEFAULT, e5Var);
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.a3 m49723xdce0328(java.lang.String str) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(java.lang.Enum.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.a3.class, str));
        return null;
    }
}
