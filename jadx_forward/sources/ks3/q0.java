package ks3;

/* loaded from: classes4.dex */
public class q0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f393271d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f393272e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f393273f;

    /* renamed from: g, reason: collision with root package name */
    public int f393274g;

    public q0() {
        new java.util.HashMap();
        new java.util.LinkedHashMap();
        new java.util.LinkedHashMap();
        new java.util.HashMap();
        this.f393271d = new java.util.HashMap();
        this.f393272e = new java.util.HashMap();
        this.f393273f = new java.util.HashMap();
        this.f393274g = 0;
        new java.util.ArrayList();
        new java.util.HashMap();
        gm0.j1.n().f354821b.a(483, this);
        gm0.j1.n().f354821b.a(484, this);
        gm0.j1.n().f354821b.a(485, this);
    }

    public final java.util.ArrayList a(java.util.HashMap hashMap) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.Long) it.next());
        }
        return arrayList;
    }

    public final void b(ks3.d0 d0Var) {
        java.util.HashMap hashMap;
        int i17 = this.f393274g + 1;
        this.f393274g = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareModeMailAppService", "processCheckImgStatusSceneEnd, checkTimes: %d", java.lang.Integer.valueOf(i17));
        java.util.Iterator it = ((ks3.d) d0Var.f393186e.f152244b.f152233a).f393184e.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = this.f393271d;
            if (!hasNext) {
                break;
            }
            ks3.g gVar = (ks3.g) it.next();
            long j17 = gVar.f393204d;
            int i18 = gVar.f393206f;
            if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareModeMailAppService", "msgSvrId: %d, status: %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18));
                if (i18 == 0) {
                    hashMap.remove(java.lang.Long.valueOf(j17));
                    if (gVar.f393205e != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareModeMailAppService", "msgSvrId: %d, attachId: %s", java.lang.Long.valueOf(j17), gVar.f393205e);
                        this.f393272e.put(java.lang.Long.valueOf(j17), gVar.f393205e);
                        this.f393273f.put(gVar.f393205e, java.lang.Integer.valueOf(gVar.f393207g));
                    }
                } else {
                    hashMap.put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18));
                }
            }
        }
        if (hashMap.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareModeMailAppService", "all image is in server");
        } else {
            if (this.f393274g >= 3) {
                a(hashMap);
                throw null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareModeMailAppService", "checkTime small than limit, doScene again");
            gm0.j1.n().f354821b.g(new ks3.d0(a(hashMap)));
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareModeMailAppService", "onSceneEnd, errType: %d, errCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareModeMailAppService", "errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (m1Var.mo808xfb85f7b0() == 483) {
                b((ks3.d0) m1Var);
                return;
            }
            return;
        }
        if (m1Var.mo808xfb85f7b0() == 483) {
            b((ks3.d0) m1Var);
        } else if (m1Var.mo808xfb85f7b0() == 484) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(m1Var);
        } else if (m1Var.mo808xfb85f7b0() == 485) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(m1Var);
        }
    }
}
