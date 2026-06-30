package com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566;

/* loaded from: classes8.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c f290119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 f290121f;

    public z0(com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c c10750x9556b48c, android.content.Context context, com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var) {
        this.f290119d = c10750x9556b48c;
        this.f290120e = context;
        this.f290121f = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f290119d.f149933d;
        android.content.Context context = this.f290120e;
        if (!z17) {
            dp.a.m125854x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572718ng2), 1).show();
            return;
        }
        dp.a.m125854x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c9o), 1).show();
        com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var = this.f290121f;
        qj5.n nVar = j1Var.f290033f;
        if (nVar != null) {
            nVar.u();
        }
        j1Var.f290033f = null;
    }
}
