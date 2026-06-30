package c01;

/* loaded from: classes9.dex */
public class l1 implements l75.q0 {

    /* renamed from: g, reason: collision with root package name */
    public static final c01.l1 f37298g = new c01.l1();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f37299d;

    /* renamed from: e, reason: collision with root package name */
    public final kk.t f37300e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f37301f;

    public l1() {
        boolean z17 = true;
        if (!o45.wf.f343033k && !j62.e.g().l("clicfg_chatroom_member_display_name_cache", false, true, true)) {
            z17 = false;
        }
        this.f37301f = z17;
        if (!z17) {
            this.f37299d = null;
            this.f37300e = null;
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("mmkv_chatroom_display_name_cache");
        this.f37299d = M;
        this.f37300e = new kk.t(300);
        for (java.lang.String str : M.b()) {
            this.f37300e.b(str, this.f37299d.t(str));
        }
        com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        if (a17 == null) {
            this.f37301f = false;
        } else {
            a17.add(this);
        }
    }

    public final void a() {
        java.util.Map.Entry[] entryArr;
        com.tencent.mars.xlog.Log.i("ChatroomDisplayNameCache", "sync LRU cache to mmkv");
        this.f37299d.d();
        kk.t tVar = this.f37300e;
        synchronized (tVar) {
            entryArr = (java.util.Map.Entry[]) java.util.Arrays.copyOf(tVar.f308475b, tVar.f308477d);
        }
        for (java.util.Map.Entry entry : entryArr) {
            this.f37299d.D((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, final l75.w0 w0Var) {
        com.tencent.mars.xlog.Log.i("ChatroomDisplayNameCache", "onNotifyChange, update cache");
        ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: c01.l1$$b
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.Object obj;
                c01.l1 l1Var = c01.l1.this;
                l75.w0 w0Var2 = w0Var;
                l1Var.getClass();
                if (w0Var2.f316974b == 4) {
                    java.lang.Object obj2 = w0Var2.f316976d;
                    if (obj2 instanceof com.tencent.mm.storage.a3) {
                        com.tencent.mm.storage.a3 a3Var = (com.tencent.mm.storage.a3) obj2;
                        java.lang.String str2 = a3Var.field_chatroomname;
                        if (a3Var.I0(a3Var.f193744b2)) {
                            a3Var.t0();
                        }
                        java.util.Iterator it = a3Var.f193744b2.f330239d.iterator();
                        boolean z17 = false;
                        while (it.hasNext()) {
                            mo.b bVar = (mo.b) it.next();
                            java.lang.String str3 = str2 + "::" + bVar.f330247d;
                            java.lang.String str4 = bVar.f330248e;
                            if (str4 == null) {
                                str4 = "";
                            }
                            kk.t tVar = l1Var.f37300e;
                            synchronized (tVar) {
                                kk.s sVar = (kk.s) tVar.f308476c.get(str3);
                                if (sVar != null) {
                                    obj = sVar.f308471e;
                                    sVar.f308471e = str4;
                                } else {
                                    obj = null;
                                }
                            }
                            java.lang.String str5 = (java.lang.String) obj;
                            if (str5 != null) {
                                com.tencent.mars.xlog.Log.i("ChatroomDisplayNameCache", "update: roomId=%s, username=%s, oldDisplayName=%s, newDisplayName=%s", str2, bVar.f330247d, str5, bVar.f330248e);
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
