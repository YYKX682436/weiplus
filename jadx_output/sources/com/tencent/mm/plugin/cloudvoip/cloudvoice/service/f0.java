package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wxmm.IConfCallBack f95898a = null;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j f95900c = null;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f95899b = new android.util.SparseArray(5);

    public com.tencent.wxmm.IConfCallBack a(boolean z17) {
        com.tencent.wxmm.IConfCallBack iConfCallBack;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceNativeCallbackMgr", "hy: trigger validate callback %b", java.lang.Boolean.valueOf(z17));
        synchronized (this) {
            if (z17) {
                this.f95898a = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d0(this);
            } else {
                this.f95898a = null;
            }
            this.f95899b.clear();
            iConfCallBack = this.f95898a;
        }
        return iConfCallBack;
    }

    public void b(int i17, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0 e0Var) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceNativeCallbackMgr", "hy: registering event id: %d", java.lang.Integer.valueOf(i17));
        synchronized (this) {
            java.util.HashSet hashSet = (java.util.HashSet) this.f95899b.get(i17);
            if (hashSet == null) {
                z17 = true;
                hashSet = new java.util.HashSet(1);
            } else {
                z17 = false;
            }
            hashSet.add(e0Var);
            if (z17) {
                this.f95899b.append(i17, hashSet);
            }
        }
    }

    public void c(int i17, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0 e0Var) {
        synchronized (this) {
            java.util.HashSet hashSet = (java.util.HashSet) this.f95899b.get(i17);
            if (hashSet != null) {
                hashSet.remove(e0Var);
            }
        }
    }
}
