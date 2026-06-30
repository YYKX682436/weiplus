package sn1;

/* loaded from: classes9.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f491613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f491614e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f491615f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.function.Consumer f491616g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.util.LinkedList linkedList, java.lang.String str, java.util.function.Consumer consumer, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f491614e = linkedList;
        this.f491615f = str;
        this.f491616g = consumer;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sn1.s(this.f491614e, this.f491615f, this.f491616g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sn1.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f491613d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            sn1.z zVar = sn1.z.f491649a;
            this.f491613d = 1;
            obj = zVar.d(this.f491614e, this.f491615f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        sn1.r rVar = new sn1.r(this.f491616g, (sn1.j) obj, null);
        this.f491613d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, rVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
