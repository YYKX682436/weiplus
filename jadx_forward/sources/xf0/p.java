package xf0;

/* loaded from: classes12.dex */
public final class p implements com.p314xaae8f345.mm.p947xba6de98f.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xf0.i f535741a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xf0.s f535742b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dn.o f535743c;

    public p(xf0.i iVar, xf0.s sVar, dn.o oVar) {
        this.f535741a = iVar;
        this.f535742b = sVar;
        this.f535743c = oVar;
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.v2
    public void a(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
        dn.h hVar;
        t21.v2 v2Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloadMsgVideo[");
        xf0.i iVar = this.f535741a;
        sb6.append(iVar.f535715j);
        sb6.append("] onEnd: ");
        sb6.append(n1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.Receive.MsgVideoSyncDownloadFSC", sb6.toString());
        if (n1Var == null || (hVar = n1Var.f152641f) == null) {
            return;
        }
        if (hVar.f69553xb5f54fe9 == 0) {
            iVar.f535717l.put("actual_video_format", java.lang.Integer.valueOf(hVar.f69571x9373c88d));
        }
        if (!iVar.f535713h || (v2Var = iVar.f535712g) == null) {
            return;
        }
        if (hVar.f69553xb5f54fe9 != 0) {
            if (iVar.f535723r) {
                return;
            }
            v2Var.f496544i = nd1.d1.f72919x366c91de;
            v2Var.U = 256;
            vf0.m3.k(v2Var);
            return;
        }
        v2Var.f496544i = 199;
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(this.f535743c.f69595x6d25b0d9);
        int i17 = (int) k17;
        v2Var.f496540e = i17;
        v2Var.f496541f = i17;
        v2Var.U = v2Var.U | 256 | 16 | 32;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.Receive.MsgVideoSyncDownloadFSC", "update video info totalLen=" + k17);
        vf0.m3.k(v2Var);
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.v2
    public void b(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
        dn.g gVar;
        dn.g gVar2;
        xf0.i iVar = this.f535741a;
        java.lang.String str = iVar.f535715j;
        java.util.Objects.toString(n1Var);
        long j17 = (n1Var == null || (gVar2 = n1Var.f152640e) == null) ? 0L : gVar2.f69496x83ec3dd;
        long j18 = (n1Var == null || (gVar = n1Var.f152640e) == null) ? 0L : gVar.f69500x8ab84c59;
        float e17 = j18 > 0 ? e06.p.e(((float) j17) / ((float) j18), 0.0f, 1.0f) : 0.0f;
        xf0.g gVar3 = new xf0.g(iVar, xf0.h.f535703e);
        gVar3.f535701c = e17;
        this.f535742b.W6(gVar3);
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.v2
    public void c(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloadMsgVideo[");
        xf0.i iVar = this.f535741a;
        sb6.append(iVar.f535715j);
        sb6.append("] onStart: ");
        sb6.append(n1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.Receive.MsgVideoSyncDownloadFSC", sb6.toString());
        this.f535742b.W6(new xf0.g(iVar, xf0.h.f535702d));
    }
}
