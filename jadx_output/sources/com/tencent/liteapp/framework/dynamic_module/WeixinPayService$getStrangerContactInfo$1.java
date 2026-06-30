package com.tencent.liteapp.framework.dynamic_module;

@qz5.f(c = "com.tencent.liteapp.framework.dynamic_module.WeixinPayService$getStrangerContactInfo$1", f = "WeixinPayService.kt", l = {1907, 1909}, m = "invokeSuspend")
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/y0;", "Ljz5/f0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class WeixinPayService$getStrangerContactInfo$1 extends qz5.l implements yz5.p {
    final /* synthetic */ java.lang.String $userName;
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    final /* synthetic */ com.tencent.liteapp.framework.dynamic_module.WeixinPayService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeixinPayService$getStrangerContactInfo$1(java.lang.String str, com.tencent.liteapp.framework.dynamic_module.WeixinPayService weixinPayService, kotlin.coroutines.Continuation<? super com.tencent.liteapp.framework.dynamic_module.WeixinPayService$getStrangerContactInfo$1> continuation) {
        super(2, continuation);
        this.$userName = str;
        this.this$0 = weixinPayService;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation<jz5.f0> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.tencent.liteapp.framework.dynamic_module.WeixinPayService$getStrangerContactInfo$1(this.$userName, this.this$0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0080 A[Catch: Exception -> 0x00d7, TryCatch #0 {Exception -> 0x00d7, blocks: (B:7:0x001c, B:8:0x007c, B:10:0x0080, B:12:0x0099, B:16:0x00a5, B:18:0x00cb, B:22:0x002c, B:23:0x0061, B:28:0x0033), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5 A[Catch: Exception -> 0x00d7, TryCatch #0 {Exception -> 0x00d7, blocks: (B:7:0x001c, B:8:0x007c, B:10:0x0080, B:12:0x0099, B:16:0x00a5, B:18:0x00cb, B:22:0x002c, B:23:0x0061, B:28:0x0033), top: B:2:0x000e }] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteapp.framework.dynamic_module.WeixinPayService$getStrangerContactInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // yz5.p
    public final java.lang.Object invoke(kotlinx.coroutines.y0 y0Var, kotlin.coroutines.Continuation<? super jz5.f0> continuation) {
        return ((com.tencent.liteapp.framework.dynamic_module.WeixinPayService$getStrangerContactInfo$1) create(y0Var, continuation)).invokeSuspend(jz5.f0.f302826a);
    }
}
