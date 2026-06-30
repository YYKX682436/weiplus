package com.p314xaae8f345.p342x5fa53e3;

/* renamed from: com.tencent.ilink.IlinkLogManager */
/* loaded from: classes15.dex */
public class C2958x76e037ec extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: instance */
    private static com.p314xaae8f345.p342x5fa53e3.C2958x76e037ec f10149x21169495 = new com.p314xaae8f345.p342x5fa53e3.C2958x76e037ec();

    /* renamed from: jniCaller */
    com.p314xaae8f345.p342x5fa53e3.C2966x9c3688ed f10150x3163df90 = new com.p314xaae8f345.p342x5fa53e3.C2966x9c3688ed();

    /* renamed from: com.tencent.ilink.IlinkLogManager$FilterLogEvent */
    /* loaded from: classes15.dex */
    public interface FilterLogEvent {
        /* renamed from: event */
        void m22130x5c6729a(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, long j17, long j18, long j19);
    }

    /* renamed from: com.tencent.ilink.IlinkLogManager$WriteLogEvent */
    /* loaded from: classes15.dex */
    public interface WriteLogEvent {
        /* renamed from: event */
        void m22131x5c6729a(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, long j17, long j18, long j19);
    }

    private C2958x76e037ec() {
        this.f60636x11bb50fe = "ilink.IlinkLogManager@Get";
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27694xfbd655d7.m119551x9cf0d20b().m119552xeb57c8f5("ilink2", "ilink2");
        this.f10150x3163df90.m22329x9c3688e5(this, this.f60636x11bb50fe, this.f60638xc2e4ffd6);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p342x5fa53e3.C2958x76e037ec m22119xa74f78c3(java.lang.String str, java.lang.String str2, long j17) {
        return m22120x9cf0d20b();
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p342x5fa53e3.C2958x76e037ec m22120x9cf0d20b() {
        return f10149x21169495;
    }

    /* renamed from: close */
    public void m22121x5a5ddf8() {
        this.f10150x3163df90.m22333x9db8edfd(this.f60634xf042a733);
    }

    /* renamed from: flush */
    public void m22122x5d03b04() {
        this.f10150x3163df90.m22332x9db8edfc(this.f60634xf042a733);
    }

    /* renamed from: init */
    public void m22123x316510(com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723 c3015x1492d723) {
        this.f10150x3163df90.m22328x9db8edf9(this.f60634xf042a733, c3015x1492d723.m75963xebb06ba0());
    }

    /* renamed from: open */
    public void m22124x34264a(java.lang.String str, byte[] bArr) {
        this.f10150x3163df90.m22330x9db8edfa(this.f60634xf042a733, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), bArr);
    }

    /* renamed from: subscribeFilterLogEvent */
    public void m22125xd3722138(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2958x76e037ec.FilterLogEvent filterLogEvent) {
        this.f10150x3163df90.m22334xd3722138(str, filterLogEvent);
    }

    /* renamed from: subscribeWriteLogEvent */
    public void m22126x6f06718b(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2958x76e037ec.WriteLogEvent writeLogEvent) {
        this.f10150x3163df90.m22335x6f06718b(str, writeLogEvent);
    }

    /* renamed from: unsubscribeFilterLogEvent */
    public void m22127x8630b67f(java.lang.String str) {
        this.f10150x3163df90.m22336x8630b67f(str);
    }

    /* renamed from: unsubscribeWriteLogEvent */
    public void m22128x7d0c9764(java.lang.String str) {
        this.f10150x3163df90.m22337x7d0c9764(str);
    }

    /* renamed from: write */
    public void m22129x6c257df(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, long j17, long j18, long j19) {
        this.f10150x3163df90.m22331x9db8edfb(this.f60634xf042a733, i17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), str3.getBytes(java.nio.charset.StandardCharsets.UTF_8), i18, str4.getBytes(java.nio.charset.StandardCharsets.UTF_8), j17, j18, j19);
    }
}
