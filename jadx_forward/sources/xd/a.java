package xd;

/* loaded from: classes7.dex */
public class a extends xd.h {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 f535139a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f535140b;

    public a(xd.e eVar) {
        super(eVar);
        wd.e eVar2 = (wd.e) eVar;
        this.f535140b = eVar2.f526216a.get() != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) eVar2.f526216a.get()).f156336n : "";
        java.lang.ref.WeakReference weakReference = eVar2.f526216a;
        this.f535139a = weakReference.get() != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) weakReference.get()).mo48802x59eafec1() : null;
    }

    @Override // h8.c
    public java.lang.String a() {
        return "appbrand_file";
    }

    @Override // h8.c
    /* renamed from: accept */
    public boolean mo127722xab27b508(java.lang.Object obj) {
        return true;
    }

    @Override // h8.c
    public h8.b b(java.lang.Object obj, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab c1592x888963ab) {
        h8.b bVar = new h8.b();
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var = this.f535139a;
        if (u1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandFileSystemImageStreamFetcher", "fetch %s, appId[%s] fs NULL", str, this.f535140b);
            bVar.f361045b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a17);
            return bVar;
        }
        ik1.b0 b0Var = new ik1.b0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49307xcc440832 = u1Var.mo49307xcc440832(str, b0Var);
        if (mo49307xcc440832 != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK || b0Var.f373357a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandFileSystemImageStreamFetcher", "fetch %s, ret %s, appId[%s]", str, mo49307xcc440832.name(), this.f535140b);
            bVar.f361045b = java.lang.String.format(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572162a16), mo49307xcc440832.name());
        } else {
            bVar.f361044a = new nf.a((java.nio.ByteBuffer) b0Var.f373357a);
        }
        return bVar;
    }
}
