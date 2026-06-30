package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class j3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.v8_snapshot.j3 f90743a = new com.tencent.mm.plugin.appbrand.v8_snapshot.j3();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.v8_snapshot.h3 f90744b = new com.tencent.mm.plugin.appbrand.v8_snapshot.h3();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f90745c = jz5.h.b(com.tencent.mm.plugin.appbrand.v8_snapshot.i3.f90735d);

    public final int a(com.tencent.mm.plugin.appbrand.report.quality.o0 o0Var) {
        return (o0Var != null ? o0Var.ordinal() : -1) + 1;
    }

    public final boolean b() {
        return ((java.lang.Boolean) ((jz5.n) f90745c).getValue()).booleanValue();
    }

    public final long c(com.tencent.mm.plugin.appbrand.v8_snapshot.g3 g3Var) {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        return uptimeMillis - f90744b.get().get(g3Var.f90719d, 1 + uptimeMillis);
    }

    public final void d(com.tencent.mm.plugin.appbrand.v8_snapshot.g3 g3Var) {
        f90744b.get().put(g3Var.f90719d, android.os.SystemClock.uptimeMillis());
    }

    public final void e(boolean z17, com.tencent.luggage.sdk.jsapi.component.service.y yVar) {
        long c17 = c(com.tencent.mm.plugin.appbrand.v8_snapshot.g3.f90714f);
        com.tencent.mm.plugin.appbrand.report.quality.o0 w17 = yVar != null ? yVar.w1() : null;
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        if (com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", "onAllocEmptySubContextEnd, costTimeMs: " + c17 + ", allocSuccess: " + z17 + ", componentInitType: " + w17);
        }
        if (b()) {
            com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f55110d = 8;
            androidWAServiceLibSnapshotQualityStruct.s(cl.x.b());
            androidWAServiceLibSnapshotQualityStruct.f55118l = a(w17);
            androidWAServiceLibSnapshotQualityStruct.f55113g = c17;
            androidWAServiceLibSnapshotQualityStruct.p(z17 ? "1" : "0");
            androidWAServiceLibSnapshotQualityStruct.k();
        }
    }

    public final void f(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, java.lang.String str, boolean z17, com.tencent.luggage.sdk.jsapi.component.service.y yVar) {
        java.lang.String str2;
        long c17 = c(com.tencent.mm.plugin.appbrand.v8_snapshot.g3.f90716h);
        com.tencent.mm.plugin.appbrand.report.quality.o0 w17 = yVar != null ? yVar.w1() : null;
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        if (com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAllocSnapshotSubContextEnd, costTimeMs: ");
            sb6.append(c17);
            sb6.append(", commLibReader: ");
            sb6.append(iCommLibReader != null ? t(iCommLibReader) : null);
            sb6.append(", contextName: ");
            sb6.append(str);
            sb6.append(", allocSuccess: ");
            sb6.append(z17);
            sb6.append(", componentInitType: ");
            sb6.append(w17);
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
        }
        if (b()) {
            com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f55110d = 11;
            if (iCommLibReader == null || (str2 = t(iCommLibReader)) == null) {
                str2 = "";
            }
            androidWAServiceLibSnapshotQualityStruct.r(str2);
            androidWAServiceLibSnapshotQualityStruct.s(cl.x.b());
            androidWAServiceLibSnapshotQualityStruct.f55118l = a(w17);
            androidWAServiceLibSnapshotQualityStruct.f55113g = c17;
            androidWAServiceLibSnapshotQualityStruct.p(str);
            androidWAServiceLibSnapshotQualityStruct.q(z17 ? "1" : "0");
            androidWAServiceLibSnapshotQualityStruct.k();
        }
    }

    public final void g(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        if (com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAllocSnapshotSubContextStart, commLibReader: ");
            sb6.append(iCommLibReader != null ? t(iCommLibReader) : null);
            sb6.append(", contextName: ");
            sb6.append(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
        }
        d(com.tencent.mm.plugin.appbrand.v8_snapshot.g3.f90716h);
        if (b()) {
            com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f55110d = 10;
            if (iCommLibReader == null || (str2 = t(iCommLibReader)) == null) {
                str2 = "";
            }
            androidWAServiceLibSnapshotQualityStruct.r(str2);
            androidWAServiceLibSnapshotQualityStruct.s(cl.x.b());
            androidWAServiceLibSnapshotQualityStruct.p(str);
            androidWAServiceLibSnapshotQualityStruct.k();
        }
    }

    public final void h(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, java.lang.String str, boolean z17, cl.k1 k1Var, com.tencent.luggage.sdk.jsapi.component.service.y yVar) {
        long j17 = k1Var == null ? 0L : k1Var.f42676b - k1Var.f42675a;
        com.tencent.mm.plugin.appbrand.report.quality.o0 w17 = yVar != null ? yVar.w1() : null;
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        if (com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBootstrapMainContext, costTimeMs: ");
            sb6.append(j17);
            sb6.append(", commLibReader: ");
            sb6.append(iCommLibReader != null ? t(iCommLibReader) : null);
            sb6.append(", scriptName: ");
            sb6.append(str);
            sb6.append(", bootstrapSuccess: ");
            sb6.append(z17);
            sb6.append(", executeDetails: ");
            sb6.append(k1Var);
            sb6.append(", componentInitType: ");
            sb6.append(w17);
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
        }
        if (b()) {
            com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f55110d = 15;
            androidWAServiceLibSnapshotQualityStruct.s(cl.x.b());
            androidWAServiceLibSnapshotQualityStruct.f55118l = a(w17);
            androidWAServiceLibSnapshotQualityStruct.f55113g = j17;
            androidWAServiceLibSnapshotQualityStruct.p(str);
            androidWAServiceLibSnapshotQualityStruct.q(java.lang.String.valueOf((z17 ? 1 : -1) * (k1Var != null ? k1Var.codeCacheStatus : 0)));
            androidWAServiceLibSnapshotQualityStruct.k();
        }
    }

    public final void i(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo snapshotInfo, boolean z17, cl.k1 k1Var, com.tencent.luggage.sdk.jsapi.component.service.y yVar) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(snapshotInfo, "snapshotInfo");
        long j17 = k1Var == null ? 0L : k1Var.f42676b - k1Var.f42675a;
        com.tencent.mm.plugin.appbrand.report.quality.o0 w17 = yVar != null ? yVar.w1() : null;
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        boolean z18 = com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c;
        com.tencent.mm.plugin.appbrand.v8_snapshot.l3 l3Var = snapshotInfo.f90668h;
        if (z18) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBootstrapSnapshotMainContextEnd, costTimeMs: ");
            sb6.append(j17);
            sb6.append(", commLibReader: ");
            sb6.append(iCommLibReader != null ? t(iCommLibReader) : null);
            sb6.append(", category: ");
            sb6.append(l3Var);
            sb6.append(", bootstrapSuccess: ");
            sb6.append(z17);
            sb6.append(", executeDetails: ");
            sb6.append(k1Var);
            sb6.append(", componentInitType: ");
            sb6.append(w17);
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
        }
        if (b()) {
            com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f55110d = 17;
            if (iCommLibReader == null || (str = t(iCommLibReader)) == null) {
                str = "";
            }
            androidWAServiceLibSnapshotQualityStruct.r(str);
            androidWAServiceLibSnapshotQualityStruct.s(cl.x.b());
            androidWAServiceLibSnapshotQualityStruct.f55118l = a(w17);
            androidWAServiceLibSnapshotQualityStruct.f55113g = j17;
            androidWAServiceLibSnapshotQualityStruct.p(java.lang.String.valueOf(z17));
            androidWAServiceLibSnapshotQualityStruct.q(l3Var.f90775d);
            androidWAServiceLibSnapshotQualityStruct.k();
        }
    }

    public final void j(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo snapshotInfo) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(snapshotInfo, "snapshotInfo");
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        boolean z17 = com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c;
        com.tencent.mm.plugin.appbrand.v8_snapshot.l3 l3Var = snapshotInfo.f90668h;
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBootstrapSnapshotMainContextStart, commLibReader: ");
            sb6.append(iCommLibReader != null ? t(iCommLibReader) : null);
            sb6.append(", category: ");
            sb6.append(l3Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
        }
        if (b()) {
            com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f55110d = 16;
            if (iCommLibReader == null || (str = t(iCommLibReader)) == null) {
                str = "";
            }
            androidWAServiceLibSnapshotQualityStruct.r(str);
            androidWAServiceLibSnapshotQualityStruct.s(cl.x.b());
            androidWAServiceLibSnapshotQualityStruct.p(l3Var.f90775d);
            androidWAServiceLibSnapshotQualityStruct.k();
        }
    }

    public final void k(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, java.lang.String str, com.tencent.luggage.sdk.jsapi.component.service.y yVar) {
        java.lang.String str2;
        long c17 = c(com.tencent.mm.plugin.appbrand.v8_snapshot.g3.f90717i);
        com.tencent.mm.plugin.appbrand.report.quality.o0 w17 = yVar != null ? yVar.w1() : null;
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        if (com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBootstrapSnapshotSubContextEnd, costTimeMs: ");
            sb6.append(c17);
            sb6.append(", commLibReader: ");
            sb6.append(iCommLibReader != null ? t(iCommLibReader) : null);
            sb6.append(", contextName: ");
            sb6.append(str);
            sb6.append(", componentInitType: ");
            sb6.append(w17);
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
        }
        if (b()) {
            com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f55110d = 13;
            if (iCommLibReader == null || (str2 = t(iCommLibReader)) == null) {
                str2 = "";
            }
            androidWAServiceLibSnapshotQualityStruct.r(str2);
            androidWAServiceLibSnapshotQualityStruct.s(cl.x.b());
            androidWAServiceLibSnapshotQualityStruct.f55118l = a(w17);
            androidWAServiceLibSnapshotQualityStruct.f55113g = c17;
            androidWAServiceLibSnapshotQualityStruct.p(str);
            androidWAServiceLibSnapshotQualityStruct.k();
        }
    }

    public final void l(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        if (com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBootstrapSnapshotSubContextStart, commLibReader: ");
            sb6.append(iCommLibReader != null ? t(iCommLibReader) : null);
            sb6.append(", contextName: ");
            sb6.append(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
        }
        d(com.tencent.mm.plugin.appbrand.v8_snapshot.g3.f90717i);
        if (b()) {
            com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f55110d = 12;
            if (iCommLibReader == null || (str2 = t(iCommLibReader)) == null) {
                str2 = "";
            }
            androidWAServiceLibSnapshotQualityStruct.r(str2);
            androidWAServiceLibSnapshotQualityStruct.s(cl.x.b());
            androidWAServiceLibSnapshotQualityStruct.p(str);
            androidWAServiceLibSnapshotQualityStruct.k();
        }
    }

    public final void m(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, java.lang.String str, java.util.List list, java.util.List list2, com.tencent.luggage.sdk.jsapi.component.service.y yVar) {
        cl.k1[] k1VarArr;
        java.lang.Boolean[] boolArr;
        long c17 = c(com.tencent.mm.plugin.appbrand.v8_snapshot.g3.f90715g);
        java.lang.String str2 = null;
        com.tencent.mm.plugin.appbrand.report.quality.o0 w17 = yVar != null ? yVar.w1() : null;
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        if (com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBootstrapSubContextEnd, costTimeMs: ");
            sb6.append(c17);
            sb6.append(", commLibReader: ");
            sb6.append(iCommLibReader != null ? t(iCommLibReader) : null);
            sb6.append(", scriptName: ");
            sb6.append(str);
            sb6.append(", bootstrapSuccess: ");
            sb6.append((list == null || (boolArr = (java.lang.Boolean[]) list.toArray(new java.lang.Boolean[0])) == null) ? null : kz5.s.b(boolArr));
            sb6.append(", executeDetails: ");
            if (list2 != null && (k1VarArr = (cl.k1[]) list2.toArray(new cl.k1[0])) != null) {
                str2 = java.util.Arrays.toString(k1VarArr);
                kotlin.jvm.internal.o.f(str2, "toString(...)");
            }
            sb6.append(str2);
            sb6.append(", componentInitType: ");
            sb6.append(w17);
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
        }
        if (b()) {
            java.lang.String str3 = "";
            if (list != null && list2 != null && !list.isEmpty()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int size = list.size();
                int i17 = 0;
                while (true) {
                    int i18 = 1;
                    if (i17 < size) {
                        java.lang.Boolean bool = (java.lang.Boolean) list.get(i17);
                        if (bool == null) {
                            i18 = 0;
                        } else if (!kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
                            if (!kotlin.jvm.internal.o.b(bool, java.lang.Boolean.FALSE)) {
                                throw new jz5.j();
                            }
                            i18 = -1;
                        }
                        cl.k1 k1Var = (cl.k1) list2.get(i17);
                        arrayList.add(java.lang.Integer.valueOf(i18 * (k1Var != null ? k1Var.codeCacheStatus : 0)));
                        i17++;
                    } else {
                        str3 = 1 == arrayList.size() ? java.lang.String.valueOf(((java.lang.Number) arrayList.get(0)).intValue()) : kz5.n0.g0(arrayList, "_", null, null, 0, null, null, 62, null);
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", "onBootstrapSubContextEnd, actionParams2: " + str3);
            com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f55110d = 9;
            androidWAServiceLibSnapshotQualityStruct.s(cl.x.b());
            androidWAServiceLibSnapshotQualityStruct.f55118l = a(w17);
            androidWAServiceLibSnapshotQualityStruct.f55113g = c17;
            androidWAServiceLibSnapshotQualityStruct.p(str);
            androidWAServiceLibSnapshotQualityStruct.q(str3);
            androidWAServiceLibSnapshotQualityStruct.k();
        }
    }

    public final void n(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        if (com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBootstrapSubContextStart, commLibReader: ");
            sb6.append(iCommLibReader != null ? t(iCommLibReader) : null);
            sb6.append(", scriptName: ");
            sb6.append(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
        }
        d(com.tencent.mm.plugin.appbrand.v8_snapshot.g3.f90715g);
    }

    public final void o(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo, long j17, long j18, boolean z17, com.tencent.luggage.sdk.jsapi.component.service.y yVar) {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.v8_snapshot.l3 l3Var;
        java.lang.String str2;
        long j19 = j17;
        long c17 = c(com.tencent.mm.plugin.appbrand.v8_snapshot.g3.f90713e);
        com.tencent.mm.plugin.appbrand.report.quality.o0 w17 = yVar != null ? yVar.w1() : null;
        boolean z18 = wxaPkgV8SnapshotInfo != null ? wxaPkgV8SnapshotInfo.f90674q : false;
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        java.lang.String str3 = "";
        if (com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreateIsolateEnd, ");
            sb6.append(wxaPkgV8SnapshotInfo != null ? "" : "not ");
            sb6.append("use snapshot, costTimeMs: ");
            sb6.append(c17);
            sb6.append(", isolateCreateCostMs: ");
            sb6.append(j19);
            sb6.append(", contextCreateCostMs: ");
            sb6.append(j18);
            sb6.append(", didRecover: ");
            sb6.append(z17);
            sb6.append(", isNodeSnapshot: ");
            sb6.append(z18);
            sb6.append(", commLibReader: ");
            sb6.append(iCommLibReader != null ? t(iCommLibReader) : null);
            sb6.append(", componentInitType: ");
            sb6.append(w17);
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
        }
        boolean z19 = wxaPkgV8SnapshotInfo != null;
        if (b()) {
            com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f55110d = 7;
            if (iCommLibReader == null || (str = t(iCommLibReader)) == null) {
                str = "";
            }
            androidWAServiceLibSnapshotQualityStruct.r(str);
            androidWAServiceLibSnapshotQualityStruct.s(cl.x.b());
            androidWAServiceLibSnapshotQualityStruct.f55118l = a(w17);
            androidWAServiceLibSnapshotQualityStruct.f55113g = j19 >= 0 ? j19 : c17;
            androidWAServiceLibSnapshotQualityStruct.p(z19 ? "1" : "0");
            androidWAServiceLibSnapshotQualityStruct.q(j18 >= 0 ? java.lang.String.valueOf(j18) : "");
            if (wxaPkgV8SnapshotInfo != null && (l3Var = wxaPkgV8SnapshotInfo.f90668h) != null && (str2 = l3Var.f90775d) != null) {
                str3 = str2;
            }
            androidWAServiceLibSnapshotQualityStruct.f55116j = androidWAServiceLibSnapshotQualityStruct.b("ActionParams3", str3, true);
            if (j19 < 0) {
                j19 = 0;
            }
            androidWAServiceLibSnapshotQualityStruct.f55117k = androidWAServiceLibSnapshotQualityStruct.b("ActionParams4", java.lang.String.valueOf((c17 - j19) - (j18 >= 0 ? j18 : 0L)), true);
            androidWAServiceLibSnapshotQualityStruct.f55119m = androidWAServiceLibSnapshotQualityStruct.b("ActionParams5", z17 ? "1" : "0", true);
            androidWAServiceLibSnapshotQualityStruct.f55120n = androidWAServiceLibSnapshotQualityStruct.b("ActionParams6", z18 ? "1" : "0", true);
            androidWAServiceLibSnapshotQualityStruct.k();
        }
    }

    public final void p(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo) {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.v8_snapshot.l3 l3Var;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        if (com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c) {
            if (wxaPkgV8SnapshotInfo != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreateIsolateStart, use snapshot, commLibReader: ");
                sb6.append(iCommLibReader != null ? t(iCommLibReader) : null);
                sb6.append(", metaInfo: ");
                sb6.append(wxaPkgV8SnapshotInfo.f90673p);
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
            } else {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onCreateIsolateStart, not use snapshot, commLibReader: ");
                sb7.append(iCommLibReader != null ? t(iCommLibReader) : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb7.toString());
            }
        }
        d(com.tencent.mm.plugin.appbrand.v8_snapshot.g3.f90713e);
        boolean z17 = wxaPkgV8SnapshotInfo != null;
        if (b()) {
            com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f55110d = 6;
            java.lang.String str3 = "";
            if (iCommLibReader == null || (str = t(iCommLibReader)) == null) {
                str = "";
            }
            androidWAServiceLibSnapshotQualityStruct.r(str);
            androidWAServiceLibSnapshotQualityStruct.s(cl.x.b());
            androidWAServiceLibSnapshotQualityStruct.p(z17 ? "1" : "0");
            if (wxaPkgV8SnapshotInfo != null && (l3Var = wxaPkgV8SnapshotInfo.f90668h) != null && (str2 = l3Var.f90775d) != null) {
                str3 = str2;
            }
            androidWAServiceLibSnapshotQualityStruct.q(str3);
            androidWAServiceLibSnapshotQualityStruct.k();
        }
    }

    public final void q(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader commLibReader, com.eclipsesource.mmv8.snapshot.CreateSnapshotParams params) {
        kotlin.jvm.internal.o.g(commLibReader, "commLibReader");
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        if (com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", "onCreateSnapshotStart, commLibReader: " + t(commLibReader) + ", params: " + params);
        }
    }

    public final void r(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        if (com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onJsErrorInSnapshotContext, commLibReader: ");
            sb6.append(iCommLibReader != null ? t(iCommLibReader) : null);
            sb6.append(", contextName: ");
            sb6.append(str);
            sb6.append(", message: ");
            sb6.append(str2);
            sb6.append(", stackTrace: ");
            sb6.append(str3);
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
        }
        if (b()) {
            java.lang.String str5 = "{message: '" + str2 + "', stack: '" + str3 + "'}";
            com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f55110d = 14;
            if (iCommLibReader == null || (str4 = t(iCommLibReader)) == null) {
                str4 = "";
            }
            androidWAServiceLibSnapshotQualityStruct.r(str4);
            androidWAServiceLibSnapshotQualityStruct.s(cl.x.b());
            androidWAServiceLibSnapshotQualityStruct.p(str);
            androidWAServiceLibSnapshotQualityStruct.q(fp.s0.b(str5, com.tencent.mapsdk.internal.rv.f51270c));
            androidWAServiceLibSnapshotQualityStruct.k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader commLibReader, com.tencent.mm.plugin.appbrand.v8_snapshot.l3 category, int i17, int i18, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(commLibReader, "commLibReader");
        kotlin.jvm.internal.o.g(category, "category");
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        if (com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", "onSnapshotUseBlock, commLibReader: " + t(commLibReader) + ", category: " + category + ", useExceptionCount: " + i17 + ", recoverCount: " + i18 + ", isV8VersionMisMatched: " + z17 + ", isSnapshotBad: " + z18);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1923, 2);
        int i19 = z17;
        if (b()) {
            if (z18) {
                i19 = (z17 ? 1 : 0) | 2;
            }
            com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f55110d = 3;
            androidWAServiceLibSnapshotQualityStruct.r(t(commLibReader));
            androidWAServiceLibSnapshotQualityStruct.s(cl.x.b());
            androidWAServiceLibSnapshotQualityStruct.p(java.lang.String.valueOf(i17));
            androidWAServiceLibSnapshotQualityStruct.q(java.lang.String.valueOf(i19));
            androidWAServiceLibSnapshotQualityStruct.f55116j = androidWAServiceLibSnapshotQualityStruct.b("ActionParams3", category.f90775d, true);
            androidWAServiceLibSnapshotQualityStruct.f55117k = androidWAServiceLibSnapshotQualityStruct.b("ActionParams4", java.lang.String.valueOf(i18), true);
            androidWAServiceLibSnapshotQualityStruct.k();
        }
    }

    public final java.lang.String t(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader) {
        return "[" + iCommLibReader.i() + "][" + iCommLibReader.Y0() + ']';
    }
}
