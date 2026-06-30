package p81;

/* loaded from: classes7.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p81.j f434254d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p81.j jVar) {
        super(1);
        this.f434254d = jVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p6 it = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p6) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        p81.j jVar = this.f434254d;
        jVar.a(4, "onSuccess");
        t81.c cVar = jVar.f434256a;
        ((t81.d) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(t81.d.class)).mo9951xb06685ab(cVar, new java.lang.String[0]);
        s81.b bVar = (s81.b) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(s81.b.class);
        java.lang.String str = cVar.f67698x28d45f97;
        int i17 = cVar.f67716x8987ca93;
        int i18 = cVar.f67707xa1ecfcdb;
        java.lang.String str2 = cVar.f67706xbae6789e;
        int i19 = cVar.f67709x44eeb14;
        bVar.getClass();
        s81.c cVar2 = new s81.c();
        cVar2.f67271x28d45f97 = str;
        cVar2.f67277x8987ca93 = i17;
        cVar2.f67274xa1ecfcdb = i18;
        cVar2.f67273xbae6789e = str2;
        cVar2.f67275x44eeb14 = i19;
        boolean z17 = bVar.get(cVar2, new java.lang.String[0]);
        cVar2.f67276x10639700 = 1;
        cVar2.f67272xcd821ae1 = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PredownloadGetCodeStatStorage", "setSource(" + bVar.y0(cVar2) + "), applied:" + (z17 ? bVar.mo9952xce0038c9(cVar2, new java.lang.String[0]) : bVar.mo880xb970c2b9(cVar2)) + " update:" + z17);
        p81.j.b(jVar, true);
        jVar.f434257b.mo146xb9724478(java.lang.Boolean.TRUE);
        return jz5.f0.f384359a;
    }
}
