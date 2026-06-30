package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public final class u6 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.v6 f76582d;

    public u6(com.tencent.mm.plugin.appbrand.appusage.v6 v6Var) {
        this.f76582d = v6Var;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.appbrand.appusage.q6 q6Var;
        java.util.List list;
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        com.tencent.mars.xlog.Log.i("WxaDesktopEntranceShowLogic", "CGI[getwxadesktopentrance] errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0 && fVar != null && (fVar instanceof r45.vs3)) {
            com.tencent.mm.plugin.appbrand.appusage.v6 v6Var = this.f76582d;
            java.util.LinkedList<r45.fl0> entrance_info = ((r45.vs3) fVar).f388507e;
            kotlin.jvm.internal.o.f(entrance_info, "entrance_info");
            synchronized (v6Var.f76602a) {
                for (r45.fl0 fl0Var : entrance_info) {
                    com.tencent.mm.plugin.appbrand.appusage.p6 p6Var = com.tencent.mm.plugin.appbrand.appusage.q6.f76545d;
                    int i19 = fl0Var.f374418d;
                    p6Var.getClass();
                    com.tencent.mm.plugin.appbrand.appusage.q6[] values = com.tencent.mm.plugin.appbrand.appusage.q6.values();
                    int length = values.length;
                    int i27 = 0;
                    while (true) {
                        if (i27 >= length) {
                            q6Var = null;
                            break;
                        }
                        q6Var = values[i27];
                        if (i19 == q6Var.ordinal()) {
                            break;
                        }
                        i27++;
                    }
                    if (q6Var != null && (list = (java.util.List) ((java.util.LinkedHashMap) v6Var.f76602a).get(q6Var)) != null) {
                        java.util.Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((com.tencent.mm.plugin.appbrand.appusage.r6) it.next()).a(fl0Var);
                        }
                    }
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("WxaDesktopEntranceShowLogic", "refresh() cgi return errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        }
        return 0;
    }
}
