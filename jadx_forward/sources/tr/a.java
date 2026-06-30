package tr;

/* loaded from: classes4.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f502807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc f502808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f502809f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f502810g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc, android.os.Bundle bundle, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f502808e = c21007x2f4a06dc;
        this.f502809f = bundle;
        this.f502810g = rVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tr.a(this.f502808e, this.f502809f, this.f502810g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tr.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.os.Bundle bundle = this.f502809f;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f502807d;
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f502810g;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc = this.f502808e;
                this.f502807d = 1;
                r45.gl5 gl5Var = new r45.gl5();
                gl5Var.f456866d = c21007x2f4a06dc.f274682d;
                gl5Var.f456867e = c21007x2f4a06dc.f274684f;
                gl5Var.f456868f = java.lang.String.valueOf(c21007x2f4a06dc.f274685g);
                gl5Var.f456869g = c21007x2f4a06dc.f274688m;
                gl5Var.f456871i = c21007x2f4a06dc.f274686h;
                obj = rm0.h.a(new gr.c(gl5Var), 0L, null, this, 3, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            bundle.putByteArray("resp", ((r45.hl5) obj).mo14344x5f01b1f6());
            if (rVar != null) {
                rVar.a(bundle);
            }
        } catch (rm0.j unused) {
            if (rVar != null) {
                rVar.a(null);
            }
        }
        return jz5.f0.f384359a;
    }
}
