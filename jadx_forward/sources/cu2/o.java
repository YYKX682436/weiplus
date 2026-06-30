package cu2;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final cu2.o f303963a = new cu2.o();

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draftItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftItem, "draftItem");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = draftItem.t0().getFeedObject().m76802x2dd01666();
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e = m76802x2dd01666 != null ? m76802x2dd01666.m76962x74cd162e() : null;
        if (m76962x74cd162e == null || m76962x74cd162e.size() <= 0) {
            return;
        }
        r45.fc4 fc4Var = new r45.fc4();
        for (r45.mb4 mb4Var : bu2.z.h(m76962x74cd162e)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(16);
            java.lang.String str = "";
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            sb6.append(m75945x2fec8307);
            java.lang.String m75945x2fec83072 = mb4Var.m75945x2fec8307(20);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            sb6.append(m75945x2fec83072);
            mb4Var.set(23, sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            java.lang.String m75945x2fec83073 = mb4Var.m75945x2fec8307(41);
            if (m75945x2fec83073 == null) {
                m75945x2fec83073 = "";
            }
            sb7.append(m75945x2fec83073);
            java.lang.String m75945x2fec83074 = mb4Var.m75945x2fec8307(42);
            if (m75945x2fec83074 == null) {
                m75945x2fec83074 = "";
            }
            sb7.append(m75945x2fec83074);
            mb4Var.set(40, sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            java.lang.String m75945x2fec83075 = mb4Var.m75945x2fec8307(0);
            if (m75945x2fec83075 == null) {
                m75945x2fec83075 = "";
            }
            sb8.append(m75945x2fec83075);
            java.lang.String m75945x2fec83076 = mb4Var.m75945x2fec8307(18);
            if (m75945x2fec83076 == null) {
                m75945x2fec83076 = "";
            }
            sb8.append(m75945x2fec83076);
            mb4Var.set(11, sb8.toString());
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            java.lang.String m75945x2fec83077 = mb4Var.m75945x2fec8307(1);
            if (m75945x2fec83077 == null) {
                m75945x2fec83077 = "";
            }
            sb9.append(m75945x2fec83077);
            java.lang.String m75945x2fec83078 = mb4Var.m75945x2fec8307(19);
            if (m75945x2fec83078 == null) {
                m75945x2fec83078 = "";
            }
            sb9.append(m75945x2fec83078);
            mb4Var.set(12, sb9.toString());
            java.lang.String m75945x2fec83079 = mb4Var.m75945x2fec8307(28);
            if (m75945x2fec83079 == null) {
                m75945x2fec83079 = "";
            }
            mb4Var.set(35, m75945x2fec83079);
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            java.lang.String m75945x2fec830710 = mb4Var.m75945x2fec8307(25);
            if (m75945x2fec830710 == null) {
                m75945x2fec830710 = "";
            }
            sb10.append(m75945x2fec830710);
            java.lang.String m75945x2fec830711 = mb4Var.m75945x2fec8307(26);
            if (m75945x2fec830711 == null) {
                m75945x2fec830711 = "";
            }
            sb10.append(m75945x2fec830711);
            mb4Var.set(27, sb10.toString());
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            java.lang.String m75945x2fec830712 = mb4Var.m75945x2fec8307(62);
            if (m75945x2fec830712 == null) {
                m75945x2fec830712 = "";
            }
            sb11.append(m75945x2fec830712);
            java.lang.String m75945x2fec830713 = mb4Var.m75945x2fec8307(63);
            if (m75945x2fec830713 != null) {
                str = m75945x2fec830713;
            }
            sb11.append(str);
            mb4Var.set(65, sb11.toString());
            fc4Var.m75941xfb821914(0).add(mb4Var);
        }
        draftItem.t0().f66943xbf77a500 = fc4Var;
    }

    public final boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draftItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftItem, "draftItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDraftStorageLogic", "Finder.LogPost updateOrCreateLocalDraft, " + draftItem.v0());
        cu2.n Oj = ((c61.l7) i95.n0.c(c61.l7.class)).Oj();
        long j17 = draftItem.f66236x88be67a1;
        if (j17 == 0) {
            long L0 = Oj.L0(draftItem);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5464x5322afbe c5464x5322afbe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5464x5322afbe();
            am.ab abVar = c5464x5322afbe.f135803g;
            abVar.f87677a = 100;
            abVar.f87678b = L0;
            c5464x5322afbe.e();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDraftStorageLogic", "Finder.LogPost updateOrCreateLocalDraft save all, " + draftItem.v0());
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 D0 = Oj.D0(j17);
        if (D0 != null && D0.f66242x8987ca93 <= draftItem.f66242x8987ca93) {
            Oj.W0(j17, draftItem);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDraftStorageLogic", "Finder.LogPost updateOrCreateLocalDraft save id, " + draftItem.v0());
            return true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Finder.LogPost updateOrCreateLocalDraft cannot update, exist:");
        sb6.append(D0 != null);
        sb6.append(", version:");
        sb6.append((D0 != null ? D0.f66242x8987ca93 : 0) <= draftItem.f66242x8987ca93);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDraftStorageLogic", sb6.toString());
        return false;
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draftItem, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 svrFinderObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftItem, "draftItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(svrFinderObj, "svrFinderObj");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDraftStorageLogic", "Finder.LogPost updatePostSvrDraft, " + draftItem.v0());
        cu2.n Oj = ((c61.l7) i95.n0.c(c61.l7.class)).Oj();
        long j17 = draftItem.f66236x88be67a1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 D0 = Oj.D0(j17);
        if (D0 != null && D0.f66242x8987ca93 > draftItem.f66242x8987ca93) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDraftStorageLogic", "Finder.LogPost updatePostSvrDraft, just save id");
            draftItem.f66238x2327e25f = svrFinderObj.m76784x5db1b11();
            Oj.W0(j17, draftItem);
        } else {
            if (D0 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDraftStorageLogic", "Finder.LogPost updatePostSvrDraft, deleted");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDraftStorageLogic", "Finder.LogPost updatePostSvrDraft, overwrite");
            draftItem.f66235x52c1d072 = 4;
            draftItem.f66238x2327e25f = svrFinderObj.m76784x5db1b11();
            draftItem.L = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.c(svrFinderObj, null, draftItem.f66236x88be67a1);
            a(draftItem);
            Oj.W0(draftItem.f66236x88be67a1, draftItem);
        }
    }

    public final java.util.ArrayList d(java.util.List svrFinderObjs) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(svrFinderObjs, "svrFinderObjs");
        cu2.n Oj = ((c61.l7) i95.n0.c(c61.l7.class)).Oj();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = svrFinderObjs.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 J0 = Oj.J0(c19792x256d2725.m76784x5db1b11());
            cu2.o oVar = f303963a;
            if (J0 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80();
                x80Var.f66235x52c1d072 = 4;
                r45.ec1 ec1Var = new r45.ec1();
                ec1Var.set(0, c19792x256d2725);
                x80Var.f66234xddef18be = ec1Var;
                x80Var.f66239xf8be237e = c19792x256d2725.m76805x2dd7a70f();
                x80Var.f66241x844f7c1 = "";
                x80Var.f66240x6a01bfe2 = null;
                x80Var.f66238x2327e25f = c19792x256d2725.m76784x5db1b11();
                x80Var.f66237x922d48c7 = 0;
                x80Var.f66242x8987ca93 = 0;
                oVar.a(x80Var);
                Oj.L0(x80Var);
                arrayList.add(x80Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDraftStorageLogic", "Finder.LogPost updateSvrDrafts, create, " + x80Var.v0());
            } else if (J0.f66237x922d48c7 == 0) {
                if ((4 & J0.f66235x52c1d072) != 0) {
                    J0.L = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.c(c19792x256d2725, null, J0.f66236x88be67a1);
                    oVar.a(J0);
                    long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
                    J0.w0();
                    android.content.ContentValues mo9763xeb27878e = J0.mo9763xeb27878e();
                    mo9763xeb27878e.remove("rowid");
                    Oj.f303961i.p("FinderDraftItem", mo9763xeb27878e, "objectId=?", new java.lang.String[]{"" + m76784x5db1b11});
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDraftStorageLogic", "Finder.LogPost updateSvrDrafts, update, " + J0.v0());
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDraftStorageLogic", "Finder.LogPost updateSvrDrafts, drop, " + J0.v0());
                }
                arrayList.add(J0);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
            if (m76802x2dd01666 != null && (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) != null && (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDraftStorageLogic", "Finder.LogPost updateSvrDrafts, full_cover_url:" + c19788xd7cfd73e.m76593x1b8bd82d() + " full_cover_url_token:" + c19788xd7cfd73e.m76594x3e755f67());
            }
        }
        return arrayList;
    }
}
