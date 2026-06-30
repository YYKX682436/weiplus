package b00;

/* loaded from: classes8.dex */
public final class h0 implements zy2.da {
    @Override // zy2.da
    public boolean a(r45.vs2 ctrInfo) {
        kotlin.jvm.internal.o.g(ctrInfo, "ctrInfo");
        int i17 = ctrInfo.f388487e;
        if (i17 >= 700000 && i17 <= 799999) {
            b00.j0 j0Var = b00.j0.f16693a;
            if ((j0Var.a(ctrInfo, "Card.Entrance.Right") || j0Var.a(ctrInfo, "Card.Entrance.Left")) && !j0Var.a(ctrInfo, "MyTab")) {
                zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
                com.tencent.mm.plugin.finder.extension.reddot.jb L0 = nk6.L0("MyTab");
                if (L0 == null || !((L0.y0("Card.Entrance.Right") || L0.y0("Card.Entrance.Left")) && L0.y0("MyTab"))) {
                    com.tencent.mars.xlog.Log.i("EcsRedDotMgr", "addRedDot " + ctrInfo.f388503x + " has not mytab redDot, but not mytab redDot!");
                } else {
                    com.tencent.mars.xlog.Log.i("EcsRedDotMgr", "addRedDot " + ctrInfo.f388503x + " has not mytab redDot,dispose mytab redDot " + L0.field_tips_uuid + '!');
                    zy2.fa.J0(nk6, L0, "MyTab", false, null, 8, null);
                }
            }
        }
        return false;
    }
}
