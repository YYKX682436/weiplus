package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public abstract class hg {
    public static com.tencent.luggage.sdk.config.AppBrandSysConfigLU a(com.tencent.mm.plugin.appbrand.gg ggVar, k91.v5 v5Var) {
        ((k91.l4) ggVar).getClass();
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC = new com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC();
        appBrandSysConfigWC.f305841d = v5Var.field_nickname;
        appBrandSysConfigWC.f305843f = v5Var.field_smallHeadURL;
        appBrandSysConfigWC.f305842e = v5Var.field_appId;
        appBrandSysConfigWC.f305844g = v5Var.v0().f305706a.f77412g;
        appBrandSysConfigWC.E = v5Var.v0().f305706a.f77413h;
        appBrandSysConfigWC.H = v5Var.v0().f305706a.f77416n;
        appBrandSysConfigWC.I = v5Var.v0().f305706a.f77417o;
        appBrandSysConfigWC.f47293J = v5Var.v0().f305706a.f77418p;
        appBrandSysConfigWC.K = v5Var.v0().f305706a.f77419q;
        appBrandSysConfigWC.L = v5Var.v0().f305706a.f77420r;
        appBrandSysConfigWC.G = v5Var.v0().f305706a.f77415m;
        appBrandSysConfigWC.F = v5Var.v0().f305706a.f77414i;
        appBrandSysConfigWC.M = v5Var.v0().f305706a.M;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = v5Var.u0().f305631f;
        if (list != null) {
            arrayList.addAll(list);
        }
        appBrandSysConfigWC.P = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List list2 = v5Var.u0().f305632g;
        if (list2 != null) {
            arrayList2.addAll(list2);
        }
        appBrandSysConfigWC.Q = arrayList2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.List list3 = v5Var.u0().f305634i;
        if (list3 != null) {
            arrayList3.addAll(list3);
        }
        appBrandSysConfigWC.S = arrayList3;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.List list4 = v5Var.u0().f305633h;
        if (list4 != null) {
            arrayList4.addAll(list4);
        }
        appBrandSysConfigWC.R = arrayList4;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.List list5 = v5Var.u0().f305635j;
        if (list5 != null) {
            arrayList5.addAll(list5);
        }
        appBrandSysConfigWC.T = arrayList5;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.util.List list6 = v5Var.u0().f305636k;
        if (list6 != null) {
            arrayList6.addAll(list6);
        }
        appBrandSysConfigWC.U = arrayList6;
        appBrandSysConfigWC.f47294p0 = v5Var.u0().f305626a;
        appBrandSysConfigWC.f305850p = v5Var.v0().f305706a.f77425w;
        appBrandSysConfigWC.f305851q = v5Var.v0().f305706a.f77426x;
        appBrandSysConfigWC.V = v5Var.v0().f305706a.f77427y;
        appBrandSysConfigWC.Z = new java.lang.String[]{v5Var.field_roundedSquareIconURL, v5Var.field_brandIconURL, v5Var.field_bigHeadURL};
        java.lang.String str = appBrandSysConfigWC.f305842e;
        com.tencent.mm.sdk.platformtools.o4 o4Var = k91.d1.f305561a;
        java.lang.String str2 = str + "_AppDebugEnabled";
        com.tencent.mm.sdk.platformtools.o4 o4Var2 = k91.d1.f305561a;
        appBrandSysConfigWC.f47296w = o4Var2.getBoolean(str2, false) || o4Var2.getBoolean("ENABLE_ALL_APP_DEBUG", false);
        return appBrandSysConfigWC;
    }
}
