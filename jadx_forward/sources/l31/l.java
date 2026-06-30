package l31;

/* loaded from: classes9.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l31.n f396900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f396901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f396902f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396903g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 f396904h;

    public l(l31.n nVar, int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5) {
        this.f396900d = nVar;
        this.f396901e = i17;
        this.f396902f = i18;
        this.f396903g = str;
        this.f396904h = c11158xe7d16ed5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r47;
        java.util.List list;
        java.util.List<com.p314xaae8f345.mm.p965xc41bc71e.C11155xafcbdcb0> list2;
        l31.n nVar = this.f396900d;
        l31.k kVar = nVar.f396907f;
        if (kVar != null) {
            int i17 = this.f396901e;
            int i18 = this.f396902f;
            java.lang.String errMsg = this.f396903g;
            com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5 = this.f396904h;
            java.util.List requestedUsernames = nVar.f396906e;
            g31.w wVar = (g31.w) kVar;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestedUsernames, "requestedUsernames");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubscribeSwitchInfoBatchFetcher", "onNetSceneEndCallback errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errMsg);
            if (i17 == 0 && i18 == 0) {
                g31.y yVar = wVar.f349659a;
                java.util.List<java.lang.String> list3 = wVar.f349660b;
                yVar.getClass();
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                if (c11158xe7d16ed5 != null && (list2 = c11158xe7d16ed5.B) != null) {
                    for (com.p314xaae8f345.mm.p965xc41bc71e.C11155xafcbdcb0 c11155xafcbdcb0 : list2) {
                        if (c11155xafcbdcb0.f153300d.length() > 0) {
                            linkedHashSet.add(c11155xafcbdcb0.f153300d);
                            g31.r rVar = (g31.r) ((java.util.LinkedHashMap) yVar.f349663b).get(c11155xafcbdcb0.f153300d);
                            if (rVar != null) {
                                rVar.f349643c = g31.s.f349648g;
                                rVar.f349642b = java.lang.System.currentTimeMillis();
                                rVar.f349644d = 0;
                            }
                        }
                    }
                }
                for (java.lang.String str : list3) {
                    if (!linkedHashSet.contains(str)) {
                        g31.r rVar2 = (g31.r) ((java.util.LinkedHashMap) yVar.f349663b).get(str);
                        if (rVar2 != null) {
                            rVar2.f349643c = g31.s.f349647f;
                            rVar2.f349642b = java.lang.System.currentTimeMillis();
                            rVar2.f349644d++;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SubscribeSwitchInfoBatchFetcher", "handleCgiSuccess: username(%s) not found in response", str);
                    }
                }
                if (c11158xe7d16ed5 == null || (list = c11158xe7d16ed5.B) == null) {
                    r47 = kz5.p0.f395529d;
                } else {
                    r47 = new java.util.ArrayList();
                    for (java.lang.Object obj : list) {
                        com.p314xaae8f345.mm.p965xc41bc71e.C11155xafcbdcb0 c11155xafcbdcb02 = (com.p314xaae8f345.mm.p965xc41bc71e.C11155xafcbdcb0) obj;
                        if ((c11155xafcbdcb02.f153300d.length() > 0) && linkedHashSet.contains(c11155xafcbdcb02.f153300d)) {
                            r47.add(obj);
                        }
                    }
                }
                if (!r47.isEmpty()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(r47, 10));
                    for (com.p314xaae8f345.mm.p965xc41bc71e.C11155xafcbdcb0 c11155xafcbdcb03 : r47) {
                        arrayList.add(new g31.t(c11155xafcbdcb03.f153300d, c11155xafcbdcb03.f153301e, c11155xafcbdcb03.f153302f));
                    }
                    ((ku5.t0) ku5.t0.f394148d).g(new g31.v(r47, yVar, arrayList));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubscribeSwitchInfoBatchFetcher", "CGI failed, errCode=%d", java.lang.Integer.valueOf(i18));
                g31.y yVar2 = wVar.f349659a;
                java.util.List list4 = wVar.f349660b;
                yVar2.getClass();
                java.util.Iterator it = list4.iterator();
                while (it.hasNext()) {
                    g31.r rVar3 = (g31.r) ((java.util.LinkedHashMap) yVar2.f349663b).get((java.lang.String) it.next());
                    if (rVar3 != null) {
                        rVar3.f349643c = g31.s.f349647f;
                        rVar3.f349642b = java.lang.System.currentTimeMillis();
                        rVar3.f349644d++;
                    }
                }
            }
            g31.y yVar3 = wVar.f349659a;
            yVar3.f349664c = false;
            g31.y.a(yVar3);
        }
    }
}
