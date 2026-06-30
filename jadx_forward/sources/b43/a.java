package b43;

/* loaded from: classes4.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15767x606ff34d f99327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b43.b f99328e;

    public a(b43.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15767x606ff34d c15767x606ff34d) {
        this.f99328e = bVar;
        this.f99327d = c15767x606ff34d;
    }

    @Override // java.lang.Runnable
    public void run() {
        b43.b bVar = this.f99328e;
        bVar.f99332g = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15767x606ff34d c15767x606ff34d = this.f99327d;
        bVar.a(c15767x606ff34d.f36701x3923b317, c15767x606ff34d.f36702x14f51cd8);
    }
}
