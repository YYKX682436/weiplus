package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class qc extends android.os.AsyncTask<java.lang.Object, java.lang.Void, com.tencent.mapsdk.internal.qc.b> {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.ref.WeakReference<android.content.Context> f50895a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.ref.WeakReference<com.tencent.mapsdk.internal.qc.a> f50896b;

    /* renamed from: c, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.so f50897c;

    /* loaded from: classes13.dex */
    public interface a {
        void a(com.tencent.mapsdk.internal.qc.b bVar, com.tencent.mapsdk.internal.so soVar);
    }

    /* loaded from: classes13.dex */
    public enum b {
        SUCCESS_UPGRADED,
        SUCCESS_NO_UPDATE,
        FAIL_NET,
        FAIL_DATA_EMPTY,
        FAIL_OTHER
    }

    public qc(android.content.Context context, com.tencent.mapsdk.internal.so soVar, com.tencent.mapsdk.internal.qc.a aVar) {
        this.f50895a = new java.lang.ref.WeakReference<>(context);
        this.f50897c = soVar;
        this.f50896b = new java.lang.ref.WeakReference<>(aVar);
    }

    private com.tencent.mapsdk.internal.qc.b a() {
        com.tencent.mapsdk.internal.sv svVar;
        boolean z17;
        boolean z18;
        boolean z19;
        if (this.f50895a.get() == null) {
            return com.tencent.mapsdk.internal.qc.b.FAIL_OTHER;
        }
        android.content.Context context = this.f50895a.get();
        try {
            com.tencent.mapsdk.internal.de deVar = (com.tencent.mapsdk.internal.de) ((com.tencent.mapsdk.internal.dt) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.dt.class)).i();
            java.lang.String a17 = com.tencent.mapsdk.internal.hn.a();
            java.lang.String i17 = com.tencent.mapsdk.internal.hn.i();
            int i18 = this.f50897c.f51497d;
            java.lang.String d17 = com.tencent.mapsdk.internal.hn.d();
            com.tencent.mapsdk.internal.so soVar = this.f50897c;
            int i19 = soVar.f51499f;
            int[] iArr = com.tencent.mapsdk.internal.so.AnonymousClass3.f51511a;
            int i27 = iArr[soVar.f51502i.ordinal()];
            com.tencent.map.tools.net.NetResponse checkAuth = deVar.checkAuth(a17, i17, i18, d17, i19, 3, i27 != 1 ? i27 != 2 ? 0 : 1 : 2);
            if (checkAuth != null && checkAuth.available()) {
                java.lang.String netResponse = checkAuth.toString();
                if (netResponse != null && netResponse.length() != 0) {
                    com.tencent.mapsdk.internal.so soVar2 = this.f50897c;
                    com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "开始更新配置：".concat(netResponse));
                    com.tencent.mapsdk.internal.sw swVar = (com.tencent.mapsdk.internal.sw) com.tencent.map.tools.json.JsonUtils.parseToModel(netResponse, com.tencent.mapsdk.internal.sw.class, new java.lang.Object[0]);
                    if (swVar != null && (svVar = swVar.f51557b) != null) {
                        if (swVar.f51556a != 0) {
                            z19 = soVar2.f51498e;
                            soVar2.f51498e = false;
                        } else {
                            if (soVar2.f51498e) {
                                z17 = false;
                                z18 = true;
                            } else {
                                z18 = true;
                                z17 = true;
                            }
                            soVar2.f51498e = z18;
                            z19 = z17;
                        }
                        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "权限是否更新：".concat(java.lang.String.valueOf(z19)));
                        boolean z27 = svVar.f51552g != soVar2.f51497d;
                        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "协议版本是否更新：".concat(java.lang.String.valueOf(z27)));
                        if (!(z19 | z27)) {
                            return com.tencent.mapsdk.internal.qc.b.SUCCESS_NO_UPDATE;
                        }
                        com.tencent.mapsdk.internal.sr a18 = soVar2.a(svVar);
                        if (a18 != null) {
                            int i28 = a18.f51528d;
                            com.tencent.mapsdk.internal.sx sxVar = a18.f51529e;
                            if (sxVar != null) {
                                int i29 = sxVar.f51561d;
                                int i37 = sxVar.f51559b;
                                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "版本对比: old[" + soVar2.f51496c + "]-new[" + i29 + "]");
                                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "样式对比: old[" + soVar2.f51495b + "]-new[" + i37 + "]");
                                if (i29 != soVar2.f51496c || i37 != soVar2.f51495b || i28 != soVar2.f51494a) {
                                    java.io.File file = new java.io.File(com.tencent.mapsdk.internal.mz.a(context, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).b(), soVar2.a());
                                    if (file.exists()) {
                                        com.tencent.mapsdk.internal.ks.b(file);
                                        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "删除海外图缓存目录: ".concat(java.lang.String.valueOf(file)));
                                    }
                                }
                            }
                        }
                        com.tencent.mapsdk.internal.su suVar = svVar.f51553h;
                        if (suVar != null) {
                            java.lang.String str = suVar.f51545b;
                            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "配置边界线: ".concat(java.lang.String.valueOf(str)));
                            soVar2.a(str);
                            suVar.f51544a = soVar2.f51499f;
                        }
                        soVar2.f51500g = swVar;
                        com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource overSeaSource = soVar2.f51502i;
                        com.tencent.mapsdk.internal.my a19 = com.tencent.mapsdk.internal.my.a(context);
                        int i38 = iArr[overSeaSource.ordinal()];
                        if (i38 == 1) {
                            a19.a(com.tencent.mapsdk.internal.er.f49388g, netResponse);
                        } else if (i38 == 2) {
                            a19.a("worldMapConfig_BING", netResponse);
                        }
                        soVar2.a(soVar2.f51500g);
                        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "配置更新完成");
                        return com.tencent.mapsdk.internal.qc.b.SUCCESS_UPGRADED;
                    }
                    com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "配置更新数据解析失败，使用上次的配置");
                    return com.tencent.mapsdk.internal.qc.b.FAIL_DATA_EMPTY;
                }
                return com.tencent.mapsdk.internal.qc.b.FAIL_DATA_EMPTY;
            }
            return com.tencent.mapsdk.internal.qc.b.FAIL_NET;
        } catch (java.lang.Throwable th6) {
            com.tencent.mapsdk.core.utils.log.LogUtil.a(th6.getMessage(), th6);
            return com.tencent.mapsdk.internal.qc.b.FAIL_OTHER;
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ com.tencent.mapsdk.internal.qc.b doInBackground(java.lang.Object[] objArr) {
        return a();
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(com.tencent.mapsdk.internal.qc.b bVar) {
        com.tencent.mapsdk.internal.qc.b bVar2 = bVar;
        super.onPostExecute(bVar2);
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.qc.a> weakReference = this.f50896b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f50896b.get().a(bVar2, this.f50897c);
    }

    private void a(com.tencent.mapsdk.internal.qc.b bVar) {
        super.onPostExecute(bVar);
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.qc.a> weakReference = this.f50896b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f50896b.get().a(bVar, this.f50897c);
    }

    private com.tencent.mapsdk.internal.qc.b a(android.content.Context context, java.lang.String str) {
        com.tencent.mapsdk.internal.sv svVar;
        boolean z17;
        if (str != null && str.length() != 0) {
            com.tencent.mapsdk.internal.so soVar = this.f50897c;
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "开始更新配置：".concat(str));
            com.tencent.mapsdk.internal.sw swVar = (com.tencent.mapsdk.internal.sw) com.tencent.map.tools.json.JsonUtils.parseToModel(str, com.tencent.mapsdk.internal.sw.class, new java.lang.Object[0]);
            if (swVar != null && (svVar = swVar.f51557b) != null) {
                if (swVar.f51556a != 0) {
                    z17 = soVar.f51498e;
                    soVar.f51498e = false;
                } else {
                    z17 = !soVar.f51498e;
                    soVar.f51498e = true;
                }
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "权限是否更新：".concat(java.lang.String.valueOf(z17)));
                boolean z18 = svVar.f51552g != soVar.f51497d;
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "协议版本是否更新：".concat(java.lang.String.valueOf(z18)));
                if (!(z18 | z17)) {
                    return com.tencent.mapsdk.internal.qc.b.SUCCESS_NO_UPDATE;
                }
                com.tencent.mapsdk.internal.sr a17 = soVar.a(svVar);
                if (a17 != null) {
                    int i17 = a17.f51528d;
                    com.tencent.mapsdk.internal.sx sxVar = a17.f51529e;
                    if (sxVar != null) {
                        int i18 = sxVar.f51561d;
                        int i19 = sxVar.f51559b;
                        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "版本对比: old[" + soVar.f51496c + "]-new[" + i18 + "]");
                        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "样式对比: old[" + soVar.f51495b + "]-new[" + i19 + "]");
                        if (i18 != soVar.f51496c || i19 != soVar.f51495b || i17 != soVar.f51494a) {
                            java.io.File file = new java.io.File(com.tencent.mapsdk.internal.mz.a(context, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).b(), soVar.a());
                            if (file.exists()) {
                                com.tencent.mapsdk.internal.ks.b(file);
                                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "删除海外图缓存目录: ".concat(java.lang.String.valueOf(file)));
                            }
                        }
                    }
                }
                com.tencent.mapsdk.internal.su suVar = svVar.f51553h;
                if (suVar != null) {
                    java.lang.String str2 = suVar.f51545b;
                    com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "配置边界线: ".concat(java.lang.String.valueOf(str2)));
                    soVar.a(str2);
                    suVar.f51544a = soVar.f51499f;
                }
                soVar.f51500g = swVar;
                com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource overSeaSource = soVar.f51502i;
                com.tencent.mapsdk.internal.my a18 = com.tencent.mapsdk.internal.my.a(context);
                int i27 = com.tencent.mapsdk.internal.so.AnonymousClass3.f51511a[overSeaSource.ordinal()];
                if (i27 == 1) {
                    a18.a(com.tencent.mapsdk.internal.er.f49388g, str);
                } else if (i27 == 2) {
                    a18.a("worldMapConfig_BING", str);
                }
                soVar.a(soVar.f51500g);
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "配置更新完成");
                return com.tencent.mapsdk.internal.qc.b.SUCCESS_UPGRADED;
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "配置更新数据解析失败，使用上次的配置");
            return com.tencent.mapsdk.internal.qc.b.FAIL_DATA_EMPTY;
        }
        return com.tencent.mapsdk.internal.qc.b.FAIL_DATA_EMPTY;
    }
}
