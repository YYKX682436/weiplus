package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class l1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f289353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f289354e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f289355f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289356g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f289357h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f289358i;

    public l1(android.app.ProgressDialog progressDialog, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, android.content.Context context, java.lang.String str, boolean z17, java.lang.Runnable runnable) {
        this.f289353d = progressDialog;
        this.f289354e = c19762x487075a;
        this.f289355f = context;
        this.f289356g = str;
        this.f289357h = z17;
        this.f289358i = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.app.ProgressDialog progressDialog = this.f289353d;
        progressDialog.show();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = this.f289354e;
        c19762x487075a.f38859x6ac9171 = false;
        android.content.Context context = this.f289355f;
        java.lang.String str = this.f289356g;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t1.b(context, str, c19762x487075a, progressDialog, true);
        if (this.f289357h) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14553, 1, 3, str);
        }
        java.lang.Runnable runnable = this.f289358i;
        if (runnable != null) {
            runnable.run();
        }
    }
}
