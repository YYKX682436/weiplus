package fn4;

/* loaded from: classes15.dex */
public class d1 implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn4.l1 f346021d;

    public d1(fn4.l1 l1Var) {
        this.f346021d = l1Var;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "onFocusChange onPause: ");
        this.f346021d.l(true);
    }

    @Override // f25.f
    /* renamed from: onResume */
    public void mo44161x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "onFocusChange onResume: ");
        this.f346021d.l(false);
    }

    @Override // f25.f
    /* renamed from: onStop */
    public void mo44162xc39f8281() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "onFocusChange onStop: ");
        this.f346021d.h();
    }
}
