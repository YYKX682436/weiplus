package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class o8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o8 f183965d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o8();

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.ArrayList arrayList2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183994b;
            r45.nd6 nd6Var = (r45.nd6) kz5.n0.Z(arrayList2);
            long m75942xfb822ef2 = nd6Var != null ? nd6Var.m75942xfb822ef2(2) : 0L;
            r45.nd6 nd6Var2 = (r45.nd6) kz5.n0.k0(arrayList2);
            long m75942xfb822ef22 = (nd6Var2 != null ? nd6Var2.m75942xfb822ef2(2) : 0L) - m75942xfb822ef2;
            java.util.Iterator it = arrayList2.iterator();
            int i17 = 0;
            while (true) {
                if (it.hasNext()) {
                    java.lang.Object next = it.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.nd6 nd6Var3 = (r45.nd6) next;
                    if (i17 > 0) {
                        java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183994b.get(i17 - 1);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                        r45.nd6 nd6Var4 = (r45.nd6) obj;
                        float m75942xfb822ef23 = m75942xfb822ef22 != 0 ? (((float) (nd6Var3.m75942xfb822ef2(2) - nd6Var4.m75942xfb822ef2(2))) * 100.0f) / ((float) m75942xfb822ef22) : 0.0f;
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append(nd6Var3.m75945x2fec8307(1));
                        sb7.append(':');
                        sb7.append(nd6Var3.m75942xfb822ef2(2) - nd6Var4.m75942xfb822ef2(2));
                        sb7.append("ms,");
                        java.lang.String format = java.lang.String.format("%.1f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(m75942xfb822ef23)}, 1));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                        sb7.append(format);
                        sb7.append("%\n");
                        sb6.append(sb7.toString());
                    } else {
                        sb6.append("Total Cost:" + m75942xfb822ef22 + "ms... start at " + nd6Var3.m75942xfb822ef2(2) + "\n " + nd6Var3.m75945x2fec8307(1) + '\n');
                    }
                    i17 = i18;
                } else {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    sb8.append("end at ");
                    arrayList = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183994b;
                    r45.nd6 nd6Var5 = (r45.nd6) kz5.n0.k0(arrayList);
                    sb8.append(nd6Var5 != null ? java.lang.Long.valueOf(nd6Var5.m75942xfb822ef2(2)) : null);
                    sb6.append(sb8.toString());
                    java.lang.String sb9 = sb6.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb9, "toString(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183995c = sb9;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorFlowStats", java.lang.String.valueOf(sb6));
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8 p8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a;
        arrayList.clear();
    }
}
