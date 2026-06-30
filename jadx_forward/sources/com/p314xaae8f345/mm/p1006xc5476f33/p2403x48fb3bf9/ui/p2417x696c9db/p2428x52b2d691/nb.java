package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class nb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3160xc37fbad4.c f267925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267926e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267927f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(com.p314xaae8f345.p3133xd0ce8b26.aff.p3160xc37fbad4.c cVar, nw4.k kVar, nw4.y2 y2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f267925d = cVar;
        this.f267926e = kVar;
        this.f267927f = y2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.nb(this.f267925d, this.f267926e, this.f267927f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.nb nbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.nb) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        nbVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3160xc37fbad4.c cVar = this.f267925d;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SameNetVerifyTAG", "myCallback begin");
            boolean z17 = cVar.f299022d;
            boolean[] zArr = cVar.f299028m;
            nw4.y2 y2Var = this.f267927f;
            nw4.k kVar = this.f267926e;
            if (z17) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                java.lang.String str = zArr[2] ? cVar.f299023e : "";
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getResp(...)");
                linkedHashMap.put("resp", str);
                kVar.f422396d.e(y2Var.f422546c, "sameNetVerify:ok", linkedHashMap);
            } else {
                nw4.g gVar = kVar.f422396d;
                java.lang.String str2 = y2Var.f422546c;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sameNetVerify:fail ");
                sb6.append(zArr[3] ? cVar.f299024f : "");
                gVar.e(str2, sb6.toString(), null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SameNetVerifyTAG", "myCallback end");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3160xc37fbad4.b.f299019b.a();
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3160xc37fbad4.b.f299019b.a();
            throw th6;
        }
    }
}
