package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes7.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f264753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2 f264755f;

    public z1(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2 l2Var) {
        this.f264753d = context;
        this.f264754e = str;
        this.f264755f = l2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f264753d;
        if (context == null || !(context instanceof android.app.Activity) || ((android.app.Activity) context).isFinishing()) {
            return;
        }
        db5.e1.t(context, this.f264754e, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8b), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y1(this));
    }
}
