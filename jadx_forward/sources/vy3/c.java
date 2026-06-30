package vy3;

/* loaded from: classes.dex */
public final class c extends wy3.c {

    /* renamed from: e, reason: collision with root package name */
    public static final vy3.c f522999e = new vy3.c();

    public static final void e(vy3.c cVar, android.content.Context context, java.lang.String str) {
        cVar.getClass();
        android.content.Intent intent = new android.content.Intent("android.intent.action.INSERT_OR_EDIT", android.provider.ContactsContract.Contacts.CONTENT_URI);
        intent.setType("vnd.android.cursor.item/person");
        intent.putExtra("phone", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(context, intent, false, false)) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/scanner/box/jsapi/JsApiAddToAddressBook", "phoneModifyContact", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/scanner/box/jsapi/JsApiAddToAddressBook", "phoneModifyContact", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiOpenDialPad", e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String[] strArr;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f422323a.get("phoneNum");
        if (str == null) {
            str = "";
        }
        java.lang.String obj = r26.n0.u0(str).toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenDialPad", "ScanJsApi-Call doAddToAddressBook phoneNum: " + obj);
        boolean z17 = obj == null || r26.n0.N(obj);
        nw4.g gVar = env.f422396d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenDialPad", "ScanJsApi-Call doAddToAddressBook param is empty");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("ret", "1");
            gVar.e(msg.f422546c, msg.f422552i + ":param invalid", hashMap);
        } else {
            if (f() && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new android.content.Intent("android.intent.action.PICK", android.provider.ContactsContract.Contacts.CONTENT_URI), false, false)) {
                strArr = env.f422393a.getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559548a2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(strArr);
            } else {
                strArr = f() ? new java.lang.String[]{env.f422393a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574459ia2)} : new java.lang.String[]{env.f422393a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574460ia3)};
            }
            android.content.Context context = env.f422393a;
            android.view.LayoutInflater.from(context);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            new java.util.ArrayList();
            vy3.a aVar = new vy3.a(strArr);
            vy3.b bVar = new vy3.b(env, obj);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it.next());
                h4Var.f309914y = null;
                h4Var.f309915z = null;
            }
            arrayList.clear();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.String[] strArr2 = aVar.f522996d;
            int length = strArr2.length;
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.String str2 = strArr2[i17];
                db5.h4 h4Var2 = new db5.h4(context, i17, 0);
                h4Var2.f309901i = str2;
                arrayList2.add(h4Var2);
            }
            if (arrayList2.size() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            } else {
                k0Var.f293405n = aVar;
                k0Var.f293414s = bVar;
                k0Var.f293387d = null;
                k0Var.G = null;
                k0Var.v();
            }
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("ret", "0");
            gVar.e(msg.f422546c, msg.f422552i + ":ok", hashMap2);
        }
        return true;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "addToAddressBook";
    }

    public final boolean f() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.content.Intent intent = new android.content.Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.dir/contact");
        intent.putExtra("phone", "10086");
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(context, intent, false, false);
    }
}
