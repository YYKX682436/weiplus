package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes14.dex */
public final class h2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f65450d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f65451e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f65452f;

    /* renamed from: g, reason: collision with root package name */
    public int f65453g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.k2 f65454h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f65455i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(com.tencent.mm.feature.chatrecordstts.k2 k2Var, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f65454h = k2Var;
        this.f65455i = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.feature.chatrecordstts.h2(this.f65454h, this.f65455i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.feature.chatrecordstts.h2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e8 A[Catch: all -> 0x00f2, TRY_LEAVE, TryCatch #2 {all -> 0x00f2, blocks: (B:20:0x00dc, B:25:0x00e8), top: B:19:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090 A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #0 {all -> 0x00a0, blocks: (B:54:0x0084, B:56:0x0090), top: B:53:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0083  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.chatrecordstts.h2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
