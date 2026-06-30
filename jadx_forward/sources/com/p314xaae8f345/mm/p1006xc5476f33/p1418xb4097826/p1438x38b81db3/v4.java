package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class v4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f186300b;

    public v4(in5.s0 s0Var, long j17) {
        this.f186299a = s0Var;
        this.f186300b = j17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        in5.s0 s0Var = this.f186299a;
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedMsgNotifyConvert", "get feed detail result is null");
            return db5.e1.i(s0Var.f374654e, com.p314xaae8f345.mm.R.C30867xcad56011.cwu, 0);
        }
        int i17 = fVar.f152148a;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if ((i17 == 0 && fVar.f152149b == 0) || hc2.p.b(i17, fVar.f152149b)) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
            if (c19792x256d2725 == null) {
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedMsgNotifyConvert", "get feed detail success");
            ya2.g gVar = ya2.h.f542017a;
            if (!gVar.g(c19792x256d2725.m76836x6c03c64c())) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = c19792x256d2725.m76760x76845fea();
                c19782x23db1cfa.m76240x66bc2758(m76760x76845fea != null ? m76760x76845fea.m76197x6c03c64c() : null);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea2 = c19792x256d2725.m76760x76845fea();
                c19782x23db1cfa.m76227x7ac946f0(m76760x76845fea2 != null ? m76760x76845fea2.m76184x8010e5e4() : null);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea3 = c19792x256d2725.m76760x76845fea();
                c19782x23db1cfa.m76218xe0a5bcad(m76760x76845fea3 != null ? m76760x76845fea3.m76175x6d346f39() : null);
                ya2.g.m(gVar, c19782x23db1cfa, false, 2, null);
            }
            bu2.j.f106067a.n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 32), bu2.i.f106064l);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("feed_object_id", this.f186300b);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            android.content.Context context2 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            i0Var.Xj(context2, intent);
        } else {
            int i18 = fVar.f152149b;
            if (i18 == -4011) {
                return db5.e1.i(s0Var.f374654e, com.p314xaae8f345.mm.R.C30867xcad56011.cv_, 0);
            }
            if (i18 == -4033) {
                return db5.e1.i(s0Var.f374654e, com.p314xaae8f345.mm.R.C30867xcad56011.cwu, 0);
            }
        }
        return f0Var;
    }
}
