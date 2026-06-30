package b93;

/* loaded from: classes11.dex */
public class b implements c93.b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f18585a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.ArrayList f18586b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f18587c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f18588d = new b93.a(this);

    public void a(java.util.List list) {
        c01.d9.e().g(new e93.a(list));
    }

    public void b(java.util.List list, java.util.List list2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (list != null && list.size() > 0) {
            java.util.Iterator it = list.iterator();
            java.util.Iterator it6 = list2.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(((java.lang.String) it6.next()).split(","));
                if (P1 != null && P1.size() > 0) {
                    java.util.Iterator it7 = P1.iterator();
                    while (it7.hasNext()) {
                        java.lang.String str2 = (java.lang.String) it7.next();
                        if (hashMap.containsKey(str2)) {
                            java.lang.String str3 = (java.lang.String) hashMap.get(str2);
                            java.lang.String b17 = b93.n.b(str3, str);
                            if (!b17.equalsIgnoreCase(str3)) {
                                hashMap.put(str2, b17);
                            }
                        } else {
                            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str2, true);
                            if (n17 != null) {
                                java.lang.String D0 = n17.D0();
                                java.lang.String b18 = b93.n.b(D0, str);
                                if (!b18.equalsIgnoreCase(D0)) {
                                    hashMap.put(str2, b18);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            java.lang.String str4 = (java.lang.String) entry.getKey();
            java.lang.String str5 = (java.lang.String) entry.getValue();
            r45.gw6 gw6Var = new r45.gw6();
            gw6Var.f375581d = str4;
            gw6Var.f375582e = str5;
            linkedList.add(gw6Var);
        }
        if (linkedList.size() > 0) {
            c01.d9.e().g(new e93.e(linkedList));
        }
    }

    public java.util.List c() {
        return b93.r.wi().k1();
    }

    public java.util.List d() {
        com.tencent.mm.storage.h4 wi6 = b93.r.wi();
        wi6.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList i17 = wi6.i1();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (i17 != null) {
            wi6.y0();
            java.util.HashMap hashMap = wi6.f195004f;
            if (hashMap != null) {
                for (int i18 = 0; i18 < i17.size(); i18++) {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) hashMap.get(java.lang.Integer.valueOf(((com.tencent.mm.storage.d4) i17.get(i18)).field_labelID));
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        arrayList.add(((com.tencent.mm.storage.d4) i17.get(i18)).field_labelName);
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelStorage", "getAllLabelHasContact time:%s all:%s hascontact:%s stack:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(i17.size()), java.lang.Integer.valueOf(arrayList.size()), new com.tencent.mm.sdk.platformtools.z3());
            }
        }
        return arrayList;
    }

    public java.lang.String e(java.lang.String str) {
        return b93.r.wi().p1(str);
    }

    public java.util.List f(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelManagerImpl", "labels is null.");
            return null;
        }
        java.lang.String[] split = str.split(",");
        if (split == null || split.length <= 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(java.util.Arrays.asList(split));
        return arrayList;
    }

    public java.lang.String g(java.lang.String str) {
        return b93.r.wi().z1(str);
    }

    public java.lang.String h(java.util.List list) {
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelManagerImpl", "labelList is empty");
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            sb6.append((java.lang.String) list.get(i17));
            if (i17 < size - 1) {
                sb6.append(",");
            }
        }
        return sb6.toString();
    }

    public java.util.List i(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        if (str.endsWith("\u0000")) {
            str = str.replace("\u0000", "");
        }
        return b93.r.wi().C1(str.split(","));
    }

    public java.util.List j(java.lang.String str) {
        return b93.r.wi().P1(str);
    }

    public final void k() {
        this.f18585a = null;
        this.f18586b = null;
        this.f18587c = null;
        com.tencent.mm.modelbase.r1 e17 = c01.d9.e();
        com.tencent.mm.modelbase.u0 u0Var = this.f18588d;
        e17.q(kd1.c.CTRL_INDEX, u0Var);
        c01.d9.e().q(638, u0Var);
    }

    public final void l(java.lang.String str, java.util.ArrayList arrayList) {
        if (arrayList != null) {
            arrayList.toString();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || arrayList == null || arrayList.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Label.ContactLabelManagerImpl", "add contact label faild.");
            return;
        }
        java.lang.String u17 = arrayList.size() > 0 ? b93.r.wi().u1(arrayList) : "";
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.gw6 gw6Var = new r45.gw6();
        gw6Var.f375582e = u17;
        gw6Var.f375581d = str;
        linkedList.add(gw6Var);
        c01.d9.e().g(new e93.e(linkedList));
    }
}
