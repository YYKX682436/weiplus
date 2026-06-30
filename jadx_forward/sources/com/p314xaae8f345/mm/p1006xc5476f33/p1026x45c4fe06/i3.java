package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class i3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f3, im5.a {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f159862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f159863e;

    public i3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m2 m2Var) {
        this.f159863e = c11510xdd90c2f2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntime_$_RuntimePrepareAllDoneInitNotify", "<init> appId[%s] hash[%d]", c11510xdd90c2f2.f156336n, java.lang.Integer.valueOf(hashCode()));
        c11510xdd90c2f2.mo46316x322b85(this);
        this.f159862d = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f3
    public void a() {
        if (this.f159862d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntime_$_RuntimePrepareAllDoneInitNotify", "PrepareAllDoneInitNotify.done() hash[%d] check1 dead appId[%s]", java.lang.Integer.valueOf(hashCode()), this.f159863e.f156336n);
            return;
        }
        this.f159863e.K("RuntimePrepareAllDoneInitNotify enqueue", new java.lang.Object[0]);
        sj1.l.i(this.f159863e.f156338p.f158811d, "internal:prepare", "小程序资源准备完成");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.h3 h3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.h3(this);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f159863e;
            c11510xdd90c2f2.f156332h.mo50278x2f39f4(c11510xdd90c2f2.f156333i, "AppBrandRuntimeProfile|dump mUiHandler");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntime_$_RuntimePrepareAllDoneInitNotify", "dumpUiThreadInQueueMessages get exception:%s", th6);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntime", "AppBrandRuntimeProfile|dump main thread stacktrace tid  " + android.os.Looper.getMainLooper().getThread().getId());
        for (java.lang.StackTraceElement stackTraceElement : android.os.Looper.getMainLooper().getThread().getStackTrace()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11518xd10e8bb6) this.f159863e.f156333i).println("AppBrandRuntimeProfile|dump main thread stacktrace    " + stackTraceElement.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ff ffVar = this.f159863e.f156332h;
        android.os.Handler handler = ffVar.f159587b;
        if (handler != null) {
            handler.postAtFrontOfQueue(h3Var);
        } else {
            ffVar.f159586a.mo50294x9395cba4(h3Var);
        }
        this.f159863e.n2(this);
    }

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        this.f159862d = true;
    }
}
