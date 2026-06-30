package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff;

/* renamed from: io.flutter.embedding.engine.systemchannels.AccessibilityChannel */
/* loaded from: classes15.dex */
public class C28652xd6ce13f5 {
    private static final java.lang.String TAG = "AccessibilityChannel";

    /* renamed from: channel */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa<java.lang.Object> f71282x2c0b7d03;

    /* renamed from: flutterJNI */
    public final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 f71283x2014a1e9;

    /* renamed from: handler */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5.AccessibilityMessageHandler f71284x294b574a;

    /* renamed from: parsingMessageHandler */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler<java.lang.Object> f71285x74eed813;

    /* renamed from: io.flutter.embedding.engine.systemchannels.AccessibilityChannel$AccessibilityMessageHandler */
    /* loaded from: classes15.dex */
    public interface AccessibilityMessageHandler extends io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.AccessibilityDelegate {
        @java.lang.Deprecated(since = "Android API level 36")
        /* renamed from: announce */
        void mo138148xd9479469(java.lang.String str);

        /* renamed from: onFocus */
        void mo138149xaf972a39(int i17);

        /* renamed from: onLongPress */
        void mo138150x4f8d808(int i17);

        /* renamed from: onTap */
        void mo138151x64f7944(int i17);

        /* renamed from: onTooltip */
        void mo138152xbb1d124(java.lang.String str);
    }

    public C28652xd6ce13f5(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 c28604xeb2eb192, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler<java.lang.Object> messageHandler = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler<java.lang.Object>() { // from class: io.flutter.embedding.engine.systemchannels.AccessibilityChannel.1
            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
            /* renamed from: onMessage */
            public void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                if (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5.this.f71284x294b574a == null) {
                    reply.mo84787x67612ea(null);
                    return;
                }
                java.util.HashMap hashMap = (java.util.HashMap) obj;
                java.lang.String str = (java.lang.String) hashMap.get("type");
                java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                io.p3284xd2ae381c.Log.v(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5.TAG, "Received " + str + " message.");
                str.getClass();
                char c17 = 65535;
                switch (str.hashCode()) {
                    case -1140076541:
                        if (str.equals("tooltip")) {
                            c17 = 0;
                            break;
                        }
                        break;
                    case -649620375:
                        if (str.equals("announce")) {
                            c17 = 1;
                            break;
                        }
                        break;
                    case 114595:
                        if (str.equals("tap")) {
                            c17 = 2;
                            break;
                        }
                        break;
                    case 97604824:
                        if (str.equals("focus")) {
                            c17 = 3;
                            break;
                        }
                        break;
                    case 114203431:
                        if (str.equals("longPress")) {
                            c17 = 4;
                            break;
                        }
                        break;
                }
                switch (c17) {
                    case 0:
                        java.lang.String str2 = (java.lang.String) hashMap2.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
                        if (str2 != null) {
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5.this.f71284x294b574a.mo138152xbb1d124(str2);
                            break;
                        }
                        break;
                    case 1:
                        java.lang.String str3 = (java.lang.String) hashMap2.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
                        if (str3 != null) {
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5.this.f71284x294b574a.mo138148xd9479469(str3);
                            break;
                        }
                        break;
                    case 2:
                        java.lang.Integer num = (java.lang.Integer) hashMap.get("nodeId");
                        if (num != null) {
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5.this.f71284x294b574a.mo138151x64f7944(num.intValue());
                            break;
                        }
                        break;
                    case 3:
                        java.lang.Integer num2 = (java.lang.Integer) hashMap.get("nodeId");
                        if (num2 != null) {
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5.this.f71284x294b574a.mo138149xaf972a39(num2.intValue());
                            break;
                        }
                        break;
                    case 4:
                        java.lang.Integer num3 = (java.lang.Integer) hashMap.get("nodeId");
                        if (num3 != null) {
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5.this.f71284x294b574a.mo138150x4f8d808(num3.intValue());
                            break;
                        }
                        break;
                }
                reply.mo84787x67612ea(null);
            }
        };
        this.f71285x74eed813 = messageHandler;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa<java.lang.Object> c28677x2598ceaa = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa<>(c28604xeb2eb192, "flutter/accessibility", io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc.f71627x4fbc8495);
        this.f71282x2c0b7d03 = c28677x2598ceaa;
        c28677x2598ceaa.m138404x12ef5e45(messageHandler);
        this.f71283x2014a1e9 = c28586x96e67e09;
    }

    /* renamed from: dispatchSemanticsAction */
    public void m138142x92ca6029(int i17, io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action action) {
        this.f71283x2014a1e9.m137671x92ca6029(i17, action);
    }

    /* renamed from: onAndroidAccessibilityDisabled */
    public void m138144x6479a43a() {
        this.f71283x2014a1e9.m137750x9afc8f96(false);
    }

    /* renamed from: onAndroidAccessibilityEnabled */
    public void m138145x26e8f1c3() {
        this.f71283x2014a1e9.m137750x9afc8f96(true);
    }

    /* renamed from: setAccessibilityFeatures */
    public void m138146xb1a6069(int i17) {
        this.f71283x2014a1e9.m137734xb1a6069(i17);
    }

    /* renamed from: setAccessibilityMessageHandler */
    public void m138147x4f53d46f(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5.AccessibilityMessageHandler accessibilityMessageHandler) {
        this.f71284x294b574a = accessibilityMessageHandler;
        this.f71283x2014a1e9.m137733x4d4359b1(accessibilityMessageHandler);
    }

    /* renamed from: dispatchSemanticsAction */
    public void m138143x92ca6029(int i17, io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657.Action action, java.lang.Object obj) {
        this.f71283x2014a1e9.m137672x92ca6029(i17, action, obj);
    }

    public C28652xd6ce13f5(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa<java.lang.Object> c28677x2598ceaa, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09) {
        this.f71285x74eed813 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler<java.lang.Object>() { // from class: io.flutter.embedding.engine.systemchannels.AccessibilityChannel.1
            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
            /* renamed from: onMessage */
            public void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                if (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5.this.f71284x294b574a == null) {
                    reply.mo84787x67612ea(null);
                    return;
                }
                java.util.HashMap hashMap = (java.util.HashMap) obj;
                java.lang.String str = (java.lang.String) hashMap.get("type");
                java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                io.p3284xd2ae381c.Log.v(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5.TAG, "Received " + str + " message.");
                str.getClass();
                char c17 = 65535;
                switch (str.hashCode()) {
                    case -1140076541:
                        if (str.equals("tooltip")) {
                            c17 = 0;
                            break;
                        }
                        break;
                    case -649620375:
                        if (str.equals("announce")) {
                            c17 = 1;
                            break;
                        }
                        break;
                    case 114595:
                        if (str.equals("tap")) {
                            c17 = 2;
                            break;
                        }
                        break;
                    case 97604824:
                        if (str.equals("focus")) {
                            c17 = 3;
                            break;
                        }
                        break;
                    case 114203431:
                        if (str.equals("longPress")) {
                            c17 = 4;
                            break;
                        }
                        break;
                }
                switch (c17) {
                    case 0:
                        java.lang.String str2 = (java.lang.String) hashMap2.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
                        if (str2 != null) {
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5.this.f71284x294b574a.mo138152xbb1d124(str2);
                            break;
                        }
                        break;
                    case 1:
                        java.lang.String str3 = (java.lang.String) hashMap2.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
                        if (str3 != null) {
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5.this.f71284x294b574a.mo138148xd9479469(str3);
                            break;
                        }
                        break;
                    case 2:
                        java.lang.Integer num = (java.lang.Integer) hashMap.get("nodeId");
                        if (num != null) {
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5.this.f71284x294b574a.mo138151x64f7944(num.intValue());
                            break;
                        }
                        break;
                    case 3:
                        java.lang.Integer num2 = (java.lang.Integer) hashMap.get("nodeId");
                        if (num2 != null) {
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5.this.f71284x294b574a.mo138149xaf972a39(num2.intValue());
                            break;
                        }
                        break;
                    case 4:
                        java.lang.Integer num3 = (java.lang.Integer) hashMap.get("nodeId");
                        if (num3 != null) {
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5.this.f71284x294b574a.mo138150x4f8d808(num3.intValue());
                            break;
                        }
                        break;
                }
                reply.mo84787x67612ea(null);
            }
        };
        this.f71282x2c0b7d03 = c28677x2598ceaa;
        this.f71283x2014a1e9 = c28586x96e67e09;
    }
}
