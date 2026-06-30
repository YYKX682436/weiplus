package cw1;

/* loaded from: classes3.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 f304890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f304891e;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 activityC13107x4291ddb8, long j17) {
        this.f304890d = activityC13107x4291ddb8;
        this.f304891e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 activityC13107x4291ddb8 = this.f304890d;
        cw1.m mVar = activityC13107x4291ddb8.f177182f;
        if (mVar != null) {
            java.lang.String string = activityC13107x4291ddb8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nhx, fp.n0.a(this.f304891e));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            mVar.a(string);
        }
    }
}
