package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes8.dex */
public class x3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: e, reason: collision with root package name */
    public final w33.a f220878e;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f220884n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15864xd9ff93c2 f220885o;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f220877d = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final w33.a f220879f = new w33.a(5, null, false, null, null, new w33.d(true, false, false));

    /* renamed from: g, reason: collision with root package name */
    public boolean f220880g = false;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f220881h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f220882i = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: m, reason: collision with root package name */
    public boolean f220883m = false;

    public x3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15864xd9ff93c2 c15864xd9ff93c2, boolean z17) {
        this.f220885o = c15864xd9ff93c2;
        this.f220878e = new w33.a(1, null, false, c15864xd9ff93c2.f220533f2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fod));
        this.f220884n = false;
        this.f220884n = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRoomListView", "MyChatroomAdapter enableCollapse = " + z17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.concurrent.CopyOnWriteArrayList) this.f220877d).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((w33.a) ((java.util.concurrent.CopyOnWriteArrayList) this.f220877d).get(i17)).f524232a;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        if (k3Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d x17 = x(i17);
        java.util.List list = this.f220877d;
        int i18 = 0;
        if (x17 != null && mo863xcdaf1228(i17) == 2) {
            i18 = i17 - ((java.util.concurrent.CopyOnWriteArrayList) list).indexOf(this.f220878e);
        }
        int i19 = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d x18 = x(i17);
        int mo863xcdaf1228 = mo863xcdaf1228(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15864xd9ff93c2 c15864xd9ff93c2 = this.f220885o;
        if (x18 != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f220881h;
            if (!arrayList.contains(x18.f36490x3923b317)) {
                arrayList.add(x18.f36490x3923b317);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("reportStr", x18.f36497x732388a6);
                } catch (java.lang.Exception unused) {
                }
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
                if (mo863xcdaf1228 == 2) {
                    fVar.k(1001L, i19, 1L, 0L, c15864xd9ff93c2.f220536i2, c15864xd9ff93c2.f220535h2, x18.f36482x58b82fc, x18.f36490x3923b317, jSONObject.toString());
                } else if (mo863xcdaf1228 == 4) {
                    fVar.k(1002L, i19, 1L, 0L, c15864xd9ff93c2.f220536i2, c15864xd9ff93c2.f220535h2, x18.f36482x58b82fc, x18.f36490x3923b317, jSONObject.toString());
                }
            }
        }
        w33.a aVar = (w33.a) ((java.util.concurrent.CopyOnWriteArrayList) list).get(i17);
        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15864xd9ff93c2.f220532q2;
        c15864xd9ff93c2.getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.t0) k3Var).i(aVar, null, i19, c15864xd9ff93c2.f220536i2, c15864xd9ff93c2.f220535h2, c15864xd9ff93c2.f220537j2);
        if (k3Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.w0) {
            w33.d dVar = ((w33.a) ((java.util.concurrent.CopyOnWriteArrayList) list).get(i17)).f524237f;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.w0) k3Var).j(dVar.f524246a, dVar.f524247b);
            k3Var.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.w3(this, i17, k3Var, dVar));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 i1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15864xd9ff93c2 c15864xd9ff93c2 = this.f220885o;
        if (i17 != 1) {
            if (i17 == 2) {
                i1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.v0(android.view.LayoutInflater.from(c15864xd9ff93c2.f220533f2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c5s, viewGroup, false));
            } else if (i17 != 3) {
                if (i17 != 5) {
                    return null;
                }
                i1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.w0(android.view.LayoutInflater.from(c15864xd9ff93c2.f220533f2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bmf, viewGroup, false));
            }
            return i1Var;
        }
        i1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i1(android.view.LayoutInflater.from(c15864xd9ff93c2.f220533f2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569922rz, viewGroup, false));
        return i1Var;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d x(int i17) {
        w33.a aVar;
        java.util.List list = this.f220877d;
        if (i17 >= ((java.util.concurrent.CopyOnWriteArrayList) list).size() || i17 < 0 || (aVar = (w33.a) ((java.util.concurrent.CopyOnWriteArrayList) list).get(i17)) == null) {
            return null;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.j1.b(aVar);
    }

    public void y(boolean z17) {
        java.util.List list = this.f220877d;
        ((java.util.concurrent.CopyOnWriteArrayList) list).clear();
        ((java.util.concurrent.CopyOnWriteArrayList) list).add(this.f220878e);
        this.f220883m = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15864xd9ff93c2 c15864xd9ff93c2 = this.f220885o;
        w33.a aVar = this.f220879f;
        java.util.List list2 = this.f220882i;
        if (z17) {
            aVar.f524237f.f524246a = true;
            ((java.util.concurrent.CopyOnWriteArrayList) list).addAll(list2);
            m8153xd399a4d9(4, ((java.util.concurrent.CopyOnWriteArrayList) list2).size() - 3);
            c15864xd9ff93c2.getClass();
        } else {
            ((java.util.concurrent.CopyOnWriteArrayList) list).addAll(((java.util.concurrent.CopyOnWriteArrayList) list2).subList(0, 3));
            aVar.f524237f.f524246a = false;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = c15864xd9ff93c2.p0(3);
            if (p07 != null) {
                p07.f3639x46306858.getGlobalVisibleRect(new android.graphics.Rect());
            }
            c15864xd9ff93c2.getClass();
            m8154xdb81fc7f(4, ((java.util.concurrent.CopyOnWriteArrayList) list2).size() - 3);
        }
        ((java.util.concurrent.CopyOnWriteArrayList) list).add(aVar);
        m8147xed6e4d18(((java.util.concurrent.CopyOnWriteArrayList) list).size() - 1);
    }

    public synchronized void z(java.util.List list) {
        if (list != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedList.add(new w33.a(2, (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d) it.next()));
            }
            this.f220885o.getClass();
            ((java.util.concurrent.CopyOnWriteArrayList) this.f220877d).clear();
            if (list.size() != 0) {
                ((java.util.concurrent.CopyOnWriteArrayList) this.f220877d).add(0, this.f220878e);
                ((java.util.concurrent.CopyOnWriteArrayList) this.f220882i).clear();
                ((java.util.concurrent.CopyOnWriteArrayList) this.f220882i).addAll(linkedList);
                if (list.size() <= 3 || !this.f220884n) {
                    ((java.util.concurrent.CopyOnWriteArrayList) this.f220877d).addAll(linkedList);
                } else {
                    if (this.f220879f.f524237f.f524246a) {
                        ((java.util.concurrent.CopyOnWriteArrayList) this.f220877d).addAll(1, linkedList);
                    } else {
                        ((java.util.concurrent.CopyOnWriteArrayList) this.f220877d).addAll(1, linkedList.subList(0, 3));
                        long j17 = 0;
                        for (int i17 = 3; i17 < list.size(); i17++) {
                            j17 += ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d) list.get(i17)).f36789xd8fdd641;
                        }
                        if (j17 > 0) {
                            this.f220879f.f524237f.f524247b = true;
                        }
                    }
                    ((java.util.concurrent.CopyOnWriteArrayList) this.f220877d).add(this.f220879f);
                }
                if (!this.f220880g) {
                    this.f220880g = true;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("GroupNum", linkedList.size());
                    } catch (org.json.JSONException unused) {
                    }
                    com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15864xd9ff93c2 c15864xd9ff93c2 = this.f220885o;
                    fVar.k(1001L, 0L, 1L, 0L, c15864xd9ff93c2.f220536i2, c15864xd9ff93c2.f220535h2, "", "", jSONObject.toString());
                }
            }
            m8146xced61ae5();
        }
    }
}
