package ni3;

/* loaded from: classes10.dex */
public final class x0 implements ek4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ni3.a1 f419287a;

    public x0(ni3.a1 a1Var) {
        this.f419287a = a1Var;
    }

    @Override // ek4.a
    public void a(java.lang.String mediaId, int i17, dn.o task, dn.h hVar) {
        java.lang.Object obj;
        java.lang.Object obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        if (i17 != 0) {
            return;
        }
        boolean z17 = hVar instanceof dn.c;
        ni3.a1 a1Var = this.f419287a;
        if (!z17) {
            if (!(hVar instanceof dn.b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderStreamVideoLoadStrategyMonitor", "onComplete invalid task appear mediaId:".concat(mediaId));
                return;
            }
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = a1Var.f419066i;
            java.util.ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ni3.v0) obj).f419280b, mediaId)) {
                        break;
                    }
                }
            }
            ni3.v0 v0Var = (ni3.v0) obj;
            if (v0Var == null) {
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onOnlinePlayTaskComplete ");
            cs2.l lVar = task instanceof cs2.l ? (cs2.l) task : null;
            sb6.append(a1Var.e(lVar != null ? lVar.f303611e2 : -999, v0Var.f419279a));
            sb6.append(" stage:");
            sb6.append(v0Var.f419281c.f303628l2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderStreamVideoLoadStrategyMonitor", sb6.toString());
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = a1Var.f419066i;
        java.util.ListIterator listIterator2 = copyOnWriteArrayList2.listIterator(copyOnWriteArrayList2.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                obj2 = null;
                break;
            } else {
                obj2 = listIterator2.previous();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ni3.v0) obj2).f419280b, mediaId)) {
                    break;
                }
            }
        }
        ni3.v0 v0Var2 = (ni3.v0) obj2;
        if (v0Var2 != null && (task instanceof cs2.p)) {
            cs2.p pVar = (cs2.p) task;
            cs2.n nVar = pVar.f303628l2;
            cs2.n nVar2 = cs2.n.f303613e;
            so2.j5 j5Var = v0Var2.f419279a;
            if (nVar == nVar2) {
                ni3.p0 f17 = a1Var.f(j5Var.mo2128x1ed62e84());
                ni3.s0 s0Var = f17 != null ? f17.f419209g : null;
                if (s0Var != null) {
                    s0Var.f419265b = true;
                }
            } else if (nVar == cs2.n.f303614f) {
                ni3.p0 f18 = a1Var.f(j5Var.mo2128x1ed62e84());
                ni3.s0 s0Var2 = f18 != null ? f18.f419210h : null;
                if (s0Var2 != null) {
                    s0Var2.f419265b = true;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderStreamVideoLoadStrategyMonitor", "onPreloadComplete " + a1Var.e(pVar.f303627k2, j5Var) + " stage:" + v0Var2.f419281c.f303628l2);
        }
    }

    @Override // ek4.a
    public void b(java.lang.String mediaId, int i17, dn.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        if (i17 == 0 || i17 == -21007 || i17 == -21008) {
            boolean z17 = hVar instanceof dn.c;
            java.lang.Object obj = null;
            ni3.a1 a1Var = this.f419287a;
            if (z17) {
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = a1Var.f419066i;
                java.util.ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    java.lang.Object previous = listIterator.previous();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ni3.v0) previous).f419280b, mediaId)) {
                        obj = previous;
                        break;
                    }
                }
                ni3.v0 v0Var = (ni3.v0) obj;
                if (v0Var == null) {
                    return;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPreloadStop ");
                cs2.p pVar = v0Var.f419281c;
                sb6.append(a1Var.e(pVar.f303627k2, v0Var.f419279a));
                sb6.append(" stage:");
                sb6.append(pVar.f303628l2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStreamVideoLoadStrategyMonitor", sb6.toString());
                return;
            }
            if (!(hVar instanceof dn.b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderStreamVideoLoadStrategyMonitor", "onStop invalid task appear mediaId:".concat(mediaId));
                return;
            }
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = a1Var.f419066i;
            java.util.ListIterator listIterator2 = copyOnWriteArrayList2.listIterator(copyOnWriteArrayList2.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    break;
                }
                java.lang.Object previous2 = listIterator2.previous();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ni3.v0) previous2).f419280b, mediaId)) {
                    obj = previous2;
                    break;
                }
            }
            ni3.v0 v0Var2 = (ni3.v0) obj;
            if (v0Var2 == null) {
                return;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onOnlinePlayTaskStop ");
            cs2.p pVar2 = v0Var2.f419281c;
            sb7.append(a1Var.e(pVar2.f303627k2, v0Var2.f419279a));
            sb7.append(" stage:");
            sb7.append(pVar2.f303628l2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStreamVideoLoadStrategyMonitor", sb7.toString());
        }
    }

    @Override // ek4.a
    public void c(java.lang.String mediaId, int i17, dn.o oVar) {
        so2.j5 j5Var;
        ni3.s0 s0Var;
        so2.j5 j5Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        if (i17 != 0) {
            return;
        }
        boolean z17 = oVar instanceof cs2.p;
        java.lang.String str = null;
        ni3.a1 a1Var = this.f419287a;
        if (!z17) {
            if (!(oVar instanceof cs2.l)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderStreamVideoLoadStrategyMonitor", "onStart invalid task appear mediaId:".concat(mediaId));
                return;
            }
            cs2.l lVar = (cs2.l) oVar;
            a1Var.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onOnlinePlayTaskStart ");
            int i18 = lVar.f303611e2;
            ni3.p0 f17 = a1Var.f(lVar.f303610d2);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            if (f17 != null && (j5Var = f17.f419203a) != null) {
                str = hc2.b0.d(j5Var, i18);
            }
            sb7.append(str);
            sb7.append(lVar.X1);
            sb6.append(sb7.toString());
            sb6.append('}');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStreamVideoLoadStrategyMonitor", sb6.toString());
            return;
        }
        cs2.p pVar = (cs2.p) oVar;
        a1Var.getClass();
        ni3.p0 f18 = a1Var.f(pVar.f303622f2);
        if (f18 != null) {
            int i19 = pVar.f303627k2;
            ni3.o0 o0Var = f18.f419204b;
            o0Var.f419183d = i19;
            so2.j5 j5Var3 = f18.f419203a;
            o0Var.a(hc2.b0.h(j5Var3, false, 1, null));
            o0Var.f419185f = pVar.f303621e2.g();
            ni3.r0 r0Var = f18.f419205c;
            r0Var.getClass();
            java.lang.String str2 = pVar.f303625i2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
            r0Var.f419252a = str2;
            ni3.r0 r0Var2 = f18.f419205c;
            java.lang.String field_fullpath = pVar.f69595x6d25b0d9;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fullpath, "field_fullpath");
            r0Var2.getClass();
            r0Var2.f419253b = field_fullpath;
            cs2.n nVar = pVar.f303628l2;
            if (nVar == cs2.n.f303613e) {
                ni3.s0 s0Var2 = f18.f419209g;
                s0Var2.f419264a = true;
                long j17 = pVar.f323338x;
                ni3.t0 t0Var = s0Var2.f419267d;
                t0Var.f419269a = j17;
                t0Var.f419270b = pVar.V1;
            } else if (nVar == cs2.n.f303614f && (s0Var = f18.f419210h) != null) {
                s0Var.f419264a = true;
                long j18 = pVar.f323338x;
                ni3.t0 t0Var2 = s0Var.f419267d;
                t0Var2.f419269a = j18;
                t0Var2.f419270b = pVar.V1;
            }
            a1Var.f419066i.add(new ni3.v0(j5Var3, mediaId, pVar));
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("onPreloadStart ");
            int i27 = pVar.f303627k2;
            ni3.p0 f19 = a1Var.f(pVar.f303622f2);
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            if (f19 != null && (j5Var2 = f19.f419203a) != null) {
                str = hc2.b0.d(j5Var2, i27);
            }
            sb9.append(str);
            sb9.append(pVar.k());
            sb8.append(sb9.toString());
            sb8.append(" stage:");
            sb8.append(pVar.f303628l2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStreamVideoLoadStrategyMonitor", sb8.toString());
        }
    }

    @Override // ek4.a
    public void f(java.lang.String mediaId, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
    }
}
