package dk5;

/* loaded from: classes9.dex */
public final class o6 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f316313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m f316314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f316315f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f316316g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k91.v5 f316317h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb f316318i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316319m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f316320n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 f316321o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ dk5.f6 f316322p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f316323q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316324r;

    public o6(java.util.LinkedList linkedList, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, boolean z17, boolean z18, k91.v5 v5Var, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb c11287xc333feeb, java.lang.String str, int i17, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, dk5.f6 f6Var, int i18, java.lang.String str2) {
        this.f316313d = linkedList;
        this.f316314e = mVar;
        this.f316315f = z17;
        this.f316316g = z18;
        this.f316317h = v5Var;
        this.f316318i = c11287xc333feeb;
        this.f316319m = str;
        this.f316320n = i17;
        this.f316321o = c11286x34a5504;
        this.f316322p = f6Var;
        this.f316323q = i18;
        this.f316324r = str2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendWXMediaMessageHelper", "callback, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.WxaAppGetShareInfoResponse");
        r45.hc7 hc7Var = (r45.hc7) fVar;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = this.f316321o;
        dk5.y6 y6Var = dk5.y6.f316543a;
        boolean z17 = this.f316316g;
        java.lang.String str2 = this.f316319m;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb c11287xc333feeb = this.f316318i;
        k91.v5 v5Var = this.f316317h;
        boolean z18 = this.f316315f;
        java.lang.String str3 = "field_appId";
        int i19 = this.f316320n;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = this.f316314e;
        java.util.LinkedList linkedList2 = this.f316313d;
        if (i17 == 0 && i18 == 0 && (linkedList = hc7Var.f457590d) != null) {
            if (linkedList == null) {
                linkedList = new java.util.LinkedList();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendWXMediaMessageHelper", "get wxaAppShareInfoList size = %d, toUserList size = %d", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(linkedList2.size()));
            int size = linkedList2.size();
            int i27 = 0;
            while (i27 < size) {
                r45.vc7 vc7Var = i27 < linkedList.size() ? (r45.vc7) linkedList.get(i27) : new r45.vc7();
                java.util.LinkedList linkedList3 = linkedList;
                ot0.q qVar = new ot0.q();
                int i28 = size;
                java.lang.String str4 = mVar.f67370x28d45f97;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, str3);
                if (!z18 && z17) {
                    str4 = "";
                }
                qVar.f430179d = str4;
                qVar.f430210k2 = v5Var.f68904x28d45f97;
                qVar.f430255w = v5Var.f68924xdec927b;
                qVar.f430259x = v5Var.f68913x21f9b213;
                qVar.f430270z2 = c11287xc333feeb.f33175xc6c9cf27;
                qVar.H = mVar.f67372x453d1e07;
                qVar.f430239s = 2;
                qVar.f430226o2 = vc7Var.f469647e;
                qVar.f430222n2 = str2;
                qVar.f430214l2 = c11287xc333feeb.f33179x4d2e325 ? 3 : 2;
                qVar.f430250u2 = i19;
                y6Var.f(qVar, c11286x34a5504);
                k91.v5 v5Var2 = v5Var;
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb c11287xc333feeb2 = c11287xc333feeb;
                java.util.LinkedList linkedList4 = linkedList2;
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a55042 = c11286x34a5504;
                int i29 = i19;
                java.lang.String str5 = str2;
                java.lang.String str6 = str3;
                boolean z19 = z18;
                y6Var.b((java.lang.String) linkedList2.get(i27), this.f316317h, qVar, vc7Var, this.f316322p);
                if (i29 != 0) {
                    qVar.f430238r2 = 1;
                }
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.G(qVar, this.f316321o, (java.lang.String) linkedList4.get(i27), null, this.f316323q, dk5.y6.i(y6Var, this.f316315f, this.f316324r, null, this.f316322p, 4, null));
                i27++;
                linkedList = linkedList3;
                v5Var = v5Var2;
                i19 = i29;
                c11287xc333feeb = c11287xc333feeb2;
                str2 = str5;
                str3 = str6;
                z18 = z19;
                linkedList2 = linkedList4;
                size = i28;
                c11286x34a5504 = c11286x34a55042;
            }
        } else {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a55043 = c11286x34a5504;
            java.lang.String str7 = "field_appId";
            java.lang.String str8 = str2;
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                java.lang.String str9 = (java.lang.String) it.next();
                java.lang.String str10 = mVar.f67370x28d45f97;
                java.lang.String str11 = str7;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str10, str11);
                if (!z18 && z17) {
                    str10 = "";
                }
                ot0.q qVar2 = new ot0.q();
                qVar2.f430179d = str10;
                qVar2.f430210k2 = v5Var.f68904x28d45f97;
                qVar2.f430255w = v5Var.f68924xdec927b;
                qVar2.f430259x = v5Var.f68913x21f9b213;
                qVar2.f430270z2 = c11287xc333feeb.f33175xc6c9cf27;
                qVar2.H = mVar.f67372x453d1e07;
                qVar2.f430239s = 2;
                java.lang.String str12 = str8;
                qVar2.f430222n2 = str12;
                qVar2.f430214l2 = c11287xc333feeb.f33179x4d2e325 ? 3 : 2;
                qVar2.f430250u2 = i19;
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a55044 = c11286x34a55043;
                y6Var.f(qVar2, c11286x34a55044);
                str7 = str11;
                y6Var.b(str9, this.f316317h, qVar2, null, this.f316322p);
                if (i19 != 0) {
                    qVar2.f430238r2 = 1;
                }
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.G(qVar2, this.f316321o, str9, null, this.f316323q, dk5.y6.i(y6Var, this.f316315f, this.f316324r, null, this.f316322p, 4, null));
                str8 = str12;
                c11286x34a55043 = c11286x34a55044;
            }
        }
        return 0;
    }
}
