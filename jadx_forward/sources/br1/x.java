package br1;

/* loaded from: classes11.dex */
public final class x implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f105177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ br1.y f105178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105179c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f105180d;

    public x(java.util.LinkedList linkedList, br1.y yVar, java.lang.String str, int i17) {
        this.f105177a = linkedList;
        this.f105178b = yVar;
        this.f105179c = str;
        this.f105180d = i17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.BizFansContactLooper", "cgi batch get profile contact. errCode: " + i18);
        int i19 = this.f105180d;
        br1.y yVar = this.f105178b;
        if (i17 == 0 && i18 == 0 && oVar != null && (fVar = oVar.f152244b.f152233a) != null && (fVar instanceof r45.nv6)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.UserAttrResp");
            r45.nv6 nv6Var = (r45.nv6) fVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.BizFansContactLooper", "has get profile contact list: " + nv6Var.f463231d);
            java.util.LinkedList<r45.lv6> list = nv6Var.f463231d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "list");
            for (r45.lv6 lv6Var : list) {
                hr1.a aVar = new hr1.a();
                java.lang.String openid = lv6Var.f461393d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(openid, "openid");
                aVar.f66213x996f7ca = jr1.j.b(openid, i19);
                aVar.f66207xff000111 = lv6Var.f461394e;
                aVar.f66212x21f9b213 = lv6Var.f461395f;
                aVar.f66210x4f9943d = lv6Var.f461397h;
                aVar.f66208xdb41eadf = lv6Var.f461396g;
                aVar.f66209x4f67f8e = lv6Var.f461398i;
                aVar.f66202x2ea7cae6 = lv6Var.f461399m;
                aVar.f66216xf8cebfca = lv6Var.f461400n;
                if (i19 == 5) {
                    yq1.u0.Ui().z0(aVar);
                } else {
                    yq1.u0.Bi().z0(aVar);
                }
                yVar.f105181a.b(true, i19, aVar);
            }
        } else {
            for (java.lang.String str2 : this.f105177a) {
                br1.w wVar = yVar.f105181a;
                hr1.a aVar2 = new hr1.a();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                aVar2.f66213x996f7ca = jr1.j.a(str2);
                wVar.b(false, i19, aVar2);
            }
        }
        yVar.f105183c.set(false);
        yVar.b(this.f105179c, i19);
    }
}
