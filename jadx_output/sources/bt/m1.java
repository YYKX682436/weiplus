package bt;

@j95.b(dependencies = {com.tencent.mm.plugin.zero.m1.class, com.tencent.mm.booter.t.class})
/* loaded from: classes12.dex */
public final class m1 extends i95.w implements com.tencent.mm.plugin.zero.s0 {

    /* renamed from: d, reason: collision with root package name */
    public int f24097d = bt.k1.f24092a.a("StnCallBack");

    @Override // com.tencent.mm.plugin.zero.s0
    public long T3() {
        return this.f24097d;
    }

    @Override // com.tencent.mm.plugin.zero.s0
    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PushMarsOnSplashService", "set uin: " + i17);
    }

    @Override // com.tencent.mm.plugin.zero.s0
    public void i4(int i17, int i18, byte[] bArr, int i19) {
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.PushMarsOnSplashService", "mars2 start process:" + bm5.f1.a() + " context:" + com.tencent.mars.MarsContext.getContext().getNativeHandle());
        if (((com.tencent.mars.app.AppManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.app.AppManager.class)) == null) {
            com.tencent.mars.app.AppManager appManager = new com.tencent.mars.app.AppManager(com.tencent.mars.MarsContext.getContext());
            com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.app.AppManager.class, appManager);
            appManager.setCallback(new com.tencent.mars.mm.AppManagerCallback(com.tencent.mm.sdk.platformtools.x2.f193071a));
        }
        com.tencent.mars.stn.StnManager stnManager = new com.tencent.mars.stn.StnManager(com.tencent.mars.MarsContext.getContext());
        com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.stn.StnManager.class, stnManager);
        stnManager.setCallback(new com.tencent.mars.stn.StnManagerCallback());
        com.tencent.mars.mm.MMStnManager mMStnManager = new com.tencent.mars.mm.MMStnManager(com.tencent.mars.MarsContext.getContext());
        com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.mm.MMStnManager.class, mMStnManager);
        mMStnManager.setCallback(new com.tencent.mars.mm.MMStnManagerCallback());
        if (((com.tencent.mars.sdt.SdtManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.sdt.SdtManager.class)) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PushMarsOnSplashService", "mars2 add sdt manager");
            com.tencent.mars.sdt.SdtManager sdtManager = new com.tencent.mars.sdt.SdtManager(com.tencent.mars.MarsContext.getContext());
            com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.sdt.SdtManager.class, sdtManager);
            sdtManager.setCallback(new com.tencent.mars.sdt.SdtManagerCallback());
        }
        if (((com.tencent.mars.sdt.MMSdtManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.sdt.MMSdtManager.class)) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PushMarsOnSplashService", "mars2 add mmsdt manager");
            com.tencent.mars.sdt.MMSdtManager mMSdtManager = new com.tencent.mars.sdt.MMSdtManager(com.tencent.mars.MarsContext.getContext());
            com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.sdt.MMSdtManager.class, mMSdtManager);
            mMSdtManager.setCallback(new com.tencent.mars.sdt.MMSdtManagerCallback());
        }
        com.tencent.mars.smc.SmcManager smcManager = new com.tencent.mars.smc.SmcManager(com.tencent.mars.MarsContext.getContext());
        com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.smc.SmcManager.class, smcManager);
        com.tencent.mars.smc.SmcManagerCallbackWithPush smcManagerCallbackWithPush = new com.tencent.mars.smc.SmcManagerCallbackWithPush(com.tencent.mm.sdk.platformtools.x2.f193071a);
        smcManagerCallbackWithPush.setKvReportNotify(new com.tencent.mm.plugin.report.service.b());
        smcManager.setCallback(smcManagerCallbackWithPush);
        com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.mmdns.MMDnsManager.class, new com.tencent.mars.mmdns.MMDnsManager(com.tencent.mars.MarsContext.getContext()));
        com.tencent.mars.account.AccountManager accountManager = new com.tencent.mars.account.AccountManager(com.tencent.mars.MarsContext.getContext());
        com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.account.AccountManager.class, accountManager);
        accountManager.setCallback(new com.tencent.mars.account.AccountManagerCallback());
        com.tencent.mars.cdn.CronetLogic.setCallback(new com.tencent.mars.cdn.CronetLogicCallBack());
        com.tencent.mars.cdn.CdnC2Java.setCallback(new com.tencent.mars.cdn.CdnC2JavaCallBack());
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        com.tencent.mars.comm.PlatformComm.C2Java.setCallback(new com.tencent.mars.comm.PlatformCommC2JavaCallBack());
        com.tencent.mars.comm.MarsPlatformComm.setContext(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mars.comm.NetworkSignalUtil.setMyNetworkSignalUtil(new com.tencent.mars.comm.NetworkSignalUtilImpl());
        com.tencent.mars.WeChatMars.init(com.tencent.mm.sdk.platformtools.x2.f193071a, new android.os.Handler(android.os.Looper.getMainLooper()));
        com.tencent.mars.xlog.Log.i("MicroMsg.PushMarsOnSplashService", "mars2 end process:" + bm5.f1.a() + " context:" + com.tencent.mars.MarsContext.getContext().getNativeHandle());
        com.tencent.mars.magicbox.IPxxLogic.setCallBack(new com.tencent.mm.network.u0());
        com.tencent.mars.magicbox.IPxxLogic.checkAndReportUploadTask();
        try {
            com.tencent.mars.WeChatMars.onCreate();
            if (com.tencent.mm.sdk.platformtools.x2.p()) {
                ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).onCreate();
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.WeChatMars.onCreate();
            if (com.tencent.mm.sdk.platformtools.x2.p()) {
                ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).onCreate();
            }
        }
        ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).SetDebugFlag(kx3.a.f313280a);
        ((com.tencent.mars.account.AccountManager) com.tencent.mars.MarsContext.getContext().getManager(com.tencent.mars.account.AccountManager.class)).updateClientVersion(com.tencent.mm.sdk.platformtools.z.f193112h);
        ((com.tencent.mars.account.AccountManager) com.tencent.mars.MarsContext.getContext().getManager(com.tencent.mars.account.AccountManager.class)).updateDeviceInfo(o45.wf.f343023a, wo.w0.k());
        com.tencent.mars.xlog.Log.i("MicroMsg.PushMarsOnSplashService", "setupConfig");
        x1();
        boolean l17 = j62.e.g().l("clicfg_newdns_host_switch_android", true, true, true);
        ((com.tencent.mars.app.AppManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.app.AppManager.class)).SetConfigBooleanValue("NewDnsHostSwitch", l17);
        boolean l18 = j62.e.g().l("clicfg_handle_reqresp_in_worker_android", false, true, true);
        ((com.tencent.mars.app.AppManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.app.AppManager.class)).SetConfigBooleanValue("IsHandleReqRespBuffInWorker", l18);
        ((com.tencent.mars.app.AppManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.app.AppManager.class)).SetConfigBooleanValue("NewDnsIpStrategySwitch", j62.e.g().l("clicfg_newdns_ipstrategy_switch_android", true, true, true));
        ((com.tencent.mars.app.AppManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.app.AppManager.class)).SetConfigBooleanValue("NewDnsEnableHttps", j62.e.g().l("clicfg_newdns_resolve_enable_https", true, true, true));
        com.tencent.mars.xlog.Log.i("MicroMsg.PushMarsOnSplashService", "clicfg_newdns_host_switch_android:" + l17 + " clicfg_handle_reqresp_in_worker_android:" + l18);
        ((com.tencent.mars.app.AppManager) com.tencent.mars.MarsContext.getContext().getManager(com.tencent.mars.app.AppManager.class)).SetConfigBooleanValue("IsUseThreadPool", j62.e.g().l("clicfg_thread_pool_switch_android", false, true, true));
        ((com.tencent.mars.app.AppManager) com.tencent.mars.MarsContext.getContext().getManager(com.tencent.mars.app.AppManager.class)).SetConfigIntValue("ThreadPoolMaxSize", j62.e.g().i("clicfg_thread_pool_max_size_android", 50, true, true));
        ((com.tencent.mars.app.AppManager) com.tencent.mars.MarsContext.getContext().getManager(com.tencent.mars.app.AppManager.class)).SetConfigIntValue("ThreadPoolKeepAliveTime", j62.e.g().i("clicfg_thread_pool_keep_alive_time_android", 300000, true, true));
        ((com.tencent.mars.app.AppManager) com.tencent.mars.MarsContext.getContext().getManager(com.tencent.mars.app.AppManager.class)).SetConfigBooleanValue("PayNewDnsSyncOnFirstCgi", j62.e.g().l("clicfg_android_paynewdns_sync_opt", false, true, true));
        fp.d0.o("MMProtocalJni");
        com.tencent.mm.app.w7.b(-1);
        if (!com.tencent.paymars.WeChatMars.abtestOpen()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.PushMarsOnSplashService", "clicfg_enable_paymars_android:false");
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.PushMarsOnSplashService", "clicfg_enable_paymars_android:true");
        com.tencent.mars.xlog.Log.i("MicroMsg.PushMarsOnSplashService", "paymars start process:" + bm5.f1.a() + " context:" + com.tencent.paymars.MarsContext.getContext().getNativeHandle());
        if (((com.tencent.paymars.app.AppManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.app.AppManager.class)) == null) {
            com.tencent.paymars.app.AppManager appManager2 = new com.tencent.paymars.app.AppManager(com.tencent.paymars.MarsContext.getContext());
            com.tencent.paymars.MarsContext.getContext().addManager(com.tencent.paymars.app.AppManager.class, appManager2);
            appManager2.setCallback(new com.tencent.paymars.mm.AppManagerCallback(com.tencent.mm.sdk.platformtools.x2.f193071a));
        }
        com.tencent.paymars.stn.StnManager stnManager2 = new com.tencent.paymars.stn.StnManager(com.tencent.paymars.MarsContext.getContext());
        com.tencent.paymars.MarsContext.getContext().addManager(com.tencent.paymars.stn.StnManager.class, stnManager2);
        stnManager2.setCallback(new com.tencent.paymars.stn.StnManagerCallback());
        com.tencent.paymars.mm.MMStnManager mMStnManager2 = new com.tencent.paymars.mm.MMStnManager(com.tencent.paymars.MarsContext.getContext());
        com.tencent.paymars.MarsContext.getContext().addManager(com.tencent.paymars.mm.MMStnManager.class, mMStnManager2);
        mMStnManager2.setCallback(new com.tencent.paymars.mm.MMStnManagerCallback());
        if (((com.tencent.paymars.sdt.SdtManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.sdt.SdtManager.class)) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PushMarsOnSplashService", "paymars add sdt manager");
            com.tencent.paymars.sdt.SdtManager sdtManager2 = new com.tencent.paymars.sdt.SdtManager(com.tencent.paymars.MarsContext.getContext());
            com.tencent.paymars.MarsContext.getContext().addManager(com.tencent.paymars.sdt.SdtManager.class, sdtManager2);
            sdtManager2.setCallback(new com.tencent.paymars.sdt.SdtManagerCallback());
        }
        if (((com.tencent.paymars.sdt.MMSdtManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.sdt.MMSdtManager.class)) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PushMarsOnSplashService", "paymars add mmsdt manager");
            com.tencent.paymars.sdt.MMSdtManager mMSdtManager2 = new com.tencent.paymars.sdt.MMSdtManager(com.tencent.paymars.MarsContext.getContext());
            com.tencent.paymars.MarsContext.getContext().addManager(com.tencent.paymars.sdt.MMSdtManager.class, mMSdtManager2);
            mMSdtManager2.setCallback(new com.tencent.paymars.sdt.MMSdtManagerCallback());
        }
        com.tencent.paymars.smc.SmcManager smcManager2 = new com.tencent.paymars.smc.SmcManager(com.tencent.paymars.MarsContext.getContext());
        com.tencent.paymars.MarsContext.getContext().addManager(com.tencent.paymars.smc.SmcManager.class, smcManager2);
        com.tencent.paymars.smc.SmcManagerCallbackWithPush smcManagerCallbackWithPush2 = new com.tencent.paymars.smc.SmcManagerCallbackWithPush(com.tencent.mm.sdk.platformtools.x2.f193071a);
        smcManagerCallbackWithPush2.setKvReportNotify(new com.tencent.mm.plugin.report.service.b());
        smcManager2.setCallback(smcManagerCallbackWithPush2);
        com.tencent.paymars.MarsContext.getContext().addManager(com.tencent.paymars.mmdns.MMDnsManager.class, new com.tencent.paymars.mmdns.MMDnsManager(com.tencent.paymars.MarsContext.getContext()));
        com.tencent.paymars.WeChatMars.init(com.tencent.mm.sdk.platformtools.x2.f193071a, new android.os.Handler(android.os.Looper.getMainLooper()));
        com.tencent.mars.xlog.Log.i("MicroMsg.PushMarsOnSplashService", "paymars end process:" + bm5.f1.a() + " context:" + com.tencent.paymars.MarsContext.getContext().getNativeHandle());
        try {
            com.tencent.paymars.WeChatMars.onCreate();
            if (com.tencent.mm.sdk.platformtools.x2.p()) {
                ((com.tencent.paymars.smc.SmcManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.smc.SmcManager.class)).onCreate();
            }
        } catch (java.lang.Throwable unused2) {
            com.tencent.paymars.WeChatMars.onCreate();
            if (com.tencent.mm.sdk.platformtools.x2.p()) {
                ((com.tencent.paymars.smc.SmcManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.smc.SmcManager.class)).onCreate();
            }
        }
        ((com.tencent.paymars.smc.SmcManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.smc.SmcManager.class)).SetDebugFlag(kx3.a.f313280a);
        com.tencent.mars.xlog.Log.i("MicroMsg.PushMarsOnSplashService", "paymars setupConfig");
        com.tencent.mars.xlog.Log.i("MicroMsg.PushMarsOnSplashService", "paymars refreshConfig");
        java.util.Iterator it = bt.k1.f24093b.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) ((java.util.Map.Entry) it.next()).getKey();
            if (!kotlin.jvm.internal.o.b(str, "StnCallBack")) {
                ((com.tencent.paymars.app.AppManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.app.AppManager.class)).SetConfigIntValue(str, bt.k1.f24092a.a(str));
            }
        }
        ((com.tencent.paymars.app.AppManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.app.AppManager.class)).SetConfigBooleanValue("NoRetryPkgFail", j62.e.g().l("clicfg_no_retry_mmpkg_fail_android", false, true, true));
        boolean l19 = j62.e.g().l("clicfg_no_retry_sever_fai_android", false, true, true);
        ((com.tencent.paymars.app.AppManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.app.AppManager.class)).SetConfigBooleanValue("NoRetryServerFail", l19);
        boolean l27 = j62.e.g().l("clicfg_no_retry_errcode_android", true, true, true);
        ((com.tencent.paymars.app.AppManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.app.AppManager.class)).SetConfigBooleanValue("NoRetryErrCode", l27);
        com.tencent.mars.xlog.Log.i("MicroMsg.PushMarsOnSplashService", "paymars noRetryMMPkgFail:%b noRetryServerFail:%b noRetryErrCode:%b", java.lang.Boolean.valueOf(l19), java.lang.Boolean.valueOf(l19), java.lang.Boolean.valueOf(l27));
        boolean l28 = j62.e.g().l("clicfg_newdns_host_switch_android", true, true, true);
        ((com.tencent.paymars.app.AppManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.app.AppManager.class)).SetConfigBooleanValue("NewDnsHostSwitch", l28);
        boolean l29 = j62.e.g().l("clicfg_handle_reqresp_in_worker_android", false, true, true);
        ((com.tencent.paymars.app.AppManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.app.AppManager.class)).SetConfigBooleanValue("IsHandleReqRespBuffInWorker", l29);
        ((com.tencent.paymars.app.AppManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.app.AppManager.class)).SetConfigBooleanValue("NewDnsIpStrategySwitch", j62.e.g().l("clicfg_newdns_ipstrategy_switch_android", true, true, true));
        ((com.tencent.paymars.app.AppManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.app.AppManager.class)).SetConfigBooleanValue("PayMMTlsKeySwitch", j62.e.g().l("clicfg_pay_mmtls_switch_android", false, true, true));
        com.tencent.mars.xlog.Log.i("MicroMsg.PushMarsOnSplashService", "clicfg_newdns_host_switch_android:" + l28 + " clicfg_handle_reqresp_in_worker_android:" + l29);
        ((com.tencent.paymars.app.AppManager) com.tencent.paymars.MarsContext.getContext().getManager(com.tencent.paymars.app.AppManager.class)).SetConfigBooleanValue("IsUseThreadPool", j62.e.g().l("clicfg_thread_pool_switch_android", false, true, true));
        ((com.tencent.paymars.app.AppManager) com.tencent.paymars.MarsContext.getContext().getManager(com.tencent.paymars.app.AppManager.class)).SetConfigIntValue("ThreadPoolMaxSize", j62.e.g().i("clicfg_thread_pool_max_size_android", 50, true, true));
        ((com.tencent.paymars.app.AppManager) com.tencent.paymars.MarsContext.getContext().getManager(com.tencent.paymars.app.AppManager.class)).SetConfigIntValue("ThreadPoolKeepAliveTime", j62.e.g().i("clicfg_thread_pool_keep_alive_time_android", 300000, true, true));
        ((com.tencent.paymars.app.AppManager) com.tencent.paymars.MarsContext.getContext().getManager(com.tencent.paymars.app.AppManager.class)).SetConfigBooleanValue("PayNewDnsSyncOnFirstCgi", j62.e.g().l("clicfg_android_paynewdns_sync_opt", false, true, true));
    }

    @Override // com.tencent.mm.plugin.zero.s0
    public void x1() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PushMarsOnSplashService", "refreshConfig");
        this.f24097d = bt.k1.f24092a.a("StnCallBack");
        java.util.Iterator it = bt.k1.f24093b.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) ((java.util.Map.Entry) it.next()).getKey();
            if (!kotlin.jvm.internal.o.b(str, "StnCallBack")) {
                ((com.tencent.mars.app.AppManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.app.AppManager.class)).SetConfigIntValue(str, bt.k1.f24092a.a(str));
            }
        }
        ((com.tencent.mars.app.AppManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.app.AppManager.class)).SetConfigBooleanValue("NoRetryPkgFail", j62.e.g().l("clicfg_no_retry_mmpkg_fail_android", false, true, true));
        boolean l17 = j62.e.g().l("clicfg_no_retry_sever_fai_android", false, true, true);
        ((com.tencent.mars.app.AppManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.app.AppManager.class)).SetConfigBooleanValue("NoRetryServerFail", l17);
        boolean l18 = j62.e.g().l("clicfg_no_retry_errcode_android", true, true, true);
        ((com.tencent.mars.app.AppManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.app.AppManager.class)).SetConfigBooleanValue("NoRetryErrCode", l18);
        com.tencent.mars.xlog.Log.i("MicroMsg.PushMarsOnSplashService", "noRetryMMPkgFail:%b noRetryServerFail:%b noRetryErrCode:%b", java.lang.Boolean.valueOf(l17), java.lang.Boolean.valueOf(l17), java.lang.Boolean.valueOf(l18));
        com.tencent.mm.modelbase.a.b();
        com.tencent.mars.smc.SmcConfig.INSTANCE.updateConfig();
    }
}
