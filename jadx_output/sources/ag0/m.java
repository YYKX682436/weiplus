package ag0;

@j95.b
/* loaded from: classes10.dex */
public class m extends i95.w implements bg0.u {
    public void Ai(boolean z17) {
        com.tencent.mm.plugin.vlog.model.b0 b0Var = com.tencent.mm.plugin.vlog.model.b0.f175547a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderVideoShell", "markStartRemux, isLongVideo:" + z17);
        if (z17) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.plugin.vlog.model.b0.f175561o = android.os.SystemClock.elapsedRealtime();
        } else {
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.plugin.vlog.model.b0.f175560n = android.os.SystemClock.elapsedRealtime();
        }
    }

    public void Bi() {
        com.tencent.mm.plugin.vlog.model.b0 b0Var = com.tencent.mm.plugin.vlog.model.b0.f175547a;
        if (!b0Var.a()) {
            b0Var.b();
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        long j17 = com.tencent.mm.plugin.vlog.model.b0.f175553g;
        long j18 = 0;
        jSONObject2.put("stage_1", j17 > 0 ? j17 - com.tencent.mm.plugin.vlog.model.b0.f175552f : 0L);
        jSONObject2.put("stage_2", com.tencent.mm.plugin.vlog.model.b0.f175554h - com.tencent.mm.plugin.vlog.model.b0.f175552f);
        long j19 = com.tencent.mm.plugin.vlog.model.b0.f175556j;
        if (j19 > 0) {
            long j27 = com.tencent.mm.plugin.vlog.model.b0.f175555i;
            if (j27 > 0) {
                j18 = j19 - j27;
            }
        }
        jSONObject2.put("stage_3", j18);
        jSONObject2.put("stage_4", com.tencent.mm.plugin.vlog.model.b0.f175558l - com.tencent.mm.plugin.vlog.model.b0.f175560n);
        jSONObject2.put("stage_5", com.tencent.mm.plugin.vlog.model.b0.f175559m - com.tencent.mm.plugin.vlog.model.b0.f175561o);
        jSONObject2.put("stage_6", com.tencent.mm.plugin.vlog.model.b0.f175562p);
        jSONObject.put("time_cost", jSONObject2);
        jSONObject.put("quality_score", java.lang.Float.valueOf(com.tencent.mm.plugin.vlog.model.b0.f175563q));
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderVideoShell", "reportVideoResult:" + jSONObject + ", path:" + com.tencent.mm.plugin.vlog.model.b0.f175549c);
        boolean z17 = true;
        if (com.tencent.mm.plugin.vlog.model.b0.f175549c.length() > 0) {
            com.tencent.mm.vfs.w6.u(new java.io.File(com.tencent.mm.plugin.vlog.model.b0.f175549c).getParentFile().getAbsolutePath());
            java.lang.String str = com.tencent.mm.plugin.vlog.model.b0.f175549c;
            java.lang.String jSONObject3 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            byte[] bytes = jSONObject3.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            com.tencent.mm.vfs.w6.S(str, bytes, 0, bytes.length);
        } else {
            z17 = false;
        }
        android.content.Intent intent = new android.content.Intent("wechat.shell.FINDER_VIDEO_TEST_FINISH");
        intent.putExtra(ya.b.SUCCESS, z17);
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
    }

    public void wi(java.lang.String path, float f17, boolean z17) {
        com.tencent.mm.plugin.vlog.model.b0 b0Var = com.tencent.mm.plugin.vlog.model.b0.f175547a;
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderVideoShell", "markRemuxFinish, qualityScore:" + f17 + ", path:" + path + ", isLongVideo:" + z17);
        if (z17) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.plugin.vlog.model.b0.f175559m = android.os.SystemClock.elapsedRealtime();
        } else {
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.plugin.vlog.model.b0.f175558l = android.os.SystemClock.elapsedRealtime();
        }
        java.lang.String str = com.tencent.mm.plugin.vlog.model.b0.f175548b;
        if (z17) {
            str = str + "_long";
        }
        com.tencent.mm.vfs.w6.c(path, str);
        com.tencent.mm.plugin.vlog.model.b0.f175563q = f17;
    }
}
