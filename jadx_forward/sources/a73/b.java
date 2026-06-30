package a73;

/* loaded from: classes15.dex */
public class b implements b73.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1772x193c2b20.C16082xfb3f4f99 f83462a;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1772x193c2b20.C16082xfb3f4f99 c16082xfb3f4f99) {
        this.f83462a = c16082xfb3f4f99;
    }

    @Override // b73.g
    public void a(b73.j jVar) {
        if (jVar.f99755a == 0) {
            gm0.j1.e().g(new a73.a(this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GWalletQueryProvider", "Problem setting up in-app billing: " + jVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1772x193c2b20.C16082xfb3f4f99 c16082xfb3f4f99 = this.f83462a;
        c16082xfb3f4f99.f223773e = false;
        b73.i iVar = c16082xfb3f4f99.f223772d;
        if (iVar != null) {
            iVar.d();
        }
        c16082xfb3f4f99.f223772d = null;
    }
}
