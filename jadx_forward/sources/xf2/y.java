package xf2;

/* loaded from: classes10.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f535851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1491x36113a39.p1492x373aa5.AbstractC14206xe2e594d5 f535852e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f535853f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f535854g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f535855h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.du1 f535856i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f535857m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f535858n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1491x36113a39.p1492x373aa5.AbstractC14206xe2e594d5 abstractC14206xe2e594d5, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, android.graphics.Bitmap bitmap3, r45.du1 du1Var, boolean z17, boolean z18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f535852e = abstractC14206xe2e594d5;
        this.f535853f = bitmap;
        this.f535854g = bitmap2;
        this.f535855h = bitmap3;
        this.f535856i = du1Var;
        this.f535857m = z17;
        this.f535858n = z18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xf2.y(this.f535852e, this.f535853f, this.f535854g, this.f535855h, this.f535856i, this.f535857m, this.f535858n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xf2.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f535851d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1491x36113a39.p1492x373aa5.C14205xa8ca416b c14205xa8ca416b = this.f535852e.f193151d;
            if (c14205xa8ca416b == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("screenShotView");
                throw null;
            }
            android.graphics.Bitmap bitmap = this.f535853f;
            android.graphics.Bitmap bitmap2 = this.f535854g;
            android.graphics.Bitmap bitmap3 = this.f535855h;
            r45.du1 du1Var = this.f535856i;
            boolean z17 = this.f535857m;
            boolean z18 = this.f535858n;
            this.f535851d = 1;
            if (c14205xa8ca416b.c(bitmap, bitmap2, bitmap3, du1Var, z17, z18, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
