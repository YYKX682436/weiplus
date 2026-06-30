package com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7;

/* renamed from: com.tencent.thumbplayer.caputure.TPSystemCapture */
/* loaded from: classes16.dex */
public class C26256xdacbf8fb implements com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26138x49ec1301, com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d.CaptureMediaImageListener {

    /* renamed from: mAssetFileDescriptor */
    private android.content.res.AssetFileDescriptor f51384xf5c0db6e;

    /* renamed from: mCallBackMap */
    private java.util.Map<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26170x325bffaf> f51385x7cb6140a = new java.util.HashMap();

    /* renamed from: mFileDescriptor */
    private java.io.FileDescriptor f51386x203203d8;

    /* renamed from: mUrl */
    private java.lang.String f51387x32d9c2;

    public C26256xdacbf8fb(java.lang.String str) {
        this.f51387x32d9c2 = str;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26138x49ec1301
    /* renamed from: generateImageAsyncAtTime */
    public void mo100553xbf439a76(long j17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.C26396x622fcbfa c26396x622fcbfa, com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26170x325bffaf interfaceC26170x325bffaf) {
        com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d.TPSysImageCaptureParams tPSysImageCaptureParams = new com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d.TPSysImageCaptureParams();
        tPSysImageCaptureParams.url = this.f51387x32d9c2;
        tPSysImageCaptureParams.f51380x197efa0b = this.f51386x203203d8;
        tPSysImageCaptureParams.f51379xb24cd1b = this.f51384xf5c0db6e;
        tPSysImageCaptureParams.f51382x5250fcaf = j17;
        tPSysImageCaptureParams.f51383x6be2dc6 = c26396x622fcbfa.f53132x6be2dc6;
        tPSysImageCaptureParams.f51381xb7389127 = c26396x622fcbfa.f53129xb7389127;
        this.f51385x7cb6140a.put(java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d.m101545x51237b76().m101550xffe58264(tPSysImageCaptureParams, this)), interfaceC26170x325bffaf);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d.CaptureMediaImageListener
    /* renamed from: onCaptureFailed */
    public void mo101551x90bd1f84(int i17, int i18) {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26170x325bffaf interfaceC26170x325bffaf = this.f51385x7cb6140a.get(java.lang.Integer.valueOf(i17));
        if (interfaceC26170x325bffaf != null) {
            interfaceC26170x325bffaf.m101026x3c4b75b1(i18);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d.CaptureMediaImageListener
    /* renamed from: onCaptureSucceed */
    public void mo101552x58601bdb(int i17, long j17, int i18, int i19, android.graphics.Bitmap bitmap, long j18) {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26170x325bffaf interfaceC26170x325bffaf = this.f51385x7cb6140a.get(java.lang.Integer.valueOf(i17));
        if (interfaceC26170x325bffaf != null) {
            interfaceC26170x325bffaf.m101027x1e9c8d0f(bitmap);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26138x49ec1301
    /* renamed from: release */
    public void mo100554x41012807() {
        this.f51385x7cb6140a.clear();
    }

    public C26256xdacbf8fb(java.io.FileDescriptor fileDescriptor) {
        this.f51386x203203d8 = fileDescriptor;
    }

    public C26256xdacbf8fb(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        this.f51384xf5c0db6e = assetFileDescriptor;
    }
}
