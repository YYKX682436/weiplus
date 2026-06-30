package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class x2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f177663a = new java.util.concurrent.ConcurrentHashMap(1);

    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.t2 t2Var, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.w2 w2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE.n(new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.u2(this, w2Var, i17, i18, str, t2Var, z17));
    }

    public void b(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.w2 w2Var) {
        java.util.Map map = this.f177663a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.t2 t2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.t2) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
        if (t2Var != null && t2Var.a()) {
            if (w2Var != null) {
                a(0, 0, "", t2Var, false, w2Var);
                return;
            }
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) map).remove(str);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.gd3();
        lVar.f152198b = new r45.hd3();
        lVar.f152200d = 2985;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxabusiness/getcloudimsession";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        r45.gd3 gd3Var = (r45.gd3) a17.f152243a.f152217a;
        gd3Var.f456664d = str;
        gd3Var.f456665e = str2;
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a17, new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.v2(this, w2Var, str));
    }

    public void c(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceSessionMgr", "hy: on exit");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f177663a).remove(str);
    }
}
