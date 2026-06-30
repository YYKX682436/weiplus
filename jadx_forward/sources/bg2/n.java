package bg2;

/* loaded from: classes3.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.r f101851d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(bg2.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f101851d = rVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.n(this.f101851d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        bg2.n nVar = (bg2.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        nVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        bg2.r rVar = this.f101851d;
        android.view.ViewGroup viewGroup = rVar.f101967g;
        if (viewGroup != null) {
            if (!(viewGroup.getWidth() > 0)) {
                viewGroup = null;
            }
            if (viewGroup != null) {
                int[] iArr = {0, 0};
                viewGroup.getLocationOnScreen(iArr);
                int width = iArr[0] + ((int) ((viewGroup.getWidth() * viewGroup.getScaleX()) / 2));
                int i17 = no0.i.f420260a;
                int i18 = width - (no0.i.f420260a / 2);
                int b17 = iArr[1] - i65.a.b(viewGroup.getContext(), 40);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveConvertCheerUIController", "like pos, x: " + i18 + ", y: " + b17 + ", locX: " + iArr[0] + ", locY: " + iArr[1]);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14394xb058b2bf c14394xb058b2bf = rVar.f101970m;
                if (c14394xb058b2bf != null) {
                    c14394xb058b2bf.f199126m = false;
                }
                if (c14394xb058b2bf != null) {
                    c14394xb058b2bf.mo57885x98928347(200L);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14394xb058b2bf c14394xb058b2bf2 = rVar.f101970m;
                if (c14394xb058b2bf2 != null) {
                    c14394xb058b2bf2.f199129p = i18;
                    c14394xb058b2bf2.f199130q = b17;
                }
                if (c14394xb058b2bf2 != null) {
                    c14394xb058b2bf2.m57884x7369a23(0.5f);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14394xb058b2bf c14394xb058b2bf3 = rVar.f101970m;
                if (c14394xb058b2bf3 != null) {
                    c14394xb058b2bf3.d();
                }
            }
        }
        rVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f563457br3));
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f563458br4));
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f563459br5));
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.br6));
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.br7));
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.br8));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14394xb058b2bf c14394xb058b2bf4 = rVar.f101970m;
        if (c14394xb058b2bf4 != null) {
            c14394xb058b2bf4.c(arrayList);
        }
        return jz5.f0.f384359a;
    }
}
