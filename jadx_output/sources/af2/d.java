package af2;

/* loaded from: classes3.dex */
public final class d extends we2.x {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f4522a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f4523b;

    public d(gk2.e liveContext) {
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f4522a = liveContext;
        this.f4523b = "LiveMsgRealTimeCheerInfoInterceptor";
    }

    @Override // we2.x
    public boolean b(we2.b respWrapper) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(respWrapper, "respWrapper");
        r45.r71 r71Var = respWrapper.f445214a;
        if (r71Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("receive: ");
            r45.on1 on1Var = (r45.on1) r71Var.getCustom(31);
            if (on1Var == null || (obj = pm0.b0.g(on1Var)) == null) {
                obj = "null";
            }
            sb6.append(obj);
            com.tencent.mars.xlog.Log.i(this.f4523b, sb6.toString());
            mm2.c1 c1Var = (mm2.c1) this.f4522a.a(mm2.c1.class);
            r45.on1 on1Var2 = (r45.on1) r71Var.getCustom(31);
            boolean z17 = false;
            java.lang.String str = c1Var.f328800f;
            if (on1Var2 == null) {
                com.tencent.mars.xlog.Log.i(str, "[canUpdateCheerInfo] newCheerInfo = null , not need update");
            } else if (on1Var2.getBoolean(6)) {
                mm2.w0 w0Var = new mm2.w0(on1Var2.getString(4), on1Var2.getInteger(5));
                com.tencent.mars.xlog.Log.i(str, "[canUpdateCheerInfo]  is_modified = " + on1Var2.getBoolean(6) + ",localCheerInfoVersion = " + c1Var.F3 + ", newVersionInfo = " + w0Var);
                mm2.w0 w0Var2 = c1Var.F3;
                if (w0Var2 != null) {
                    if (w0Var2.a(w0Var)) {
                        c1Var.F3 = w0Var;
                    }
                    com.tencent.mars.xlog.Log.i(str, "[canUpdateCheerInfo] result = " + z17);
                } else {
                    c1Var.F3 = w0Var;
                }
                z17 = true;
                com.tencent.mars.xlog.Log.i(str, "[canUpdateCheerInfo] result = " + z17);
            } else {
                com.tencent.mars.xlog.Log.i(str, "[canUpdateCheerInfo] is_modified = false,  not need update");
            }
            if (z17) {
                c1Var.O9(on1Var2);
            }
        }
        return true;
    }
}
