package com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d;

/* renamed from: com.tencent.tmassistantsdk.downloadservice.DownloadListenerManager */
/* loaded from: classes13.dex */
public class C26668x16cd9691 {

    /* renamed from: mDownloadListenerManager */
    protected static com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26668x16cd9691 f56120x63776b84;

    /* renamed from: mListeners */
    protected final java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.InterfaceC26674x9aeb9f50> f56121x32131c52 = new java.util.ArrayList<>();

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26668x16cd9691 m104911x9cf0d20b() {
        if (f56120x63776b84 == null) {
            f56120x63776b84 = new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26668x16cd9691();
        }
        return f56120x63776b84;
    }

    public synchronized void Add(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.InterfaceC26674x9aeb9f50 interfaceC26674x9aeb9f50) {
        if (!this.f56121x32131c52.contains(interfaceC26674x9aeb9f50)) {
            this.f56121x32131c52.add(interfaceC26674x9aeb9f50);
        }
    }

    /* renamed from: OnDownloadProgressChanged */
    public synchronized void m104912xdb72a920(java.lang.String str, long j17, long j18) {
        java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.InterfaceC26674x9aeb9f50> it = this.f56121x32131c52.iterator();
        while (it.hasNext()) {
            it.next().mo104948xdb72a920(str, j17, j18);
        }
    }

    /* renamed from: OnDownloadStateChanged */
    public synchronized void m104913xc9b7fa2a(java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17, boolean z18) {
        java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.InterfaceC26674x9aeb9f50> it = this.f56121x32131c52.iterator();
        while (it.hasNext()) {
            it.next().mo104949xc9b7fa2a(str, i17, i18, str2, z17, z18);
        }
    }

    /* renamed from: Remove */
    public synchronized void m104914x91afe4a4(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.InterfaceC26674x9aeb9f50 interfaceC26674x9aeb9f50) {
        this.f56121x32131c52.remove(interfaceC26674x9aeb9f50);
    }
}
