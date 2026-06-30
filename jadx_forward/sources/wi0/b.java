package wi0;

/* loaded from: classes4.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f527667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f527668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f527669f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f527670g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, long j17, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f527668e = str;
        this.f527669f = j17;
        this.f527670g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wi0.b(this.f527668e, this.f527669f, this.f527670g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wi0.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f527667d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        yz5.l lVar = this.f527670g;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                vi0.i iVar = new vi0.i();
                java.lang.String str = this.f527668e;
                long j17 = this.f527669f;
                this.f527667d = 1;
                obj = iVar.a(str, j17, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            byte[] mo14344x5f01b1f6 = ((com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.d) obj).mo14344x5f01b1f6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24226x12f4e428(mo14344x5f01b1f6))));
            return f0Var;
        } catch (java.lang.Exception e17) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(e17))));
            return f0Var;
        }
    }
}
