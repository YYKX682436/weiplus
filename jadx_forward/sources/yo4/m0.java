package yo4;

/* loaded from: classes10.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f545795d;

    /* renamed from: e, reason: collision with root package name */
    public int f545796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a f545797f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f545798g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f545799h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.q f545800i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a c18794x5f9cad3a, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str, yz5.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f545797f = c18794x5f9cad3a;
        this.f545798g = h0Var;
        this.f545799h = str;
        this.f545800i = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yo4.m0(this.f545797f, this.f545798g, this.f545799h, this.f545800i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yo4.m0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f545796e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f545798g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a c18794x5f9cad3a = this.f545797f;
        boolean z17 = true;
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
                this.f545795d = h0Var2;
                this.f545796e = 1;
                obj = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new yo4.h(this.f545799h, c19792x256d2725, pVar, null), this);
                if (obj == aVar) {
                    return aVar;
                }
                h0Var = h0Var2;
            }
            java.lang.String str = (java.lang.String) h0Var2.f391656d;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a.T1;
            c18794x5f9cad3a.z(str, this.f545800i);
            return f0Var;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        h0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) this.f545795d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        h0Var.f391656d = obj;
        java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var2.f391656d;
        if (charSequence != null && charSequence.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiVideoFullScreenPluginLayout", "appendFinderMusicInfo fail, return");
            c18794x5f9cad3a.B.z();
            return f0Var;
        }
        java.lang.String str2 = (java.lang.String) h0Var2.f391656d;
        int i182 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a.T1;
        c18794x5f9cad3a.z(str2, this.f545800i);
        return f0Var;
    }
}
