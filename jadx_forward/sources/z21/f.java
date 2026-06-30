package z21;

/* loaded from: classes12.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z21.z f551103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z21.h f551104e;

    public f(z21.h hVar, z21.z zVar) {
        this.f551104e = hVar;
        this.f551103d = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        z21.z zVar = this.f551103d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewVoiceInput", "real doLastScene voiceId:%s, voiceFileMarkEnd:%s,hashCode:%s", zVar.f551235a, java.lang.Integer.valueOf(zVar.f551238d), java.lang.Integer.valueOf(this.f551104e.hashCode()));
        com.p314xaae8f345.mm.p971x6de15a2e.s m47995xb7ba1aa7 = this.f551104e.m47995xb7ba1aa7();
        if (m47995xb7ba1aa7 != null) {
            z21.h hVar = this.f551104e;
            hVar.mo807x6c193ac1(m47995xb7ba1aa7, hVar.f551109d);
        }
    }
}
