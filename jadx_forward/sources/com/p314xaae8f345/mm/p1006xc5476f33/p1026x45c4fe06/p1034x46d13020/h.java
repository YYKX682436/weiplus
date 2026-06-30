package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public final class h implements p012xc85e97e9.p103xe821e364.p104xd1075a44.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f f157977a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f157978b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f157979c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f f157980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l f157981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f157982f;

    public h(com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, java.util.List list, java.util.List list2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l lVar, java.util.ArrayList arrayList) {
        this.f157977a = c19767x257d7f;
        this.f157978b = list;
        this.f157979c = list2;
        this.f157980d = fVar;
        this.f157981e = lVar;
        this.f157982f = arrayList;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r1
    public void a(int i17, int i18, java.lang.Object obj) {
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r1
    public void b(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4;
        this.f157977a.f38864x6ac9171 += i18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("applyDiff, onInserted position=");
        sb6.append(i17);
        sb6.append(" count=");
        sb6.append(i18);
        sb6.append("  oldList.size=");
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4> list = this.f157978b;
        sb6.append(list.size());
        sb6.append("  newList.size=");
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4> list2 = this.f157979c;
        sb6.append(list2.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", sb6.toString());
        int i19 = i18 + i17;
        if (i19 == list2.size()) {
            c11714x918fd2e4 = null;
        } else {
            try {
                c11714x918fd2e4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) list2.get(i19);
            } catch (java.lang.IndexOutOfBoundsException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "print old list:" + list.size());
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e42 : list) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", c11714x918fd2e42.f157898h + ':' + c11714x918fd2e42.f157896f);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "print new list:" + list2.size());
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e43 : list2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", c11714x918fd2e43.f157898h + ':' + c11714x918fd2e43.f157896f);
                }
                throw e17;
            }
        }
        int i27 = i19 - 1;
        if (i17 > i27) {
            return;
        }
        while (true) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e44 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) list2.get(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e45 = i17 == 0 ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) list2.get(i17 - 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f fVar = this.f157980d;
            if (fVar != null) {
                fVar.b(c11714x918fd2e44);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l lVar = this.f157981e;
            r45.id6 wi6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l.wi(lVar, c11714x918fd2e44);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wi6);
            r45.id6 wi7 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l.wi(lVar, c11714x918fd2e45);
            r45.id6 wi8 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l.wi(lVar, c11714x918fd2e4);
            r45.jd6 jd6Var = new r45.jd6();
            jd6Var.f459259d = wi6;
            jd6Var.f459263h = 1;
            jd6Var.f459260e = wi7;
            jd6Var.f459261f = wi8;
            lVar.Bi(jd6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l3.f158037e);
            if (i17 == i27) {
                return;
            } else {
                i17++;
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r1
    public void c(int i17, int i18) {
        this.f157977a.f38864x6ac9171 += i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "applyDiff, onRemoved position=" + i17 + " count=" + i18);
        int i19 = i18 + i17 + (-1);
        if (i17 > i19) {
            return;
        }
        int i27 = i17;
        while (true) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) this.f157982f.remove(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f fVar = this.f157980d;
            if (fVar != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11714x918fd2e4);
                fVar.a(c11714x918fd2e4);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l lVar = this.f157981e;
            r45.id6 wi6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l.wi(lVar, c11714x918fd2e4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wi6);
            r45.jd6 jd6Var = new r45.jd6();
            jd6Var.f459259d = wi6;
            jd6Var.f459263h = 2;
            jd6Var.f459260e = null;
            jd6Var.f459261f = null;
            lVar.Bi(jd6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l3.f158037e);
            if (i27 == i19) {
                return;
            } else {
                i27++;
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r1
    public void d(int i17, int i18) {
        this.f157977a.f38864x6ac9171++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "applyDiff, onMoved from " + i17 + " to " + i18);
        java.util.ArrayList arrayList = this.f157982f;
        arrayList.add(i18, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) arrayList.remove(i17));
        java.lang.Object obj = arrayList.get(i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e42 = i18 == 0 ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) arrayList.get(i18 - 1);
        int i19 = i18 + 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e43 = i19 != arrayList.size() ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) arrayList.get(i19) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l lVar = this.f157981e;
        r45.id6 wi6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l.wi(lVar, c11714x918fd2e4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wi6);
        r45.id6 wi7 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l.wi(lVar, c11714x918fd2e42);
        r45.id6 wi8 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l.wi(lVar, c11714x918fd2e43);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        r45.jd6 jd6Var = new r45.jd6();
        jd6Var.f459259d = wi6;
        jd6Var.f459263h = 3;
        jd6Var.f459260e = wi7;
        jd6Var.f459261f = wi8;
        lVar.Bi(jd6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l3.f158037e);
    }
}
