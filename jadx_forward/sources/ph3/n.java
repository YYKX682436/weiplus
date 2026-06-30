package ph3;

/* loaded from: classes14.dex */
public class n implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph3.o f435970d;

    public n(ph3.o oVar) {
        this.f435970d = oVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        ph3.o oVar = this.f435970d;
        ph3.a aVar = oVar.f435984n;
        if (aVar == null) {
            return false;
        }
        int i17 = message.what;
        if (i17 == 1) {
            if (!aVar.m()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerImpl", "%s audio track prepare error, release now.", this.f435970d.j());
                this.f435970d.f435984n.o();
                ph3.o oVar2 = this.f435970d;
                oVar2.f435983m = true;
                oVar2.f435984n = null;
            }
            ph3.o oVar3 = this.f435970d;
            oVar3.k(oVar3.f435973c, android.os.SystemClock.elapsedRealtime(), 0L);
        } else if (i17 != 2) {
            if (i17 == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrackDataSource", "%s start to play", aVar.i());
                aVar.f435939f = false;
                aVar.t(3);
                aVar.w();
                ph3.o oVar4 = this.f435970d;
                oVar4.k(oVar4.f435973c, android.os.SystemClock.elapsedRealtime(), 0L);
            } else if (i17 == 4) {
                oVar.k(oVar.f435973c, android.os.SystemClock.elapsedRealtime(), 0L);
                this.f435970d.f435984n.l();
            } else if (i17 == 7) {
                aVar.o();
                ph3.o oVar5 = this.f435970d;
                oVar5.f435983m = true;
                oVar5.f435974d.mo50289x733c63a2(0).sendToTarget();
            }
        } else if (ph3.e.a(aVar.f435934a)) {
            this.f435970d.f435974d.mo50289x733c63a2(9).sendToTarget();
            this.f435970d.f435973c.mo50303x856b99f0(2);
        } else {
            if (this.f435970d.f435984n.f435934a == -1) {
                this.f435970d.f435971a.mo50290x733c63a2(-1, -1, -1).sendToTarget();
                this.f435970d.f435972b.mo50303x856b99f0(2);
            } else {
                ph3.o oVar6 = this.f435970d;
                if (oVar6.f435984n.c(oVar6.f435978h, oVar6.f435977g) == 2) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f435970d.f435974d;
                    n3Var.mo50311x7ab51103(n3Var.mo50289x733c63a2(2), 10L);
                }
                ph3.o oVar7 = this.f435970d;
                int i18 = oVar7.f435980j;
                if (i18 == 3) {
                    oVar7.k(oVar7.f435973c, android.os.SystemClock.elapsedRealtime(), this.f435970d.f435979i.f435926h);
                } else if (i18 == 5) {
                    oVar7.k(oVar7.f435973c, android.os.SystemClock.elapsedRealtime(), 0L);
                } else if (i18 == 1) {
                    oVar7.k(oVar7.f435973c, android.os.SystemClock.elapsedRealtime(), 0L);
                } else if (i18 == 0) {
                    oVar7.k(oVar7.f435973c, android.os.SystemClock.elapsedRealtime(), 0L);
                } else {
                    oVar7.f435973c.mo50303x856b99f0(2);
                }
            }
        }
        return false;
    }
}
