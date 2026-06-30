package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class ee extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f267603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f267605f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267606g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267607h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(nw4.k kVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str, nw4.y2 y2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f267604e = kVar;
        this.f267605f = h0Var;
        this.f267606g = str;
        this.f267607h = y2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ee(this.f267604e, this.f267605f, this.f267606g, this.f267607h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ee) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f267603d;
        nw4.k kVar = this.f267604e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            js.e1 e1Var = (js.e1) i95.n0.c(js.e1.class);
            android.content.Context context = kVar.f422393a;
            js.d1 d1Var = (js.d1) this.f267605f.f391656d;
            this.f267603d = 1;
            obj = ((u61.u) e1Var).wi(context, d1Var, this.f267606g, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.Map map = (java.util.Map) obj;
        java.util.Objects.toString(map);
        java.lang.Object obj2 = map.get("mobile");
        java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.Object obj3 = map.get("msgId");
        java.lang.String str2 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.Object obj4 = map.get("carrierType");
        java.lang.Integer num = obj4 instanceof java.lang.Integer ? (java.lang.Integer) obj4 : null;
        boolean z17 = str == null || str.length() == 0;
        jz5.f0 f0Var = jz5.f0.f384359a;
        nw4.y2 y2Var = this.f267607h;
        if (!z17) {
            if (!(str2 == null || str2.length() == 0)) {
                if (!(map.get("tokens") == null) && num != null && num.intValue() != 0) {
                    kVar.f422396d.e(y2Var.f422546c, "SimAuth:ok", map);
                    return f0Var;
                }
            }
        }
        kVar.f422396d.e(y2Var.f422546c, "SimAuth:fail get number fail " + map.get("sim_auth_err"), null);
        return f0Var;
    }
}
