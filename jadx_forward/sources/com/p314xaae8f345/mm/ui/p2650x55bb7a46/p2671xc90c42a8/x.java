package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class x implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f284057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f284058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f284059f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y f284060g;

    public x(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y yVar, int i17, java.util.Set set, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f284060g = yVar;
        this.f284057d = i17;
        this.f284058e = set;
        this.f284059f = f9Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseHistoryListPresenter", "delete message");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y yVar = this.f284060g;
        de5.a.f310929a.k(19, this.f284057d, yVar.k());
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.i3.a(yVar.f284074d, this.f284058e, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.w(this));
    }
}
