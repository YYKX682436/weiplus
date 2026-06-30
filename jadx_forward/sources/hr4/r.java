package hr4;

/* loaded from: classes4.dex */
public final class r implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f365801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hr4.s f365802b;

    public r(java.util.LinkedList linkedList, hr4.s sVar) {
        this.f365801a = linkedList;
        this.f365802b = sVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1wPersonalMsg.W1wPersonalMsgContactLooper", "cgi batch get profile contact. errCode: " + i18);
        if (i17 == 0 && i18 == 0 && oVar != null && (fVar = oVar.f152244b.f152233a) != null && (fVar instanceof r45.ej3)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetMsgContactListResp");
            r45.ej3 ej3Var = (r45.ej3) fVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1wPersonalMsg.W1wPersonalMsgContactLooper", "has get profile contact list: " + ej3Var.f455103d);
            java.util.LinkedList<r45.rq4> contact_list = ej3Var.f455103d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(contact_list, "contact_list");
            hr4.s sVar = this.f365802b;
            for (r45.rq4 rq4Var : contact_list) {
                if (rq4Var.f466656i == 0) {
                    kr4.e eVar = new kr4.e();
                    eVar.f68903xdec927b = rq4Var.f466653f;
                    eVar.f68899xf205f03e = rq4Var.f466652e;
                    eVar.f68901x21f9b213 = rq4Var.f466651d;
                    eVar.f68900x82c4b413 = rq4Var.f466654g;
                    eVar.f68902x78c97085 = rq4Var.f466655h;
                    ((fr4.g0) i95.n0.c(fr4.g0.class)).Ai().z0(eVar);
                    sVar.f365803a.a(true, eVar);
                }
            }
            fr4.g0 g0Var = (fr4.g0) i95.n0.c(fr4.g0.class);
            g0Var.getClass();
            ((ku5.t0) ku5.t0.f394148d).B(new fr4.d0(g0Var));
        } else {
            java.util.LinkedList<java.lang.String> linkedList = this.f365801a;
            hr4.s sVar2 = this.f365802b;
            for (java.lang.String str2 : linkedList) {
                hr4.q qVar = sVar2.f365803a;
                kr4.e eVar2 = new kr4.e();
                eVar2.f68903xdec927b = str2;
                qVar.a(false, eVar2);
            }
        }
        this.f365802b.f365805c.set(false);
        this.f365802b.b();
    }
}
