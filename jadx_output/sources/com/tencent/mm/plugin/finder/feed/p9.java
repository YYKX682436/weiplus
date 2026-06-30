package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class p9 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.q9 f108709g;

    public p9(com.tencent.mm.plugin.finder.feed.q9 q9Var) {
        this.f108709g = q9Var;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        int i17;
        int i18;
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        return ((event instanceof fc2.t) && ((i18 = ((fc2.t) event).f260985d) == 0 || i18 == 5 || i18 == 4 || i18 == 7 || i18 == 10)) || ((event instanceof ec2.f) && ((i17 = ((ec2.f) event).f250959d) == 2 || i17 == 3));
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        fc2.t tVar;
        int i17;
        kotlin.jvm.internal.o.g(ev6, "ev");
        com.tencent.mm.plugin.finder.feed.q9 q9Var = this.f108709g;
        q9Var.getClass();
        if ((ev6 instanceof fc2.t) && ((i17 = (tVar = (fc2.t) ev6).f260985d) == 0 || i17 == 5 || i17 == 4 || i17 == 7 || i17 == 10)) {
            if (q9Var.f108805c != tVar.f260992k) {
                q9Var.f108809g = false;
                q9Var.b(tVar);
                q9Var.f108805c = tVar.f260992k;
                q9Var.f108806d = tVar.f260993l;
                q9Var.f108807e = tVar.f260994m;
                q9Var.f108808f = tVar.f260996o;
                return;
            }
            return;
        }
        if (ev6 instanceof ec2.f) {
            ec2.f fVar = (ec2.f) ev6;
            int i18 = fVar.f250959d;
            if (i18 == 2) {
                q9Var.e(fVar.f250965j);
                return;
            }
            if (i18 == 3) {
                int i19 = fVar.f250963h;
                int i27 = q9Var.f108811i;
                if (i19 == i27) {
                    q9Var.d(fVar.f250965j);
                } else {
                    if (q9Var.f108804b || i19 <= i27) {
                        return;
                    }
                    q9Var.d(fVar.f250965j);
                }
            }
        }
    }
}
