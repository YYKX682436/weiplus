package b21;

/* loaded from: classes11.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b21.r f17333d;

    public j(b21.r rVar) {
        this.f17333d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.MusicActionEvent musicActionEvent = new com.tencent.mm.autogen.events.MusicActionEvent();
        am.gk gkVar = musicActionEvent.f54509g;
        gkVar.f6770a = 6;
        gkVar.f6771b = this.f17333d;
        musicActionEvent.e();
    }
}
