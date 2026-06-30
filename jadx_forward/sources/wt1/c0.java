package wt1;

/* loaded from: classes15.dex */
public class c0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f530792d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f530793e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f530794f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f530795g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f530796h;

    public c0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f530793e = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f530794f = arrayList2;
        this.f530795g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.f530796h = linkedHashMap;
        gm0.j1.n().f354821b.a(1078, this);
        arrayList.clear();
        arrayList2.clear();
        linkedHashMap.clear();
    }

    public final void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardMarkCodeMgr", "cancelUnmark()");
        java.util.ArrayList arrayList = this.f530794f;
        if (arrayList.contains(str)) {
            arrayList.remove(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardMarkCodeMgr", "remove unmark card id in mUnMarkList. card is " + str);
        }
        java.util.HashMap hashMap = this.f530796h;
        if (hashMap.containsKey(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardMarkCodeMgr", "remove unmark card mask id in mId2Runner. card is " + str);
            java.lang.Runnable runnable = (java.lang.Runnable) hashMap.get(str);
            hashMap.remove(str);
            this.f530795g.mo50300x3fa464aa(runnable);
        }
    }

    public void b(java.lang.String str, int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardMarkCodeMgr", "doMarkCode()");
        a(str);
        java.util.ArrayList arrayList = this.f530793e;
        if (!arrayList.contains(str)) {
            arrayList.add(str);
        }
        c(str, i17, i18, i19);
    }

    public final void c(java.lang.String str, int i17, int i18, int i19) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardMarkCodeMgr", "card_id is empty, don't call NetSceneMarkShareCard cgi");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardMarkCodeMgr", "doMarkNetscene()");
        gm0.j1.n().f354821b.g(new fu1.d(str, i17, i18, i19));
    }

    public void d(java.lang.String str, int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardMarkCodeMgr", "doUnmarkCode()");
        a(str);
        this.f530794f.add(str);
        wt1.z zVar = new wt1.z(this, str, i17, i18, i19);
        this.f530795g.mo50297x7c4d7ca2(zVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).a().b(1, "ShareCard", "UnMarkDelay"), 0) * 1000);
        this.f530796h.put(str, zVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardMarkCodeMgr", "add unmark card mask id in mId2Runner. card is " + str + " system.time:" + java.lang.System.currentTimeMillis());
    }

    public final void e(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardMarkCodeMgr", "removeId()");
        java.util.ArrayList arrayList = this.f530793e;
        boolean contains = arrayList.contains(str);
        java.util.ArrayList arrayList2 = this.f530794f;
        if (contains && !arrayList2.contains(str)) {
            arrayList.remove(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardMarkCodeMgr", "remove mark card id in mMarkList. card is " + str);
        }
        if (arrayList.contains(str) || !arrayList2.contains(str)) {
            return;
        }
        arrayList2.remove(str);
        java.util.HashMap hashMap = this.f530796h;
        java.lang.Runnable runnable = (java.lang.Runnable) hashMap.get(str);
        hashMap.remove(str);
        this.f530795g.mo50300x3fa464aa(runnable);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardMarkCodeMgr", "remove unmark card id in mUnMarkList. card is " + str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardMarkCodeMgr", "remove unmark card mask id in mId2Runner. card is " + str);
    }

    public void f(wt1.a0 a0Var) {
        wt1.a0 a0Var2;
        if (this.f530792d == null || a0Var == null) {
            return;
        }
        for (int i17 = 0; i17 < this.f530792d.size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f530792d.get(i17);
            if (weakReference != null && (a0Var2 = (wt1.a0) weakReference.get()) != null && a0Var2.equals(a0Var)) {
                this.f530792d.remove(weakReference);
                return;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        wt1.a0 a0Var;
        wt1.a0 a0Var2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardMarkCodeMgr", "onSceneEnd, errType = " + i17 + " errCode = " + i18);
        int i19 = 0;
        java.util.ArrayList arrayList = this.f530794f;
        java.util.ArrayList arrayList2 = this.f530793e;
        if (i17 != 0 || i18 != 0) {
            if (m1Var instanceof fu1.d) {
                fu1.d dVar = (fu1.d) m1Var;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardMarkCodeMgr", "onSceneEnd, markFail original_card_id = " + dVar.f348365n);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardMarkCodeMgr", "onMarkFail()");
                java.util.List list = this.f530792d;
                java.lang.String str2 = dVar.f348365n;
                if (list != null) {
                    if (!arrayList2.contains(str2) || arrayList.contains(str2)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardMarkCodeMgr", "markSuccess the card is not in mark list");
                    } else {
                        while (i19 < ((java.util.ArrayList) this.f530792d).size()) {
                            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f530792d).get(i19);
                            if (weakReference != null && (a0Var = (wt1.a0) weakReference.get()) != null) {
                                a0Var.A1(str2, null, str);
                            }
                            i19++;
                        }
                    }
                }
                e(str2);
                return;
            }
            return;
        }
        if (m1Var instanceof fu1.d) {
            fu1.d dVar2 = (fu1.d) m1Var;
            wt1.b0 b0Var = new wt1.b0();
            b0Var.f530782a = dVar2.f348360f;
            b0Var.f530783b = dVar2.f348361g;
            b0Var.f530784c = dVar2.f348362h;
            b0Var.f530785d = dVar2.f348363i;
            b0Var.f530786e = dVar2.f348364m;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd, markSuccess original_card_id = ");
            java.lang.String str3 = dVar2.f348365n;
            sb6.append(str3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardMarkCodeMgr", sb6.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardMarkCodeMgr", "mark_user:" + b0Var.f530782a + " mark_succ:" + b0Var.f530783b + " mark_card_id:" + b0Var.f530784c + " expire_time:" + b0Var.f530785d + " pay_qrcode_wording:" + b0Var.f530786e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardMarkCodeMgr", "markSuccess()");
            if (this.f530792d != null) {
                if (arrayList2.contains(str3) || arrayList.contains(str3)) {
                    while (i19 < ((java.util.ArrayList) this.f530792d).size()) {
                        java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f530792d).get(i19);
                        if (weakReference2 != null && (a0Var2 = (wt1.a0) weakReference2.get()) != null) {
                            if (arrayList2.contains(str3)) {
                                a0Var2.C5(str3, b0Var);
                            } else if (arrayList.contains(str3)) {
                                a0Var2.p4(str3, b0Var);
                            }
                        }
                        i19++;
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardMarkCodeMgr", "markSuccess the card id is not in mark list and un mark list.");
                }
            }
            e(str3);
        }
    }
}
