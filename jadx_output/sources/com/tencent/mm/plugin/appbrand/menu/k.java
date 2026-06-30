package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public class k implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.fe0 f85973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f85974e;

    public k(com.tencent.mm.plugin.appbrand.menu.n nVar, r45.fe0 fe0Var, android.content.Context context) {
        this.f85973d = fe0Var;
        this.f85974e = context;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        java.util.LinkedList linkedList = this.f85973d.f374251e;
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        android.content.Context context = this.f85974e;
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(context);
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(f17) && f17.equalsIgnoreCase("en");
        com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegate_DeveloperService", "curLang:%s", f17);
        java.util.Iterator it = linkedList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            r45.o06 o06Var = (r45.o06) it.next();
            java.lang.String str = z17 ? o06Var.f381804h : o06Var.f381802f;
            if (o06Var.f381800d == 2) {
                g4Var.f(i17, com.tencent.mm.sdk.platformtools.t8.K0(str) ? context.getString(com.tencent.mm.R.string.f490086ki) : str);
            } else {
                g4Var.f(i17, com.tencent.mm.sdk.platformtools.t8.K0(str) ? "" : str);
            }
            r45.t06 t06Var = o06Var.f381803g;
            com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegate_DeveloperService", "service_name：%s, itemAppId:%s, miniProgramType:%d", str, t06Var != null ? t06Var.f386050d : "", java.lang.Integer.valueOf(t06Var != null ? t06Var.f386052f : 0));
            i17++;
        }
    }
}
