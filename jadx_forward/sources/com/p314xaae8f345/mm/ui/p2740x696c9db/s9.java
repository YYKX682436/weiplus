package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes11.dex */
public class s9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f292266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.y9 f292267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f292268f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18 f292269g;

    public s9(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18 activityC22523xb066d18, android.os.Bundle bundle, com.p314xaae8f345.mm.ui.p2740x696c9db.y9 y9Var, long j17) {
        this.f292269g = activityC22523xb066d18;
        this.f292266d = bundle;
        this.f292267e = y9Var;
        this.f292268f = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        char c17;
        java.util.ArrayList arrayList;
        java.util.ArrayList parcelableArrayList = this.f292266d.getParcelableArrayList("android.intent.extra.STREAM");
        com.p314xaae8f345.mm.ui.p2740x696c9db.y9 y9Var = this.f292267e;
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18 activityC22523xb066d18 = this.f292269g;
        if (parcelableArrayList == null || parcelableArrayList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareImgUI", "getParcelableArrayList failed");
            com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18.b7(activityC22523xb066d18, y9Var, null);
            return;
        }
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(parcelableArrayList.size());
        boolean[] zArr = {false};
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
        java.util.Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            android.os.Parcelable parcelable = (android.os.Parcelable) it.next();
            java.lang.String obj = parcelable != null ? parcelable.toString() : "null";
            s75.d.b(new com.p314xaae8f345.mm.ui.p2740x696c9db.r9(this, concurrentLinkedQueue, parcelable, zArr, countDownLatch), "getMultiSendFilePathListItem" + obj);
        }
        try {
            countDownLatch.await();
            arrayList = null;
            c17 = 0;
        } catch (java.lang.InterruptedException e17) {
            c17 = 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShareImgUI", e17, "hy: timeout when getmulti", new java.lang.Object[0]);
            arrayList = null;
            com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18.b7(activityC22523xb066d18, y9Var, null);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(concurrentLinkedQueue);
        if (zArr[c17]) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18.b7(activityC22523xb066d18, y9Var, arrayList);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "hy: getMultiSendFilePathList done. using: %d ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f292268f));
            com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18.b7(activityC22523xb066d18, y9Var, arrayList2.size() > 0 ? arrayList2 : null);
        }
    }
}
