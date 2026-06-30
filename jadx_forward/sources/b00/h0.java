package b00;

/* loaded from: classes8.dex */
public final class h0 implements zy2.da {
    @Override // zy2.da
    public boolean a(r45.vs2 ctrInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrInfo, "ctrInfo");
        int i17 = ctrInfo.f470020e;
        if (i17 >= 700000 && i17 <= 799999) {
            b00.j0 j0Var = b00.j0.f98226a;
            if ((j0Var.a(ctrInfo, "Card.Entrance.Right") || j0Var.a(ctrInfo, "Card.Entrance.Left")) && !j0Var.a(ctrInfo, "MyTab")) {
                zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = nk6.L0("MyTab");
                if (L0 == null || !((L0.y0("Card.Entrance.Right") || L0.y0("Card.Entrance.Left")) && L0.y0("MyTab"))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsRedDotMgr", "addRedDot " + ctrInfo.f470036x + " has not mytab redDot, but not mytab redDot!");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsRedDotMgr", "addRedDot " + ctrInfo.f470036x + " has not mytab redDot,dispose mytab redDot " + L0.f65882x5364c75d + '!');
                    zy2.fa.J0(nk6, L0, "MyTab", false, null, 8, null);
                }
            }
        }
        return false;
    }
}
