package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes12.dex */
public final class z2 implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 f148112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f148113b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f148114c;

    public z2(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 c4Var, yz5.l lVar, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4) {
        this.f148112a = c4Var;
        this.f148113b = lVar;
        this.f148114c = c21053xdbf1e5f4;
    }

    @Override // dr.q
    public void a(boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9 v9Var;
        yz5.l lVar = this.f148113b;
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 c4Var = this.f148112a;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c4Var.f147740d, "Emoticon loadFile failed.");
            lVar.mo146xb9724478(-1);
            return;
        }
        y75.d dVar = y75.a.f541319a;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = this.f148114c;
        if (dVar != null && (v9Var = dVar.f402101d) != null) {
            v9Var.b(c21053xdbf1e5f4);
        }
        lVar.mo146xb9724478(0);
        new qr.x(c21053xdbf1e5f4, new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.y2(c4Var, c21053xdbf1e5f4));
    }
}
