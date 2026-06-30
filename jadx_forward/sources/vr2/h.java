package vr2;

/* loaded from: classes10.dex */
public abstract class h {
    public static final void a(dn.h hVar, cs2.p task) {
        java.lang.String str;
        r45.vf2 vf2Var;
        java.lang.String m75945x2fec8307;
        r45.vf2 vf2Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        r45.m11 m11Var = new r45.m11();
        m11Var.set(0, java.lang.Long.valueOf(task.f303622f2));
        m11Var.set(1, 0);
        m11Var.set(9, java.lang.Integer.valueOf(hVar.f69508x556c2b4f));
        m11Var.set(13, java.lang.Integer.valueOf(hVar.f69529x3bf012d1));
        m11Var.set(5, java.lang.Integer.valueOf((int) hVar.f69523x17c343e7));
        m11Var.set(3, java.lang.Integer.valueOf((int) hVar.f69548xe026fea1));
        m11Var.set(4, java.lang.Integer.valueOf((int) hVar.f69548xe026fea1));
        mn2.g4 g4Var = task.f303621e2;
        m11Var.set(6, java.lang.Integer.valueOf(g4Var.f411535e.m75939xb282bd08(3)));
        m11Var.set(16, java.lang.Integer.valueOf(hVar.f69505x1282dcdf));
        m11Var.set(18, hVar.f323302d);
        m11Var.set(19, java.lang.Integer.valueOf(hVar.f323303e));
        m11Var.set(17, java.lang.Integer.valueOf(hVar.f323304f));
        m11Var.set(15, java.lang.Long.valueOf(((c61.l7) i95.n0.c(c61.l7.class)).ek().f546228l));
        m11Var.set(21, java.lang.Long.valueOf(g4Var.f411535e.m75942xfb822ef2(24) > 60000 ? task.f303622f2 : 0L));
        r45.sf0 sf0Var = new r45.sf0();
        sf0Var.set(0, java.lang.Long.valueOf(hVar.f69548xe026fea1));
        sf0Var.set(2, java.lang.Long.valueOf(hVar.f69559x1bb3b54a));
        sf0Var.set(3, java.lang.Long.valueOf(hVar.f69520x14c61803));
        sf0Var.set(7, hVar.f323302d);
        sf0Var.set(5, hVar.f69512x53e83fd7);
        sf0Var.set(4, java.lang.Integer.valueOf(hVar.f323304f));
        sf0Var.set(1, java.lang.Long.valueOf(hVar.f69547xcabbcef8));
        m11Var.set(23, sf0Var);
        m11Var.set(26, java.lang.Long.valueOf(g4Var.f411535e.m75942xfb822ef2(24)));
        m11Var.set(27, java.lang.Integer.valueOf(task.f303627k2));
        m11Var.set(28, java.lang.Long.valueOf(hVar.f69548xe026fea1));
        m11Var.set(30, 0);
        m11Var.set(31, 0);
        yr2.k ek6 = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
        kk.l lVar = ek6.f546234r;
        java.lang.String str2 = task.f303625i2;
        jz5.o oVar = (jz5.o) lVar.get(str2);
        m11Var.set(24, java.lang.Integer.valueOf(oVar != null ? (int) ((java.lang.Number) oVar.f384376f).longValue() : 0));
        kk.l lVar2 = ek6.f546234r;
        jz5.o oVar2 = (jz5.o) lVar2.get(str2);
        java.lang.String str3 = "";
        if (oVar2 == null || (vf2Var2 = (r45.vf2) oVar2.f384374d) == null || (str = vf2Var2.m75945x2fec8307(0)) == null) {
            str = "";
        }
        m11Var.set(25, str);
        jz5.o oVar3 = (jz5.o) lVar2.get(str2);
        if (oVar3 != null && (vf2Var = (r45.vf2) oVar3.f384374d) != null && (m75945x2fec8307 = vf2Var.m75945x2fec8307(0)) != null) {
            str3 = m75945x2fec8307;
        }
        m11Var.set(20, str3);
        cw2.p4 p4Var = cw2.p4.f305444a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNetworkStatusStatistic", "addNetworkInfo info:" + m11Var + " size:" + cw2.p4.f305445b.size());
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = cw2.p4.f305447d;
        if (copyOnWriteArrayList.size() > 10) {
            copyOnWriteArrayList.remove(0);
        }
        copyOnWriteArrayList.add(m11Var);
    }
}
