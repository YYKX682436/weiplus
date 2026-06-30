package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes7.dex */
public class j1 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.h5 f95925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f95926b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var, android.os.Looper looper) {
        super(looper);
        this.f95926b = p0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message.what == 272 && this.f95925a == null) {
            this.f95925a = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.s0(this);
            ((com.tencent.mm.sdk.platformtools.l5) i95.n0.c(com.tencent.mm.sdk.platformtools.l5.class)).wi(this.f95925a);
        }
    }
}
