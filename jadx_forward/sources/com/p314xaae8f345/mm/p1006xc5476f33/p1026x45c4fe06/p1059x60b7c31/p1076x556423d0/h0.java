package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0;

/* loaded from: classes7.dex */
public final class h0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f161769a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f161770b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.i0 f161771c;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.i0 i0Var) {
        this.f161769a = lVar;
        this.f161770b = i17;
        this.f161771c = i0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        java.lang.String p17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12060xecaa71d5 c12060xecaa71d5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12060xecaa71d5) abstractC11888x1a859600;
        if (c12060xecaa71d5 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiReserveChannelsLive", "onReceiveResult#IProcessResultReceiver, result is null");
            return;
        }
        boolean z17 = c12060xecaa71d5.f161755d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.i0 i0Var = this.f161771c;
        int i17 = c12060xecaa71d5.f161756e;
        if (z17) {
            p17 = i0Var.p("ok", kz5.c1.i(new jz5.l("state", java.lang.Integer.valueOf(i17))));
        } else {
            java.lang.String format = java.lang.String.format("fail:pre check fail, errCode=%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            p17 = i0Var.p(format, kz5.c1.i(new jz5.l("state", 0)));
        }
        this.f161769a.a(this.f161770b, p17);
    }
}
