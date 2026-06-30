package cp2;

/* loaded from: classes2.dex */
public final class i1 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cp2.q1 f302355a;

    public i1(cp2.q1 q1Var) {
        this.f302355a = q1Var;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        ((cp2.v0) this.f302355a.f302417f).m122379x905893fc();
    }

    @Override // qn5.c
    /* renamed from: onLoadMore */
    public boolean mo15402x1318b45a() {
        cp2.v0 v0Var = (cp2.v0) this.f302355a.f302417f;
        qq2.b bVar = v0Var.f302471r;
        if (bVar != null && bVar.f447470h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "onLoadMore return for is preloading.");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "onLoadMore.");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc = v0Var.f302476w;
            if (c14500x958689dc != null) {
                c14500x958689dc.mo56123x84fe90a(v0Var.f302467n);
            }
        }
        return true;
    }
}
