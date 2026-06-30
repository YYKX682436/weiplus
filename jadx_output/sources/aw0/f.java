package aw0;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final du0.t0 f14479a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f14480b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.j0 f14481c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.g0 f14482d;

    public f(du0.t0 materialService) {
        kotlin.jvm.internal.o.g(materialService, "materialService");
        this.f14479a = materialService;
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f14480b = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0(new zu0.h(new vv0.c(null, null, null, 7, null)));
        this.f14481c = j0Var;
        this.f14482d = androidx.lifecycle.b1.a(j0Var, new aw0.e());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(aw0.f r11, vv0.b r12, kotlin.coroutines.Continuation r13) {
        /*
            r11.getClass()
            boolean r0 = r13 instanceof aw0.b
            if (r0 == 0) goto L16
            r0 = r13
            aw0.b r0 = (aw0.b) r0
            int r1 = r0.f14471h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f14471h = r1
            goto L1b
        L16:
            aw0.b r0 = new aw0.b
            r0.<init>(r11, r13)
        L1b:
            java.lang.Object r13 = r0.f14469f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f14471h
            r3 = 1
            r4 = 5
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r11 = r0.f14468e
            r12 = r11
            vv0.b r12 = (vv0.b) r12
            java.lang.Object r11 = r0.f14467d
            aw0.f r11 = (aw0.f) r11
            kotlin.ResultKt.throwOnFailure(r13)
            goto L77
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3c:
            kotlin.ResultKt.throwOnFailure(r13)
            r0.f14467d = r11
            r0.f14468e = r12
            r0.f14471h = r3
            java.lang.String r13 = "<this>"
            kotlin.jvm.internal.o.g(r12, r13)
            com.tencent.maas.material.g[] r13 = com.tencent.maas.material.g.values()
            int r2 = r13.length
            r5 = 0
            r6 = r5
        L51:
            r7 = 0
            if (r6 >= r2) goto L63
            r8 = r13[r6]
            int r9 = r8.f48248d
            if (r9 != r4) goto L5c
            r9 = r3
            goto L5d
        L5c:
            r9 = r5
        L5d:
            if (r9 == 0) goto L60
            goto L64
        L60:
            int r6 = r6 + 1
            goto L51
        L63:
            r8 = r7
        L64:
            if (r8 != 0) goto L67
            goto L6c
        L67:
            r13 = -1
            int r2 = r8.f48248d
            if (r13 != r2) goto L6e
        L6c:
            r13 = r7
            goto L74
        L6e:
            du0.t0 r13 = r11.f14479a
            java.lang.Object r13 = r13.R6(r2, r0)
        L74:
            if (r13 != r1) goto L77
            goto L95
        L77:
            r6 = r13
            com.tencent.maas.material.MJMaterialPack r6 = (com.tencent.maas.material.MJMaterialPack) r6
            zu0.k r1 = new zu0.k
            r12.getClass()
            r11.b(r12)
            vv0.c r11 = new vv0.c
            r7 = 0
            vv0.g r8 = vv0.g.f440379a
            r9 = 2
            r10 = 0
            r5 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            zu0.h r12 = new zu0.h
            r12.<init>(r11)
            r1.<init>(r4, r12)
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: aw0.f.a(aw0.f, vv0.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final zu0.h b(vv0.b bVar) {
        if (aw0.a.f14466a[bVar.ordinal()] != 1) {
            throw new jz5.j();
        }
        zu0.h hVar = (zu0.h) this.f14481c.getValue();
        return hVar == null ? new zu0.h(new vv0.c(null, null, null, 7, null)) : hVar;
    }

    public final void c(vv0.b scene, java.util.concurrent.ConcurrentHashMap initFilterInfoMap) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(initFilterInfoMap, "initFilterInfoMap");
        this.f14481c.setValue(new zu0.h(vv0.c.a((vv0.c) b(scene).f475673a, null, null, new vv0.f(initFilterInfoMap), 3, null)));
    }
}
