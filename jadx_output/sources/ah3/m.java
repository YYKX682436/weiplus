package ah3;

/* loaded from: classes12.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f4906b;

    /* renamed from: a, reason: collision with root package name */
    public static final ah3.m f4905a = new ah3.m();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f4907c = jz5.h.b(ah3.b.f4860d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f4908d = jz5.h.b(ah3.h.f4881d);

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d8 A[Catch: Exception -> 0x01d7, TryCatch #0 {Exception -> 0x01d7, blocks: (B:11:0x0042, B:12:0x00c5, B:17:0x00d8, B:18:0x00fe, B:20:0x0104, B:22:0x0110, B:23:0x0123, B:25:0x0129, B:46:0x013d, B:37:0x0161, B:43:0x017c, B:31:0x018b, B:50:0x01b5, B:63:0x009e, B:39:0x016b), top: B:10:0x0042, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00c1 -> B:12:0x00c5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ah3.m r20, java.util.List r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah3.m.a(ah3.m, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah3.m.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final jz5.l c(java.util.List usernames) {
        kotlin.jvm.internal.o.g(usernames, "usernames");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.List list : kz5.n0.N(usernames, 100)) {
            p75.n0 n0Var = dm.e2.N1;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            p75.d dVar = dm.e2.P1;
            linkedList.add(dVar);
            linkedList.add(dm.e2.O1);
            p75.m0 l17 = dVar.l(list);
            p75.i0 g17 = dm.e2.N1.g(linkedList);
            g17.f352657d = l17;
            g17.d(linkedList2);
            g17.b(linkedList3);
            java.util.Iterator it = ((java.util.ArrayList) g17.a().k(gm0.j1.u().f273153f, com.tencent.mm.storage.z3.class)).iterator();
            while (it.hasNext()) {
                com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) it.next();
                java.lang.String d17 = z3Var.d1();
                kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                hashMap.put(d17, z3Var);
            }
        }
        java.util.Iterator it6 = usernames.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.storage.z3 z3Var2 = (com.tencent.mm.storage.z3) hashMap.get((java.lang.String) it6.next());
            if (z3Var2 != null) {
                arrayList.add(z3Var2);
            }
        }
        q26.n i17 = q26.h0.i(kz5.n0.J(arrayList), ah3.f.f4873d);
        java.util.HashSet hashSet = new java.util.HashSet();
        q26.h hVar = new q26.h((q26.i) i17);
        while (hVar.hasNext()) {
            hashSet.add(((com.tencent.mm.storage.z3) hVar.next()).d1());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : usernames) {
            if (!hashSet.contains((java.lang.String) obj)) {
                arrayList2.add(obj);
            }
        }
        return new jz5.l(arrayList2, kz5.n0.S0(hashSet));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r11, int r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah3.m.d(int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:51:0x0293
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fa A[Catch: Exception -> 0x0289, TRY_LEAVE, TryCatch #2 {Exception -> 0x0289, blocks: (B:14:0x00e7, B:19:0x00fa), top: B:13:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01df A[Catch: Exception -> 0x027f, TRY_LEAVE, TryCatch #0 {Exception -> 0x027f, blocks: (B:22:0x0113, B:23:0x0122, B:55:0x0136, B:56:0x0149, B:58:0x014f, B:68:0x0195, B:73:0x01df, B:89:0x021b, B:91:0x01a5, B:94:0x01aa, B:97:0x01b1, B:100:0x01b6, B:103:0x01bb, B:106:0x01c2, B:109:0x01c8, B:112:0x022f, B:115:0x025d, B:75:0x01e2, B:78:0x01f6, B:83:0x0202, B:85:0x0208), top: B:21:0x0113, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0189 -> B:109:0x018b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.List r24, java.util.Set r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instructions count: 767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah3.m.e(java.util.List, java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
