package b21;

/* loaded from: classes11.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f17330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f17331e;

    public b(java.util.List list, boolean z17) {
        this.f17330d = list;
        this.f17331e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.MusicActionEvent musicActionEvent = new com.tencent.mm.autogen.events.MusicActionEvent();
        am.gk gkVar = musicActionEvent.f54509g;
        gkVar.f6770a = 5;
        gkVar.f6772c = this.f17330d;
        gkVar.f6774e = this.f17331e;
        musicActionEvent.e();
    }
}
