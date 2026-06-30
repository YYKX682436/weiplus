package kw4;

/* loaded from: classes8.dex */
public class h implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 f394710d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 c19252xb5f78ab1) {
        this.f394710d = c19252xb5f78ab1;
    }

    @Override // m34.e
    public void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "onSeekTo %d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 c19252xb5f78ab1 = this.f394710d;
        c19252xb5f78ab1.j(i17, false);
        c19252xb5f78ab1.f263603g.x();
        lw4.j jVar = c19252xb5f78ab1.H;
        if (jVar != null) {
            jVar.i();
        }
    }

    @Override // m34.e
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "onSeekPre");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f394710d.f263603g.L;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    @Override // m34.e
    public void d(int i17) {
    }
}
