package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0;

/* renamed from: io.flutter.embedding.engine.plugins.FlutterPlugin */
/* loaded from: classes15.dex */
public interface InterfaceC28623x7c9e3e4f {

    /* renamed from: io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterAssets */
    /* loaded from: classes13.dex */
    public interface FlutterAssets {
        /* renamed from: getAssetFilePathByName */
        java.lang.String mo137498xa4fdae7d(java.lang.String str);

        /* renamed from: getAssetFilePathByName */
        java.lang.String mo137499xa4fdae7d(java.lang.String str, java.lang.String str2);

        /* renamed from: getAssetFilePathBySubpath */
        java.lang.String mo137500x573ff133(java.lang.String str);

        /* renamed from: getAssetFilePathBySubpath */
        java.lang.String mo137501x573ff133(java.lang.String str, java.lang.String str2);
    }

    /* renamed from: io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterPluginBinding */
    /* loaded from: classes15.dex */
    public static class FlutterPluginBinding {

        /* renamed from: applicationContext */
        private final android.content.Context f71160x5b0a2e3f;

        /* renamed from: binaryMessenger */
        private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f71161x56f9c012;

        /* renamed from: flutterAssets */
        private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterAssets f71162x33c812bf;

        /* renamed from: flutterEngine */
        private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e f71163x3a4f997e;

        /* renamed from: group */
        private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1 f71164x5e0f67f;

        /* renamed from: platformViewRegistry */
        private final io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28719xf67d3635 f71165xeab80215;

        /* renamed from: textureRegistry */
        private final io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 f71166x4cc71e78;

        public FlutterPluginBinding(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 interfaceC28980x1159d658, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28719xf67d3635 interfaceC28719xf67d3635, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterAssets flutterAssets, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1 c28584x3d6c67c1) {
            this.f71160x5b0a2e3f = context;
            this.f71163x3a4f997e = c28580x69eec95e;
            this.f71161x56f9c012 = interfaceC28679x1b8c77f2;
            this.f71166x4cc71e78 = interfaceC28980x1159d658;
            this.f71165xeab80215 = interfaceC28719xf67d3635;
            this.f71162x33c812bf = flutterAssets;
            this.f71164x5e0f67f = c28584x3d6c67c1;
        }

        /* renamed from: getApplicationContext */
        public android.content.Context m137982x6e669035() {
            return this.f71160x5b0a2e3f;
        }

        /* renamed from: getBinaryMessenger */
        public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc() {
            return this.f71161x56f9c012;
        }

        /* renamed from: getEngineGroup */
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1 m137984x3de86c27() {
            return this.f71164x5e0f67f;
        }

        /* renamed from: getFlutterAssets */
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterAssets m137985xf127cf09() {
            return this.f71162x33c812bf;
        }

        @java.lang.Deprecated
        /* renamed from: getFlutterEngine */
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137986xf7af55c8() {
            return this.f71163x3a4f997e;
        }

        /* renamed from: getPlatformViewRegistry */
        public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28719xf67d3635 m137987x9883be8b() {
            return this.f71165xeab80215;
        }

        /* renamed from: getTextureRegistry */
        public io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 m137988x3128f042() {
            return this.f71166x4cc71e78;
        }
    }

    /* renamed from: onAttachedToEngine */
    void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding);

    /* renamed from: onDetachedFromEngine */
    void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding);
}
