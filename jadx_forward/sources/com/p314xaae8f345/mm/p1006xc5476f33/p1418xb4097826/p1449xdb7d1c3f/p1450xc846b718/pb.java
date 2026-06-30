package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class pb extends dm.z4 {
    public static final l75.e0 P = dm.z4.m125731x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.pb.class);

    static {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        z65.c.a();
    }

    public static void v0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.pb pbVar, l75.n0 storage, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        pbVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.mb mbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.mb(storage, pbVar);
        if (z17) {
            pm0.v.O("Finder.RedDotCtrInfo", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.lb(mbVar));
        } else {
            mbVar.mo152xb9724478();
        }
    }

    public static boolean y0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.pb pbVar, java.lang.String source, l75.n0 storage, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        pbVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        java.lang.String str = pbVar.f69361xe125913b;
        if (!(str == null || str.length() == 0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ob obVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ob(storage, pbVar.u0(), source, pbVar, java.lang.System.currentTimeMillis());
            if (z17) {
                pm0.v.O("Finder.RedDotCtrInfo", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.nb(obVar));
                return true;
            }
            obVar.mo152xb9724478();
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.RedDotFreqCtrlInfo", pbVar.f69361xe125913b + ' ' + pbVar.f69360x85c9cf74 + " is inValid");
        return false;
    }

    @Override // dm.z4, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return P;
    }

    public final boolean t0(java.lang.String removePath) {
        r45.pc4 pc4Var;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(removePath, "removePath");
        r45.pc4 pc4Var2 = this.f69354xc9a807b9;
        java.util.LinkedList m75941xfb821914 = pc4Var2 != null ? pc4Var2.m75941xfb821914(1) : null;
        if ((m75941xfb821914 == null || m75941xfb821914.isEmpty()) || (pc4Var = this.f69354xc9a807b9) == null) {
            return false;
        }
        if (pc4Var.m75939xb282bd08(0) < 0 || pc4Var.m75939xb282bd08(0) >= pc4Var.m75941xfb821914(1).size()) {
            java.util.LinkedList m75941xfb8219142 = pc4Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getBanPathList(...)");
            str = (java.lang.String) kz5.n0.Z(m75941xfb8219142);
            if (str == null) {
                str = "";
            }
        } else {
            str = (java.lang.String) pc4Var.m75941xfb821914(1).get(pc4Var.m75939xb282bd08(0));
        }
        java.util.LinkedList m75941xfb8219143 = pc4Var.m75941xfb821914(1);
        if (m75941xfb8219143 != null) {
            m75941xfb8219143.remove(removePath);
        }
        java.util.LinkedList m75941xfb8219144 = pc4Var.m75941xfb821914(1);
        int size = m75941xfb8219144 != null ? m75941xfb8219144.size() : 0;
        if (size <= 0) {
            pc4Var.set(0, 0);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, removePath)) {
            pc4Var.set(0, java.lang.Integer.valueOf(pc4Var.m75939xb282bd08(0) % size));
        } else {
            java.util.LinkedList m75941xfb8219145 = pc4Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219145, "getBanPathList(...)");
            java.util.Iterator it = m75941xfb8219145.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) it.next(), str)) {
                    break;
                }
                i17++;
            }
            if (i17 < 0) {
                i17 = 0;
            }
            pc4Var.set(0, java.lang.Integer.valueOf(i17));
        }
        return true;
    }

    /* renamed from: toString */
    public java.lang.String m55904x9616526c() {
        if (this.f69362xb1b71ac3) {
            return "[" + this.f69361xe125913b + ',' + this.f69354xc9a807b9.m75941xfb821914(1) + ",index=" + this.f69354xc9a807b9.m75939xb282bd08(0) + ']';
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(this.f69361xe125913b);
        sb6.append(',');
        sb6.append(this.f69360x85c9cf74);
        sb6.append(":(");
        r45.vb4 vb4Var = this.f69356xb3d25a00;
        sb6.append(vb4Var != null ? java.lang.Integer.valueOf(vb4Var.m75939xb282bd08(0)) : null);
        sb6.append(',');
        r45.vb4 vb4Var2 = this.f69352xf2980dbf;
        sb6.append(vb4Var2 != null ? java.lang.Integer.valueOf(vb4Var2.m75939xb282bd08(0)) : null);
        sb6.append("),");
        sb6.append(this.f69353xe412923f);
        sb6.append(",exposeCnt=");
        r45.vb4 vb4Var3 = this.f69356xb3d25a00;
        sb6.append(vb4Var3 != null ? java.lang.Integer.valueOf(vb4Var3.m75939xb282bd08(0)) : null);
        sb6.append(" remain_expose=");
        sb6.append(this.f69356xb3d25a00.m75939xb282bd08(3));
        sb6.append(",banCnt=");
        r45.vb4 vb4Var4 = this.f69352xf2980dbf;
        sb6.append(vb4Var4 != null ? java.lang.Integer.valueOf(vb4Var4.m75939xb282bd08(0)) : null);
        sb6.append("(acc:");
        r45.vb4 vb4Var5 = this.f69352xf2980dbf;
        sb6.append(vb4Var5 != null ? java.lang.Integer.valueOf(vb4Var5.m75939xb282bd08(1)) : null);
        sb6.append(") remain_ban=");
        r45.vb4 vb4Var6 = this.f69352xf2980dbf;
        sb6.append(vb4Var6 != null ? java.lang.Integer.valueOf(vb4Var6.m75939xb282bd08(3)) : null);
        sb6.append(",accExpST=");
        sb6.append(this.f69351x57df10a6);
        sb6.append(",exposeCntLimit=");
        sb6.append(this.f69357x77f6419b);
        sb6.append(',');
        sb6.append(this.f69358x3f426193);
        sb6.append(']');
        return sb6.toString();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.pb u0() {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.pb pbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.pb();
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(mo9763xeb27878e());
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = null;
        }
        android.content.ContentValues contentValues = (android.content.ContentValues) m143895xf1229813;
        if (contentValues == null) {
            contentValues = mo9763xeb27878e();
        }
        pbVar.mo9762xbf5d97fd(contentValues, true);
        java.lang.String str = pbVar.f69361xe125913b;
        if (!(!(str == null || str.length() == 0))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.RedDotFreqCtrlInfo", "[cloneInstance] error! " + this.f69361xe125913b + ' ' + this.f69360x85c9cf74);
            pm0.z.b(xy2.b.f539688b, "FreqCtrInfoCloneFail", false, null, null, false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.kb(this), 60, null);
        }
        return pbVar;
    }

    public final boolean w0(r45.at2 freqConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(freqConfig, "freqConfig");
        jz5.o b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.qa.b(freqConfig, this);
        return b17 != null && ((java.lang.Number) b17.f384375e).intValue() < ((r45.f90) b17.f384376f).m75939xb282bd08(1);
    }
}
