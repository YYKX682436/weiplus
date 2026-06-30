package ea1;

/* loaded from: classes12.dex */
public class f extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public int f332048n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ea1.g f332049o;

    public f(ea1.g gVar) {
        this.f332049o = gVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "UpdateWeAppIndexTask";
    }

    @Override // p13.c
    public boolean i() {
        ((et.i2) ((ft.l4) i95.n0.c(ft.l4.class))).getClass();
        java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4> linkedList = new java.util.LinkedList();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj() != null) {
            java.util.ArrayList L0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f3.L0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().b1(null, 10000, 0, Integer.MAX_VALUE));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(L0)) {
                linkedList.addAll(L0);
            }
        }
        if (linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchWeAppLogic", "WeApp recent usage list is nil.");
            return true;
        }
        this.f332048n = linkedList.size();
        ea1.g gVar = this.f332049o;
        gVar.f332051f.h();
        gVar.f332051f.k(o13.d.f423751d);
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 c11712x63ef1ef4 : linkedList) {
            java.lang.String str = c11712x63ef1ef4.f157887v;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = str;
            int hashCode = str2.hashCode();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = hashCode;
            gVar.f332051f.u(393216, 1, j17, str2, currentTimeMillis, c11712x63ef1ef4.f157889x);
            ea1.h hVar = gVar.f332051f;
            java.lang.String str3 = c11712x63ef1ef4.f157889x;
            hVar.u(393216, 2, j17, str2, currentTimeMillis, o13.n.i(str3, false));
            gVar.f332051f.u(393216, 3, j17, str2, currentTimeMillis, o13.n.i(str3, true));
        }
        gVar.f332051f.j();
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{updateSize: %d}", java.lang.Integer.valueOf(this.f332048n));
    }
}
