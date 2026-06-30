package com.p314xaae8f345.p2841xd11c237d.smc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/tencent/paymars/smc/SmcConfig;", "", "Ljz5/f0;", "setFreqLimit", "checkConfig", "updateConfig", "", "TAG", "Ljava/lang/String;", "UDR_PROJECT_ID", "UDR_CONFIG_FILE_NAME", "<init>", "()V", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.paymars.smc.SmcConfig */
/* loaded from: classes12.dex */
public final class C23032x3abd71cb {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.p2841xd11c237d.smc.C23032x3abd71cb f40236x4fbc8495 = new com.p314xaae8f345.p2841xd11c237d.smc.C23032x3abd71cb();
    private static final java.lang.String TAG = "MicroMsg.SmcConfig";
    public static final java.lang.String UDR_CONFIG_FILE_NAME = "kv_idkey_config";
    public static final java.lang.String UDR_PROJECT_ID = "ilinkres_6eea8388";

    private C23032x3abd71cb() {
    }

    /* renamed from: checkConfig */
    private final void m84477x123a6e6a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "smc-config checking");
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q qVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q();
        qVar.c("ilinkres_6eea8388");
        java.util.LinkedList linkedList = qVar.f299081e;
        if (linkedList != null) {
            linkedList.add("kv_idkey_config");
        }
        ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Di(qVar, new ea5.k() { // from class: com.tencent.paymars.smc.SmcConfig$checkConfig$1
            @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
            /* renamed from: onCallBackFailAsync */
            public void mo13581xd73276fa(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
                super.mo13581xd73276fa(j17, i17, i18, projectId, name, i19, type);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmcConfig", "smc-config check fail");
            }

            @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
            /* renamed from: onCallBackSuccessAsync */
            public void mo13582x5e6271bd(long j17, java.lang.String projectId, java.lang.String name, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
                super.mo13582x5e6271bd(j17, projectId, name, i17, type);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmcConfig", "smc-config check success");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setFreqLimit */
    public final void m84478x5554c1e1() {
        java.lang.String m117639xfb83cc9b;
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui("ilinkres_6eea8388", "kv_idkey_config");
        boolean z17 = false;
        if (Ui != null && (m117639xfb83cc9b = Ui.m117639xfb83cc9b()) != null) {
            if (m117639xfb83cc9b.length() > 0) {
                z17 = true;
            }
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "smc-config config is empty. do check.");
            m84477x123a6e6a();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "smc-config config: " + Ui.m117639xfb83cc9b());
            ((com.p314xaae8f345.p2841xd11c237d.smc.C23035x1608f244) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84212x76847179().m84276x6f964b77(com.p314xaae8f345.p2841xd11c237d.smc.C23035x1608f244.class)).m84530xaf68cd3c(Ui.m117639xfb83cc9b());
        }
    }

    /* renamed from: updateConfig */
    public final void m84479xac5f2d6b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "smc-config process: " + bm5.f1.a());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            m84478x5554c1e1();
        } else {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "smc-config FreqLimit ignore");
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).k(new java.lang.Runnable() { // from class: com.tencent.paymars.smc.SmcConfig$updateConfig$1
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.p2841xd11c237d.smc.C23032x3abd71cb.f40236x4fbc8495.m84478x5554c1e1();
                }
            }, 5000L);
        }
    }
}
