package ne1;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f418048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ne1.e f418049e;

    public d(ne1.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4) {
        this.f418049e = eVar;
        this.f418048d = c11809xbc286be4;
    }

    @Override // java.lang.Runnable
    public void run() {
        ne1.a aVar = new ne1.a(this);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h >= 654315264 && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(this.f418049e.f418050a.t3().f156338p.f158814g)) {
            this.f418049e.f418050a.t3().I1(aVar);
            return;
        }
        fl1.b bVar = new fl1.b(this.f418049e.f418050a.mo50352x76847179());
        bVar.setCanceledOnTouchOutside(false);
        bVar.setCancelable(false);
        bVar.t(this.f418049e.f418050a.mo50352x76847179().getString(this.f418049e.f418050a.t3().r2() ? com.p314xaae8f345.mm.R.C30867xcad56011.f571716n8 : com.p314xaae8f345.mm.R.C30867xcad56011.f571717n9, this.f418049e.f418050a.t3().u0().f158812e));
        ne1.b bVar2 = new ne1.b(this, aVar);
        if (this.f418049e.f418050a.t3().E0().f387385r.f156932d != 0) {
            bVar.z(com.p314xaae8f345.mm.R.C30867xcad56011.f571715n7, bVar2);
            bVar.u(com.p314xaae8f345.mm.R.C30867xcad56011.f571713n5, new ne1.c(this));
        } else {
            bVar.z(com.p314xaae8f345.mm.R.C30867xcad56011.f571714n6, bVar2);
        }
        this.f418049e.f418050a.mo50353x784fb1e3().c(bVar);
    }
}
