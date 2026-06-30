package bz0;

/* loaded from: classes5.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f36726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f36727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f36728f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kotlinx.coroutines.r2 r2Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f36727e = r2Var;
        this.f36728f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bz0.c(this.f36727e, this.f36728f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bz0.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f36726d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var = this.f36727e;
            if (r2Var != null) {
                this.f36726d = 1;
                if (r2Var.C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.autogen.mmdata.rpt.MaaSCreationReportStruct maaSCreationReportStruct = bz0.f.f36737c;
        bz0.f fVar = bz0.f.f36735a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker multiMediaVideoChecker = com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker.f156451a;
        java.lang.String str = this.f36728f;
        qc0.d1 b17 = multiMediaVideoChecker.b(str);
        if (b17 != null) {
            com.tencent.mars.xlog.Log.i("MaasReport24946", "getVideoReportInfo videoPath:" + str + " info:" + b17);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONArray.put(b17.f361363a);
            jSONArray.put(b17.f361364b);
            jSONObject.put("s", jSONArray);
            jSONObject.put("d", b17.f361366d);
            jSONObject.put("f", java.lang.Float.valueOf(b17.f361365c));
            jSONObject.put("vb", b17.f361367e);
            jSONObject.put("ab", b17.f361370h);
            jSONObject.put("as", b17.f361372j);
            jSONObject.put("acc", b17.f361371i);
            jSONObject.put("t", b17.f361369g ? "265" : "264");
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        maaSCreationReportStruct.f58934i = maaSCreationReportStruct.b("exportMediaInfo", r26.i0.t(jSONObject2, ",", ";", false), true);
        return jz5.f0.f302826a;
    }
}
