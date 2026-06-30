package ca5;

/* loaded from: classes14.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d f121607d;

    public a(com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d) {
        this.f121607d = c21330xc127fb4d;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTrans2Txt.SoundWaveView", "active waiting!!!");
        ca5.i iVar = ca5.i.WAITING;
        com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d = this.f121607d;
        c21330xc127fb4d.f277961e = iVar;
        c21330xc127fb4d.C = -1;
        c21330xc127fb4d.f();
        java.util.Iterator it = c21330xc127fb4d.f277964h.iterator();
        while (it.hasNext()) {
            ((android.animation.AnimatorSet) it.next()).end();
        }
        java.util.Iterator it6 = c21330xc127fb4d.f277964h.iterator();
        while (it6.hasNext()) {
            ((android.animation.AnimatorSet) it6.next()).start();
        }
    }
}
