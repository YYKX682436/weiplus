package cw1;

/* loaded from: classes11.dex */
public final class m7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13124x71d67823 f304705d;

    public m7(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13124x71d67823 activityC13124x71d67823) {
        this.f304705d = activityC13124x71d67823;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13124x71d67823 activityC13124x71d67823 = this.f304705d;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13124x71d67823.f177332h;
        activityC13124x71d67823.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StorageDisableAlertUI", "computeAndShowDialog");
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(cw1.l7.f304656d);
            ((ku5.t0) ku5.t0.f394148d).q(futureTask);
            try {
                java.lang.Object obj = futureTask.get(5L, java.util.concurrent.TimeUnit.SECONDS);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                j17 = ((java.lang.Number) obj).longValue();
            } catch (java.util.concurrent.TimeoutException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StorageDisableAlertUI", "getWechatTotalSize timeout, read from mmkv");
                j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("extreme_storage_wechat_total_webview", -1L);
            }
        } else {
            j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("extreme_storage_wechat_total_webview", -1L);
        }
        if (j17 != -1) {
            fp.r0 r0Var = fp.r0.f346765a;
            double totalBytes = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath()).getTotalBytes();
            if (totalBytes > 0.0d) {
                activityC13124x71d67823.f177333d = (j17 / totalBytes) * 100;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StorageDisableAlertUI", "wechatTotalSize = " + j17 + ", wechatRatio = " + activityC13124x71d67823.f177333d);
        activityC13124x71d67823.runOnUiThread(new cw1.k7(activityC13124x71d67823));
    }
}
