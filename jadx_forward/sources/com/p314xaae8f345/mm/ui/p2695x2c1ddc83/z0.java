package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class z0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f289815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f289816e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f289817f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289818g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.l4 f289819h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f289820i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f289821m;

    public z0(android.app.ProgressDialog progressDialog, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, java.lang.Runnable runnable, boolean z17) {
        this.f289815d = progressDialog;
        this.f289816e = c19762x487075a;
        this.f289817f = context;
        this.f289818g = str;
        this.f289819h = l4Var;
        this.f289820i = runnable;
        this.f289821m = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.app.ProgressDialog progressDialog = this.f289815d;
        progressDialog.show();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = this.f289816e;
        c19762x487075a.f38859x6ac9171 = false;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = this.f289819h;
        android.content.Context context = this.f289817f;
        java.lang.String str = this.f289818g;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t1.d(context, str, l4Var, c19762x487075a, progressDialog, true);
        java.lang.Runnable runnable = this.f289820i;
        if (runnable != null) {
            runnable.run();
        }
        if (this.f289821m) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14553, 0, 3, str);
        }
    }
}
