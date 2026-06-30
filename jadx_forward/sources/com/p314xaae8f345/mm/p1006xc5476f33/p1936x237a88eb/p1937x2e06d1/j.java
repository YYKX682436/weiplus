package com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1;

/* loaded from: classes15.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.k f233976a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.a f233977b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f233978c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f233979d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f233980e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f233981f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f233982g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f233983h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f233984i;

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f233985j;

    public j() {
        this.f233976a = null;
        this.f233977b = null;
        this.f233978c = false;
        this.f233979d = null;
        this.f233980e = null;
        this.f233981f = null;
        this.f233982g = null;
        this.f233984i = null;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f233985j = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6192x4fa59aa4>(a0Var) { // from class: com.tencent.mm.plugin.notification.base.AbstractSendMsgFailNotification$1
            {
                this.f39173x3fe91575 = -1487136588;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6192x4fa59aa4 c6192x4fa59aa4) {
                am.vz vzVar = c6192x4fa59aa4.f136449g;
                com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(vzVar.f89761a, vzVar.f89763c);
                com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d52 = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(vzVar.f89762b, vzVar.f89764d);
                com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j.this;
                jVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractSendMsgFailNotification", "updateMsgIdInMsgList, oldMsgId:%s, newMsgId:%s", c16564xb55e1d5.m66995x9616526c(), c16564xb55e1d52.m66995x9616526c());
                if (!jVar.f233976a.f233986a.contains(c16564xb55e1d5)) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.k kVar = jVar.f233976a;
                int indexOf = kVar.f233986a.indexOf(c16564xb55e1d5);
                if (indexOf == -1) {
                    return false;
                }
                kVar.f233986a.set(indexOf, c16564xb55e1d52);
                return false;
            }
        };
        this.f233976a = new com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.a(l());
        this.f233977b = aVar;
        this.f233978c = false;
        this.f233979d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        this.f233980e = new java.util.ArrayList();
        this.f233981f = new java.util.ArrayList();
        this.f233982g = new java.util.ArrayList();
        aVar.f233995e = new com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.c(this);
        aVar.f233996f = new com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.d(this);
        aVar.f233997g = new com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.e(this);
        this.f233984i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.f(this), true);
    }

    public void a() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.k kVar = this.f233976a;
        if (kVar == null || kVar.b() == 0) {
            int l17 = l();
            po3.e eVar = null;
            if (l17 == 1) {
                str = po3.f.a() + "/normalMsg";
            } else if (l17 == 2) {
                str = po3.f.a() + "/snsMsg";
            } else {
                str = null;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FailMsgFileCache", "extractFromDisk error, cannot find filename");
            } else {
                try {
                    java.lang.String M = com.p314xaae8f345.mm.vfs.w6.M(str);
                    po3.e eVar2 = new po3.e();
                    eVar2.a(M);
                    eVar = eVar2;
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FailMsgFileCache", e17, "", new java.lang.Object[0]);
                    e17.toString();
                }
            }
            if (eVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AbstractSendMsgFailNotification", "resetNotificationAfterCrash, cacheObj is null");
                return;
            }
            if (this.f233984i == null) {
                this.f233984i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.f(this), true);
            }
            int i17 = eVar.f438857b;
            java.util.ArrayList arrayList = eVar.f438858c;
            boolean isEmpty = arrayList.isEmpty();
            java.util.ArrayList arrayList2 = this.f233981f;
            java.util.ArrayList arrayList3 = this.f233980e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.k kVar2 = eVar.f438856a;
            java.util.ArrayList arrayList4 = eVar.f438859d;
            if (isEmpty && arrayList4.isEmpty() && i17 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.k kVar3 = this.f233976a;
                kVar3.f233986a.clear();
                kVar3.f233987b = 0;
                this.f233976a = kVar2;
                arrayList3.clear();
                arrayList2.clear();
                x();
                return;
            }
            if (arrayList.size() + arrayList4.size() >= kVar2.b()) {
                u();
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.k kVar4 = this.f233976a;
            kVar4.f233986a.clear();
            kVar4.f233987b = 0;
            this.f233976a = kVar2;
            kVar2.f233987b = i17;
            arrayList3.clear();
            arrayList3.addAll(arrayList);
            arrayList2.clear();
            arrayList2.addAll(arrayList4);
            z();
        }
    }

    public abstract boolean b(java.lang.String str, long j17);

    public java.lang.String c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        for (int i17 = 0; i17 < this.f233976a.b(); i17++) {
            sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) this.f233976a.f233986a.get(i17)).m66995x9616526c() + ", ");
        }
        return sb6.toString();
    }

    public void d() {
        java.lang.String str;
        int i17;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.k kVar = this.f233976a;
        int i18 = kVar.f233987b;
        java.util.ArrayList arrayList = this.f233980e;
        java.util.ArrayList arrayList2 = this.f233981f;
        new java.util.ArrayList();
        new java.util.ArrayList();
        new java.util.ArrayList();
        int l17 = l();
        if (l17 == 1) {
            str = po3.f.a() + "/normalMsg";
        } else if (l17 == 2) {
            str = po3.f.a() + "/snsMsg";
        } else {
            str = null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FailMsgFileCache", "flushToDisk error, cannot find filename");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (int i19 = 0; i19 < kVar.b(); i19++) {
                com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = (com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) kVar.f233986a.get(i19);
                jSONArray.put(c16564xb55e1d5.f231013d + "|" + c16564xb55e1d5.a());
            }
            kVar.b();
            jSONObject.put("msg_list", jSONArray);
            jSONObject.put("current_send_index", i18);
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d52 = (com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) it.next();
                jSONArray2.put(c16564xb55e1d52.f231013d + "|" + c16564xb55e1d52.a());
            }
            arrayList.size();
            jSONObject.put("success_msg_list", jSONArray2);
            org.json.JSONArray jSONArray3 = new org.json.JSONArray();
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d53 = (com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) it6.next();
                jSONArray3.put(c16564xb55e1d53.f231013d + "|" + c16564xb55e1d53.a());
            }
            arrayList2.size();
            jSONObject.put("fail_msg_list", jSONArray3);
            str2 = jSONObject.toString();
            i17 = 0;
        } catch (org.json.JSONException e17) {
            i17 = 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FailMsgFileCache", e17, "", new java.lang.Object[0]);
            str2 = null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.S(str, str2.getBytes(), i17, str2.length());
    }

    public abstract java.util.ArrayList e(java.lang.Object obj);

    public abstract java.lang.String f(int i17);

    public abstract long g(java.lang.Object obj);

    public abstract com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 h(java.lang.Object obj);

    public abstract java.lang.String i(int i17, int i18, int i19);

    public abstract java.lang.String j(int i17, int i18, int i19);

    public abstract java.lang.String k(int i17, int i18);

    public abstract int l();

    public void m() {
        this.f233976a.b();
        if (this.f233976a.b() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.k kVar = this.f233976a;
            kVar.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = kVar.f233986a.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = (com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) it.next();
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(c16564xb55e1d5.f231013d, c16564xb55e1d5.a()));
            }
            n(arrayList);
        }
    }

    public abstract void n(java.util.ArrayList arrayList);

    public void o() {
    }

    public abstract void p();

    public void q(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        g(obj);
        c();
        if (!this.f233978c) {
            java.util.ArrayList arrayList = this.f233982g;
            if (arrayList.contains(h(obj))) {
                arrayList.remove(h(obj));
                return;
            }
            java.util.ArrayList e17 = e(obj);
            if (e17 == null || e17.size() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AbstractSendMsgFailNotification", "showNotificationAfterSendFail, cannot get history fail msg");
                return;
            }
            w();
            com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.k kVar = this.f233976a;
            kVar.getClass();
            if (!e17.isEmpty()) {
                kVar.f233986a.addAll(e17);
            }
            d();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractSendMsgFailNotification", "showNotificationAfterSendFail, msgList.size:%d, msgList:%s", java.lang.Integer.valueOf(this.f233976a.b()), c());
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11426, java.lang.Integer.valueOf(l()));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.g(this), 1000L);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.k kVar2 = this.f233976a;
        boolean contains = kVar2.f233986a.contains(h(obj));
        java.util.ArrayList arrayList2 = this.f233981f;
        if (contains && !arrayList2.contains(h(obj))) {
            arrayList2.add(h(obj));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.k kVar3 = this.f233976a;
        if (!kVar3.f233986a.contains(h(obj))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.k kVar4 = this.f233976a;
            com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 h17 = h(obj);
            kVar4.getClass();
            long j17 = h17.f231013d;
            kVar4.f233986a.size();
            kVar4.f233986a.add(h17);
        }
        z();
        java.util.ArrayList arrayList3 = this.f233980e;
        arrayList3.size();
        arrayList2.size();
        if (arrayList3.size() + arrayList2.size() >= this.f233976a.b()) {
            u();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 a17 = this.f233976a.a();
        if (a17.f231013d == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TAG", "resend error, next msg id is -1");
        } else {
            d();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.h(this, a17), 200L);
        }
    }

    public void r(java.lang.Object obj) {
        g(obj);
        c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.k kVar = this.f233976a;
        if (kVar.f233986a.contains(h(obj))) {
            com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 h17 = h(obj);
            java.util.ArrayList arrayList = this.f233982g;
            boolean contains = arrayList.contains(h17);
            java.util.ArrayList arrayList2 = this.f233981f;
            if (contains && arrayList2.contains(h17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractSendMsgFailNotification", "receive send msg success event from a timout message, remvoe it from the fail list");
                arrayList.remove(h17);
                arrayList2.remove(h17);
            }
            if (!this.f233978c) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.k kVar2 = this.f233976a;
                kVar2.f233986a.remove(h(obj));
                int b17 = this.f233976a.b();
                com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.a aVar = this.f233977b;
                if (b17 != 0) {
                    aVar.e(f(this.f233976a.b()));
                    return;
                }
                aVar.a();
                w();
                po3.f.b(l());
                return;
            }
            java.util.ArrayList arrayList3 = this.f233980e;
            arrayList3.add(h17);
            z();
            arrayList3.size();
            arrayList2.size();
            if (arrayList3.size() + arrayList2.size() >= this.f233976a.b()) {
                u();
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 a17 = this.f233976a.a();
            if (a17.f231013d == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TAG", "resend error, next msg id is -1");
                return;
            }
            a17.m66995x9616526c();
            d();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.h(this, a17), 200L);
        }
    }

    public final void s() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < this.f233976a.b(); i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = (com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) this.f233976a.f233986a.get(i17);
            if (!b(c16564xb55e1d5.a(), c16564xb55e1d5.f231013d)) {
                arrayList.add(c16564xb55e1d5);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f233976a.f233986a.remove((com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) it.next());
        }
    }

    public void t() {
        this.f233976a.b();
        this.f233978c = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.a aVar = this.f233977b;
        aVar.getClass();
        aVar.f233992b = new z2.k0(aVar.f233993c, n25.a.b());
        aVar.c();
        aVar.d();
        aVar.f233992b.h(2, true);
        aVar.d();
        aVar.e(k(this.f233976a.b(), 0));
        this.f233976a.f233987b = 0;
        y();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f233985j;
        abstractC20980x9b9ad01d.mo48814x2efc64();
        abstractC20980x9b9ad01d.mo48813x58998cd();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.h(this, this.f233976a.a()), 200L);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f233984i;
        if (b4Var != null) {
            b4Var.c(300000L, 300000L);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AbstractSendMsgFailNotification", "startCheckMsgExistTimer error, timer is null");
        }
    }

    public final void u() {
        this.f233978c = false;
        this.f233976a.b();
        java.util.ArrayList arrayList = this.f233981f;
        arrayList.size();
        java.util.ArrayList arrayList2 = this.f233980e;
        arrayList2.size();
        this.f233976a.b();
        arrayList2.size();
        arrayList.size();
        s();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = (com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) it.next();
            if (!b(c16564xb55e1d5.a(), c16564xb55e1d5.f231013d)) {
                arrayList3.add(c16564xb55e1d5);
            }
        }
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            arrayList2.remove((com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) it6.next());
        }
        arrayList3.clear();
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d52 = (com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) it7.next();
            if (!b(c16564xb55e1d52.a(), c16564xb55e1d52.f231013d)) {
                arrayList3.add(c16564xb55e1d52);
            }
        }
        java.util.Iterator it8 = arrayList3.iterator();
        while (it8.hasNext()) {
            arrayList.remove((com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) it8.next());
        }
        this.f233976a.b();
        arrayList2.size();
        arrayList.size();
        if (arrayList.isEmpty()) {
            po3.f.b(l());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11425, java.lang.Integer.valueOf(l()), 0, java.lang.Integer.valueOf(arrayList2.size()), java.lang.Integer.valueOf(arrayList.size()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.a aVar = this.f233977b;
        aVar.f233992b.h(2, false);
        aVar.d();
        aVar.f233999i = f(this.f233976a.b());
        aVar.e(i(this.f233976a.b(), arrayList2.size(), arrayList.size()));
        aVar.f234003m = false;
        if (!arrayList.isEmpty()) {
            aVar.f233992b = new z2.k0(aVar.f233993c, n25.a.b());
            aVar.b();
            aVar.c();
            aVar.d();
            this.f233976a.f233987b = 0;
            if (!arrayList2.isEmpty()) {
                java.util.Iterator it9 = arrayList2.iterator();
                while (it9.hasNext()) {
                    this.f233976a.f233986a.remove((com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) it9.next());
                }
            }
            arrayList2.clear();
            arrayList.clear();
            d();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5748xcdc4bed7 c5748xcdc4bed7 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5748xcdc4bed7();
        c5748xcdc4bed7.f136069g.f88375a = l();
        c5748xcdc4bed7.e();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f233984i;
        if (b4Var != null) {
            b4Var.d();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AbstractSendMsgFailNotification", "stopCheckMsgExistTimer error, timer is null");
        }
        y();
        this.f233985j.mo48814x2efc64();
        o();
    }

    public abstract void v(java.lang.String str, long j17);

    public final void w() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.k kVar = this.f233976a;
        kVar.f233986a.clear();
        kVar.f233987b = 0;
        this.f233978c = false;
        this.f233980e.clear();
        this.f233981f.clear();
        y();
    }

    public final void x() {
        po3.p.wi().getClass();
        java.lang.String f17 = f(this.f233976a.b());
        com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.a aVar = this.f233977b;
        aVar.f233999i = f17;
        aVar.f233992b = new z2.k0(aVar.f233993c, n25.a.b());
        aVar.b();
        aVar.c();
        po3.p.wi().getClass();
        boolean z17 = aVar.f234002l;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f233985j;
        if (!z17) {
            aVar.f233998h = f(this.f233976a.b());
            aVar.f233992b.h(2, false);
            aVar.d();
            aVar.f234003m = false;
            aVar.d();
            abstractC20980x9b9ad01d.mo48814x2efc64();
            abstractC20980x9b9ad01d.mo48813x58998cd();
            return;
        }
        if (!z17) {
            po3.p.wi().getClass();
            return;
        }
        aVar.f233992b.h(2, false);
        aVar.d();
        aVar.f234003m = false;
        aVar.e(f(this.f233976a.b()));
        abstractC20980x9b9ad01d.mo48814x2efc64();
        abstractC20980x9b9ad01d.mo48813x58998cd();
    }

    public final void y() {
        java.util.ArrayList arrayList = this.f233983h;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) it.next()).d();
        }
        arrayList.clear();
        this.f233982g.clear();
    }

    public final void z() {
        java.lang.String f17 = f(this.f233976a.b());
        com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.a aVar = this.f233977b;
        aVar.f233999i = f17;
        java.util.ArrayList arrayList = this.f233981f;
        boolean isEmpty = arrayList.isEmpty();
        java.util.ArrayList arrayList2 = this.f233980e;
        if (isEmpty) {
            aVar.e(k(this.f233976a.b(), arrayList2.size() + arrayList.size()));
        } else {
            aVar.e(j(this.f233976a.b(), arrayList2.size() + arrayList.size(), arrayList.size()));
        }
    }
}
