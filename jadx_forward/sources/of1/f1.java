package of1;

/* loaded from: classes7.dex */
public final class f1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.w1 f426446d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(of1.w1 w1Var) {
        super(0);
        this.f426446d = w1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        si1.g gVar;
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.j.f34989x24728b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f426446d.f426567e;
        boolean z17 = false;
        if (n7Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = n7Var.mo32091x9a3f0ba2();
            ze.n nVar = mo32091x9a3f0ba2 instanceof ze.n ? (ze.n) mo32091x9a3f0ba2 : null;
            if (nVar != null && (gVar = nVar.X1) != null) {
                z17 = gVar.a(n7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.j.class);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.EnableAutoplayPolicy", "enableAutoPlay appId:" + n7Var.mo48798x74292566() + " isSupport:" + z17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.EnableAutoplayPolicy", "enableAutoPlay fail, component is null");
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
