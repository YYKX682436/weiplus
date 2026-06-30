package dk5;

/* loaded from: classes9.dex */
public class g5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f316171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk5.r5 f316172e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 f316173f;

    public g5(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99, java.util.List list, dk5.r5 r5Var) {
        this.f316173f = activityC22573x19a79d99;
        this.f316171d = list;
        this.f316172e = r5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.HashMap hashMap = new java.util.HashMap();
        int i17 = 0;
        while (true) {
            java.util.List list = this.f316171d;
            int size = list.size();
            com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99 = this.f316173f;
            if (i17 >= size) {
                activityC22573x19a79d99.runOnUiThread(new dk5.f5(this, hashMap));
                return;
            }
            dk5.p5 p5Var = (dk5.p5) list.get(i17);
            if (p5Var != null) {
                ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
                java.lang.String str = p5Var.f316334b;
                if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.e(str) && str.startsWith("content")) {
                    zo3.p.wi();
                    java.lang.String str2 = zo3.p.Ai() + "content_" + java.lang.System.currentTimeMillis();
                    long d17 = com.p314xaae8f345.mm.vfs.w6.d(str, str2, false);
                    if (d17 <= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendAppMessageWrapperUI", "run: doCheckAndCopyFile copy file fail");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMessageWrapperUI", "doCheckAndCopyFile:ret:%s localFilePath:%s filePath:%s ", java.lang.Long.valueOf(d17), str2, str);
                        hashMap.put(p5Var.f316333a, new dk5.q5(activityC22573x19a79d99, str2, str));
                    }
                }
            }
            i17++;
        }
    }
}
