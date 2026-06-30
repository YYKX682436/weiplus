package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.FlutterAssetManager */
/* loaded from: classes16.dex */
abstract class AbstractC28791x20198b9 {

    /* renamed from: assetManager */
    final android.content.res.AssetManager f72001xb0138e9d;

    /* renamed from: io.flutter.plugins.webviewflutter.FlutterAssetManager$PluginBindingFlutterAssetManager */
    /* loaded from: classes16.dex */
    public static class PluginBindingFlutterAssetManager extends io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.AbstractC28791x20198b9 {

        /* renamed from: flutterAssets */
        final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterAssets f72002x33c812bf;

        public PluginBindingFlutterAssetManager(android.content.res.AssetManager assetManager, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterAssets flutterAssets) {
            super(assetManager);
            this.f72002x33c812bf = flutterAssets;
        }

        @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.AbstractC28791x20198b9
        /* renamed from: getAssetFilePathByName */
        public java.lang.String mo138963xa4fdae7d(java.lang.String str) {
            return this.f72002x33c812bf.mo137498xa4fdae7d(str);
        }
    }

    public AbstractC28791x20198b9(android.content.res.AssetManager assetManager) {
        this.f72001xb0138e9d = assetManager;
    }

    /* renamed from: getAssetFilePathByName */
    public abstract java.lang.String mo138963xa4fdae7d(java.lang.String str);

    /* renamed from: list */
    public java.lang.String[] m138964x32b09e(java.lang.String str) {
        return this.f72001xb0138e9d.list(str);
    }
}
