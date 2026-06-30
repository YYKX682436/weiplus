package com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd;

/* renamed from: com.tencent.tavkit.component.TAVExporter */
/* loaded from: classes10.dex */
public class C25865x41bb120a {

    /* renamed from: VIDEO_EXPORT_HEIGHT */
    public static final int f48855x76d6db2e = 1280;

    /* renamed from: VIDEO_EXPORT_WIDTH */
    public static final int f48856x4aa82bf = 720;
    private final java.lang.String TAG = "GameTemplateExporter@" + java.lang.Integer.toHexString(hashCode());

    /* renamed from: defaultOutputConfig */
    private com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.OutputConfig f48857xd4b7d484;

    /* renamed from: exportListener */
    private com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.ExportListener f48858x229b4888;

    /* renamed from: exportSession */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52 f48859xb6e83442;

    /* renamed from: isCanceled */
    private volatile boolean f48860xc9602be3;

    /* renamed from: isExporting */
    private volatile boolean f48861x5f6ab9a4;

    /* renamed from: com.tencent.tavkit.component.TAVExporter$2, reason: invalid class name */
    /* loaded from: classes10.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: $SwitchMap$com$tencent$tav$core$AssetExportSession$AssetExportSessionStatus */
        static final /* synthetic */ int[] f48864xaf4f82e;

        static {
            int[] iArr = new int[com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus.m96355xcee59d22().length];
            f48864xaf4f82e = iArr;
            try {
                iArr[com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus.AssetExportSessionStatusExporting.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f48864xaf4f82e[com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus.AssetExportSessionStatusCompleted.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f48864xaf4f82e[com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus.AssetExportSessionStatusFailed.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f48864xaf4f82e[com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus.AssetExportSessionStatusUnknown.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f48864xaf4f82e[com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus.AssetExportSessionStatusCancelled.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: com.tencent.tavkit.component.TAVExporter$ExportListener */
    /* loaded from: classes10.dex */
    public interface ExportListener {
        /* renamed from: onExportCancel */
        void m98420x25d222cd();

        /* renamed from: onExportCompleted */
        void m98421xd0ba3d18(java.lang.String str);

        /* renamed from: onExportError */
        void m98422x9e438755(int i17, java.lang.Throwable th6);

        /* renamed from: onExportStart */
        void m98423x9f0979af();

        /* renamed from: onExporting */
        void m98424x1757b48f(float f17);
    }

    public C25865x41bb120a() {
        com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.OutputConfig outputConfig = new com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.OutputConfig();
        this.f48857xd4b7d484 = outputConfig;
        outputConfig.f48072x178746dc = f48856x4aa82bf;
        outputConfig.f48071xbf929ab1 = 1280;
        outputConfig.f48069x5e0896f6 = 25;
    }

    /* renamed from: newOutputFile */
    private java.io.File m98411xe69017dd(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (file.exists()) {
            return file;
        }
        try {
            if (file.createNewFile()) {
                return file;
            }
            throw new java.lang.RuntimeException("创建输出文件失败");
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "export: ", e17);
            throw new java.lang.RuntimeException("创建输出文件失败", e17);
        }
    }

    /* renamed from: cancelExport */
    public void m98412x7be5eace() {
        if (this.f48859xb6e83442 != null) {
            this.f48860xc9602be3 = true;
            this.f48859xb6e83442.m96313x7be5eace();
        }
        this.f48861x5f6ab9a4 = false;
    }

    /* renamed from: export */
    public void m98414xb32913b4(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25875x73210e61 c25875x73210e61, final java.lang.String str, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.OutputConfig outputConfig) {
        if (c25875x73210e61 == null) {
            return;
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52 c25655x2c777b52 = this.f48859xb6e83442;
        if (c25655x2c777b52 != null) {
            c25655x2c777b52.m96313x7be5eace();
            this.f48859xb6e83442 = null;
        }
        if (outputConfig == null) {
            outputConfig = this.f48857xd4b7d484;
        }
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25889x1381b9fa c25889x1381b9fa = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25889x1381b9fa(c25875x73210e61);
        c25889x1381b9fa.m98648xad111597(false);
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25876x5fee0d04 m98645x86121029 = c25889x1381b9fa.m98645x86121029();
        com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 m98593x742a913a = m98645x86121029.m98593x742a913a();
        com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52 c25655x2c777b522 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52(m98593x742a913a, outputConfig);
        this.f48859xb6e83442 = c25655x2c777b522;
        c25655x2c777b522.m96349x5d30e02e(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, m98593x742a913a.m96116x51e8b0a()));
        this.f48859xb6e83442.m96337xb0bd9928(m98645x86121029.m98594xb605381c());
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "export composition duration: " + m98593x742a913a.m96116x51e8b0a());
        this.f48859xb6e83442.m96345xf4bbd0e4(m98411xe69017dd(str).getAbsolutePath());
        this.f48859xb6e83442.m96346xf4bdfbf9("mp4");
        this.f48859xb6e83442.m96351xfbd38eb1(m98645x86121029.m98595x57d6f9a5());
        this.f48859xb6e83442.m96314xae405e7f(new com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.ExportCallbackHandler() { // from class: com.tencent.tavkit.component.TAVExporter.1
            @Override // com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.ExportCallbackHandler
            /* renamed from: handlerCallback */
            public void mo96356xc562f1af(com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52 c25655x2c777b523) {
                int i17 = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.AnonymousClass2.f48864xaf4f82e[c25655x2c777b523.m96327x2fe4f2e8().ordinal()];
                if (i17 == 1) {
                    if (com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.this.f48858x229b4888 != null) {
                        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.this.TAG, "export progress: " + c25655x2c777b523.m96324x402effa3());
                        if (!com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.this.f48861x5f6ab9a4) {
                            com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.this.f48858x229b4888.m98423x9f0979af();
                        }
                        com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.this.f48858x229b4888.m98424x1757b48f(c25655x2c777b523.m96324x402effa3());
                    }
                    com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.this.f48861x5f6ab9a4 = true;
                    return;
                }
                if (i17 == 2) {
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.this.TAG, "export progress finished");
                    if (com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.this.f48858x229b4888 != null) {
                        com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.this.f48858x229b4888.m98421xd0ba3d18(str);
                    }
                    com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.this.f48861x5f6ab9a4 = false;
                    return;
                }
                if (i17 == 3 || i17 == 4) {
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.this.TAG, "export error");
                    if (com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.this.f48858x229b4888 != null) {
                        com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.this.f48858x229b4888.m98422x9e438755(c25655x2c777b523.m96317xe591acbc(), c25655x2c777b523.m96329xb494ca8a());
                    }
                    com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.this.f48861x5f6ab9a4 = false;
                    return;
                }
                if (i17 != 5) {
                    return;
                }
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.this.TAG, "export cancel");
                if (com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.this.f48858x229b4888 != null && com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.this.f48860xc9602be3) {
                    com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.this.f48860xc9602be3 = false;
                    com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.this.f48858x229b4888.m98420x25d222cd();
                }
                com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.this.f48861x5f6ab9a4 = false;
            }
        });
    }

    /* renamed from: getExportSession */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52 m98415x7447f08c() {
        return this.f48859xb6e83442;
    }

    /* renamed from: isExporting */
    public boolean m98416x5f6ab9a4() {
        return this.f48861x5f6ab9a4;
    }

    /* renamed from: setExportListener */
    public void m98417xd9297d8a(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.ExportListener exportListener) {
        this.f48858x229b4888 = exportListener;
    }

    /* renamed from: setOutputConfig */
    public void m98418x73e09125(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.OutputConfig outputConfig) {
        this.f48857xd4b7d484 = outputConfig;
    }

    /* renamed from: export */
    public void m98413xb32913b4(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25875x73210e61 c25875x73210e61, java.lang.String str) {
        m98414xb32913b4(c25875x73210e61, str, this.f48857xd4b7d484);
    }
}
