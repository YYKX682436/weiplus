package u20;

/* loaded from: classes9.dex */
public final class r implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u20.y f505467a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f505468b;

    public r(u20.y yVar, android.content.Context context) {
        this.f505467a = yVar;
        this.f505468b = context;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsShareToContactLogicWAAPPMsg", "handle get bulk buy share info, errType:" + i17 + " errCode:" + i18);
        u20.y yVar = this.f505467a;
        if (i18 == 0 && i17 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.wechat.aff.proto.MmecGetBulkBuyShareInfoResp");
            bw5.xe0 xe0Var = (bw5.xe0) fVar;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handle get bulk buy share info, title:");
            sb6.append(xe0Var.f116614n[2] ? xe0Var.f116607d : "");
            sb6.append(", desc:");
            boolean[] zArr = xe0Var.f116614n;
            sb6.append(zArr[3] ? xe0Var.f116608e : "");
            sb6.append(", ecmsgSignature:");
            sb6.append(zArr[6] ? xe0Var.f116611h : "");
            sb6.append(", path:");
            sb6.append(zArr[4] ? xe0Var.f116609f : "");
            sb6.append(", imageUrl:");
            sb6.append(zArr[5] ? xe0Var.f116610g : "");
            sb6.append(", ecsJumpInfoBase64:");
            sb6.append(zArr[7] ? xe0Var.f116612i : "");
            sb6.append(", shopName:");
            sb6.append(xe0Var.b());
            sb6.append(", shopName:");
            sb6.append(xe0Var.b());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsShareToContactLogicWAAPPMsg", sb6.toString());
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zArr[2] ? xe0Var.f116607d : "")) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zArr[6] ? xe0Var.f116611h : "")) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zArr[4] ? xe0Var.f116609f : "")) {
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zArr[7] ? xe0Var.f116612i : "") && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xe0Var.b())) {
                            u20.q qVar = yVar.f505486d;
                            qVar.f505458g = zArr[2] ? xe0Var.f116607d : "";
                            qVar.f505459h = zArr[3] ? xe0Var.f116608e : "";
                            qVar.f505461j = zArr[4] ? xe0Var.f116609f : "";
                            qVar.f505460i = zArr[5] ? xe0Var.f116610g : "";
                            qVar.f505464m = xe0Var.b();
                            u20.q qVar2 = yVar.f505486d;
                            w05.h hVar = qVar2.f505466o;
                            if (hVar != null) {
                                java.lang.String str2 = zArr[6] ? xe0Var.f116611h : "";
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getEcmsgSignature(...)");
                                hVar.J(str2);
                            }
                            w05.h hVar2 = qVar2.f505466o;
                            if (hVar2 != null) {
                                java.lang.String str3 = zArr[7] ? xe0Var.f116612i : "";
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getEcsJumpInfoBase64(...)");
                                hVar2.K(str3);
                            }
                        }
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EcsShareToContactLogicWAAPPMsg", "get bulk buy share info but check resp fail");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EcsShareToContactLogicWAAPPMsg", "get bulk buy share info fail, errType:" + i17 + " errCode:" + i18);
        }
        yVar.f(this.f505468b);
    }
}
