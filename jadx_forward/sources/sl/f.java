package sl;

/* loaded from: classes12.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sl.g f490556d;

    public f(sl.g gVar) {
        this.f490556d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        sl.g gVar = this.f490556d;
        if (gVar.f490557d.f490558d.f490559a.f490576p == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneVoicePlayer", "intOnCompletion is null!!!");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "intOnCompletion onCompletion()");
            gVar.f490557d.f490558d.f490559a.f490576p.mo11229xa6db431b();
        }
    }
}
