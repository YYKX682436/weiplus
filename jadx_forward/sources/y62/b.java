package y62;

/* loaded from: classes11.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y62.g f541160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ga f541161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.ext.p1401xd83027eb.C13508xbccd9e98 f541162f;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.ext.p1401xd83027eb.C13508xbccd9e98 c13508xbccd9e98, y62.g gVar, r45.ga gaVar) {
        this.f541162f = c13508xbccd9e98;
        this.f541160d = gVar;
        this.f541161e = gaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] getResultMode getVoiceControlResult");
        int i17 = this.f541161e.f456564e;
        y62.g gVar = this.f541160d;
        gVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] setGetResultTimeOut %s", java.lang.Integer.valueOf(i17));
        gVar.f541182s = i17;
        this.f541162f.n(gVar.f541174h, gVar.f541173g, gVar.f541175i);
    }
}
