package ph1;

/* loaded from: classes7.dex */
public class d0 implements ph1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ph1.i f435846b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ph1.g0 f435847c;

    public d0(ph1.g0 g0Var, java.lang.String str, ph1.i iVar) {
        this.f435847c = g0Var;
        this.f435845a = str;
        this.f435846b = iVar;
    }

    @Override // ph1.p
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f c11666xa31a0b7f) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "hy: on load module progress %s", c11666xa31a0b7f);
        java.util.Set d17 = this.f435847c.f435861e.d(this.f435845a);
        if (d17 == null) {
            return;
        }
        java.util.Iterator it = d17.iterator();
        while (it.hasNext()) {
            ph1.c cVar = ((ph1.f0) it.next()).f435854b;
            if (cVar != null) {
                cVar.a(c11666xa31a0b7f);
            }
        }
    }

    @Override // ph1.p
    public void b(boolean z17, java.util.List list) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "onLoad, module(%s) succeed(%b)", this.f435845a, java.lang.Boolean.valueOf(z17));
        this.f435846b.a(new ph1.c0(this, z17, list));
    }
}
