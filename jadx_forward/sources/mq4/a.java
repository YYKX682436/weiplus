package mq4;

/* loaded from: classes14.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.e37 f412314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mq4.b f412315e;

    public a(mq4.b bVar, r45.e37 e37Var) {
        this.f412315e = bVar;
        this.f412314d = e37Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.e37 e37Var = this.f412314d;
        r45.do5 do5Var = e37Var.M;
        mq4.b bVar = this.f412315e;
        if (do5Var == null || do5Var.f454157d == 0) {
            r45.co5 co5Var = new r45.co5();
            co5Var.f453257d = 0;
            co5Var.f453258e = "";
            co5Var.f453259f = "";
            co5Var.f453260g = bVar.f412316d.f412329g.f258065x.f258380g;
            co5Var.f453261h = 4;
            co5Var.f453262i = 2;
            co5Var.f453263m = e37Var.f454509g;
            co5Var.f453264n = e37Var.f454517r;
            r45.do5 do5Var2 = new r45.do5();
            e37Var.M = do5Var2;
            do5Var2.f454157d = 1;
            do5Var2.f454158e = new java.util.LinkedList();
            e37Var.M.f454158e.add(co5Var);
        }
        r45.ve0 ve0Var = e37Var.N;
        if (ve0Var == null || ve0Var.f469681d == 0) {
            r45.ue0 ue0Var = new r45.ue0();
            ue0Var.f468813d = 1;
            ue0Var.f468814e = "";
            ue0Var.f468815f = "";
            ue0Var.f468816g = bVar.f412316d.f412329g.f258065x.f258380g;
            ue0Var.f468817h = 4;
            ue0Var.f468818i = 2;
            ue0Var.f468819m = e37Var.f454510h;
            ue0Var.f468820n = e37Var.K;
            ue0Var.f468821o = e37Var.L;
            r45.ve0 ve0Var2 = new r45.ve0();
            e37Var.N = ve0Var2;
            ve0Var2.f469681d = 1;
            ve0Var2.f469682e = new java.util.LinkedList();
            e37Var.N.f469682e.add(ue0Var);
        }
        mq4.c cVar = bVar.f412316d;
        mq4.c cVar2 = bVar.f412316d;
        vq4.d0.c(cVar.f412318h, "relay conn cnt: " + e37Var.M.f454157d);
        try {
            cVar2.f412329g.f258065x.f258427v1 = e37Var.M.mo14344x5f01b1f6();
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(cVar2.f412318h, "relay conn info to byte array fail..");
        }
        try {
            cVar2.f412329g.f258065x.f258430w1 = e37Var.N.mo14344x5f01b1f6();
        } catch (java.lang.Exception unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(cVar2.f412318h, "direct conn info to byte array fail..");
        }
        try {
            r45.kj3 kj3Var = e37Var.P;
            if (kj3Var.f460271d > 0) {
                cVar2.f412329g.f258065x.f258433x1 = kj3Var.mo14344x5f01b1f6();
            }
        } catch (java.lang.Exception unused3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(cVar2.f412318h, "nic query info to byte array fail..");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = cVar2.f412329g;
        int i17 = e37Var.B;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62 = g1Var.f258065x;
        c18912x54425f62.f258367b1 = i17;
        c18912x54425f62.f258385h1 = e37Var.E;
        int i18 = e37Var.f454512m;
        int i19 = e37Var.f454513n;
        c18912x54425f62.A = i18;
        c18912x54425f62.B = i19;
        r45.cu5 cu5Var = e37Var.f454525z;
        if (cu5Var != null && e37Var.A != null) {
            int i27 = e37Var.f454524y;
            byte[] g17 = cu5Var.f453374f.g();
            byte[] g18 = e37Var.A.f453374f.g();
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f622 = g1Var.f258065x;
            c18912x54425f622.f258400m1 = i27;
            c18912x54425f622.f258403n1 = g17;
            c18912x54425f622.f258406o1 = g18;
        }
        vq4.d0.c(cVar2.f412318h, "ack success, try connect channel");
        cVar2.f412329g.J();
    }
}
