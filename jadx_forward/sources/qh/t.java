package qh;

/* loaded from: classes12.dex */
public class t {
    public void a(rh.c1 c1Var, qh.u uVar) {
        qh.b bVar;
        qh.b bVar2;
        if (c1Var.f476862k != null && (bVar2 = c1Var.f476863l) != null) {
            long j17 = bVar2.f444854n;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j18 = currentTimeMillis - j17;
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
            long hours = timeUnit.toHours(j17);
            long millis = j17 - java.util.concurrent.TimeUnit.HOURS.toMillis(hours);
            long minutes = timeUnit.toMinutes(millis);
            long seconds = timeUnit.toSeconds(millis - java.util.concurrent.TimeUnit.MINUTES.toMillis(minutes));
            uVar.f444920a.append((java.lang.Object) "| Time Range: ");
            java.lang.String c17 = wh.m.c(j18, null, 2, null);
            java.lang.StringBuilder sb6 = uVar.f444920a;
            sb6.append((java.lang.Object) c17);
            sb6.append((java.lang.Object) "\t~\t");
            sb6.append((java.lang.Object) wh.m.c(currentTimeMillis, null, 2, null));
            sb6.append((java.lang.Object) "\t=\t");
            sb6.append(java.lang.Long.valueOf(hours));
            sb6.append((java.lang.Object) "h");
            sb6.append(java.lang.Long.valueOf(minutes));
            sb6.append((java.lang.Object) "m");
            sb6.append(java.lang.Long.valueOf(seconds));
            sb6.append((java.lang.Object) "s");
            sb6.append("\n");
        }
        c(c1Var, uVar);
        if (c1Var.f476862k == null || (bVar = c1Var.f476863l) == null) {
            return;
        }
        uVar.b("app_stats");
        uVar.c("stat_time");
        uVar.h("time", bVar.e() + "(min)");
        uVar.h("fg", java.lang.String.valueOf(bVar.f444841a));
        uVar.h("bg", java.lang.String.valueOf(bVar.f444842b));
        uVar.h("fgSrv", java.lang.String.valueOf(bVar.f444843c));
        uVar.h("float", java.lang.String.valueOf(bVar.f444844d));
        uVar.h("devCharging", java.lang.String.valueOf(bVar.f444845e));
        uVar.h("devScreenOff", java.lang.String.valueOf(bVar.f444847g));
        if (!android.text.TextUtils.isEmpty(bVar.f444849i)) {
            uVar.h("sceneTop1", bVar.f444849i + "/" + bVar.f444850j);
        }
        if (!android.text.TextUtils.isEmpty(bVar.f444851k)) {
            uVar.h("sceneTop2", bVar.f444851k + "/" + bVar.f444852l);
        }
        c1Var.x(rh.w.class, new qh.j(this, uVar));
    }

    public boolean b(rh.o2 o2Var, rh.c1 c1Var, qh.u uVar) {
        qh.b bVar;
        rh.f1 f1Var;
        long j17;
        if (c1Var.f476862k == null || (bVar = c1Var.f476863l) == null) {
            return false;
        }
        rh.d3 d3Var = o2Var.f477019c;
        boolean z17 = d3Var instanceof com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc;
        rh.d3 d3Var2 = o2Var.f477018b;
        long j18 = o2Var.f477020d;
        if (z17) {
            long max = java.lang.Math.max(1L, j18 / 60000);
            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc c4635xec0343cc = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) d3Var;
            long e17 = c1Var.e(((java.lang.Long) c4635xec0343cc.f134094g.f477085a).longValue());
            uVar.f444920a.append((java.lang.Object) "| ");
            java.lang.StringBuilder sb6 = uVar.f444920a;
            sb6.append((java.lang.Object) "cpu=");
            sb6.append(java.lang.Integer.valueOf(c1Var.s()));
            sb6.append((java.lang.Object) "/");
            sb6.append(java.lang.Integer.valueOf(c1Var.A()));
            uVar.e();
            uVar.e();
            sb6.append((java.lang.Object) "fg=");
            int c17 = bVar.c();
            java.lang.Integer num = wh.m.f527363a;
            sb6.append((java.lang.Object) (c17 != 1 ? c17 != 2 ? c17 != 3 ? c17 != 4 ? com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a : "float" : "fgSrv" : "bg" : "fg"));
            uVar.e();
            uVar.e();
            sb6.append((java.lang.Object) "during(min)=");
            sb6.append(java.lang.Long.valueOf(max));
            uVar.e();
            uVar.e();
            sb6.append((java.lang.Object) "diff(jiffies)=");
            sb6.append(c4635xec0343cc.f134094g.f477085a);
            uVar.e();
            uVar.e();
            sb6.append((java.lang.Object) "avg(jiffies/min)=");
            sb6.append(java.lang.Long.valueOf(e17));
            sb6.append("\n");
            uVar.b("jiffies(" + c4635xec0343cc.f134095h.f477093a.size() + ")");
            uVar.h("desc", "(status)name(tid)\tavg/total");
            uVar.h("inc_thread_num", java.lang.String.valueOf(c4635xec0343cc.f134096i.f477085a));
            uVar.h("cur_thread_num", java.lang.String.valueOf(((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) d3Var2).f134096i.f477085a));
            long j19 = 0;
            int i17 = 0;
            while (true) {
                j17 = max;
                if (i17 >= c4635xec0343cc.f134095h.f477093a.size()) {
                    break;
                }
                com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry threadJiffiesEntry = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry) c4635xec0343cc.f134095h.f477093a.get(i17);
                long j27 = j19;
                long longValue = ((java.lang.Long) threadJiffiesEntry.f477085a).longValue();
                if (i17 < 8) {
                    sb6.append((java.lang.Object) "|   -> (");
                    sb6.append((java.lang.Object) (threadJiffiesEntry.f134100d ? "+" : "~"));
                    sb6.append((java.lang.Object) "/");
                    sb6.append((java.lang.Object) threadJiffiesEntry.f134101e);
                    sb6.append((java.lang.Object) ")");
                    sb6.append((java.lang.Object) threadJiffiesEntry.f134099c);
                    sb6.append((java.lang.Object) "(");
                    sb6.append(java.lang.Integer.valueOf(threadJiffiesEntry.f134098b));
                    sb6.append((java.lang.Object) ")\t");
                    sb6.append(java.lang.Long.valueOf(c1Var.e(longValue)));
                    sb6.append((java.lang.Object) "/");
                    sb6.append(java.lang.Long.valueOf(longValue));
                    sb6.append((java.lang.Object) "\tjiffies");
                    uVar.a("\n");
                    j19 = j27;
                } else {
                    j19 = j27 + longValue;
                }
                i17++;
                max = j17;
            }
            long j28 = j19;
            uVar.a("|\t\t......\n");
            if (j28 > 0) {
                sb6.append((java.lang.Object) "|   -> R/R)");
                sb6.append((java.lang.Object) "REMAINS");
                sb6.append((java.lang.Object) "(");
                sb6.append(java.lang.Integer.valueOf(c4635xec0343cc.f134095h.f477093a.size() - 8));
                sb6.append((java.lang.Object) ")\t");
                sb6.append(java.lang.Long.valueOf(c1Var.e(j28) / j17));
                sb6.append((java.lang.Object) "/");
                sb6.append(java.lang.Long.valueOf(j28));
                sb6.append((java.lang.Object) "\tjiffies");
                uVar.a("\n");
            }
            if (e17 <= 1000 && o2Var.b()) {
                return true;
            }
            sb6.append((java.lang.Object) "|  ");
            sb6.append((java.lang.Object) (e17 > 1000 ? " #overHeat" : ""));
            sb6.append((java.lang.Object) (o2Var.b() ? "" : " #invalid"));
            uVar.a("\n");
            return true;
        }
        if (d3Var instanceof rh.k) {
            uVar.c("alarm");
            uVar.g(j18 + "(mls)\t" + (j18 / 60000) + "(min)");
            rh.k kVar = (rh.k) d3Var;
            uVar.h("inc_alarm_count", java.lang.String.valueOf(kVar.f476962d.f477085a));
            uVar.h("inc_trace_count", java.lang.String.valueOf(kVar.f476963e.f477085a));
            uVar.h("inc_dupli_group", java.lang.String.valueOf(kVar.f476964f.f477085a));
            uVar.h("inc_dupli_count", java.lang.String.valueOf(kVar.f476965g.f477085a));
        } else {
            if (d3Var instanceof rh.t3) {
                uVar.c("wake_lock");
                uVar.g(j18 + "(mls)\t" + (j18 / 60000) + "(min)");
                rh.t3 t3Var = (rh.t3) d3Var;
                uVar.h("inc_lock_count", java.lang.String.valueOf(t3Var.f477043e));
                uVar.h("inc_time_total", java.lang.String.valueOf(t3Var.f477042d));
                java.util.List list = ((rh.t3) d3Var2).f477044f.f477093a;
                if (list.isEmpty()) {
                    return true;
                }
                uVar.c("locking");
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    java.lang.Object obj = ((rh.s2) it.next()).f477039a;
                    rh.w3 w3Var = (rh.w3) obj;
                    if (!(w3Var.f477077f >= w3Var.f477076e)) {
                        uVar.g(((rh.w3) obj).m162377x9616526c());
                    }
                }
                return true;
            }
            if (d3Var instanceof rh.z) {
                uVar.c("bluetooh");
                uVar.g(j18 + "(mls)\t" + (j18 / 60000) + "(min)");
                rh.z zVar = (rh.z) d3Var;
                uVar.h("inc_regs_count", java.lang.String.valueOf(zVar.f477099d.f477085a));
                uVar.h("inc_dics_count", java.lang.String.valueOf(zVar.f477100e.f477085a));
                uVar.h("inc_scan_count", java.lang.String.valueOf(zVar.f477101f.f477085a));
            } else if (d3Var instanceof rh.c4) {
                uVar.c("wifi");
                uVar.g(j18 + "(mls)\t" + (j18 / 60000) + "(min)");
                rh.c4 c4Var = (rh.c4) d3Var;
                uVar.h("inc_scan_count", java.lang.String.valueOf(c4Var.f476887d.f477085a));
                uVar.h("inc_qury_count", java.lang.String.valueOf(c4Var.f476888e.f477085a));
            } else {
                if (!(d3Var instanceof rh.k2)) {
                    if (d3Var instanceof rh.w1) {
                        uVar.c("cpufreq");
                        uVar.g(j18 + "(mls)\t" + (j18 / 60000) + "(min)");
                        uVar.h("inc", java.util.Arrays.toString(((rh.w1) d3Var).f477071d.f477093a.toArray()));
                        uVar.h("cur", java.util.Arrays.toString(((rh.w1) d3Var2).f477071d.f477093a.toArray()));
                        c1Var.C(rh.w1.class, new qh.g(this, uVar));
                        return true;
                    }
                    if (!(d3Var instanceof rh.f1)) {
                        if (!(d3Var instanceof rh.t1)) {
                            return false;
                        }
                        uVar.c("batt_temp");
                        uVar.g(j18 + "(mls)\t" + (j18 / 60000) + "(min)");
                        uVar.h("inc", java.lang.String.valueOf(((rh.t1) d3Var).f477041d.f477085a));
                        uVar.h("cur", java.lang.String.valueOf(((rh.t1) d3Var2).f477041d.f477085a));
                        c1Var.C(rh.t1.class, new qh.i(this, uVar));
                        return true;
                    }
                    long j29 = j18 / 60000;
                    long max2 = java.lang.Math.max(1L, j29);
                    uVar.c("dev_cpu_load");
                    uVar.g(j18 + "(mls)\t" + j29 + "(min)");
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(c1Var.v());
                    sb7.append("%");
                    uVar.h("usage", sb7.toString());
                    int i18 = 0;
                    while (true) {
                        f1Var = (rh.f1) d3Var;
                        if (i18 >= f1Var.f476918d.size()) {
                            break;
                        }
                        uVar.h("cpu" + i18, java.util.Arrays.toString(((rh.y2) f1Var.f476918d.get(i18)).f477093a.toArray()));
                        i18++;
                    }
                    rh.k1 k1Var = (rh.k1) c1Var.w(rh.k1.class);
                    if (k1Var == null || !k1Var.y()) {
                        return true;
                    }
                    uVar.c("cpu_sip");
                    wh.n1 n1Var = k1Var.f476968k;
                    java.util.Locale locale = java.util.Locale.US;
                    uVar.h("inc_cpu_sip", java.lang.String.format(locale, "%.2f(mAh)/min", java.lang.Double.valueOf(f1Var.b(n1Var) / max2)));
                    uVar.h("cur_cpu_sip", java.lang.String.format(locale, "%.2f(mAh)", java.lang.Double.valueOf(((rh.f1) d3Var2).b(n1Var))));
                    c1Var.u(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.class, new qh.h(this, o2Var, n1Var, uVar, max2));
                    return true;
                }
                uVar.c(ya.b.f77489x9ff58fb5);
                uVar.g(j18 + "(mls)\t" + (j18 / 60000) + "(min)");
                uVar.h("inc_scan_count", java.lang.String.valueOf(((rh.k2) d3Var).f476969d.f477085a));
            }
        }
        return true;
    }

    public void c(rh.c1 c1Var, qh.u uVar) {
        if (c1Var.f476862k == null || c1Var.f476863l == null) {
            return;
        }
        c1Var.u(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.class, new qh.k(this, c1Var, uVar));
        if (c1Var.t(rh.k.class) != null || c1Var.t(rh.t3.class) != null) {
            uVar.b("awake");
            c1Var.u(rh.k.class, new qh.l(this, c1Var, uVar));
            c1Var.u(rh.t3.class, new qh.m(this, c1Var, uVar));
        }
        if (c1Var.t(rh.z.class) != null || c1Var.t(rh.c4.class) != null || c1Var.t(rh.k2.class) != null) {
            uVar.b("scanning");
            c1Var.u(rh.z.class, new qh.n(this, c1Var, uVar));
            c1Var.u(rh.c4.class, new qh.o(this, c1Var, uVar));
            c1Var.u(rh.k2.class, new qh.p(this, c1Var, uVar));
        }
        if (c1Var.w(rh.w.class) == null && c1Var.t(rh.f1.class) == null && c1Var.t(rh.w1.class) == null && c1Var.t(rh.t1.class) == null) {
            return;
        }
        uVar.b("dev_stats");
        c1Var.u(rh.f1.class, new qh.q(this, c1Var, uVar));
        c1Var.u(rh.w1.class, new qh.r(this, c1Var, uVar));
        c1Var.u(rh.t1.class, new qh.s(this, c1Var, uVar));
    }
}
