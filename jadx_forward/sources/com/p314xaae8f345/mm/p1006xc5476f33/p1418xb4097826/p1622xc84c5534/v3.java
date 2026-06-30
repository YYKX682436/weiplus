package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class v3 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w3 f206935g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f206936h;

    public v3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w3 w3Var, r45.qt2 qt2Var) {
        this.f206935g = w3Var;
        this.f206936h = qt2Var;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return (event instanceof fc2.t) && ((i17 = ((fc2.t) event).f342518d) == 0 || i17 == 5 || i17 == 4);
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (ev6 instanceof fc2.t) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w3 w3Var = this.f206935g;
            fc2.t tVar = (fc2.t) ev6;
            if (w3Var.f206953a != tVar.f342525k) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
                cl0.g gVar = new cl0.g();
                r45.qt2 qt2Var = this.f206936h;
                b6Var.c(qt2Var, "forward", false, gVar);
                b6Var.c(qt2Var, "tridot", false, new cl0.g());
                w3Var.f206953a = tVar.f342525k;
            }
        }
    }
}
