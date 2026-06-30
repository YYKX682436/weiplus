package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes7.dex */
public class s0 implements com.tencent.mm.sdk.platformtools.h5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j1 f96085a;

    public s0(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j1 j1Var) {
        this.f96085a = j1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.h5
    public void a(int i17) {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j1 j1Var = this.f96085a;
        if (i17 == 0) {
            j1Var.f95926b.m(new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r0(this));
        } else {
            if (i17 != 2) {
                return;
            }
            j1Var.f95926b.m(new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.q0(this));
        }
    }
}
