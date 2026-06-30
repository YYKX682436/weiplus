package tr0;

/* loaded from: classes14.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f502827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tr0.t f502828e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f502829f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(tr0.t tVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f502828e = tVar;
        this.f502829f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tr0.e(this.f502828e, this.f502829f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tr0.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f502827d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        tr0.t tVar = this.f502828e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f502827d = 1;
            if (tVar.q(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        tVar.N("GrabStopPreview");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("camera_string", this.f502829f);
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = tVar.f502891t;
        jz5.l lVar = new jz5.l(bs0.g.f105321e, bundle);
        this.f502827d = 2;
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo771x2f8fd3(lVar, this);
        return f0Var == aVar ? aVar : f0Var;
    }
}
