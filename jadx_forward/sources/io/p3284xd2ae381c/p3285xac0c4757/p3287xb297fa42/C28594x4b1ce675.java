package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42;

@qz5.f(c = "io.flutter.embedding.engine.MMFlutterEngineGroup$createAndRunEngineAsync$2", f = "MMFlutterEngineGroup.kt", l = {}, m = "invokeSuspend")
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/y0;", "Ljz5/f0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: io.flutter.embedding.engine.MMFlutterEngineGroup$createAndRunEngineAsync$2 */
/* loaded from: classes11.dex */
public final class C28594x4b1ce675 extends qz5.l implements yz5.p {

    /* renamed from: $dartEntrypoint */
    final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f70974x247a6e61;

    /* renamed from: $dartEntrypointArgs */
    final /* synthetic */ java.util.List<java.lang.String> f70975x6b099ade;

    /* renamed from: $engine */
    final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f70976x22f84f66;

    /* renamed from: $initialRoute */
    final /* synthetic */ pi0.m1 f70977x714b3f89;

    /* renamed from: $mmEngine */
    final /* synthetic */ pi0.u0 f70978x1683d826;

    /* renamed from: $options */
    final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28591xc5594961.Options f70979x5130d5fa;

    /* renamed from: label */
    int f70980x61f7ef4;

    /* renamed from: this$0 */
    final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28591xc5594961 f70981xcbdd23aa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28594x4b1ce675(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28591xc5594961 c28591xc5594961, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28591xc5594961.Options options, pi0.u0 u0Var, pi0.m1 m1Var, java.util.List<java.lang.String> list, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<? super io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28594x4b1ce675> interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f70976x22f84f66 = h0Var;
        this.f70981xcbdd23aa = c28591xc5594961;
        this.f70979x5130d5fa = options;
        this.f70978x1683d826 = u0Var;
        this.f70977x714b3f89 = m1Var;
        this.f70975x6b099ade = list;
        this.f70974x247a6e61 = h0Var2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<jz5.f0> mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<?> interfaceC29045xdcb5ca57) {
        return new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28594x4b1ce675(this.f70976x22f84f66, this.f70981xcbdd23aa, this.f70979x5130d5fa, this.f70978x1683d826, this.f70977x714b3f89, this.f70975x6b099ade, this.f70974x247a6e61, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        pz5.a aVar = pz5.a.f440719d;
        if (this.f70980x61f7ef4 != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e = (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e) this.f70976x22f84f66.f391656d;
        if (c28580x69eec95e != null) {
            c28580x69eec95e.m137454xc9039c56("mm_engine_created_launched");
        }
        str = this.f70981xcbdd23aa.TAG;
        io.p3284xd2ae381c.Log.i(str, "start GeneratedPluginRegister");
        java.lang.Object obj2 = this.f70976x22f84f66.f391656d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3298x36f002.C28638x8c7ff645.m138000x8dcb33d4((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e) obj2);
        str2 = this.f70981xcbdd23aa.TAG;
        io.p3284xd2ae381c.Log.i(str2, "do start engineSetup");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        yz5.l engineSetup = this.f70979x5130d5fa.getEngineSetup();
        if (engineSetup != null) {
            engineSetup.mo146xb9724478(this.f70978x1683d826);
        }
        str3 = this.f70981xcbdd23aa.TAG;
        io.p3284xd2ae381c.Log.i(str3, "engineSetup cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        pi0.m1 m1Var = this.f70977x714b3f89;
        if (m1Var != null) {
            java.util.List<java.lang.String> list = this.f70975x6b099ade;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                if (m1Var.f436204g != null) {
                    jSONObject.put("initParams", new org.json.JSONObject(m1Var.f436204g));
                }
            } catch (org.json.JSONException unused) {
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "getEmojiParams(...)");
            list.add(jSONObject2);
            this.f70977x714b3f89.f436201d = this.f70978x1683d826.f436263a;
            str6 = this.f70981xcbdd23aa.TAG;
            io.p3284xd2ae381c.Log.i(str6, "start setInitialRoute");
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            str7 = this.f70981xcbdd23aa.TAG;
            io.p3284xd2ae381c.Log.i(str7, "do start setInitialRoute");
            java.lang.Object obj3 = this.f70976x22f84f66.f391656d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj3);
            ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e) obj3).m137435x8a0ad399().m138193x7e19e2e7(this.f70977x714b3f89.a());
            str8 = this.f70981xcbdd23aa.TAG;
            io.p3284xd2ae381c.Log.i(str8, "setInitialRoute cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis2));
        }
        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
        str4 = this.f70981xcbdd23aa.TAG;
        io.p3284xd2ae381c.Log.i(str4, "do start executeDartEntrypoint");
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e2 = (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e) this.f70976x22f84f66.f391656d;
        if (c28580x69eec95e2 != null) {
            c28580x69eec95e2.m137454xc9039c56("mm_engine_created_execute");
        }
        java.lang.Object obj4 = this.f70976x22f84f66.f391656d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj4);
        ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e) obj4).m137427x4255efe8().m137854x820a9012((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint) this.f70974x247a6e61.f391656d, kz5.n0.S0(this.f70975x6b099ade));
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e3 = (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e) this.f70976x22f84f66.f391656d;
        if (c28580x69eec95e3 != null) {
            c28580x69eec95e3.m137454xc9039c56("mm_engine_created_execute_down");
        }
        str5 = this.f70981xcbdd23aa.TAG;
        io.p3284xd2ae381c.Log.i(str5, "executeDartEntrypoint cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis3));
        return jz5.f0.f384359a;
    }

    @Override // yz5.p
    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object mo149xb9724478(p3325xe03a0797.p3326xc267989b.y0 y0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<? super jz5.f0> interfaceC29045xdcb5ca57) {
        return ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28594x4b1ce675) mo148xaf65a0fc(y0Var, interfaceC29045xdcb5ca57)).mo150x989b7ca4(jz5.f0.f384359a);
    }
}
