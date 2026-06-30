package r61;

/* loaded from: classes8.dex */
public class t1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f474488d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f474489e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f474490f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f474491g = (java.lang.String) gm0.j1.u().c().l(6, null);

    /* renamed from: i, reason: collision with root package name */
    public int f474493i = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f474492h = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f474494m = 1;

    public t1(java.util.List list, java.util.List list2) {
        this.f474489e = list;
        this.f474490f = list2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f474488d = u0Var;
        java.util.List list = this.f474490f;
        java.util.List list2 = this.f474489e;
        if ((list2 == null || list2.size() == 0) && (list == null || list.size() == 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadMContact", "listMobile or listEmile is null or zero");
            return -1;
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.fu6();
        lVar.f152198b = new r45.gu6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/uploadmcontact";
        lVar.f152200d = 133;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        r45.fu6 fu6Var = (r45.fu6) a17.f152243a.f152217a;
        fu6Var.f456140f = this.f474491g;
        fu6Var.f456138d = c01.z1.r();
        fu6Var.f456139e = this.f474494m;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        int i17 = 200;
        while (i17 > 0) {
            if (list2 != null && this.f474492h < list2.size()) {
                if (list2.get(this.f474492h) != null) {
                    r45.en4 en4Var = new r45.en4();
                    en4Var.f455148d = (java.lang.String) list2.get(this.f474492h);
                    linkedList.add(en4Var);
                }
                this.f474492h++;
                i17--;
            }
            if (list != null && this.f474493i < list.size()) {
                if (list.get(this.f474493i) != null) {
                    r45.ie4 ie4Var = new r45.ie4();
                    ie4Var.f458502d = (java.lang.String) list.get(this.f474493i);
                    linkedList2.add(ie4Var);
                }
                this.f474493i++;
                i17--;
            }
            if (list == null || this.f474493i >= list.size()) {
                if (list2 == null || this.f474492h >= list2.size()) {
                    break;
                }
            }
        }
        fu6Var.f456142h = linkedList;
        fu6Var.f456141g = linkedList.size();
        fu6Var.f456144m = linkedList2;
        fu6Var.f456143i = linkedList2.size();
        if (list != null) {
            list.size();
        }
        if (list2 != null) {
            list2.size();
        }
        fu6Var.f456144m.size();
        fu6Var.f456142h.size();
        return mo9409x10f9447a(sVar, a17, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 133;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.util.List list;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadMContact", "onSceneEnd: errType = " + i18 + " errCode = " + i19 + " errMsg = " + str);
        m48024x6b3684de(i17);
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadMContact", "onGYNetEnd  errType:" + i18 + " errCode:" + i19);
            this.f474488d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        r45.fu6 fu6Var = (r45.fu6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152243a.f152217a;
        java.util.LinkedList linkedList = fu6Var.f456144m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (linkedList == null || linkedList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadMContact", "the req emai list is empty");
        } else {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(((r45.ie4) it.next()).f458502d);
            }
        }
        r61.q0.l(arrayList);
        java.util.LinkedList linkedList2 = fu6Var.f456142h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (linkedList2 == null || linkedList2.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadMContact", "the req mobile list is empty");
        } else {
            java.util.Iterator it6 = linkedList2.iterator();
            while (it6.hasNext()) {
                arrayList2.add(kk.k.g(o25.b.a(((r45.en4) it6.next()).f455148d).getBytes()));
            }
        }
        r61.q0.l(arrayList2);
        java.util.List list2 = this.f474490f;
        if ((list2 == null || this.f474493i >= list2.size()) && ((list = this.f474489e) == null || this.f474492h >= list.size())) {
            this.f474488d.mo815x76e0bfae(i18, i19, str, this);
        } else if (mo807x6c193ac1(m47995xb7ba1aa7(), this.f474488d) < 0) {
            this.f474488d.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 10;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.fu6 fu6Var = (r45.fu6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152243a.f152217a;
        int size = fu6Var.f456144m.size() + fu6Var.f456142h.size();
        com.p314xaae8f345.mm.p944x882e457a.o1 o1Var = com.p314xaae8f345.mm.p944x882e457a.o1.EFailed;
        if (size == 0 || size > 200) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadMContact", "security checked failed : exceed max send count");
            return o1Var;
        }
        java.lang.String str = fu6Var.f456140f;
        if (str == null || str.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadMContact", "security checked failed : moblie null");
            return o1Var;
        }
        java.lang.String str2 = fu6Var.f456138d;
        if (str2 != null && str2.length() > 0) {
            return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadMContact", "security checked failed : username null");
        return o1Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: uniqueInNetsceneQueue */
    public boolean mo48023x99a7e80c() {
        return true;
    }
}
