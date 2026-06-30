package ci2;

/* loaded from: classes10.dex */
public final class f implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView f41678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f41679e;

    public f(com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView, yz5.a aVar) {
        this.f41678d = liveVoiceRoomLayoutView;
        this.f41679e = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.ViewTreeObserver viewTreeObserver = this.f41678d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.f41679e.invoke();
        return true;
    }
}
