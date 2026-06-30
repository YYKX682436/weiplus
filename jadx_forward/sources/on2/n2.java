package on2;

/* loaded from: classes3.dex */
public final class n2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ on2.z2 f428508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f428509b;

    public n2(on2.z2 z2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f428508a = z2Var;
        this.f428509b = interfaceC29045xdcb5ca57;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f428509b;
        if (i17 == 0 && fVar.f152149b == 0) {
            on2.z2 z2Var = this.f428508a;
            z2Var.getClass();
            pm0.v.X(new on2.m2(z2Var));
            r45.cz1 cz1Var = (r45.cz1) ((r45.go1) fVar.f152151d).m75936x14adae67(1);
            if (cz1Var != null) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(cz1Var);
                z2Var.b7(linkedList, false);
                z2Var.f428628p.mo7808x76db6cb1(java.lang.Boolean.TRUE);
            }
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(java.lang.Boolean.TRUE, null)));
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(java.lang.Boolean.FALSE, (r45.qp1) ((r45.go1) fVar.f152151d).m75936x14adae67(2))));
        }
        return jz5.f0.f384359a;
    }
}
