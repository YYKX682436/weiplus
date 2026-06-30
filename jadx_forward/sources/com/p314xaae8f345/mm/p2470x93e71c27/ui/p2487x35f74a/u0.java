package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes.dex */
public abstract class u0 {
    public static void a(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.INSERT_OR_EDIT", android.provider.ContactsContract.Contacts.CONTENT_URI);
        intent.setType("vnd.android.cursor.item/person");
        intent.putExtra("phone", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(context, intent, false, false)) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper", "phoneModifyContact", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper", "phoneModifyContact", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MailPhoneMenuHelper", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public static boolean b() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.content.Intent intent = new android.content.Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.dir/contact");
        intent.putExtra("phone", "10086");
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(context, intent, false, false);
    }

    public static void c(android.content.Context context, java.lang.String str, android.content.DialogInterface.OnDismissListener onDismissListener) {
        boolean z17 = (c01.z1.n() & 1) == 0;
        java.lang.String replace = str.replace(" ", "").replace("#", "@");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
        k0Var.q(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574503ii0, replace), 17);
        k0Var.f293405n = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l0(z17, context);
        k0Var.f293414s = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.m0(context, replace);
        k0Var.f293425z = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.n0();
        k0Var.v();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(k0Var.f293397i.getWindow().getDecorView(), "email_actionsheet");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(k0Var.f293397i.getWindow().getDecorView(), 32, 28603);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).rj(k0Var.f293397i.getWindow().getDecorView());
    }

    public static void d(android.content.Context context, java.lang.String str, android.content.DialogInterface.OnDismissListener onDismissListener, android.os.Bundle bundle) {
        if (!(context instanceof android.app.Activity)) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MailPhoneMenuHelper", "context should be Activity, %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        }
        boolean booleanValue = gm0.j1.b().m() ? ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_HAS_ENTRY_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue() : false;
        int i17 = bundle != null ? bundle.getInt("fromScene") : 0;
        java.lang.String replace = str.replace(" ", "").replace("(", "").replace(")", "").replace("-", "");
        java.lang.String replaceAll = replace.replaceAll("#", "%23");
        java.lang.String string = bundle == null ? "" : bundle.getString("Contact_User");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str2 = string != null ? string : "";
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
        k0Var.q(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572412b54, replace), 17);
        k0Var.f293405n = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.q0(context, booleanValue, str2, n17);
        k0Var.f293414s = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.r0(context, replaceAll, replace, str, i17, bundle, onDismissListener);
        k0Var.f293387d = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.s0(onDismissListener);
        k0Var.C = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.t0(onDismissListener);
        k0Var.v();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(k0Var.f293397i.getWindow().getDecorView(), "phone_actionsheet");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(k0Var.f293397i.getWindow().getDecorView(), 32, 28603);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).rj(k0Var.f293397i.getWindow().getDecorView());
    }
}
