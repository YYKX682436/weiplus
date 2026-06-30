package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f103522d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f103523e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f103524f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f103525g;

    /* renamed from: h, reason: collision with root package name */
    public int f103526h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f103527i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f103528m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f103529n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f103530o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.n f103531p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103532q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(kotlin.jvm.internal.f0 f0Var, java.lang.String str, kotlin.jvm.internal.f0 f0Var2, com.tencent.mm.plugin.finder.convert.n nVar, in5.s0 s0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f103528m = f0Var;
        this.f103529n = str;
        this.f103530o = f0Var2;
        this.f103531p = nVar;
        this.f103532q = s0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.convert.h hVar = new com.tencent.mm.plugin.finder.convert.h(this.f103528m, this.f103529n, this.f103530o, this.f103531p, this.f103532q, continuation);
        hVar.f103527i = obj;
        return hVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.convert.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x03e5 -> B:6:0x03e6). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instructions count: 1005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
