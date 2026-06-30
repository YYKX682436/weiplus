package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class ce extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f168035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f168036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f168037f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168038g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f168039h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(android.graphics.Bitmap bitmap, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f168035d = bitmap;
        this.f168036e = z17;
        this.f168037f = v5Var;
        this.f168038g = str;
        this.f168039h = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ce(this.f168035d, this.f168036e, this.f168037f, this.f168038g, this.f168039h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ce) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168037f;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        android.graphics.Bitmap bitmap = this.f168035d;
        if (bitmap != null) {
            try {
                if (!this.f168036e) {
                    android.view.ViewGroup E1 = v5Var.E1();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ie.a(E1, E1, new android.graphics.Canvas(bitmap));
                }
            } finally {
                v5Var.mo48798x74292566();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                android.os.SystemClock.elapsedRealtime();
            }
        }
        return bitmap;
    }
}
