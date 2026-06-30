package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc;

/* loaded from: classes15.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f159965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb f159966e;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb.a aVar, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb abstractC11896x2d96b4fb) {
        this.f159965d = rVar;
        this.f159966e = abstractC11896x2d96b4fb;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f159965d;
        if (rVar == null) {
            return;
        }
        rVar.a(this.f159966e);
    }
}
