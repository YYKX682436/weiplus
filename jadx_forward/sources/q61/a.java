package q61;

/* loaded from: classes4.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f441764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441765e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f441766f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q61.d f441767g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String str, byte[] bArr, q61.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f441765e = str;
        this.f441766f = bArr;
        this.f441767g = dVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new q61.a(this.f441765e, this.f441766f, this.f441767g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((q61.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f441764d;
        q61.d dVar = this.f441767g;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                q61.c cVar = q61.c.f441773a;
                java.lang.String str = this.f441765e;
                byte[] bArr = this.f441766f;
                this.f441764d = 1;
                obj = q61.c.a(cVar, str, bArr, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            jz5.l lVar = (jz5.l) obj;
            if (dVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11412xb40e8d95) dVar).a(((java.lang.Boolean) lVar.f384366d).booleanValue(), (r45.pd4) lVar.f384367e);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CheckLoginQRCodeCGI", "checkLoginQRCode error: " + e17.getMessage());
            if (dVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11412xb40e8d95) dVar).a(false, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
