package a20;

/* loaded from: classes8.dex */
public final class b extends y10.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String name) {
        super(name);
        kotlin.jvm.internal.o.g(name, "name");
    }

    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            if (jumpInfo.g().b().f192156a.length == 0) {
                com.tencent.mars.xlog.Log.e("ECS_O.NativeHandler.FinderJump", "handle jump finder error: params == null");
                return;
            }
            android.content.Context c17 = context.c();
            if (c17 == null) {
                com.tencent.mars.xlog.Log.e("ECS_O.NativeHandler.FinderJump", "handle jump finder error: context.context is null");
                callback.c("context.context is null");
                return;
            }
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
            finderJumpInfo.parseFrom(jumpInfo.g().b().f192156a);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            xc2.y2 y2Var = xc2.y2.f453343a;
            xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
            p0Var.f453252n = 0;
            xc2.y2.i(y2Var, c17, p0Var, 0, null, 8, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ECS_O.NativeHandler.FinderJump", "handle jump CommonProfile error:" + e17);
        }
    }
}
