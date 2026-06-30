package com.tencent.mm.feature.finder.live;

@j95.b
/* loaded from: classes3.dex */
public final class z5 extends i95.w implements s40.a1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f67057d = "FinderLiveShoppingService";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f67058e = "finder_shop_disclaimer_mmkv";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f67059f = "finder_shop_disclaimer_appid";

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
    public static final java.lang.Object wi(com.tencent.mm.feature.finder.live.z5 r18, android.content.Context r19, java.lang.String r20, long r21, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.finder.live.z5.wi(com.tencent.mm.feature.finder.live.z5, android.content.Context, java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void Ai(l81.b1 bundle) {
        boolean z17;
        kotlin.jvm.internal.o.g(bundle, "bundle");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("check native extra ");
        l81.p0 p0Var = bundle.f317028i;
        sb6.append(p0Var != null ? p0Var.a() : null);
        com.tencent.mars.xlog.Log.i(this.f67057d, sb6.toString());
        xy2.b bVar = xy2.b.f458155b;
        l81.p0 p0Var2 = bundle.f317028i;
        if (p0Var2 != null && (p0Var2 instanceof dk2.ah)) {
            dk2.ah ahVar = p0Var2 instanceof dk2.ah ? (dk2.ah) p0Var2 : null;
            java.lang.String str = ahVar != null ? ahVar.f233217m : null;
            if (!(str == null || str.length() == 0)) {
                z17 = true;
                pm0.z.b(bVar, "checkShoppingNativeExtra", z17, pm0.w.f356806g, null, false, false, com.tencent.mm.feature.finder.live.o5.f66855d, 56, null);
            }
        }
        z17 = false;
        pm0.z.b(bVar, "checkShoppingNativeExtra", z17, pm0.w.f356806g, null, false, false, com.tencent.mm.feature.finder.live.o5.f66855d, 56, null);
    }

    public final java.lang.Object Bi(android.content.Context context, long j17, gk2.e eVar, l81.b1 b1Var, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        long j18 = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0);
        long j19 = ((mm2.e1) eVar.a(mm2.e1.class)).f328983m;
        java.lang.String str = ((mm2.c1) eVar.a(mm2.c1.class)).f328852o;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("productId", j17);
        jSONObject.put("liveId", j18);
        jSONObject.put("objectId", j19);
        jSONObject.put("anchorUsername", str);
        jSONObject.put("reqScene", i18);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mm.plugin.appbrand.config.l e17 = b1Var.G.e();
        e17.O = xt2.k6.class.getName();
        e17.P = jSONObject2;
        b1Var.G = e17.a();
        return jz5.f0.f302826a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.Object Di(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        new ek2.y0(str, null, 2, 0 == true ? 1 : 0).l().K(new com.tencent.mm.feature.finder.live.p5(new v65.n(rVar), this, str));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public final java.lang.Object Ni(android.content.Context context, long j17, gk2.e eVar, int i17, boolean z17, boolean z18, kotlin.coroutines.Continuation continuation) {
        return Zi(context, j17, ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) eVar.a(mm2.e1.class)).f328983m, ((mm2.c1) eVar.a(mm2.c1.class)).f328852o, i17, z17, z18, continuation);
    }

    public java.lang.Object Ri(java.lang.String str, int i17, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        r45.ld2 ld2Var = new r45.ld2();
        ld2Var.set(3, str);
        s40.b1 b1Var = (s40.b1) i95.n0.c(s40.b1.class);
        r45.va1 va1Var = new r45.va1();
        va1Var.set(0, str);
        va1Var.set(1, java.lang.Integer.valueOf(i17));
        ((com.tencent.mm.feature.finder.live.t6) b1Var).getClass();
        new ke2.o0("/cgi-bin/mmbiz-bin/findergetwindowproductprofilecardinfo", 7263, va1Var, ld2Var, null).l().K(new com.tencent.mm.feature.finder.live.q5(rVar, this));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
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
    public java.lang.Object Ui(java.lang.String r17, int r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.finder.live.z5.Ui(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Vi(android.content.Context context, l81.b1 bundle, java.lang.String anchorUsername, long j17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bundle, "bundle");
        kotlin.jvm.internal.o.g(anchorUsername, "anchorUsername");
        v65.i.c(new com.tencent.mm.sdk.coroutines.LifecycleScope(this.f67057d, context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null, 0, 4, null), null, new com.tencent.mm.feature.finder.live.t5(bundle, this, context, anchorUsername, j17, null), 1, null);
    }

    public final java.lang.Object Zi(android.content.Context context, long j17, long j18, long j19, java.lang.String str, int i17, boolean z17, boolean z18, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
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
        o0Var.l().K(new com.tencent.mm.feature.finder.live.u5(this, j17, nVar));
        java.lang.Object j27 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
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
    public java.lang.Object aj(android.content.Context r17, r45.y23 r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.finder.live.z5.aj(android.content.Context, r45.y23, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
