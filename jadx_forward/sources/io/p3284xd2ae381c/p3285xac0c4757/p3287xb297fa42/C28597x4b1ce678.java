package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42;

@qz5.f(c = "io.flutter.embedding.engine.MMFlutterEngineGroup$createAndRunEngineAsync$5", f = "MMFlutterEngineGroup.kt", l = {}, m = "invokeSuspend")
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/y0;", "Ljz5/f0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: io.flutter.embedding.engine.MMFlutterEngineGroup$createAndRunEngineAsync$5 */
/* loaded from: classes11.dex */
public final class C28597x4b1ce678 extends qz5.l implements yz5.p {

    /* renamed from: $dartEntrypoint */
    final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f70988x247a6e61;

    /* renamed from: $dartEntrypointArgs */
    final /* synthetic */ java.util.List<java.lang.String> f70989x6b099ade;

    /* renamed from: $engine */
    final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f70990x22f84f66;

    /* renamed from: label */
    int f70991x61f7ef4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28597x4b1ce678(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, java.util.List<java.lang.String> list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<? super io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28597x4b1ce678> interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f70990x22f84f66 = h0Var;
        this.f70988x247a6e61 = h0Var2;
        this.f70989x6b099ade = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<jz5.f0> mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<?> interfaceC29045xdcb5ca57) {
        return new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28597x4b1ce678(this.f70990x22f84f66, this.f70988x247a6e61, this.f70989x6b099ade, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        if (this.f70991x61f7ef4 != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e) this.f70990x22f84f66.f391656d).m137454xc9039c56("mm_spawn_execute_dart_entrypoint");
        ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e) this.f70990x22f84f66.f391656d).m137427x4255efe8().m137855x10d545f9((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint) this.f70988x247a6e61.f391656d, kz5.n0.S0(this.f70989x6b099ade));
        return jz5.f0.f384359a;
    }

    @Override // yz5.p
    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object mo149xb9724478(p3325xe03a0797.p3326xc267989b.y0 y0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<? super jz5.f0> interfaceC29045xdcb5ca57) {
        return ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28597x4b1ce678) mo148xaf65a0fc(y0Var, interfaceC29045xdcb5ca57)).mo150x989b7ca4(jz5.f0.f384359a);
    }
}
