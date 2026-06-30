package b21;

/* loaded from: classes11.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b21.p f17332d;

    public c(b21.p pVar) {
        this.f17332d = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.MusicActionEvent musicActionEvent = new com.tencent.mm.autogen.events.MusicActionEvent();
        am.gk gkVar = musicActionEvent.f54509g;
        gkVar.f6770a = 13;
        gkVar.f6777h = this.f17332d;
        musicActionEvent.e();
    }
}
