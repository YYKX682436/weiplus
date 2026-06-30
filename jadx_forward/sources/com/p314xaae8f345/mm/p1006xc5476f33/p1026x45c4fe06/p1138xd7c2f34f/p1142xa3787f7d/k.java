package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.k f166733a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.k();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f166734b = new java.util.HashMap();

    public static final void c(java.lang.String str) {
        if (!(str == null || str.length() == 0) && ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Di(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.i(str)));
        }
    }

    public static final void d(java.lang.String str) {
        if (!(str == null || str.length() == 0) && ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Di(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.j(str)));
        }
    }

    public final void a(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            return;
        }
        java.util.HashMap hashMap = f166734b;
        java.lang.String b17 = b(str, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        aVar.f166723a = str;
        hashMap.put(b17, aVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTeenModeReporter", "addCollection %s, %d, %d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(hashMap.size()));
    }

    public final java.lang.String b(java.lang.String str, int i17) {
        return str + ',' + i17;
    }

    public final void e(java.util.ArrayList arrayList) {
        f166734b.clear();
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 c11712x63ef1ef4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4) it.next();
                if (c11712x63ef1ef4 != null) {
                    java.lang.String str = c11712x63ef1ef4.f157894d;
                    if (!(str == null || str.length() == 0)) {
                        int i17 = c11712x63ef1ef4.f157896f;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTeenModeReporter", "getAllCollectionList info: %s, %d", str, java.lang.Integer.valueOf(i17));
                        f166733a.a(str, i17);
                    }
                }
            }
        }
    }
}
