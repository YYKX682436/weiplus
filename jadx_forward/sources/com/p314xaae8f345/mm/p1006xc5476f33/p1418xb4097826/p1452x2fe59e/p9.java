package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class p9 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q9 f190242g;

    public p9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q9 q9Var) {
        this.f190242g = q9Var;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        int i17;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return ((event instanceof fc2.t) && ((i18 = ((fc2.t) event).f342518d) == 0 || i18 == 5 || i18 == 4 || i18 == 7 || i18 == 10)) || ((event instanceof ec2.f) && ((i17 = ((ec2.f) event).f332492d) == 2 || i17 == 3));
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        fc2.t tVar;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q9 q9Var = this.f190242g;
        q9Var.getClass();
        if ((ev6 instanceof fc2.t) && ((i17 = (tVar = (fc2.t) ev6).f342518d) == 0 || i17 == 5 || i17 == 4 || i17 == 7 || i17 == 10)) {
            if (q9Var.f190338c != tVar.f342525k) {
                q9Var.f190342g = false;
                q9Var.b(tVar);
                q9Var.f190338c = tVar.f342525k;
                q9Var.f190339d = tVar.f342526l;
                q9Var.f190340e = tVar.f342527m;
                q9Var.f190341f = tVar.f342529o;
                return;
            }
            return;
        }
        if (ev6 instanceof ec2.f) {
            ec2.f fVar = (ec2.f) ev6;
            int i18 = fVar.f332492d;
            if (i18 == 2) {
                q9Var.e(fVar.f332498j);
                return;
            }
            if (i18 == 3) {
                int i19 = fVar.f332496h;
                int i27 = q9Var.f190344i;
                if (i19 == i27) {
                    q9Var.d(fVar.f332498j);
                } else {
                    if (q9Var.f190337b || i19 <= i27) {
                        return;
                    }
                    q9Var.d(fVar.f332498j);
                }
            }
        }
    }
}
