package td1;

/* loaded from: classes14.dex */
public final class p implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f499147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f499148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ td1.q f499149f;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17, td1.q qVar) {
        this.f499147d = c0Var;
        this.f499148e = i17;
        this.f499149f = qVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12225x471e4848 c12225x471e4848 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12225x471e4848) obj;
        boolean z17 = c12225x471e4848.f164453d;
        td1.q qVar = this.f499149f;
        int i17 = this.f499148e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f499147d;
        td1.l lVar = c12225x471e4848.f164454e;
        if (z17) {
            c0Var.a(i17, qVar.p("ok", kz5.c1.i(new jz5.l(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, java.lang.Integer.valueOf(lVar.f499146d)))));
            return;
        }
        java.lang.String str = "fail:" + c12225x471e4848.f164455f;
        qVar.C(str, "");
        c0Var.a(i17, qVar.p(str, kz5.c1.i(new jz5.l(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, java.lang.Integer.valueOf(lVar.f499146d)))));
    }
}
