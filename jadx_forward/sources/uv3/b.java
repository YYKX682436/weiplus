package uv3;

/* loaded from: classes5.dex */
public final class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.p1 {
    public final r45.yv0 F;
    public final boolean G;
    public final jz5.g H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.ViewGroup parent, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.j0 status, r45.yv0 finderCgiType, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(parent, status);
        finderCgiType = (i17 & 4) != 0 ? r45.yv0.kFinderBgmListTypeSprSearch : finderCgiType;
        z17 = (i17 & 8) != 0 ? false : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderCgiType, "finderCgiType");
        this.F = finderCgiType;
        this.G = z17;
        this.H = jz5.h.b(new uv3.a(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.b1
    public void u(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.c1 searchType) {
        pq5.g l17;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchType, "searchType");
        if (!z17 && (str = this.f237714v) != null) {
            wv3.d dVar = this.f237700f instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2008xb118f8f1.C17066xb644f671 ? wv3.d.f531587e : wv3.d.f531588f;
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("sns_publish_search_music", kz5.c1.k(new jz5.l("query_word", str), new jz5.l("musiceditsource", java.lang.Integer.valueOf(dVar.f531590d)), new jz5.l("sns_publish_sessionid", ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi()), new jz5.l("queryid", c01.z1.r() + '_' + (java.lang.System.currentTimeMillis() / 1000.0d))), 36244);
        }
        vv3.b bVar = (vv3.b) ((jz5.n) this.H).mo141623x754a37bb();
        java.lang.String str2 = this.f237714v;
        bVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsSearchBgmListHelper", "doSearch " + str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.d dVar2 = bVar.f521966a;
        if (!z17) {
            bVar.f521971f = null;
            dVar2.F();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("key_string_1", str2);
            dVar2.j(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.i0.f237780g, bundle);
        }
        java.lang.String str3 = str2 == null ? "" : str2;
        dVar2.mo68350x19263085();
        jv3.a aVar = bVar.f521970e;
        if (aVar != null) {
            aVar.j();
        }
        bVar.f521970e = new jv3.a(bVar.f521967b.f472932d, 30, bVar.f521971f, bVar.f521969d, null, null, null, null, str3, null, 0, 0, 0, null, 15984, null);
        long c17 = c01.id.c();
        jv3.a aVar2 = bVar.f521970e;
        if (aVar2 == null || (l17 = aVar2.l()) == null) {
            return;
        }
        l17.f(bVar.f521968c);
        l17.h(new vv3.a(c17, str3, str2, bVar, z17, searchType));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.b1
    public int x() {
        return !this.G ? 15 : 16;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.b1
    public void z() {
        super.z();
        vv3.b bVar = (vv3.b) ((jz5.n) this.H).mo141623x754a37bb();
        jv3.a aVar = bVar.f521970e;
        if (aVar != null) {
            aVar.j();
        }
        bVar.f521970e = null;
    }
}
