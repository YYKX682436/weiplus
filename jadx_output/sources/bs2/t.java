package bs2;

/* loaded from: classes2.dex */
public final class t extends bs2.n1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore core) {
        super(4, core);
        kotlin.jvm.internal.o.g(core, "core");
    }

    @Override // bs2.n1
    public bs2.h0 g() {
        return bs2.h0.f23850m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if ((c01.id.c() - r5.f23810f) >= r4.P6(r3, false)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        if ((c01.id.c() - r5.f23810f) >= r4.Q6(r3, r12 == bs2.h0.f23846f, r5.f23806b != null)) goto L19;
     */
    @Override // bs2.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m(bs2.h0 r12, db2.c3 r13) {
        /*
            r11 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.o.g(r12, r0)
            java.lang.String r0 = "resp"
            kotlin.jvm.internal.o.g(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isAcceptCgiBack: source="
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r1 = ", refreshPrefetchStatus="
            r0.append(r1)
            int r1 = r12.f23857e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r11.f23909c
            com.tencent.mars.xlog.Log.i(r1, r0)
            bs2.h0 r0 = bs2.h0.f23851n
            r2 = 1
            if (r12 != r0) goto L32
            java.lang.String r12 = "[isAcceptCgiBack] is finder enter load."
            com.tencent.mars.xlog.Log.i(r1, r12)
            return r2
        L32:
            int r0 = r12.f23857e
            r3 = 2
            if (r0 != r3) goto L38
            return r2
        L38:
            bs2.h0 r0 = bs2.h0.f23854q
            if (r12 != r0) goto L3d
            return r2
        L3d:
            bs2.h0 r0 = bs2.h0.f23850m
            int r3 = r11.f23907a
            com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore r4 = r11.f23908b
            bs2.b0 r5 = r11.f23925s
            r6 = 0
            if (r12 == r0) goto L60
            bs2.h0 r0 = bs2.h0.f23846f
            if (r12 != r0) goto L4d
            goto L60
        L4d:
            long r7 = c01.id.c()
            long r9 = r5.f23810f
            long r7 = r7 - r9
            long r3 = r4.P6(r3, r6)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L5e
        L5c:
            r0 = r2
            goto L7e
        L5e:
            r0 = r6
            goto L7e
        L60:
            bs2.h0 r0 = bs2.h0.f23846f
            if (r12 != r0) goto L66
            r0 = r2
            goto L67
        L66:
            r0 = r6
        L67:
            db2.c3 r7 = r5.f23806b
            if (r7 == 0) goto L6d
            r7 = r2
            goto L6e
        L6d:
            r7 = r6
        L6e:
            long r3 = r4.Q6(r3, r0, r7)
            long r7 = c01.id.c()
            long r9 = r5.f23810f
            long r7 = r7 - r9
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L5e
            goto L5c
        L7e:
            if (r0 != 0) goto L94
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "[isAcceptCgiBack] is not over time. lastTime="
            r12.<init>(r13)
            long r2 = r5.f23810f
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            com.tencent.mars.xlog.Log.i(r1, r12)
            return r6
        L94:
            super.m(r12, r13)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bs2.t.m(bs2.h0, db2.c3):boolean");
    }

    @Override // bs2.n1
    public boolean o(bs2.h0 source, java.lang.String log) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(log, "log");
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        int i17 = this.f23907a;
        if (((ey2.t0) a17).N6(i17).f257452l) {
            com.tencent.mars.xlog.Log.w(this.f23909c, "[isValid] is at appPush scene ".concat(log));
            return false;
        }
        com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore finderStreamTabPreloadCore = this.f23908b;
        boolean z17 = finderStreamTabPreloadCore.T6() == 4;
        boolean R6 = ((ey2.t0) ((jz5.n) finderStreamTabPreloadCore.f122545g).getValue()).R6(i17);
        boolean z18 = ((source == bs2.h0.f23846f || source == bs2.h0.f23848h || source == bs2.h0.f23850m || source == bs2.h0.f23851n || source == bs2.h0.f23854q) && z17 && R6) || ((source == bs2.h0.f23849i || source == bs2.h0.f23852o) && this.f23910d);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(", ret=");
        sb6.append(z18);
        sb6.append(" targetEnterHot=");
        sb6.append(z17);
        sb6.append(" isAutoRefresh=");
        sb6.append(R6);
        return super.o(source, sb6.toString()) && z18;
    }

    @Override // bs2.n1
    public void p(int i17, r45.fx2 serverConfig) {
        kotlin.jvm.internal.o.g(serverConfig, "serverConfig");
        super.p(i17, serverConfig);
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127781k2).getValue()).r()).intValue();
        boolean z17 = serverConfig.getBoolean(16);
        if (intValue >= 0) {
            z17 = intValue == 1;
        }
        java.lang.String str = this.f23909c;
        int i18 = this.f23907a;
        if (i17 == i18 || !z17 || !this.f23910d) {
            com.tencent.mars.xlog.Log.i(str, "[performConfigChange] not need to check hot preload. debugValue=" + intValue + " fromTabType=" + i17);
            return;
        }
        com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore finderStreamTabPreloadCore = this.f23908b;
        boolean R6 = ((ey2.t0) ((jz5.n) finderStreamTabPreloadCore.f122545g).getValue()).R6(i18);
        bs2.b0 b0Var = this.f23925s;
        boolean z18 = b0Var.f23806b != null;
        long P6 = finderStreamTabPreloadCore.P6(i18, false);
        boolean z19 = c01.id.c() - b0Var.f23810f >= finderStreamTabPreloadCore.P6(i18, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[performConfigChange] isAutoRefresh=");
        sb6.append(R6);
        sb6.append(" isLoading=");
        bs2.g0 g0Var = this.f23927u;
        sb6.append(g0Var);
        sb6.append(" isOverTime=");
        sb6.append(z19);
        sb6.append(" expired=");
        sb6.append(P6);
        sb6.append(" debugValue=");
        sb6.append(intValue);
        sb6.append(" hasCache=");
        sb6.append(z18);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (R6 && !g0Var.f23842a && z19) {
            this.f23911e.c("performServerConfigChanged");
            bs2.c.b(this.f23911e, new bs2.s(this), 0L, "performConfigChange", null, 8, null);
        } else {
            com.tencent.mars.xlog.Log.i(str, "[performConfigChange] not need to preload. debugValue=" + intValue);
        }
    }
}
