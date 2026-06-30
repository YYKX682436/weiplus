package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc;

/* renamed from: com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch */
/* loaded from: classes7.dex */
public final class C12595xe6b43f9f {

    /* renamed from: NAME */
    public static final java.lang.String f35205x24728b = "WeAppLaunch";

    /* renamed from: sStepNodes */
    public static final java.util.List<kg1.g> f35206x83a96c12;

    /* renamed from: stepCheckBan */
    public static kg1.a f35207x8acd80d3;

    /* renamed from: stepColdLaunchFailed */
    public static kg1.a f35208xbfcbd1c0;

    /* renamed from: stepContainerUILaunch */
    public static kg1.a f35209xa575417c;

    /* renamed from: stepCreateMagicBrushView */
    public static kg1.a f35210xcaf602da;

    /* renamed from: stepCreatePageUI */
    public static kg1.a f35211xe0ec6e6b;

    /* renamed from: stepCreatePageUI_Game */
    public static kg1.a f35212x439b5566;

    /* renamed from: stepCreateWebViewInstance */
    public static kg1.a f35213x5d07bfc6;

    /* renamed from: stepGenerateFuncReadyRespond */
    public static kg1.a f35214x15f2f8d7;

    /* renamed from: stepGetContact */
    public static kg1.a f35215xa47b33d6;

    /* renamed from: stepGetContact_CGI */
    public static kg1.a f35216xc99d8c7c;

    /* renamed from: stepGetContact_DB */
    public static kg1.a f35217xdd36a187;

    /* renamed from: stepInitRuntimeGroup */
    public static kg1.a f35218x38d531a3;

    /* renamed from: stepInitRuntimeGroup_Game */
    public static kg1.a f35219xbd43d52e;

    /* renamed from: stepInjectJSAppService */
    public static kg1.a f35220x2d8e0b7a;

    /* renamed from: stepInjectJSGame */
    public static kg1.a f35221xfa7cfe98;

    /* renamed from: stepInjectJSPageScript */
    public static kg1.a f35222xbf925660;

    /* renamed from: stepInjectJSWAMainContext */
    public static kg1.a f35223x8dde28c6;

    /* renamed from: stepInjectJSWASubContext */
    public static kg1.a f35224x60b9523f;

    /* renamed from: stepInjectJSWAWebview */
    public static kg1.a f35225x6746d709;

    /* renamed from: stepInjectWAGameContext */
    public static kg1.a f35226xc85567d6;

    /* renamed from: stepInjectWAGameSubContext */
    public static kg1.a f35227xdad5cfc8;

    /* renamed from: stepInjectWAPageFrameHtml */
    public static kg1.a f35228x2691f522;

    /* renamed from: stepInjectWxConfig */
    public static kg1.a f35229x34dffc20;

    /* renamed from: stepInjectWxConfig_Game */
    public static kg1.a f35230x3fb510d1;

    /* renamed from: stepInstallLibraries */
    public static kg1.a f35231x151fe2a;

    /* renamed from: stepLaunch */
    public static kg1.a f35232x93cecd9f;

    /* renamed from: stepPageInit */
    public static kg1.a f35233x62683b2b;

    /* renamed from: stepPageInitUIGroup */
    public static kg1.a f35234x1e366c0;

    /* renamed from: stepPageInitUIGroup_Game */
    public static kg1.a f35235xf4b4a31;

    /* renamed from: stepPageInit_Game */
    public static kg1.a f35236xdb4180a6;

    /* renamed from: stepPageReady */
    public static kg1.a f35237xeb19c6e8;

    /* renamed from: stepPageReady_Game */
    public static kg1.a f35238x8d52c309;

    /* renamed from: stepPrepareMainProcess */
    public static kg1.a f35239x193ba6db;

    /* renamed from: stepPrepareResourceGroup */
    public static kg1.a f35240x3a573e36;

    /* renamed from: stepPrepareResourceProcess */
    public static kg1.a f35241xdd905466;

    /* renamed from: stepPrepareResourceSubProcessCodePkg_DB */
    public static kg1.a f35242x3377c4f6;

    /* renamed from: stepPrepareResourceSubProcessCodePkg_Download */
    public static kg1.a f35243xb69baf20;

    /* renamed from: stepPrepareResourceSubProcessLaunchWxaApp_CGI */
    public static kg1.a f35244x5df25e72;

    /* renamed from: stepPrepareResourceSubProcessLaunchWxaApp_DB */
    public static kg1.a f35245x76a4b8d1;

    /* renamed from: stepPrepareResourceTimeout */
    public static kg1.a f35246xa1b28358;

    /* renamed from: stepPrepareResourceWaitForResult */
    public static kg1.a f35247x9808c908;

    /* renamed from: stepPrepareRuntime */
    public static kg1.a f35248x73a6f2bd;

    /* renamed from: stepPrepareWebView */
    public static kg1.a f35249x6021d2fe;

    /* renamed from: stepServiceInit */
    public static kg1.a f35250x1dede6f9;

    /* renamed from: stepServiceInit_Game */
    public static kg1.a f35251xb7150598;

    /* renamed from: stepSetupConfigsPostResourcePrepared */
    public static kg1.a f35252xab9b446b;

    /* renamed from: stepSurfaceAvailable */
    public static kg1.a f35253x12bfe388;

    /* renamed from: stepVdSync */
    public static kg1.a f35254xa4fa4055;

    /* renamed from: stepWaitForAppServiceAheadPreloadDone */
    public static kg1.a f35255x1312a2e6;

    /* renamed from: stepWaitForAppServicePreloadDone */
    public static kg1.a f35256x47f5196f;

    /* renamed from: stepWaitForCommLibConfirm */
    public static kg1.a f35257xf606c56f;

    /* renamed from: stepWaitForWebViewAheadPreloadDone */
    public static kg1.a f35258xdd302f1b;

    /* renamed from: stepWaitForWebViewPreloadDone */
    public static kg1.a f35259x1504001a;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f35206x83a96c12 = arrayList;
        arrayList.add(new kg1.n(f35205x24728b));
        kg1.h hVar = new kg1.h(f35205x24728b, "Launch", true, false, "", 2, 0, 12, "");
        f35232x93cecd9f = hVar;
        arrayList.add(hVar);
        kg1.h hVar2 = new kg1.h(f35205x24728b, "GetContact", true, false, "", 3, 12, 13, "");
        f35215xa47b33d6 = hVar2;
        arrayList.add(hVar2);
        kg1.h hVar3 = new kg1.h(f35205x24728b, "GetContact_DB", true, true, "读取contact信息", 1, 13, Integer.MIN_VALUE, "");
        f35217xdd36a187 = hVar3;
        arrayList.add(hVar3);
        kg1.h hVar4 = new kg1.h(f35205x24728b, "GetContact_CGI", false, true, "拉contact cgi", 1, 13, Integer.MIN_VALUE, "");
        f35216xc99d8c7c = hVar4;
        arrayList.add(hVar4);
        kg1.h hVar5 = new kg1.h(f35205x24728b, "CheckBan", true, false, "封禁逻辑", 1, 12, Integer.MIN_VALUE, "");
        f35207x8acd80d3 = hVar5;
        arrayList.add(hVar5);
        kg1.h hVar6 = new kg1.h(f35205x24728b, "ContainerUILaunch", true, true, "拉起容器UI界面", 1, 12, Integer.MIN_VALUE, "");
        f35209xa575417c = hVar6;
        arrayList.add(hVar6);
        kg1.h hVar7 = new kg1.h(f35205x24728b, "PrepareRuntime", true, false, "", 3, 12, 14, "");
        f35248x73a6f2bd = hVar7;
        arrayList.add(hVar7);
        kg1.h hVar8 = new kg1.h(f35205x24728b, "PrepareMainProcess", true, true, "准备主进程通讯", 1, 14, Integer.MIN_VALUE, "");
        f35239x193ba6db = hVar8;
        arrayList.add(hVar8);
        kg1.h hVar9 = new kg1.h(f35205x24728b, "InstallLibraries", true, true, "动态安装小程序环境所需二进制库", 1, 14, Integer.MIN_VALUE, "");
        f35231x151fe2a = hVar9;
        arrayList.add(hVar9);
        kg1.h hVar10 = new kg1.h(f35205x24728b, "PrepareWebView", true, true, "准备WebView (View)", 1, 14, Integer.MIN_VALUE, "");
        f35249x6021d2fe = hVar10;
        arrayList.add(hVar10);
        kg1.h hVar11 = new kg1.h(f35205x24728b, "PrepareResourceGroup", true, false, "Launch CGI及准备小程序包", 3, 14, 15, "");
        f35240x3a573e36 = hVar11;
        arrayList.add(hVar11);
        kg1.h hVar12 = new kg1.h(f35205x24728b, "PrepareResourceProcess", true, false, "资源准备逻辑过程", 1, 15, Integer.MIN_VALUE, "");
        f35241xdd905466 = hVar12;
        arrayList.add(hVar12);
        kg1.h hVar13 = new kg1.h(f35205x24728b, "PrepareResourceWaitForResult", true, false, "runtime监听过程结果", 1, 15, Integer.MIN_VALUE, "");
        f35247x9808c908 = hVar13;
        arrayList.add(hVar13);
        kg1.h hVar14 = new kg1.h(f35205x24728b, "PrepareResourceTimeout", true, true, "资源准备10s超时事件", 1, 15, Integer.MIN_VALUE, "");
        f35246xa1b28358 = hVar14;
        arrayList.add(hVar14);
        kg1.h hVar15 = new kg1.h(f35205x24728b, "PrepareResourceSubProcessLaunchWxaApp_DB", true, true, "使用本地缓存的launch数据打开", 1, 15, Integer.MIN_VALUE, "");
        f35245x76a4b8d1 = hVar15;
        arrayList.add(hVar15);
        kg1.h hVar16 = new kg1.h(f35205x24728b, "PrepareResourceSubProcessLaunchWxaApp_CGI", true, true, "同步请求launch数据打开", 1, 15, Integer.MIN_VALUE, "");
        f35244x5df25e72 = hVar16;
        arrayList.add(hVar16);
        kg1.h hVar17 = new kg1.h(f35205x24728b, "PrepareResourceSubProcessCodePkg_DB", true, true, "使用本地缓存好的代码包打开", 1, 15, Integer.MIN_VALUE, "");
        f35242x3377c4f6 = hVar17;
        arrayList.add(hVar17);
        kg1.h hVar18 = new kg1.h(f35205x24728b, "PrepareResourceSubProcessCodePkg_Download", true, true, "同步下载代码包打开", 1, 15, Integer.MIN_VALUE, "");
        f35243xb69baf20 = hVar18;
        arrayList.add(hVar18);
        kg1.h hVar19 = new kg1.h(f35205x24728b, "SetupConfigsPostResourcePrepared", true, false, "资源准备完的配置解析", 1, 14, Integer.MIN_VALUE, "");
        f35252xab9b446b = hVar19;
        arrayList.add(hVar19);
        kg1.h hVar20 = new kg1.h(f35205x24728b, "WaitForCommLibConfirm", true, true, "确定基础库版本", 1, 14, Integer.MIN_VALUE, "");
        f35257xf606c56f = hVar20;
        arrayList.add(hVar20);
        kg1.h hVar21 = new kg1.h(f35205x24728b, "WaitForWebViewPreloadDone", true, true, "等待启动前预加载webview完成 (View)", 1, 14, Integer.MIN_VALUE, "");
        f35259x1504001a = hVar21;
        arrayList.add(hVar21);
        kg1.h hVar22 = new kg1.h(f35205x24728b, "WaitForWebViewAheadPreloadDone", true, true, "等待运行时预加载webview完成 (View)", 1, 14, Integer.MIN_VALUE, "");
        f35258xdd302f1b = hVar22;
        arrayList.add(hVar22);
        kg1.h hVar23 = new kg1.h(f35205x24728b, "WaitForAppServicePreloadDone", true, true, "等待启动前预加载appservice完成 (Service)", 1, 14, Integer.MIN_VALUE, "");
        f35256x47f5196f = hVar23;
        arrayList.add(hVar23);
        kg1.h hVar24 = new kg1.h(f35205x24728b, "WaitForAppServiceAheadPreloadDone", true, true, "等待运行时预加载appservice完成 (Service)", 1, 14, Integer.MIN_VALUE, "");
        f35255x1312a2e6 = hVar24;
        arrayList.add(hVar24);
        kg1.h hVar25 = new kg1.h(f35205x24728b, "InitRuntimeGroup", true, false, "", 3, 12, 16, "mp");
        f35218x38d531a3 = hVar25;
        arrayList.add(hVar25);
        kg1.h hVar26 = new kg1.h(f35205x24728b, "ServiceInit", true, false, "", 2, 16, 17, "");
        f35250x1dede6f9 = hVar26;
        arrayList.add(hVar26);
        kg1.h hVar27 = new kg1.h(f35205x24728b, "InjectJSWAMainContext", true, true, "注入WAMainContext.js (Service)", 1, 17, Integer.MIN_VALUE, "");
        f35223x8dde28c6 = hVar27;
        arrayList.add(hVar27);
        kg1.h hVar28 = new kg1.h(f35205x24728b, "InjectJSWASubContext", true, true, "注入WASubContext.js (Service)", 1, 17, Integer.MIN_VALUE, "");
        f35224x60b9523f = hVar28;
        arrayList.add(hVar28);
        kg1.h hVar29 = new kg1.h(f35205x24728b, "InjectJSAppService", true, true, "注入appservice.js (Service)", 1, 17, Integer.MIN_VALUE, "");
        f35220x2d8e0b7a = hVar29;
        arrayList.add(hVar29);
        kg1.h hVar30 = new kg1.h(f35205x24728b, "InjectWxConfig", true, true, "注入wxConfig (Service)", 1, 17, Integer.MIN_VALUE, "");
        f35229x34dffc20 = hVar30;
        arrayList.add(hVar30);
        kg1.h hVar31 = new kg1.h(f35205x24728b, "PageInit", true, false, "", 2, 16, 18, "");
        f35233x62683b2b = hVar31;
        arrayList.add(hVar31);
        kg1.h hVar32 = new kg1.h(f35205x24728b, "PageInitUIGroup", true, false, "", 3, 18, 19, "");
        f35234x1e366c0 = hVar32;
        arrayList.add(hVar32);
        kg1.h hVar33 = new kg1.h(f35205x24728b, "CreatePageUI", true, false, "首页界面创建", 1, 19, Integer.MIN_VALUE, "");
        f35211xe0ec6e6b = hVar33;
        arrayList.add(hVar33);
        kg1.h hVar34 = new kg1.h(f35205x24728b, "CreateWebViewInstance", true, true, "", 1, 19, Integer.MIN_VALUE, "");
        f35213x5d07bfc6 = hVar34;
        arrayList.add(hVar34);
        kg1.h hVar35 = new kg1.h(f35205x24728b, "InjectWAPageFrameHtml", true, true, "注入WAPageframe.html (View)", 1, 18, Integer.MIN_VALUE, "");
        f35228x2691f522 = hVar35;
        arrayList.add(hVar35);
        kg1.h hVar36 = new kg1.h(f35205x24728b, "InjectJSWAWebview", true, true, "注入WAWebview.js (View)", 1, 18, Integer.MIN_VALUE, "");
        f35225x6746d709 = hVar36;
        arrayList.add(hVar36);
        kg1.h hVar37 = new kg1.h(f35205x24728b, "InjectJSPageScript", true, false, "页面js注入 (View)", 1, 18, Integer.MIN_VALUE, "");
        f35222xbf925660 = hVar37;
        arrayList.add(hVar37);
        kg1.h hVar38 = new kg1.h(f35205x24728b, "GenerateFuncReadyRespond", false, false, "webview发出的GenerateFuncReady被appservice响应 (View)", 1, 18, Integer.MIN_VALUE, "");
        f35214x15f2f8d7 = hVar38;
        arrayList.add(hVar38);
        kg1.h hVar39 = new kg1.h(f35205x24728b, "VdSync", true, false, "第一次VdSync (View) ", 1, 18, Integer.MIN_VALUE, "");
        f35254xa4fa4055 = hVar39;
        arrayList.add(hVar39);
        kg1.h hVar40 = new kg1.h(f35205x24728b, "PageReady", true, false, "page ready (View)", 1, 18, Integer.MIN_VALUE, "");
        f35237xeb19c6e8 = hVar40;
        arrayList.add(hVar40);
        kg1.h hVar41 = new kg1.h(f35205x24728b, "InitRuntimeGroup_Game", true, false, "", 3, 12, 20, "game");
        f35219xbd43d52e = hVar41;
        arrayList.add(hVar41);
        kg1.h hVar42 = new kg1.h(f35205x24728b, "ServiceInit_Game", true, false, "", 2, 20, 21, "");
        f35251xb7150598 = hVar42;
        arrayList.add(hVar42);
        kg1.h hVar43 = new kg1.h(f35205x24728b, "InjectWAGameContext", true, true, "注入 WAGame.js (Service)", 1, 21, Integer.MIN_VALUE, "");
        f35226xc85567d6 = hVar43;
        arrayList.add(hVar43);
        kg1.h hVar44 = new kg1.h(f35205x24728b, "InjectWAGameSubContext", true, true, "注入 WAGameSubContext.js (Service) ", 1, 21, Integer.MIN_VALUE, "");
        f35227xdad5cfc8 = hVar44;
        arrayList.add(hVar44);
        kg1.h hVar45 = new kg1.h(f35205x24728b, "InjectJSGame", true, true, "注入game.js (Service)", 1, 21, Integer.MIN_VALUE, "");
        f35221xfa7cfe98 = hVar45;
        arrayList.add(hVar45);
        kg1.h hVar46 = new kg1.h(f35205x24728b, "InjectWxConfig_Game", true, true, "注入wxConfig (Service)", 1, 21, Integer.MIN_VALUE, "");
        f35230x3fb510d1 = hVar46;
        arrayList.add(hVar46);
        kg1.h hVar47 = new kg1.h(f35205x24728b, "PageInit_Game", true, false, "", 2, 20, 22, "");
        f35236xdb4180a6 = hVar47;
        arrayList.add(hVar47);
        kg1.h hVar48 = new kg1.h(f35205x24728b, "PageInitUIGroup_Game", true, false, "", 3, 22, 23, "");
        f35235xf4b4a31 = hVar48;
        arrayList.add(hVar48);
        kg1.h hVar49 = new kg1.h(f35205x24728b, "CreatePageUI_Game", true, false, "首页界面创建", 1, 23, Integer.MIN_VALUE, "");
        f35212x439b5566 = hVar49;
        arrayList.add(hVar49);
        kg1.h hVar50 = new kg1.h(f35205x24728b, "CreateMagicBrushView", true, true, "", 1, 23, Integer.MIN_VALUE, "");
        f35210xcaf602da = hVar50;
        arrayList.add(hVar50);
        kg1.h hVar51 = new kg1.h(f35205x24728b, "SurfaceAvailable", true, false, "SurfaceAvailable (View)", 1, 22, Integer.MIN_VALUE, "");
        f35253x12bfe388 = hVar51;
        arrayList.add(hVar51);
        kg1.h hVar52 = new kg1.h(f35205x24728b, "PageReady_Game", true, false, "page ready (View)", 1, 22, Integer.MIN_VALUE, "");
        f35238x8d52c309 = hVar52;
        arrayList.add(hVar52);
        kg1.h hVar53 = new kg1.h(f35205x24728b, "ColdLaunchFailed", true, true, "", 1, 12, Integer.MIN_VALUE, "");
        f35208xbfcbd1c0 = hVar53;
        arrayList.add(hVar53);
        arrayList.add(new kg1.i(f35205x24728b));
    }
}
