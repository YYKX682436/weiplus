package mc2;

/* loaded from: classes2.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final mc2.b a(int i17, zy2.fa manager) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manager, "manager");
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ba.a(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = manager.L0(a17);
        r45.f03 I0 = L0 != null ? L0.I0(a17) : null;
        r45.j03 j03Var = new r45.j03();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FinderTipsShowTabExt#transform] tabType=");
        sb6.append(i17);
        sb6.append(" path=");
        sb6.append(a17);
        sb6.append(" show_ext_info_type=");
        sb6.append(I0 != null ? java.lang.Integer.valueOf(I0.f455427n) : null);
        sb6.append(" show_ext_info=");
        int i18 = 0;
        sb6.append((I0 != null ? I0.f455428o : null) != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TipsShowTabExt", sb6.toString());
        if ((I0 != null && I0.f455427n == 2) && (gVar = I0.f455428o) != null) {
            j03Var.mo11468x92b714fd(gVar != null ? gVar.g() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TipsShowTabExt", "tabType=" + i17 + " serverJumpPriority=" + j03Var.f458998d);
        } else if (I0 != null) {
            if (i17 == 1) {
                i18 = 700000;
            } else if (i17 == 3) {
                i18 = 600000;
            } else if (i17 == 4) {
                i18 = 500000;
            }
            j03Var.f458998d = i18;
        }
        return new mc2.b(i17, j03Var);
    }
}
