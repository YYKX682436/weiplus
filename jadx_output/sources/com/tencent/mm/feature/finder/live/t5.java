package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class t5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f66938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f66939e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.z5 f66940f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66941g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66942h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f66943i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(l81.b1 b1Var, com.tencent.mm.feature.finder.live.z5 z5Var, android.content.Context context, java.lang.String str, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f66939e = b1Var;
        this.f66940f = z5Var;
        this.f66941g = context;
        this.f66942h = str;
        this.f66943i = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.feature.finder.live.t5(this.f66939e, this.f66940f, this.f66941g, this.f66942h, this.f66943i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.feature.finder.live.t5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object wi6;
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f66938d;
        android.content.Context context = this.f66941g;
        com.tencent.mm.feature.finder.live.z5 z5Var = this.f66940f;
        l81.b1 b1Var = this.f66939e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
            b1Var.f317016c = zl2.q4.f473933a.x();
            com.tencent.mm.feature.finder.live.z5 z5Var2 = this.f66940f;
            android.content.Context context2 = this.f66941g;
            java.lang.String str3 = this.f66942h;
            long j17 = this.f66943i;
            this.f66938d = 1;
            wi6 = com.tencent.mm.feature.finder.live.z5.wi(z5Var2, context2, str3, j17, this);
            if (wi6 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                z5Var.Ai(b1Var);
                ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            wi6 = obj;
        }
        jz5.l lVar = (jz5.l) wi6;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) lVar.f302833d;
        r45.ea1 ea1Var = (r45.ea1) lVar.f302834e;
        java.lang.String u17 = pm0.v.u(finderObject != null ? finderObject.getId() : 0L);
        if (finderObject == null || (str = finderObject.getObjectNonceId()) == null) {
            str = "";
        }
        l81.p0 p0Var = b1Var.f317028i;
        dk2.ah ahVar = p0Var instanceof dk2.ah ? (dk2.ah) p0Var : null;
        java.lang.String str4 = ahVar != null ? ahVar.f233225u : null;
        z5Var.getClass();
        int integer = ea1Var != null ? ea1Var.getInteger(3) : 0;
        int integer2 = ea1Var != null ? ea1Var.getInteger(2) : 0;
        boolean z17 = integer == 1 && integer2 == 1;
        java.lang.String str5 = z5Var.f67057d;
        com.tencent.mars.xlog.Log.i(str5, "isLiving = " + integer + ", isInLivingRoom = " + integer2);
        if (z17) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedId", u17);
            jSONObject.put("nonceId", str);
            jSONObject.put("lastGMsgId", str4 == null ? "" : str4);
            str2 = jSONObject.toString();
        } else {
            str2 = "";
        }
        kotlin.jvm.internal.o.d(str2);
        com.tencent.mars.xlog.Log.i(str5, "fillTraceInfoToTongue lastGMsgId:" + str4);
        if (z17) {
            ((vd2.i5) i95.n0.c(vd2.i5.class)).getClass();
            b1Var.V = com.tencent.mm.plugin.finder.view.ck.class;
            b1Var.W = str2;
        }
        r45.y23 y23Var = ea1Var != null ? (r45.y23) ea1Var.getCustom(1) : null;
        if (y23Var != null) {
            xy2.b bVar = xy2.b.f458155b;
            l81.p0 p0Var2 = b1Var.f317028i;
            pm0.z.b(bVar, "setDragBarIfNeeded", p0Var2 != null && (p0Var2 instanceof dk2.ah), pm0.w.f356806g, null, false, false, new com.tencent.mm.feature.finder.live.w5(b1Var), 56, null);
            l81.p0 p0Var3 = b1Var.f317028i;
            dk2.ah ahVar2 = p0Var3 != null ? p0Var3 instanceof dk2.ah ? (dk2.ah) p0Var3 : null : new dk2.ah();
            r45.ce0 ce0Var = (r45.ce0) y23Var.getCustom(8);
            boolean z18 = ce0Var != null && ce0Var.getInteger(6) == 1;
            com.tencent.mars.xlog.Log.i(str5, "open with dragbar = " + z18);
            if (ahVar2 != null) {
                ahVar2.f233218n = z18;
            }
            b1Var.f317028i = ahVar2;
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig2 = b1Var.G;
            if (halfScreenConfig2 != null) {
                com.tencent.mm.plugin.appbrand.config.l e17 = halfScreenConfig2.e();
                com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig3 = b1Var.G;
                e17.f77532l = halfScreenConfig3.f77364n;
                e17.C = halfScreenConfig3.d() && z18;
                r45.ce0 ce0Var2 = (r45.ce0) y23Var.getCustom(8);
                e17.H = !(ce0Var2 != null && ce0Var2.getInteger(5) == 1);
                halfScreenConfig = e17.a();
            } else {
                halfScreenConfig = null;
            }
            b1Var.G = halfScreenConfig;
        }
        if (zl2.r4.f473950a.D1(ea1Var != null ? (r45.y23) ea1Var.getCustom(1) : null)) {
            com.tencent.mm.plugin.appbrand.config.l e18 = b1Var.G.e();
            e18.f77534n = true;
            e18.f77531k = k91.t2.f305767e;
            e18.C = true;
            e18.f77541u = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig(true, "");
            b1Var.G = e18.a();
            b1Var.Z = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491483m81);
        }
        r45.y23 y23Var2 = ea1Var != null ? (r45.y23) ea1Var.getCustom(1) : null;
        this.f66938d = 2;
        if (z5Var.aj(context, y23Var2, this) == aVar) {
            return aVar;
        }
        z5Var.Ai(b1Var);
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
        return jz5.f0.f302826a;
    }
}
