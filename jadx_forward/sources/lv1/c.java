package lv1;

/* loaded from: classes8.dex */
public class c extends fv1.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e f403026e;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e serviceC13094x9254a35e) {
        this.f403026e = serviceC13094x9254a35e;
    }

    @Override // fv1.c
    public boolean Ba(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e.f177051g).get(str);
        if (str2 != null) {
            com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37941xd93b98fc(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadServiceSlot", "removeDownloadTask, cronetId".concat(str2));
            return true;
        }
        hv1.d.f().c(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadServiceSlot", "removeDownloadTask: true");
        return true;
    }

    @Override // fv1.c
    public boolean Je(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e.f177051g).get(str);
        if (str2 != null) {
            com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37941xd93b98fc(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadServiceSlot", "pauseDownloadTask, cronetId".concat(str2));
            return true;
        }
        hv1.d.f().d(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadServiceSlot", "pauseDownloadTask: true");
        return true;
    }

    @Override // fv1.c
    public void Vf() {
    }

    @Override // fv1.c
    public void Wb() {
        vk0.e eVar = vk0.c.f519284a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e serviceC13094x9254a35e = this.f403026e;
        if (eVar.b(serviceC13094x9254a35e)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadServiceSlot", "addIPCTaskMarker");
        eVar.a(serviceC13094x9254a35e);
    }

    @Override // fv1.c
    public void X8(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadServiceSlot", "notifyNetworkChange: " + i17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37522xde9f63df();
        if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()) {
            com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84235xde9f63df();
        }
    }

    @Override // fv1.c
    public int aa(com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00 c13091xf399cf00) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadServiceSlot", "resumeDownloadTask: %s, enableBrotli:%d", c13091xf399cf00.f177032e, java.lang.Integer.valueOf(c13091xf399cf00.f177043s ? 1 : 0));
        if (!c13091xf399cf00.f177043s) {
            dn.m mVar = new dn.m();
            mVar.f323318d = "task_CDNDownloadServiceSlot_2";
            mVar.F = c13091xf399cf00.f177031d;
            mVar.f69601xaca5bdda = c13091xf399cf00.f177033f;
            mVar.f69595x6d25b0d9 = c13091xf399cf00.f177034g;
            vz.y1 y1Var = (vz.y1) i95.n0.c(vz.y1.class);
            java.lang.String str = c13091xf399cf00.f177032e;
            ((uz.a2) y1Var).getClass();
            mVar.f323344z = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.f.a(str);
            vz.y1 y1Var2 = (vz.y1) i95.n0.c(vz.y1.class);
            java.lang.String str2 = c13091xf399cf00.f177035h;
            ((uz.a2) y1Var2).getClass();
            mVar.I = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.f.a(str2);
            mVar.f323320f = com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e.f177052h;
            mVar.A = c13091xf399cf00.f177037m;
            mVar.B = c13091xf399cf00.f177038n;
            mVar.E = c13091xf399cf00.f177040p;
            mVar.G = c13091xf399cf00.f177039o;
            mVar.H = true;
            mVar.f69593x419c9c3d = c13091xf399cf00.f177042r;
            com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e.a(this.f403026e, mVar, c13091xf399cf00.f177036i);
            int g17 = hv1.d.f().g(mVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadServiceSlot", "resumeDownloadTask: " + g17);
            return g17;
        }
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams();
        cronetRequestParams.f18181xe78dee5f = 2;
        vz.y1 y1Var3 = (vz.y1) i95.n0.c(vz.y1.class);
        java.lang.String str3 = c13091xf399cf00.f177032e;
        ((uz.a2) y1Var3).getClass();
        cronetRequestParams.url = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.f.a(str3);
        cronetRequestParams.f18166x25da56ad = true;
        cronetRequestParams.f18177xa943cc02 = true;
        cronetRequestParams.f18179x84749342 = c13091xf399cf00.f177034g;
        cronetRequestParams.f18174xbfc5d0e1 = "GET";
        cronetRequestParams.f18163x7e503dd5 = true;
        cronetRequestParams.f18162x5806d9f4 = true;
        cronetRequestParams.f18164xd851d150 = true;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str4 = c13091xf399cf00.f177036i;
        if (str4 != null && !str4.isEmpty()) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(c13091xf399cf00.f177036i);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    hashMap.put(next, jSONObject.optString(next));
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CDNDownloadServiceSlot", "ex:" + th6);
            }
            if (!hashMap.isEmpty()) {
                cronetRequestParams.f18165x49e3a589 = true;
            }
        }
        if (hashMap.containsKey("Accept-Encoding")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadServiceSlot", "startCronetHttpsRequest Accept-Encoding:%s", hashMap.get("Accept-Encoding"));
        } else {
            hashMap.put("Accept-Encoding", "gzip,compress,br,deflate");
        }
        cronetRequestParams.m37968xeb7416ae(hashMap);
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetHttpsCreateResult m37961xaa3ad68c = com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37961xaa3ad68c(cronetRequestParams, com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e.f177053i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadServiceSlot", "use cronet， addDownloadTask: " + m37961xaa3ad68c + ", cronet taskId: " + m37961xaa3ad68c.f18158xcb7ef180);
        ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e.f177050f).put(m37961xaa3ad68c.f18158xcb7ef180, c13091xf399cf00.f177033f);
        ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e.f177051g).put(c13091xf399cf00.f177032e, m37961xaa3ad68c.f18158xcb7ef180);
        return m37961xaa3ad68c.f18157x23aa2e05;
    }

    @Override // fv1.c
    public void ca(fv1.f fVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadServiceSlot", "registerCallback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e.f177049e = fVar;
    }

    @Override // fv1.c
    public void d3(fv1.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e.f177049e = null;
    }

    @Override // fv1.c
    public void m5() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadServiceSlot", "removeIPCTaskMarker");
        vk0.c.f519284a.c(this.f403026e);
    }

    @Override // fv1.c
    public com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13092x802fa47f p6(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0 c4446x11b6e6e0 = (com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class);
        if (c4446x11b6e6e0 == null) {
            c4446x11b6e6e0 = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0(com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179());
            com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37617xa38667cc(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class, c4446x11b6e6e0);
        }
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CdnTaskStateInfo m37751x7d770260 = c4446x11b6e6e0.m37751x7d770260(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13092x802fa47f c13092x802fa47f = new com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13092x802fa47f();
        if (m37751x7d770260 != null) {
            c13092x802fa47f.f177044d = m37751x7d770260.f18033xa1f4a0c;
            c13092x802fa47f.f177046f = (int) m37751x7d770260.f18032xb68f8349;
            c13092x802fa47f.f177045e = (int) m37751x7d770260.f18031xe78f40da;
        }
        return c13092x802fa47f;
    }

    @Override // fv1.c
    public int y2(com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00 c13091xf399cf00) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadServiceSlot", "addDownloadTask: %s filepath:%s enableBrotli:%d", c13091xf399cf00.f177032e, c13091xf399cf00.f177034g, java.lang.Integer.valueOf(c13091xf399cf00.f177043s ? 1 : 0));
        if (!c13091xf399cf00.f177043s) {
            dn.m mVar = new dn.m();
            mVar.f323318d = "task_CDNDownloadServiceSlot_1";
            mVar.F = c13091xf399cf00.f177031d;
            mVar.f69601xaca5bdda = c13091xf399cf00.f177033f;
            mVar.f69595x6d25b0d9 = c13091xf399cf00.f177034g;
            vz.y1 y1Var = (vz.y1) i95.n0.c(vz.y1.class);
            java.lang.String str = c13091xf399cf00.f177032e;
            ((uz.a2) y1Var).getClass();
            mVar.f323344z = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.f.a(str);
            vz.y1 y1Var2 = (vz.y1) i95.n0.c(vz.y1.class);
            java.lang.String str2 = c13091xf399cf00.f177035h;
            ((uz.a2) y1Var2).getClass();
            mVar.I = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.f.a(str2);
            mVar.f323320f = com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e.f177052h;
            mVar.A = c13091xf399cf00.f177037m;
            mVar.B = c13091xf399cf00.f177038n;
            mVar.G = c13091xf399cf00.f177039o;
            mVar.E = c13091xf399cf00.f177040p;
            mVar.f69593x419c9c3d = c13091xf399cf00.f177042r;
            com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e.a(this.f403026e, mVar, c13091xf399cf00.f177036i);
            int b17 = hv1.d.f().b(mVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadServiceSlot", "addDownloadTask: " + b17);
            return b17;
        }
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams();
        cronetRequestParams.f18181xe78dee5f = 2;
        vz.y1 y1Var3 = (vz.y1) i95.n0.c(vz.y1.class);
        java.lang.String str3 = c13091xf399cf00.f177032e;
        ((uz.a2) y1Var3).getClass();
        cronetRequestParams.url = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.f.a(str3);
        cronetRequestParams.f18166x25da56ad = true;
        cronetRequestParams.f18177xa943cc02 = true;
        cronetRequestParams.f18179x84749342 = c13091xf399cf00.f177034g;
        cronetRequestParams.f18174xbfc5d0e1 = "GET";
        cronetRequestParams.f18163x7e503dd5 = true;
        cronetRequestParams.f18164xd851d150 = true;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str4 = c13091xf399cf00.f177036i;
        if (str4 != null && !str4.isEmpty()) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(c13091xf399cf00.f177036i);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    hashMap.put(next, jSONObject.optString(next));
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CDNDownloadServiceSlot", "ex:" + th6);
            }
            if (!hashMap.isEmpty()) {
                cronetRequestParams.f18165x49e3a589 = true;
            }
        }
        if (hashMap.containsKey("Accept-Encoding")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadServiceSlot", "startCronetHttpsRequest Accept-Encoding:%s", hashMap.get("Accept-Encoding"));
        } else {
            hashMap.put("Accept-Encoding", "gzip,compress,br,deflate");
        }
        cronetRequestParams.m37968xeb7416ae(hashMap);
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetHttpsCreateResult m37961xaa3ad68c = com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37961xaa3ad68c(cronetRequestParams, com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e.f177053i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadServiceSlot", "use cronet， addDownloadTask: " + m37961xaa3ad68c + ", cronet taskId: " + m37961xaa3ad68c.f18158xcb7ef180);
        ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e.f177050f).put(m37961xaa3ad68c.f18158xcb7ef180, c13091xf399cf00.f177033f);
        ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e.f177051g).put(c13091xf399cf00.f177032e, m37961xaa3ad68c.f18158xcb7ef180);
        return m37961xaa3ad68c.f18157x23aa2e05;
    }
}
