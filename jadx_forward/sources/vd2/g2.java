package vd2;

/* loaded from: classes10.dex */
public final class g2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public static final vd2.g2 f517268d = new vd2.g2();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        boolean z17;
        long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.what != vd2.j2.f517308d) {
            return true;
        }
        vd2.j2 j2Var = vd2.j2.f517305a;
        java.lang.Object obj = it.obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type java.util.LinkedList<com.tencent.mm.storage.MsgInfo>");
        java.util.LinkedList<com.p314xaae8f345.mm.p2621x8fb0427b.f9> linkedList = (java.util.LinkedList) obj;
        if (!vd2.j2.f517310f || linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotifyRefreshManager", "refreshLiveInfo isPageFocus:" + vd2.j2.f517310f + ",data size:" + linkedList.size() + '!');
            return true;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var : linkedList) {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.j(), "msg", null);
            java.lang.String str = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.tips_id");
            long Z = pm0.v.Z((java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.live_id"));
            java.lang.String str2 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_id");
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            long Z2 = pm0.v.Z(str2);
            java.lang.String str3 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.control_flag");
            if (str3 == null) {
                str3 = "";
            }
            int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str3, 0);
            boolean z19 = pm0.v.z(D1, 64);
            java.lang.String str4 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.msg_type");
            java.lang.String str5 = str4 != null ? str4 : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotifyRefreshManager", "refreshLiveInfo liveId:" + Z + ",tipsId:" + str + ",controlFlag:" + D1 + ",msgType:" + str5 + ",need_dynamic_reason:" + z19);
            java.lang.Long l17 = (java.lang.Long) vd2.j2.f517306b.get(str);
            if (l17 != null) {
                long longValue = l17.longValue();
                z17 = z19;
                j17 = longValue;
            } else {
                z17 = z19;
                j17 = 0;
            }
            if (Z != 0) {
                if (!(str == null || str.length() == 0) && c01.id.e() > j17) {
                    hashMap.put(java.lang.Long.valueOf(Z), f9Var);
                    r45.m71 m71Var = new r45.m71();
                    m71Var.set(0, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str5, 0)));
                    m71Var.set(1, java.lang.Integer.valueOf((int) z17));
                    i95.m c17 = i95.n0.c(s40.w0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    vd2.h2 h2Var = new vd2.h2(Z, str, hashMap, z17, f9Var, Z2);
                    qs5.d dVar = qs5.d.f447959e;
                    s40.w0.u9((s40.w0) c17, Z, false, null, h2Var, 5, null, null, m71Var, 96, null);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotifyRefreshManager", "liveId:" + Z + ",tipsId:" + str + " is not allow to refresh, next time stamp:" + j17);
        }
        return true;
    }
}
