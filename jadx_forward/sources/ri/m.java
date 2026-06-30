package ri;

/* loaded from: classes12.dex */
public class m extends qh.t {
    @Override // qh.t
    public boolean b(rh.o2 o2Var, rh.c1 c1Var, qh.u uVar) {
        if (super.b(o2Var, c1Var, uVar)) {
            if (!(o2Var.f477019c instanceof com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc)) {
                return false;
            }
            uVar.c("dead_threads");
            rh.d3 d3Var = o2Var.f477019c;
            uVar.h("cont", java.lang.String.valueOf(((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) d3Var).f134097j.f477093a.size()));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (mm.l.b()) {
                for (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry threadJiffiesEntry : ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) d3Var).f134097j.f477093a) {
                    sb6.append(sb6.length() == 0 ? "" : ",");
                    sb6.append(threadJiffiesEntry.f134099c);
                    sb6.append("(");
                    sb6.append(threadJiffiesEntry.f134098b);
                    sb6.append(")");
                }
            } else {
                sb6.append("skip");
            }
            uVar.h("list", sb6.toString());
            return false;
        }
        rh.d3 d3Var2 = o2Var.f477019c;
        boolean z17 = d3Var2 instanceof rh.f;
        long j17 = o2Var.f477020d;
        rh.d3 d3Var3 = o2Var.f477019c;
        if (z17) {
            long max = java.lang.Math.max(1L, j17 / 60000);
            long longValue = ((java.lang.Long) ((rh.f) d3Var3).f476910g.f477085a).longValue() / max;
            if (longValue > 0) {
                java.lang.CharSequence format = android.text.format.DateFormat.format("HH:mm:ss", ((rh.f) o2Var.f477017a).f476909f);
                uVar.f444920a.append((java.lang.Object) "|   -> (");
                uVar.f444920a.append((java.lang.Object) (((rh.f) d3Var3).f476914k ? "-" : "~"));
                uVar.f444920a.append((java.lang.Object) ",");
                uVar.f444920a.append(java.lang.Integer.valueOf(((rh.f) d3Var3).f476911h));
                uVar.f444920a.append((java.lang.Object) "-");
                uVar.f444920a.append(java.lang.Integer.valueOf(((rh.f) d3Var3).f476912i));
                uVar.f444920a.append((java.lang.Object) ",");
                uVar.f444920a.append((java.lang.Object) format);
                uVar.f444920a.append((java.lang.Object) "-");
                uVar.f444920a.append(java.lang.Long.valueOf(max));
                uVar.f444920a.append((java.lang.Object) "min");
                uVar.f444920a.append((java.lang.Object) ")");
                uVar.f444920a.append((java.lang.Object) ((rh.f) d3Var3).f476908e);
                uVar.f444920a.append((java.lang.Object) "(");
                uVar.f444920a.append(java.lang.Integer.valueOf(((rh.f) d3Var3).f476907d));
                uVar.f444920a.append((java.lang.Object) ")\t");
                uVar.f444920a.append(java.lang.Long.valueOf(longValue));
                uVar.f444920a.append((java.lang.Object) "/");
                uVar.f444920a.append(((rh.f) d3Var3).f476910g.f477085a);
                uVar.f444920a.append((java.lang.Object) "\tjiffies");
                uVar.a("\n");
            }
            return true;
        }
        if (d3Var2 instanceof gi.j) {
            long max2 = java.lang.Math.max(1L, j17 / 60000);
            long longValue2 = ((java.lang.Long) ((gi.j) d3Var3).f353593d.f477085a).longValue() / max2;
            uVar.c("during");
            uVar.g(j17 + "(mls)\t" + max2 + "(min)");
            uVar.h("avgAlarmCount", java.lang.String.valueOf(((java.lang.Integer) ((gi.j) d3Var3).f353594e.f477085a).intValue() / max2));
            uVar.h("avgAddMsgCount", java.lang.String.valueOf(longValue2));
            return true;
        }
        if (!(d3Var2 instanceof rh.n3)) {
            return false;
        }
        long max3 = java.lang.Math.max(1L, j17 / 60000);
        long longValue3 = ((java.lang.Long) ((rh.n3) d3Var3).f477003d.f477085a).longValue() / max3;
        long longValue4 = ((java.lang.Long) ((rh.n3) d3Var3).f477004e.f477085a).longValue() / max3;
        long longValue5 = ((java.lang.Long) ((rh.n3) d3Var3).f477007h.f477085a).longValue() / max3;
        long longValue6 = ((java.lang.Long) ((rh.n3) d3Var3).f477008i.f477085a).longValue() / max3;
        uVar.c("traffic");
        uVar.h("avgWifiRx", java.lang.String.valueOf(longValue3));
        uVar.h("avgWifiTx", java.lang.String.valueOf(longValue4));
        uVar.h("avgMobileRx", java.lang.String.valueOf(longValue5));
        uVar.h("avgMobileTx", java.lang.String.valueOf(longValue6));
        return true;
    }

    @Override // qh.t
    public void c(final rh.c1 c1Var, final qh.u uVar) {
        super.c(c1Var, uVar);
        c1Var.x(gi.y1.class, new wh.t0() { // from class: ri.m$$a
            @Override // wh.t0
            /* renamed from: accept */
            public final void mo40853xab27b508(java.lang.Object obj) {
                ri.m mVar = ri.m.this;
                mVar.getClass();
                rh.c1 c1Var2 = c1Var;
                java.util.List D = ((gi.w0) c1Var2).D(gi.y1.class);
                if (D.isEmpty()) {
                    return;
                }
                java.lang.String str = "thread_pool(" + D.size() + ")";
                qh.u uVar2 = uVar;
                uVar2.b(str);
                mVar.d(D, c1Var2, uVar2);
            }
        });
        c1Var.x(gi.g1.class, new wh.t0() { // from class: ri.m$$b
            @Override // wh.t0
            /* renamed from: accept */
            public final void mo40853xab27b508(java.lang.Object obj) {
                ri.m mVar = ri.m.this;
                mVar.getClass();
                rh.c1 c1Var2 = c1Var;
                java.util.List D = ((gi.w0) c1Var2).D(gi.g1.class);
                if (D.isEmpty()) {
                    return;
                }
                java.lang.String str = "mm_handler(" + D.size() + ")";
                qh.u uVar2 = uVar;
                uVar2.b(str);
                mVar.d(D, c1Var2, uVar2);
            }
        });
        c1Var.x(gi.v0.class, new wh.t0() { // from class: ri.m$$c
            @Override // wh.t0
            /* renamed from: accept */
            public final void mo40853xab27b508(java.lang.Object obj) {
                ri.m mVar = ri.m.this;
                mVar.getClass();
                rh.c1 c1Var2 = c1Var;
                java.util.List D = ((gi.w0) c1Var2).D(gi.v0.class);
                if (D.isEmpty()) {
                    return;
                }
                java.lang.String str = "ipc_pool(" + D.size() + ")";
                qh.u uVar2 = uVar;
                uVar2.b(str);
                mVar.d(D, c1Var2, uVar2);
            }
        });
        if (c1Var.t(gi.j.class) != null || c1Var.t(rh.n3.class) != null) {
            uVar.b("extra_info");
            c1Var.u(gi.j.class, new wh.t0() { // from class: ri.m$$d
                @Override // wh.t0
                /* renamed from: accept */
                public final void mo40853xab27b508(java.lang.Object obj) {
                    ri.m.this.b((rh.o2) obj, c1Var, uVar);
                }
            });
            c1Var.u(rh.n3.class, new wh.t0() { // from class: ri.m$$e
                @Override // wh.t0
                /* renamed from: accept */
                public final void mo40853xab27b508(java.lang.Object obj) {
                    ri.m.this.b((rh.o2) obj, c1Var, uVar);
                }
            });
        }
        final qh.b bVar = c1Var.f476863l;
        if (bVar != null) {
            ((gi.w0) c1Var).p(new wh.t0() { // from class: ri.m$$f
                @Override // wh.t0
                /* renamed from: accept */
                public final void mo40853xab27b508(java.lang.Object obj) {
                    java.util.List<rh.o2> list = (java.util.List) obj;
                    if (list.isEmpty()) {
                        return;
                    }
                    java.util.Iterator it = list.iterator();
                    long j17 = 0;
                    while (it.hasNext()) {
                        j17 += ((java.lang.Long) ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) ((rh.o2) it.next()).f477019c).f134094g.f477085a).longValue();
                    }
                    qh.b bVar2 = qh.b.this;
                    long j18 = 10;
                    float k17 = sh.c.k(j17, bVar2.f444854n / 10);
                    qh.u uVar2 = uVar;
                    uVar2.b("all_pids");
                    java.lang.StringBuilder sb6 = uVar2.f444920a;
                    sb6.append((java.lang.Object) "|   -> TOP Thread\tpidNum=");
                    sb6.append(java.lang.Integer.valueOf(list.size()));
                    sb6.append((java.lang.Object) "\tcpuLoad=");
                    sb6.append((java.lang.Object) sh.c.m(k17, 1));
                    sb6.append((java.lang.Object) "%\tmin=");
                    sb6.append(java.lang.Long.valueOf(bVar2.e()));
                    sb6.append((java.lang.Object) "\n");
                    uVar2.a("|   -> TID\tLOAD \tSTATUS \tTHREAD_NAME \tJIFFY\n");
                    for (rh.o2 o2Var : list) {
                        if (o2Var.b()) {
                            uVar2.a("|\n");
                            uVar2.c("Proc");
                            sb6.append((java.lang.Object) "|   -> :");
                            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc c4635xec0343cc = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var.f477019c;
                            sb6.append((java.lang.Object) c4635xec0343cc.f134093f);
                            sb6.append((java.lang.Object) "\tpid=");
                            sb6.append(java.lang.Integer.valueOf(c4635xec0343cc.f134091d));
                            sb6.append((java.lang.Object) "\tload=");
                            sb6.append((java.lang.Object) sh.c.m(sh.c.k(((java.lang.Long) c4635xec0343cc.f134094g.f477085a).longValue(), bVar2.f444854n / j18), 1));
                            sb6.append((java.lang.Object) "%\tmin=");
                            sb6.append(java.lang.Long.valueOf(bVar2.e()));
                            uVar2.a("\n");
                            uVar2.c("Thread(" + c4635xec0343cc.f134095h.f477093a.size() + ")");
                            for (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry threadJiffiesEntry : c4635xec0343cc.f134095h.f477093a) {
                                long longValue = ((java.lang.Long) threadJiffiesEntry.f477085a).longValue();
                                float k18 = sh.c.k(longValue, bVar2.f444854n / j18);
                                sb6.append((java.lang.Object) "|   -> ");
                                sb6.append((java.lang.Object) sh.c.l(java.lang.String.valueOf(threadJiffiesEntry.f134098b), 5));
                                sb6.append((java.lang.Object) "\t");
                                sb6.append((java.lang.Object) sh.c.l(sh.c.m(k18, 1), 4));
                                sb6.append((java.lang.Object) "\t");
                                sb6.append((java.lang.Object) (threadJiffiesEntry.f134100d ? "+" : "~"));
                                sb6.append((java.lang.Object) "/");
                                sb6.append((java.lang.Object) threadJiffiesEntry.f134101e);
                                sb6.append((java.lang.Object) "\t");
                                sb6.append((java.lang.Object) sh.c.l(threadJiffiesEntry.f134099c, 16));
                                sb6.append((java.lang.Object) "\t");
                                sb6.append(java.lang.Long.valueOf(longValue));
                                sb6.append((java.lang.Object) "\t");
                                uVar2.a("\n");
                                if (k18 < 5.0f) {
                                    break;
                                } else {
                                    j18 = 10;
                                }
                            }
                        }
                        j18 = 10;
                    }
                }
            });
        }
    }

    public final void d(java.util.List list, rh.c1 c1Var, qh.u uVar) {
        boolean z17 = false;
        boolean z18 = false;
        for (int i17 = 0; i17 < java.lang.Math.min(list.size(), 10); i17++) {
            rh.o2 o2Var = (rh.o2) list.get(i17);
            b(o2Var, c1Var, uVar);
            if (!o2Var.b()) {
                z18 = true;
            }
            if (!z17 && ((java.lang.Long) ((rh.f) o2Var.f477019c).f476910g.f477085a).longValue() / java.lang.Math.max(1L, o2Var.f477020d / 60000) > java.lang.Math.max(gi.d.f353531f, 1000L)) {
                z17 = true;
            }
        }
        uVar.a("|\t\t......\n");
        if (z17 || z18) {
            java.lang.StringBuilder sb6 = uVar.f444920a;
            sb6.append((java.lang.Object) "|  ");
            sb6.append((java.lang.Object) (z17 ? " #overHeat" : ""));
            sb6.append((java.lang.Object) (z18 ? " #invalid" : ""));
            uVar.a("\n");
        }
    }
}
