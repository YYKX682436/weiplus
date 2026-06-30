package f92;

/* loaded from: classes8.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f341777d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f341778e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341779f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f92.i f341780g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str, f92.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f341779f = str;
        this.f341780g = iVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        f92.g gVar = new f92.g(this.f341779f, this.f341780g, interfaceC29045xdcb5ca57);
        gVar.f341778e = obj;
        return gVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((f92.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object c47;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f341777d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f341778e;
            g92.b bVar = g92.b.f351302e;
            java.lang.String str = this.f341779f;
            this.f341778e = y0Var;
            this.f341777d = 1;
            c47 = bVar.c4(str, this);
            if (c47 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c47 = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        }
        java.lang.String str2 = this.f341779f;
        f92.i iVar = this.f341780g;
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(c47);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.AccountLogicHandler", "[doFinderInit.onFailure] " + m143898xd4a2fc34.getMessage() + " source=" + str2);
            if (m143898xd4a2fc34 instanceof rm0.j) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((rm0.j) m143898xd4a2fc34).f478960h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderInitResponse");
                java.lang.Integer num = new java.lang.Integer(((r45.xb1) fVar).m75939xb282bd08(16));
                wu5.c cVar = null;
                if (!(num.intValue() > 0)) {
                    num = null;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
                    t0Var.getClass();
                    cVar = t0Var.t(new f92.f(iVar, intValue), intValue * 1000, null);
                }
                if (cVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountLogicHandler", "delay to next app foreground. ");
                    iVar.f341783d = 0L;
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
