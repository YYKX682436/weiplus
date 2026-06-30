package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class l2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f175871d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f175872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f175873f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175874g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175875h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ nu4.a f175876i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f175877m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f175878n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f175879o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f175880p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f175881q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175882r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f175883s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175884t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(long j17, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, java.lang.String str2, nu4.a aVar, boolean z17, boolean z18, int i17, int i18, int i19, java.lang.String str3, long j18, java.lang.String str4) {
        super(2, interfaceC29045xdcb5ca57);
        this.f175873f = j17;
        this.f175874g = str;
        this.f175875h = str2;
        this.f175876i = aVar;
        this.f175877m = z17;
        this.f175878n = z18;
        this.f175879o = i17;
        this.f175880p = i18;
        this.f175881q = i19;
        this.f175882r = str3;
        this.f175883s = j18;
        this.f175884t = str4;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.l2 l2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.l2(this.f175873f, this.f175874g, interfaceC29045xdcb5ca57, this.f175875h, this.f175876i, this.f175877m, this.f175878n, this.f175879o, this.f175880p, this.f175881q, this.f175882r, this.f175883s, this.f175884t);
        l2Var.f175872e = obj;
        return l2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.l2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d2> arrayList;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f175871d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var2 = (p3325xe03a0797.p3326xc267989b.y0) this.f175872e;
            long j17 = this.f175873f;
            this.f175872e = y0Var2;
            this.f175871d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(j17, this) == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f175872e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (!p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
            return jz5.f0.f384359a;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.ca caVar = com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274039a;
        java.lang.String str = this.f175874g;
        synchronized (caVar) {
            java.util.HashMap hashMap = com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274041c;
            java.lang.Object obj2 = hashMap.get(str);
            java.util.Queue queue = obj2 instanceof java.util.Queue ? (java.util.Queue) obj2 : null;
            if (queue != null) {
                hashMap.remove(str);
                arrayList = new java.util.ArrayList(queue);
            } else {
                arrayList = null;
            }
        }
        if (arrayList != null) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d2 d2Var : arrayList) {
                java.lang.String str2 = d2Var.f175745b;
                java.lang.String i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.i(str2, false);
                nu4.b bVar = nu4.b0.P;
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2 t2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.f175978a;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 v3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.f175980c;
                java.lang.String str3 = this.f175875h;
                nu4.a aVar2 = this.f175876i;
                ts1.o oVar = new ts1.o(str2, i18, bVar, v3Var, null, str3, null, aVar2, this.f175877m, aVar2 != null ? nu4.d0.b(aVar2) : null, null, 1104, null);
                if (!oVar.w()) {
                    zw4.e eVar = zw4.e.f558445g;
                    zw4.f fVar = zw4.f.f558449f;
                    java.lang.String str4 = d2Var.f175744a;
                    int i19 = this.f175879o;
                    int i27 = this.f175880p;
                    int i28 = this.f175881q;
                    java.lang.String str5 = this.f175882r;
                    zw4.g.a(eVar, fVar, str4, i19, i27, i28, str5, str5);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.a(t2Var, d2Var.f175746c, d2Var.f175744a, oVar, 0, d2Var.f175748e, this.f175876i);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b3.f175725a.a(this.f175883s, this.f175884t, 13);
                } else if (!d2Var.f175747d) {
                    int max = java.lang.Math.max(oVar.n() - 60, 60);
                    oVar.o();
                    if (oVar.o() || ((oVar.f() > 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.y3.a(oVar.f(), max)) || this.f175878n)) {
                        zw4.e eVar2 = zw4.e.f558444f;
                        zw4.f fVar2 = zw4.f.f558449f;
                        java.lang.String str6 = d2Var.f175744a;
                        int i29 = this.f175879o;
                        int i37 = this.f175880p;
                        int i38 = this.f175881q;
                        java.lang.String str7 = this.f175882r;
                        zw4.g.a(eVar2, fVar2, str6, i29, i37, i38, str7, str7);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.a(t2Var, d2Var.f175746c, d2Var.f175744a, oVar, 0, d2Var.f175748e, this.f175876i);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b3.f175725a.a(this.f175883s, this.f175884t, 13);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b3.f175725a.a(this.f175883s, this.f175884t, 12);
                        zw4.e eVar3 = zw4.e.f558443e;
                        zw4.f fVar3 = zw4.f.f558449f;
                        java.lang.String str8 = d2Var.f175744a;
                        int i39 = this.f175879o;
                        int i47 = this.f175880p;
                        int i48 = this.f175881q;
                        java.lang.String str9 = this.f175882r;
                        zw4.g.a(eVar3, fVar3, str8, i39, i47, i48, str9, str9);
                    }
                }
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274040b.remove(this.f175874g);
        return jz5.f0.f384359a;
    }
}
