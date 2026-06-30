package b92;

@j95.b
/* loaded from: classes9.dex */
public final class s2 extends i95.w implements zy2.db {
    public ot0.q Ai(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        r45.g92 finderLiveShareObject = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(finderObject, 1).m59239x1309d228();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderLiveShareObject, "finderLiveShareObject");
        ot0.q qVar = new ot0.q();
        zy2.c cVar = new zy2.c();
        cVar.f558892b = finderLiveShareObject;
        qVar.f(cVar);
        qVar.f430199i = 63;
        qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
        qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
        return qVar;
    }

    public void Bi(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context, r45.zz2 shareInfo, r45.qt2 qt2Var, java.lang.String targetUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareInfo, "shareInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetUsername, "targetUsername");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", "shareFinderLiveThemeToConversation: theme_id=" + shareInfo.f474016g + ", main_title=" + shareInfo.f474013d);
        r45.hd2 hd2Var = new r45.hd2();
        hd2Var.set(0, shareInfo.f474013d);
        hd2Var.set(1, shareInfo.f474014e);
        hd2Var.set(3, shareInfo.f474016g);
        hd2Var.set(2, shareInfo.f474015f);
        ot0.q qVar = new ot0.q();
        zy2.d dVar = new zy2.d();
        dVar.f558904b = hd2Var;
        qVar.f(dVar);
        qVar.f430199i = 113;
        qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
        qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_Msg_Type", 38);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_Msg_content", ot0.q.u(qVar, null, null));
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        if (targetUsername.length() > 0) {
            intent.putExtra("Retr_MsgQuickShare", true);
            intent.putExtra("Select_Conv_User", targetUsername);
        }
        if (context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            j45.l.x((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context, ".ui.transmit.MsgRetransmitUI", intent, 1015, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n6(shareInfo, qt2Var));
        } else {
            j45.l.u(context, ".ui.transmit.MsgRetransmitUI", intent, null);
        }
    }

    public void Di(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject, android.os.Bundle bundle, int i17, int i18, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(finderObject, 1);
        a17.m59422xb121f1ef(i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a.B(context, a17, bundle, i17, lVar);
    }

    public ot0.q wi(r45.kv2 finderShareObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderShareObject, "finderShareObject");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a.h(finderShareObject);
    }
}
