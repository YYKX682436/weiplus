package gw1;

/* loaded from: classes14.dex */
public final class c implements com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gw1.e f357680a;

    public c(gw1.e eVar) {
        this.f357680a = eVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.j
    public final void a(int i17, java.nio.ByteBuffer byteBuffer, int i18, int i19, int i27) {
        java.nio.ByteBuffer byteBuffer2;
        int i28;
        boolean z17;
        java.lang.String str;
        int i29;
        mw1.c a17;
        boolean z18;
        java.lang.ref.WeakReference weakReference;
        qw1.b bVar = this.f357680a.f357683b;
        int i37 = ((i18 * i19) * 3) / 2;
        android.util.SparseArray sparseArray = bVar.f448608e;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = (java.util.concurrent.ConcurrentLinkedDeque) sparseArray.get(i37);
        do {
            byteBuffer2 = (concurrentLinkedDeque == null || (weakReference = (java.lang.ref.WeakReference) concurrentLinkedDeque.poll()) == null) ? null : (java.nio.ByteBuffer) weakReference.get();
            i28 = 0;
            if ((concurrentLinkedDeque != null ? concurrentLinkedDeque.size() : 0) <= 0) {
                break;
            }
        } while (byteBuffer2 == null);
        int i38 = bVar.f448609f;
        bVar.f448609f = i38 + 1;
        if (i38 % 200 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.BufferManager", "clear cache");
            sparseArray.clear();
        }
        qw1.a aVar = new qw1.a(bVar, null, byteBuffer2 == null ? java.nio.ByteBuffer.allocateDirect(i37) : byteBuffer2, 1, null);
        if (java.lang.System.currentTimeMillis() - aVar.f448603c <= 200) {
            z17 = aVar.f448604d;
        } else {
            aVar.a();
            z17 = false;
        }
        java.nio.ByteBuffer byteBuffer3 = z17 ? aVar.f448602b : null;
        if (byteBuffer3 != null) {
            synchronized (byteBuffer3) {
                byteBuffer3.clear();
                byteBuffer.clear().limit(byteBuffer3.capacity());
                byteBuffer3.put(byteBuffer);
            }
            gw1.e eVar = this.f357680a;
            boolean z19 = (i27 & 128) == 128;
            if (z19) {
                str = "" + i17 + "_screen";
            } else {
                str = "" + i17 + "_video";
            }
            java.lang.String str2 = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.OpenVoiceEngineOp", "weiranli: framecallback, " + i18 + 'x' + i19 + ", viewname:" + str2);
            java.util.HashMap hashMap = (java.util.HashMap) eVar.f357684c.get(java.lang.Integer.valueOf(i17));
            if (hashMap != null) {
                java.util.Iterator it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.j jVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.j) ((java.util.Map.Entry) it.next()).getValue();
                    boolean z27 = z19;
                    if (java.lang.System.currentTimeMillis() - aVar.f448603c <= 200) {
                        z18 = aVar.f448604d;
                    } else {
                        aVar.a();
                        z18 = false;
                    }
                    jVar.a(i17, z18 ? aVar.f448602b : null, i18, i19, i27);
                    str2 = str2;
                    aVar = aVar;
                    z19 = z27;
                }
            }
            java.lang.String username = str2;
            boolean z28 = z19;
            qw1.a aVar2 = aVar;
            gw1.a aVar3 = eVar.f357682a;
            if (!z28) {
                i29 = -1;
            } else if ((i27 & 256) == 0) {
                int i39 = (i27 & 512) == 0 ? 1 : 2;
                if ((i27 & 1024) != 0) {
                    i39 += 2;
                }
                i29 = i39;
            } else {
                i29 = 1;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            fw1.g gVar = (fw1.g) aVar3;
            gVar.getClass();
            iw1.k kVar = (iw1.k) ((jz5.n) gVar.f348611a.f383842n).mo141623x754a37bb();
            mw1.b a18 = gVar.f348612b.c().f383840i.a(username);
            if (a18 != null && (a17 = a18.a()) != null) {
                i28 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3) a17).m54520x7d9e8c2a();
            }
            kw1.n nVar = new kw1.n(aVar2, username, new pw1.g(i18, i19, (i28 + 90) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3, false, 0, 24, null), i29);
            kVar.getClass();
            u26.o oVar = (u26.o) kVar.f376754f;
            if (oVar.j()) {
                return;
            }
            oVar.e(nVar);
        }
    }
}
