package b92;

@j95.b
/* loaded from: classes9.dex */
public final class s2 extends i95.w implements zy2.db {
    public ot0.q Ai(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        r45.g92 finderLiveShareObject = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 1).getFinderLive();
        kotlin.jvm.internal.o.g(finderLiveShareObject, "finderLiveShareObject");
        ot0.q qVar = new ot0.q();
        zy2.c cVar = new zy2.c();
        cVar.f477359b = finderLiveShareObject;
        qVar.f(cVar);
        qVar.f348666i = 63;
        qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
        qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
        return qVar;
    }

    public void Bi(androidx.appcompat.app.AppCompatActivity context, r45.zz2 shareInfo, r45.qt2 qt2Var, java.lang.String targetUsername) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(shareInfo, "shareInfo");
        kotlin.jvm.internal.o.g(targetUsername, "targetUsername");
        com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", "shareFinderLiveThemeToConversation: theme_id=" + shareInfo.f392483g + ", main_title=" + shareInfo.f392480d);
        r45.hd2 hd2Var = new r45.hd2();
        hd2Var.set(0, shareInfo.f392480d);
        hd2Var.set(1, shareInfo.f392481e);
        hd2Var.set(3, shareInfo.f392483g);
        hd2Var.set(2, shareInfo.f392482f);
        ot0.q qVar = new ot0.q();
        zy2.d dVar = new zy2.d();
        dVar.f477371b = hd2Var;
        qVar.f(dVar);
        qVar.f348666i = 113;
        qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
        qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
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
        if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
            j45.l.x((com.tencent.mm.ui.MMFragmentActivity) context, ".ui.transmit.MsgRetransmitUI", intent, 1015, new com.tencent.mm.plugin.finder.assist.n6(shareInfo, qt2Var));
        } else {
            j45.l.u(context, ".ui.transmit.MsgRetransmitUI", intent, null);
        }
    }

    public void Di(androidx.appcompat.app.AppCompatActivity context, com.tencent.mm.protocal.protobuf.FinderObject finderObject, android.os.Bundle bundle, int i17, int i18, yz5.l lVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 1);
        a17.setShareScene(i18);
        com.tencent.mm.plugin.finder.assist.n7.f102406a.B(context, a17, bundle, i17, lVar);
    }

    public ot0.q wi(r45.kv2 finderShareObject) {
        kotlin.jvm.internal.o.g(finderShareObject, "finderShareObject");
        return com.tencent.mm.plugin.finder.assist.n7.f102406a.h(finderShareObject);
    }
}
