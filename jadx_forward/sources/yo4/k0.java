package yo4;

/* loaded from: classes10.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f545776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a f545777e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f545778f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z23.f f545779g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f545780h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f545781i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f545782m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 f545783n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a c18794x5f9cad3a, java.lang.String str, z23.f fVar, java.lang.String[] strArr, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f545777e = c18794x5f9cad3a;
        this.f545778f = str;
        this.f545779g = fVar;
        this.f545780h = strArr;
        this.f545781i = arrayList;
        this.f545782m = arrayList2;
        this.f545783n = c16991x15ced046;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yo4.k0(this.f545777e, this.f545778f, this.f545779g, this.f545780h, this.f545781i, this.f545782m, this.f545783n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yo4.k0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f545776d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a c18794x5f9cad3a = this.f545777e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            yo4.p pVar = c18794x5f9cad3a.f257388w;
            if (pVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addMusicPlugin");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = pVar.f545820r;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = c16997xb0aa383a != null ? c16997xb0aa383a.f237261y : null;
            if (c19792x256d2725 != null) {
                this.f545776d = 1;
                obj = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new yo4.h(this.f545778f, c19792x256d2725, pVar, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            ut3.f.f512709c.d(true, nu3.i.f421751a.l());
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a.T1;
            c18794x5f9cad3a.G(1L);
            this.f545777e.A(this.f545779g, this.f545780h, this.f545781i, this.f545782m, this.f545783n, 0);
            return f0Var;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.String str = (java.lang.String) obj;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiVideoFullScreenPluginLayout", "appendFinderMusicInfo fail, return");
            c18794x5f9cad3a.B.z();
            return f0Var;
        }
        ut3.f.f512709c.d(true, nu3.i.f421751a.l());
        int i182 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a.T1;
        c18794x5f9cad3a.G(1L);
        this.f545777e.A(this.f545779g, this.f545780h, this.f545781i, this.f545782m, this.f545783n, 0);
        return f0Var;
    }
}
