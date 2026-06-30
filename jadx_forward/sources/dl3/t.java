package dl3;

/* loaded from: classes13.dex */
public class t implements com.p314xaae8f345.mm.sdk.p2603x2137b148.h5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dl3.i f316879a;

    public t(dl3.i iVar) {
        this.f316879a = iVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.h5
    public void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "onPhoneCall state:%d", java.lang.Integer.valueOf(i17));
        synchronized (this.f316879a.f316865y) {
            java.util.Iterator it = this.f316879a.f316865y.iterator();
            while (it.hasNext()) {
                dl3.v vVar = (dl3.v) ((dl3.w) it.next());
                vVar.getClass();
                if (i17 != 0) {
                    if (i17 == 1 || i17 == 2) {
                        dl3.d0 d0Var = (dl3.d0) vVar;
                        if (d0Var.i()) {
                            vVar.f316880a = true;
                            d0Var.mo67220x65825f6();
                        }
                    }
                } else if (vVar.f316880a) {
                    vVar.f316880a = false;
                    ((dl3.d0) vVar).mo67221xc84dc82d();
                }
            }
        }
    }
}
