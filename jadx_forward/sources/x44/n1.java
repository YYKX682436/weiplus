package x44;

/* loaded from: classes4.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f533397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x44.o1 f533398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f533399f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vz.s1 f533400g;

    public n1(android.app.Activity activity, x44.o1 o1Var, long j17, vz.s1 s1Var) {
        this.f533397d = activity;
        this.f533398e = o1Var;
        this.f533399f = j17;
        this.f533400g = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask$resumeTask$1");
        android.app.Activity activity = this.f533397d;
        java.lang.String string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5x);
        android.app.Activity activity2 = this.f533397d;
        java.lang.String string2 = activity2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5y);
        java.lang.String string3 = activity2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5q);
        java.lang.String string4 = activity2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
        long j17 = this.f533399f;
        vz.s1 s1Var = this.f533400g;
        x44.o1 o1Var = this.f533398e;
        db5.e1.D(activity, string, string2, string3, string4, false, new x44.l1(o1Var, j17, s1Var), new x44.m1(o1Var), com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask$resumeTask$1");
    }
}
