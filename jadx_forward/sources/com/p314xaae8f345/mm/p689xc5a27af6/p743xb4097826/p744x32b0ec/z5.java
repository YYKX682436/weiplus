package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

@j95.b
/* loaded from: classes3.dex */
public final class z5 extends i95.w implements s40.a1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f148590d = "FinderLiveShoppingService";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f148591e = "finder_shop_disclaimer_mmkv";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f148592f = "finder_shop_disclaimer_appid";

    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object wi(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5 r18, android.content.Context r19, java.lang.String r20, long r21, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r23) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5.wi(com.tencent.mm.feature.finder.live.z5, android.content.Context, java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void Ai(l81.b1 bundle) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("check native extra ");
        l81.p0 p0Var = bundle.f398561i;
        sb6.append(p0Var != null ? p0Var.a() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f148590d, sb6.toString());
        xy2.b bVar = xy2.b.f539688b;
        l81.p0 p0Var2 = bundle.f398561i;
        if (p0Var2 != null && (p0Var2 instanceof dk2.ah)) {
            dk2.ah ahVar = p0Var2 instanceof dk2.ah ? (dk2.ah) p0Var2 : null;
            java.lang.String str = ahVar != null ? ahVar.f314750m : null;
            if (!(str == null || str.length() == 0)) {
                z17 = true;
                pm0.z.b(bVar, "checkShoppingNativeExtra", z17, pm0.w.f438339g, null, false, false, com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.o5.f148388d, 56, null);
            }
        }
        z17 = false;
        pm0.z.b(bVar, "checkShoppingNativeExtra", z17, pm0.w.f438339g, null, false, false, com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.o5.f148388d, 56, null);
    }

    public final java.lang.Object Bi(android.content.Context context, long j17, gk2.e eVar, l81.b1 b1Var, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        long m75942xfb822ef2 = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        long j18 = ((mm2.e1) eVar.a(mm2.e1.class)).f410516m;
        java.lang.String str = ((mm2.c1) eVar.a(mm2.c1.class)).f410385o;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("productId", j17);
        jSONObject.put("liveId", m75942xfb822ef2);
        jSONObject.put("objectId", j18);
        jSONObject.put("anchorUsername", str);
        jSONObject.put("reqScene", i18);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l e17 = b1Var.G.e();
        e17.O = xt2.k6.class.getName();
        e17.P = jSONObject2;
        b1Var.G = e17.a();
        return jz5.f0.f384359a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.Object Di(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        new ek2.y0(str, null, 2, 0 == true ? 1 : 0).l().K(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.p5(new v65.n(rVar), this, str));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public final java.lang.Object Ni(android.content.Context context, long j17, gk2.e eVar, int i17, boolean z17, boolean z18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return Zi(context, j17, ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) eVar.a(mm2.e1.class)).f410516m, ((mm2.c1) eVar.a(mm2.c1.class)).f410385o, i17, z17, z18, interfaceC29045xdcb5ca57);
    }

    public java.lang.Object Ri(java.lang.String str, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        r45.ld2 ld2Var = new r45.ld2();
        ld2Var.set(3, str);
        s40.b1 b1Var = (s40.b1) i95.n0.c(s40.b1.class);
        r45.va1 va1Var = new r45.va1();
        va1Var.set(0, str);
        va1Var.set(1, java.lang.Integer.valueOf(i17));
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t6) b1Var).getClass();
        new ke2.o0("/cgi-bin/mmbiz-bin/findergetwindowproductprofilecardinfo", 7263, va1Var, ld2Var, null).l().K(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.q5(rVar, this));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Ui(java.lang.String r17, int r18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r19) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5.Ui(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Vi(android.content.Context context, l81.b1 bundle, java.lang.String anchorUsername, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUsername, "anchorUsername");
        v65.i.c(new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a(this.f148590d, context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null, 0, 4, null), null, new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t5(bundle, this, context, anchorUsername, j17, null), 1, null);
    }

    public final java.lang.Object Zi(android.content.Context context, long j17, long j18, long j19, java.lang.String str, int i17, boolean z17, boolean z18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        v65.n nVar = new v65.n(rVar);
        r45.ld2 ld2Var = new r45.ld2();
        ld2Var.set(0, java.lang.Long.valueOf(j19));
        ld2Var.set(1, java.lang.Long.valueOf(j18));
        ld2Var.set(3, str);
        r45.r42 r42Var = new r45.r42();
        r42Var.set(2, java.lang.Long.valueOf(j18));
        r42Var.set(1, java.lang.Long.valueOf(j19));
        r42Var.set(0, java.lang.Long.valueOf(j17));
        r42Var.set(3, java.lang.Integer.valueOf(i17));
        r42Var.set(4, java.lang.Integer.valueOf(z17 ? 1 : 0));
        ke2.o0 o0Var = new ke2.o0("/cgi-bin/mmbiz-bin/finderlivegetproductcarousel", 24836, r42Var, ld2Var, null);
        if (z18) {
            az2.j.u(o0Var, context, null, 200L, 2, null);
        }
        o0Var.l().K(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.u5(this, j17, nVar));
        java.lang.Object j27 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j27;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008b, code lost:
    
        if (r6 != 3) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009a, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r9 < 0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object aj(android.content.Context r17, r45.y23 r18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r19) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5.aj(android.content.Context, r45.y23, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
