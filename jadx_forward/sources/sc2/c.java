package sc2;

/* loaded from: classes2.dex */
public final class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc2.i f487327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f487328b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f487329c;

    public c(sc2.i iVar, int i17, long j17) {
        this.f487327a = iVar;
        this.f487328b = i17;
        this.f487329c = j17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String string;
        int i17;
        java.util.ArrayList m56388xcaeb60d0;
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i18 = fVar.f152148a;
        int i19 = fVar.f152149b;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
        java.lang.Long valueOf = java.lang.Long.valueOf(this.f487329c);
        sc2.i iVar = this.f487327a;
        iVar.getClass();
        if (i19 == -4061) {
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573624f60);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        } else if (i19 == -4060) {
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573625f61);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        } else if (i19 != -4057) {
            if (i19 == 0 && (fVar2 instanceof r45.rh2) && ((i17 = this.f487328b) == 3 || i17 == 4)) {
                boolean z17 = i17 == 3;
                long longValue = valueOf != null ? valueOf.longValue() : 0L;
                int e17 = z17 ? c01.id.e() : 0;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(longValue);
                if (h17 != null) {
                    h17.m59425xd630e258(e17);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28 = iVar.f487488a;
                if (abstractC13834x56f46d28 != null && (m56388xcaeb60d0 = abstractC13834x56f46d28.m56388xcaeb60d0()) != null) {
                    java.util.Iterator it = m56388xcaeb60d0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        so2.j5 j5Var = (so2.j5) obj2;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).mo2128x1ed62e84() == longValue) {
                            break;
                        }
                    }
                    so2.j5 j5Var2 = (so2.j5) obj2;
                    if (j5Var2 != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var2).getFeedObject().m59240x7c94657b().m76925xd630e258(e17);
                    }
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5444xabe18593 c5444xabe18593 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5444xabe18593();
                c5444xabe18593.f135784g.f88361a = 1001;
                c5444xabe18593.e();
                android.content.Context context = iVar.f487490c;
                if (context != null) {
                    if (z17) {
                        db5.t7.f(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573626f62), sc2.a.f487272a);
                    } else {
                        db5.t7.f(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cn7), sc2.b.f487305a);
                    }
                }
            }
            string = "";
        } else {
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f5z, java.lang.Integer.valueOf(iVar.f487489b));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            db5.t7.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, string, sc2.d.f487352a);
        }
        return jz5.f0.f384359a;
    }
}
