package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ef extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f103252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f103253e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.zf f103254f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f103255g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103256h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f103257i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f103258m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.convert.zf zfVar, long j17, in5.s0 s0Var, java.lang.Integer num, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f103253e = baseFinderFeed;
        this.f103254f = zfVar;
        this.f103255g = j17;
        this.f103256h = s0Var;
        this.f103257i = num;
        this.f103258m = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.convert.ef(this.f103253e, this.f103254f, this.f103255g, this.f103256h, this.f103257i, this.f103258m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.convert.ef) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f103252d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.finder.convert.zf zfVar = this.f103254f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f103253e;
            so2.h1 h1Var = baseFinderFeed instanceof so2.h1 ? (so2.h1) baseFinderFeed : null;
            if (h1Var != null && h1Var.f410380g) {
                return f0Var;
            }
            this.f103252d = 1;
            if (com.tencent.mm.plugin.finder.convert.zf.O1(zfVar, this.f103255g, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str2 = com.tencent.mm.plugin.finder.convert.zf.D1;
        zfVar.getClass();
        in5.s0 s0Var = this.f103256h;
        if (s0Var != null) {
            java.lang.Integer num = this.f103257i;
            android.content.Context context = s0Var.f293121e;
            if (num != null && num.intValue() == 2) {
                str = context.getResources().getString(com.tencent.mm.R.string.dcj);
            } else {
                str = this.f103258m;
                if (str == null || str.length() == 0) {
                    str = context.getResources().getString(com.tencent.mm.R.string.dcj);
                }
            }
            kotlin.jvm.internal.o.d(str);
            com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", "handleLiveStatusToast, wording: ".concat(str));
            db5.t7.m(context, str);
        }
        return f0Var;
    }
}
