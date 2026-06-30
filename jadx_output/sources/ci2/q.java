package ci2;

/* loaded from: classes10.dex */
public final class q implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView f41696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f41697e;

    public q(com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView, yz5.a aVar) {
        this.f41696d = liveVoiceRoomLayoutView;
        this.f41697e = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.ViewTreeObserver viewTreeObserver = this.f41696d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.f41697e.invoke();
        return true;
    }
}
