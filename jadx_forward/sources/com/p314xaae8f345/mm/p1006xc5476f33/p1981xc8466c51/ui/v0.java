package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f237027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f237028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f237029f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f237030g;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15 activityC16966x2b279c15, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.app.Dialog dialog) {
        this.f237027d = str;
        this.f237028e = str2;
        this.f237029f = f9Var;
        this.f237030g = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        bt3.g2.M(this.f237027d, this.f237028e, this.f237029f, false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.u0(this));
    }

    /* renamed from: toString */
    public java.lang.String m67878x9616526c() {
        return super.toString() + "|onActivityResult";
    }
}
