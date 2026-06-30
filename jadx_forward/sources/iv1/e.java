package iv1;

/* loaded from: classes8.dex */
public class e extends com.p314xaae8f345.mm.p971x6de15a2e.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iv1.f f376640d;

    public e(iv1.f fVar) {
        this.f376640d = fVar;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s0
    /* renamed from: onNetworkChange */
    public void mo8869xde9f63df(int i17) {
        iv1.f fVar = this.f376640d;
        fVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "notifyNetworkChange: " + i17);
        fv1.c cVar = fVar.f376644e;
        if (cVar != null) {
            try {
                cVar.X8(i17);
            } catch (android.os.RemoteException unused) {
            }
        }
    }
}
