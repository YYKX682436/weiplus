package ko3;

/* loaded from: classes13.dex */
public class v implements android.media.AudioManager.OnModeChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ko3.w f391560a;

    public v(ko3.w wVar) {
        this.f391560a = wVar;
    }

    @Override // android.media.AudioManager.OnModeChangedListener
    public void onModeChanged(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16751xb808cbcb c16751xb808cbcb;
        com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16751xb808cbcb c16751xb808cbcb2 = this.f391560a.f391563d;
        synchronized (c16751xb808cbcb2) {
            c16751xb808cbcb2.f233936f = c16751xb808cbcb2.f233934d;
            c16751xb808cbcb2.f233937g = c16751xb808cbcb2.f233935e;
            c16751xb808cbcb2.f233934d = i17;
            c16751xb808cbcb2.f233935e = java.lang.System.currentTimeMillis() / 1000;
        }
        w04.l lVar = w04.l.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16751xb808cbcb c16751xb808cbcb3 = this.f391560a.f391563d;
        synchronized (c16751xb808cbcb3) {
            c16751xb808cbcb = new com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16751xb808cbcb();
            c16751xb808cbcb.f233934d = c16751xb808cbcb3.f233934d;
            c16751xb808cbcb.f233935e = c16751xb808cbcb3.f233935e;
            c16751xb808cbcb.f233936f = c16751xb808cbcb3.f233936f;
            c16751xb808cbcb.f233937g = c16751xb808cbcb3.f233937g;
        }
        lVar.G7(540999712, c16751xb808cbcb);
    }
}
