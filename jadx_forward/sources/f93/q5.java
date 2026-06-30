package f93;

/* loaded from: classes.dex */
public final class q5 {

    /* renamed from: a, reason: collision with root package name */
    public static final f93.q5 f341974a = new f93.q5();

    public final boolean a(android.content.Context context, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g96);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            c(context, string);
            return false;
        }
        if (com.p314xaae8f345.mm.ui.p2740x696c9db.v4.d(36, str) > 0) {
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571363cy);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            java.lang.String format = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2740x696c9db.v4.b(18, ""))}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            c(context, format);
            return false;
        }
        if (!(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? false : !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b93.r.wi().p1(str)))) {
            return true;
        }
        java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571359cu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        c(context, string3);
        return false;
    }

    public final boolean b() {
        return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20299xbba5c9b4()) == 1;
    }

    public final void c(android.content.Context context, java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.f293309c = text;
        e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
        e4Var.c();
    }

    public final void d(android.app.Activity activity, java.lang.String labelID, java.lang.String labelName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelID, "labelID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelName, "labelName");
        if (b()) {
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class);
            java.util.ArrayList P1 = b93.r.wi().P1(labelID);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LabelHelper", "startLabelEditUIV2() called with: activity = " + activity + ", labelID = " + labelID + ", mLabelName = " + labelName + " size:" + (P1 != null ? P1.size() : 0));
            intent.putExtra("key_label_click_source", 2);
            intent.putExtra("list_type", 0);
            com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
            intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288317e, 256, 512));
            intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 7);
            intent.putExtra("menu_mode", 2);
            intent.putExtra("block_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J1(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.c(), ","));
            intent.putExtra("always_select_contact", c01.z1.r());
            intent.putExtra("need_show_multiSelect_bottom", true);
            intent.putExtra("label_id", labelID);
            intent.putExtra("label_name", labelName);
            intent.putExtra("key_confirm_menu_name", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mbg));
            intent.putExtra("key_confirm_menu_color", 1);
            intent.putExtra("need_show_expand_btn", true);
            intent.putExtra("INTENT_KEY_KEEP_ACTIVITY_WHEN_BACK_PRESSED", true);
            pf5.j0.a(intent, bj5.d1.class);
            pf5.j0.a(intent, j93.x0.class);
            pf5.j0.a(intent, j93.e2.class);
            pf5.j0.a(intent, cj5.d1.class);
            pf5.j0.a(intent, j93.w1.class);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(P1)) {
                intent.putExtra("INTENT_KEY_SEARCH_LABEL_USERNAME_LIST", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(P1, ","));
            }
            pf5.j0.a(intent, bj5.k0.class);
            pf5.j0.a(intent, cj5.k4.class);
            pf5.j0.a(intent, cj5.s.class);
            pf5.j0.a(intent, cj5.h3.class);
            pf5.j0.a(intent, cj5.n3.class);
            pf5.j0.a(intent, cj5.w2.class);
            pf5.j0.a(intent, cj5.l2.class);
            pf5.j0.a(intent, cj5.c5.class);
            pf5.j0.a(intent, j93.p2.class);
            pf5.j0.a(intent, j93.g0.class);
            pf5.j0.a(intent, cj5.n.class);
            pf5.j0.a(intent, cj5.k.class);
            pf5.j0.a(intent, cj5.a0.class);
            pf5.j0.a(intent, j93.v2.class);
            pf5.j0.a(intent, cj5.n1.class);
            pf5.j0.a(intent, cj5.o.class);
            pf5.j0.a(intent, bj5.c0.class);
            pf5.j0.a(intent, j93.a2.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(9001);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/LabelHelper", "startLabelEditUIV2", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
    }
}
