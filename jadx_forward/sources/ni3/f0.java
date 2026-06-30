package ni3;

/* loaded from: classes10.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 f419112d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 c16559xedc507d9) {
        this.f419112d = c16559xedc507d9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 c16559xedc507d9;
        java.lang.String sb6;
        java.lang.String sb7;
        com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 c16559xedc507d92 = this.f419112d;
        boolean z17 = c16559xedc507d92.f230991g;
        pf5.u uVar = pf5.u.f435469a;
        if (z17) {
            c16559xedc507d92.getClass();
            com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadInfo m37748x8ade6947 = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37748x8ade6947(0, 0, 5);
            long j17 = m37748x8ade6947.f18056x990efe87;
            float f17 = j17 > 0 ? ((((float) m37748x8ade6947.f18055x7467a666) * 1.0f) / 1024) / ((float) (j17 / 1000)) : 0.0f;
            com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadInfo m37748x8ade69472 = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37748x8ade6947(251, 20302, 5);
            long j18 = m37748x8ade69472.f18056x990efe87;
            float f18 = j18 > 0 ? ((((float) m37748x8ade69472.f18055x7467a666) * 1.0f) / 1024) / ((float) (j18 / 1000)) : 0.0f;
            p012xc85e97e9.p093xedfae76a.c1 a17 = uVar.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) a17;
            int V6 = c15482x9b531b34.V6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.class);
            yr2.k ek6 = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
            kw2.y Uj = ((c61.l7) i95.n0.c(c61.l7.class)).Uj();
            Uj.getClass();
            long j19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.f274322t;
            long e17 = Uj.e();
            long j27 = Uj.f394651d;
            int i17 = ek6.f546241y;
            int i18 = ek6.f546242z;
            int i19 = ek6.A;
            boolean z18 = ek6.B;
            int i27 = ek6.f546219c;
            int i28 = ek6.C;
            int i29 = ek6.f546220d;
            int i37 = ek6.F;
            int i38 = ek6.G;
            int i39 = ek6.H;
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("微信:" + f17 + "KBps  ");
            stringBuffer.append("视频号:" + f18 + "KBps  ");
            stringBuffer.append("tp=" + V6 + " ?=" + (c15482x9b531b34.V6(null) - V6));
            stringBuffer.append("\n");
            stringBuffer.append("globalRx:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(j19) + "  ");
            stringBuffer.append("cdnRx:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(e17) + " gap:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(j19 - e17));
            stringBuffer.append("\n");
            stringBuffer.append("finderRx:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(j27) + " gap:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(e17 - j27) + "  ");
            stringBuffer.append("reportRx:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(j27) + " gap:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(j27 - j27) + "  ");
            stringBuffer.append("\n");
            stringBuffer.append("minBuffer:" + i17 + " maxBuffer:" + i18 + " minCurrentBuffer:" + i19 + " fileTimeMs:" + i28 + ' ');
            stringBuffer.append("\n");
            stringBuffer.append("preCreate:" + z18 + " nextCount:" + i27 + " minCurrentBuffer:" + i19 + " fileSizePercent:" + i29 + "  ");
            stringBuffer.append("\n");
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("lsBuf:");
            sb8.append(i37);
            sb8.append(" lsSendBuf:");
            sb8.append(i38);
            sb8.append(" playerRecvBuf:");
            sb8.append(i39);
            sb8.append("  ");
            stringBuffer.append(sb8.toString());
            stringBuffer.append("\n");
            c16559xedc507d9 = c16559xedc507d92;
            ni3.p g17 = c16559xedc507d9.g(c16559xedc507d9.f230997p);
            if (g17.f419200b > 0) {
                long a18 = c01.id.a();
                long j28 = g17.f419200b;
                long j29 = a18 - j28;
                if (j28 < g17.f419201c) {
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder("加载完成 耗时:");
                    sb9.append(g17.f419201c - g17.f419200b);
                    sb9.append(" itemSize:");
                    sb9.append(g17.f419202d);
                    sb9.append("  ");
                    sb9.append(c16559xedc507d9.f230995n);
                    sb9.append('/');
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa = c16559xedc507d9.f230992h;
                    if (c13920xa5f564aa == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                        throw null;
                    }
                    sb9.append(c13920xa5f564aa.size());
                    sb9.append("  离上次：");
                    sb9.append(j29);
                    sb9.append("MS");
                    sb7 = sb9.toString();
                } else {
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder("加载中 ");
                    sb10.append(c16559xedc507d9.f230995n);
                    sb10.append('/');
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa2 = c16559xedc507d9.f230992h;
                    if (c13920xa5f564aa2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                        throw null;
                    }
                    sb10.append(c13920xa5f564aa2.size());
                    sb10.append(" 离上次：");
                    sb10.append(j29);
                    sb10.append("MS");
                    sb7 = sb10.toString();
                }
                stringBuffer.append("FinderStream:" + sb7);
            }
            sb6 = stringBuffer.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb6, "toString(...)");
        } else {
            c16559xedc507d9 = c16559xedc507d92;
            c16559xedc507d9.getClass();
            int m37745x9208c81b = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37745x9208c81b(2);
            yr2.k ek7 = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
            p012xc85e97e9.p093xedfae76a.c1 a19 = uVar.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "get(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b342 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) a19;
            int V62 = c15482x9b531b342.V6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.class);
            int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TIMELINE_PRELOAD_NUM_INT_SYNC, 3);
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            sb11.append(m37745x9208c81b);
            sb11.append("kb/s | ");
            sb11.append(ek7.f546218b);
            sb11.append(':');
            sb11.append(ek7.f546219c);
            sb11.append(':');
            sb11.append(ek7.f546222f);
            sb11.append(" | tp=");
            sb11.append(V62);
            sb11.append(" ?=");
            sb11.append(c15482x9b531b342.V6(null) - V62);
            sb11.append(" | autoPage=");
            sb11.append(r17);
            sb11.append(':');
            sb11.append(c16559xedc507d9.f231006y);
            sb11.append(':');
            sb11.append(c16559xedc507d9.f231005x);
            sb11.append(c16559xedc507d9.f231007z == 1 ? "..." : "");
            sb6 = sb11.toString();
        }
        pm0.v.X(new ni3.e0(c16559xedc507d9, sb6));
    }
}
