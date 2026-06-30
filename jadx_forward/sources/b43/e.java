package b43;

/* loaded from: classes4.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15805x42667c84 f99345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b43.f f99346e;

    public e(b43.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15805x42667c84 c15805x42667c84) {
        this.f99346e = fVar;
        this.f99345d = c15805x42667c84;
    }

    @Override // java.lang.Runnable
    public void run() {
        b43.f fVar = this.f99346e;
        fVar.f99350g = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15805x42667c84 c15805x42667c84 = this.f99345d;
        fVar.a(c15805x42667c84.f36835x3923b317, c15805x42667c84.seq, c15805x42667c84.f36836x14f51cd8);
    }
}
