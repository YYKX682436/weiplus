package te2;

/* loaded from: classes3.dex */
public final class l5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f499738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f499739e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(te2.p8 p8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f499739e = p8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new te2.l5(this.f499739e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.l5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f499738d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f499738d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(10L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        te2.p8 p8Var = this.f499739e;
        int height = ((android.widget.ScrollView) ((jz5.n) p8Var.f499845h).mo141623x754a37bb()).getHeight();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNoticeQRCodeUIC", "#fixContentLayoutSize realSpace=" + height + " mQrCodeRootView.height=" + p8Var.f7().getHeight());
        if (height > 0 && p8Var.f7().getHeight() > 0) {
            if (height < p8Var.f7().getHeight()) {
                float height2 = height / p8Var.f7().getHeight();
                p8Var.f7().setPivotY(0.0f);
                p8Var.f7().setScaleX(height2);
                p8Var.f7().setScaleY(height2);
            } else {
                p8Var.f7().setScaleX(1.0f);
                p8Var.f7().setScaleY(1.0f);
            }
        }
        p8Var.c7().setVisibility(0);
        return jz5.f0.f384359a;
    }
}
