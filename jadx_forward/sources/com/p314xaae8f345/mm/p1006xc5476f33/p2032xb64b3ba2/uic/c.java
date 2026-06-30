package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class c implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f239901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.f f239902e;

    public c(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.f fVar) {
        this.f239901d = list;
        this.f239902e = fVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        if (!((java.lang.Boolean) obj2).booleanValue()) {
            java.lang.String jSONObject = new org.json.JSONObject().put("add_bell_num", this.f239901d.size()).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            java.lang.String t17 = r26.i0.t(jSONObject, ",", ";", false);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7173x53cdb0a3 c7173x53cdb0a3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7173x53cdb0a3();
            c7173x53cdb0a3.f144716g = 15L;
            c7173x53cdb0a3.f144731v = c7173x53cdb0a3.b("extrainfo", t17, true);
            c7173x53cdb0a3.k();
            com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.f fVar = this.f239902e;
            android.view.View inflate = android.view.LayoutInflater.from(fVar.m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dd8, (android.view.ViewGroup) null);
            inflate.findViewById(com.p314xaae8f345.mm.R.id.q1t).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.b(fVar));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.f fVar2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.f(fVar.m158354x19263085());
            fVar2.f294004e = inflate;
            fVar2.f294003d = 2500;
            fVar2.a();
        }
        return jz5.f0.f384359a;
    }
}
