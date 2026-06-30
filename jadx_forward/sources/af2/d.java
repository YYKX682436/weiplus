package af2;

/* loaded from: classes3.dex */
public final class d extends we2.x {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f86055a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f86056b;

    public d(gk2.e liveContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f86055a = liveContext;
        this.f86056b = "LiveMsgRealTimeCheerInfoInterceptor";
    }

    @Override // we2.x
    public boolean b(we2.b respWrapper) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(respWrapper, "respWrapper");
        r45.r71 r71Var = respWrapper.f526747a;
        if (r71Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("receive: ");
            r45.on1 on1Var = (r45.on1) r71Var.m75936x14adae67(31);
            if (on1Var == null || (obj = pm0.b0.g(on1Var)) == null) {
                obj = "null";
            }
            sb6.append(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f86056b, sb6.toString());
            mm2.c1 c1Var = (mm2.c1) this.f86055a.a(mm2.c1.class);
            r45.on1 on1Var2 = (r45.on1) r71Var.m75936x14adae67(31);
            boolean z17 = false;
            java.lang.String str = c1Var.f410333f;
            if (on1Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[canUpdateCheerInfo] newCheerInfo = null , not need update");
            } else if (on1Var2.m75933x41a8a7f2(6)) {
                mm2.w0 w0Var = new mm2.w0(on1Var2.m75945x2fec8307(4), on1Var2.m75939xb282bd08(5));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[canUpdateCheerInfo]  is_modified = " + on1Var2.m75933x41a8a7f2(6) + ",localCheerInfoVersion = " + c1Var.F3 + ", newVersionInfo = " + w0Var);
                mm2.w0 w0Var2 = c1Var.F3;
                if (w0Var2 != null) {
                    if (w0Var2.a(w0Var)) {
                        c1Var.F3 = w0Var;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[canUpdateCheerInfo] result = " + z17);
                } else {
                    c1Var.F3 = w0Var;
                }
                z17 = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[canUpdateCheerInfo] result = " + z17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[canUpdateCheerInfo] is_modified = false,  not need update");
            }
            if (z17) {
                c1Var.O9(on1Var2);
            }
        }
        return true;
    }
}
