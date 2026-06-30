package p05;

/* loaded from: classes5.dex */
public final class m4 {

    /* renamed from: a, reason: collision with root package name */
    public static final p05.m4 f432155a = new p05.m4();

    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7133xa3508982 a() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7133xa3508982 c7133xa3508982 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7133xa3508982();
        if (tq5.i.f502802a == 0) {
            tq5.i.f502802a = 2014500;
        }
        c7133xa3508982.f144459d = tq5.i.f502802a;
        c7133xa3508982.f144464i = ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).Bi();
        return c7133xa3508982;
    }

    public final void b(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7133xa3508982 a17 = a();
        a17.f144462g = i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i18);
        sb6.append('.');
        sb6.append(i19);
        a17.f144460e = a17.b("ModelList", sb6.toString(), true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisionModelReporter", "reportAction: " + a17.n());
        a17.k();
    }

    public final void c() {
        boolean z17;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7133xa3508982 a17 = a();
        a17.f144462g = 1;
        java.util.LinkedList NewConfigList = p05.p3.f432174c.f469526d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(NewConfigList, "NewConfigList");
        a17.f144460e = a17.b("ModelList", kz5.n0.g0(NewConfigList, ";", null, null, 0, null, p05.j3.f432095d, 30, null), true);
        java.util.LinkedList linkedList = p05.p3.f432176e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : linkedList) {
            int intValue = ((java.lang.Number) obj).intValue();
            java.util.LinkedList NewConfigList2 = p05.p3.f432174c.f469526d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(NewConfigList2, "NewConfigList");
            if (!NewConfigList2.isEmpty()) {
                java.util.Iterator it = NewConfigList2.iterator();
                while (it.hasNext()) {
                    z17 = false;
                    if (((r45.w87) it.next()).f470504d == intValue) {
                        break;
                    }
                }
            }
            z17 = true;
            if (z17) {
                arrayList.add(obj);
            }
        }
        a17.f144461f = a17.b("InvalidModelList", kz5.n0.g0(kz5.n0.Q(arrayList), ";", null, null, 0, null, p05.e3.f432041d, 30, null), true);
        java.util.LinkedList NewConfigList3 = p05.p3.f432175d.f469526d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(NewConfigList3, "NewConfigList");
        a17.f144463h = a17.b("CgiModelList", kz5.n0.g0(NewConfigList3, ";", null, null, 0, null, p05.d3.f432028d, 30, null), true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisionModelReporter", "reportModelInfo: " + a17.n());
        a17.k();
    }
}
