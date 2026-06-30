package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd;

/* loaded from: classes13.dex */
public final class zay extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.InterfaceC1963x66d2461a {
    public static final /* synthetic */ int zab = 0;
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1737x5f3ba74 zac;
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1731x2722202e zad;
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api zae;

    static {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1737x5f3ba74 c1737x5f3ba74 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1737x5f3ba74();
        zac = c1737x5f3ba74;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zaq zaqVar = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zaq();
        zad = zaqVar;
        zae = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api("ModuleInstall.API", zaqVar, c1737x5f3ba74);
    }

    public zay(android.app.Activity activity) {
        super(activity, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.NoOptions>) zae, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.f5867x9c607200, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings.f5891xe8545081);
    }

    public static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.C1969x90a0bf53 zad(boolean z17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1750x3d57946e... interfaceC1750x3d57946eArr) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(interfaceC1750x3d57946eArr, "Requested APIs must not be null.");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(interfaceC1750x3d57946eArr.length > 0, "Please provide at least one OptionalModuleApi.");
        for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1750x3d57946e interfaceC1750x3d57946e : interfaceC1750x3d57946eArr) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(interfaceC1750x3d57946e, "Requested API must not be null.");
        }
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.C1969x90a0bf53.zaa(java.util.Arrays.asList(interfaceC1750x3d57946eArr), z17);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.InterfaceC1963x66d2461a
    /* renamed from: areModulesAvailable */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.C1961xa52f0b68> mo18418x5aefa176(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1750x3d57946e... interfaceC1750x3d57946eArr) {
        final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.C1969x90a0bf53 zad2 = zad(false, interfaceC1750x3d57946eArr);
        if (zad2.m18448xe7384f41().isEmpty()) {
            return com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2442x4cd8b6e.m19614x3e1fc646(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.C1961xa52f0b68(true, 0));
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633.Builder m17947xdc3ef9b = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633.m17947xdc3ef9b();
        m17947xdc3ef9b.m17952x653f82bf(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zav.zaa);
        m17947xdc3ef9b.m17953x28d0cf7c(27301);
        m17947xdc3ef9b.m17951x14c0f2c8(false);
        m17947xdc3ef9b.run(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1789xb4db2fe4() { // from class: com.google.android.gms.common.moduleinstall.internal.zal
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1789xb4db2fe4
            /* renamed from: accept */
            public final void mo17946xab27b508(java.lang.Object obj, java.lang.Object obj2) {
                ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zaf) ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zaz) obj).m18108xb411027f()).zae(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zar(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zay.this, (com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc) obj2), zad2);
            }
        });
        return m17747xb0e79cc1(m17947xdc3ef9b.m17949x59bc66e());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.InterfaceC1963x66d2461a
    /* renamed from: deferredInstall */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo18419x48e8ecbc(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1750x3d57946e... interfaceC1750x3d57946eArr) {
        final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.C1969x90a0bf53 zad2 = zad(false, interfaceC1750x3d57946eArr);
        if (zad2.m18448xe7384f41().isEmpty()) {
            return com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2442x4cd8b6e.m19614x3e1fc646(null);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633.Builder m17947xdc3ef9b = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633.m17947xdc3ef9b();
        m17947xdc3ef9b.m17952x653f82bf(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zav.zaa);
        m17947xdc3ef9b.m17953x28d0cf7c(27302);
        m17947xdc3ef9b.m17951x14c0f2c8(false);
        m17947xdc3ef9b.run(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1789xb4db2fe4() { // from class: com.google.android.gms.common.moduleinstall.internal.zap
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1789xb4db2fe4
            /* renamed from: accept */
            public final void mo17946xab27b508(java.lang.Object obj, java.lang.Object obj2) {
                ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zaf) ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zaz) obj).m18108xb411027f()).zag(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zas(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zay.this, (com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc) obj2), zad2, null);
            }
        });
        return m17747xb0e79cc1(m17947xdc3ef9b.m17949x59bc66e());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.InterfaceC1963x66d2461a
    /* renamed from: getInstallModulesIntent */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.C1964xa68be64c> mo18420x4499439e(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1750x3d57946e... interfaceC1750x3d57946eArr) {
        final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.C1969x90a0bf53 zad2 = zad(true, interfaceC1750x3d57946eArr);
        if (zad2.m18448xe7384f41().isEmpty()) {
            return com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2442x4cd8b6e.m19614x3e1fc646(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.C1964xa68be64c(null));
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633.Builder m17947xdc3ef9b = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633.m17947xdc3ef9b();
        m17947xdc3ef9b.m17952x653f82bf(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zav.zaa);
        m17947xdc3ef9b.m17953x28d0cf7c(27307);
        m17947xdc3ef9b.run(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1789xb4db2fe4() { // from class: com.google.android.gms.common.moduleinstall.internal.zan
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1789xb4db2fe4
            /* renamed from: accept */
            public final void mo17946xab27b508(java.lang.Object obj, java.lang.Object obj2) {
                ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zaf) ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zaz) obj).m18108xb411027f()).zaf(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zaw(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zay.this, (com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc) obj2), zad2);
            }
        });
        return m17747xb0e79cc1(m17947xdc3ef9b.m17949x59bc66e());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.InterfaceC1963x66d2461a
    /* renamed from: installModules */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.C1966xb0eb0ed0> mo18421xa8c6256c(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.C1965x8179ea20 c1965x8179ea20) {
        final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.C1969x90a0bf53 m18446xa54b88ca = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.C1969x90a0bf53.m18446xa54b88ca(c1965x8179ea20);
        final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.InterfaceC1960x7be1bd21 m18428xcc17022a = c1965x8179ea20.m18428xcc17022a();
        java.util.concurrent.Executor m18429x1ecf951d = c1965x8179ea20.m18429x1ecf951d();
        if (m18446xa54b88ca.m18448xe7384f41().isEmpty()) {
            return com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2442x4cd8b6e.m19614x3e1fc646(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.C1966xb0eb0ed0(0));
        }
        if (m18428xcc17022a == null) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633.Builder m17947xdc3ef9b = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633.m17947xdc3ef9b();
            m17947xdc3ef9b.m17952x653f82bf(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zav.zaa);
            m17947xdc3ef9b.m17951x14c0f2c8(true);
            m17947xdc3ef9b.m17953x28d0cf7c(27304);
            m17947xdc3ef9b.run(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1789xb4db2fe4() { // from class: com.google.android.gms.common.moduleinstall.internal.zao
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1789xb4db2fe4
                /* renamed from: accept */
                public final void mo17946xab27b508(java.lang.Object obj, java.lang.Object obj2) {
                    ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zaf) ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zaz) obj).m18108xb411027f()).zag(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zat(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zay.this, (com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc) obj2), m18446xa54b88ca, null);
                }
            });
            return m17747xb0e79cc1(m17947xdc3ef9b.m17949x59bc66e());
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(m18428xcc17022a);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0 m17761x42780477 = m18429x1ecf951d == null ? m17761x42780477(m18428xcc17022a, "InstallStatusListener") : com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1782xdd080d3.m17929xe0f82b9c(m18428xcc17022a, m18429x1ecf951d, "InstallStatusListener");
        final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.BinderC1971x38ed88 binderC1971x38ed88 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.BinderC1971x38ed88(m17761x42780477);
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1789xb4db2fe4 interfaceC1789xb4db2fe4 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1789xb4db2fe4() { // from class: com.google.android.gms.common.moduleinstall.internal.zai
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1789xb4db2fe4
            /* renamed from: accept */
            public final void mo17946xab27b508(java.lang.Object obj, java.lang.Object obj2) {
                ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zaf) ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zaz) obj).m18108xb411027f()).zag(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zau(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zay.this, atomicReference, (com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc) obj2, m18428xcc17022a), m18446xa54b88ca, binderC1971x38ed88);
            }
        };
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1789xb4db2fe4 interfaceC1789xb4db2fe42 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1789xb4db2fe4() { // from class: com.google.android.gms.common.moduleinstall.internal.zaj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1789xb4db2fe4
            /* renamed from: accept */
            public final void mo17946xab27b508(java.lang.Object obj, java.lang.Object obj2) {
                ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zaf) ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zaz) obj).m18108xb411027f()).zai(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zav(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zay.this, (com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc) obj2), binderC1971x38ed88);
            }
        };
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1788x70613099.Builder m17937xdc3ef9b = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1788x70613099.m17937xdc3ef9b();
        m17937xdc3ef9b.m17945x6ef13e12(m17761x42780477);
        m17937xdc3ef9b.m17942x653f82bf(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zav.zaa);
        m17937xdc3ef9b.m17941x14c0f2c8(true);
        m17937xdc3ef9b.m17940xd6dc2ea3(interfaceC1789xb4db2fe4);
        m17937xdc3ef9b.m17944x31d4943c(interfaceC1789xb4db2fe42);
        m17937xdc3ef9b.m17943x28d0cf7c(27305);
        return m17749xa3689bc0(m17937xdc3ef9b.m17938x59bc66e()).mo19600xd0f5b8c9(new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2438xddc7e5ba() { // from class: com.google.android.gms.common.moduleinstall.internal.zak
            @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2438xddc7e5ba
            /* renamed from: then */
            public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 mo18451x364e1d(java.lang.Object obj) {
                int i17 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zay.zab;
                java.util.concurrent.atomic.AtomicReference atomicReference2 = atomicReference;
                return atomicReference2.get() != null ? com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2442x4cd8b6e.m19614x3e1fc646((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.C1966xb0eb0ed0) atomicReference2.get()) : com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2442x4cd8b6e.m19613x3867b586(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1738x1a0a8775(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12.f5901x9c108648));
            }
        });
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.InterfaceC1963x66d2461a
    /* renamed from: releaseModules */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo18422x7e6bd180(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1750x3d57946e... interfaceC1750x3d57946eArr) {
        final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.C1969x90a0bf53 zad2 = zad(false, interfaceC1750x3d57946eArr);
        if (zad2.m18448xe7384f41().isEmpty()) {
            return com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2442x4cd8b6e.m19614x3e1fc646(null);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633.Builder m17947xdc3ef9b = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1794xa4358633.m17947xdc3ef9b();
        m17947xdc3ef9b.m17952x653f82bf(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zav.zaa);
        m17947xdc3ef9b.m17953x28d0cf7c(27303);
        m17947xdc3ef9b.m17951x14c0f2c8(false);
        m17947xdc3ef9b.run(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1789xb4db2fe4() { // from class: com.google.android.gms.common.moduleinstall.internal.zam
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1789xb4db2fe4
            /* renamed from: accept */
            public final void mo17946xab27b508(java.lang.Object obj, java.lang.Object obj2) {
                ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zaf) ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zaz) obj).m18108xb411027f()).zah(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zax(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zay.this, (com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc) obj2), zad2);
            }
        });
        return m17747xb0e79cc1(m17947xdc3ef9b.m17949x59bc66e());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.InterfaceC1963x66d2461a
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: unregisterListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Boolean> mo18423xc221c110(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.InterfaceC1960x7be1bd21 interfaceC1960x7be1bd21) {
        return m17751x3ea49d87(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1782xdd080d3.m17930x7cce866f(interfaceC1960x7be1bd21, "InstallStatusListener"), 27306);
    }

    public zay(android.content.Context context) {
        super(context, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.NoOptions>) zae, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.f5867x9c607200, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings.f5891xe8545081);
    }
}
