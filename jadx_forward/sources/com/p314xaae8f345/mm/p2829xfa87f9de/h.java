package com.p314xaae8f345.mm.p2829xfa87f9de;

/* loaded from: classes11.dex */
public class h implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f296366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296368f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296369g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296370h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f296371i;

    public h(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.app.Activity activity) {
        this.f296366d = j17;
        this.f296367e = str;
        this.f296368f = str2;
        this.f296369g = str3;
        this.f296370h = str4;
        this.f296371i = activity;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        java.util.Collection collection;
        if (i17 != 1 || i18 != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesReaderLogic", "sendFileToFriend, mmOnActivityResult fail, resultCode not ok");
            return;
        }
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesReaderLogic", "sendFileToFriend, mmOnActivityResult fail, retData is null");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
        if (stringExtra == null || stringExtra.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesReaderLogic", "sendFileToFriend, mmOnActivityResult fail, toUser is null");
            return;
        }
        boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
        java.lang.String str = this.f296367e;
        long j17 = this.f296366d;
        java.lang.String str2 = this.f296368f;
        if (n17) {
            java.util.List g17 = new r26.t(",").g(stringExtra, 0);
            if (!g17.isEmpty()) {
                java.util.ListIterator listIterator = g17.listIterator(g17.size());
                while (listIterator.hasPrevious()) {
                    if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                        collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = kz5.p0.f395529d;
            java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1((java.lang.String[]) collection.toArray(new java.lang.String[0]));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(P1);
            java.util.Iterator it = P1.iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                ut.s0 s0Var = new ut.s0(str3, str2 == null ? "" : str2);
                if (pt0.f0.f439742b1.a(str != null ? str : "", j17)) {
                    c01.h7 h7Var = new c01.h7();
                    h7Var.f118760b = j17;
                    h7Var.f118762d = str;
                    s0Var.f512256g = h7Var;
                    s0Var.f512254e = "forward_qb_file_msg";
                } else {
                    s0Var.f512254e = "forward_qb_file_path";
                }
                p3325xe03a0797.p3326xc267989b.p3328x30012e.j tj6 = ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).tj(((ot.i) ((pt.h0) i95.n0.c(pt.h0.class))).Zi(s0Var));
                com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
                if (c20976x6ba6452a != null) {
                    v65.i.b(c20976x6ba6452a, null, new com.p314xaae8f345.mm.p2829xfa87f9de.b(tj6, null), 1, null);
                }
                if (!(stringExtra2 == null || r26.n0.N(stringExtra2))) {
                    ((dk5.s5) tg3.t1.a()).fj(str3, stringExtra2, c01.e2.C(str3), 0);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesReaderLogic", "sendFileToFriend, send broadcast, filePath: " + str2);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setAction("MINIQB_OPEN_RET");
            intent2.putExtra("op_type", "SEND_TO_FRIENDS");
            intent2.putExtra("file_path", str2);
            intent2.putExtra("file_name", this.f296369g);
            intent2.putExtra("file_ext", this.f296370h);
            intent2.putExtra("forward_msgid", j17);
            intent2.putExtra("forward_msg_talker", str);
            intent2.putExtra("to_user", stringExtra);
            intent2.putExtra("send_text", stringExtra2);
            intent2.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
            this.f296371i.sendBroadcast(intent2, com.p314xaae8f345.mm.sdk.p2603x2137b148.v9.a());
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p2829xfa87f9de.g(this));
    }
}
