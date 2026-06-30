package b43;

/* loaded from: classes4.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15773xdaadaafa f99333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b43.d f99334e;

    public c(b43.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15773xdaadaafa c15773xdaadaafa) {
        this.f99334e = dVar;
        this.f99333d = c15773xdaadaafa;
    }

    @Override // java.lang.Runnable
    public void run() {
        b43.d dVar = this.f99334e;
        dVar.f99340i = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15773xdaadaafa c15773xdaadaafa = this.f99333d;
        dVar.a(c15773xdaadaafa.f36721xa4e10cc6, dVar.f99341m, c15773xdaadaafa.f36724x14f51cd8);
    }
}
