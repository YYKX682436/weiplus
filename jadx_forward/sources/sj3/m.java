package sj3;

/* loaded from: classes14.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.n f490160d;

    public m(sj3.n nVar) {
        this.f490160d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        sj3.n nVar = this.f490160d;
        nVar.f490177d.f231843f.setTag(java.lang.Boolean.TRUE);
        nVar.f490177d.f231853s.setTag(java.lang.Boolean.FALSE);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16584x79838812 c16584x79838812 = nVar.f490177d;
        c16584x79838812.a(c16584x79838812.f231846i);
        nVar.f490177d.f231844g.setAlpha(0.0f);
        nVar.f490177d.f231844g.animate().alpha(1.0f).setDuration(nVar.f490177d.f231842e).start();
        nVar.f490177d.f();
        if (nVar.f490177d.f231852r == null || com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231712v) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.g(1, nVar.f490177d.f231852r, 2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231712v = true;
    }
}
