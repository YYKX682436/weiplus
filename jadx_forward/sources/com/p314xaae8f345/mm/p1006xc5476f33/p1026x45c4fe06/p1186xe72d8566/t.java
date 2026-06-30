package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566;

/* loaded from: classes2.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f170091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.f1 f170092e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.f1 f170093f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f170094g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f170095h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p3325xe03a0797.p3326xc267989b.f1 f1Var, p3325xe03a0797.p3326xc267989b.f1 f1Var2, com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f170092e = f1Var;
        this.f170093f = f1Var2;
        this.f170094g = r6Var;
        this.f170095h = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.t(this.f170092e, this.f170093f, this.f170094g, this.f170095h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f170091d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f170091d = 1;
            obj = this.f170092e.k(this);
            if (obj == aVar) {
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
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        p3325xe03a0797.p3326xc267989b.f1 f1Var = this.f170093f;
        if (bitmap == null) {
            this.f170091d = 2;
            obj = f1Var.k(this);
            return obj == aVar ? aVar : obj;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandScreenshotComponentHelper", "getGenImgPath: custom poster success, cancelling default poster");
        p3325xe03a0797.p3326xc267989b.p2.a(f1Var, null, 1, null);
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f170094g;
        if (r6Var.m()) {
            r6Var.l();
        }
        return this.f170095h;
    }
}
