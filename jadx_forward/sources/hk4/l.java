package hk4;

/* loaded from: classes10.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk4.n f363487d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(hk4.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f363487d = nVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hk4.l(this.f363487d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hk4.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        hk4.n nVar = this.f363487d;
        if (com.p314xaae8f345.mm.vfs.w6.j(nVar.f363492n)) {
            nVar.f363496r = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K(nVar.f363492n);
            java.lang.String str = nVar.f363489k;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadImageBitmap file already exist: ");
            sb6.append(nVar.f363496r);
            sb6.append(", size:[");
            android.graphics.Bitmap bitmap = nVar.f363496r;
            sb6.append(bitmap != null ? new java.lang.Integer(bitmap.getWidth()) : null);
            sb6.append(", ");
            android.graphics.Bitmap bitmap2 = nVar.f363496r;
            sb6.append(bitmap2 != null ? new java.lang.Integer(bitmap2.getHeight()) : null);
            sb6.append("], path:");
            sb6.append(nVar.f363492n);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            if (nVar.f363496r != null) {
                return java.lang.Boolean.TRUE;
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
