package ni3;

/* loaded from: classes10.dex */
public final class z0 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ni3.a1 f419294g;

    public z0(ni3.a1 a1Var) {
        this.f419294g = a1Var;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (event instanceof fc2.t) {
            int i17 = ((fc2.t) event).f342518d;
            return i17 == 0 || i17 == 7 || i17 == 6;
        }
        if (!(event instanceof ec2.f)) {
            return false;
        }
        int i18 = ((ec2.f) event).f332492d;
        return i18 == 1 || i18 == 19 || i18 == 3 || i18 == 4 || i18 == 6 || i18 == 11 || i18 == 22 || i18 == 23;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        boolean z17 = ev6 instanceof fc2.t;
        ni3.a1 a1Var = this.f419294g;
        if (!z17) {
            if (ev6 instanceof ec2.f) {
                pm0.v.X(new ni3.y0(ev6, a1Var));
                return;
            }
            return;
        }
        long j17 = ((fc2.t) ev6).f342525k;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa = a1Var.f419060c;
        if (c13920xa5f564aa == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(ya.b.f77502x92235c1b);
            throw null;
        }
        a1Var.i("onFocus", c13920xa5f564aa, a1Var.f419064g);
        a1Var.f419058a.f419195i = j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa2 = a1Var.f419060c;
        if (c13920xa5f564aa2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(ya.b.f77502x92235c1b);
            throw null;
        }
        java.util.Iterator<T> it = c13920xa5f564aa2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((so2.j5) obj).mo2128x1ed62e84() == j17) {
                    break;
                }
            }
        }
        so2.j5 j5Var = (so2.j5) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa3 = a1Var.f419060c;
        if (c13920xa5f564aa3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(ya.b.f77502x92235c1b);
            throw null;
        }
        java.util.Iterator<T> it6 = c13920xa5f564aa3.iterator();
        int i17 = 0;
        while (true) {
            if (!it6.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((so2.j5) it6.next()).mo2128x1ed62e84() == j17) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        if (!(j5Var instanceof so2.u1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStreamVideoLoadStrategyMonitor", "onFocus return for ".concat(a1Var.e(i17, j5Var)));
            return;
        }
        ni3.p0 f17 = a1Var.f(j17);
        if (f17 != null) {
            f17.f419207e = true;
            ni3.o0 o0Var = f17.f419204b;
            o0Var.f419183d = i17;
            o0Var.a(hc2.b0.h(j5Var, false, 1, null));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStreamVideoLoadStrategyMonitor", "onFocus ".concat(a1Var.e(i17, j5Var)));
    }
}
