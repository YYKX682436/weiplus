package lp;

/* loaded from: classes12.dex */
public class h implements q25.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f401762a = 0;

    static {
        q25.b.b(new lp.h(), "//fts");
    }

    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() > 1) {
            return false;
        }
        if (strArr.length < 2) {
            return true;
        }
        java.lang.String str2 = strArr[1];
        str2.getClass();
        char c17 = 65535;
        switch (str2.hashCode()) {
            case -1354714445:
                if (str2.equals("copydb")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1183792455:
                if (str2.equals("insert")) {
                    c17 = 1;
                    break;
                }
                break;
            case -1132164145:
                if (str2.equals("clearconfig")) {
                    c17 = 2;
                    break;
                }
                break;
            case -926188360:
                if (str2.equals("setcorrupttime")) {
                    c17 = 3;
                    break;
                }
                break;
            case -617644996:
                if (str2.equals("clearunread")) {
                    c17 = 4;
                    break;
                }
                break;
            case 3237038:
                if (str2.equals("info")) {
                    c17 = 5;
                    break;
                }
                break;
            case 104187309:
                if (str2.equals("msbiz")) {
                    c17 = 6;
                    break;
                }
                break;
            case 648505237:
                if (str2.equals("dismisskey")) {
                    c17 = 7;
                    break;
                }
                break;
            case 819712873:
                if (str2.equals("deletedb")) {
                    c17 = '\b';
                    break;
                }
                break;
            case 955180557:
                if (str2.equals("corrupt")) {
                    c17 = '\t';
                    break;
                }
                break;
            case 967115467:
                if (str2.equals("inserttest")) {
                    c17 = '\n';
                    break;
                }
                break;
            case 1873247692:
                if (str2.equals("addchatroomcontact")) {
                    c17 = 11;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(gm0.j1.u().h(), "FTS5IndexMicroMsg_encrypt.db");
                com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a("/sdcard/IndexMicroMsg.db"));
                if (r6Var2.m()) {
                    r6Var2.l();
                }
                com.p314xaae8f345.mm.vfs.w6.c(r6Var.o(), r6Var2.o());
                break;
            case 1:
                p13.u uVar = new p13.u();
                uVar.f432673b = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.SectionHeader.f55825xa5f977ac;
                uVar.f432680i = 100;
                if (strArr.length > 2) {
                    try {
                        uVar.f432680i = java.lang.Integer.valueOf(strArr[2]).intValue();
                    } catch (java.lang.Exception unused) {
                    }
                }
                if (strArr.length > 3) {
                    uVar.f432677f = strArr[3];
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(10000, uVar);
                break;
            case 2:
                com.p314xaae8f345.mm.p2621x8fb0427b.u3[] u3VarArr = {com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_ZH_CN_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_ZH_TW_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_ZH_HK_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_EN_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_AR_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_DE_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_DE_DE_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_ES_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_FR_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_HE_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_HI_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_ID_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_IN_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_IT_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_IW_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_JA_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_KO_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_LO_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_MS_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_MY_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_PL_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_PT_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_RU_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_TH_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_TR_STRING, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_VI_STRING};
                for (int i17 = 0; i17 < 26; i17++) {
                    c01.d9.b().p().x(u3VarArr[i17], "");
                }
                break;
            case 3:
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FTS_MASTER_DB_CORRUPT_REBUILD_TIME_INT_SYNC, 5);
                break;
            case 4:
                p13.u uVar2 = new p13.u();
                uVar2.f432673b = 65524;
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(10000, uVar2);
                break;
            case 5:
                com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(o13.d.f423767t, "FTS5IndexMicroMsgInfo.txt");
                if (r6Var3.m()) {
                    try {
                        b(context, com.p314xaae8f345.mm.vfs.w6.M(r6Var3.o()));
                        break;
                    } catch (java.io.IOException unused2) {
                        break;
                    }
                }
                break;
            case 6:
                r45.hq4 c18 = su4.t2.c();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.util.Iterator it = c18.f457919d.iterator();
                while (it.hasNext()) {
                    r45.gq4 gq4Var = (r45.gq4) it.next();
                    tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                    java.lang.String str3 = gq4Var.f457016d;
                    ((sg3.a) v0Var).getClass();
                    sb6.append(java.lang.String.format("%s | %.2f | %s", c01.a2.e(str3), java.lang.Double.valueOf(gq4Var.f457017e), k35.m1.d("yyyy-MM-dd HH:mm", gq4Var.f457018f / 1000)));
                    sb6.append("\n");
                }
                b(context, sb6.toString());
                break;
            case 7:
                java.lang.String str4 = "test_key_" + java.lang.System.currentTimeMillis();
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FTS_MASTER_DB_ENCRYPT_PWD_STRING_SYNC, str4);
                int myPid = android.os.Process.myPid();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(myPid));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/console/command/FTSCommand", "processCommand", "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(obj, "com/tencent/mm/console/command/FTSCommand", "processCommand", "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                break;
            case '\b':
                com.p314xaae8f345.mm.vfs.r6 r6Var4 = new com.p314xaae8f345.mm.vfs.r6(gm0.j1.u().h(), "FTS5IndexMicroMsg_encrypt.db");
                if (r6Var4.m()) {
                    r6Var4.l();
                }
                int myPid2 = android.os.Process.myPid();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(myPid2));
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/console/command/FTSCommand", "processCommand", "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                android.os.Process.killProcess(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(obj2, "com/tencent/mm/console/command/FTSCommand", "processCommand", "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                break;
            case '\t':
                try {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.C15569x5978c15) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.class)).f218921p).mo63526x28043a1a(null);
                    break;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CommandTestFTS", e17, "corrupt command", new java.lang.Object[0]);
                    break;
                }
            case '\n':
                p13.u uVar3 = new p13.u();
                uVar3.f432673b = 65525;
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(10000, uVar3);
                break;
            case 11:
                p13.u uVar4 = new p13.u();
                uVar4.f432674c = strArr[2];
                uVar4.f432673b = 65523;
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(10000, uVar4);
                break;
        }
        return true;
    }

    public final void b(android.content.Context context, java.lang.String str) {
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText(str);
        textView.setGravity(19);
        textView.setTextSize(1, 10.0f);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        textView.setTypeface(android.graphics.Typeface.MONOSPACE);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        db5.e1.q(context, null, textView, null);
    }
}
