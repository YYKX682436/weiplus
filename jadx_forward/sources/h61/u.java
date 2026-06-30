package h61;

/* loaded from: classes9.dex */
public class u implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h61.x f360707a;

    public u(h61.x xVar) {
        this.f360707a = xVar;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.LOGIC";
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        nm5.b bVar = (nm5.b) obj;
        h61.t tVar = this.f360707a.f360710a;
        int intValue = ((java.lang.Integer) bVar.a(0)).intValue();
        java.util.Map map = (java.util.Map) bVar.a(1);
        tVar.getClass();
        tVar.f360706g = km5.u.b();
        if (tVar.f360703d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LaunchAALogic", "launchAA, isLaunching!!! ignore it");
            tVar.f360706g.a(java.lang.Boolean.FALSE);
            return null;
        }
        if (map == null || map.size() == 0) {
            tVar.f360706g.a(java.lang.Boolean.FALSE);
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchAALogic", "launchAAByMoney, data.keySet: %s", map.keySet());
        tVar.f360703d = true;
        tVar.f360705f = map;
        tVar.f360704e = intValue;
        if (intValue == 1) {
            if (!map.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28) || !tVar.f360705f.containsKey("perAmount") || !tVar.f360705f.containsKey("totalUserNumber") || !tVar.f360705f.containsKey("launchScene") || !tVar.f360705f.containsKey("chatRoomName") || !tVar.f360705f.containsKey(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6)) {
                tVar.f360706g.a(java.lang.Boolean.FALSE);
                tVar.f360703d = false;
                return null;
            }
            try {
                java.lang.String str = (java.lang.String) tVar.f360705f.get(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                long longValue = ((java.lang.Long) tVar.f360705f.get("perAmount")).longValue();
                int intValue2 = ((java.lang.Integer) tVar.f360705f.get("totalUserNumber")).intValue();
                int intValue3 = ((java.lang.Integer) tVar.f360705f.get("launchScene")).intValue();
                java.lang.String str2 = (java.lang.String) tVar.f360705f.get("chatRoomName");
                long longValue2 = ((java.lang.Long) tVar.f360705f.get(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6)).longValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchAALogic", "launchAAByMoney");
                gm0.j1.i();
                gm0.j1.n().f354821b.g(new i61.f(longValue, str, intValue2, intValue3, longValue2, str2));
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, (intValue2 <= 0 || intValue2 > 10) ? (intValue2 <= 10 || intValue2 > 20) ? (intValue2 <= 20 || intValue2 > 50) ? 16 : 15 : 14 : 13, 1L, false);
                tVar.f360706g.b();
                return null;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LaunchAALogic", "launchAAByMoney, without specific user error: %s", e17.getMessage());
                tVar.f360706g.a(java.lang.Boolean.FALSE);
                tVar.f360703d = false;
                return null;
            }
        }
        if (intValue != 2) {
            return null;
        }
        if (!map.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28) || !tVar.f360705f.containsKey("perAmount") || !tVar.f360705f.containsKey("payerlist") || !tVar.f360705f.containsKey("launchScene") || !tVar.f360705f.containsKey("chatRoomName") || !tVar.f360705f.containsKey(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6)) {
            tVar.f360706g.a(java.lang.Boolean.FALSE);
            tVar.f360703d = false;
            return null;
        }
        try {
            java.lang.String str3 = (java.lang.String) tVar.f360705f.get(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            long longValue3 = ((java.lang.Long) tVar.f360705f.get("perAmount")).longValue();
            java.util.List list = (java.util.List) tVar.f360705f.get("payerlist");
            int intValue4 = ((java.lang.Integer) tVar.f360705f.get("launchScene")).intValue();
            java.lang.String str4 = (java.lang.String) tVar.f360705f.get("chatRoomName");
            long longValue4 = ((java.lang.Long) tVar.f360705f.get(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6)).longValue();
            java.lang.String str5 = (java.lang.String) tVar.f360705f.get("pic_cdn_url");
            java.lang.String str6 = (java.lang.String) tVar.f360705f.get("pic_cdn_thumb_url");
            java.lang.String str7 = (java.lang.String) tVar.f360705f.get("pf_order_no");
            java.lang.String str8 = (java.lang.String) tVar.f360705f.get("pic_cdn_md5");
            boolean booleanValue = ((java.lang.Boolean) tVar.f360705f.get("isGroupSolitatire")).booleanValue();
            java.util.LinkedList linkedList = new java.util.LinkedList((java.util.List) tVar.f360705f.get("payerlistGroupSolitatire"));
            gm0.j1.i();
            gm0.j1.n().f354821b.g(new i61.f(longValue3, str3, list, intValue4, longValue4, str4, str5, str6, str7, str8, booleanValue, linkedList));
            int size = list.size();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, (size <= 0 || size > 10) ? (size <= 10 || size > 20) ? (size <= 20 || size > 50) ? 16 : 15 : 14 : 13, 1L, false);
            tVar.f360706g.b();
            return null;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LaunchAALogic", "launchAAByMoney, specific user error: %", e18.getMessage());
            tVar.f360706g.a(java.lang.Boolean.FALSE);
            tVar.f360703d = false;
            return null;
        }
    }
}
