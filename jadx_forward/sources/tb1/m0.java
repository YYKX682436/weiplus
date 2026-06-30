package tb1;

/* loaded from: classes7.dex */
public final class m0 extends tb1.k0 {

    /* renamed from: i, reason: collision with root package name */
    public mi1.w0 f498445i;

    @Override // gb1.d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component, org.json.JSONObject jSONObject, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        if ((component instanceof pa1.o) || (component instanceof fa1.t)) {
            java.lang.Boolean Bi = ((p60.u) ((p60.x) i95.n0.c(p60.x.class))).Bi(component.mo48798x74292566(), ((k91.z0) component.b(k91.z0.class)).f387385r.f156932d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Bi, "isGameLiving(...)");
            if (Bi.booleanValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertCameraWC", "is game living");
                component.a(i17, o("fail: " + i65.a.r(component.getF229340d(), com.p314xaae8f345.mm.R.C30867xcad56011.a0u)));
                return;
            }
        }
        B(component, jSONObject, i17, component.getF229341e());
    }

    @Override // tb1.k0, gb1.d
    public void O(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject, gb1.n nVar) {
        super.O(tVar, i17, view, jSONObject, nVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer");
        java.lang.Object d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).d(android.view.View.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(d17, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.camera.ICameraView");
        ((tb1.a0) d17).mo50751xa472d1c3(new tb1.l0(this, tVar));
    }
}
