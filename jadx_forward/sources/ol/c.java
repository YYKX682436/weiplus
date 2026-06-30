package ol;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final ol.h f427612a;

    /* renamed from: b, reason: collision with root package name */
    public final ll.b f427613b;

    /* renamed from: d, reason: collision with root package name */
    public final kl.h f427615d;

    /* renamed from: e, reason: collision with root package name */
    public final jl.c f427616e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f427617f;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f427614c = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f427618g = false;

    public c(boolean z17) {
        ol.h hVar = new ol.h(z17);
        this.f427612a = hVar;
        ll.b bVar = new ll.b(hVar);
        this.f427613b = bVar;
        hVar.f427644t = bVar;
        this.f427615d = new kl.h(null);
        this.f427616e = new jl.c();
    }

    public void a(java.lang.String str) {
        java.lang.String str2 = this.f427617f;
        this.f427616e.getClass();
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioPcmDataTrackTaskController", "cacheToFile appId:%s, filePath:%s", str2, str);
        jl.d dVar = new jl.d(new jl.a(str2, str), "AudioPcmDataTrackCacheToFileTask", 5);
        ll.m.a();
        ll.m.b(dVar);
    }

    public final void b(n01.b bVar) {
        bVar.f415394z = true;
        int d17 = this.f427612a.d(bVar.f415369a);
        int e17 = this.f427612a.e();
        if (!this.f427618g) {
            if (d17 <= 2000) {
                bVar.f415394z = false;
            }
            if (d17 >= 5000) {
                bVar.f415394z = true;
            } else if (e17 <= 5) {
                bVar.f415394z = false;
            } else {
                bVar.f415394z = true;
            }
            if (bVar.f415371c.contains("scale_intro")) {
                bVar.f415394z = false;
            }
        }
        if (e17 > 5) {
            ol.h hVar = this.f427612a;
            hVar.f427643s.clear();
            hVar.f427650z.clear();
            synchronized (hVar.f427631g) {
                hVar.f427650z.addAll(hVar.f427640p.keySet());
                java.util.Iterator it = hVar.f427650z.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    ol.i iVar = (ol.i) hVar.f427640p.get(str);
                    if (iVar != null && iVar.a(2)) {
                        hVar.f427643s.add(str);
                    }
                }
            }
            java.util.ArrayList arrayList = hVar.f427643s;
            if (arrayList.contains(bVar.f415369a)) {
                arrayList.remove(bVar.f415369a);
            }
            if (arrayList.size() > 2) {
                java.lang.Object[] objArr = {java.lang.Integer.valueOf(arrayList.size())};
                int i17 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayer", "do stop paused audio size:%d", objArr);
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    r((java.lang.String) it6.next());
                }
            }
        }
        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(d17), java.lang.Boolean.valueOf(bVar.f415394z)};
        int i18 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayer", "playingCount:%d, duration:%d, supportMixPlay:%b", objArr2);
    }

    public long c() {
        long j17;
        il.j a17 = il.j.a();
        synchronized (a17.f373538c) {
            java.util.Iterator it = a17.f373536a.iterator();
            j17 = 0;
            while (it.hasNext()) {
                hl.d dVar = (hl.d) a17.f373537b.get((java.lang.String) it.next());
                if (dVar != null && dVar.f363552b && !dVar.f363559i) {
                    j17 += dVar.c();
                }
            }
        }
        return j17;
    }

    public boolean d(java.lang.String str) {
        n01.b c17 = this.f427612a.c(str);
        if (c17 == null) {
            return false;
        }
        java.util.HashMap hashMap = this.f427614c;
        if (hashMap.containsKey(c17.f415371c)) {
            return ((java.lang.Boolean) hashMap.get(c17.f415371c)).booleanValue();
        }
        boolean d17 = il.j.a().d(c17.f415371c);
        if (d17) {
            hashMap.put(c17.f415371c, java.lang.Boolean.valueOf(d17));
        }
        return d17;
    }

    public boolean e(java.lang.String str) {
        java.util.HashMap hashMap = this.f427614c;
        if (hashMap.containsKey(str)) {
            return ((java.lang.Boolean) hashMap.get(str)).booleanValue();
        }
        boolean d17 = il.j.a().d(str);
        if (d17) {
            hashMap.put(str, java.lang.Boolean.valueOf(d17));
        }
        return d17;
    }

    public boolean f(java.lang.String str) {
        return this.f427612a.f427637m.containsKey(str);
    }

    public boolean g(java.lang.String str) {
        ol.i iVar;
        ol.h hVar = this.f427612a;
        return hVar.f427640p.containsKey(str) && (iVar = (ol.i) hVar.f427640p.get(str)) != null && iVar.a(2);
    }

    public boolean h(java.lang.String str) {
        return this.f427612a.j(str);
    }

    public boolean i(java.lang.String str) {
        ol.i iVar;
        ol.h hVar = this.f427612a;
        return hVar.f427640p.containsKey(str) && (iVar = (ol.i) hVar.f427640p.get(str)) != null && iVar.a(7);
    }

    public boolean j(java.lang.String str) {
        ol.i iVar;
        ol.h hVar = this.f427612a;
        return hVar.f427640p.containsKey(str) && (iVar = (ol.i) hVar.f427640p.get(str)) != null && iVar.a(9);
    }

    public boolean k(java.lang.String str) {
        ol.h hVar = this.f427612a;
        if (hVar.f427639o.containsKey(str)) {
            return ((java.lang.Boolean) hVar.f427639o.get(str)).booleanValue();
        }
        return false;
    }

    public void l() {
        ll.b bVar = this.f427613b;
        bVar.getClass();
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecodeMgr", "pauseAllOnBackground", null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (bVar.f400609f) {
            arrayList.addAll(bVar.f400608e);
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ll.c cVar = (ll.c) bVar.f400605b.get((java.lang.String) it.next());
            if (cVar != null && !cVar.f400611h) {
                ll.p pVar = cVar.f400612i;
                if (!(pVar == null) && pVar != null && !((ll.d) pVar).h()) {
                    pVar.d();
                }
            }
        }
        ol.h hVar = this.f427612a;
        hVar.getClass();
        int i18 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "pauseAllOnBackground", null);
        nl.b bVar2 = hVar.f427633i;
        bVar2.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixController", "pauseMix", null);
        bVar2.f419648d.set(true);
        int i19 = bVar2.f419666v;
        if (i19 > 0) {
            long j17 = bVar2.f419667w / i19;
            bVar2.f419665u = j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixController", "mixAverageTime:%d", java.lang.Long.valueOf(j17));
        }
        bVar2.f419666v = 0;
        bVar2.f419667w = 0L;
        hVar.f427626b.set(false);
        hVar.f427628d.set(true);
        hVar.f427627c.set(false);
        hVar.p();
        synchronized (hVar) {
            java.lang.Thread thread = hVar.f427632h;
            if (thread != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "stop playback thread id:%d", java.lang.Long.valueOf(thread.getId()));
                hVar.f427632h = null;
            }
        }
        kl.h hVar2 = this.f427615d;
        hVar2.getClass();
        if (kl.h.f390263d == 0) {
            kl.h.f390263d = 0L;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - kl.h.f390263d <= kl.h.f390262c.longValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioScanConvertCacheController", "startClean the last clean time is in AUDIO_MIX_NO_SCAN_TIME time", null);
        } else {
            kl.h.f390263d = currentTimeMillis;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioScanConvertCacheController", "start scan audio mix convert file", null);
            ll.m.b(new kl.g(hVar2, "clean audio mix convert cache", 5));
        }
        il.j a17 = il.j.a();
        synchronized (a17.f373538c) {
            java.util.Iterator it6 = a17.f373536a.iterator();
            while (it6.hasNext()) {
                hl.d dVar = (hl.d) a17.f373537b.get((java.lang.String) it6.next());
                if (dVar != null && dVar.f363552b && dVar.f363559i) {
                    synchronized (dVar) {
                        if (dVar.f363560j != null) {
                            int i27 = rl.b.f478676a;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.PcmBufferProvider", "closeCacheFileWithNoDiscard success", null);
                            dVar.f363560j.a();
                            dVar.f363560j = null;
                        }
                    }
                }
            }
        }
        il.e c17 = il.e.c();
        c17.getClass();
        int i28 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioCachePathMgr", "saveData", null);
        jl.d dVar2 = new jl.d(new il.c(c17), "saveData", 5);
        ll.m.a();
        ll.m.b(dVar2);
    }

    public void m(n01.b bVar) {
        jl.e eVar;
        ol.i iVar;
        this.f427617f = bVar.f415382n;
        java.lang.Object[] objArr = {bVar.f415369a};
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayer", "preparePlay:%s", objArr);
        il.e c17 = il.e.c();
        java.lang.String str = this.f427617f;
        if (!android.text.TextUtils.isEmpty(c17.f373517b) && !str.equals(c17.f373517b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioCachePathMgr", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, null);
            java.lang.String str2 = c17.f373517b;
            c17.f373517b = str;
            eVar = new il.a(c17, str2, str);
        } else if (android.text.TextUtils.isEmpty(c17.f373517b)) {
            c17.f373517b = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioCachePathMgr", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, null);
            eVar = new il.b(c17, str);
        } else {
            eVar = null;
        }
        if (eVar != null) {
            jl.d dVar = new jl.d(eVar, "init cache path", 5);
            ll.m.a();
            ll.m.b(dVar);
        }
        if (e(bVar.f415371c) && bVar.f415375g) {
            b(bVar);
        }
        ol.h hVar = this.f427612a;
        hVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "preparePlay", null);
        boolean z17 = bVar.A;
        if (z17 || !bVar.f415375g) {
            if (z17) {
                synchronized (hVar.f427631g) {
                    if (hVar.f427640p.containsKey(bVar.f415369a) && (iVar = (ol.i) hVar.f427640p.get(bVar.f415369a)) != null && iVar.a(4)) {
                        hVar.f427640p.remove(bVar.f415369a);
                    }
                }
            }
        } else if (hVar.f427626b.get()) {
            hVar.n();
        } else {
            hVar.i();
        }
        hVar.f427637m.put(bVar.f415369a, bVar);
        synchronized (hVar.f427631g) {
            hVar.f427642r.put(bVar.f415369a, java.lang.Boolean.FALSE);
        }
        hVar.f427633i.l(bVar.f415369a);
        nl.b bVar2 = hVar.f427633i;
        bVar2.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixController", "prepareMix", null);
        bVar2.f419647c.set(false);
        bVar2.f419648d.set(false);
        if (bVar2.f419652h == null) {
            java.lang.Thread thread = new java.lang.Thread(bVar2.f419668x, "audio_mix_controller");
            bVar2.f419652h = thread;
            thread.start();
        }
        synchronized (bVar2.f419651g) {
            try {
                bVar2.f419651g.notify();
            } catch (java.lang.Exception e17) {
                int i18 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioMixController", e17, "notifyMix", new java.lang.Object[0]);
            }
        }
        this.f427613b.d(bVar);
    }

    public void n(java.lang.String str) {
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayer", "remove audioId:%s", str);
        ol.h hVar = this.f427612a;
        hVar.f427637m.remove(str);
        hVar.f427638n.remove(str);
        hVar.f427639o.remove(str);
        synchronized (hVar.f427631g) {
            hVar.f427640p.remove(str);
            hVar.f427642r.remove(str);
        }
        hVar.f427641q.remove(str);
        ll.b bVar = this.f427613b;
        if (bVar.f400605b.containsKey(str) && bVar.f400608e.contains(str)) {
            bVar.g(str);
        }
        bVar.f400606c.remove(str);
        synchronized (bVar.f400609f) {
            bVar.f400608e.remove(str);
        }
    }

    public void o(java.lang.String str) {
        java.lang.Object[] objArr = {str, java.lang.Integer.valueOf(this.f427612a.h(str))};
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayer", "resume audioId:%s, audio state:%d", objArr);
        b(this.f427612a.c(str));
        ol.h hVar = this.f427612a;
        hVar.f427628d.set(false);
        hVar.f427627c.set(false);
        hVar.p();
        hVar.n();
        synchronized (hVar.f427631g) {
            hVar.f427642r.put(str, java.lang.Boolean.FALSE);
        }
        hVar.f427633i.l(str);
        hVar.f427638n.remove(str);
        hVar.f427639o.put(str, java.lang.Boolean.TRUE);
        if (hVar.f427644t.c(str) && hVar.f427644t.b(str)) {
            hVar.l(1, str);
        }
        ll.b bVar = this.f427613b;
        bVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecodeMgr", "startDecode audioId:%s", str);
        bVar.a(str, false, false);
    }

    public void p(n01.b bVar) {
        ol.h hVar = this.f427612a;
        hVar.f427637m.put(bVar.f415369a, bVar);
        if (hVar.g() == 1) {
            java.lang.String str = bVar.f415369a;
            if ((hVar.f427637m.containsKey(str) ? ((n01.b) hVar.f427637m.get(str)).f415394z : false) && hVar.j(bVar.f415369a)) {
                float f17 = (float) bVar.f415380l;
                hVar.o(f17, f17);
                java.lang.Object[] objArr = {java.lang.Double.valueOf(bVar.f415380l)};
                int i17 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "setPlayParam setVolume:%f", objArr);
            }
        }
        this.f427613b.f400606c.put(bVar.f415369a, bVar);
    }

    public void q(boolean z17) {
        ll.b bVar = this.f427613b;
        synchronized (bVar.f400609f) {
            java.util.Iterator it = bVar.f400608e.iterator();
            while (it.hasNext()) {
                n01.b bVar2 = (n01.b) bVar.f400606c.get((java.lang.String) it.next());
                if (bVar2 != null) {
                    if (z17) {
                        bVar2.f415394z = z17;
                    } else {
                        ol.h hVar = bVar.f400604a;
                        if (hVar != null) {
                            int d17 = hVar.d(bVar2.f415369a);
                            int e17 = hVar.e();
                            if (d17 <= 2000) {
                                bVar2.f415394z = false;
                            }
                            if (d17 >= 5000) {
                                bVar2.f415394z = true;
                            } else if (e17 <= 5) {
                                bVar2.f415394z = false;
                            } else {
                                bVar2.f415394z = true;
                            }
                            if (bVar2.f415371c.contains("scale_intro")) {
                                bVar2.f415394z = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public void r(java.lang.String str) {
        java.lang.Object[] objArr = {str, java.lang.Integer.valueOf(this.f427612a.h(str))};
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayer", "stop audioId:%s, audio state:%d", objArr);
        ol.h hVar = this.f427612a;
        nl.b bVar = hVar.f427633i;
        bVar.f419650f.put(str, java.lang.Boolean.TRUE);
        bVar.j(str);
        if (bVar.f419653i.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixController", "stopMix isMute", null);
            bVar.f419649e.set(true);
            bVar.f419646b.o(0.0f, 0.0f);
        } else {
            bVar.f419649e.set(false);
        }
        synchronized (hVar.f427631g) {
            hVar.f427642r.remove(str);
        }
        hVar.f427638n.remove(str);
        hVar.f427639o.put(str, java.lang.Boolean.FALSE);
        if (hVar.f427644t.c(str)) {
            hVar.l(3, str);
        }
        this.f427613b.g(str);
    }

    public void s(n01.b bVar) {
        ll.c cVar;
        ll.p pVar;
        ol.h hVar = this.f427612a;
        if (hVar.f427637m.containsKey(bVar.f415369a)) {
            hVar.f427637m.put(bVar.f415369a, bVar);
            if (hVar.g() == 1) {
                java.lang.String str = bVar.f415369a;
                if ((hVar.f427637m.containsKey(str) ? ((n01.b) hVar.f427637m.get(str)).f415394z : false) && hVar.j(bVar.f415369a)) {
                    float f17 = (float) bVar.f415380l;
                    hVar.o(f17, f17);
                    java.lang.Object[] objArr = {java.lang.Double.valueOf(bVar.f415380l)};
                    int i17 = rl.b.f478676a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "update setVolume:%f", objArr);
                }
            }
        }
        ll.b bVar2 = this.f427613b;
        java.util.HashMap hashMap = bVar2.f400606c;
        if (hashMap.containsKey(bVar.f415369a)) {
            hashMap.put(bVar.f415369a, bVar);
            if (bVar2.c(bVar.f415369a) || (cVar = (ll.c) bVar2.f400605b.get(bVar.f415369a)) == null || (pVar = cVar.f400612i) == null) {
                return;
            }
            java.util.concurrent.atomic.AtomicInteger atomicInteger = ((ll.d) pVar).f400621i;
            if (atomicInteger.get() == 8 || atomicInteger.get() == 7) {
                return;
            }
            float f18 = (float) bVar.f415380l;
            pVar.c(f18, f18);
        }
    }
}
