package cu2;

/* loaded from: classes8.dex */
public final class k0 implements zy2.ba {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f303948a = jz5.h.b(cu2.j0.f303946d);

    @Override // zy2.ba
    public java.util.LinkedList a() {
        java.util.LinkedList linkedList;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k3 f17 = f();
        if (f17 != null) {
            java.lang.String[] strArr = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k3.f187157e;
            linkedList = f17.D0("FinderRedDotInfo2");
        } else {
            linkedList = new java.util.LinkedList();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("queryAll time cost=");
        sb6.append(java.lang.System.currentTimeMillis() - currentTimeMillis);
        sb6.append(" size=");
        sb6.append(linkedList.size());
        sb6.append("; ");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) it.next()).f65882x5364c75d);
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotCtrInfoNativeStorage", sb6.toString());
        return linkedList;
    }

    @Override // zy2.ba
    public boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k3 f17 = f();
        if (f17 != null) {
            return f17.mo55864x413cb2b4(jbVar, z17);
        }
        return false;
    }

    @Override // zy2.ba
    public boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k3 f17 = f();
        if (f17 != null) {
            return f17.mo49766xb06685ab(jbVar, false, null);
        }
        return false;
    }

    @Override // zy2.ba
    public boolean d(java.util.LinkedList linkedList) {
        if (linkedList == null) {
            return true;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k3 f17 = f();
            if (f17 != null) {
                f17.mo49766xb06685ab(jbVar, false, new java.lang.String[0]);
            }
        }
        return true;
    }

    public boolean e(java.lang.String table) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k3 f17 = f();
        if (f17 == null) {
            return false;
        }
        boolean A = f17.f187158d.A(table, "DROP TABLE IF EXISTS ".concat(table));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotCtrInfoStorage", "[dropTable] dropRet=" + A);
        return A;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k3 f() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k3) ((jz5.n) this.f303948a).mo141623x754a37bb();
    }

    public java.util.LinkedList g(java.lang.String table) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k3 f17 = f();
        java.util.ArrayList arrayList = null;
        java.util.LinkedList D0 = f17 != null ? f17.D0(table) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("queryAllByTable time cost=");
        sb6.append(java.lang.System.currentTimeMillis() - currentTimeMillis);
        sb6.append(" table=");
        sb6.append(table);
        sb6.append(", size=");
        sb6.append(D0 != null ? java.lang.Integer.valueOf(D0.size()) : null);
        sb6.append(',');
        if (D0 != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(D0, 10));
            java.util.Iterator it = D0.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) it.next()).f65882x5364c75d);
            }
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotCtrInfoNativeStorage", sb6.toString());
        return D0 == null ? new java.util.LinkedList() : D0;
    }
}
