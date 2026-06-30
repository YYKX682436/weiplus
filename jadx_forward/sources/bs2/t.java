package bs2;

/* loaded from: classes2.dex */
public final class t extends bs2.n1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379 core) {
        super(4, core);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(core, "core");
    }

    @Override // bs2.n1
    public bs2.h0 g() {
        return bs2.h0.f105383m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if ((c01.id.c() - r5.f105343f) >= r4.P6(r3, false)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        if ((c01.id.c() - r5.f105343f) >= r4.Q6(r3, r12 == bs2.h0.f105379f, r5.f105339b != null)) goto L19;
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r0)
            java.lang.String r0 = "resp"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isAcceptCgiBack: source="
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r1 = ", refreshPrefetchStatus="
            r0.append(r1)
            int r1 = r12.f105390e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r11.f105442c
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            bs2.h0 r0 = bs2.h0.f105384n
            r2 = 1
            if (r12 != r0) goto L32
            java.lang.String r12 = "[isAcceptCgiBack] is finder enter load."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r12)
            return r2
        L32:
            int r0 = r12.f105390e
            r3 = 2
            if (r0 != r3) goto L38
            return r2
        L38:
            bs2.h0 r0 = bs2.h0.f105387q
            if (r12 != r0) goto L3d
            return r2
        L3d:
            bs2.h0 r0 = bs2.h0.f105383m
            int r3 = r11.f105440a
            com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore r4 = r11.f105441b
            bs2.b0 r5 = r11.f105458s
            r6 = 0
            if (r12 == r0) goto L60
            bs2.h0 r0 = bs2.h0.f105379f
            if (r12 != r0) goto L4d
            goto L60
        L4d:
            long r7 = c01.id.c()
            long r9 = r5.f105343f
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
            bs2.h0 r0 = bs2.h0.f105379f
            if (r12 != r0) goto L66
            r0 = r2
            goto L67
        L66:
            r0 = r6
        L67:
            db2.c3 r7 = r5.f105339b
            if (r7 == 0) goto L6d
            r7 = r2
            goto L6e
        L6d:
            r7 = r6
        L6e:
            long r3 = r4.Q6(r3, r0, r7)
            long r7 = c01.id.c()
            long r9 = r5.f105343f
            long r7 = r7 - r9
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L5e
            goto L5c
        L7e:
            if (r0 != 0) goto L94
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "[isAcceptCgiBack] is not over time. lastTime="
            r12.<init>(r13)
            long r2 = r5.f105343f
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r12)
            return r6
        L94:
            super.m(r12, r13)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bs2.t.m(bs2.h0, db2.c3):boolean");
    }

    @Override // bs2.n1
    public boolean o(bs2.h0 source, java.lang.String log) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(log, "log");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.t0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        int i17 = this.f105440a;
        if (((ey2.t0) a17).N6(i17).f338985l) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f105442c, "[isValid] is at appPush scene ".concat(log));
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379 c14614xb913e379 = this.f105441b;
        boolean z17 = c14614xb913e379.T6() == 4;
        boolean R6 = ((ey2.t0) ((jz5.n) c14614xb913e379.f204078g).mo141623x754a37bb()).R6(i17);
        boolean z18 = ((source == bs2.h0.f105379f || source == bs2.h0.f105381h || source == bs2.h0.f105383m || source == bs2.h0.f105384n || source == bs2.h0.f105387q) && z17 && R6) || ((source == bs2.h0.f105382i || source == bs2.h0.f105385o) && this.f105443d);
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serverConfig, "serverConfig");
        super.p(i17, serverConfig);
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209314k2).mo141623x754a37bb()).r()).intValue();
        boolean m75933x41a8a7f2 = serverConfig.m75933x41a8a7f2(16);
        if (intValue >= 0) {
            m75933x41a8a7f2 = intValue == 1;
        }
        java.lang.String str = this.f105442c;
        int i18 = this.f105440a;
        if (i17 == i18 || !m75933x41a8a7f2 || !this.f105443d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[performConfigChange] not need to check hot preload. debugValue=" + intValue + " fromTabType=" + i17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379 c14614xb913e379 = this.f105441b;
        boolean R6 = ((ey2.t0) ((jz5.n) c14614xb913e379.f204078g).mo141623x754a37bb()).R6(i18);
        bs2.b0 b0Var = this.f105458s;
        boolean z17 = b0Var.f105339b != null;
        long P6 = c14614xb913e379.P6(i18, false);
        boolean z18 = c01.id.c() - b0Var.f105343f >= c14614xb913e379.P6(i18, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[performConfigChange] isAutoRefresh=");
        sb6.append(R6);
        sb6.append(" isLoading=");
        bs2.g0 g0Var = this.f105460u;
        sb6.append(g0Var);
        sb6.append(" isOverTime=");
        sb6.append(z18);
        sb6.append(" expired=");
        sb6.append(P6);
        sb6.append(" debugValue=");
        sb6.append(intValue);
        sb6.append(" hasCache=");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (R6 && !g0Var.f105375a && z18) {
            this.f105444e.c("performServerConfigChanged");
            bs2.c.b(this.f105444e, new bs2.s(this), 0L, "performConfigChange", null, 8, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[performConfigChange] not need to preload. debugValue=" + intValue);
        }
    }
}
