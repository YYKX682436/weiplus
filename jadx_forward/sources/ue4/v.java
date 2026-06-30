package ue4;

/* loaded from: classes12.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f508460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f508461e;

    public v(ue4.w wVar, android.app.Activity activity, java.lang.String str) {
        this.f508460d = activity;
        this.f508461e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        db5.d5 d5Var = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.f253306a;
        if ((d5Var == null || !d5Var.isShowing()) && com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253359a.a("KEY_SHOW_NOT_SUPPORT_DEVICE_STEP_TIPS", 1L) != 0 && c01.z1.r().equals(this.f508461e)) {
            ve4.e eVar = (ve4.e) i95.n0.c(ve4.e.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            ((ue4.w) eVar).getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.a(context)) {
                return;
            }
            android.app.Activity activity = this.f508460d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.f253306a = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y3.a(activity, 1, com.p314xaae8f345.mm.R.raw.f79770xc84f57c6, activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jji), com.p314xaae8f345.mm.R.raw.f80051x8e8c33a0, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.b0());
        }
    }
}
