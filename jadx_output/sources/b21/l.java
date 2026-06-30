package b21;

/* loaded from: classes11.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f17335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17336e;

    public l(java.util.List list, int i17) {
        this.f17335d = list;
        this.f17336e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.MusicActionEvent musicActionEvent = new com.tencent.mm.autogen.events.MusicActionEvent();
        am.gk gkVar = musicActionEvent.f54509g;
        gkVar.f6770a = 4;
        gkVar.f6772c = this.f17335d;
        gkVar.f6773d = this.f17336e;
        musicActionEvent.e();
    }
}
