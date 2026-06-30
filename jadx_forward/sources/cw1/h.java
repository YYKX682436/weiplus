package cw1;

/* loaded from: classes12.dex */
public abstract class h {
    public static final cw1.b a(java.lang.String str, int[] iArr, long j17, long j18, java.lang.Boolean bool, int i17, boolean z17, boolean z18, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, java.util.Map userTypeCache) {
        int[] R0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userTypeCache, "userTypeCache");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashSet hashSet = new java.util.HashSet();
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        ot1.h hVar = new ot1.h();
        ot1.j n17 = mt1.b0.f412724a.n();
        if (iArr == null) {
            R0 = null;
        } else {
            java.util.TreeSet treeSet = new java.util.TreeSet();
            for (int i18 : iArr) {
                treeSet.add(java.lang.Integer.valueOf(i18));
            }
            if (treeSet.contains(23)) {
                treeSet.add(20);
            }
            if (treeSet.contains(3)) {
                treeSet.add(1);
            }
            R0 = kz5.n0.R0(treeSet);
        }
        cw1.f fVar = new cw1.f(n17.T1(str, j18, j17, R0, false, false, null, c26987xeef691ab), hashSet, iArr, hVar);
        arrayList.add(fVar);
        cw1.g gVar = new cw1.g(hashSet);
        if (iArr == null || ot1.h.w0(iArr, 23)) {
            arrayList.add(new pm5.e(ot1.d.a("c2c_origin_image", null, iArr, ot1.b.f430362d), gVar));
        }
        if (iArr == null || ot1.h.w0(iArr, 3)) {
            arrayList.add(new pm5.e(ot1.d.a("c2c_origin_video", null, iArr, ot1.c.f430363d), gVar));
        }
        return new cw1.e(fVar, arrayList, hVar, bool, z18, i17, userTypeCache, Bi, z17, hashMap, wVar);
    }
}
