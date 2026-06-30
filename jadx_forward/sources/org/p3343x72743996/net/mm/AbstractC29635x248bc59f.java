package org.p3343x72743996.net.mm;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "weapp_core")
/* renamed from: org.chromium.net.mm.CronetJsBinding */
/* loaded from: classes7.dex */
public abstract class AbstractC29635x248bc59f {

    /* renamed from: org.chromium.net.mm.CronetJsBinding$Natives */
    /* loaded from: classes7.dex */
    public interface Natives {
        /* renamed from: cancelAllRequests */
        void mo154279x4dfb95ab(long j17);

        /* renamed from: destroy */
        void mo154280x5cd39ffa(long j17);

        /* renamed from: initCronetJsBinding */
        long mo154281x41e19e8f(org.p3343x72743996.net.mm.AbstractC29635x248bc59f abstractC29635x248bc59f, long j17, long j18, long j19);

        /* renamed from: setupConfig */
        void mo154282x8a00181f(long j17, java.lang.String str, java.lang.String str2, long j18, long j19, long j27, long j28, java.lang.String str3, boolean z17);

        /* renamed from: setupMemoryPressureListener */
        void mo154283xc6d54417();
    }

    /* renamed from: setupMemoryPressureListener */
    public static void m154274xc6d54417() {
        org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.m152651x286f5ca3();
        org.p3343x72743996.net.mm.C29636xe56b8586.get().mo154283xc6d54417();
    }

    /* renamed from: cancelAllRequests */
    public void m154275x4dfb95ab(long j17) {
        org.p3343x72743996.net.mm.C29636xe56b8586.get().mo154279x4dfb95ab(j17);
    }

    /* renamed from: checkMatchIP */
    public abstract boolean mo32140x2e80ff84(java.lang.String str);

    /* renamed from: destroy */
    public void m154276x5cd39ffa(long j17) {
        org.p3343x72743996.net.mm.C29636xe56b8586.get().mo154280x5cd39ffa(j17);
    }

    /* renamed from: getAbsolutePathFromJSTempFile */
    public abstract org.p3343x72743996.net.mm.C29637x7f45871a mo32141x771c5455(java.lang.String str);

    /* renamed from: getDownloadDomains */
    public abstract java.lang.String[] mo32142x69753c51();

    /* renamed from: getDownloadMaxFileSize */
    public abstract int mo32143x3f1c2843();

    /* renamed from: getReferer */
    public abstract java.lang.String mo32144x7e7a14f7();

    /* renamed from: getRequestDomains */
    public abstract java.lang.String[] mo32145xed7c0796();

    /* renamed from: getTempFileDir */
    public abstract java.lang.String mo32146x7659b9c7();

    /* renamed from: getUploadDomains */
    public abstract java.lang.String[] mo32147x6bf07738();

    /* renamed from: getUserVisibleDownloadMaxFileSize */
    public abstract int mo32148x529cac8();

    /* renamed from: initCronetJsBinding */
    public long m154277x41e19e8f(long j17, long j18, long j19) {
        return org.p3343x72743996.net.mm.C29636xe56b8586.get().mo154281x41e19e8f(this, j17, j18, j19);
    }

    /* renamed from: moveFileToJSFile */
    public abstract org.p3343x72743996.net.mm.C29637x7f45871a mo32149x7a3728ad(java.lang.String str, java.lang.String str2);

    /* renamed from: moveFileToJSTempDir */
    public abstract org.p3343x72743996.net.mm.C29637x7f45871a mo32150x36be7b48(java.lang.String str, java.lang.String str2);

    /* renamed from: onHeaderReceived */
    public abstract void mo32151x5957fb4d(java.lang.String str, java.lang.String str2, int i17);

    /* renamed from: onRequestCreated */
    public abstract void mo32152xfd799d18(java.lang.String str, int i17);

    /* renamed from: onRequestFinished */
    public abstract void mo32153x1d116842(java.lang.String str, int i17);

    /* renamed from: onUserVisibleTaskCanceled */
    public abstract void mo32154xad158c26(java.lang.String str, int i17);

    /* renamed from: onUserVisibleTaskFailed */
    public abstract void mo32155x66ca1b0a(java.lang.String str, int i17);

    /* renamed from: onUserVisibleTaskProgressUpdate */
    public abstract void mo32156xef333b23(java.lang.String str, int i17, int i18, long j17, long j18);

    /* renamed from: onUserVisibleTaskStart */
    public abstract void mo32157x1494aff5(java.lang.String str, int i17);

    /* renamed from: onUserVisibleTaskSucceeded */
    public abstract void mo32158x1192ac74(java.lang.String str, int i17);

    /* renamed from: setupConfig */
    public void m154278x8a00181f(long j17, java.lang.String str, java.lang.String str2, long j18, long j19, long j27, long j28, java.lang.String str3, boolean z17) {
        org.p3343x72743996.net.mm.C29636xe56b8586.get().mo154282x8a00181f(j17, str, str2, j18, j19, j27, j28, str3, z17);
    }

    /* renamed from: shouldCheckDomains */
    public abstract boolean mo32159xda85b35a();

    /* renamed from: shouldEnableWildcardDomainMatch */
    public boolean mo32160x62a6d431() {
        return false;
    }
}
