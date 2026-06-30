package com.p314xaae8f345.mm.app;

/* loaded from: classes11.dex */
public class y7 implements o25.t1 {
    public void A(android.content.Context context, android.content.Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        intent.setClassName(context, "com.tencent.mm.ui.contact.SelectSpecialContactUI");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startSelectSpecialContactUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startSelectSpecialContactUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void B(android.content.Context context, android.content.Intent intent) {
        if (intent == null || context == null) {
            return;
        }
        intent.setClass(context, com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startShowImageUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startShowImageUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void C(android.content.Context context, android.content.Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        j45.l.B(context, "account", ".security.ui.SecurityAccountIntroUI", intent);
    }

    public void D(android.content.Intent intent, android.content.Context context) {
        if (context == null) {
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.l0.f145034a.f145037a.getClass();
        if (str == null) {
            return;
        }
        pm.g gVar = pm.f.f438285a;
        int g17 = gVar.g(str);
        gVar.getClass();
        gVar.d(new z2.n1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), g17);
    }

    public android.content.Intent b(android.content.Context context) {
        return new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class).addFlags(67108864);
    }

    public boolean c() {
        js.x0 b17 = r61.q0.b();
        return b17 == js.x0.SUCC_UNLOAD || b17 == js.x0.SUCC;
    }

    public void d(android.content.Intent intent, android.content.Context context) {
        m45.a aVar = com.p314xaae8f345.mm.p2494xed8d1e6f.ActivityC19773xfc12304e.f273682d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        aVar.a(context, true);
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 e(android.content.Context context) {
        try {
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context)) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a()) {
                    return null;
                }
            }
            java.lang.Boolean bool = (java.lang.Boolean) c01.d9.b().p().l(4105, java.lang.Boolean.FALSE);
            if (bool != null && bool.booleanValue()) {
                return null;
            }
            android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bpt, null);
            ((android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.hzd)).setOnCheckedChangeListener(new com.p314xaae8f345.mm.ui.jb());
            com.p314xaae8f345.mm.ui.kb kbVar = new com.p314xaae8f345.mm.ui.kb(context);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(context);
            i0Var.g(com.p314xaae8f345.mm.R.C30867xcad56011.h6i);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
            aVar.L = inflate;
            i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.f572088ye);
            aVar.E = kbVar;
            i0Var.e(com.p314xaae8f345.mm.R.C30867xcad56011.f571991vm);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 a17 = i0Var.a();
            a17.show();
            return a17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMAppMgr", e17, "showLbsTipsAlert error", new java.lang.Object[0]);
            return null;
        }
    }

    public boolean f(android.content.Context context, java.lang.String str, boolean z17, android.os.Bundle bundle) {
        return ((com.p314xaae8f345.mm.app.p622xc5476f33.j) o25.z1.a()).b(context, str, z17, null, bundle);
    }

    public void g(android.content.Intent intent, android.content.Context context, int i17) {
        if (context == null) {
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970.class);
        if (!(context instanceof android.app.Activity) || i17 <= 0) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(context, intent);
            return;
        }
        android.app.Activity activity = (android.app.Activity) context;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startBindMContactIntroUIWizard", "(Landroid/content/Intent;Landroid/content/Context;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public void h(android.content.Context context, android.content.Intent intent, int i17) {
        if (context == null || intent == null) {
            return;
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11362x5f9e5504.class);
        if (!(context instanceof android.app.Activity) || i17 <= 0) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(context, intent);
            return;
        }
        android.app.Activity activity = (android.app.Activity) context;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startBindMcontactWizard", "(Landroid/content/Context;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public void i(android.content.Intent intent, android.content.Context context) {
        if (context == null) {
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11368x3bd82e91.class);
        com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(context, intent);
    }

    public void j(android.content.Intent intent, android.content.Context context) {
        if (context == null) {
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        java.lang.String stringExtra = intent.getStringExtra("Contact_User");
        if (stringExtra != null) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.g1.c(intent, stringExtra);
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerUICallbackImpl", "startChattingUI %s %s", stringExtra, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        intent.setClass(context, com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startChattingUI", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startChattingUI", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void k(android.content.Intent intent, int i17, android.content.Context context) {
        if (context == null) {
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerUICallbackImpl with result", "startChattingUI %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        intent.setClass(context, com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
        if (!(context instanceof android.app.Activity)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startChattingUIForResult", "(Landroid/content/Intent;ILandroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startChattingUIForResult", "(Landroid/content/Intent;ILandroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        android.app.Activity activity = (android.app.Activity) context;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.k(activity, arrayList2.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startChattingUIForResult", "(Landroid/content/Intent;ILandroid/content/Context;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public void l(android.content.Intent intent, android.content.Context context) {
        if (context == null) {
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }

    public void m(android.content.Intent intent, android.content.Context context) {
        if (intent == null || context == null) {
            return;
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.ActivityC16875x275555e4.class);
        kr3.q0.P6(intent);
        if (context instanceof android.app.Activity) {
            intent.putExtra("key_label_click_source", ((android.app.Activity) context).getIntent().getIntExtra("key_label_click_source", 0));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startContactRemarkInfoModUI", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startContactRemarkInfoModUI", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void n(android.content.Intent intent, android.content.Context context) {
        if (intent == null || context == null) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtras(intent.getExtras());
        if (intent.getFlags() != 0) {
            intent2.addFlags(intent.getFlags());
        }
        j45.l.j(context, "subapp", ".ui.pluginapp.ContactSearchResultUI", intent2, null);
    }

    public void o(android.content.Intent intent, android.app.Activity activity, int i17) {
        if (intent == null || activity == null) {
            return;
        }
        intent.setClass(activity, com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22515xdd3b1ad7.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startCountryCodeUIForResult", "(Landroid/content/Intent;Landroid/app/Activity;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public void p(android.app.Activity activity, android.content.Intent intent, int i17) {
        if (intent == null || activity == null) {
            return;
        }
        int intExtra = intent.getIntExtra("CropImageMode", 0);
        if (intExtra == 4 || intExtra == 2) {
            intent.setClassName(activity, "com.tencent.mm.ui.tools.CropImageNewUI");
        } else {
            intent.setClass(activity, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f.class);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startCropImageNewUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public void q(android.app.Activity activity, android.content.Intent intent, android.content.Intent intent2, java.lang.String str, int i17, com.p314xaae8f345.mm.ui.p2740x696c9db.h1 h1Var) {
        if (intent2 == null || activity == null) {
            return;
        }
        int intExtra = intent2.getIntExtra("CropImageMode", 0);
        if (intExtra == 4 || intExtra == 2) {
            intent2.setClassName(activity, "com.tencent.mm.ui.tools.CropImageNewUI");
        } else {
            intent2.setClass(activity, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f.class);
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.i1.a(activity, intent, intent2, str, i17, h1Var);
    }

    public void r(android.content.Intent intent, int i17, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, android.content.Intent intent2) {
        if (intent == null || abstractActivityC21394xb3d2c0cf == null) {
            return;
        }
        if (intent.getIntExtra("CropImageMode", 0) == 4) {
            intent.setClassName(abstractActivityC21394xb3d2c0cf, "com.tencent.mm.ui.tools.CropImageNewUI");
        } else {
            intent.setClass(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f.class);
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.i1.a(abstractActivityC21394xb3d2c0cf, intent2, intent, g83.a.a(), i17, null);
    }

    public void s(android.content.Context context, android.content.Intent intent, android.content.Intent intent2) {
        if (context == null || intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("from_source", 1);
        if (intExtra == 1) {
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startDispathLoginUI", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startDispathLoginUI", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (intExtra == 2) {
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startDispathLoginUI", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startDispathLoginUI", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (intExtra == 3) {
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11470xc22f6d8b.class);
            if (intent2 != null) {
                com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.Y6(context, intent, intent2);
                return;
            } else {
                com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(context, intent);
                return;
            }
        }
        if (intExtra == 5) {
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11418xe15aceb2.class);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(context, arrayList3.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startDispathLoginUI", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startDispathLoginUI", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (intExtra == 6) {
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc.class);
            intent.putExtra("mobile_input_purpose", 1);
            intent.putExtra("mobile_auth_type", 7);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(intent);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(context, arrayList4.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startDispathLoginUI", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList4.get(0));
            yj0.a.f(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startDispathLoginUI", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public void t(android.content.Intent intent, android.content.Context context) {
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtras(intent.getExtras());
        if (intent.getFlags() != 0) {
            intent2.addFlags(intent.getFlags());
        }
        j45.l.j(context, "subapp", ".ui.gallery.GestureGalleryUI", intent2, null);
    }

    public void u(android.content.Intent intent, android.content.Context context) {
        if (intent == null || context == null) {
            return;
        }
        intent.setClass(context, com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class).addFlags(67108864);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startLauncherUI", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startLauncherUI", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void v(android.content.Intent intent, android.content.Context context) {
        if (intent == null || context == null) {
            return;
        }
        if (intent.getIntExtra("Retr_Msg_Type", -1) < 0) {
            intent.putExtra("Retr_Msg_Type", 4);
        }
        intent.setClass(context, com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startMsgRetransmitUI", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startMsgRetransmitUI", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void w(android.content.Intent intent, android.content.Context context) {
        if (context == null) {
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        j45.l.u(context, ".ui.tools.MultiStageCitySelectUI", intent, null);
    }

    public void x(android.content.Context context, android.content.Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11465x677338b2.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startRegByMobileVoiceVerifyUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startRegByMobileVoiceVerifyUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void y(android.content.Intent intent, android.content.Context context) {
        if (intent == null || context == null) {
            return;
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.ActivityC16875x275555e4.class);
        kr3.q0.P6(intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startRemarkUI", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startRemarkUI", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void z(android.content.Intent intent, android.content.Context context) {
        if (context == null) {
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClassName(context, "com.tencent.mm.ui.contact.SayHiEditUI");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startSayHiEditUI", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startSayHiEditUI", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
