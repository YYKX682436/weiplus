package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class a9 extends com.tencent.matrix.lifecycle.g {
    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        com.tencent.mm.plugin.appbrand.utils.d5.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.z8
            /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
            
                if (r2.n(r1) == true) goto L14;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r4 = this;
                    com.tencent.mm.plugin.appbrand.a9 r0 = com.tencent.mm.plugin.appbrand.a9.this
                    r0.getClass()
                    java.util.concurrent.ConcurrentHashMap r0 = com.tencent.mm.plugin.appbrand.v1.f90640a
                    boolean r1 = r0.isEmpty()
                    if (r1 == 0) goto Le
                    goto L44
                Le:
                    java.lang.String r1 = "MicroMsg.AppBrandRuntimeWidgetImpl"
                    java.lang.String r2 = "doRecycleStashedRuntimes for mm process"
                    com.tencent.mars.xlog.Log.i(r1, r2)
                    java.util.LinkedList r1 = new java.util.LinkedList
                    java.util.Collection r0 = r0.values()
                    r1.<init>(r0)
                    java.util.Iterator r0 = r1.iterator()
                L22:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L44
                    java.lang.Object r1 = r0.next()
                    com.tencent.mm.plugin.appbrand.o6 r1 = (com.tencent.mm.plugin.appbrand.o6) r1
                    kotlin.jvm.internal.o.d(r1)
                    com.tencent.mm.plugin.appbrand.hc r2 = r1.f74796e
                    if (r2 == 0) goto L3d
                    boolean r2 = r2.n(r1)
                    r3 = 1
                    if (r2 != r3) goto L3d
                    goto L3e
                L3d:
                    r3 = 0
                L3e:
                    if (r3 != 0) goto L22
                    r1.K2()
                    goto L22
                L44:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.z8.run():void");
            }
        });
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
    }
}
