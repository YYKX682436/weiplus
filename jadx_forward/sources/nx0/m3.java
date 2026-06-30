package nx0;

/* loaded from: classes5.dex */
public final class m3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f422705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10983xbff22f6e f422706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f422707f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10983xbff22f6e c10983xbff22f6e, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f422706e = c10983xbff22f6e;
        this.f422707f = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nx0.m3(this.f422706e, this.f422707f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nx0.m3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f422705d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10983xbff22f6e c10983xbff22f6e = this.f422706e;
            nx0.b3 b3Var = c10983xbff22f6e.f151143f;
            if (b3Var != null) {
                yz5.p pVar = c10983xbff22f6e.f151144g;
                this.f422705d = 1;
                if (pVar.mo149xb9724478(b3Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f422707f.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}
