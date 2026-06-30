package jy4;

/* loaded from: classes11.dex */
public class x implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreWebWX.PushLoginMainDeviceMsgListener", "onRecieveMsg");
        if (map != null) {
            java.lang.String str2 = (java.lang.String) map.get(".sysmsg.pushloginurlmaindevice.url");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreWebWX.PushLoginMainDeviceMsgListener", "url is null");
                p0Var.f152259a.f459100q = null;
                return;
            }
            java.lang.String str3 = (java.lang.String) map.get(".sysmsg.pushloginurlmaindevice.uuid");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreWebWX.PushLoginMainDeviceMsgListener", "uuid :" + str3);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreWebWX.PushLoginMainDeviceMsgListener", "uuid is null");
                p0Var.f152259a.f459100q = null;
                return;
            }
            if (!ot5.h.f430410a.a(str3, wo.w0.k(), "MicroMsg.SubCoreWebWX.PushLoginMainDeviceMsgListener", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreWebWX.PushLoginMainDeviceMsgListener", "uuid is wrong");
                p0Var.f152259a.f459100q = null;
                return;
            }
            java.lang.String substring = str2.substring(str2.lastIndexOf("/") + 1);
            q61.j.h();
            q61.j.i(substring);
            java.lang.String str4 = q61.j.f441801h;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ReportPushLoginURLMainDevice", "reportComfirmPageIn");
            java.util.HashMap d17 = q61.j.d();
            d17.put("page_id", "50368");
            d17.put("page_name", "LoginAssistAgreePage");
            d17.put("login_ticket_id", str4);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("page_in", d17, 34575);
            q61.j.f(q61.j.f441801h, 1);
            w60.j jVar = (w60.j) i95.n0.c(w60.j.class);
            if (jVar == null) {
                p0Var.f152259a.f459100q = null;
                return;
            }
            w60.k Ai = ((v60.u) jVar).Ai(str2, null, 24, 0, o45.cg.a(), new byte[0]);
            com.p314xaae8f345.mm.p944x882e457a.z2.d(((com.p314xaae8f345.mm.p957x53236a1b.k0) Ai).f152889e, new jy4.w(this, p0Var, Ai, str2), true);
        }
    }
}
