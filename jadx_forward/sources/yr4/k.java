package yr4;

/* loaded from: classes9.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr4.u f546638d;

    public k(yr4.u uVar) {
        this.f546638d = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        yr4.u uVar = this.f546638d;
        java.util.Iterator it = ((java.util.ArrayList) uVar.f546643d).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = (com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) ((java.lang.ref.WeakReference) it.next()).get();
            if (abstractActivityC22902xe37969e != null && !abstractActivityC22902xe37969e.m83112xd8fa2fcd()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "do finish activity: %s", abstractActivityC22902xe37969e);
                abstractActivityC22902xe37969e.finish();
            }
        }
        ((java.util.ArrayList) uVar.f546643d).clear();
    }
}
