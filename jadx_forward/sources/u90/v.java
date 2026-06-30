package u90;

@j95.b
/* loaded from: classes8.dex */
public class v extends i95.w implements v90.x {
    public void wi(int i17, float f17, float f18, int i18) {
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p959x883644fd.i0.f153044a;
        synchronized (com.p314xaae8f345.mm.p959x883644fd.i0.class) {
            if (i17 < 2000 || f17 == 0.0f || f18 == 0.0f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetTypeReporter", "reportGps, invalid args, scene = %d, lon = %f, lat = %f, pre = %d", java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(i18));
                return;
            }
            long j17 = com.p314xaae8f345.mm.p959x883644fd.i0.f153057n;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (java.lang.System.currentTimeMillis() - j17 < 60000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetTypeReporter", "reportGps, hit lastReportGpsLimit, request dropped, scene = %d, lon = %f, lat = %f, pre = %d", java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(i18));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetTypeReporter", "reportGps scene:%d lon:%f lat:%f pre:%d last:%d", java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.p959x883644fd.i0.f153057n));
            com.p314xaae8f345.mm.p959x883644fd.i0.f153057n = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p959x883644fd.i0.f153056m = i17;
            com.p314xaae8f345.mm.p959x883644fd.i0.f153052i = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p959x883644fd.i0.f153055l = i18;
            com.p314xaae8f345.mm.p959x883644fd.i0.f153053j = f18;
            com.p314xaae8f345.mm.p959x883644fd.i0.f153054k = f17;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5632xc2bedd22 c5632xc2bedd22 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5632xc2bedd22();
            am.ch chVar = c5632xc2bedd22.f135960g;
            chVar.f87886a = i17;
            chVar.f87887b = java.lang.System.currentTimeMillis();
            am.ch chVar2 = c5632xc2bedd22.f135960g;
            chVar2.f87888c = i18;
            chVar2.f87889d = f17;
            chVar2.f87890e = f18;
            c5632xc2bedd22.e();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetTypeReporter", "reportGps failed, no location perms: scene=%d", java.lang.Integer.valueOf(i17));
                return;
            }
            try {
                gm0.j1.e().k(new com.p314xaae8f345.mm.p959x883644fd.g0(), 5000L);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetTypeReporter", "reportGps :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        }
    }
}
