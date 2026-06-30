package ey2;

/* loaded from: classes2.dex */
public final class i1 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ey2.k1 f338926g;

    public i1(ey2.k1 k1Var) {
        this.f338926g = k1Var;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        ec2.f fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (ev6 instanceof ec2.f) {
            ec2.f fVar2 = (ec2.f) ev6;
            long j17 = fVar2.f332498j;
            ey2.k1 k1Var = this.f338926g;
            ey2.j1 j1Var = (ey2.j1) k1Var.f338950d.get(java.lang.Long.valueOf(j17));
            if (j1Var == null) {
                j1Var = new ey2.j1(0, 0L, 0, 0L, null, null, 63, null);
            }
            int i17 = fVar2.f332492d;
            if (i17 == 3) {
                if (j1Var.f338939e == null && (fVar = j1Var.f338940f) != null) {
                    j1Var.f338936b += ev6.f342468b - fVar.f342468b;
                }
                j1Var.f338935a = fVar2.f332497i;
                j1Var.f338937c = fVar2.f332496h;
                j1Var.f338940f = fVar2;
            } else if (i17 == 10) {
                j1Var.f338938d = ev6.f342467a;
            }
            if (i17 == 10 || i17 == 11 || i17 == 6 || i17 == 9) {
                j1Var.f338939e = fVar2;
            } else {
                j1Var.f338939e = null;
            }
            k1Var.f338950d.put(java.lang.Long.valueOf(j17), j1Var);
            yz5.l lVar = (yz5.l) k1Var.f338951e.get(java.lang.Long.valueOf(j17));
            if (lVar != null) {
                lVar.mo146xb9724478(j1Var);
            }
        }
    }
}
