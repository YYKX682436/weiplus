package bk1;

/* loaded from: classes4.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk1.c f102821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1199x556c354a.C12700x2c4114f4 f102822e;

    public b(bk1.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1199x556c354a.C12700x2c4114f4 c12700x2c4114f4) {
        this.f102821d = cVar;
        this.f102822e = c12700x2c4114f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.l lVar = this.f102821d.f102825d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1199x556c354a.C12700x2c4114f4 c12700x2c4114f4 = this.f102822e;
        java.lang.String str = c12700x2c4114f4.f171047g;
        java.util.List<r45.vb> list = c12700x2c4114f4.f171048h;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (r45.vb vbVar : list) {
            r45.xf7 xf7Var = new r45.xf7();
            xf7Var.f471589d = vbVar.f469591d;
            xf7Var.f471590e = vbVar.f469592e;
            boolean z17 = true;
            if (1 != vbVar.f469593f) {
                z17 = false;
            }
            arrayList.add(new bk1.o(xf7Var, z17));
        }
        lVar.mo146xb9724478(new bk1.x(str, arrayList));
    }
}
