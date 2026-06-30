package com.p314xaae8f345.p414x32b0ec;

/* renamed from: com.tencent.live.TXLivePluginManager */
/* loaded from: classes15.dex */
public class C3857x32bdb54a implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: CHANNEL_NAME */
    private static final java.lang.String f15160x87093867 = "live_cloud_manager_channel";
    private static final java.lang.String TAG = "TXLivePluginManager";

    /* renamed from: sProcesserFactory */
    private static com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.InterfaceC3861x752c2a8 f15161x75a93ca1;

    /* renamed from: mChannel */
    private io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f15162xca242fd6;

    /* renamed from: mContext */
    private android.content.Context f15163xd6cfe882;

    /* renamed from: mFlutterAssets */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterAssets f15164x8ed61b52;

    /* renamed from: mMessager */
    private io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f15165x972a8d8;

    /* renamed from: mTXLivePremierPlugin */
    private com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3864x2699eaf3 f15168x4d83d982;

    /* renamed from: mTextureRegistry */
    private io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 f15169x1c754e4b;

    /* renamed from: mViewFactory */
    private com.p314xaae8f345.p414x32b0ec.p419x373aa5.C3872xa0192a67 f15170x68664bf8;

    /* renamed from: mPusherMap */
    private java.util.Map<java.lang.String, com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3865xc3fe4ca6> f15167x4d3a40a8 = new java.util.HashMap();

    /* renamed from: mPlayerMap */
    private java.util.Map<java.lang.String, com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3863x33556ec0> f15166xb21e4ce = new java.util.HashMap();

    /* renamed from: com.tencent.live.TXLivePluginManager$MethodName */
    /* loaded from: classes15.dex */
    public interface MethodName {

        /* renamed from: CREATE_NATIVE_PLAYER */
        public static final java.lang.String f15171x24a2ce06 = "createNativePlayer";

        /* renamed from: CREATE_NATIVE_PUSHER */
        public static final java.lang.String f15172x2529906c = "createNativePusher";

        /* renamed from: DESTROY_NATIVE_PLAYER */
        public static final java.lang.String f15173x97510864 = "destroyNativePlayer";

        /* renamed from: DESTROY_NATIVE_PUSHER */
        public static final java.lang.String f15174x97d7caca = "destroyNativePusher";
    }

    public C3857x32bdb54a(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(flutterPluginBinding.m137983x3b5b91dc(), f15160x87093867);
        this.f15162xca242fd6 = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(this);
        this.f15165x972a8d8 = flutterPluginBinding.m137983x3b5b91dc();
        this.f15163xd6cfe882 = flutterPluginBinding.m137982x6e669035();
        this.f15164x8ed61b52 = flutterPluginBinding.m137985xf127cf09();
        this.f15170x68664bf8 = new com.p314xaae8f345.p414x32b0ec.p419x373aa5.C3872xa0192a67(this.f15163xd6cfe882, this.f15165x972a8d8);
        this.f15168x4d83d982 = new com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3864x2699eaf3(this.f15165x972a8d8, this.f15163xd6cfe882);
        this.f15169x1c754e4b = flutterPluginBinding.m137988x3128f042();
        flutterPluginBinding.m137987x9883be8b().mo138696x7b3a4002(com.p314xaae8f345.p414x32b0ec.p419x373aa5.C3872xa0192a67.f15268x26d5bd, this.f15170x68664bf8);
    }

    /* renamed from: createV2TXLivePlayerPlugin */
    private com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3863x33556ec0 m31623x3e3cb9bc(java.lang.String str) {
        com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3863x33556ec0 c3863x33556ec0 = this.f15166xb21e4ce.get(str);
        if (c3863x33556ec0 == null) {
            com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3863x33556ec0 c3863x33556ec02 = new com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3863x33556ec0(str, this.f15165x972a8d8, this.f15163xd6cfe882, this.f15170x68664bf8, this.f15169x1c754e4b);
            this.f15166xb21e4ce.put(str, c3863x33556ec02);
            return c3863x33556ec02;
        }
        com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31840x6f02d9a1(4, "TXLivePluginManager, The Player has been created before， id:" + str);
        return c3863x33556ec0;
    }

    /* renamed from: createV2TXLivePusherPlugin */
    private com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3865xc3fe4ca6 m31624xcee597a2(java.lang.String str, int i17) {
        com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3865xc3fe4ca6 c3865xc3fe4ca6 = this.f15167x4d3a40a8.get(str);
        if (c3865xc3fe4ca6 == null) {
            com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3865xc3fe4ca6 c3865xc3fe4ca62 = new com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3865xc3fe4ca6(str, i17, this.f15165x972a8d8, this.f15163xd6cfe882, this.f15164x8ed61b52, this.f15170x68664bf8);
            this.f15167x4d3a40a8.put(str, c3865xc3fe4ca62);
            return c3865xc3fe4ca62;
        }
        com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31840x6f02d9a1(4, "TXLivePluginManager, createV2TXLivePusherPlugin -> id:" + str);
        return c3865xc3fe4ca6;
    }

    /* renamed from: destroyNativePlayer */
    private void m31625x98b5f6f2(java.lang.String str) {
        com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3863x33556ec0 c3863x33556ec0 = this.f15166xb21e4ce.get(str);
        if (c3863x33556ec0 != null) {
            c3863x33556ec0.m31650x5cd39ffa();
            this.f15166xb21e4ce.remove(str);
        }
    }

    /* renamed from: destroyNativePusher */
    private void m31626x993cb958(java.lang.String str) {
        com.p314xaae8f345.p414x32b0ec.p417xc5476f33.C3865xc3fe4ca6 c3865xc3fe4ca6 = this.f15167x4d3a40a8.get(str);
        if (c3865xc3fe4ca6 != null) {
            c3865xc3fe4ca6.m31710x5cd39ffa();
            this.f15167x4d3a40a8.remove(str);
        }
    }

    /* renamed from: getBeautyProcesserFactory */
    public static com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.InterfaceC3861x752c2a8 m31627x104891a0() {
        return f15161x75a93ca1;
    }

    /* renamed from: getV2LiveRenderViewFactory */
    private com.p314xaae8f345.p414x32b0ec.p419x373aa5.C3872xa0192a67 m31628xb64cba51() {
        return this.f15170x68664bf8;
    }

    /* renamed from: register */
    public static void m31629xd6dc2ea3(com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.InterfaceC3861x752c2a8 interfaceC3861x752c2a8) {
        f15161x75a93ca1 = interfaceC3861x752c2a8;
    }

    /* renamed from: destroy */
    public void m31630x5cd39ffa() {
        this.f15162xca242fd6.m138441xdf757329(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r2.equals(com.p314xaae8f345.p414x32b0ec.C3857x32bdb54a.MethodName.f15171x24a2ce06) == false) goto L8;
     */
    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff r9, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result r10) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TXLivePluginManager, TXLivePluginManager onMethodCall -> method:"
            r0.<init>(r1)
            java.lang.String r1 = r9.f71610xbfc5d0e1
            r0.append(r1)
            java.lang.String r1 = ", arguments:"
            r0.append(r1)
            java.lang.Object r1 = r9.f71609x86ac7956
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 2
            com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31840x6f02d9a1(r1, r0)
            java.lang.String r0 = "identifier"
            java.lang.Object r0 = com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(r9, r10, r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 4
            if (r2 == 0) goto L3c
            java.lang.String r9 = "TXLivePluginManager, Can not find param by key: identifier"
            com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31840x6f02d9a1(r3, r9)
            java.lang.String r9 = "Error"
            java.lang.String r0 = "Can not find param by key: identifier"
            java.lang.String r1 = "-1001"
            r10.mo65718x5c4d208(r1, r9, r0)
            return
        L3c:
            java.lang.String r2 = r9.f71610xbfc5d0e1
            r2.getClass()
            int r4 = r2.hashCode()
            r5 = 1
            r6 = 0
            r7 = -1
            switch(r4) {
                case -1732905230: goto L6c;
                case -1724073640: goto L61;
                case 5539060: goto L58;
                case 14370650: goto L4d;
                default: goto L4b;
            }
        L4b:
            r1 = r7
            goto L76
        L4d:
            java.lang.String r1 = "createNativePusher"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L56
            goto L4b
        L56:
            r1 = 3
            goto L76
        L58:
            java.lang.String r4 = "createNativePlayer"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L76
            goto L4b
        L61:
            java.lang.String r1 = "destroyNativePusher"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L6a
            goto L4b
        L6a:
            r1 = r5
            goto L76
        L6c:
            java.lang.String r1 = "destroyNativePlayer"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L75
            goto L4b
        L75:
            r1 = r6
        L76:
            switch(r1) {
                case 0: goto Lae;
                case 1: goto Laa;
                case 2: goto La6;
                case 3: goto L96;
                default: goto L79;
            }
        L79:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TXLivePluginManager, Method:"
            r0.<init>(r1)
            java.lang.String r9 = r9.f71610xbfc5d0e1
            r0.append(r9)
            java.lang.String r9 = "is not defined"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31840x6f02d9a1(r3, r9)
            r10.mo65719xbc9fa82f()
            r5 = r6
            goto Lb1
        L96:
            java.lang.String r1 = "mode"
            java.lang.Object r9 = com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3869x2b9c5c30.m31842x95865c3d(r9, r10, r1)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r8.m31624xcee597a2(r0, r9)
            goto Lb1
        La6:
            r8.m31623x3e3cb9bc(r0)
            goto Lb1
        Laa:
            r8.m31626x993cb958(r0)
            goto Lb1
        Lae:
            r8.m31625x98b5f6f2(r0)
        Lb1:
            if (r5 == 0) goto Lba
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r10.mo65720x90b54003(r9)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p414x32b0ec.C3857x32bdb54a.mo294x9bfdc61e(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }
}
