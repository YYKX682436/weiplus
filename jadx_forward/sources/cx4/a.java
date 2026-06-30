package cx4;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f306114a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f306115b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f306116c;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(-1, 5);
        hashMap.put(-2, 6);
        hashMap.put(-3, 7);
        hashMap.put(-4, 8);
        hashMap.put(-5, 9);
        hashMap.put(-6, 10);
        hashMap.put(-7, 11);
        hashMap.put(-8, 12);
        hashMap.put(-9, 13);
        hashMap.put(-10, 14);
        hashMap.put(-11, 15);
        hashMap.put(-12, 16);
        hashMap.put(-13, 17);
        hashMap.put(-14, 18);
        hashMap.put(-15, 19);
        f306114a = java.util.Collections.unmodifiableMap(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put(0, 0);
        hashMap2.put(1, 1);
        hashMap2.put(2, 2);
        f306115b = java.util.Collections.unmodifiableMap(hashMap2);
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("imagePreview", 2);
        hashMap3.put(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, 3);
        hashMap3.put("addContact", 4);
        hashMap3.put(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.g1.f34800x24728b, 7);
        hashMap3.put("scanQRCode", 8);
        hashMap3.put("hideOptionMenu", 10);
        hashMap3.put("getBrandWCPayRequest", 11);
        hashMap3.put("editAddress", 12);
        hashMap3.put("getLatestAddress", 13);
        hashMap3.put("jumpWCMall", 14);
        hashMap3.put("geoLocation", 15);
        hashMap3.put("openProductView", 16);
        hashMap3.put("openProductViewWithPid", 16);
        hashMap3.put(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.g0.f34402x24728b, 17);
        hashMap3.put("hideMenuItems", 19);
        hashMap3.put(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.d3.f33784x24728b, 21);
        hashMap3.put(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e3.f34476x24728b, 22);
        hashMap3.put("scanCover", 23);
        hashMap3.put("openGameWebView", 28);
        f306116c = java.util.Collections.unmodifiableMap(hashMap3);
    }

    public static int a(int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.Map map = f306114a;
        java.lang.Integer num = (java.lang.Integer) map.get(valueOf);
        if (num == null) {
            num = (java.lang.Integer) map.get(-1);
        }
        return num.intValue();
    }

    public static int b(long j17) {
        if (j17 < 0) {
            return -1;
        }
        if (j17 <= 2000) {
            return 1;
        }
        if (j17 <= p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d) {
            return 2;
        }
        if (j17 <= 12000) {
            return 3;
        }
        return j17 <= 60000 ? 4 : 5;
    }

    public static void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1061L, i17, 1L, false);
    }
}
