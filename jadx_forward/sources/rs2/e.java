package rs2;

/* loaded from: classes2.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rs2.f f480859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f480860e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(rs2.f fVar, android.os.Bundle bundle, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f480859d = fVar;
        this.f480860e = bundle;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rs2.e(this.f480859d, this.f480860e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        rs2.e eVar = (rs2.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        eVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff;
        byte[] byteArrayExtra;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        android.os.Bundle bundle = this.f480860e;
        rs2.f fVar = this.f480859d;
        super/*com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC*/.mo450x3e5a77bb(bundle);
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = fVar.f215192h;
        if (c1190x18d3c3fe instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) c1190x18d3c3fe).m62442xecae6946(true);
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe2 = fVar.f215192h;
        if (c1190x18d3c3fe2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) c1190x18d3c3fe2).m62442xecae6946(true);
        }
        fVar.f215191g = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) fVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nup);
        fVar.f215192h = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) fVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f569103p16);
        rs2.f fVar2 = this.f480859d;
        java.lang.String string = fVar2.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f0n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860.R6(fVar2, new rs2.b(string), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14026xfba8c305(), false, 4, null);
        if (fVar.m158359x1e885992().getIntExtra("key_purchase_pay_mic_course_count", 0) > 0 && (byteArrayExtra = fVar.m158359x1e885992().getByteArrayExtra("KEY_PURCHASE_PAY_MIC_COURSE_JUMP_INTENT")) != null) {
            rs2.f fVar3 = this.f480859d;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
            try {
                c19786x6a1e2862.mo11468x92b714fd(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
            java.lang.String string2 = fVar3.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573276mn1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860.R6(fVar3, new rs2.b(string2), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14027xdecc30a6(c19786x6a1e2862), false, 4, null);
        }
        if (fVar.f7().size() <= 1 && (c2718xca2902ff = fVar.f215191g) != null) {
            c2718xca2902ff.m20368xc75d81ec(0);
        }
        return jz5.f0.f384359a;
    }
}
