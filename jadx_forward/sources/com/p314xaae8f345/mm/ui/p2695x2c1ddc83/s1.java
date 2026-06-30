package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class s1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f289589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289590e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f289591f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f289592g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289593h;

    public s1(java.lang.Runnable runnable, java.lang.String str, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, android.app.ProgressDialog progressDialog, java.lang.String str2) {
        this.f289589d = runnable;
        this.f289590e = str;
        this.f289591f = c19762x487075a;
        this.f289592g = progressDialog;
        this.f289593h = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f289589d.run();
        c01.w9.h(this.f289590e, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.r1(this));
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.p314xaae8f345.mm.p957x53236a1b.g1.I(this.f289593h, 15);
    }
}
