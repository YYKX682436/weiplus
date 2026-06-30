package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class o implements com.tencent.mm.plugin.appbrand.jsapi.media.v1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.media.w1 f81955d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.media.w1 f81956e;

    public o(com.tencent.mm.plugin.appbrand.jsapi.media.w1 ifNotNavigateStrategy, com.tencent.mm.plugin.appbrand.jsapi.media.w1 ifNotOpenNativeStrategy) {
        kotlin.jvm.internal.o.g(ifNotNavigateStrategy, "ifNotNavigateStrategy");
        kotlin.jvm.internal.o.g(ifNotOpenNativeStrategy, "ifNotOpenNativeStrategy");
        this.f81955d = ifNotNavigateStrategy;
        this.f81956e = ifNotOpenNativeStrategy;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.v1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.appbrand.jsapi.media.w1 U2(boolean r4, boolean r5) {
        /*
            r3 = this;
            com.tencent.mm.plugin.appbrand.jsapi.media.i r0 = com.tencent.mm.plugin.appbrand.jsapi.media.i.f81838a
            java.lang.String r1 = "strategy"
            if (r4 != 0) goto L19
            com.tencent.mm.plugin.appbrand.jsapi.media.w1 r4 = r3.f81955d
            kotlin.jvm.internal.o.g(r4, r1)
            boolean r2 = kotlin.jvm.internal.o.b(r0, r4)
            if (r2 == 0) goto L13
            goto L19
        L13:
            com.tencent.mm.plugin.appbrand.jsapi.media.h r2 = new com.tencent.mm.plugin.appbrand.jsapi.media.h
            r2.<init>(r0, r4)
            goto L1a
        L19:
            r2 = r0
        L1a:
            if (r5 != 0) goto L2e
            com.tencent.mm.plugin.appbrand.jsapi.media.w1 r4 = r3.f81956e
            kotlin.jvm.internal.o.g(r4, r1)
            boolean r5 = kotlin.jvm.internal.o.b(r0, r4)
            if (r5 == 0) goto L28
            goto L2e
        L28:
            com.tencent.mm.plugin.appbrand.jsapi.media.h r5 = new com.tencent.mm.plugin.appbrand.jsapi.media.h
            r5.<init>(r2, r4)
            r2 = r5
        L2e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.media.o.U2(boolean, boolean):com.tencent.mm.plugin.appbrand.jsapi.media.w1");
    }

    public /* synthetic */ o(com.tencent.mm.plugin.appbrand.jsapi.media.w1 w1Var, com.tencent.mm.plugin.appbrand.jsapi.media.w1 w1Var2, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? com.tencent.mm.plugin.appbrand.jsapi.media.j.f81856a : w1Var, (i17 & 2) != 0 ? com.tencent.mm.plugin.appbrand.jsapi.media.l.f81908a : w1Var2);
    }
}
