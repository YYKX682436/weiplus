package zl2;

/* loaded from: classes2.dex */
public final class w1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f555545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f555546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f555547f;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f555545d = abstractC14490x69736cb5;
        this.f555546e = context;
        this.f555547f = k0Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        boolean z17;
        java.lang.String str;
        boolean z18;
        boolean z19;
        ec2.d e27;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572092yh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573608f54);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lxl object Status: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f555545d;
        sb6.append(abstractC14490x69736cb5.getFeedObject().getFeedObject().m76804x14884687());
        sb6.append(" isOnlySelfSee=");
        sb6.append(abstractC14490x69736cb5.getFeedObject().m59327xb219fc91());
        sb6.append(" isSelf=");
        sb6.append(hc2.b0.i(abstractC14490x69736cb5));
        sb6.append(" objectStatus:");
        sb6.append(abstractC14490x69736cb5.getFeedObject().getFeedObject().m76802x2dd01666());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", sb6.toString());
        boolean m59327xb219fc91 = abstractC14490x69736cb5.getFeedObject().m59327xb219fc91();
        android.content.Context context = this.f555546e;
        if (m59327xb219fc91 && hc2.b0.i(abstractC14490x69736cb5)) {
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            zl2.v1 v1Var = new zl2.v1(g4Var, abstractC14490x69736cb5, context, this.f555547f);
            ((c61.p2) ybVar).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            jz5.o b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c5.f183591a.b(context, abstractC14490x69736cb5, 2, v1Var);
            java.lang.String str2 = (java.lang.String) b17.f384374d;
            string2 = (java.lang.String) b17.f384375e;
            str = str2;
            z19 = true;
            z18 = true;
        } else {
            if (abstractC14490x69736cb5.getFeedObject().m59203x7541886a(103)) {
                z17 = false;
            } else {
                zl2.q4 q4Var = zl2.q4.f555466a;
                string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f3v);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                z17 = true;
            }
            if (abstractC14490x69736cb5.getFeedObject().m59203x7541886a(102)) {
                str = string;
                z18 = false;
            } else {
                zl2.q4 q4Var2 = zl2.q4.f555466a;
                java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f3u);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                str = string3;
                z18 = true;
            }
            z19 = z17;
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        r45.nw1 m59258xd0557130 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
        if (r4Var.n(m59258xd0557130 != null ? m59258xd0557130.m75939xb282bd08(54) : 0)) {
            g4Var.j(102, str, com.p314xaae8f345.mm.R.raw.f79181x28396080, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m), z18);
            g4Var.j(103, string2, com.p314xaae8f345.mm.R.raw.f78691x7ae93edb, 0, z19);
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            ml2.u1 u1Var = ml2.u1.f409595m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            boolean z27 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
            if (!z27) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context;
            ((b92.d1) zbVar).sj(u1Var, abstractC14490x69736cb5, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a(activityC0065xcd7aa112).c(zy2.ra.class))).V6());
            c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
            ml2.u1 u1Var2 = ml2.u1.f409598n;
            if (!z27) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((b92.d1) zbVar2).sj(u1Var2, abstractC14490x69736cb5, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a(activityC0065xcd7aa112).c(zy2.ra.class))).V6());
        }
        zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context);
        if (Sj != null) {
            c61.yb ybVar2 = (c61.yb) i95.n0.c(c61.yb.class);
            long mo2128x1ed62e84 = abstractC14490x69736cb5.mo2128x1ed62e84();
            int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).f216913n;
            ((c61.p2) ybVar2).getClass();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).bj(mo2128x1ed62e84, i17);
        }
        zy2.ra Sj2 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context);
        if (Sj2 == null || (e27 = zy2.ra.e2(Sj2, 0, 1, null)) == null) {
            return;
        }
        e27.a(new ec2.a(16, abstractC14490x69736cb5.mo2128x1ed62e84(), abstractC14490x69736cb5.w()));
    }
}
