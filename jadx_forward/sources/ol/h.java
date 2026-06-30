package ol;

/* loaded from: classes13.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public android.media.AudioTrack f427625a;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Thread f427632h;

    /* renamed from: i, reason: collision with root package name */
    public nl.b f427633i;

    /* renamed from: j, reason: collision with root package name */
    public ol.b f427634j;

    /* renamed from: k, reason: collision with root package name */
    public ll.q f427635k;

    /* renamed from: l, reason: collision with root package name */
    public ol.k f427636l;

    /* renamed from: t, reason: collision with root package name */
    public ll.b f427644t;

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f427645u;

    /* renamed from: v, reason: collision with root package name */
    public android.os.Handler f427646v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f427647w;

    /* renamed from: x, reason: collision with root package name */
    public int f427648x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.Runnable f427649y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f427650z;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f427626b = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f427627c = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f427628d = new java.util.concurrent.atomic.AtomicBoolean(true);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Queue f427629e = new java.util.ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f427630f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f427631g = new java.lang.Object();

    /* renamed from: m, reason: collision with root package name */
    public volatile java.util.HashMap f427637m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public volatile java.util.HashMap f427638n = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public volatile java.util.HashMap f427639o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public volatile java.util.HashMap f427640p = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public volatile java.util.HashMap f427641q = new java.util.HashMap();

    /* renamed from: r, reason: collision with root package name */
    public volatile java.util.HashMap f427642r = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f427643s = new java.util.ArrayList();

    public h(boolean z17) {
        new java.util.HashMap();
        new java.util.HashMap();
        new java.util.HashMap();
        new java.util.HashMap();
        new java.util.HashMap();
        new java.util.HashMap();
        this.f427645u = new byte[2];
        this.f427647w = false;
        this.f427648x = 0;
        this.f427649y = new ol.d(this);
        this.f427650z = new java.util.ArrayList();
        nl.b bVar = new nl.b(this);
        this.f427633i = bVar;
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixController", "onInit", null);
        if (bVar.f419652h == null) {
            java.lang.Thread thread = new java.lang.Thread(bVar.f419668x, "audio_mix_controller");
            bVar.f419652h = thread;
            thread.start();
        }
        bVar.f419655k.clear();
        nl.c cVar = new nl.c();
        bVar.f419645a = cVar;
        if (cVar.f419669a == null) {
            cVar.f419669a = new nl.h();
        }
        if (this.f427635k == null) {
            this.f427635k = new ol.f(this);
        }
        if (z17) {
            i();
        }
        this.f427646v = new android.os.Handler(android.os.Looper.myLooper());
    }

    public static void a(ol.h hVar) {
        boolean z17;
        synchronized (hVar) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "createAudioTrack", null);
            int minBufferSize = android.media.AudioTrack.getMinBufferSize(44100, 12, 2);
            int i18 = minBufferSize / 3536;
            z17 = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "miniBufferSize:%d, channels:%d, sampleRate:%d", java.lang.Integer.valueOf(minBufferSize), 2, 44100);
            if (hVar.f427625a == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioMixPlayerImpl", "audioTrack is null, new AudioTrack", null);
                try {
                    hVar.f427625a = new android.media.AudioTrack(3, 44100, 12, 2, minBufferSize, 1);
                } catch (java.lang.IllegalArgumentException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioMixPlayerImpl", e17, "AudioTrack create", new java.lang.Object[0]);
                }
            }
            android.media.AudioTrack audioTrack = hVar.f427625a;
            if (audioTrack == null || audioTrack.getState() != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioMixPlayerImpl", "audio track not initialized", null);
                android.media.AudioTrack audioTrack2 = hVar.f427625a;
                if (audioTrack2 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioMixPlayerImpl", "AudioTrack getState", java.lang.Integer.valueOf(audioTrack2.getState()));
                    try {
                        hVar.f427625a.release();
                        hVar.f427625a = null;
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioMixPlayerImpl", e18, "AudioTrack release", new java.lang.Object[0]);
                    }
                }
            } else {
                z17 = true;
            }
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "create AudioTrack success", null);
            hVar.f427625a.play();
        } else {
            int i19 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioMixPlayerImpl", "onError, errCode:%d", 710);
        }
    }

    public static void b(ol.h hVar, hl.b bVar) {
        hl.c cVar;
        if (hVar.f427634j != null && hVar.f427647w) {
            if (il.g.f373521d == null) {
                synchronized (il.g.class) {
                    if (il.g.f373521d == null) {
                        il.g.f373521d = new il.g();
                    }
                }
            }
            il.g gVar = il.g.f373521d;
            synchronized (gVar) {
                if (gVar.f373522a.size() > 0) {
                    cVar = (hl.c) gVar.f373522a.remove(gVar.f373522a.size() - 1);
                } else if (gVar.f373524c >= gVar.f373523b) {
                    java.lang.Object[] objArr = {java.lang.Integer.valueOf(gVar.f373524c)};
                    int i17 = rl.b.f478676a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioOutputMixBufferPool", "size >= FIX_SIZE, size:%d", objArr);
                    cVar = null;
                } else {
                    gVar.f373524c++;
                    cVar = new hl.c();
                }
            }
            if (cVar == null) {
                return;
            }
            byte[] bArr = cVar.f363549c;
            if (bArr == null || bArr.length < bVar.f363549c.length) {
                cVar.f363549c = new byte[bVar.f363549c.length];
            }
            byte[] bArr2 = bVar.f363549c;
            java.lang.System.arraycopy(bArr2, 0, cVar.f363549c, 0, bArr2.length);
            hVar.f427646v.post(new ol.g(hVar, cVar));
        }
    }

    public n01.b c(java.lang.String str) {
        if (this.f427637m.containsKey(str)) {
            return (n01.b) this.f427637m.get(str);
        }
        return null;
    }

    public int d(java.lang.String str) {
        n01.b bVar;
        if (!this.f427637m.containsKey(str) || (bVar = (n01.b) this.f427637m.get(str)) == null) {
            return 0;
        }
        java.lang.String str2 = bVar.f415371c;
        if (android.text.TextUtils.isEmpty(str2)) {
            return 0;
        }
        return (int) il.j.a().b(str2).f363554d;
    }

    public int e() {
        int i17;
        synchronized (this.f427631g) {
            java.util.Set keySet = this.f427640p.keySet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(keySet);
            java.util.Iterator it = arrayList.iterator();
            i17 = 0;
            while (it.hasNext()) {
                ol.i iVar = (ol.i) this.f427640p.get((java.lang.String) it.next());
                if (iVar != null && (iVar.a(0) || iVar.a(1) || iVar.a(2))) {
                    i17++;
                }
            }
        }
        return i17;
    }

    public int f(java.lang.String str) {
        n01.b bVar;
        int i17;
        ll.p pVar;
        if (!this.f427637m.containsKey(str) || (bVar = (n01.b) this.f427637m.get(str)) == null) {
            return 0;
        }
        if (bVar.f415394z) {
            i17 = (int) this.f427633i.b(str);
        } else {
            ll.c cVar = (ll.c) this.f427644t.f400605b.get(str);
            long j17 = -1;
            if (cVar != null && (pVar = cVar.f400612i) != null) {
                j17 = pVar.mo145881x9746038c();
            }
            i17 = (int) j17;
        }
        if (i17 != -1) {
            bVar.f415374f = i17;
        } else {
            i17 = bVar.f415374f;
        }
        if (i17 == -1) {
            return 0;
        }
        int d17 = d(str);
        return (d17 <= 0 || i17 <= d17) ? i17 : d17;
    }

    public int g() {
        int i17;
        synchronized (this.f427631g) {
            java.util.Set keySet = this.f427640p.keySet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(keySet);
            java.util.Iterator it = arrayList.iterator();
            i17 = 0;
            while (it.hasNext()) {
                ol.i iVar = (ol.i) this.f427640p.get((java.lang.String) it.next());
                if (iVar != null && (iVar.a(0) || iVar.a(1))) {
                    i17++;
                }
            }
        }
        return i17;
    }

    public int h(java.lang.String str) {
        ol.i iVar;
        java.lang.Object obj;
        if (!this.f427640p.containsKey(str) || (iVar = (ol.i) this.f427640p.get(str)) == null) {
            return -1;
        }
        synchronized (iVar) {
            obj = iVar.f427651a;
        }
        return ((java.lang.Integer) obj).intValue();
    }

    public void i() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f427626b;
        if (atomicBoolean.get()) {
            return;
        }
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "initThread", null);
        atomicBoolean.set(true);
        this.f427628d.set(false);
        this.f427627c.set(false);
        n();
    }

    public boolean j(java.lang.String str) {
        if (this.f427640p.containsKey(str)) {
            ol.i iVar = (ol.i) this.f427640p.get(str);
            if (iVar != null && iVar.a(0) && !this.f427633i.f419648d.get()) {
                return true;
            }
            if (!this.f427633i.f419648d.get() && !this.f427633i.d(str) && this.f427644t.b(str)) {
                return true;
            }
        }
        return false;
    }

    public void k(hl.b bVar) {
        boolean z17;
        java.util.Iterator it = bVar.f363550d.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            synchronized (this.f427631g) {
                if (!android.text.TextUtils.isEmpty(str) && (!this.f427642r.containsKey(str) || !((java.lang.Boolean) this.f427642r.get(str)).booleanValue())) {
                    if (this.f427642r.containsKey(str)) {
                        this.f427642r.put(str, java.lang.Boolean.TRUE);
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        this.f427646v.post(new ol.e(this, str));
                    }
                }
            }
        }
    }

    public void l(int i17, java.lang.String str) {
        ll.d dVar;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f427633i.f419657m.get(str);
        m(i17, str, (weakReference == null || weakReference.get() == null || (dVar = (ll.d) weakReference.get()) == null) ? "" : dVar.f400619g);
    }

    public void m(int i17, java.lang.String str, java.lang.String str2) {
        n01.b bVar = (n01.b) this.f427637m.get(str);
        if (bVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3 c5175x3ee93aa3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3();
        am.g0 g0Var = c5175x3ee93aa3.f135523g;
        g0Var.f88251c = str;
        g0Var.f88249a = i17;
        g0Var.f88253e = bVar.f415382n;
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = bVar.f415370b;
        }
        am.g0 g0Var2 = c5175x3ee93aa3.f135523g;
        g0Var2.f88256h = str2;
        g0Var2.f88252d = com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3.f(i17);
        ll.q qVar = this.f427635k;
        if (qVar != null) {
            ((ol.f) qVar).a(c5175x3ee93aa3);
        }
    }

    public final void n() {
        synchronized (this) {
            if (this.f427632h == null) {
                java.lang.Thread thread = new java.lang.Thread(this.f427649y, "audio_mix_player");
                this.f427632h = thread;
                thread.start();
                java.lang.Object[] objArr = {java.lang.Long.valueOf(this.f427632h.getId())};
                int i17 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "start playback thread id:%d", objArr);
            }
        }
    }

    public void o(float f17, float f18) {
        try {
            android.media.AudioTrack audioTrack = this.f427625a;
            if (audioTrack != null) {
                audioTrack.setStereoVolume(f17, f18);
            }
        } catch (java.lang.Exception e17) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioMixPlayerImpl", e17, be1.x0.f4239x24728b, new java.lang.Object[0]);
        }
    }

    public void p() {
        synchronized (this.f427630f) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "sync notify", null);
            try {
                this.f427630f.notifyAll();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioMixPlayerImpl", e17, "syncNotify", new java.lang.Object[0]);
            }
        }
    }
}
