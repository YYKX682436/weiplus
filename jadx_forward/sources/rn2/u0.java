package rn2;

/* loaded from: classes3.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f479415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ek2.t0 f479416e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f479417f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rn2.c1 f479418g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, ek2.t0 t0Var, com.p314xaae8f345.mm.p944x882e457a.f fVar, rn2.c1 c1Var) {
        super(0);
        this.f479415d = u3Var;
        this.f479416e = t0Var;
        this.f479417f = fVar;
        this.f479418g = c1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        this.f479415d.dismiss();
        int i17 = this.f479416e.f335069d;
        int i18 = i17 > 0 ? i17 / 60 : 0;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f479417f;
        int i19 = fVar.f152148a;
        rn2.c1 c1Var = this.f479418g;
        if (i19 == 0 && fVar.f152149b == 0) {
            gk2.e eVar = gk2.e.f354004n;
            if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).T) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).qj(3);
            } else {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f409131n, c1Var.f479201h + '@' + c1Var.f479203m + ';' + i18 + ';' + c1Var.f479204n + ';' + c1Var.f479205o);
            }
            gk2.e eVar2 = gk2.e.f354004n;
            if (eVar2 != null) {
                pm0.v.X(new on2.m2((on2.z2) eVar2.a(on2.z2.class)));
            }
            r45.cz1 cz1Var = (r45.cz1) ((r45.go1) fVar.f152151d).m75936x14adae67(1);
            if (cz1Var != null) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(cz1Var);
                gk2.e eVar3 = gk2.e.f354004n;
                if (eVar3 != null) {
                    ((on2.z2) eVar3.a(on2.z2.class)).b7(linkedList, false);
                }
                gk2.e eVar4 = gk2.e.f354004n;
                if (eVar4 != null && (j0Var = ((on2.z2) eVar4.a(on2.z2.class)).f428628p) != null) {
                    j0Var.mo7808x76db6cb1(java.lang.Boolean.TRUE);
                }
            }
            rn2.g gVar = c1Var.f479200g;
            if (gVar != null) {
                ((rn2.t2) gVar).m162763x5cd39ffa();
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = c1Var.f479197d;
            activityC0065xcd7aa112.setResult(-1, activityC0065xcd7aa112.getIntent());
            activityC0065xcd7aa112.finish();
        } else {
            rn2.g gVar2 = c1Var.f479200g;
            if (gVar2 != null) {
                ((rn2.t2) gVar2).s(i19, fVar.f152149b, fVar.f152150c, (r45.go1) fVar.f152151d);
            }
        }
        return jz5.f0.f384359a;
    }
}
