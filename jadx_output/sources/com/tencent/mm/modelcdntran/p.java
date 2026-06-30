package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public final class p implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.z f71114d;

    public p(com.tencent.mm.modelcdntran.z zVar) {
        this.f71114d = zVar;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.modelcdntran.n1 event = (com.tencent.mm.modelcdntran.n1) obj;
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.String log = "event:" + event.f71103a + " mediaId:" + event.f71104b + " ret:" + event.f71105c;
        com.tencent.mm.modelcdntran.z zVar = this.f71114d;
        zVar.getClass();
        kotlin.jvm.internal.o.g(log, "log");
        v65.i.b(zVar.a7(), null, new com.tencent.mm.modelcdntran.o(event, zVar, null), 1, null);
    }
}
