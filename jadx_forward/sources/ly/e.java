package ly;

/* loaded from: classes14.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f403707d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f403708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f403709f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f403710g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yz5.a aVar, yz5.a aVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f403709f = aVar;
        this.f403710g = aVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ly.e eVar = new ly.e(this.f403709f, this.f403710g, interfaceC29045xdcb5ca57);
        eVar.f403708e = obj;
        return eVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ly.e) mo148xaf65a0fc((p1.a0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [p1.q0] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        ?? r86;
        ly.d dVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f403707d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r86 = (p1.a0) this.f403708e;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p1.a0 a0Var = (p1.a0) this.f403708e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r86 = a0Var;
        }
        do {
            dVar = new ly.d(this.f403709f, this.f403710g, null);
            this.f403708e = r86;
            this.f403707d = 1;
            r86 = (p1.q0) r86;
        } while (r86.v(dVar, this) != aVar);
        return aVar;
    }
}
