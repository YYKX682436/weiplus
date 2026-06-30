package co5;

@j95.b
/* loaded from: classes11.dex */
public final class p extends i95.w implements jp5.n {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f43877d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f43878e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f43879f = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c);

    /* renamed from: g, reason: collision with root package name */
    public final boolean f43880g;

    public p() {
        this.f43880g = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ilink_voip.RepairerConfigILinkVoIPInviteFail()) == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r11 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object wi(co5.p r9, java.lang.String r10, kotlin.coroutines.Continuation r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof co5.n
            if (r0 == 0) goto L16
            r0 = r11
            co5.n r0 = (co5.n) r0
            int r1 = r0.f43873h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f43873h = r1
            goto L1b
        L16:
            co5.n r0 = new co5.n
            r0.<init>(r9, r11)
        L1b:
            java.lang.Object r11 = r0.f43871f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f43873h
            java.lang.String r3 = "MicroMsg.ILinkVoIP.SdkModeHelper"
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r9 = r0.f43870e
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r0.f43869d
            co5.p r9 = (co5.p) r9
            kotlin.ResultKt.throwOnFailure(r11)
            goto L60
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r2 = "loadInfoImpl() called with: username = "
            r11.<init>(r2)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            com.tencent.mars.xlog.Log.i(r3, r11)
            co5.b r11 = co5.b.f43810a
            r0.f43869d = r9
            r0.f43870e = r10
            r0.f43873h = r4
            java.lang.Object r11 = r11.a(r10, r0)
            if (r11 != r1) goto L60
            goto Lbc
        L60:
            r45.b17 r11 = (r45.b17) r11
            jz5.f0 r1 = jz5.f0.f302826a
            r0 = 0
            if (r11 == 0) goto L95
            co5.j r2 = new co5.j
            int r5 = r11.f370432d
            r6 = 2
            if (r5 != r6) goto L6f
            goto L70
        L6f:
            r4 = r0
        L70:
            int r11 = r11.f370433e
            int r11 = r11 * 1000
            long r5 = (long) r11
            long r7 = java.lang.System.currentTimeMillis()
            long r5 = r5 + r7
            r2.<init>(r10, r4, r5)
            java.util.concurrent.ConcurrentHashMap r11 = r9.f43877d
            r11.put(r10, r2)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r4 = "loadInfoImpl: get "
            r11.<init>(r4)
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            com.tencent.mars.xlog.Log.i(r3, r11)
            r11 = r1
            goto L96
        L95:
            r11 = 0
        L96:
            if (r11 != 0) goto Lbc
            co5.j r11 = new co5.j
            r2 = 600000(0x927c0, float:8.40779E-40)
            long r4 = (long) r2
            long r6 = java.lang.System.currentTimeMillis()
            long r4 = r4 + r6
            r11.<init>(r10, r0, r4)
            java.util.concurrent.ConcurrentHashMap r9 = r9.f43877d
            r9.put(r10, r11)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "loadInfoImpl: get sdk mode cgi error, default old. set "
            r9.<init>(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            com.tencent.mars.xlog.Log.e(r3, r9)
        Lbc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: co5.p.wi(co5.p, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Ai(java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof co5.k
            if (r0 == 0) goto L13
            r0 = r7
            co5.k r0 = (co5.k) r0
            int r1 = r0.f43852g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43852g = r1
            goto L18
        L13:
            co5.k r0 = new co5.k
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f43850e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f43852g
            java.lang.String r3 = "MicroMsg.ILinkVoIP.SdkModeHelper"
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r6 = r0.f43849d
            co5.p r6 = (co5.p) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L58
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.throwOnFailure(r7)
            boolean r7 = r5.getEnable()
            if (r7 != 0) goto L46
            java.lang.String r6 = "getIsILinkMode: not enable"
            com.tencent.mars.xlog.Log.i(r3, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L46:
            co5.j r7 = r5.Di(r6)
            if (r7 != 0) goto L5b
            r0.f43849d = r5
            r0.f43852g = r4
            java.lang.Object r7 = r5.Bi(r6, r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            r6 = r5
        L58:
            co5.j r7 = (co5.j) r7
            goto L5c
        L5b:
            r6 = r5
        L5c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getIsILinkMode: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r1 = ", fakeInviteFail "
            r0.append(r1)
            boolean r1 = r6.f43880g
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r3, r0)
            boolean r6 = r6.f43880g
            if (r6 != 0) goto L86
            r6 = 0
            if (r7 == 0) goto L81
            boolean r7 = r7.f43843b
            goto L82
        L81:
            r7 = r6
        L82:
            if (r7 == 0) goto L85
            goto L86
        L85:
            r4 = r6
        L86:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co5.p.Ai(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r2 == null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Bi(java.lang.String r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof co5.l
            if (r0 == 0) goto L13
            r0 = r13
            co5.l r0 = (co5.l) r0
            int r1 = r0.f43861h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43861h = r1
            goto L18
        L13:
            co5.l r0 = new co5.l
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f43859f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f43861h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r12 = r0.f43858e
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r0 = r0.f43857d
            co5.p r0 = (co5.p) r0
            kotlin.ResultKt.throwOnFailure(r13)
            goto L6f
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            kotlin.ResultKt.throwOnFailure(r13)
            java.util.concurrent.ConcurrentHashMap r13 = r11.f43878e
            java.lang.Object r2 = r13.get(r12)
            kotlinx.coroutines.r2 r2 = (kotlinx.coroutines.r2) r2
            r4 = 0
            if (r2 == 0) goto L4f
            boolean r5 = r2.a()
            if (r5 == 0) goto L4c
            goto L4d
        L4c:
            r2 = r4
        L4d:
            if (r2 != 0) goto L61
        L4f:
            kotlinx.coroutines.y0 r5 = r11.f43879f
            r6 = 0
            r7 = 0
            co5.m r8 = new co5.m
            r8.<init>(r11, r12, r4)
            r9 = 3
            r10 = 0
            kotlinx.coroutines.r2 r2 = kotlinx.coroutines.l.d(r5, r6, r7, r8, r9, r10)
            r13.put(r12, r2)
        L61:
            r0.f43857d = r11
            r0.f43858e = r12
            r0.f43861h = r3
            java.lang.Object r13 = r2.C(r0)
            if (r13 != r1) goto L6e
            return r1
        L6e:
            r0 = r11
        L6f:
            java.util.concurrent.ConcurrentHashMap r13 = r0.f43877d
            java.lang.Object r12 = r13.get(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: co5.p.Bi(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final co5.j Di(java.lang.String str) {
        co5.j jVar = (co5.j) this.f43877d.get(str);
        if (jVar != null) {
            if (jVar.f43844c > java.lang.System.currentTimeMillis()) {
                return jVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ni(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = "username"
            kotlin.jvm.internal.o.g(r11, r0)
            boolean r0 = r10.getEnable()
            if (r0 != 0) goto Ld
            return
        Ld:
            java.lang.String r0 = "preloadMode() called with: username = "
            java.lang.String r0 = r0.concat(r11)
            java.lang.String r1 = "MicroMsg.ILinkVoIP.SdkModeHelper"
            com.tencent.mars.xlog.Log.i(r1, r0)
            java.lang.Class<f50.y> r0 = f50.y.class
            i95.m r0 = i95.n0.c(r0)
            f50.y r0 = (f50.y) r0
            e50.z0 r0 = (e50.z0) r0
            r0.Zi()
            co5.j r0 = r10.Di(r11)
            if (r0 != 0) goto L5d
            java.util.concurrent.ConcurrentHashMap r0 = r10.f43878e
            java.lang.Object r2 = r0.get(r11)
            kotlinx.coroutines.r2 r2 = (kotlinx.coroutines.r2) r2
            r3 = 0
            if (r2 == 0) goto L48
            boolean r4 = r2.a()
            if (r4 == 0) goto L3d
            goto L3e
        L3d:
            r2 = r3
        L3e:
            if (r2 == 0) goto L48
            java.lang.String r2 = "preloadMode: already loading, skip req"
            com.tencent.mars.xlog.Log.i(r1, r2)
            jz5.f0 r1 = jz5.f0.f302826a
            goto L49
        L48:
            r1 = r3
        L49:
            if (r1 != 0) goto L5d
            kotlinx.coroutines.y0 r4 = r10.f43879f
            r5 = 0
            r6 = 0
            co5.o r7 = new co5.o
            r7.<init>(r10, r11, r3)
            r8 = 3
            r9 = 0
            kotlinx.coroutines.r2 r1 = kotlinx.coroutines.l.d(r4, r5, r6, r7, r8, r9)
            r0.put(r11, r1)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: co5.p.Ni(java.lang.String):void");
    }

    public final boolean getEnable() {
        int h17 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ilink_voip.RepairerConfigILinkVoIPEnable());
        if (h17 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.SdkModeHelper", "switch: repairer disable");
            return false;
        }
        if (h17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.SdkModeHelper", "switch: repairer enable");
            return true;
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_ilink_voip_enable, false);
    }
}
