package vd2;

/* loaded from: classes10.dex */
public final class j2 {

    /* renamed from: e, reason: collision with root package name */
    public static volatile java.util.LinkedList f517309e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f517310f;

    /* renamed from: h, reason: collision with root package name */
    public static zy2.i8 f517312h;

    /* renamed from: a, reason: collision with root package name */
    public static final vd2.j2 f517305a = new vd2.j2();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f517306b = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f517307c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final int f517308d = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f517311g = 60;

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f517313i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("FinderLiveNotifyRefreshManager", vd2.g2.f517268d);

    public synchronized void a(java.util.LinkedList data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (!data.isEmpty() && f517310f) {
            f517309e = data;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotifyRefreshManager", "allow to request,size = " + data.size());
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = f517313i;
            int i17 = f517308d;
            n3Var.mo50303x856b99f0(i17);
            n3Var.mo50308x2936bf5f(n3Var.mo50292x733c63a2(i17, data));
        }
    }

    public void b(r45.l71 l71Var) {
        r45.nw1 nw1Var;
        java.util.LinkedList m75941xfb821914;
        if (l71Var == null || (nw1Var = (r45.nw1) l71Var.m75936x14adae67(1)) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotifyRefreshManager", "updateLiveInfoResp liveInfo null");
            return;
        }
        r45.n94 n94Var = (r45.n94) l71Var.m75936x14adae67(29);
        if (n94Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotifyRefreshManager", "updateLiveInfoResp notification_dynamic_display_info null");
            return;
        }
        f517307c.put(java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0)), (r45.zj5) n94Var.m75936x14adae67(0));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateLiveInfoResp liveId:");
        sb6.append(nw1Var.m75942xfb822ef2(0));
        sb6.append(", reason isvalid:");
        r45.zj5 zj5Var = (r45.zj5) n94Var.m75936x14adae67(0);
        java.lang.String str = null;
        sb6.append(zj5Var != null ? java.lang.Boolean.valueOf(zj5Var.m75933x41a8a7f2(0)) : null);
        sb6.append(", string:");
        r45.zj5 zj5Var2 = (r45.zj5) n94Var.m75936x14adae67(0);
        if (zj5Var2 != null && (m75941xfb821914 = zj5Var2.m75941xfb821914(1)) != null) {
            str = kz5.n0.g0(m75941xfb821914, null, null, null, 0, null, vd2.i2.f517296d, 31, null);
        }
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotifyRefreshManager", sb6.toString());
    }
}
