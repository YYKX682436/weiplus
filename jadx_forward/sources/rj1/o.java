package rj1;

/* loaded from: classes7.dex */
public final class o implements vg3.q4 {
    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        if (map == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BubbleTips.XMLConsumer", "values are null");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12627x488d3557 c12627x488d3557 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12627x488d3557();
        c12627x488d3557.f67159x28d45f97 = (java.lang.String) kz5.c1.h(map, ".sysmsg.mm_miniapp_wxa_tipsmsg_newxml.appid");
        c12627x488d3557.f67161xac3be4e = java.lang.Long.parseLong((java.lang.String) kz5.c1.h(map, ".sysmsg.mm_miniapp_wxa_tipsmsg_newxml.create_time"));
        c12627x488d3557.f67167xee5f688b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        c12627x488d3557.f67163x876650f1 = java.lang.Long.parseLong((java.lang.String) kz5.c1.h(map, ".sysmsg.mm_miniapp_wxa_tipsmsg_newxml.expire_time"));
        c12627x488d3557.f67166x98f67a0 = java.lang.Integer.parseInt((java.lang.String) kz5.c1.h(map, ".sysmsg.mm_miniapp_wxa_tipsmsg_newxml.op_type"));
        c12627x488d3557.f67164x297eb4f7 = (java.lang.String) kz5.c1.h(map, ".sysmsg.mm_miniapp_wxa_tipsmsg_newxml.msg_id");
        c12627x488d3557.f67160xd95c4268 = java.lang.Integer.parseInt((java.lang.String) kz5.c1.h(map, ".sysmsg.mm_miniapp_wxa_tipsmsg_newxml.busi_type"));
        c12627x488d3557.f67165xc4aab016 = java.lang.Integer.parseInt((java.lang.String) kz5.c1.h(map, ".sysmsg.mm_miniapp_wxa_tipsmsg_newxml.msg_type"));
        c12627x488d3557.f67162x88617557 = (java.lang.String) kz5.c1.h(map, ".sysmsg.mm_miniapp_wxa_tipsmsg_newxml.data_json");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BubbleTips.XMLConsumer", "receive bubble tips, content = " + c12627x488d3557);
        int i17 = c12627x488d3557.f67166x98f67a0;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a();
            java.lang.String field_appId = c12627x488d3557.f67159x28d45f97;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_appId, "field_appId");
            rj1.k kVar = new rj1.k(c12627x488d3557);
            rj1.l lVar = new rj1.l(c12627x488d3557);
            com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) kz5.z.O(a17.j(field_appId, -1));
            if (sVar != null) {
                com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h.q(a17.f(sVar), (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479) kVar.mo146xb9724478(sVar), null, 2, null);
            } else {
                lVar.mo152xb9724478();
            }
        } else if (i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BubbleTips.XMLConsumer", "opType is illegal, ignore.");
        } else {
            rj1.m.b(c12627x488d3557, 5);
            rj1.m.a(c12627x488d3557);
        }
        return null;
    }
}
