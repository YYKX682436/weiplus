package hn4;

/* loaded from: classes15.dex */
public class l implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hn4.z f364118d;

    public l(hn4.z zVar) {
        this.f364118d = zVar;
    }

    @Override // m34.e
    public void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onSeekTo %d", java.lang.Integer.valueOf(i17));
        hn4.z zVar = this.f364118d;
        zVar.f(i17);
        hn4.c0 c0Var = zVar.G;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = c0Var.F;
        if (b4Var != null) {
            b4Var.d();
            c0Var.F.c(2000L, 2000L);
        }
        uu4.a.a(22);
    }

    @Override // m34.e
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onSeekPre");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f364118d.G.F;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    @Override // m34.e
    public void d(int i17) {
    }
}
