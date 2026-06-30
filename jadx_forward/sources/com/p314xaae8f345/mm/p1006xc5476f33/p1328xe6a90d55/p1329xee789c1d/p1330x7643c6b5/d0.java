package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class d0 implements com.p314xaae8f345.p3206x37e841.InterfaceC27802x9a5f7292 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.f0 f177418a;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.f0 f0Var) {
        this.f177418a = f0Var;
    }

    @Override // com.p314xaae8f345.p3206x37e841.InterfaceC27802x9a5f7292
    /* renamed from: callBackFromConf */
    public byte[] mo54532xc17c1973(int i17, int i18, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceNativeCallbackMgr", "hy: triggered native callback: %d, %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        java.util.HashSet hashSet = (java.util.HashSet) this.f177418a.f177432b.get(i17);
        if (hashSet == null || hashSet.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenVoice.OpenVoiceNativeCallbackMgr", "hy: nobody's listening to event %d, what a pity!", java.lang.Integer.valueOf(i17));
            return new byte[1];
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        byte[] bArr2 = new byte[1];
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.e0 e0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.e0) it.next();
            if (e0Var != null) {
                java.lang.Object a17 = e0Var.a(i18, e0Var.b(bArr));
                if (a17 != null) {
                    bArr2 = e0Var.c(a17);
                }
                if (!e0Var.d()) {
                    arrayList.add(e0Var);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceNativeCallbackMgr", "hy: item is null! weired");
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            hashSet.remove((com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.e0) it6.next());
        }
        return bArr2;
    }

    @Override // com.p314xaae8f345.p3206x37e841.InterfaceC27802x9a5f7292
    /* renamed from: callbackVideoFrame */
    public void mo54533xc7ba63d7(int i17, java.nio.ByteBuffer byteBuffer, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.j jVar = this.f177418a.f177433c;
        if (jVar != null) {
            jVar.a(i17, byteBuffer, i18, i19, i27);
        }
    }

    @Override // com.p314xaae8f345.p3206x37e841.InterfaceC27802x9a5f7292
    /* renamed from: callbackWriteLog */
    public void mo54534x93d9424a(int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, int i19) {
        if (i17 >= (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40533xfb80ca96() != null ? com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40533xfb80ca96().mo40548xf2ceb016(0L) : 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.C4611x87cbdd8c.m40606x7b10b097(i17, "CloudVoIPNative:" + str, str2, str3, android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), str4);
        }
    }
}
