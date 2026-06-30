package zn0;

/* loaded from: classes3.dex */
public class y {

    /* renamed from: e, reason: collision with root package name */
    public zn0.z f555952e;

    /* renamed from: b, reason: collision with root package name */
    public int f555949b = 1;

    /* renamed from: c, reason: collision with root package name */
    public int f555950c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f555948a = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f555951d = new java.util.concurrent.ConcurrentHashMap();

    public y(zn0.w wVar) {
    }

    public static zn0.y c() {
        return zn0.x.f555947a;
    }

    public void a(zn0.v vVar) {
        if (vVar != null) {
            fn0.g gVar = fn0.g.f345728a;
            hn0.g gVar2 = fn0.g.f345729b;
            java.lang.String str = vVar.f555939d;
            ((vd2.l5) gVar2).getClass();
            mm2.o4 o4Var = (mm2.o4) dk2.ef.f314905a.i(mm2.o4.class);
            int i17 = 0;
            if (o4Var != null) {
                java.util.List list = o4Var.f410868z;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-linkMicUserInfoList>(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj).f390703a, str)) {
                        arrayList.add(obj);
                    }
                }
                km2.q qVar = (km2.q) kz5.n0.a0(arrayList, 0);
                java.lang.Integer valueOf = qVar != null ? java.lang.Integer.valueOf(qVar.f390725w) : null;
                if (valueOf != null) {
                    i17 = valueOf.intValue();
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteUserConfigHelper", "addRemoteUser: userName:" + vVar.f555939d + " seatPosition: " + i17);
            vVar.f555946n = i17;
        }
        f();
        this.f555948a.add(vVar);
        g();
    }

    public void b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clear mRemoteUserConfigList size: ");
        java.util.ArrayList arrayList = this.f555948a;
        sb6.append(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteUserConfigHelper", sb6.toString());
        f();
        arrayList.clear();
        g();
    }

    public zn0.v d(java.lang.String str) {
        java.util.Iterator it = this.f555948a.iterator();
        while (it.hasNext()) {
            zn0.v vVar = (zn0.v) it.next();
            if (str.equals(vVar.f555939d)) {
                return vVar;
            }
        }
        return null;
    }

    public java.util.List e() {
        return this.f555948a;
    }

    public final void f() {
        zn0.z zVar = this.f555952e;
        if (zVar != null) {
            int size = this.f555948a.size();
            df2.tu tuVar = (df2.tu) zVar;
            tuVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCPerformanceDetector", "notifyRemoteUserSizeBeforeChange: size: " + size);
            if (tuVar.Z6()) {
                tuVar.f313008o = 0;
                tuVar.f313009p = 0;
                tuVar.f313010q = 0;
                zn0.y yVar = zn0.x.f555947a;
                tuVar.f313008o = yVar.f555948a.size();
                java.util.ArrayList arrayList = yVar.f555948a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrayList, "getRemoteUserConfigList(...)");
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((zn0.v) it.next()).f555941f) {
                        tuVar.f313009p++;
                    } else {
                        tuVar.f313010q++;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCPerformanceDetector", "updateMicSize micTotalSize: " + tuVar.f313008o + " micVideoSize: " + tuVar.f313009p + " micAudioSize: " + tuVar.f313010q + ' ');
                tuVar.a7();
            }
        }
    }

    public final void g() {
        zn0.z zVar = this.f555952e;
        if (zVar != null) {
            int size = this.f555948a.size();
            df2.tu tuVar = (df2.tu) zVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCPerformanceDetector", "notifyRemoteUserSizeChange size: " + size);
            if (tuVar.Z6() && size > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCPerformanceDetector", "onPerformanceStart performanceEnable: " + tuVar.Z6());
                if (tuVar.Z6()) {
                    tuVar.f313011r = true;
                    ts5.d dVar = (ts5.d) ((jz5.n) tuVar.f313007n).mo141623x754a37bb();
                    if (dVar != null) {
                        dVar.mo149996x68ac462();
                    }
                }
            }
        }
    }

    public void h(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteUserConfigHelper", "removeRemoteUser: target userName:" + str);
        f();
        java.util.Iterator it = this.f555948a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (str.equals(((zn0.v) it.next()).f555939d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteUserConfigHelper", "removeRemoteUser: find userName:" + str + ", remove");
                it.remove();
                break;
            }
        }
        g();
    }

    public void i(java.lang.String str) {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteUserConfigHelper", "setCurrentSessionId: sessionId:" + str);
        if (str != null) {
            java.util.Iterator it = this.f555948a.iterator();
            while (it.hasNext()) {
                zn0.v vVar = (zn0.v) it.next();
                try {
                    i17 = java.lang.Integer.parseInt(vVar.f555944i);
                } catch (java.lang.NumberFormatException unused) {
                    i17 = 0;
                }
                j(str, vVar.f555939d, i17, vVar.f555945m);
            }
        }
    }

    public void j(java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteUserConfigHelper", "updateCacheUserInfoMap: sessionId:" + str + ", userId:" + str2 + ", roomId:" + i17 + ", isAnchor:" + z17);
        if (str == null || str2 == null) {
            return;
        }
        java.util.Map map = this.f555951d;
        java.util.Map map2 = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
        if (map2 == null) {
            map2 = new java.util.concurrent.ConcurrentHashMap();
        }
        zn0.v vVar = new zn0.v("");
        vVar.f555944i = i17 + "";
        vVar.f555945m = z17;
        map2.put(str2, vVar);
        ((java.util.concurrent.ConcurrentHashMap) map).put(str, map2);
    }
}
