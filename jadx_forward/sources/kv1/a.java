package kv1;

/* loaded from: classes8.dex */
public class a extends java.util.HashSet {

    /* renamed from: d, reason: collision with root package name */
    public final kv1.b f394181d;

    public a(kv1.b bVar) {
        this.f394181d = bVar;
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public synchronized boolean add(java.lang.Object obj) {
        boolean add;
        add = super.add(obj);
        d();
        return add;
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        super.clear();
        synchronized (this) {
            iv1.a aVar = (iv1.a) this.f394181d;
            aVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "notify clear");
            iv1.f fVar = aVar.f376636a;
            iv1.f.a(fVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "stopCheckProcessActiveTimer");
            fVar.f376649m.d();
        }
    }

    public final synchronized void d() {
        iv1.a aVar = (iv1.a) this.f394181d;
        aVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "notify add");
        iv1.f fVar = aVar.f376636a;
        fVar.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "startCheckProcessActiveTimer");
        fVar.f376649m.c(20000L, 20000L);
    }

    public final synchronized void e() {
        iv1.a aVar = (iv1.a) this.f394181d;
        aVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "notify remove");
        iv1.f fVar = aVar.f376636a;
        if (((java.util.HashSet) fVar.f376646g).size() == 0) {
            iv1.f.a(fVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "stopCheckProcessActiveTimer");
            fVar.f376649m.d();
        }
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public synchronized boolean remove(java.lang.Object obj) {
        boolean remove;
        remove = super.remove(obj);
        e();
        return remove;
    }
}
