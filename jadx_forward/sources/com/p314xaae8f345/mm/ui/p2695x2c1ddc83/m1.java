package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class m1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f289391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289392e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f289393f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f289394g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f289395h;

    public m1(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, android.app.ProgressDialog progressDialog, java.lang.Runnable runnable) {
        this.f289391d = context;
        this.f289392e = str;
        this.f289393f = c19762x487075a;
        this.f289394g = progressDialog;
        this.f289395h = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t1.b(this.f289391d, this.f289392e, this.f289393f, this.f289394g, true);
        java.lang.Runnable runnable = this.f289395h;
        if (runnable != null) {
            runnable.run();
        }
    }
}
