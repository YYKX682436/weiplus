package zu4;

/* loaded from: classes8.dex */
public class i implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        int D1;
        su4.f3 f3Var;
        if (map == null || str == null || !str.equals("mmsearch_reddot_new") || (D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".sysmsg.mmsearch_reddot_new.entry"), 0)) != 1) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FtsRedPointReceiver", "recv %s, %s", "mmsearch_reddot_new", map.toString());
        int D12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".sysmsg.mmsearch_reddot_new.clear"), 0);
        java.lang.String z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1((java.lang.String) map.get(".sysmsg.mmsearch_reddot_new.msgid"), new java.lang.Object[0]);
        int D13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".sysmsg.mmsearch_reddot_new.discovery"), 0);
        int D14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".sysmsg.mmsearch_reddot_new.android_cli_version"), 0);
        long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) map.get(".sysmsg.mmsearch_reddot_new.expire_time"));
        int D15 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".sysmsg.mmsearch_reddot_new.h5_version"), 0);
        int D16 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".sysmsg.mmsearch_reddot_new.reddot_type"), 0);
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.mmsearch_reddot_new.reddot_text");
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.mmsearch_reddot_new.reddot_icon");
        long E12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) map.get(".sysmsg.mmsearch_reddot_new.timestamp"));
        su4.g3 g3Var = su4.g3.f494435d;
        if (D1 != 1) {
            g3Var.getClass();
            f3Var = null;
        } else {
            f3Var = g3Var.f494436a;
        }
        if (f3Var == null) {
            f3Var = new su4.f3();
        }
        if (f3Var.f494422i < E12) {
            f3Var.f494414a = z17;
            f3Var.f494423j = D13;
            f3Var.f494415b = D1;
            f3Var.f494416c = D14;
            f3Var.f494417d = E1;
            f3Var.f494418e = D15;
            f3Var.f494419f = D16;
            f3Var.f494420g = str2;
            f3Var.f494421h = str3;
            f3Var.f494422i = E12;
            f3Var.f494426m = D12;
            f3Var.f494424k = java.lang.System.currentTimeMillis();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchRedPointMgr", "timestamp %d not big than last msg %d", java.lang.Long.valueOf(E12), java.lang.Long.valueOf(f3Var.f494422i));
        }
        g3Var.b();
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5982xbac3ddd5().e();
    }
}
