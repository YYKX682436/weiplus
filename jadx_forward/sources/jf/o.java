package jf;

/* loaded from: classes7.dex */
public final class o implements nh1.b {
    @Override // nh1.b
    public void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        sj1.b bVar;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b pageView = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) v5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        int i17 = sj1.l.f489904a;
        if (i17 != 1 && i17 != 3) {
            android.widget.Toast.makeText(context, "Not in Perfetto mod", 1).show();
            return;
        }
        if ((!sj1.l.f489905b || (bVar = (sj1.b) sj1.l.f489906c.get("")) == null) ? false : bVar.getF127349a()) {
            android.widget.Toast.makeText(context, "Stop Trace", 1).show();
            pageView.mo32091x9a3f0ba2().C0().mo50350x12b4fba4().mo50293x3498a0(jf.k.f380870d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f229341e = pageView.mo32091x9a3f0ba2().C0().getF229341e();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f229341e, "getJsRuntime(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) f229341e.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class);
            pageView.a2().mo14660x738236e6(";TraceGlobal.flushTrace();", jf.l.f380871a);
            f0Var.mo51545x3498a0(new jf.n(context));
            return;
        }
        android.widget.Toast.makeText(context, "Start Trace", 1).show();
        if (sj1.l.f489905b) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            sj1.b bVar2 = (sj1.b) sj1.l.f489906c.get("");
            if (bVar2 != null) {
                bVar2.i();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageTracer", "startTrace cost:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b pageView = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) v5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        return "Skyline Trace";
    }

    @Override // nh1.b
    public boolean c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b pageView = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) v5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return z65.c.a();
    }
}
