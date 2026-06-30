package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes13.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f96124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f96125e;

    public w1(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var, byte[] bArr) {
        this.f96125e = p0Var;
        this.f96124d = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = this.f96125e.T1.entrySet().iterator();
        while (it.hasNext()) {
            try {
                ((com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c0) ((java.util.Map.Entry) it.next()).getValue()).b(this.f96124d, java.lang.System.nanoTime() / 1000);
            } catch (java.lang.IllegalStateException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceService", "Failed to encode audio %s", e17);
            }
        }
    }
}
