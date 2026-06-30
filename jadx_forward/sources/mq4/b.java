package mq4;

/* loaded from: classes14.dex */
public class b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq4.c f412316d;

    public b(mq4.c cVar) {
        this.f412316d = cVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        r45.cu5 cu5Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3;
        mq4.c cVar = this.f412316d;
        java.lang.String str2 = cVar.f412318h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ack response:");
        sb6.append(i17);
        sb6.append(" errCode:");
        sb6.append(i18);
        sb6.append(" status:");
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = cVar.f412329g;
        sb6.append(g1Var.f258041a);
        vq4.d0.c(str2, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var = g1Var.f258065x.M1;
        l1Var.getClass();
        l1Var.g((int) (java.lang.System.currentTimeMillis() - l1Var.K));
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var2 = g1Var.f258065x.M1;
        l1Var2.getClass();
        l1Var2.L = java.lang.System.currentTimeMillis();
        int i19 = g1Var.f258041a;
        java.lang.String str3 = cVar.f412318h;
        if (i19 == 1) {
            vq4.d0.c(str3, "reject ok!");
            return;
        }
        if (i19 != 3 && (i19 != 4 || g1Var.f258049h)) {
            vq4.d0.b(str3, "ack response not within WAITCONNECT, ignored.");
            return;
        }
        vq4.d0.c(str3, "current status:" + g1Var.f258041a + " isCanSendData:" + g1Var.f258049h);
        if (i17 == 0 || i17 == 4) {
            r45.a27 a27Var = (r45.a27) cVar.K();
            vq4.d0.c(str3, "ack cur roomid " + g1Var.f258065x.f258410q + " ack resp roomid " + a27Var.f451206d);
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62 = g1Var.f258065x;
            int i27 = c18912x54425f62.f258410q;
            if (i27 != 0) {
                long j17 = c18912x54425f62.f258416s;
                if (j17 != 0 && (i27 != a27Var.f451206d || j17 != a27Var.f451207e)) {
                    vq4.d0.c(str3, "ack resp ignore invalid roomid, cur roomid " + g1Var.f258065x.f258410q + " ack resp roomid " + a27Var.f451206d);
                    return;
                }
            }
            if (i17 == 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var3 = c18912x54425f62.M1;
                l1Var3.f258246a = 12;
                l1Var3.f258248b = i18;
                g1Var.v(1, i18, "", -1);
                return;
            }
            c18912x54425f62.f258409p1 = a27Var.f451218s;
            int i28 = a27Var.f451219t;
            c18912x54425f62.f258415r1 = i28;
            if (i28 > 0) {
                c18912x54425f62.f258412q1 = true;
            }
            if (a27Var.f451210h != 1) {
                vq4.d0.c(str3, "onVoipAckResp: do not use preconnect");
                return;
            }
            g1Var.f258051j = true;
            c18912x54425f62.K0 = 1;
            c18912x54425f62.f258410q = a27Var.f451206d;
            c18912x54425f62.f258416s = a27Var.f451207e;
            c18912x54425f62.f258413r = a27Var.f451208f;
            c18912x54425f62.D = a27Var.f451213n;
            c18912x54425f62.E = a27Var.f451216q;
            c18912x54425f62.I = a27Var.f451214o;
            c18912x54425f62.Q0 = a27Var.f451220u;
            c18912x54425f62.C = a27Var.f451211i;
            vq4.d0.c(str3, "ack ok, roomid =" + g1Var.f258065x.f258410q + ",memberid = " + g1Var.f258065x.f258413r + " enable data accept " + g1Var.f258065x.f258409p1 + " rudp accept th" + g1Var.f258065x.f258415r1);
            r45.e37 e37Var = a27Var.f451209g;
            int i29 = e37Var.f454523x;
            if (i29 > 0) {
                e37Var.f454523x = i29 - 1;
                vq4.d0.c(str3, "zhengxue[ENCRYPT] got encryptStrategy[" + e37Var.f454523x + "] from ackresp relaydata");
            } else {
                e37Var.f454523x = 1;
                vq4.d0.c(str3, "zhengxue[LOGIC]:got no EncryptStrategy in ackresp mrdata");
            }
            vq4.d0.c(str3, "ack with switchtcpcnt  =" + g1Var.f258065x.C + " RedirectReqThreshold =" + e37Var.E + " BothSideSwitchFlag =" + e37Var.F + " WifiScanInterval =" + a27Var.f451214o);
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f622 = g1Var.f258065x;
            c18912x54425f622.f258388i1 = e37Var.F;
            r45.cu5 cu5Var2 = e37Var.H;
            if (cu5Var2 != null && (gVar3 = cu5Var2.f453374f) != null) {
                c18912x54425f622.F = gVar3.g();
            }
            r45.cu5 cu5Var3 = a27Var.f451217r;
            if (cu5Var3 != null && (gVar2 = cu5Var3.f453374f) != null) {
                g1Var.f258065x.G = gVar2.g();
            }
            int i37 = e37Var.f454508f;
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f623 = g1Var.f258065x;
            c18912x54425f623.M1.f258253g = (byte) 1;
            c18912x54425f623.f258437z = i37;
            g1Var.N(e37Var.f454506d.f459877e.f453374f.g());
            g1Var.B();
            r45.cu5 cu5Var4 = e37Var.f454515p;
            if (cu5Var4 != null && (gVar = cu5Var4.f453374f) != null && (cu5Var = e37Var.C) != null && cu5Var.f453374f != null) {
                byte[] g17 = gVar.g();
                int i38 = e37Var.f454514o;
                int i39 = e37Var.f454523x;
                byte[] g18 = e37Var.C.f453374f.g();
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f624 = g1Var.f258065x;
                c18912x54425f624.f258431x = i38;
                c18912x54425f624.f258434y = g17;
                c18912x54425f624.f258379f1 = i39;
                c18912x54425f624.f258382g1 = g18;
            }
            int i47 = e37Var.f454518s;
            int i48 = e37Var.f454519t;
            int i49 = e37Var.f454520u;
            int i57 = e37Var.f454521v;
            int i58 = e37Var.f454522w;
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f625 = g1Var.f258065x;
            c18912x54425f625.W0 = i47;
            c18912x54425f625.X0 = i48;
            c18912x54425f625.Y0 = i49;
            c18912x54425f625.Z0 = i57;
            c18912x54425f625.f258364a1 = i58;
            g1Var.M(e37Var.f454507e.f459877e.f453374f.g());
            gm0.j1.e().j(new mq4.a(this, e37Var));
        }
    }
}
