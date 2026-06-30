package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class d0 implements com.p314xaae8f345.p3206x37e841.InterfaceC27802x9a5f7292 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.f0 f231074a;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.f0 f0Var) {
        this.f231074a = f0Var;
    }

    @Override // com.p314xaae8f345.p3206x37e841.InterfaceC27802x9a5f7292
    /* renamed from: callBackFromConf */
    public byte[] mo54532xc17c1973(int i17, int i18, byte[] bArr) {
        byte[] bArr2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkNativeCallbackMgr", "hy: triggered native callback: %d, %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.f0 f0Var = this.f231074a;
        synchronized (f0Var) {
            java.util.HashSet hashSet = (java.util.HashSet) f0Var.f231107b.get(i17);
            if (hashSet == null || hashSet.size() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Multitalk.ILinkNativeCallbackMgr", "hy: nobody's listening to event %d, what a pity!", java.lang.Integer.valueOf(i17));
                bArr2 = new byte[1];
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(1);
                bArr2 = new byte[1];
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.e0 e0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.e0) it.next();
                    if (e0Var != null) {
                        java.lang.Object a17 = e0Var.a(i18, e0Var.b(bArr));
                        if (a17 != null) {
                            bArr2 = e0Var.c(a17);
                        }
                        if (!e0Var.d()) {
                            arrayList.add(e0Var);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Multitalk.ILinkNativeCallbackMgr", "hy: event %d item or buffer is null! weired", java.lang.Integer.valueOf(i17));
                    }
                }
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    hashSet.remove((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.e0) it6.next());
                }
            }
        }
        return bArr2;
    }

    @Override // com.p314xaae8f345.p3206x37e841.InterfaceC27802x9a5f7292
    /* renamed from: callbackVideoFrame */
    public void mo54533xc7ba63d7(int i17, java.nio.ByteBuffer byteBuffer, int i18, int i19, int i27) {
        java.nio.ByteBuffer byteBuffer2;
        boolean z17;
        int i28;
        java.lang.ref.WeakReference weakReference;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.v4 v4Var = this.f231074a.f231108c;
        if (v4Var != null) {
            cj3.j jVar = (cj3.j) v4Var;
            nj3.b bVar = jVar.f123428a.f123431b;
            int i29 = ((i18 * i19) * 3) / 2;
            android.util.SparseArray sparseArray = bVar.f419421e;
            java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = (java.util.concurrent.ConcurrentLinkedDeque) sparseArray.get(i29);
            do {
                byteBuffer2 = (concurrentLinkedDeque == null || (weakReference = (java.lang.ref.WeakReference) concurrentLinkedDeque.poll()) == null) ? null : (java.nio.ByteBuffer) weakReference.get();
                if ((concurrentLinkedDeque != null ? concurrentLinkedDeque.size() : 0) <= 0) {
                    break;
                }
            } while (byteBuffer2 == null);
            int i37 = bVar.f419422f;
            bVar.f419422f = i37 + 1;
            if (i37 % 200 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.BufferManager", "clear cache");
                sparseArray.clear();
            }
            if (byteBuffer2 == null) {
                if (bVar.f419423g > 70) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MTR.BufferManager", "cur buffer size " + bVar.f419423g);
                }
                byteBuffer2 = java.nio.ByteBuffer.allocateDirect(i29);
            }
            nj3.a aVar = new nj3.a(bVar, null, byteBuffer2, 1, null);
            if (java.lang.System.currentTimeMillis() - aVar.f419416d <= 200) {
                z17 = aVar.f419417e;
            } else {
                aVar.a();
                z17 = false;
            }
            java.nio.ByteBuffer byteBuffer3 = z17 ? aVar.f419414b : null;
            if (byteBuffer3 != null) {
                synchronized (byteBuffer3) {
                    byteBuffer3.clear();
                    byteBuffer.clear().limit(byteBuffer3.capacity());
                    byteBuffer3.put(byteBuffer);
                }
                cj3.n nVar = jVar.f123428a;
                boolean z18 = (i27 & 128) == 128;
                cj3.b bVar2 = nVar.f123430a;
                java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.f231156f.d(i17);
                if (d17 == null) {
                    d17 = "";
                }
                java.lang.String str = d17;
                if (!z18) {
                    i28 = -1;
                } else if ((i27 & 256) == 0) {
                    int i38 = (i27 & 512) == 0 ? 1 : 2;
                    if ((i27 & 1024) != 0) {
                        i38 += 2;
                    }
                    i28 = i38;
                } else {
                    i28 = 1;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.w1) bVar2).a(new cj3.c(str, aVar, i18, i19, z18, i28));
            }
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
