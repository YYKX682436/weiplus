package so2;

/* loaded from: classes10.dex */
public final class p5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f492071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.w5 f492072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f492073f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(so2.w5 w5Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f492072e = w5Var;
        this.f492073f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new so2.p5(this.f492072e, this.f492073f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((so2.p5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f492071d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f492071d = 1;
            this.f492072e.getClass();
            android.graphics.Bitmap t17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.t(this.f492073f, 4, 4, false, false);
            if (t17 == null || t17.isRecycled()) {
                obj = new java.lang.Integer(-1);
            } else {
                i4.i iVar = new i4.f(t17).b().f369892d;
                java.lang.Integer num = iVar != null ? new java.lang.Integer(iVar.f369882d) : null;
                int i18 = com.p314xaae8f345.mm.ui.bk.c(t17, 4, 4)[0];
                int intValue = num != null ? num.intValue() : i18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SetProfileCoverViewModel", "rgbColor domainRgb:" + num + "  bgRgb:" + i18);
                int i19 = (int) (((float) 255) * 0.0f);
                int i27 = i19 > 0 ? i19 : 0;
                obj = new java.lang.Integer(((255 > i27 ? i27 : 255) << 24) + (intValue & 16777215));
            }
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
