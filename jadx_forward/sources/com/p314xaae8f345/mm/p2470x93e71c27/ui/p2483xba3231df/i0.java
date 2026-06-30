package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df;

/* loaded from: classes8.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.i0 f272496a = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.i0();

    public final void a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenByOtherMMKV", "addUseRecord: " + str + ", " + str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        java.lang.Object obj = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 N = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("recent_use_app_mmkv", 2, null);
        if (N == null) {
            return;
        }
        r45.qk5 qk5Var = new r45.qk5();
        byte[] j17 = N.j(str2);
        if (j17 != null) {
            qk5Var.mo11468x92b714fd(j17);
        }
        java.util.LinkedList records = qk5Var.f465612d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(records, "records");
        java.util.Iterator it = records.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.gv6) next).f457088d, str)) {
                obj = next;
                break;
            }
        }
        r45.gv6 gv6Var = (r45.gv6) obj;
        if (gv6Var != null) {
            gv6Var.f457089e = c01.id.c();
        } else {
            r45.gv6 gv6Var2 = new r45.gv6();
            gv6Var2.f457088d = str;
            gv6Var2.f457089e = c01.id.c();
            records.add(gv6Var2);
        }
        N.H(str2, qk5Var.mo14344x5f01b1f6());
        r45.j56 j56Var = new r45.j56();
        byte[] j18 = N.j("shortcut:" + str2);
        if (j18 != null) {
            j56Var.mo11468x92b714fd(j18);
        }
        java.util.LinkedList linkedList = j56Var.f459129d;
        if (linkedList != null) {
            linkedList.remove(str);
            linkedList.add(0, str);
            while (linkedList.size() > 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenByOtherMMKV", "addShortCupApp remove: " + ((java.lang.String) linkedList.remove(linkedList.size() - 1)));
            }
        }
        N.H("shortcut:" + str2, j56Var.mo14344x5f01b1f6());
    }

    public final r45.mk5 b(java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 N;
        java.lang.Object m143895xf1229813;
        if (str == null || (N = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("recent_use_app_mmkv", 2, null)) == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenByOtherMMKV", "getRecentExposedData: ".concat(str));
        byte[] j17 = N.j(str);
        if (j17 == null) {
            return null;
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            r45.mk5 mk5Var = new r45.mk5();
            mk5Var.mo11468x92b714fd(j17);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(mk5Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        return (r45.mk5) (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813) ? null : m143895xf1229813);
    }
}
