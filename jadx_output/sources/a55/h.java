package a55;

/* loaded from: classes12.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final a55.h f1617a = new a55.h();

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f1618b;

    public final synchronized void a() {
        if (f1618b) {
            return;
        }
        f1618b = true;
        fp.d0.o("MMProtocalJni");
        fp.d0.o("wechatbase");
        fp.d0.o("wechatnetwork");
        if (((com.tencent.mars.app.AppManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.app.AppManager.class)) == null) {
            com.tencent.mars.app.AppManager appManager = new com.tencent.mars.app.AppManager(com.tencent.mars.MarsContext.getContext());
            com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.app.AppManager.class, appManager);
            appManager.setCallback(new a55.a(com.tencent.mm.sdk.platformtools.x2.f193071a));
        }
        com.tencent.mars.stn.StnManager stnManager = new com.tencent.mars.stn.StnManager(com.tencent.mars.MarsContext.getContext());
        com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.stn.StnManager.class, stnManager);
        stnManager.setCallback(new a55.k());
        com.tencent.mars.mm.MMStnManager mMStnManager = new com.tencent.mars.mm.MMStnManager(com.tencent.mars.MarsContext.getContext());
        com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.mm.MMStnManager.class, mMStnManager);
        mMStnManager.setCallback(new a55.c());
        if (((com.tencent.mars.sdt.SdtManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.sdt.SdtManager.class)) == null) {
            com.tencent.mars.sdt.SdtManager sdtManager = new com.tencent.mars.sdt.SdtManager(com.tencent.mars.MarsContext.getContext());
            com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.sdt.SdtManager.class, sdtManager);
            sdtManager.setCallback(new a55.i());
        }
        if (((com.tencent.mars.sdt.MMSdtManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.sdt.MMSdtManager.class)) == null) {
            com.tencent.mars.sdt.MMSdtManager mMSdtManager = new com.tencent.mars.sdt.MMSdtManager(com.tencent.mars.MarsContext.getContext());
            com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.sdt.MMSdtManager.class, mMSdtManager);
            mMSdtManager.setCallback(new a55.b());
        }
        com.tencent.mars.comm.PlatformComm.C2Java.setCallback(new com.tencent.mars.comm.PlatformCommC2JavaCallBack());
        com.tencent.mars.comm.MarsPlatformComm.setContext(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mars.comm.NetworkSignalUtil.setMyNetworkSignalUtil(new com.tencent.mars.comm.NetworkSignalUtilImpl());
        new com.tencent.mm.sdk.platformtools.n3(y45.u.a().getLooper());
        com.tencent.mars.WeChatMars.init(com.tencent.mm.sdk.platformtools.x2.f193071a, new android.os.Handler(y45.u.a().getLooper()));
        com.tencent.mars.WeChatMars.onCreate();
    }
}
