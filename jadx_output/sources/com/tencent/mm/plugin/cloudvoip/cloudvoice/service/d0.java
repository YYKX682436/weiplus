package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class d0 implements com.tencent.wxmm.IConfCallBack {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.f0 f95885a;

    public d0(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.f0 f0Var) {
        this.f95885a = f0Var;
    }

    @Override // com.tencent.wxmm.IConfCallBack
    public byte[] callBackFromConf(int i17, int i18, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceNativeCallbackMgr", "hy: triggered native callback: %d, %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        java.util.HashSet hashSet = (java.util.HashSet) this.f95885a.f95899b.get(i17);
        if (hashSet == null || hashSet.size() <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.OpenVoiceNativeCallbackMgr", "hy: nobody's listening to event %d, what a pity!", java.lang.Integer.valueOf(i17));
            return new byte[1];
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        byte[] bArr2 = new byte[1];
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0 e0Var = (com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0) it.next();
            if (e0Var != null) {
                java.lang.Object a17 = e0Var.a(i18, e0Var.b(bArr));
                if (a17 != null) {
                    bArr2 = e0Var.c(a17);
                }
                if (!e0Var.d()) {
                    arrayList.add(e0Var);
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceNativeCallbackMgr", "hy: item is null! weired");
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            hashSet.remove((com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0) it6.next());
        }
        return bArr2;
    }

    @Override // com.tencent.wxmm.IConfCallBack
    public void callbackVideoFrame(int i17, java.nio.ByteBuffer byteBuffer, int i18, int i19, int i27) {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j jVar = this.f95885a.f95900c;
        if (jVar != null) {
            jVar.a(i17, byteBuffer, i18, i19, i27);
        }
    }

    @Override // com.tencent.wxmm.IConfCallBack
    public void callbackWriteLog(int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, int i19) {
        if (i17 >= (com.tencent.mars.xlog.Log.getImpl() != null ? com.tencent.mars.xlog.Log.getImpl().getLogLevel(0L) : 0)) {
            com.tencent.mars.xlog.MMXlog.logWrite2(i17, "CloudVoIPNative:" + str, str2, str3, android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), str4);
        }
    }
}
