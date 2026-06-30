package vv4;

/* loaded from: classes11.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f522028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 f522029e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 activityC19216xc2476b75, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f522028d = map;
        this.f522029e = activityC19216xc2476b75;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vv4.s(this.f522028d, this.f522029e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        vv4.s sVar = (vv4.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        sVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 activityC19216xc2476b75 = this.f522029e;
        java.util.Map imageInfo = this.f522028d;
        if (imageInfo != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMFTSImageRecognitionUI", "upload done imageInfo=" + imageInfo);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageInfo, "imageInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75.V6(activityC19216xc2476b75, java.lang.String.valueOf(ri.l0.a(kz5.b1.e(new jz5.l("imageInfo", java.lang.String.valueOf(ri.l0.a(imageInfo)))))));
        } else {
            db5.e1.G(activityC19216xc2476b75, activityC19216xc2476b75.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o4r), null, false, new vv4.r(activityC19216xc2476b75));
        }
        return jz5.f0.f384359a;
    }
}
