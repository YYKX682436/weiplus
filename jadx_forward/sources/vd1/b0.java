package vd1;

/* loaded from: classes7.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f517097d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.util.List list) {
        super(2);
        this.f517097d = list;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p) obj2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOperateRealtimeReport.RealtimeReportQueue", "onCgiBack, isSucceed:" + booleanValue + ", exception:" + pVar);
        java.util.WeakHashMap weakHashMap = new java.util.WeakHashMap();
        java.util.List<vd1.y> list = this.f517097d;
        if (booleanValue) {
            for (vd1.y yVar : list) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) yVar.f517159e.get();
                if (yVar2 != null) {
                    java.util.LinkedList linkedList = (java.util.LinkedList) weakHashMap.get(yVar2);
                    if (linkedList == null) {
                        linkedList = new java.util.LinkedList();
                        weakHashMap.put(yVar2, linkedList);
                    }
                    linkedList.addLast(yVar);
                }
                vd1.n nVar = new vd1.n();
                nVar.b((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) yVar.f517159e.get());
                nVar.f517138f = yVar.f517155a;
                nVar.f517139g = yVar.f517156b;
                vd1.l lVar = yVar.f517158d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lVar, "<set-?>");
                nVar.f517140h = lVar;
                nVar.f517141i = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(vd1.f0.f517108c);
                nVar.f517142j = yVar.f517161g - 1;
                nVar.f517143k = vd1.m.f517129f;
                nVar.a();
            }
            vd1.f0 f0Var = vd1.f0.f517106a;
            ((ch1.c) f0Var.c()).b(1074L, 2L, list.size());
            f0Var.c().a(1074L, 5L);
        } else {
            int i17 = 0;
            for (vd1.y yVar3 : list) {
                if (vd1.f0.f517111f.b(yVar3)) {
                    i17++;
                } else {
                    java.lang.ref.WeakReference weakReference = yVar3.f517159e;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) weakReference.get();
                    if (yVar4 != null) {
                        java.util.LinkedList linkedList2 = (java.util.LinkedList) weakHashMap.get(yVar4);
                        if (linkedList2 == null) {
                            linkedList2 = new java.util.LinkedList();
                            weakHashMap.put(yVar4, linkedList2);
                        }
                        linkedList2.addLast(yVar3);
                    }
                    vd1.n nVar2 = new vd1.n();
                    nVar2.b((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) weakReference.get());
                    nVar2.f517138f = yVar3.f517155a;
                    nVar2.f517139g = yVar3.f517156b;
                    vd1.l lVar2 = yVar3.f517158d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lVar2, "<set-?>");
                    nVar2.f517140h = lVar2;
                    nVar2.f517141i = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(vd1.f0.f517108c);
                    nVar2.f517142j = yVar3.f517161g - 1;
                    nVar2.f517143k = vd1.m.f517130g;
                    nVar2.a();
                }
            }
            if (i17 > 0) {
                ((ch1.c) vd1.f0.f517106a.c()).b(1074L, 0L, i17);
            }
        }
        java.util.Set<java.util.Map.Entry> entrySet = weakHashMap.entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
        for (java.util.Map.Entry entry : entrySet) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) entry.getKey();
            if (lVar3 != null && lVar3.mo50262x39e05d35()) {
                vd1.j jVar = new vd1.j();
                jVar.u(lVar3);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("errcode", java.lang.Integer.valueOf(booleanValue ? 0 : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.o.SERVER == (pVar != null ? pVar.f167653d : null) ? pVar.f167654e : -9999));
                hashMap.put("errmsg", pVar != null ? pVar.f167655f : null);
                java.lang.Object value = entry.getValue();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "<get-value>(...)");
                java.lang.Iterable iterable = (java.lang.Iterable) value;
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
                java.util.Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(java.lang.Long.valueOf(((vd1.y) it.next()).f517157c.length()));
                }
                hashMap.put("dataSize", java.lang.Long.valueOf(kz5.n0.J0(arrayList)));
                java.lang.Object value2 = entry.getValue();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value2, "<get-value>(...)");
                java.lang.Iterable iterable2 = (java.lang.Iterable) value2;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(iterable2, 10));
                java.util.Iterator it6 = iterable2.iterator();
                while (it6.hasNext()) {
                    arrayList2.add(java.lang.Integer.valueOf(((vd1.y) it6.next()).f517155a));
                }
                hashMap.put("idList", new org.json.JSONArray((java.util.Collection) kz5.n0.S0(arrayList2)));
                jVar.t(hashMap);
                jVar.m();
            }
        }
        return jz5.f0.f384359a;
    }
}
