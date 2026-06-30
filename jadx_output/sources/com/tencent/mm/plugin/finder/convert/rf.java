package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class rf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f104468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.zf f104469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104470f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f104471g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f104472h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(com.tencent.mm.plugin.finder.convert.zf zfVar, in5.s0 s0Var, so2.h1 h1Var, r45.qt2 qt2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f104469e = zfVar;
        this.f104470f = s0Var;
        this.f104471g = h1Var;
        this.f104472h = qt2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.convert.rf(this.f104469e, this.f104470f, this.f104471g, this.f104472h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.convert.rf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f104468d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ae2.in inVar = ae2.in.f3688a;
            long intValue = ((java.lang.Number) ae2.in.S3.r()).intValue();
            this.f104468d = 1;
            if (kotlinx.coroutines.k1.b(intValue, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.finder.convert.zf zfVar = this.f104469e;
        in5.s0 s0Var = this.f104470f;
        so2.h1 h1Var = this.f104471g;
        zfVar.F(s0Var, h1Var, true);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.u1 u1Var = ml2.u1.D2;
        jz5.l[] lVarArr = new jz5.l[2];
        r45.nw1 liveInfo = h1Var.getFeedObject().getLiveInfo();
        if (liveInfo == null || (str = new java.lang.Long(liveInfo.getLong(0)).toString()) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("liveid", str);
        lVarArr[1] = new jz5.l("button_status", "2");
        java.util.HashMap i18 = kz5.c1.i(lVarArr);
        r45.qt2 qt2Var = this.f104472h;
        zy2.zb.I8(zbVar, u1Var, i18, qt2Var != null ? qt2Var.getString(1) : null, qt2Var != null ? new java.lang.Integer(qt2Var.getInteger(5)).toString() : null, null, null, false, 112, null);
        return jz5.f0.f302826a;
    }
}
