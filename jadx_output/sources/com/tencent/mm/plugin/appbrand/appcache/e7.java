package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes.dex */
public final class e7 extends qz5.l implements yz5.p {
    public e7(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.appcache.e7(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.appbrand.appcache.e7 e7Var = new com.tencent.mm.plugin.appbrand.appcache.e7((kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.widget.Toast.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "TrimAndPrintWxaPkgs Done!", 0).show();
        return jz5.f0.f302826a;
    }
}
