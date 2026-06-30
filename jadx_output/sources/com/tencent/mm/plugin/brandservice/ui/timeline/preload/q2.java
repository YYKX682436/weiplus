package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class q2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f94413d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f94414e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f94415f;

    /* renamed from: g, reason: collision with root package name */
    public long f94416g;

    /* renamed from: h, reason: collision with root package name */
    public int f94417h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.q83 f94418i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f94419m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r45.o83 f94420n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f94421o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(r45.q83 q83Var, long j17, r45.o83 o83Var, java.util.HashMap hashMap, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f94418i = q83Var;
        this.f94419m = j17;
        this.f94420n = o83Var;
        this.f94421o = hashMap;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.brandservice.ui.timeline.preload.q2(this.f94418i, this.f94419m, this.f94420n, this.f94421o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.brandservice.ui.timeline.preload.q2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x010e, code lost:
    
        if (r7 == null) goto L29;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.brandservice.ui.timeline.preload.q2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
