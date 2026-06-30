package ge2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ge2.a f352488a = new ge2.a();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f352489b;

    public final void a(boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = f352489b;
        if (str == null) {
            str = "";
        }
        hashMap.put("group_box_number", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBoxReportUtils", "boxBtnReport reportMap: " + hashMap + " isSwitch: " + z17);
        if (z17) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.D1, hashMap, null, null, null, null, false, 124, null);
        } else {
            i95.m c18 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb.I8((zy2.zb) c18, ml2.u1.f409639z1, hashMap, null, null, null, null, false, 124, null);
        }
    }
}
