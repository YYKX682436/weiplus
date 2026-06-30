package m11;

/* loaded from: classes12.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.ArrayList f404259a = new java.util.ArrayList(3);

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f404260b = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("db_max_id_record");

    static {
        d("", "ImgInfo2", m11.l0.f404265s, 1L, 1000000000L);
        d("@findermsg", "finder_img_info_table", m11.l0.u1("finder_img_info_table"), 1000000001L, 1001000001L);
        d("@gamelifesess", "gamelife_img_info_table", m11.l0.u1("gamelife_img_info_table"), 1001000002L, 1002000002L);
        d("@bizfansmsg", "bizfans_img_info_table", m11.l0.u1("bizfans_img_info_table"), 1002000003L, 1003000003L);
        d("@zhugemsg", "w1w_img_info_table", m11.l0.u1("w1w_img_info_table"), 1003000004L, 1004000004L);
        d("@picfansmsg", "biz_photo_fans_img_info_table", m11.l0.u1("biz_photo_fans_img_info_table"), 1004000005L, 1005000005L);
    }

    public static java.lang.String a(long j17) {
        java.util.ArrayList arrayList = f404259a;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m11.j0 j0Var = (m11.j0) it.next();
            long[] jArr = j0Var.f404255d;
            if (jArr[0] <= j17 && j17 <= jArr[1]) {
                return j0Var.f404252a;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgInfoStorage", "[getTableById] table=%s id=%s", ((m11.j0) arrayList.get(0)).f404252a, java.lang.Long.valueOf(j17));
        return ((m11.j0) arrayList.get(0)).f404252a;
    }

    public static java.lang.String b(java.lang.String str) {
        java.util.ArrayList arrayList = f404259a;
        if (str == null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "[getTableByTalker] talker is null %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            return ((m11.j0) arrayList.get(0)).f404252a;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m11.j0 j0Var = (m11.j0) it.next();
            if (!j0Var.f404253b.isEmpty() && str.toLowerCase().endsWith(j0Var.f404253b)) {
                return j0Var.f404252a;
            }
        }
        if (!z65.c.f551991d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgInfoStorage", "[getTableByTalker] table=%s talker=%s", ((m11.j0) arrayList.get(0)).f404252a, str);
        }
        return ((m11.j0) arrayList.get(0)).f404252a;
    }

    public static m11.j0 c(java.lang.String str) {
        java.util.ArrayList arrayList = f404259a;
        if (str == null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "[getIdCreator] talker is null %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            return (m11.j0) arrayList.get(0);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m11.j0 j0Var = (m11.j0) it.next();
            if (!j0Var.f404253b.isEmpty() && str.toLowerCase().endsWith(j0Var.f404253b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgInfoStorage", "[getIdCreator] table=%s talker=%s", j0Var.f404252a, str);
                return j0Var;
            }
        }
        if (!z65.c.f551991d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgInfoStorage", "[getIdCreator] table=%s talker=%s", ((m11.j0) arrayList.get(0)).f404252a, str);
        }
        return (m11.j0) arrayList.get(0);
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.String[] strArr, long j17, long j18) {
        f404259a.add(new m11.j0(str.toLowerCase(), str2, strArr, j17, j18));
    }
}
