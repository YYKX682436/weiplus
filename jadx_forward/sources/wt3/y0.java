package wt3;

/* loaded from: classes10.dex */
public final class y0 implements ek4.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wt3.c1 f531055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f531056b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dk4.a f531057c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f531058d;

    public y0(wt3.c1 c1Var, java.lang.String str, dk4.a aVar, yz5.p pVar) {
        this.f531055a = c1Var;
        this.f531056b = str;
        this.f531057c = aVar;
        this.f531058d = pVar;
    }

    @Override // ek4.x
    public void a(int i17, dn.o oVar, dn.h hVar) {
        wt3.c1.a(this.f531055a);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[cacheAudio] onStop, mediaId:");
        sb6.append(this.f531056b);
        sb6.append(", ret:");
        sb6.append(i17);
        sb6.append(", sceneResult:");
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.f69553xb5f54fe9) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryAudioManager", sb6.toString());
        yz5.p pVar = this.f531058d;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.FALSE, null);
        }
    }

    @Override // ek4.x
    public void b(int i17, dn.o oVar) {
        dk4.a aVar = this.f531057c;
        java.lang.String str = this.f531056b;
        wt3.c1 c1Var = this.f531055a;
        if (i17 == 0) {
            wt3.c1.a(c1Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryAudioManager", "[cacheAudio] start stream download ringtone success, mediaId:" + str + ", path:" + aVar.f316016t);
            return;
        }
        yz5.p pVar = this.f531058d;
        if (i17 != 1) {
            wt3.c1.a(c1Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryAudioManager", "[cacheAudio] start cacheAudio onStart " + str + " fail: " + i17);
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Boolean.FALSE, null);
                return;
            }
            return;
        }
        wt3.c1.a(c1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryAudioManager", "[cacheAudio] start stream download ringtone success, hit cache, mediaId:" + str + ", path:" + aVar.f316016t);
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.TRUE, aVar.f316016t);
        }
    }
}
