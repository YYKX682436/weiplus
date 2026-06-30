package com.tencent.mapsdk.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class by implements com.tencent.map.sdk.comps.offlinemap.OfflineItemController {

    /* renamed from: a, reason: collision with root package name */
    com.tencent.map.sdk.comps.offlinemap.OfflineStatusChangedListener f49055a;

    /* renamed from: b, reason: collision with root package name */
    com.tencent.mapsdk.internal.by.a f49056b;

    /* renamed from: c, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.mv f49057c;

    /* renamed from: d, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.bz f49058d;

    /* renamed from: e, reason: collision with root package name */
    private final com.tencent.map.sdk.comps.offlinemap.OfflineItem f49059e;

    /* renamed from: f, reason: collision with root package name */
    private final java.lang.String f49060f;

    /* renamed from: g, reason: collision with root package name */
    private final java.io.File f49061g;

    /* renamed from: h, reason: collision with root package name */
    private final java.io.File f49062h;

    /* renamed from: i, reason: collision with root package name */
    private final java.io.File f49063i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f49064j;

    /* renamed from: k, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.lw f49065k;

    /* renamed from: l, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.by.b f49066l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f49067m;

    /* renamed from: n, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.bn f49068n;

    /* loaded from: classes13.dex */
    public interface a {
        void a(com.tencent.map.sdk.comps.offlinemap.OfflineItem offlineItem, int i17);

        void a(com.tencent.map.sdk.comps.offlinemap.OfflineItem offlineItem, boolean z17);

        void b(com.tencent.map.sdk.comps.offlinemap.OfflineItem offlineItem, boolean z17);
    }

    /* loaded from: classes13.dex */
    public class b extends com.tencent.mapsdk.internal.ly implements com.tencent.mapsdk.internal.lv {

        /* renamed from: c, reason: collision with root package name */
        private com.tencent.mapsdk.internal.lx f49073c;

        /* renamed from: d, reason: collision with root package name */
        private java.io.File f49074d;

        private b() {
        }

        @Override // com.tencent.mapsdk.internal.lv
        public final void a(java.lang.String str) {
            this.f49074d = new java.io.File(com.tencent.mapsdk.internal.by.this.f49060f, this.f50403b + ".tmp");
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "开始下载:[" + this.f49074d + "]");
            if (com.tencent.mapsdk.internal.by.this.f49055a != null) {
                com.tencent.mapsdk.internal.by.this.f49055a.onStatusChanged(com.tencent.mapsdk.internal.by.this.f49059e, com.tencent.map.sdk.comps.offlinemap.OfflineStatus.START);
            }
        }

        @Override // com.tencent.mapsdk.internal.lv
        public final void b(java.lang.String str) {
            if (this.f49074d != null) {
                com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50221v, "取消下载:[" + this.f49074d + "]");
                com.tencent.mapsdk.internal.ks.b(this.f49074d);
            }
            if (com.tencent.mapsdk.internal.by.this.f49055a != null) {
                com.tencent.mapsdk.internal.by.this.f49055a.onStatusChanged(com.tencent.mapsdk.internal.by.this.f49059e, com.tencent.map.sdk.comps.offlinemap.OfflineStatus.CANCEL);
            }
        }

        @Override // com.tencent.mapsdk.internal.lv
        public final void c(java.lang.String str) {
            java.io.File file = this.f49074d;
            if (file == null || !file.exists()) {
                return;
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "完成下载:[" + this.f49074d + "]");
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "创建城市缓存文件:[" + com.tencent.mapsdk.internal.by.this.f49062h + "]");
            com.tencent.mapsdk.internal.ks.b(com.tencent.mapsdk.internal.by.this.f49062h);
            com.tencent.mapsdk.internal.ks.a(this.f49074d, com.tencent.mapsdk.internal.by.this.f49061g);
            com.tencent.mapsdk.internal.by.this.a();
            if (!com.tencent.mapsdk.internal.by.this.f49062h.exists()) {
                com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50221v, "缓存文件创建失败！");
                return;
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "解压成功:[" + com.tencent.mapsdk.internal.by.this.f49062h + "]");
            com.tencent.mapsdk.internal.bz bzVar = com.tencent.mapsdk.internal.by.this.f49058d;
            com.tencent.mapsdk.internal.mv mvVar = com.tencent.mapsdk.internal.by.this.f49057c;
            if (mvVar != null) {
                mvVar.a(bzVar.f49077c + "-md5", bzVar.f49076b);
                mvVar.a(bzVar.f49077c + "-version", bzVar.f49079e);
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "保持城市缓存信息:[" + bzVar + "]");
            com.tencent.mapsdk.internal.by.this.f49065k.b(com.tencent.mapsdk.internal.by.this.f49066l);
            if (com.tencent.mapsdk.internal.by.this.f49056b != null) {
                com.tencent.mapsdk.internal.by.this.f49056b.a(com.tencent.mapsdk.internal.by.this.f49059e, 100);
                com.tencent.mapsdk.internal.by.this.f49056b.b(com.tencent.mapsdk.internal.by.this.f49059e, false);
            }
            if (com.tencent.mapsdk.internal.by.this.f49055a != null) {
                com.tencent.mapsdk.internal.by.this.f49055a.onStatusChanged(com.tencent.mapsdk.internal.by.this.f49059e, com.tencent.map.sdk.comps.offlinemap.OfflineStatus.COMPLETED);
            }
        }

        @Override // com.tencent.mapsdk.internal.lv
        public final void d(java.lang.String str) {
            if (this.f49074d != null) {
                com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50221v, "缓存文件下载失败！");
                com.tencent.mapsdk.internal.ks.b(this.f49074d);
            }
            if (com.tencent.mapsdk.internal.by.this.f49055a != null) {
                com.tencent.mapsdk.internal.by.this.f49055a.onStatusChanged(com.tencent.mapsdk.internal.by.this.f49059e, com.tencent.map.sdk.comps.offlinemap.OfflineStatus.ERROR);
            }
        }

        public /* synthetic */ b(com.tencent.mapsdk.internal.by byVar, byte b17) {
            this();
        }

        @Override // com.tencent.mapsdk.internal.lv
        public final void a(java.lang.String str, byte[] bArr) {
            java.io.File file;
            if (android.text.TextUtils.isEmpty(str) || !str.equals(com.tencent.mapsdk.internal.by.this.f49064j) || bArr == null) {
                return;
            }
            if (this.f49073c == com.tencent.mapsdk.internal.lx.RUNNING && (file = this.f49074d) != null) {
                int length = (int) ((file.length() * 100) / com.tencent.mapsdk.internal.by.this.f49058d.f49078d);
                if (com.tencent.mapsdk.internal.by.this.f49056b != null) {
                    com.tencent.mapsdk.internal.by.this.f49056b.a(com.tencent.mapsdk.internal.by.this.f49059e, length);
                }
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "缓存文件下载中:：length: " + this.f49074d.length() + "：" + length + "%");
                com.tencent.mapsdk.internal.ks.b(this.f49074d, bArr);
            }
            if (com.tencent.mapsdk.internal.by.this.f49055a != null) {
                com.tencent.mapsdk.internal.by.this.f49055a.onStatusChanged(com.tencent.mapsdk.internal.by.this.f49059e, com.tencent.map.sdk.comps.offlinemap.OfflineStatus.DOWNLOADING);
            }
        }

        @Override // com.tencent.mapsdk.internal.lv
        public final void a(java.lang.String str, com.tencent.mapsdk.internal.lx lxVar) {
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "下载状态：".concat(java.lang.String.valueOf(lxVar)));
            this.f49073c = lxVar;
        }
    }

    public by(com.tencent.mapsdk.internal.bn bnVar, java.lang.String str, com.tencent.map.sdk.comps.offlinemap.OfflineItem offlineItem, com.tencent.mapsdk.internal.bz bzVar, com.tencent.mapsdk.internal.mv mvVar, com.tencent.map.sdk.comps.offlinemap.OfflineStatusChangedListener offlineStatusChangedListener) {
        this.f49068n = bnVar;
        this.f49057c = mvVar;
        this.f49059e = offlineItem;
        this.f49058d = bzVar;
        this.f49055a = offlineStatusChangedListener;
        com.tencent.mapsdk.internal.lw lwVar = new com.tencent.mapsdk.internal.lw();
        this.f49065k = lwVar;
        this.f49066l = new com.tencent.mapsdk.internal.by.b(this, (byte) 0);
        lwVar.f50380b = com.tencent.mapsdk.internal.ht.d();
        this.f49060f = str;
        this.f49061g = new java.io.File(str, bzVar.f49077c + ".zip");
        this.f49062h = new java.io.File(str, bzVar.a());
        this.f49063i = new java.io.File(com.tencent.mapsdk.internal.mz.a(bnVar.getContext(), (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).d(), bzVar.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        if (r7.f49062h.exists() == false) goto L24;
     */
    @Override // com.tencent.map.sdk.comps.offlinemap.OfflineItemController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean checkInvalidate() {
        /*
            r7 = this;
            monitor-enter(r7)
            com.tencent.mapsdk.internal.bz r0 = r7.f49058d     // Catch: java.lang.Throwable -> Lb7
            r1 = 0
            if (r0 == 0) goto Lac
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            r2.<init>()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = r0.f49075a     // Catch: java.lang.Throwable -> Lb7
            r2.append(r3)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = java.io.File.separator     // Catch: java.lang.Throwable -> Lb7
            r2.append(r3)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = r0.f49077c     // Catch: java.lang.Throwable -> Lb7
            r2.append(r3)     // Catch: java.lang.Throwable -> Lb7
            int r3 = r0.f49079e     // Catch: java.lang.Throwable -> Lb7
            r2.append(r3)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = ".zip"
            r2.append(r3)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lb7
            r7.f49064j = r2     // Catch: java.lang.Throwable -> Lb7
            com.tencent.mapsdk.internal.mv r2 = r7.f49057c     // Catch: java.lang.Throwable -> Lb7
            r3 = 1
            if (r2 == 0) goto L6e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            r4.<init>()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r5 = r0.f49077c     // Catch: java.lang.Throwable -> Lb7
            r4.append(r5)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r5 = "-md5"
            r4.append(r5)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r4 = r2.a(r4)     // Catch: java.lang.Throwable -> Lb7
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            r5.<init>()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r6 = r0.f49077c     // Catch: java.lang.Throwable -> Lb7
            r5.append(r6)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r6 = "-version"
            r5.append(r6)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lb7
            r6 = -1
            int r2 = r2.b(r5, r6)     // Catch: java.lang.Throwable -> Lb7
            int r5 = r0.f49079e     // Catch: java.lang.Throwable -> Lb7
            if (r5 != r2) goto L6c
            if (r4 == 0) goto L6e
            java.lang.String r0 = r0.f49076b     // Catch: java.lang.Throwable -> Lb7
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Throwable -> Lb7
            if (r0 != 0) goto L6e
        L6c:
            r0 = r3
            goto L6f
        L6e:
            r0 = r1
        L6f:
            java.lang.String r2 = "OM"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r5 = "检查是否需要更新:["
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lb7
            r4.append(r0)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r5 = "]"
            r4.append(r5)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lb7
            com.tencent.mapsdk.core.utils.log.LogUtil.c(r2, r4)     // Catch: java.lang.Throwable -> Lb7
            if (r0 != 0) goto Lab
            boolean r2 = r7.f49067m     // Catch: java.lang.Throwable -> Lb7
            if (r2 != 0) goto Lab
            java.io.File r2 = r7.f49062h     // Catch: java.lang.Throwable -> Lb7
            boolean r2 = r2.exists()     // Catch: java.lang.Throwable -> Lb7
            if (r2 != 0) goto Lab
            java.io.File r0 = r7.f49061g     // Catch: java.lang.Throwable -> Lb7
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto La9
            r7.a()     // Catch: java.lang.Throwable -> Lb7
            java.io.File r0 = r7.f49062h     // Catch: java.lang.Throwable -> Lb7
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> Lb7
            if (r0 != 0) goto Lac
        La9:
            r1 = r3
            goto Lac
        Lab:
            r1 = r0
        Lac:
            com.tencent.mapsdk.internal.by$a r0 = r7.f49056b     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto Lb5
            com.tencent.map.sdk.comps.offlinemap.OfflineItem r2 = r7.f49059e     // Catch: java.lang.Throwable -> Lb7
            r0.b(r2, r1)     // Catch: java.lang.Throwable -> Lb7
        Lb5:
            monitor-exit(r7)
            return r1
        Lb7:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.by.checkInvalidate():boolean");
    }

    @Override // com.tencent.map.sdk.comps.offlinemap.OfflineItemController
    public final boolean close() {
        return b(this.f49068n);
    }

    @Override // com.tencent.map.sdk.comps.offlinemap.OfflineItemController
    public final boolean open() {
        return a(this.f49068n);
    }

    @Override // com.tencent.map.sdk.comps.offlinemap.OfflineItemController
    public final boolean removeCache() {
        boolean z17 = com.tencent.mapsdk.internal.ks.b(this.f49061g) && com.tencent.mapsdk.internal.ks.b(this.f49062h);
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "删除[" + this.f49058d.f49077c + "]离线缓存");
        return z17;
    }

    @Override // com.tencent.map.sdk.comps.offlinemap.OfflineItemController
    public final void startDownload() {
        if (this.f49068n == null) {
            com.tencent.map.sdk.comps.offlinemap.OfflineStatusChangedListener offlineStatusChangedListener = this.f49055a;
            if (offlineStatusChangedListener != null) {
                offlineStatusChangedListener.onStatusChanged(this.f49059e, com.tencent.map.sdk.comps.offlinemap.OfflineStatus.ERROR);
                return;
            }
            return;
        }
        if (this.f49061g.exists()) {
            com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.ko.g<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.by.2
                private java.lang.Boolean a() {
                    com.tencent.mapsdk.internal.by byVar = com.tencent.mapsdk.internal.by.this;
                    return java.lang.Boolean.valueOf(byVar.a(byVar.f49068n));
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    com.tencent.mapsdk.internal.by byVar = com.tencent.mapsdk.internal.by.this;
                    return java.lang.Boolean.valueOf(byVar.a(byVar.f49068n));
                }
            }).a((com.tencent.mapsdk.internal.ko.a) new com.tencent.mapsdk.internal.ko.a<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.by.1
                private void a(java.lang.Boolean bool) {
                    if (!bool.booleanValue()) {
                        com.tencent.mapsdk.internal.by.this.startDownload();
                    } else if (com.tencent.mapsdk.internal.by.this.f49055a != null) {
                        com.tencent.mapsdk.internal.by.this.f49055a.onStatusChanged(com.tencent.mapsdk.internal.by.this.f49059e, com.tencent.map.sdk.comps.offlinemap.OfflineStatus.COMPLETED);
                    }
                }

                @Override // com.tencent.mapsdk.internal.ko.a, com.tencent.map.tools.Callback
                public final /* synthetic */ void callback(java.lang.Object obj) {
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        com.tencent.mapsdk.internal.by.this.startDownload();
                    } else if (com.tencent.mapsdk.internal.by.this.f49055a != null) {
                        com.tencent.mapsdk.internal.by.this.f49055a.onStatusChanged(com.tencent.mapsdk.internal.by.this.f49059e, com.tencent.map.sdk.comps.offlinemap.OfflineStatus.COMPLETED);
                    }
                }
            });
            return;
        }
        if (!checkInvalidate() || android.text.TextUtils.isEmpty(this.f49064j)) {
            com.tencent.map.sdk.comps.offlinemap.OfflineStatusChangedListener offlineStatusChangedListener2 = this.f49055a;
            if (offlineStatusChangedListener2 != null) {
                offlineStatusChangedListener2.onStatusChanged(this.f49059e, com.tencent.map.sdk.comps.offlinemap.OfflineStatus.ERROR);
                return;
            }
            return;
        }
        if (this.f49055a != null) {
            this.f49065k.a(this.f49066l);
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "请求下载:[" + this.f49064j + "]");
        this.f49065k.a(this.f49064j, this.f49066l);
        com.tencent.map.sdk.comps.offlinemap.OfflineStatusChangedListener offlineStatusChangedListener3 = this.f49055a;
        if (offlineStatusChangedListener3 != null) {
            offlineStatusChangedListener3.onStatusChanged(this.f49059e, com.tencent.map.sdk.comps.offlinemap.OfflineStatus.READY);
        }
    }

    @Override // com.tencent.map.sdk.comps.offlinemap.OfflineItemController
    public final void stopDownload() {
        if (android.text.TextUtils.isEmpty(this.f49064j)) {
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "停止下载:[" + this.f49064j + "]");
        this.f49065k.b(this.f49064j);
    }

    private void a(com.tencent.map.sdk.comps.offlinemap.OfflineStatusChangedListener offlineStatusChangedListener) {
        this.f49055a = offlineStatusChangedListener;
    }

    public final synchronized boolean b(com.tencent.mapsdk.internal.bn bnVar) {
        if (this.f49063i.exists() && bnVar != null) {
            com.tencent.mapsdk.internal.bs J2 = bnVar.J();
            J2.c();
            com.tencent.mapsdk.internal.ks.a(this.f49063i, this.f49062h);
            J2.d();
            J2.f();
            com.tencent.mapsdk.internal.by.a aVar = this.f49056b;
            if (aVar != null) {
                aVar.a(this.f49059e, false);
            }
            com.tencent.map.sdk.comps.offlinemap.OfflineStatusChangedListener offlineStatusChangedListener = this.f49055a;
            if (offlineStatusChangedListener != null) {
                offlineStatusChangedListener.onStatusChanged(this.f49059e, com.tencent.map.sdk.comps.offlinemap.OfflineStatus.CLOSE);
            }
            this.f49067m = false;
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "关闭[" + this.f49058d.f49077c + "]离线");
            return true;
        }
        return false;
    }

    private void a(com.tencent.mapsdk.internal.by.a aVar) {
        this.f49056b = aVar;
    }

    public final synchronized boolean a(com.tencent.mapsdk.internal.bn bnVar) {
        if (bnVar == null) {
            return false;
        }
        a();
        if (!this.f49062h.exists()) {
            return false;
        }
        com.tencent.mapsdk.internal.bs J2 = bnVar.J();
        J2.c();
        com.tencent.mapsdk.internal.ks.a(this.f49062h, this.f49063i);
        J2.d();
        J2.f();
        this.f49067m = true;
        com.tencent.mapsdk.internal.by.a aVar = this.f49056b;
        if (aVar != null) {
            aVar.a(this.f49059e, true);
        }
        com.tencent.map.sdk.comps.offlinemap.OfflineStatusChangedListener offlineStatusChangedListener = this.f49055a;
        if (offlineStatusChangedListener != null) {
            offlineStatusChangedListener.onStatusChanged(this.f49059e, com.tencent.map.sdk.comps.offlinemap.OfflineStatus.OPEN);
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "开启[" + this.f49058d.f49077c + "]离线");
        return true;
    }

    private void b() {
        this.f49056b = null;
        this.f49055a = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f49061g.exists()) {
            try {
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "开始缓存文件校验...");
                java.lang.String a17 = com.tencent.mapsdk.internal.lh.a(this.f49061g);
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "结束缓存文件校验...");
                if (!this.f49058d.f49076b.equals(a17)) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50221v, "缓存文件MD5不一致！");
                    com.tencent.mapsdk.internal.ks.b(this.f49061g);
                } else {
                    com.tencent.mapsdk.internal.ks.b(this.f49062h);
                    com.tencent.mapsdk.internal.kv.a(this.f49061g, this.f49062h.getParent(), new java.io.FilenameFilter() { // from class: com.tencent.mapsdk.internal.by.3
                        @Override // java.io.FilenameFilter
                        public final boolean accept(java.io.File file, java.lang.String str) {
                            return com.tencent.mapsdk.internal.by.this.f49062h.getName().equals(str);
                        }
                    });
                }
            } catch (java.io.IOException unused) {
            }
        }
    }
}
