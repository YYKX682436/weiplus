package com.tencent.mm.app;

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
        intent.setClass(context, com.tencent.mm.ui.tools.ShowImageUI.class);
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
        com.tencent.mm.booter.notification.l0.f63501a.f63504a.getClass();
        if (str == null) {
            return;
        }
        pm.g gVar = pm.f.f356752a;
        int g17 = gVar.g(str);
        gVar.getClass();
        gVar.d(new z2.n1(com.tencent.mm.sdk.platformtools.x2.f193071a), g17);
    }

    public android.content.Intent b(android.content.Context context) {
        return new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.LauncherUI.class).addFlags(67108864);
    }

    public boolean c() {
        js.x0 b17 = r61.q0.b();
        return b17 == js.x0.SUCC_UNLOAD || b17 == js.x0.SUCC;
    }

    public void d(android.content.Intent intent, android.content.Context context) {
        m45.a aVar = com.tencent.mm.process.KillProcessHelperActivity.f192149d;
        kotlin.jvm.internal.o.g(context, "context");
        aVar.a(context, true);
    }

    public com.tencent.mm.ui.widget.dialog.j0 e(android.content.Context context) {
        try {
            if (com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
                if (com.tencent.mm.sdk.platformtools.n2.a()) {
                    return null;
                }
            }
            java.lang.Boolean bool = (java.lang.Boolean) c01.d9.b().p().l(4105, java.lang.Boolean.FALSE);
            if (bool != null && bool.booleanValue()) {
                return null;
            }
            android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.bpt, null);
            ((android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.hzd)).setOnCheckedChangeListener(new com.tencent.mm.ui.jb());
            com.tencent.mm.ui.kb kbVar = new com.tencent.mm.ui.kb(context);
            com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(context);
            i0Var.g(com.tencent.mm.R.string.h6i);
            com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
            aVar.L = inflate;
            i0Var.f(com.tencent.mm.R.string.f490555ye);
            aVar.E = kbVar;
            i0Var.e(com.tencent.mm.R.string.f490458vm);
            com.tencent.mm.ui.widget.dialog.j0 a17 = i0Var.a();
            a17.show();
            return a17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMAppMgr", e17, "showLbsTipsAlert error", new java.lang.Object[0]);
            return null;
        }
    }

    public boolean f(android.content.Context context, java.lang.String str, boolean z17, android.os.Bundle bundle) {
        return ((com.tencent.mm.app.plugin.j) o25.z1.a()).b(context, str, z17, null, bundle);
    }

    public void g(android.content.Intent intent, android.content.Context context, int i17) {
        if (context == null) {
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClass(context, com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.class);
        if (!(context instanceof android.app.Activity) || i17 <= 0) {
            com.tencent.mm.ui.MMWizardActivity.X6(context, intent);
            return;
        }
        android.app.Activity activity = (android.app.Activity) context;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startBindMContactIntroUIWizard", "(Landroid/content/Intent;Landroid/content/Context;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public void h(android.content.Context context, android.content.Intent intent, int i17) {
        if (context == null || intent == null) {
            return;
        }
        intent.setClass(context, com.tencent.mm.plugin.account.bind.ui.BindMContactUI.class);
        if (!(context instanceof android.app.Activity) || i17 <= 0) {
            com.tencent.mm.ui.MMWizardActivity.X6(context, intent);
            return;
        }
        android.app.Activity activity = (android.app.Activity) context;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
        intent.setClass(context, com.tencent.mm.plugin.account.bind.ui.BindQQUI.class);
        com.tencent.mm.ui.MMWizardActivity.X6(context, intent);
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
            com.tencent.mm.ui.contact.g1.c(intent, stringExtra);
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WorkerUICallbackImpl", "startChattingUI %s %s", stringExtra, com.tencent.mm.sdk.platformtools.z3.b(true));
        intent.setClass(context, com.tencent.mm.ui.chatting.ChattingUI.class);
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
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WorkerUICallbackImpl with result", "startChattingUI %s", com.tencent.mm.sdk.platformtools.z3.b(true));
        intent.setClass(context, com.tencent.mm.ui.chatting.ChattingUI.class);
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
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
        j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }

    public void m(android.content.Intent intent, android.content.Context context) {
        if (intent == null || context == null) {
            return;
        }
        intent.setClass(context, com.tencent.mm.plugin.profile.ui.mod.ContactAssembleModRemarkUI.class);
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
        intent.setClass(activity, com.tencent.mm.ui.tools.NewCountryCodeUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
            intent.setClass(activity, com.tencent.mm.plugin.gallery.picker.view.ImageCropUI.class);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startCropImageNewUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public void q(android.app.Activity activity, android.content.Intent intent, android.content.Intent intent2, java.lang.String str, int i17, com.tencent.mm.ui.tools.h1 h1Var) {
        if (intent2 == null || activity == null) {
            return;
        }
        int intExtra = intent2.getIntExtra("CropImageMode", 0);
        if (intExtra == 4 || intExtra == 2) {
            intent2.setClassName(activity, "com.tencent.mm.ui.tools.CropImageNewUI");
        } else {
            intent2.setClass(activity, com.tencent.mm.plugin.gallery.picker.view.ImageCropUI.class);
        }
        com.tencent.mm.ui.tools.i1.a(activity, intent, intent2, str, i17, h1Var);
    }

    public void r(android.content.Intent intent, int i17, com.tencent.mm.ui.MMActivity mMActivity, android.content.Intent intent2) {
        if (intent == null || mMActivity == null) {
            return;
        }
        if (intent.getIntExtra("CropImageMode", 0) == 4) {
            intent.setClassName(mMActivity, "com.tencent.mm.ui.tools.CropImageNewUI");
        } else {
            intent.setClass(mMActivity, com.tencent.mm.plugin.gallery.picker.view.ImageCropUI.class);
        }
        com.tencent.mm.ui.tools.i1.a(mMActivity, intent2, intent, g83.a.a(), i17, null);
    }

    public void s(android.content.Context context, android.content.Intent intent, android.content.Intent intent2) {
        if (context == null || intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("from_source", 1);
        if (intExtra == 1) {
            intent.setClass(context, com.tencent.mm.plugin.account.ui.LoginUI.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startDispathLoginUI", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startDispathLoginUI", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (intExtra == 2) {
            intent.setClass(context, com.tencent.mm.plugin.account.ui.LoginPasswordUI.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startDispathLoginUI", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startDispathLoginUI", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (intExtra == 3) {
            intent.setClass(context, com.tencent.mm.plugin.account.ui.SimpleLoginUI.class);
            if (intent2 != null) {
                com.tencent.mm.ui.MMWizardActivity.Y6(context, intent, intent2);
                return;
            } else {
                com.tencent.mm.ui.MMWizardActivity.X6(context, intent);
                return;
            }
        }
        if (intExtra == 5) {
            intent.setClass(context, com.tencent.mm.plugin.account.ui.LoginIndepPass.class);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(context, arrayList3.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startDispathLoginUI", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startDispathLoginUI", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (intExtra == 6) {
            intent.setClass(context, com.tencent.mm.plugin.account.ui.MobileInputUI.class);
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
        intent.setClass(context, com.tencent.mm.ui.LauncherUI.class).addFlags(67108864);
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
        intent.setClass(context, com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
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
        intent.setClass(context, com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifyUI.class);
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
        intent.setClass(context, com.tencent.mm.plugin.profile.ui.mod.ContactAssembleModRemarkUI.class);
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
