package sl;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sl.h f490557d;

    public g(sl.h hVar) {
        this.f490557d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        sl.h hVar = this.f490557d;
        fl.a aVar = hVar.f490558d.f490559a.f490573m;
        aVar.a(aVar.f345223p);
        sl.i iVar = hVar.f490558d;
        sl.j jVar = iVar.f490559a;
        jVar.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.a(jVar.f490562b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "play sound end onCompletion");
            if (!iVar.f490559a.c()) {
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(iVar.f490559a.f490569i);
                iVar.f490559a.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "onCompletion() abandon focus, needFocusOnPlay: %s, hasAudioFocus: %s", valueOf, java.lang.Boolean.FALSE);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "onCompletion() continuousPlay:%s", java.lang.Boolean.valueOf(iVar.f490559a.f490563c));
                sl.j jVar2 = iVar.f490559a;
                jVar2.f490573m.E(jVar2.f490563c);
                iVar.f490559a.f490563c = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "onCompletion() resetSpeaker");
            }
        } else if (iVar.f490559a.f490561a == null || !j65.e.g()) {
            sl.j jVar3 = iVar.f490559a;
            android.content.Context context = jVar3.f490562b;
            boolean z17 = jVar3.f490573m.f345223p;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.q5 q5Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.q5(new sl.e(this));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.d6 d6Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.d6.f274057a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.d6.e(context, com.p314xaae8f345.mm.R.C30867xcad56011.hje, z17 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x5.f274618e : com.p314xaae8f345.mm.sdk.p2603x2137b148.x5.f274619f, -1, false, q5Var);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new sl.f(this));
    }
}
