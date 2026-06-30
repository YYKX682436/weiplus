package uw;

/* loaded from: classes11.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final uw.d f513017a = new uw.d();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 f513018b;

    static {
        jz5.h.b(uw.c.f513016d);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "<get-mmkv>(...)");
        f513018b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.v3(h17, 15552000L);
    }

    public static void a(uw.d dVar, android.content.Context context, java.lang.String str, java.lang.String str2, int i17, java.util.List list, r45.nw1 nw1Var, java.lang.String str3, byte[] bArr, yz5.l lVar, int i18, java.lang.Object obj) {
        java.util.List<r45.lk> list2 = (i18 & 16) != 0 ? null : list;
        r45.nw1 nw1Var2 = (i18 & 32) != 0 ? null : nw1Var;
        java.lang.String str4 = (i18 & 64) != 0 ? null : str3;
        byte[] bArr2 = (i18 & 128) != 0 ? null : bArr;
        dVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (str == null || str2 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsFinderLiveUtil", "enterFinderLive, bizUserName=" + str + ", exportId=" + str2 + ", scene=" + i17 + ", sessionBuffer=" + str4);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (!(list2 == null || list2.isEmpty())) {
            for (r45.lk lkVar : list2) {
                linkedList.add(lkVar.f461067e);
                linkedList2.add(lkVar.f461066d);
            }
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).sj(context, str2, str, java.lang.Integer.valueOf(i17), linkedList, linkedList2, nw1Var2, str4, bArr2);
    }
}
