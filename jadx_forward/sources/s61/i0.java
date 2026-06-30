package s61;

/* loaded from: classes8.dex */
public class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11377x618a2bfb f484891d;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11377x618a2bfb activityC11377x618a2bfb) {
        this.f484891d = activityC11377x618a2bfb;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/friend/ui/InviteFriendUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11377x618a2bfb activityC11377x618a2bfb = this.f484891d;
        int i17 = activityC11377x618a2bfb.f154684d;
        if (i17 != 0) {
            if (i17 == 1) {
                java.lang.String str = (java.lang.String) gm0.j1.u().c().l(42, "");
                if (str == null || str.length() == 0) {
                    str = (java.lang.String) gm0.j1.u().c().l(2, "");
                }
                java.lang.String string = activityC11377x618a2bfb.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573862g26, str);
                android.net.Uri parse = android.net.Uri.parse("smsto:" + activityC11377x618a2bfb.f154685e);
                android.content.Intent intent = new android.content.Intent("android.intent.action.SENDTO", parse);
                intent.putExtra("sms_body", string);
                android.content.pm.PackageManager packageManager = activityC11377x618a2bfb.getPackageManager();
                java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                java.util.HashMap hashMap = new java.util.HashMap();
                if (queryIntentActivities != null) {
                    for (android.content.pm.ResolveInfo resolveInfo : queryIntentActivities) {
                        if (!resolveInfo.activityInfo.packageName.equals("com.whatsapp")) {
                            hashMap.put(resolveInfo.activityInfo.name, resolveInfo);
                        }
                    }
                }
                if (hashMap.size() == 1) {
                    java.util.Iterator it = hashMap.keySet().iterator();
                    if (it.hasNext()) {
                        java.lang.String str2 = (java.lang.String) it.next();
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.setComponent(new android.content.ComponentName(((android.content.pm.ResolveInfo) hashMap.get(str2)).activityInfo.packageName, ((android.content.pm.ResolveInfo) hashMap.get(str2)).activityInfo.name));
                        intent2.setAction("android.intent.action.SENDTO");
                        intent2.setData(parse);
                        intent2.putExtra("sms_body", string);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11377x618a2bfb activityC11377x618a2bfb2 = this.f484891d;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent2);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(activityC11377x618a2bfb2, arrayList2.toArray(), "com/tencent/mm/plugin/account/friend/ui/InviteFriendUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activityC11377x618a2bfb2.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(activityC11377x618a2bfb2, "com/tencent/mm/plugin/account/friend/ui/InviteFriendUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11377x618a2bfb.T6(activityC11377x618a2bfb);
                    }
                } else if (hashMap.size() > 1) {
                    android.view.LayoutInflater.from(activityC11377x618a2bfb);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC11377x618a2bfb, 1, false);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    new java.util.ArrayList();
                    s61.d0 d0Var = new s61.d0(this, hashMap, packageManager);
                    s61.e0 e0Var = new s61.e0(this, hashMap);
                    s61.f0 f0Var = new s61.f0(this, hashMap, parse, string);
                    java.util.Iterator it6 = arrayList3.iterator();
                    while (it6.hasNext()) {
                        db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it6.next());
                        h4Var.f309914y = null;
                        h4Var.f309915z = null;
                    }
                    arrayList3.clear();
                    db5.g4 g4Var = new db5.g4(activityC11377x618a2bfb);
                    e0Var.mo887xc459429a(g4Var);
                    if (g4Var.z()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
                    } else {
                        k0Var.f293405n = e0Var;
                        k0Var.f293414s = f0Var;
                        k0Var.f293387d = null;
                        k0Var.G = d0Var;
                        k0Var.v();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11377x618a2bfb.T6(activityC11377x618a2bfb);
                } else {
                    dp.a.m125853x26a183b(activityC11377x618a2bfb, com.p314xaae8f345.mm.R.C30867xcad56011.igz, 1).show();
                }
            } else if (i17 == 2) {
                s61.f1 f1Var = new s61.f1(activityC11377x618a2bfb, new s61.h0(this));
                java.lang.String str3 = activityC11377x618a2bfb.f154687g;
                java.lang.String str4 = activityC11377x618a2bfb.f154685e;
                gm0.j1.d().a(489, f1Var);
                ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
                android.database.Cursor D0 = m61.k.Di().D0(str3);
                if (D0 == null || D0.getCount() <= 1) {
                    f1Var.a(str4);
                } else {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    D0.moveToFirst();
                    int count = D0.getCount();
                    for (int i18 = 0; i18 < count; i18++) {
                        r61.s0 s0Var = new r61.s0();
                        s0Var.mo9015xbf5d97fd(D0);
                        arrayList4.add(s0Var.f65887x58397040);
                        arrayList5.add(java.lang.Integer.valueOf(i18));
                        arrayList6.add(s0Var);
                        D0.moveToNext();
                    }
                    arrayList5.add(-1);
                    android.content.Context context = f1Var.f484881d;
                    db5.e1.c(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fqx), arrayList4, arrayList5, null, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), true, new s61.b1(f1Var, arrayList6), null);
                }
                if (D0 != null) {
                    D0.close();
                }
            }
        } else {
            int[] iArr = {kk.v.b(activityC11377x618a2bfb.f154685e)};
            s61.a1 a1Var = new s61.a1(activityC11377x618a2bfb, new s61.g0(this));
            gm0.j1.d().a(116, a1Var);
            r61.p1 p1Var = new r61.p1(iArr);
            gm0.j1.d().g(p1Var);
            if (a1Var.f484854g) {
                a1Var.f484853f = db5.e1.Q(activityC11377x618a2bfb, activityC11377x618a2bfb.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g2a), activityC11377x618a2bfb.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g29), true, true, new s61.x0(a1Var, p1Var));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/friend/ui/InviteFriendUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
