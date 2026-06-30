package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.PatchProfile */
/* loaded from: classes12.dex */
public final class C5018x5e2af461 extends yo.d {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f134805b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":patch";

    @Override // yo.d
    public void a() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p642xad8b531f.s b17 = com.p314xaae8f345.mm.p642xad8b531f.s.b(this.f545579a.getBaseContext());
        try {
            int intValue = java.lang.Integer.decode(b17.d(".com.tencent.mm.debug.log.setversion")).intValue();
            o45.wf.b(intValue);
            java.lang.Integer.toHexString(intValue);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatchDebugger", "no debugger was got");
        }
        try {
            java.lang.String d17 = b17.d(".com.tencent.mm.debug.log.setapilevel");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                wo.q.f529313a = "android-" + d17;
                wo.q.f529317e = "android-" + d17;
                wo.q.f529318f = "" + d17;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274506a = d17;
                int i17 = o45.wf.f424556a;
            }
        } catch (java.lang.Exception unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatchDebugger", "no debugger was got");
        }
        try {
            o45.wf.f424561f = java.lang.Integer.decode(b17.d(".com.tencent.mm.debug.log.setuin")).intValue();
        } catch (java.lang.Exception unused3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatchDebugger", "no debugger was got");
        }
        try {
            boolean m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b17.a(".com.tencent.mm.debug.report.debugmodel"), false);
            boolean m18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b17.a(".com.tencent.mm.debug.report.kvstat"), false);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b17.a(".com.tencent.mm.debug.report.clientpref"), false);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b17.a(".com.tencent.mm.debug.report.useraction"), false);
            kx3.a.f394813a = m17;
            kx3.a.f394814b = m18;
        } catch (java.lang.Exception unused4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatchDebugger", "no debugger was got");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatchProfile", "patchsprofile try to init hotpatch plugin");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatchProfile", "start time check patchsprofile use time = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: toString */
    public java.lang.String m42978x9616526c() {
        return f134805b;
    }
}
