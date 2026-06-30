package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes7.dex */
public class f implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.backgroundfetch.o0 f76823b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f76824c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.backgroundfetch.u1 f76825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.cd7 f76826e;

    public f(int i17, com.tencent.mm.plugin.appbrand.backgroundfetch.o0 o0Var, long j17, com.tencent.mm.plugin.appbrand.backgroundfetch.u1 u1Var, r45.cd7 cd7Var) {
        this.f76822a = i17;
        this.f76823b = o0Var;
        this.f76824c = j17;
        this.f76825d = u1Var;
        this.f76826e = cd7Var;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(final int i17, final int i18, final java.lang.String str, final com.tencent.mm.modelbase.o oVar) {
        int i19;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.launching.x2 j17;
        com.tencent.mm.plugin.appbrand.backgroundfetch.o0 o0Var;
        if (java.lang.Thread.currentThread().getId() == gm0.j1.e().c()) {
            ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.backgroundfetch.f$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.backgroundfetch.f.this.a(i17, i18, str, oVar);
                }
            });
            return;
        }
        int i27 = (i17 == 0 && i18 == 0 && oVar != null && (oVar.f70711b.f70700a instanceof r45.dd7)) ? 1 : 0;
        if (this.f76822a != 0 || (o0Var = this.f76823b) == null) {
            i19 = i27;
        } else {
            o0Var.f76880p = java.lang.System.currentTimeMillis() - this.f76824c;
            this.f76823b.f76883s = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.appbrand.backgroundfetch.o0 o0Var2 = this.f76823b;
            o0Var2.f76884t = i27;
            if (i27 != 0) {
                java.util.LinkedList linkedList = ((r45.dd7) oVar.f70711b.f70700a).f372337d;
                o0Var2.f76885u = linkedList != null ? linkedList.size() : 0;
            }
            com.tencent.mm.plugin.appbrand.backgroundfetch.o0 o0Var3 = this.f76823b;
            if (o0Var3.f76879o == 0) {
                o0Var3.f76879o = o0Var3.f76876l + o0Var3.f76877m + o0Var3.f76878n;
            }
            if (o0Var3.f76881q == 0) {
                o0Var3.f76881q = o0Var3.f76879o + o0Var3.f76880p;
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            i19 = i27;
            g0Var.kvStat(35253, g0Var.w(o0Var3.f76865a, o0Var3.f76866b, o0Var3.f76867c, java.lang.Integer.valueOf(o0Var3.f76868d), java.lang.Integer.valueOf(o0Var3.f76869e), java.lang.Integer.valueOf(o0Var3.f76870f), java.lang.Integer.valueOf(o0Var3.f76871g), o0Var3.f76872h, java.lang.Integer.valueOf(o0Var3.f76873i), java.lang.Integer.valueOf(o0Var3.f76874j), java.lang.Integer.valueOf(o0Var3.f76875k), java.lang.Long.valueOf(o0Var3.f76876l), java.lang.Long.valueOf(o0Var3.f76877m), java.lang.Long.valueOf(o0Var3.f76878n), java.lang.Long.valueOf(o0Var3.f76879o), java.lang.Long.valueOf(o0Var3.f76880p), java.lang.Long.valueOf(o0Var3.f76881q), java.lang.Long.valueOf(o0Var3.f76882r), java.lang.Long.valueOf(o0Var3.f76883s), java.lang.Integer.valueOf(o0Var3.f76884t), java.lang.Integer.valueOf(o0Var3.f76885u)));
        }
        if (i19 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "batchFetchDataInternal, batch fetch data fail:request fail");
            com.tencent.mm.plugin.appbrand.backgroundfetch.u1 u1Var = this.f76825d;
            int i28 = this.f76822a;
            ((com.tencent.mm.plugin.appbrand.backgroundfetch.t0) u1Var).getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.DefaultBackgroundFetchDataCallback", "cgi fail, type(%d)", java.lang.Integer.valueOf(i28));
            return;
        }
        r45.dd7 dd7Var = (r45.dd7) oVar.f70711b.f70700a;
        java.util.LinkedList linkedList2 = dd7Var.f372337d;
        if (linkedList2 == null || linkedList2.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "batchFetchDataInternal, batch fetch data fail:data is null");
            com.tencent.mm.plugin.appbrand.backgroundfetch.u1 u1Var2 = this.f76825d;
            int i29 = this.f76822a;
            ((com.tencent.mm.plugin.appbrand.backgroundfetch.t0) u1Var2).getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.DefaultBackgroundFetchDataCallback", "cgi fail, type(%d)", java.lang.Integer.valueOf(i29));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "batchFetchDataInternal, batch fetch data success");
        com.tencent.mm.plugin.appbrand.backgroundfetch.u1 u1Var3 = this.f76825d;
        java.util.LinkedList<r45.zc> linkedList3 = dd7Var.f372337d;
        java.util.LinkedList<r45.yc> linkedList4 = this.f76826e.f371491d;
        com.tencent.mm.plugin.appbrand.backgroundfetch.t0 t0Var = (com.tencent.mm.plugin.appbrand.backgroundfetch.t0) u1Var3;
        t0Var.getClass();
        if (linkedList3 == null || linkedList3.isEmpty()) {
            return;
        }
        for (r45.zc zcVar : linkedList3) {
            java.lang.String str3 = null;
            if (zcVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(zcVar.f391899d) && linkedList4 != null && !linkedList4.isEmpty()) {
                for (r45.yc ycVar : linkedList4) {
                    if (zcVar.f391899d.equalsIgnoreCase(ycVar.f390955d)) {
                        break;
                    }
                }
            }
            ycVar = null;
            if (zcVar.f391901f != 0 || ycVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.DefaultBackgroundFetchDataCallback", "cgi success, but app(%s) failed to fetch data", zcVar.f391899d);
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(zcVar.f391899d) || com.tencent.mm.sdk.platformtools.t8.K0(zcVar.f391900e)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.DefaultBackgroundFetchDataCallback", "handleBackgroundFetchData fail, no username or data in response");
            } else {
                long c17 = c01.id.c();
                java.lang.String str4 = zcVar.f391899d;
                java.lang.String str5 = zcVar.f391900e;
                int i37 = ycVar.f390956e;
                r45.lb5 lb5Var = ycVar.f390957f;
                java.lang.String string = (lb5Var == null || !lb5Var.hasSet(0)) ? null : ycVar.f390957f.getString(0);
                r45.lb5 lb5Var2 = ycVar.f390957f;
                if (lb5Var2 != null && lb5Var2.hasSet(1)) {
                    str3 = ycVar.f390957f.getString(1);
                }
                r45.lb5 lb5Var3 = ycVar.f390957f;
                int integer = (lb5Var3 == null || !lb5Var3.hasSet(2)) ? 1000 : ycVar.f390957f.getInteger(2);
                int i38 = zcVar.f391902g;
                java.lang.String str6 = string;
                if (!((com.tencent.mm.plugin.appbrand.backgroundfetch.s1) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundfetch.s1.class)).L3(str4, i37, str5, str6, str3, integer, c17, i38)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.DefaultBackgroundFetchDataCallback", "handleBackgroundFetchData fail, save data fail");
                } else if (!com.tencent.mm.sdk.platformtools.t8.K0(ycVar.f390959h)) {
                    com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel appBrandBackgroundFetchDataParcel = new com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel();
                    appBrandBackgroundFetchDataParcel.f76777d = str4;
                    appBrandBackgroundFetchDataParcel.f76778e = i37;
                    appBrandBackgroundFetchDataParcel.f76781h = str5;
                    appBrandBackgroundFetchDataParcel.f76779f = str6;
                    appBrandBackgroundFetchDataParcel.f76780g = str3;
                    appBrandBackgroundFetchDataParcel.f76782i = integer;
                    appBrandBackgroundFetchDataParcel.f76783m = c17;
                    appBrandBackgroundFetchDataParcel.f76784n = i38;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.DefaultBackgroundFetchDataCallback", "handleBackgroundFetchData success, send data event to app(%s), appId:%s, updateTime:%d", ycVar.f390955d, ycVar.f390959h, java.lang.Long.valueOf(c17));
                    if (!android.text.TextUtils.isEmpty(t0Var.f76894a) && (j17 = com.tencent.mm.plugin.appbrand.launching.x2.j((str2 = t0Var.f76894a))) != null) {
                        j17.C1 = appBrandBackgroundFetchDataParcel;
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "stashBackFetchDataResponseForInstanceId, instanceId:%s, appId:%s, updateTime:%d", str2, j17.f85375r, java.lang.Long.valueOf(appBrandBackgroundFetchDataParcel.f76783m));
                    }
                    com.tencent.mm.plugin.appbrand.ipc.m0.b(ycVar.f390959h, appBrandBackgroundFetchDataParcel);
                }
            }
        }
    }
}
