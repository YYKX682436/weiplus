package ym5;

/* loaded from: classes10.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.h f544991d;

    public p(ym5.h hVar) {
        this.f544991d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        l45.n nVar = (l45.n) this.f544991d.m177317xc879b3f2();
        nVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DrawingPresenter", "[onAttachedToWindow]");
        if (nVar.f398015w) {
            return;
        }
        nVar.f398015w = true;
        java.util.Iterator it = nVar.f397996d.iterator();
        while (it.hasNext()) {
            dl.b bVar = (dl.b) it.next();
            if (com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2.a().d(bVar.m())) {
                bVar.t();
                bVar.E(true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DrawingPresenter", "[onAttachedToWindow] %s is revert onAlive!", bVar.m());
            }
        }
        if (nVar.f397993a.m177310x5143ab24().f()) {
            nVar.f397993a.m177310x5143ab24().a();
            nVar.f397993a.m177310x5143ab24().invalidate();
        }
    }
}
