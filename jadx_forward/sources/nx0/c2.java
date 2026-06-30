package nx0;

/* loaded from: classes5.dex */
public final class c2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f422617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10980xb7502633 f422618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f422619f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10980xb7502633 c10980xb7502633, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f422618e = c10980xb7502633;
        this.f422619f = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nx0.c2(this.f422618e, this.f422619f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nx0.c2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f422617d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10980xb7502633 c10980xb7502633 = this.f422618e;
            nx0.r1 r1Var = c10980xb7502633.f151127f;
            if (r1Var != null) {
                yz5.p pVar = c10980xb7502633.f151128g;
                this.f422617d = 1;
                if (pVar.mo149xb9724478(r1Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f422619f.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}
