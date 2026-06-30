package ae;

/* loaded from: classes7.dex */
public class b implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ae.a f84874a;

    public b(ae.a aVar) {
        this.f84874a = aVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.s
    public void a(java.lang.String str, java.lang.String str2) {
        ae.a aVar = this.f84874a;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) aVar.F();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f229341e = yVar == null ? null : yVar.getF229341e();
        if (f229341e == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandGameServiceLogicImp", "[WAGameJsException] hy: wxa main context exception %s %s", str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.jf.a(f229341e, "onError", java.lang.String.format("{'message':'%s', 'stack': '%s'}", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w2.a(str), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w2.a(str2)), 0, 0);
        java.util.List list = (java.util.List) ((java.util.HashMap) pj1.b.f436464a.f436465a).get(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35205x24728b);
        if (list != null && list.size() > 0) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(list.get(0));
            throw null;
        }
        aVar.K0(str, str2);
    }
}
