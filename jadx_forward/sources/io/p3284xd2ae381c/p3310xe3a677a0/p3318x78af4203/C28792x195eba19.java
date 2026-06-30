package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.FlutterAssetManagerHostApiImpl */
/* loaded from: classes16.dex */
public class C28792x195eba19 implements io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.FlutterAssetManagerHostApi {

    /* renamed from: flutterAssetManager */
    final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.AbstractC28791x20198b9 f72003xb74dd0d9;

    public C28792x195eba19(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.AbstractC28791x20198b9 abstractC28791x20198b9) {
        this.f72003xb74dd0d9 = abstractC28791x20198b9;
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.FlutterAssetManagerHostApi
    /* renamed from: getAssetFilePathByName */
    public java.lang.String mo138965xa4fdae7d(java.lang.String str) {
        return this.f72003xb74dd0d9.mo138963xa4fdae7d(str);
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.FlutterAssetManagerHostApi
    /* renamed from: list */
    public java.util.List<java.lang.String> mo138966x32b09e(java.lang.String str) {
        try {
            java.lang.String[] m138964x32b09e = this.f72003xb74dd0d9.m138964x32b09e(str);
            return m138964x32b09e == null ? new java.util.ArrayList() : java.util.Arrays.asList(m138964x32b09e);
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException(e17.getMessage());
        }
    }
}
