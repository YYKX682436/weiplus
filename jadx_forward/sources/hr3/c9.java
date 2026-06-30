package hr3;

/* loaded from: classes5.dex */
public abstract class c9 {
    public static y35.r[] a(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, int i17) {
        java.lang.String stringExtra = ((android.app.Activity) context).getIntent().getStringExtra("Verify_ticket");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (z3Var.r2() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            return null;
        }
        y35.r[] i18 = i17 == 18 ? y35.r.i(context, r21.w.Bi().J0(z3Var.d1(), 3)) : c01.w9.y(i17) ? y35.r.h(context, r21.w.Di().J0(z3Var.d1(), 3)) : y35.r.g(context, r21.w.Ai().L0(z3Var.d1(), 3));
        if (i18 == null || i18.length == 0) {
            return null;
        }
        return i18;
    }

    public static java.lang.String b(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, int i17) {
        java.lang.String stringExtra = ((android.app.Activity) context).getIntent().getStringExtra("Verify_ticket");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (z3Var.r2() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            return null;
        }
        if (i17 == 18) {
            com.p314xaae8f345.mm.p2621x8fb0427b.t8[] J0 = r21.w.Bi().J0(z3Var.d1(), 3);
            if (J0.length < 1) {
                return "";
            }
            return J0[0].f66517x29d4cc45 + "";
        }
        if (c01.w9.y(i17)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.pa[] J02 = r21.w.Di().J0(z3Var.d1(), 3);
            if (J02.length < 1) {
                return "";
            }
            return J02[0].f66546x29d4cc45 + "";
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p7[] L0 = r21.w.Ai().L0(z3Var.d1(), 3);
        if (L0.length < 1) {
            return "";
        }
        return L0[0].f66492x29d4c865 + "";
    }
}
