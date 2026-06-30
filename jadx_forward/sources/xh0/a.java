package xh0;

/* loaded from: classes4.dex */
public class a extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f536000f = {l75.n0.m145250x3fdc6f77(dm.ja.f319417s, "SignedAgreementInfo")};

    /* renamed from: g, reason: collision with root package name */
    public static volatile xh0.a f536001g = null;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f536002d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f536003e;

    public a(l75.k0 k0Var) {
        super(k0Var, dm.ja.f319417s, "SignedAgreementInfo", f536000f);
        this.f536003e = new java.util.HashMap(8);
        this.f536002d = k0Var;
    }

    public static xh0.a z0() {
        if (f536001g == null) {
            synchronized (xh0.a.class) {
                if (f536001g == null) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put(248253436, new xh0.C30730x2ca3e0());
                    gm0.b0 u17 = gm0.j1.u();
                    u17.b(u17.f354686f, hashMap, false);
                    f536001g = new xh0.a(u17.f354686f);
                }
            }
        }
        return f536001g;
    }

    public java.util.List D0(java.lang.String str) {
        synchronized (this.f536003e) {
            java.util.List list = (java.util.List) ((java.util.HashMap) this.f536003e).get(str);
            if (list != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SignedAgreementInfoStorage", "[+] get signed yuanbao agreement infos from cache, self_username: %s, value: %s", str, list);
                return list;
            }
            p75.i0 i17 = dm.ja.f319409h.i();
            i17.f434190d = dm.ja.f319410i.j(str);
            java.util.ArrayList arrayList = (java.util.ArrayList) i17.a().k(this.f536002d, dm.ja.class);
            if (arrayList.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SignedAgreementInfoStorage", "[-] query db gets no yuanbao agreement infos. self_username: %s", str);
                return java.util.Collections.emptyList();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                dm.ja jaVar = (dm.ja) it.next();
                r45.q6 q6Var = new r45.q6();
                q6Var.f465232d = jaVar.f67155xc8a07680;
                q6Var.f465233e = jaVar.f67158x30b88397;
                arrayList2.add(q6Var);
            }
            ((java.util.HashMap) this.f536003e).put(str, arrayList2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SignedAgreementInfoStorage", "[+] get signed yuanbao agreement infos from db, self_username: %s, value: %s", str, arrayList2);
            return arrayList2;
        }
    }

    public void J0(java.lang.String str, java.util.List list) {
        boolean mo880xb970c2b9;
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SignedAgreementInfoStorage", "[+] try to store null or empty infos, skip rest logic. self_username: %s", str);
            return;
        }
        synchronized (this.f536003e) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            java.util.List<r45.q6> list2 = (java.util.List) ((java.util.HashMap) this.f536003e).get(str);
            if (list2 != null) {
                for (r45.q6 q6Var : list2) {
                    treeMap.put(java.lang.Integer.valueOf(q6Var.f465232d), q6Var);
                }
            }
            long j17 = -4;
            try {
                j17 = this.f536002d.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                for (int i17 = 0; i17 < list.size(); i17++) {
                    r45.q6 q6Var2 = (r45.q6) list.get(i17);
                    dm.ja jaVar = new dm.ja();
                    jaVar.f67156x4b6e619a = str + "_" + q6Var2.f465232d;
                    jaVar.f67157x55775f67 = str;
                    jaVar.f67155xc8a07680 = q6Var2.f465232d;
                    if (super.get(jaVar, "key")) {
                        int i18 = q6Var2.f465233e;
                        int i19 = jaVar.f67158x30b88397;
                        if (i18 >= i19) {
                            jaVar.f67158x30b88397 = i18;
                            mo880xb970c2b9 = super.mo9952xce0038c9(jaVar, new java.lang.String[0]);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SignedAgreementInfoStorage", "[!] cannot update signed version to lower one. old_ver: %s, new_ver: %s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(q6Var2.f465233e));
                            mo880xb970c2b9 = false;
                        }
                    } else {
                        jaVar.f67158x30b88397 = q6Var2.f465233e;
                        mo880xb970c2b9 = super.mo880xb970c2b9(jaVar);
                    }
                    if (mo880xb970c2b9) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SignedAgreementInfoStorage", "[+] store agreement %s successfully, update cache now. self_username: %s", java.lang.Integer.valueOf(q6Var2.f465232d), str);
                        treeMap.put(java.lang.Integer.valueOf(q6Var2.f465232d), q6Var2);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SignedAgreementInfoStorage", "[-] store agreement %s failed. self_username: %s", java.lang.Integer.valueOf(q6Var2.f465232d), str);
                    }
                }
                this.f536002d.w(java.lang.Long.valueOf(j17));
                ((java.util.HashMap) this.f536003e).put(str, new java.util.ArrayList(treeMap.values()));
            } catch (java.lang.Throwable th6) {
                this.f536002d.w(java.lang.Long.valueOf(j17));
                throw th6;
            }
        }
    }

    public void y0(java.lang.String str) {
        dm.ja jaVar = new dm.ja();
        jaVar.f67157x55775f67 = str;
        if (!super.mo9951xb06685ab(jaVar, "selfUsername")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SignedAgreementInfoStorage", "[-] fail to clear signed agreement infos. self_username: %s", str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SignedAgreementInfoStorage", "[+] clear signed agreement infos successfully. self_username: %s", str);
            ((java.util.HashMap) this.f536003e).remove(str);
        }
    }
}
