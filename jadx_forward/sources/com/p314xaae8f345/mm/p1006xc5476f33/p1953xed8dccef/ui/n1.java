package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes15.dex */
public class n1 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.o1 f234852a;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.o1 o1Var) {
        this.f234852a = o1Var;
    }

    @Override // db5.c1
    public void e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.o1 o1Var = this.f234852a;
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.w wVar = o1Var.f234856d.f234795w;
            wq3.j jVar = wVar.f234900g;
            java.lang.String p17 = jVar.p();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_content", p17);
            intent.putExtra("Retr_Msg_Type", 2);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.f530082b.a())) {
                intent.putExtra("Retr_Msg_thumb_path", jVar.k());
            }
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("Retr_Msg_Type", 2);
            j45.l.u(wVar.f234897d, ".ui.transmit.MsgRetransmitUI", intent, null);
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.w.f234896m == 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10651, 11, 1, 0);
                return;
            }
            return;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.w wVar2 = o1Var.f234856d.f234795w;
            wq3.j jVar2 = wVar2.f234900g;
            wq3.t tVar = jVar2.f530082b;
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("KContentObjDesc", jVar2.q());
            intent2.putExtra("Ksnsupload_title", tVar.f530132e.f537592d);
            intent2.putExtra("Ksnsupload_link", jVar2.l());
            intent2.putExtra("Ksnsupload_imgurl", jVar2.f530082b.a());
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar2.f530082b.a())) {
                intent2.putExtra("KsnsUpload_imgPath", jVar2.k());
            }
            intent2.putExtra("Ksnsupload_type", 6);
            intent2.putExtra("KUploadProduct_UserData", jVar2.r(tVar));
            intent2.putExtra("KUploadProduct_subType", tVar.f530129b);
            java.lang.String a17 = c01.n2.a("scan_product");
            c01.n2.d().c(a17, true).i("prePublishId", "scan_product");
            intent2.putExtra("reportSessionId", a17);
            j45.l.j(wVar2.f234897d, "sns", ".ui.SnsUploadUI", intent2, null);
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.w.f234896m == 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10651, 11, 0, 0);
                return;
            }
            return;
        }
        if (i17 != 2) {
            if (i17 != 3) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.w wVar3 = o1Var.f234856d.f234795w;
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.a0(wVar3.f234897d, wVar3.f234900g.j());
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.w wVar4 = o1Var.f234856d.f234795w;
        wq3.j jVar3 = wVar4.f234900g;
        wq3.t tVar2 = jVar3.f530082b;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        r45.aq0 aq0Var = new r45.aq0();
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(11);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        jq0Var.c(java.lang.System.currentTimeMillis());
        aq0Var.g(tVar2.f530132e.f537592d);
        aq0Var.d(jVar3.q());
        aq0Var.i(tVar2.f530129b);
        aq0Var.e(jVar3.r(tVar2));
        aq0Var.f(tVar2.a());
        java.lang.String str = tVar2.f530132e.f537592d;
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87851d = str;
        c4Var.f87852e = jVar3.q();
        c4Var.f87848a = bq0Var;
        c4Var.f87850c = 11;
        bq0Var.o(jq0Var);
        bq0Var.n(aq0Var);
        c4Var.f87856i = wVar4.f234897d;
        c4Var.f87860m = 5;
        c5303xc75d2f73.e();
    }
}
