package ai1;

/* loaded from: classes8.dex */
public final class p implements ai1.a {

    /* renamed from: b, reason: collision with root package name */
    public static final ai1.p f86635b = new ai1.p();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f86636c = new java.util.HashMap();

    public static final void a(ai1.p pVar, java.lang.String str, boolean z17, r45.qf qfVar) {
        pVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = f86636c;
        synchronized (hashMap) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) hashMap.get(str);
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ai1.f fVar = (ai1.f) ((ai1.e) it.next());
            zh1.a1 a1Var = fVar.f86616a;
            if (z17) {
                if (a1Var != null) {
                    ai1.p pVar2 = f86635b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qfVar);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c17 = pVar2.c(qfVar, java.lang.System.currentTimeMillis(), fVar.f86617b);
                    c17.m52062x9616526c();
                    a1Var.a(true, c17);
                }
            } else if (a1Var != null) {
                a1Var.a(false, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622("", "", "")));
            }
        }
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 materialModel, zh1.a1 a1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialModel, "materialModel");
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x xVar = (com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxabusiness/getmaterialrecommwxacard";
        lVar.f152200d = 5049;
        r45.ii3 ii3Var = new r45.ii3();
        ii3Var.f458596d = materialModel.f167802d;
        ii3Var.f458597e = materialModel.f167803e;
        lVar.f152197a = ii3Var;
        lVar.f152198b = new r45.ji3();
        ((h80.i) xVar).wi(lVar.a(), new ai1.m(materialModel, a1Var));
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c(r45.qf qfVar, long j17, java.util.List list) {
        java.util.LinkedList<r45.yi4> recomm_card_list = qfVar.f465455d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recomm_card_list, "recomm_card_list");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(recomm_card_list, 10));
        for (r45.yi4 yi4Var : recomm_card_list) {
            ai1.p pVar = f86635b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yi4Var);
            arrayList.add(pVar.e(yi4Var));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622("", "", ""), kz5.p0.f395529d, arrayList);
        c12473xe2bfc4b5.f167786h = j17;
        c12473xe2bfc4b5.f167787i = qfVar.f465457f;
        java.util.ArrayList arrayList2 = c12473xe2bfc4b5.f167783e.f167805d;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = qfVar.f465456e.iterator();
        while (it.hasNext()) {
            r45.vi4 vi4Var = (r45.vi4) it.next();
            java.lang.String type = vi4Var.f469823d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(type, "type");
            hashMap.put(type, vi4Var);
        }
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 c12476xea20f622 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622) it6.next();
            if (hashMap.containsKey(c12476xea20f622.f167802d)) {
                java.lang.Object obj = hashMap.get(c12476xea20f622.f167802d);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                java.lang.Object obj2 = hashMap.get(c12476xea20f622.f167802d);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                c12476xea20f622.f167802d = ((r45.vi4) obj2).f469825f;
            }
            arrayList2.add(c12476xea20f622);
        }
        return c12473xe2bfc4b5;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 d(r45.ji3 ji3Var, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 c12476xea20f622) {
        java.util.LinkedList<r45.xi4> recently_used_card_list = ji3Var.f459368d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recently_used_card_list, "recently_used_card_list");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(recently_used_card_list, 10));
        for (r45.xi4 xi4Var : recently_used_card_list) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(xi4Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 c12475x7cfc32b2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2(xi4Var.f471678d, xi4Var.f471682h, xi4Var.f471681g, xi4Var.f471679e, xi4Var.f471680f);
            c12475x7cfc32b2.f167800i = xi4Var.f471683i;
            arrayList.add(c12475x7cfc32b2);
        }
        java.util.LinkedList<r45.yi4> recomm_card_list = ji3Var.f459369e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recomm_card_list, "recomm_card_list");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(recomm_card_list, 10));
        for (r45.yi4 yi4Var : recomm_card_list) {
            ai1.p pVar = f86635b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yi4Var);
            arrayList2.add(pVar.e(yi4Var));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5(c12476xea20f622, arrayList, arrayList2);
        c12473xe2bfc4b5.f167786h = j17;
        return c12473xe2bfc4b5;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21 e(r45.yi4 yi4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21 c12474x8b872a21 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21(yi4Var.f472659d, yi4Var.f472666n, yi4Var.f472665m, yi4Var.f472660e, yi4Var.f472661f, yi4Var.f472663h, yi4Var.f472664i, yi4Var.f472662g, yi4Var.f472668p, yi4Var.f472669q, yi4Var.f472670r);
        c12474x8b872a21.f167788d.f167800i = yi4Var.f472667o;
        return c12474x8b872a21;
    }
}
