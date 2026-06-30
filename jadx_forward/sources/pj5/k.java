package pj5;

/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final pj5.k f436919a = new pj5.k();

    public final java.lang.String a(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String d17 = g95.e0.d(f9Var);
        if (d17 == null) {
            return "";
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(d17);
        java.lang.String str = e17 != null ? e17 : "";
        java.lang.String a17 = ak5.r.f87222f.a(f9Var);
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\s+");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(a17).replaceAll(" ");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0()) && f9Var.A0() == 0) {
            if (r26.n0.L(replaceAll, d17.concat(":"), 0, false, 6, null) == 0) {
                return r26.i0.w(replaceAll, d17, str, false);
            }
            if (!r26.n0.B(replaceAll, str, false)) {
                return str + ": " + replaceAll;
            }
        }
        return replaceAll;
    }

    public final z01.c0 b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return z01.c0.f550505e;
        }
        java.lang.String Q0 = f9Var.Q0();
        ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).q(Q0);
        return (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.i4(Q0) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(Q0)) ? (com.p314xaae8f345.mm.p2621x8fb0427b.z3.i4(Q0) && com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(Q0)) ? z01.c0.f550507g : (com.p314xaae8f345.mm.p2621x8fb0427b.z3.y4(Q0) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.R3(Q0)) ? z01.c0.f550508h : z01.c0.f550505e : z01.c0.f550506f;
    }

    public final void c(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String Q0 = f9Var != null ? f9Var.Q0() : null;
        long m124847x74d37ac6 = f9Var != null ? f9Var.m124847x74d37ac6() : -1L;
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(Q0)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(Q0, true);
            if (n17 == null || !n17.r2()) {
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.p6u);
                e4Var.c();
                return;
            }
        } else if (((com.p314xaae8f345.mm.p2621x8fb0427b.b3) c01.d9.b().l()).z0(Q0) == null) {
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var2.d(com.p314xaae8f345.mm.R.C30867xcad56011.p6u);
            e4Var2.c();
            return;
        }
        android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", Q0).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("need_hight_item", true).putExtra("msg_local_id", m124847x74d37ac6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtra, "putExtra(...)");
        putExtra.setClass(context, com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/schedulemsg/ScheduleMsgHelper", "jumpScheduleMsg", "(Landroid/content/Context;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/schedulemsg/ScheduleMsgHelper", "jumpScheduleMsg", "(Landroid/content/Context;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void d(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        e(context, f9Var, i17, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, java.lang.String str, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (f9Var == null) {
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.p6z);
            e4Var.c();
            return;
        }
        p012xc85e97e9.p093xedfae76a.y yVar = context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null;
        if (yVar != null) {
            p012xc85e97e9.p093xedfae76a.q a17 = p012xc85e97e9.p093xedfae76a.z.a(yVar);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.c1 c1Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.c1(context, a(context, f9Var), f9Var.Q0());
            c1Var.f284429l = new pj5.j(context, c1Var, f9Var, a17, i17, str, lVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = c1Var.f284427j;
            if (z2Var != null) {
                z2Var.C();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Remind.MMRemindDatePickerRemake", "show");
            pm0.v.K(null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.b1(c1Var));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(795L, 0L, 1L, false);
        }
    }
}
