package df2;

/* loaded from: classes5.dex */
public final class k3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.p3 f312086e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(df2.p3 p3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312086e = p3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.k3(this.f312086e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.k3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f312085d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            vl2.s sVar = vl2.s.f519401a;
            vl2.h hVar = vl2.h.f519358n;
            this.f312085d = 1;
            obj = sVar.b(hVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x xVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x) obj;
        if (xVar != null) {
            java.lang.String c17 = xVar.c();
            if (c17 == null) {
                c17 = "";
            }
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(c17));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load file, dir size: ");
            java.lang.String[] D = r6Var.D();
            sb6.append(D != null ? new java.lang.Integer(D.length) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRenderController", sb6.toString());
            if (r6Var.y()) {
                java.lang.String[] D2 = r6Var.D();
                if (D2 != null && D2.length == 0) {
                    java.lang.String m117639xfb83cc9b = xVar.m117639xfb83cc9b();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m117639xfb83cc9b, "getPath(...)");
                    java.lang.String c18 = xVar.c();
                    if (c18 == null) {
                        c18 = "";
                    }
                    wl2.e.a(m117639xfb83cc9b, c18);
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("unZip file size: ");
                    java.lang.String[] D3 = r6Var.D();
                    sb7.append(D3 != null ? new java.lang.Integer(D3.length) : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRenderController", sb7.toString());
                }
            }
            java.lang.String c19 = xVar.c();
            this.f312086e.f312563n = c19 != null ? c19 : "";
        }
        return jz5.f0.f384359a;
    }
}
