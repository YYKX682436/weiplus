package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f206589a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f206590b = new java.util.concurrent.ConcurrentHashMap();

    public final java.lang.String a(java.lang.Object obj) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Ui(obj.hashCode());
    }

    public final boolean b(int i17) {
        int i18 = this.f206589a;
        return i18 == 0 || i18 != i17;
    }

    public void c(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n4 n4Var) {
        if (b(i17) || n4Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g gVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g(n4Var.m58870x8cdac1b(), false, "feedId:" + ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Ui(n4Var.f206686a) + "  obj:" + a(n4Var), null, 8, null);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f206590b;
        java.util.List list = (java.util.List) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (list == null) {
            list = new java.util.ArrayList();
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), list);
        }
        list.add(gVar);
    }

    public void d(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n4 n4Var) {
        if (b(i17) || n4Var == null) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f206590b;
        java.lang.Iterable iterable = (java.util.List) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (iterable == null) {
            iterable = new java.util.ArrayList();
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), iterable);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g) next).f206565a == n4Var.m58870x8cdac1b()) {
                arrayList.add(next);
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g gVar = arrayList != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g) arrayList.get(0) : null;
        if (gVar != null) {
            gVar.f206566b = true;
        }
    }

    public void e(so2.j5 j5Var, java.lang.String prefixLog, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n4 record) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefixLog, "prefixLog");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(record, "record");
        if (!b(0) && (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
            java.lang.String Ui = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Ui(abstractC14490x69736cb5.mo2128x1ed62e84());
            ya2.b2 contact = abstractC14490x69736cb5.getContact();
            java.lang.String str = contact != null ? contact.f69328x21f9b213 : null;
            if (str == null) {
                str = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedReportWatcher", prefixLog + " --- nickName:" + str + " feedId:" + Ui + "        record obj:" + a(record));
        }
    }
}
