package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class qc extends android.os.AsyncTask<java.lang.Object, java.lang.Void, com.tencent.mapsdk.internal.qc.b> {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.ref.WeakReference<android.content.Context> f132428a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.ref.WeakReference<com.tencent.mapsdk.internal.qc.a> f132429b;

    /* renamed from: c, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so f132430c;

    /* loaded from: classes13.dex */
    public interface a {
        void a(com.tencent.mapsdk.internal.qc.b bVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so soVar);
    }

    /* loaded from: classes13.dex */
    public enum b {
        SUCCESS_UPGRADED,
        SUCCESS_NO_UPDATE,
        FAIL_NET,
        FAIL_DATA_EMPTY,
        FAIL_OTHER
    }

    public qc(android.content.Context context, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so soVar, com.tencent.mapsdk.internal.qc.a aVar) {
        this.f132428a = new java.lang.ref.WeakReference<>(context);
        this.f132430c = soVar;
        this.f132429b = new java.lang.ref.WeakReference<>(aVar);
    }

    private com.tencent.mapsdk.internal.qc.b a() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sv svVar;
        boolean z17;
        boolean z18;
        boolean z19;
        if (this.f132428a.get() == null) {
            return com.tencent.mapsdk.internal.qc.b.FAIL_OTHER;
        }
        android.content.Context context = this.f132428a.get();
        try {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.de deVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.de) ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dt) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dt.class)).i();
            java.lang.String a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.a();
            java.lang.String i17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.i();
            int i18 = this.f132430c.f133030d;
            java.lang.String d17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.d();
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so soVar = this.f132430c;
            int i19 = soVar.f133032f;
            int[] iArr = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so.AnonymousClass3.f133044a;
            int i27 = iArr[soVar.f133035i.ordinal()];
            com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m36693x17b972d0 = deVar.m36693x17b972d0(a17, i17, i18, d17, i19, 3, i27 != 1 ? i27 != 2 ? 0 : 1 : 2);
            if (m36693x17b972d0 != null && m36693x17b972d0.mo36017xd4418ac9()) {
                java.lang.String m36028x9616526c = m36693x17b972d0.m36028x9616526c();
                if (m36028x9616526c != null && m36028x9616526c.length() != 0) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so soVar2 = this.f132430c;
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "开始更新配置：".concat(m36028x9616526c));
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sw swVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sw) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35881x450f6f3b(m36028x9616526c, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sw.class, new java.lang.Object[0]);
                    if (swVar != null && (svVar = swVar.f133090b) != null) {
                        if (swVar.f133089a != 0) {
                            z19 = soVar2.f133031e;
                            soVar2.f133031e = false;
                        } else {
                            if (soVar2.f133031e) {
                                z17 = false;
                                z18 = true;
                            } else {
                                z18 = true;
                                z17 = true;
                            }
                            soVar2.f133031e = z18;
                            z19 = z17;
                        }
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "权限是否更新：".concat(java.lang.String.valueOf(z19)));
                        boolean z27 = svVar.f133085g != soVar2.f133030d;
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "协议版本是否更新：".concat(java.lang.String.valueOf(z27)));
                        if (!(z19 | z27)) {
                            return com.tencent.mapsdk.internal.qc.b.SUCCESS_NO_UPDATE;
                        }
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sr a18 = soVar2.a(svVar);
                        if (a18 != null) {
                            int i28 = a18.f133061d;
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sx sxVar = a18.f133062e;
                            if (sxVar != null) {
                                int i29 = sxVar.f133094d;
                                int i37 = sxVar.f133092b;
                                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "版本对比: old[" + soVar2.f133029c + "]-new[" + i29 + "]");
                                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "样式对比: old[" + soVar2.f133028b + "]-new[" + i37 + "]");
                                if (i29 != soVar2.f133029c || i37 != soVar2.f133028b || i28 != soVar2.f133027a) {
                                    java.io.File file = new java.io.File(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(context, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7) null).b(), soVar2.a());
                                    if (file.exists()) {
                                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(file);
                                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "删除海外图缓存目录: ".concat(java.lang.String.valueOf(file)));
                                    }
                                }
                            }
                        }
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.su suVar = svVar.f133086h;
                        if (suVar != null) {
                            java.lang.String str = suVar.f133078b;
                            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "配置边界线: ".concat(java.lang.String.valueOf(str)));
                            soVar2.a(str);
                            suVar.f133077a = soVar2.f133032f;
                        }
                        soVar2.f133033g = swVar;
                        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26073x5a789ab6 enumC26073x5a789ab6 = soVar2.f133035i;
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my a19 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my.a(context);
                        int i38 = iArr[enumC26073x5a789ab6.ordinal()];
                        if (i38 == 1) {
                            a19.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130921g, m36028x9616526c);
                        } else if (i38 == 2) {
                            a19.a("worldMapConfig_BING", m36028x9616526c);
                        }
                        soVar2.a(soVar2.f133033g);
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "配置更新完成");
                        return com.tencent.mapsdk.internal.qc.b.SUCCESS_UPGRADED;
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "配置更新数据解析失败，使用上次的配置");
                    return com.tencent.mapsdk.internal.qc.b.FAIL_DATA_EMPTY;
                }
                return com.tencent.mapsdk.internal.qc.b.FAIL_DATA_EMPTY;
            }
            return com.tencent.mapsdk.internal.qc.b.FAIL_NET;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(th6.getMessage(), th6);
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
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.qc.a> weakReference = this.f132429b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f132429b.get().a(bVar2, this.f132430c);
    }

    private void a(com.tencent.mapsdk.internal.qc.b bVar) {
        super.onPostExecute(bVar);
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.qc.a> weakReference = this.f132429b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f132429b.get().a(bVar, this.f132430c);
    }

    private com.tencent.mapsdk.internal.qc.b a(android.content.Context context, java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sv svVar;
        boolean z17;
        if (str != null && str.length() != 0) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so soVar = this.f132430c;
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "开始更新配置：".concat(str));
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sw swVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sw) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35881x450f6f3b(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sw.class, new java.lang.Object[0]);
            if (swVar != null && (svVar = swVar.f133090b) != null) {
                if (swVar.f133089a != 0) {
                    z17 = soVar.f133031e;
                    soVar.f133031e = false;
                } else {
                    z17 = !soVar.f133031e;
                    soVar.f133031e = true;
                }
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "权限是否更新：".concat(java.lang.String.valueOf(z17)));
                boolean z18 = svVar.f133085g != soVar.f133030d;
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "协议版本是否更新：".concat(java.lang.String.valueOf(z18)));
                if (!(z18 | z17)) {
                    return com.tencent.mapsdk.internal.qc.b.SUCCESS_NO_UPDATE;
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sr a17 = soVar.a(svVar);
                if (a17 != null) {
                    int i17 = a17.f133061d;
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sx sxVar = a17.f133062e;
                    if (sxVar != null) {
                        int i18 = sxVar.f133094d;
                        int i19 = sxVar.f133092b;
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "版本对比: old[" + soVar.f133029c + "]-new[" + i18 + "]");
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "样式对比: old[" + soVar.f133028b + "]-new[" + i19 + "]");
                        if (i18 != soVar.f133029c || i19 != soVar.f133028b || i17 != soVar.f133027a) {
                            java.io.File file = new java.io.File(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(context, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7) null).b(), soVar.a());
                            if (file.exists()) {
                                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(file);
                                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "删除海外图缓存目录: ".concat(java.lang.String.valueOf(file)));
                            }
                        }
                    }
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.su suVar = svVar.f133086h;
                if (suVar != null) {
                    java.lang.String str2 = suVar.f133078b;
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "配置边界线: ".concat(java.lang.String.valueOf(str2)));
                    soVar.a(str2);
                    suVar.f133077a = soVar.f133032f;
                }
                soVar.f133033g = swVar;
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26073x5a789ab6 enumC26073x5a789ab6 = soVar.f133035i;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my a18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my.a(context);
                int i27 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so.AnonymousClass3.f133044a[enumC26073x5a789ab6.ordinal()];
                if (i27 == 1) {
                    a18.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130921g, str);
                } else if (i27 == 2) {
                    a18.a("worldMapConfig_BING", str);
                }
                soVar.a(soVar.f133033g);
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "配置更新完成");
                return com.tencent.mapsdk.internal.qc.b.SUCCESS_UPGRADED;
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "配置更新数据解析失败，使用上次的配置");
            return com.tencent.mapsdk.internal.qc.b.FAIL_DATA_EMPTY;
        }
        return com.tencent.mapsdk.internal.qc.b.FAIL_DATA_EMPTY;
    }
}
