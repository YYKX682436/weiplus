package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes9.dex */
public class a6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.gp0 f181992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f181993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181994f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f181995g;

    public a6(r45.gp0 gp0Var, android.content.Context context, java.lang.String str, java.lang.Runnable runnable) {
        this.f181992d = gp0Var;
        this.f181993e = context;
        this.f181994f = str;
        this.f181995g = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.gp0 gp0Var = this.f181992d;
        int i17 = gp0Var.I;
        java.lang.String str = this.f181994f;
        android.content.Context context = this.f181993e;
        if (i17 == 15) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.a(context, str, gp0Var);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.b(context, str, gp0Var);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(this.f181995g);
    }

    /* renamed from: toString */
    public java.lang.String m55322x9616526c() {
        return super.toString() + "|sendFavVideo";
    }
}
