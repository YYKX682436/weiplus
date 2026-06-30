package c01;

/* loaded from: classes11.dex */
public class v7 {
    public static void a(com.tencent.mm.storage.z3 z3Var) {
        if (z3Var == null) {
            z3Var = new com.tencent.mm.storage.z3();
        }
        if (((int) z3Var.E2) == 0 || !z3Var.r2()) {
            z3Var.X1("filehelper");
            z3Var.N2();
            com.tencent.mars.xlog.Log.i("MicroMsg.HardCodeHelper", "filehelper setContact!");
            z3Var.V2(3);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(z3Var);
        }
    }

    public static void c(com.tencent.mm.storage.z3 z3Var) {
        java.lang.String d17 = z3Var.d1();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (d17.equals("qqsync")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.fve));
            z3Var.R1(context.getString(com.tencent.mm.R.string.fvf));
            z3Var.S1(context.getString(com.tencent.mm.R.string.fvg));
        }
        if (d17.equals("floatbottle")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.ftv));
            z3Var.R1(context.getString(com.tencent.mm.R.string.ftw));
            z3Var.S1(context.getString(com.tencent.mm.R.string.ftx));
        }
        if (d17.equals("shakeapp")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.fvl));
            z3Var.R1(context.getString(com.tencent.mm.R.string.fvm));
            z3Var.S1(context.getString(com.tencent.mm.R.string.fvn));
        }
        if (d17.equals("lbsapp")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.fui));
            z3Var.R1(context.getString(com.tencent.mm.R.string.fuj));
            z3Var.S1(context.getString(com.tencent.mm.R.string.fuk));
        }
        if (d17.equals("medianote")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.fur));
            z3Var.R1(context.getString(com.tencent.mm.R.string.fus));
            z3Var.S1(context.getString(com.tencent.mm.R.string.fut));
        }
        if (d17.equals("newsapp")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.fvh));
            z3Var.R1(context.getString(com.tencent.mm.R.string.fvi));
            z3Var.S1(context.getString(com.tencent.mm.R.string.fvj));
        }
        if (d17.equals("facebookapp")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.fu7));
            z3Var.R1(context.getString(com.tencent.mm.R.string.fu8));
            z3Var.S1(context.getString(com.tencent.mm.R.string.fu9));
        }
        if (d17.equals("qqfriend")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.fv9));
            z3Var.R1(context.getString(com.tencent.mm.R.string.fv_));
            z3Var.S1(context.getString(com.tencent.mm.R.string.fva));
        }
        if (d17.equals("masssendapp")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.fuo));
            z3Var.R1(context.getString(com.tencent.mm.R.string.fup));
            z3Var.S1(context.getString(com.tencent.mm.R.string.fuq));
        }
        if (d17.equals("feedsapp")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.fu_));
            z3Var.R1(context.getString(com.tencent.mm.R.string.fua));
            z3Var.S1(context.getString(com.tencent.mm.R.string.fub));
        }
        if (d17.equals("fmessage")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.fuc));
            z3Var.R1(context.getString(com.tencent.mm.R.string.fud));
            z3Var.S1(context.getString(com.tencent.mm.R.string.fue));
        }
        if (d17.equals("voipapp")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.fvr));
            z3Var.R1(context.getString(com.tencent.mm.R.string.fvs));
            z3Var.S1(context.getString(com.tencent.mm.R.string.fvt));
        }
        if (d17.equals("officialaccounts")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.fuz));
            z3Var.R1(context.getString(com.tencent.mm.R.string.f492263fv0));
            z3Var.S1(context.getString(com.tencent.mm.R.string.f492264fv1));
        }
        if (d17.equals("service_officialaccounts")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.msy));
            z3Var.R1(context.getString(com.tencent.mm.R.string.msz));
            z3Var.S1(context.getString(com.tencent.mm.R.string.f492269mt0));
        }
        if (d17.equals("findersayhisessionholder")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.f492265fv2));
            z3Var.R1(context.getString(com.tencent.mm.R.string.f492266fv3));
            z3Var.S1(context.getString(com.tencent.mm.R.string.f492267fv4));
        }
        if (d17.equals("helper_entry")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.fuf));
            z3Var.R1(context.getString(com.tencent.mm.R.string.fug));
            z3Var.S1(context.getString(com.tencent.mm.R.string.fuh));
        }
        if (d17.equals("cardpackage")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.fty));
            z3Var.R1(context.getString(com.tencent.mm.R.string.ftz));
            z3Var.S1(context.getString(com.tencent.mm.R.string.f492257fu0));
        }
        if (d17.equals("voicevoipapp")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.fvu));
            z3Var.R1(context.getString(com.tencent.mm.R.string.fvv));
            z3Var.S1(context.getString(com.tencent.mm.R.string.fvw));
        }
        if (d17.equals("voiceinputapp")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.fvo));
            z3Var.R1(context.getString(com.tencent.mm.R.string.fvp));
            z3Var.S1(context.getString(com.tencent.mm.R.string.fvq));
        }
        if (d17.equals("qqmail")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.fvb));
            z3Var.R1(context.getString(com.tencent.mm.R.string.fvc));
            z3Var.S1(context.getString(com.tencent.mm.R.string.fvd));
        }
        if (d17.equals("gh_051d9102de63")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.o59));
            z3Var.R1(context.getString(com.tencent.mm.R.string.o5_));
            z3Var.S1(context.getString(com.tencent.mm.R.string.o5a));
        }
        if (d17.equals("schedule_message")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.p0l));
            z3Var.R1(context.getString(com.tencent.mm.R.string.p0m));
            z3Var.S1(context.getString(com.tencent.mm.R.string.p0n));
        }
        if (d17.equals("linkedinplugin")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.ful));
            z3Var.R1(context.getString(com.tencent.mm.R.string.fum));
            z3Var.S1(context.getString(com.tencent.mm.R.string.fun));
        }
        if (d17.equals("notifymessage")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.fuw));
            z3Var.R1(context.getString(com.tencent.mm.R.string.fux));
            z3Var.S1(context.getString(com.tencent.mm.R.string.fuy));
        }
        if (d17.equals("appbrandcustomerservicemsg")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.ftp));
            z3Var.R1(context.getString(com.tencent.mm.R.string.ftq));
            z3Var.S1(context.getString(com.tencent.mm.R.string.ftr));
        }
        if (d17.equals("conversationboxservice")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.f492258fu1));
            z3Var.R1(context.getString(com.tencent.mm.R.string.f492259fu2));
            z3Var.S1(context.getString(com.tencent.mm.R.string.f492260fu3));
        }
        if (d17.equals("downloaderapp")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.f492261fu4));
            z3Var.R1(context.getString(com.tencent.mm.R.string.f492262fu5));
            z3Var.S1(context.getString(com.tencent.mm.R.string.fu6));
        }
        if (d17.equals("appbrand_notify_message")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.fts));
            z3Var.R1(context.getString(com.tencent.mm.R.string.ftt));
            z3Var.S1(context.getString(com.tencent.mm.R.string.ftu));
        }
        if (d17.equals("opencustomerservicemsg")) {
            z3Var.M1(context.getString(com.tencent.mm.R.string.f492268fv5));
            z3Var.R1(context.getString(com.tencent.mm.R.string.fv6));
            z3Var.S1(context.getString(com.tencent.mm.R.string.fv7));
        }
    }

    public final int b(boolean z17, java.lang.String str, boolean z18) {
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null) {
            n17 = new com.tencent.mm.storage.z3();
        }
        if (((int) n17.E2) != 0) {
            if (!z17) {
                return 3;
            }
            n17.U2();
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(str, n17);
            return 2;
        }
        n17.X1(str);
        n17.N2();
        c(n17);
        n17.V2(z18 ? 4 : 3);
        n17.U2();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h0(n17);
        return 1;
    }
}
