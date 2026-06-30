package mq4;

/* loaded from: classes14.dex */
public class r implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq4.s f412339d;

    public r(mq4.s sVar) {
        this.f412339d = sVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        byte[] bArr;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Redirect response:");
        sb6.append(i17);
        sb6.append(" errCode:");
        sb6.append(i18);
        sb6.append(" status:");
        mq4.s sVar = this.f412339d;
        sb6.append(sVar.f412329g.f258041a);
        vq4.d0.c("MicroMsg.Voip.Redirect", sb6.toString());
        if (i17 != 0 || i18 != 0) {
            vq4.d0.b("MicroMsg.Voip.Redirect", " redirect response with error code:" + i18 + "error type" + i17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = sVar.f412329g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var = g1Var.f258065x.M1;
        l1Var.getClass();
        l1Var.g((int) (java.lang.System.currentTimeMillis() - l1Var.Q));
        r45.j37 j37Var = (r45.j37) sVar.K();
        vq4.d0.c("MicroMsg.Voip.Redirect", "room " + j37Var.f459078d + " member " + j37Var.f459084m + " key " + j37Var.f459083i + " relay addr cnt " + j37Var.f459079e + " RedirectThreshold " + j37Var.f459087p + " RedirectDecision " + j37Var.f459088q);
        r45.c27 c27Var = new r45.c27();
        r45.c27 c27Var2 = new r45.c27();
        r45.c27 c27Var3 = new r45.c27();
        c27Var.f452782d = j37Var.f459079e;
        java.util.LinkedList linkedList = j37Var.f459080f;
        c27Var.f452783e = linkedList;
        c27Var2.f452782d = j37Var.f459081g;
        c27Var2.f452783e = j37Var.f459082h;
        c27Var3.f452782d = j37Var.f459085n;
        java.util.LinkedList linkedList2 = j37Var.f459086o;
        c27Var3.f452783e = linkedList2;
        boolean z17 = j37Var.f459088q == 2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i3 i3Var = g1Var.B;
        r45.d37 d37Var = j37Var.f459089r;
        i3Var.getClass();
        gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g3(i3Var, d37Var, z17));
        r45.d37 d37Var2 = j37Var.f459089r;
        if ((d37Var2 == null || d37Var2.f453591m == 0) && j37Var.f459079e > 0) {
            vq4.d0.c("MicroMsg.Voip.Redirect", "use old method to add redirect conn");
            r45.do5 do5Var = new r45.do5();
            r45.co5 co5Var = new r45.co5();
            co5Var.f453257d = 0;
            co5Var.f453258e = "";
            co5Var.f453259f = "";
            co5Var.f453260g = vq4.d0.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            co5Var.f453261h = 4;
            co5Var.f453262i = 2;
            co5Var.f453263m = new r45.c27();
            r45.c27 c27Var4 = new r45.c27();
            co5Var.f453264n = c27Var4;
            r45.c27 c27Var5 = co5Var.f453263m;
            c27Var5.f452782d = j37Var.f459079e;
            c27Var5.f452783e = linkedList;
            c27Var4.f452782d = j37Var.f459085n;
            c27Var4.f452783e = linkedList2;
            do5Var.f454158e.add(co5Var);
            do5Var.f454157d = 1;
            try {
                bArr = do5Var.mo14344x5f01b1f6();
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.Redirect", "conn info to byte array fail..");
                bArr = null;
            }
            int m72777xf4d2fd75 = g1Var.f258065x.m72777xf4d2fd75(bArr, bArr.length, 1, z17);
            if (m72777xf4d2fd75 != 0) {
                vq4.d0.b("MicroMsg.Voip.Redirect", "redirect relay conns fail ret:" + m72777xf4d2fd75);
            }
        }
    }
}
