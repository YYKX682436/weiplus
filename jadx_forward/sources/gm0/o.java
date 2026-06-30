package gm0;

/* loaded from: classes8.dex */
public class o extends com.p314xaae8f345.mm.p971x6de15a2e.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gm0.y f354797d;

    public o(gm0.y yVar) {
        this.f354797d = yVar;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s0
    /* renamed from: onNetworkChange */
    public void mo8869xde9f63df(int i17) {
        try {
            for (fs.q qVar : ((fs.c) fs.g.f(hm0.w.class)).all()) {
                if (fs.g.d(fs.g.f347619c, qVar)) {
                    ((hm0.w) ((fs.n) qVar.get())).mo1990xde9f63df(i17);
                }
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            synchronized (this.f354797d.f354822c) {
                hashSet.addAll(this.f354797d.f354822c);
            }
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p971x6de15a2e.s0) it.next()).mo8869xde9f63df(i17);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MMKernel.CoreNetwork", e17, "onNetworkChange caught crash", new java.lang.Object[0]);
        }
    }
}
