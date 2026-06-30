package ll;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final ol.h f400604a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f400605b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f400606c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f400607d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f400608e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f400609f = new java.lang.Object();

    public b(ol.h hVar) {
        this.f400604a = hVar;
        il.j a17 = il.j.a();
        synchronized (a17.f373538c) {
            java.util.Iterator it = a17.f373536a.iterator();
            while (it.hasNext()) {
                hl.d dVar = (hl.d) a17.f373537b.get((java.lang.String) it.next());
                if (dVar != null) {
                    dVar.h();
                }
            }
            a17.f373536a.clear();
            a17.f373537b.clear();
        }
    }

    public final boolean a(java.lang.String str, boolean z17, boolean z18) {
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecodeMgr", "doDecodeAudio", null);
        if (this.f400604a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioDecodeMgr", "mPlayer is null!", null);
            return false;
        }
        n01.b bVar = (n01.b) this.f400606c.get(str);
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioDecodeMgr", "param for id %s is not exist!", str);
            return false;
        }
        ll.c cVar = (ll.c) this.f400605b.get(str);
        if (cVar != null) {
            if (cVar.f400611h && !this.f400604a.f427633i.e() && !this.f400604a.f427633i.c(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecodeMgr", "task is end, but not to play end", null);
                return true;
            }
            if (cVar.f400611h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecodeMgr", "task is end, reset source and decoder to run", null);
                cVar.f400611h = false;
                cVar.f400612i = ll.j.a(this.f400604a, new ql.a(bVar), 1, z18);
                cVar.f400652f = java.lang.System.currentTimeMillis();
                ll.m.b(cVar);
                return true;
            }
            ll.p pVar = cVar.f400612i;
            if (pVar == null || !z17) {
                if (pVar != null) {
                    ll.d dVar = (ll.d) pVar;
                    if (dVar.h() && !dVar.i()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecodeMgr", "resume decoder to run", null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderBase", "resume", null);
                        dVar.p(4);
                        synchronized (dVar.f400632t) {
                            if (dVar.h()) {
                                dVar.f400622j.set(false);
                                try {
                                    dVar.f400632t.notify();
                                } catch (java.lang.Exception e17) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioDecoderBase", e17, "resume", new java.lang.Object[0]);
                                }
                            }
                        }
                        return true;
                    }
                }
                if (pVar != null && ((ll.d) pVar).i()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecodeMgr", "decoder to stop, reset task run", null);
                    cVar.f400611h = false;
                    cVar.f400612i = ll.j.a(this.f400604a, new ql.a(bVar), 1, z18);
                    cVar.f400652f = java.lang.System.currentTimeMillis();
                    ll.m.b(cVar);
                    return true;
                }
                if (pVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecodeMgr", "task is run and playing audio", null);
                    return true;
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecodeMgr", "force decode to stop and create new task to run", null);
                ((ll.d) pVar).w();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecodeMgr", "task is not exist, create new task to run", null);
        ll.p a17 = ll.j.a(this.f400604a, new ql.a(bVar), 1, z18);
        ll.c cVar2 = new ll.c(new ll.a(this), str, 5);
        cVar2.f400612i = a17;
        cVar2.f400652f = java.lang.System.currentTimeMillis();
        ll.m.b(cVar2);
        this.f400605b.put(str, cVar2);
        synchronized (this.f400609f) {
            if (!this.f400608e.contains(str)) {
                this.f400608e.add(str);
            }
        }
        return true;
    }

    public boolean b(java.lang.String str) {
        ll.c cVar = (ll.c) this.f400605b.get(str);
        if (cVar == null || !cVar.f400611h) {
            return false;
        }
        ol.h hVar = this.f400604a;
        if (hVar.f427633i.e() || hVar.f427633i.c(str)) {
            return false;
        }
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecodeMgr", "task is end, but not to play end", null);
        return true;
    }

    public boolean c(java.lang.String str) {
        ll.c cVar = (ll.c) this.f400605b.get(str);
        if (cVar == null || cVar.f400611h) {
            return true;
        }
        return cVar.f400612i == null;
    }

    public void d(n01.b bVar) {
        boolean z17;
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecodeMgr", "prepareDecode", null);
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioDecodeMgr", "param is null", null);
            return;
        }
        if (android.text.TextUtils.isEmpty(bVar.f415369a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecodeMgr", "audioId is empty!", null);
            return;
        }
        if (this.f400608e.contains(bVar.f415369a)) {
            if (((n01.b) this.f400606c.get(bVar.f415369a)).a(bVar)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecodeMgr", "is same param", null);
                z17 = false;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecodeMgr", "force to decode", null);
                z17 = true;
            }
            this.f400606c.put(bVar.f415369a, bVar);
        } else {
            synchronized (this.f400609f) {
                this.f400608e.add(bVar.f415369a);
            }
            this.f400606c.put(bVar.f415369a, bVar);
            z17 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecodeMgr", "ids:%d, id2ParamMap:%d", java.lang.Integer.valueOf(this.f400608e.size()), java.lang.Integer.valueOf(this.f400606c.size()));
        if (bVar.A) {
            boolean a17 = a(bVar.f415369a, z17, true);
            synchronized (this.f400609f) {
                if (a17) {
                    if (!((java.util.ArrayList) this.f400607d).contains(bVar.f415371c)) {
                        ((java.util.ArrayList) this.f400607d).add(bVar.f415371c);
                    }
                }
            }
            return;
        }
        if (bVar.f415375g) {
            a(bVar.f415369a, z17, false);
            return;
        }
        boolean a18 = a(bVar.f415369a, z17, true);
        synchronized (this.f400609f) {
            if (a18) {
                if (!((java.util.ArrayList) this.f400607d).contains(bVar.f415371c)) {
                    ((java.util.ArrayList) this.f400607d).add(bVar.f415371c);
                }
            }
        }
    }

    public boolean e(java.lang.String str, int i17) {
        n01.b bVar = (n01.b) this.f400606c.get(str);
        if (bVar != null) {
            bVar.f415372d = i17;
            return true;
        }
        int i18 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioDecodeMgr", "param for id %s is not exist!", str);
        return false;
    }

    public boolean f(java.lang.String str, int i17) {
        if (!e(str, i17)) {
            return false;
        }
        e(str, i17);
        ll.c cVar = (ll.c) this.f400605b.get(str);
        if (cVar == null) {
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioDecodeMgr", "task is not exist", null);
            return false;
        }
        if (cVar.f400611h) {
            int i19 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioDecodeMgr", "task is execute end!", null);
            return false;
        }
        ll.p pVar = cVar.f400612i;
        if (pVar == null) {
            int i27 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioDecodeMgr", "task is isDetach!", null);
            return false;
        }
        if (pVar != null) {
            pVar.a(i17);
        }
        return true;
    }

    public void g(java.lang.String str) {
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecodeMgr", "stopDecode audioId:%s", str);
        java.util.HashMap hashMap = this.f400605b;
        ll.c cVar = (ll.c) hashMap.get(str);
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioDecodeMgr", "task is not exist", null);
            return;
        }
        if (cVar.f400611h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioDecodeMgr", "task is execute end!", null);
            return;
        }
        ll.p pVar = cVar.f400612i;
        if (pVar != null) {
            ((ll.d) pVar).w();
            cVar.f400612i = null;
            hashMap.remove(str);
        }
    }
}
