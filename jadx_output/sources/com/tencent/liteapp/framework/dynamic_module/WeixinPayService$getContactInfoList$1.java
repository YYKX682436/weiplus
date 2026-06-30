package com.tencent.liteapp.framework.dynamic_module;

@qz5.f(c = "com.tencent.liteapp.framework.dynamic_module.WeixinPayService$getContactInfoList$1", f = "WeixinPayService.kt", l = {1868, 1870}, m = "invokeSuspend")
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/y0;", "Ljz5/f0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class WeixinPayService$getContactInfoList$1 extends qz5.l implements yz5.p {
    final /* synthetic */ org.json.JSONArray $userNames;
    int I$0;
    int I$1;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;
    final /* synthetic */ com.tencent.liteapp.framework.dynamic_module.WeixinPayService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeixinPayService$getContactInfoList$1(org.json.JSONArray jSONArray, com.tencent.liteapp.framework.dynamic_module.WeixinPayService weixinPayService, kotlin.coroutines.Continuation<? super com.tencent.liteapp.framework.dynamic_module.WeixinPayService$getContactInfoList$1> continuation) {
        super(2, continuation);
        this.$userNames = jSONArray;
        this.this$0 = weixinPayService;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation<jz5.f0> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.tencent.liteapp.framework.dynamic_module.WeixinPayService$getContactInfoList$1(this.$userNames, this.this$0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00dc A[Catch: Exception -> 0x010b, TryCatch #2 {Exception -> 0x010b, blocks: (B:10:0x00cd, B:12:0x00dc, B:13:0x0101), top: B:9:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0110 A[Catch: Exception -> 0x010e, TRY_ENTER, TryCatch #0 {Exception -> 0x010e, blocks: (B:28:0x0064, B:32:0x00a3, B:16:0x0110, B:18:0x0122), top: B:27:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c5 -> B:9:0x00cd). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteapp.framework.dynamic_module.WeixinPayService$getContactInfoList$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // yz5.p
    public final java.lang.Object invoke(kotlinx.coroutines.y0 y0Var, kotlin.coroutines.Continuation<? super jz5.f0> continuation) {
        return ((com.tencent.liteapp.framework.dynamic_module.WeixinPayService$getContactInfoList$1) create(y0Var, continuation)).invokeSuspend(jz5.f0.f302826a);
    }
}
