package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.d37 f258030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f258031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i3 f258032f;

    public f3(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i3 i3Var, r45.d37 d37Var, boolean z17) {
        this.f258032f = i3Var;
        this.f258030d = d37Var;
        this.f258031e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr;
        r45.d37 d37Var = this.f258030d;
        if (d37Var == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("__onGotNewConnData begin local conn set seq ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i3 i3Var = this.f258032f;
        sb6.append(i3Var.f258210a.K);
        sb6.append(" recv conn set seq ");
        sb6.append(d37Var.f453591m);
        vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", sb6.toString());
        int i17 = d37Var.f453591m;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = i3Var.f258210a;
        if (i17 <= g1Var.K) {
            vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "the recieved conn set is too old");
            return;
        }
        g1Var.K = i17;
        vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "new relay conn cnt: " + d37Var.f453585d.f454157d + " new direct conn cnt: " + d37Var.f453586e.f469681d);
        byte[] bArr2 = null;
        try {
            bArr = d37Var.f453585d.mo14344x5f01b1f6();
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.VoipSyncHandle", "conn info to byte array fail..");
            bArr = null;
        }
        int m72777xf4d2fd75 = i3Var.f258210a.f258065x.m72777xf4d2fd75(bArr, bArr.length, 0, false);
        if (m72777xf4d2fd75 != 0) {
            vq4.d0.b("MicroMsg.Voip.VoipSyncHandle", "add new relay conns fail ret:" + m72777xf4d2fd75);
        }
        try {
            bArr2 = d37Var.f453586e.mo14344x5f01b1f6();
        } catch (java.lang.Exception unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.VoipSyncHandle", "conn info to byte array fail..");
        }
        int m72776x30b8c57f = i3Var.f258210a.f258065x.m72776x30b8c57f(bArr2, bArr2.length, 0);
        if (m72776x30b8c57f != 0) {
            vq4.d0.b("MicroMsg.Voip.VoipSyncHandle", "add new direct conns fail ret:" + m72776x30b8c57f);
        }
        for (int i18 = 0; i18 < d37Var.f453587f; i18++) {
            int m72775xc28d9adf = i3Var.f258210a.f258065x.m72775xc28d9adf(((java.lang.Integer) d37Var.f453588g.get(i18)).intValue());
            if (m72775xc28d9adf != 0) {
                vq4.d0.b("MicroMsg.Voip.VoipSyncHandle", "activate conn " + d37Var.f453588g.get(i18) + " ret:" + m72775xc28d9adf);
            }
        }
        for (int i19 = 0; i19 < d37Var.f453589h; i19++) {
            int m72782x9d4d9084 = i3Var.f258210a.f258065x.m72782x9d4d9084(((java.lang.Integer) d37Var.f453590i.get(i19)).intValue());
            if (m72782x9d4d9084 != 0) {
                vq4.d0.b("MicroMsg.Voip.VoipSyncHandle", "inactivate conn " + d37Var.f453590i.get(i19) + " ret:" + m72782x9d4d9084);
            }
        }
        vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "redirect relay conn cnt: " + d37Var.f453592n.f454157d);
        r45.do5 do5Var = d37Var.f453592n;
        if (do5Var.f454157d > 0) {
            try {
                bArr = do5Var.mo14344x5f01b1f6();
            } catch (java.lang.Exception unused3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.VoipSyncHandle", "conn info to byte array fail..");
            }
            int m72777xf4d2fd752 = i3Var.f258210a.f258065x.m72777xf4d2fd75(bArr, bArr.length, 1, this.f258031e);
            if (m72777xf4d2fd752 != 0) {
                vq4.d0.b("MicroMsg.Voip.VoipSyncHandle", "redirect relay conns fail ret:" + m72777xf4d2fd752);
            }
        }
        vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "__onGotNewConnData end");
    }
}
