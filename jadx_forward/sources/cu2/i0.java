package cu2;

/* loaded from: classes8.dex */
public final class i0 implements zy2.ba {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f303943a = jz5.h.b(cu2.h0.f303940d);

    @Override // zy2.ba
    public java.util.LinkedList a() {
        java.lang.String T0 = g92.b.f351302e.T0();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList<bw5.e0> m112908x4f11eaaf = e().m112908x4f11eaaf(T0);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m112908x4f11eaaf);
        java.util.Iterator<T> it = m112908x4f11eaaf.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb b17 = hc2.a.b((bw5.e0) it.next());
            if (b17 != null) {
                linkedList.add(b17);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("queryAll size=");
        sb6.append(m112908x4f11eaaf.size());
        sb6.append(" username=");
        sb6.append(T0);
        sb6.append(" thread:");
        sb6.append(java.lang.Thread.currentThread().getName());
        sb6.append(";queryAffTimeCost=");
        sb6.append(java.lang.System.currentTimeMillis() - currentTimeMillis);
        sb6.append(";\t nativeList=");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            arrayList.add((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) it6.next());
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotCtrInfoAffStorage", sb6.toString());
        return linkedList;
    }

    @Override // zy2.ba
    public boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, boolean z17) {
        bw5.ev b17;
        java.lang.String str = jbVar != null ? jbVar.f65882x5364c75d : null;
        if (str == null || str.length() == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("replace fail,uuid=");
            sb6.append(jbVar != null ? jbVar.f65882x5364c75d : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderRedDotCtrInfoAffStorage", sb6.toString());
            return false;
        }
        if (jbVar == null) {
            return false;
        }
        bw5.e0 r17 = jbVar.r1();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str2 = jbVar.f65883xdec927b;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("updateOrInsertRedDotInfo ");
        if (r17 != null && (b17 = r17.b()) != null) {
            r11 = b17.m11860x5ec9c89();
        }
        sb7.append(r11);
        sb7.append(",finderUsername=");
        sb7.append(str2);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(sb7.toString());
        if (str2 == null || str2.length() == 0) {
            e().m112920x4efe386c(r17);
        } else {
            e().m112918x40e9dd11(str2, r17);
        }
        sb8.append(" time cost = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotCtrInfoAffStorage", sb8.toString());
        return true;
    }

    @Override // zy2.ba
    public boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar) {
        java.lang.String str = jbVar != null ? jbVar.f65882x5364c75d : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotCtrInfoAffStorage", "delete RedDotInfo uuid=" + str);
        if (str == null || str.length() == 0) {
            return false;
        }
        e().m112895xffa56cd5(str);
        return true;
    }

    @Override // zy2.ba
    public boolean d(java.util.LinkedList linkedList) {
        boolean m112879x6dcc3afa = e().m112879x6dcc3afa();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotCtrInfoAffStorage", "deleteAll " + m112879x6dcc3afa);
        return m112879x6dcc3afa;
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27313x6c9c5175 e() {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27313x6c9c5175) ((jz5.n) this.f303943a).mo141623x754a37bb();
    }
}
