package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class wo implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dm.pd f217888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.yo f217889b;

    public wo(dm.pd pdVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.yo yoVar) {
        this.f217888a = pdVar;
        this.f217889b = yoVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.wj4 wj4Var;
        r45.wj4 wj4Var2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        dm.pd pdVar = this.f217888a;
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "result == null id " + pdVar.f66095xc8a07680 + " content " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(pdVar.f66079xad49e234));
        } else {
            int i17 = fVar.f152148a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.yo yoVar = this.f217889b;
            if (i17 == 0 && fVar.f152149b == 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get mega video detail success, id = ");
                db2.n4 n4Var = yoVar.f218133h;
                sb6.append(n4Var != null ? java.lang.Long.valueOf(n4Var.f309632t) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, sb6.toString());
                r45.xf2 xf2Var = new r45.xf2();
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MegaVideoDetailResponse");
                xf2Var.set(0, (r45.oj4) ((r45.tj4) fVar2).m75936x14adae67(1));
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = fVar.f152151d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MegaVideoDetailResponse");
                xf2Var.set(1, (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) ((r45.tj4) fVar3).m75936x14adae67(2));
                int i18 = yoVar.f218129d == 1 ? 7 : 5;
                r45.oj4 oj4Var = (r45.oj4) xf2Var.m75936x14adae67(0);
                if (oj4Var != null && (wj4Var = (r45.wj4) oj4Var.m75936x14adae67(18)) != null) {
                    long m75942xfb822ef2 = wj4Var.m75942xfb822ef2(0);
                    r45.oj4 oj4Var2 = (r45.oj4) xf2Var.m75936x14adae67(0);
                    java.lang.String m75945x2fec8307 = (oj4Var2 == null || (wj4Var2 = (r45.wj4) oj4Var2.m75936x14adae67(18)) == null) ? null : wj4Var2.m75945x2fec8307(1);
                    int i19 = yoVar.f218129d;
                    android.app.Activity context = yoVar.m80379x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                    db2.g4 g4Var = new db2.g4(m75942xfb822ef2, m75945x2fec8307, i18, i19, "", true, null, null, 0L, null, false, false, null, nyVar != null ? nyVar.V6() : null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536862656, null);
                    yoVar.f218132g = g4Var;
                    g4Var.l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vo(pdVar, yoVar));
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.yo.O6(yoVar, fVar.f152149b);
            }
        }
        return jz5.f0.f384359a;
    }
}
