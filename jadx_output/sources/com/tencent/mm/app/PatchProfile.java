package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final class PatchProfile extends yo.d {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f53272b = com.tencent.mm.sdk.platformtools.x2.f193072b + ":patch";

    @Override // yo.d
    public void a() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.booter.s b17 = com.tencent.mm.booter.s.b(this.f464046a.getBaseContext());
        try {
            int intValue = java.lang.Integer.decode(b17.d(".com.tencent.mm.debug.log.setversion")).intValue();
            o45.wf.b(intValue);
            java.lang.Integer.toHexString(intValue);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PatchDebugger", "no debugger was got");
        }
        try {
            java.lang.String d17 = b17.d(".com.tencent.mm.debug.log.setapilevel");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                wo.q.f447780a = "android-" + d17;
                wo.q.f447784e = "android-" + d17;
                wo.q.f447785f = "" + d17;
                com.tencent.mm.sdk.platformtools.s9.f192973a = d17;
                int i17 = o45.wf.f343023a;
            }
        } catch (java.lang.Exception unused2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PatchDebugger", "no debugger was got");
        }
        try {
            o45.wf.f343028f = java.lang.Integer.decode(b17.d(".com.tencent.mm.debug.log.setuin")).intValue();
        } catch (java.lang.Exception unused3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PatchDebugger", "no debugger was got");
        }
        try {
            boolean m17 = com.tencent.mm.sdk.platformtools.t8.m1(b17.a(".com.tencent.mm.debug.report.debugmodel"), false);
            boolean m18 = com.tencent.mm.sdk.platformtools.t8.m1(b17.a(".com.tencent.mm.debug.report.kvstat"), false);
            com.tencent.mm.sdk.platformtools.t8.m1(b17.a(".com.tencent.mm.debug.report.clientpref"), false);
            com.tencent.mm.sdk.platformtools.t8.m1(b17.a(".com.tencent.mm.debug.report.useraction"), false);
            kx3.a.f313280a = m17;
            kx3.a.f313281b = m18;
        } catch (java.lang.Exception unused4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PatchDebugger", "no debugger was got");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PatchProfile", "patchsprofile try to init hotpatch plugin");
        com.tencent.mars.xlog.Log.i("MicroMsg.PatchProfile", "start time check patchsprofile use time = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public java.lang.String toString() {
        return f53272b;
    }
}
