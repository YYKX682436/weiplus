package bg2;

/* loaded from: classes3.dex */
public final class k2 extends bg2.s6 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bg2.n2 f20243b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(bg2.n2 n2Var, java.lang.Class cls) {
        super(cls);
        this.f20243b = n2Var;
    }

    @Override // bg2.s6
    public void b(com.tencent.mm.protobuf.f fVar, int i17) {
        r45.f52 f52Var;
        cm2.t tVar;
        r45.rc2 result = (r45.rc2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        bg2.n2 n2Var = this.f20243b;
        com.tencent.mars.xlog.Log.i(n2Var.f20322e, "[startPollingPromoteInfo] resp = " + pm0.b0.g(result));
        n2Var.f20324g = result.getByteString(6);
        int integer = result.getInteger(0);
        java.lang.String str = n2Var.f20322e;
        if (integer == 1) {
            com.tencent.mars.xlog.Log.i(str, "[startPollingPromoteInfo] return sync no op");
            return;
        }
        if (result.getInteger(1) != 0) {
            if (result.getInteger(2) <= 0 || (f52Var = (r45.f52) result.getCustom(3)) == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i(str, "[startPollingPromoteInfo] notify to replace, currentInfo:" + pm0.b0.g(result));
            kotlinx.coroutines.flow.j2 j2Var = n2Var.f20323f;
            if (j2Var == null) {
                return;
            }
            zl2.r4 r4Var = zl2.r4.f473950a;
            byte[] byteArray = f52Var.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            ((kotlinx.coroutines.flow.h3) j2Var).k(r4Var.I2(byteArray));
            return;
        }
        kotlinx.coroutines.flow.j2 j2Var2 = n2Var.f20323f;
        if (j2Var2 == null || (tVar = (cm2.t) ((kotlinx.coroutines.flow.h3) j2Var2).getValue()) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "[startPollingPromoteInfo] notify to del, currentInfo:" + pm0.b0.g(tVar.b()));
        if (result.getLong(4) == 0 || result.getLong(4) != tVar.f43385d) {
            com.tencent.mars.xlog.Log.i(str, "[startPollingPromoteInfo] notify to del but return, currentInfo:" + pm0.b0.g(tVar.b()) + ",svrCurrentPromoteId:" + result.getLong(4));
            return;
        }
        r45.f52 f52Var2 = (r45.f52) result.getCustom(3);
        n2Var.f20325h = f52Var2 != null ? f52Var2.getByteString(6) : null;
        kotlinx.coroutines.flow.j2 j2Var3 = n2Var.f20323f;
        if (j2Var3 == null) {
            return;
        }
        ((kotlinx.coroutines.flow.h3) j2Var3).k(null);
    }
}
