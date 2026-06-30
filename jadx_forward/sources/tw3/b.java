package tw3;

/* loaded from: classes9.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f504012a;

    public static void a(android.content.Context context, r45.jp6 jp6Var) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitHelper", "goMobileRemitUI()");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_rcvr_openid", jp6Var.f459554h);
        intent.putExtra("key_rcvr_token", jp6Var.f459555i);
        intent.putExtra("key_wx_name", jp6Var.f459556m);
        intent.putExtra("key_real_name", jp6Var.f459557n);
        intent.putExtra("key_phone", jp6Var.f459558o);
        intent.putExtra("key_img_url", jp6Var.f459559p);
        intent.putExtra("key_amount_remind_bit", jp6Var.f459560q);
        java.util.LinkedList linkedList = jp6Var.f459561r;
        int i17 = sw3.h.f495001w;
        if (linkedList == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.cgi.C17112xb8098213((r45.bd0) it.next()));
            }
        }
        intent.putExtra("key_delay_options", arrayList);
        intent.putExtra("key_check_name_wording", jp6Var.f459562s);
        intent.putExtra("key_check_name_mask", jp6Var.f459563t);
        intent.putExtra("key_get_rcvr_ext", jp6Var.f459564u);
        intent.putExtra("key_timestamp_ms", jp6Var.f459565v);
        j45.l.j(context, "remittance", ".mobile.ui.MobileRemittanceUI", intent, null);
    }
}
