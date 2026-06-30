package qk;

/* loaded from: classes10.dex */
public abstract class p {
    public static void a(android.content.Intent intent, r45.iw5 iw5Var, int i17) {
        ((c01.j0) ((qk.o6) i95.n0.c(qk.o6.class))).Ai(intent, iw5Var, i17);
    }

    public static void b(android.content.Intent intent, r45.cx5 cx5Var, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cx5Var.f453444r)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BuildContactInfoIntent", "FinderUsername is empty");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BuildContactInfoIntent", "FinderUsername is " + cx5Var.f453444r);
        }
        intent.putExtra("Contact_User", cx5Var.f453433d);
        intent.putExtra("Contact_Nick", cx5Var.f453434e);
        intent.putExtra("Contact_PyInitial", cx5Var.f453435f);
        intent.putExtra("Contact_QuanPin", cx5Var.f453436g);
        intent.putExtra("Contact_Sex", cx5Var.f453437h);
        intent.putExtra("Contact_Scene", i17);
        intent.putExtra("Contact_KHideExpose", true);
        intent.putExtra("AntispamTicket", cx5Var.f453443q);
        intent.putExtra("key_add_contact_openim_appid", cx5Var.f453440n);
        intent.putExtra("key_add_contact_openim_finder_username", cx5Var.f453444r);
        intent.putExtra("key_add_contact_match_type", cx5Var.f453441o);
        intent.putExtra("key_add_contact_custom_detail_visible", cx5Var.f453442p.f451928d);
        intent.putExtra("key_add_contact_custom_detail", cx5Var.f453442p.f451929e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BuildContactInfoIntent", "[tomys] anti, content: %s", cx5Var.f453443q);
    }
}
