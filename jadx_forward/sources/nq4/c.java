package nq4;

/* loaded from: classes14.dex */
public final class c implements yx3.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nq4.a f420537a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f420538b;

    public c(nq4.a aVar, java.lang.String str) {
        this.f420537a = aVar;
        this.f420538b = str;
    }

    @Override // yx3.y
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPCallingTTSUtil", "TTSFilePlayer.OnPlayCompletionListener: dealWithError");
        java.lang.String str = this.f420538b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPCallingTTSUtil", "Remove TTS cache " + str + " result: " + com.p314xaae8f345.mm.vfs.w6.h(str));
    }

    @Override // yx3.y
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPCallingTTSUtil", "TTSFilePlayer.OnPlayCompletionListener: onUnLock");
        nq4.e.f420545e.set(false);
    }

    @Override // yx3.y
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPCallingTTSUtil", "TTSFilePlayer.OnPlayCompletionListener: onLock");
        nq4.e.f420545e.set(true);
    }

    @Override // yx3.y
    /* renamed from: onCompletion */
    public void mo149901xa6db431b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPCallingTTSUtil", "TTSFilePlayer.OnPlayCompletionListener: onCompletion");
        nq4.e.f420541a.a();
        nq4.a aVar = this.f420537a;
        if (aVar != null) {
            aVar.mo143892xc3989e01();
        }
        if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2538xd14fac7c.C20342x42bdd8c5()) == 1) {
            java.lang.String str = this.f420538b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPCallingTTSUtil", "Remove TTS cache " + str + " result: " + com.p314xaae8f345.mm.vfs.w6.h(str));
        }
    }

    @Override // yx3.y
    /* renamed from: onStart */
    public void mo149902xb05099c3() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPCallingTTSUtil", "TTSFilePlayer.OnPlayCompletionListener: onStart");
        nq4.f fVar = nq4.f.f420547a;
        nq4.f.f420552f = true;
    }
}
