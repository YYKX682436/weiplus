package dk5;

/* loaded from: classes9.dex */
public final class s6 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f316417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m f316418e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f316419f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f316420g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 f316421h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f316422i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316423m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ dk5.f6 f316424n;

    public s6(java.util.LinkedList linkedList, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, boolean z17, boolean z18, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, int i17, java.lang.String str, dk5.f6 f6Var) {
        this.f316417d = linkedList;
        this.f316418e = mVar;
        this.f316419f = z17;
        this.f316420g = z18;
        this.f316421h = c11286x34a5504;
        this.f316422i = i17;
        this.f316423m = str;
        this.f316424n = f6Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendWXMediaMessageHelper", "sendSecretAppMsg getShareInfo callback, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.WxaAppGetShareInfoResponse");
        r45.hc7 hc7Var = (r45.hc7) fVar;
        boolean z17 = this.f316420g;
        dk5.y6 y6Var = dk5.y6.f316543a;
        int i19 = 2;
        boolean z18 = this.f316419f;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = this.f316418e;
        java.util.LinkedList linkedList2 = this.f316417d;
        if (i17 == 0 && i18 == 0 && (linkedList = hc7Var.f457590d) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendWXMediaMessageHelper", "sendSecretAppMsg getShareInfo size = %d, toUserList size = %d", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(linkedList2.size()));
            int size = linkedList2.size();
            int i27 = 0;
            while (i27 < size) {
                r45.vc7 vc7Var = i27 < linkedList.size() ? (r45.vc7) linkedList.get(i27) : new r45.vc7();
                ot0.q qVar = new ot0.q();
                java.lang.String field_appId = mVar.f67370x28d45f97;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_appId, "field_appId");
                if (!z18 && z17) {
                    field_appId = "";
                }
                qVar.f430179d = field_appId;
                qVar.H = mVar.f67372x453d1e07;
                qVar.f430239s = i19;
                dk5.y6.a(y6Var, qVar, vc7Var);
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.G(qVar, this.f316421h, (java.lang.String) linkedList2.get(i27), null, this.f316422i, dk5.y6.i(y6Var, this.f316419f, this.f316423m, null, this.f316424n, 4, null));
                i27++;
                mVar = mVar;
                linkedList2 = linkedList2;
                i19 = 2;
                linkedList = linkedList;
            }
        } else {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                java.lang.String field_appId2 = mVar.f67370x28d45f97;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_appId2, "field_appId");
                if (!z18 && z17) {
                    field_appId2 = "";
                }
                ot0.q qVar2 = new ot0.q();
                qVar2.f430179d = field_appId2;
                qVar2.H = mVar.f67372x453d1e07;
                qVar2.f430239s = 2;
                dk5.y6.a(y6Var, qVar2, null);
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.G(qVar2, this.f316421h, str2, null, this.f316422i, dk5.y6.i(y6Var, this.f316419f, this.f316423m, null, this.f316424n, 4, null));
            }
        }
        return 0;
    }
}
