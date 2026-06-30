package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public abstract class n4 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f294617a = {10, 20};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f294618b = {11, 21};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f294619c = {12, 22};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f294620d = {13, 23};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f294621e = {14, 24};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f294622f = {15, 25};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f294623g = {16, 26};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f294624h = {17, 27};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f294625i = {18, 28};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f294626j = {19, 29};

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.Map f294627k;

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("attachment", 1966120);
        linkedHashMap.put("Download", 2031657);
        linkedHashMap.put("voice", 2097194);
        linkedHashMap.put("voice2", 2162731);
        linkedHashMap.put("image", 2228268);
        linkedHashMap.put("oldimage2", 2293805);
        linkedHashMap.put("video", 2359342);
        linkedHashMap.put("oneday", 2424879);
        linkedHashMap.put("emoji", 2490416);
        linkedHashMap.put("finder", 2555953);
        linkedHashMap.put("CDNDownloadBigFile", 9896088);
        linkedHashMap.put("CheckResUpdate", 10092699);
        f294627k = java.util.Collections.unmodifiableMap(linkedHashMap);
    }

    public static boolean a(com.p314xaae8f345.mm.vfs.m0 m0Var) {
        java.util.List K = m0Var.K();
        java.util.Iterator it = K.subList(1, K.size()).iterator();
        while (it.hasNext()) {
            java.lang.Iterable mo82286x32b09e = ((com.p314xaae8f345.mm.vfs.q2) it.next()).mo82286x32b09e("");
            if (mo82286x32b09e != null && mo82286x32b09e.iterator().hasNext()) {
                return false;
            }
        }
        return true;
    }
}
