package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes11.dex */
public class r0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f272812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272815g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f272816h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnDismissListener f272817i;

    public r0(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, android.os.Bundle bundle, android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f272812d = context;
        this.f272813e = str;
        this.f272814f = str2;
        this.f272815g = str3;
        this.f272816h = bundle;
        this.f272817i = onDismissListener;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f272817i;
        if (itemId != 1) {
            java.lang.String str = this.f272814f;
            android.content.Context context = this.f272812d;
            if (itemId == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12059, 0, 0, 0, 0, 0);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("IPCallTalkUI_phoneNumber", str);
                j45.l.j(context, "ipcall", ".ui.IPCallDialUI", intent, null);
            } else if (itemId == 3) {
                android.app.Activity activity = (android.app.Activity) context;
                android.os.Bundle bundle = this.f272816h;
                java.lang.String string = bundle.getString("Contact_User");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                java.lang.String str2 = string != null ? string : "";
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
                if (n17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MailPhoneMenuHelper", "contact is null");
                } else {
                    java.lang.String string2 = bundle.getString("Contact_Mobile_MD5");
                    java.lang.String str3 = n17.E1;
                    boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2);
                    java.lang.String str4 = this.f272815g;
                    int i18 = (K0 || string2 == str4 || n17.p2()) ? 0 : 1;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        java.lang.String[] c17 = com.p314xaae8f345.mm.p670x38b72420.a.c(n17, str3);
                        if (c17 != null) {
                            for (java.lang.String str5 : c17) {
                                arrayList.add(str5);
                            }
                        }
                        if (arrayList.contains(str4)) {
                            arrayList.remove(str4);
                        }
                    }
                    arrayList.add(str4);
                    if (arrayList.size() + i18 <= 5) {
                        r45.qo4 qo4Var = new r45.qo4();
                        qo4Var.f465681d = str2;
                        r45.c85 c85Var = new r45.c85();
                        c85Var.f452907e = new java.util.LinkedList();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            java.lang.String str6 = (java.lang.String) it.next();
                            if (aq1.e.d(str6)) {
                                r45.b85 b85Var = new r45.b85();
                                b85Var.f452164d = str6;
                                c85Var.f452907e.add(b85Var);
                                arrayList2.add(str6);
                            }
                        }
                        c85Var.f452906d = arrayList2.size();
                        qo4Var.f465682e = c85Var;
                        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(60, qo4Var));
                        if (((int) n17.E2) > 0 && n17.r2()) {
                            n17.a3(com.p314xaae8f345.mm.p670x38b72420.a.a(arrayList));
                            com.p314xaae8f345.mm.p670x38b72420.a.d(n17);
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(n17);
                        }
                        dp.a.m125854x26a183b(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jnm), 0).show();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12040, n17.d1(), 4, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(arrayList.size() + i18));
                    } else {
                        dp.a.m125854x26a183b(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574091gz2), 0).show();
                    }
                }
            } else if (itemId == 4) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(context, str, str, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10115, "1");
                dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st), 1).show();
            } else if (itemId == 5) {
                java.lang.String[] stringArray = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.u0.b() && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new android.content.Intent("android.intent.action.PICK", android.provider.ContactsContract.Contacts.CONTENT_URI), false, false)) ? context.getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559548a2) : com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.u0.b() ? new java.lang.String[]{context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4z)} : new java.lang.String[]{context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572413b55)};
                context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572412b54);
                android.view.LayoutInflater.from(context);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                new java.util.ArrayList();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.g0 g0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.g0(stringArray);
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.h0 h0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.h0(context, str, onDismissListener);
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.i0 i0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.i0(onDismissListener);
                k0Var.f293387d = i0Var;
                java.util.Iterator it6 = arrayList3.iterator();
                while (it6.hasNext()) {
                    db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it6.next());
                    h4Var.f309914y = null;
                    h4Var.f309915z = null;
                }
                arrayList3.clear();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                int i19 = 0;
                while (true) {
                    java.lang.String[] strArr = g0Var.f272744d;
                    if (i19 >= strArr.length) {
                        break;
                    }
                    java.lang.String str7 = strArr[i19];
                    db5.h4 h4Var2 = new db5.h4(context, i19, 0);
                    h4Var2.f309901i = str7;
                    arrayList4.add(h4Var2);
                    i19++;
                }
                if (arrayList4.size() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
                } else {
                    k0Var.f293405n = g0Var;
                    k0Var.f293414s = h0Var;
                    k0Var.f293387d = i0Var;
                    k0Var.G = null;
                    k0Var.v();
                }
            }
        } else {
            android.content.Context context2 = this.f272812d;
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse("tel:" + this.f272813e));
            intent2.addFlags(268435456);
            boolean I0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(context2, intent2, true, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MailPhoneMenuHelper", "isIntentAvailable:%s", java.lang.Boolean.valueOf(I0));
            if (I0) {
                try {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(intent2);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(context2, arrayList5.toArray(), "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper", "gotoPhoneCall", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((android.content.Intent) arrayList5.get(0));
                    yj0.a.f(context2, "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper", "gotoPhoneCall", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MailPhoneMenuHelper", e17, "", new java.lang.Object[0]);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10112, "1");
        }
        if (onDismissListener == null || menuItem.getItemId() == 5) {
            return;
        }
        onDismissListener.onDismiss(null);
    }
}
