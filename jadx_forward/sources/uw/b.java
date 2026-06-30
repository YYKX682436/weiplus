package uw;

/* loaded from: classes4.dex */
public final class b implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f513014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f513015e;

    public b(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, yz5.l lVar) {
        this.f513014d = c0Var;
        this.f513015e = lVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsFinderLiveUtil", "getFinderLiveInfo callback %d/%d %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f513014d;
        if (c0Var.f391645d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsFinderLiveUtil", "Multiple callbacks for the same request, skip");
            return 0;
        }
        c0Var.f391645d = true;
        kz5.p0 p0Var = kz5.p0.f395529d;
        yz5.l lVar = this.f513015e;
        if (i17 != 0 || i18 != 0) {
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p0Var)));
            return 0;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.EcsBatchGetLiveInfoResp");
        r45.zg0 zg0Var = (r45.zg0) fVar;
        java.util.LinkedList linkedList = zg0Var.f473526d;
        if (linkedList == null || linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandEcsFinderLiveUtil", "resp live_info_list null or empty");
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p0Var)));
            return 0;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList<r45.ch0> live_info_list = zg0Var.f473526d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(live_info_list, "live_info_list");
        for (r45.ch0 ch0Var : live_info_list) {
            if (ch0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsFinderLiveUtil", "export id: " + ch0Var.f453085g + ", live status: " + ch0Var.f453082d + ", live desc: " + ch0Var.f453083e + ", resp.interval: " + zg0Var.f473527e);
                if (zg0Var.f473527e > 0) {
                    java.lang.String str2 = ch0Var.f453085g;
                    if (!(str2 == null || str2.length() == 0)) {
                        uw.d dVar = uw.d.f513017a;
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) uw.d.f513018b.i();
                        java.lang.String export_id = ch0Var.f453085g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(export_id, "export_id");
                        o4Var.A("kEcsFinderLiveRefreshSvrInterval-".concat(export_id), zg0Var.f473527e);
                    }
                }
                linkedList2.add(new com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.C23605x2498b4d5(ch0Var.f453085g, java.lang.Long.valueOf(ch0Var.f453082d), ch0Var.f453083e));
            }
        }
        lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(linkedList2)));
        return 0;
    }
}
