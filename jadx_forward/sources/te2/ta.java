package te2;

/* loaded from: classes3.dex */
public final class ta extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f499989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.hc f499990e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(te2.hc hcVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f499990e = hcVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new te2.ta(this.f499990e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.ta) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f499989d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f499989d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(10L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        te2.hc hcVar = this.f499990e;
        ((android.view.View) ((jz5.n) hcVar.f499616u).mo141623x754a37bb()).getGlobalVisibleRect(rect);
        ((android.view.View) ((jz5.n) hcVar.B).mo141623x754a37bb()).getGlobalVisibleRect(new android.graphics.Rect());
        int height = ((android.widget.ScrollView) ((jz5.n) hcVar.f499602d).mo141623x754a37bb()).getHeight();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNoticeQRCodeUIC", "#fixContentLayoutSize realSpace=" + height + " mQrCodeRootView.height=" + hcVar.R6().getHeight());
        if (height > 0 && hcVar.R6().getHeight() > 0) {
            if (height < hcVar.R6().getHeight()) {
                float height2 = height / hcVar.R6().getHeight();
                hcVar.R6().setScaleX(height2);
                hcVar.R6().setScaleY(height2);
            } else {
                hcVar.R6().setScaleX(1.0f);
                hcVar.R6().setScaleY(1.0f);
            }
        }
        hcVar.Q6().setVisibility(0);
        return jz5.f0.f384359a;
    }
}
