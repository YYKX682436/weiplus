package gr;

/* loaded from: classes4.dex */
public final class f extends com.p314xaae8f345.mm.p944x882e457a.i {
    public f(int i17, byte[] bArr, boolean z17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i18 & 4) != 0 ? false : z17;
        r45.bl3 bl3Var = new r45.bl3();
        r45.cl3 cl3Var = new r45.cl3();
        bl3Var.f452379d = i17;
        if (bArr == null) {
            bl3Var.f452380e = new r45.cu5();
        } else {
            bl3Var.f452380e = x51.j1.a(bArr);
        }
        bl3Var.f452381f = 0;
        bl3Var.f452382g = z17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = bl3Var;
        lVar.f152198b = cl3Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmgetpersonaldesigner";
        lVar.f152200d = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiGetPersonalDesigner", "CgiGetPersonalDesigner start");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    public pq5.g l() {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        az2.k.f97672a.a(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf);
        pq5.g l17 = super.l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "run(...)");
        return l17;
    }
}
