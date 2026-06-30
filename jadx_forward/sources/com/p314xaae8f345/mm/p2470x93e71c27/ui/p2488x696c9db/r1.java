package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes12.dex */
public final class r1 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s1 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f f273392o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a2 adapter) {
        super(activityC19730xa7b9756f, adapter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        this.f273392o = activityC19730xa7b9756f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0132, code lost:
    
        if (r15 != 18) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x015d, code lost:
    
        if (r14.m() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d0, code lost:
    
        if (r14.m() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d7, code lost:
    
        if (r14.m() == false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int d(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r1 r24) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r1.d(com.tencent.mm.pluginsdk.ui.tools.r1):int");
    }

    public final java.util.List e(java.util.List list, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            o72.r2 r2Var = (o72.r2) it.next();
            int i19 = r2Var.f67657x2262335f;
            if (i19 == 18 || i19 == 14) {
                try {
                    java.util.LinkedList linkedList = r2Var.f67640x5ab01132.f452497f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getDataList(...)");
                    for (int i27 = r2Var.f67657x2262335f == 18 ? 1 : 0; i27 < linkedList.size(); i27++) {
                        r45.gp0 gp0Var = (r45.gp0) linkedList.get(i27);
                        if (gp0Var.I == i17) {
                            o72.r2 m150781x5a5dd5d = r2Var.m150781x5a5dd5d();
                            m150781x5a5dd5d.f67657x2262335f = i18;
                            m150781x5a5dd5d.B1 = true;
                            m150781x5a5dd5d.C1 = r2Var;
                            m150781x5a5dd5d.D1 = r2Var.f67645x88be67a1 + '_' + gp0Var.T;
                            m150781x5a5dd5d.E1 = gp0Var.T;
                            r45.bq0 a17 = q72.c.a(r2Var.f67640x5ab01132);
                            m150781x5a5dd5d.f67640x5ab01132 = a17;
                            a17.f452497f = new java.util.LinkedList();
                            m150781x5a5dd5d.f67640x5ab01132.f452497f.add(gp0Var);
                            m150781x5a5dd5d.f67640x5ab01132.p(gp0Var.f456937d);
                            r45.hp0 hp0Var = gp0Var.J1;
                            if (hp0Var != null) {
                                if (i17 == 5) {
                                    m150781x5a5dd5d.f67640x5ab01132.r(hp0Var.f457888f);
                                } else if (i17 == 6) {
                                    m150781x5a5dd5d.f67640x5ab01132.j(hp0Var.f457887e);
                                }
                            }
                            arrayList.add(m150781x5a5dd5d);
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileSelectorUI", "getSearchList() [%s] Exception:%s %s", java.lang.Integer.valueOf(i17), e17.getClass().getSimpleName(), e17.getMessage());
                }
            } else {
                arrayList.add(r2Var);
            }
        }
        return arrayList;
    }
}
