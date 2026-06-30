package c01;

/* loaded from: classes9.dex */
public class l1 implements l75.q0 {

    /* renamed from: g, reason: collision with root package name */
    public static final c01.l1 f118831g = new c01.l1();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f118832d;

    /* renamed from: e, reason: collision with root package name */
    public final kk.t f118833e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f118834f;

    public l1() {
        boolean z17 = true;
        if (!o45.wf.f424566k && !j62.e.g().l("clicfg_chatroom_member_display_name_cache", false, true, true)) {
            z17 = false;
        }
        this.f118834f = z17;
        if (!z17) {
            this.f118832d = null;
            this.f118833e = null;
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_chatroom_display_name_cache");
        this.f118832d = M;
        this.f118833e = new kk.t(300);
        for (java.lang.String str : M.b()) {
            this.f118833e.b(str, this.f118832d.t(str));
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        if (a17 == null) {
            this.f118834f = false;
        } else {
            a17.add(this);
        }
    }

    public final void a() {
        java.util.Map.Entry[] entryArr;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatroomDisplayNameCache", "sync LRU cache to mmkv");
        this.f118832d.d();
        kk.t tVar = this.f118833e;
        synchronized (tVar) {
            entryArr = (java.util.Map.Entry[]) java.util.Arrays.copyOf(tVar.f390008b, tVar.f390010d);
        }
        for (java.util.Map.Entry entry : entryArr) {
            this.f118832d.D((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, final l75.w0 w0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatroomDisplayNameCache", "onNotifyChange, update cache");
        ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: c01.l1$$b
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.Object obj;
                c01.l1 l1Var = c01.l1.this;
                l75.w0 w0Var2 = w0Var;
                l1Var.getClass();
                if (w0Var2.f398507b == 4) {
                    java.lang.Object obj2 = w0Var2.f398509d;
                    if (obj2 instanceof com.p314xaae8f345.mm.p2621x8fb0427b.a3) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.a3) obj2;
                        java.lang.String str2 = a3Var.f69088x37548063;
                        if (a3Var.I0(a3Var.f275277b2)) {
                            a3Var.t0();
                        }
                        java.util.Iterator it = a3Var.f275277b2.f411772d.iterator();
                        boolean z17 = false;
                        while (it.hasNext()) {
                            mo.b bVar = (mo.b) it.next();
                            java.lang.String str3 = str2 + "::" + bVar.f411780d;
                            java.lang.String str4 = bVar.f411781e;
                            if (str4 == null) {
                                str4 = "";
                            }
                            kk.t tVar = l1Var.f118833e;
                            synchronized (tVar) {
                                kk.s sVar = (kk.s) tVar.f390009c.get(str3);
                                if (sVar != null) {
                                    obj = sVar.f390004e;
                                    sVar.f390004e = str4;
                                } else {
                                    obj = null;
                                }
                            }
                            java.lang.String str5 = (java.lang.String) obj;
                            if (str5 != null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatroomDisplayNameCache", "update: roomId=%s, username=%s, oldDisplayName=%s, newDisplayName=%s", str2, bVar.f411780d, str5, bVar.f411781e);
                                z17 = true;
                            }
                        }
                        if (z17) {
                            l1Var.a();
                        }
                    }
                }
            }
        });
    }
}
