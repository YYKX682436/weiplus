package ag0;

@j95.b
/* loaded from: classes10.dex */
public class m extends i95.w implements bg0.u {
    public void Ai(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257080a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderVideoShell", "markStartRemux, isLongVideo:" + z17);
        if (z17) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257094o = android.os.SystemClock.elapsedRealtime();
        } else {
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257093n = android.os.SystemClock.elapsedRealtime();
        }
    }

    public void Bi() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257080a;
        if (!b0Var.a()) {
            b0Var.b();
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        long j17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257086g;
        long j18 = 0;
        jSONObject2.put("stage_1", j17 > 0 ? j17 - com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257085f : 0L);
        jSONObject2.put("stage_2", com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257087h - com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257085f);
        long j19 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257089j;
        if (j19 > 0) {
            long j27 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257088i;
            if (j27 > 0) {
                j18 = j19 - j27;
            }
        }
        jSONObject2.put("stage_3", j18);
        jSONObject2.put("stage_4", com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257091l - com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257093n);
        jSONObject2.put("stage_5", com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257092m - com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257094o);
        jSONObject2.put("stage_6", com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257095p);
        jSONObject.put("time_cost", jSONObject2);
        jSONObject.put("quality_score", java.lang.Float.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257096q));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderVideoShell", "reportVideoResult:" + jSONObject + ", path:" + com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257082c);
        boolean z17 = true;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257082c.length() > 0) {
            com.p314xaae8f345.mm.vfs.w6.u(new java.io.File(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257082c).getParentFile().getAbsolutePath());
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257082c;
            java.lang.String jSONObject3 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            byte[] bytes = jSONObject3.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            com.p314xaae8f345.mm.vfs.w6.S(str, bytes, 0, bytes.length);
        } else {
            z17 = false;
        }
        android.content.Intent intent = new android.content.Intent("wechat.shell.FINDER_VIDEO_TEST_FINISH");
        intent.putExtra(ya.b.f77504xbb80cbe3, z17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
    }

    public void wi(java.lang.String path, float f17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257080a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderVideoShell", "markRemuxFinish, qualityScore:" + f17 + ", path:" + path + ", isLongVideo:" + z17);
        if (z17) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257092m = android.os.SystemClock.elapsedRealtime();
        } else {
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257091l = android.os.SystemClock.elapsedRealtime();
        }
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257081b;
        if (z17) {
            str = str + "_long";
        }
        com.p314xaae8f345.mm.vfs.w6.c(path, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257096q = f17;
    }
}
