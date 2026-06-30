package pe2;

/* loaded from: classes3.dex */
public final class e implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe2.h f435150d;

    public e(pe2.h hVar) {
        this.f435150d = hVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        mm2.f fVar = (mm2.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCheerAnimationPlugin", "onVideoPlayStateChange: " + fVar);
        int i17 = fVar == null ? -1 : pe2.d.f435149a[fVar.ordinal()];
        pe2.h hVar = this.f435150d;
        if (i17 == 1 || i17 == 2) {
            hVar.f435163p.setAlpha(1.0f);
        } else if (i17 == 3 || i17 == 4) {
            hVar.f435163p.setAlpha(0.0f);
        }
    }
}
