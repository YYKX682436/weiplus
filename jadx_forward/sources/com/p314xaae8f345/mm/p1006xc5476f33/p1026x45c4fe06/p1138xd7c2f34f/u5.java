package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class u5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f166748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166749e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f166750f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.q f166751g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f166752h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f166753i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.y50 f166754m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f166755n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(java.lang.String str, yz5.l lVar, yz5.q qVar, java.util.LinkedList linkedList, int i17, r45.y50 y50Var, java.util.LinkedList linkedList2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f166749e = str;
        this.f166750f = lVar;
        this.f166751g = qVar;
        this.f166752h = linkedList;
        this.f166753i = i17;
        this.f166754m = y50Var;
        this.f166755n = linkedList2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u5(this.f166749e, this.f166750f, this.f166751g, this.f166752h, this.f166753i, this.f166754m, this.f166755n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f166748d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                r45.jf jfVar = new r45.jf();
                java.util.LinkedList linkedList = this.f166752h;
                int i18 = this.f166753i;
                r45.y50 y50Var = this.f166754m;
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    jfVar.f459308d.addAll(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5.f166943a.b((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6) it.next()));
                }
                jfVar.f459309e = i18;
                jfVar.f459310f = y50Var;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t tVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t(jfVar, this.f166749e);
                this.f166748d = 1;
                obj = rm0.h.a(tVar, 0L, null, this, 3, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            ((r45.kf) obj).f460177d.addAll(this.f166755n);
            this.f166750f.mo146xb9724478(obj);
        } catch (rm0.j e17) {
            this.f166751g.mo147xb9724478(new java.lang.Integer(e17.f478957e), new java.lang.Integer(e17.f478958f), e17.f478959g);
        }
        return jz5.f0.f384359a;
    }
}
