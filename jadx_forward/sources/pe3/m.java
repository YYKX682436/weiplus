package pe3;

/* loaded from: classes7.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f435197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pe3.o f435198e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(pe3.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f435198e = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pe3.m(this.f435198e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pe3.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f435197d;
        pe3.o oVar = this.f435198e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            se3.e eVar = oVar.f435202e;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = oVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            java.lang.String O6 = ((pe3.h) pf5.z.f435481a.a(activity).a(pe3.h.class)).O6();
            this.f435197d = 1;
            if (eVar.P6(O6, this) == aVar) {
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
        se3.e eVar2 = oVar.f435202e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1848x727d4bff.p1849x373aa5.C16462x4c72b377 c16462x4c72b377 = oVar.f435201d;
        if (c16462x4c72b377 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("frameSetView");
            throw null;
        }
        this.f435197d = 2;
        if (eVar2.N6(c16462x4c72b377, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
