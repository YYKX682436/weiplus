package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes9.dex */
public abstract class qa {
    public static java.lang.String a(android.content.Context context, int i17) {
        return "[" + context.getResources().getString(i17) + "]";
    }

    public static java.lang.String b(android.content.Context context, r45.gp0 gp0Var) {
        int i17 = gp0Var.I;
        if (i17 == 10130) {
            i17 = 8;
        }
        if (i17 != 3) {
            if (i17 == 10) {
                return a(context, com.tencent.mm.R.string.cbg) + " " + gp0Var.J1.f376356g.f370188d;
            }
            if (i17 == 16) {
                return a(context, com.tencent.mm.R.string.cay);
            }
            if (i17 != 20) {
                if (i17 != 22) {
                    if (i17 != 29) {
                        if (i17 == 5) {
                            return a(context, com.tencent.mm.R.string.cdf) + " " + gp0Var.f375404d;
                        }
                        if (i17 == 6) {
                            r45.pp0 pp0Var = gp0Var.J1.f376354e;
                            if (pp0Var == null) {
                                return a(context, com.tencent.mm.R.string.cd_);
                            }
                            if (c(pp0Var.f383274o)) {
                                return a(context, com.tencent.mm.R.string.cd_) + " " + pp0Var.f383274o;
                            }
                            return a(context, com.tencent.mm.R.string.cd_) + " " + pp0Var.f383272m;
                        }
                        if (i17 != 7) {
                            if (i17 == 8) {
                                return a(context, com.tencent.mm.R.string.f491211cd1) + " " + gp0Var.f375404d;
                            }
                            if (i17 != 32) {
                                if (i17 == 33) {
                                    android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                                    r45.hp0 hp0Var = gp0Var.J1;
                                    return il4.d.p(context2, hp0Var != null ? hp0Var.G : null) + " " + gp0Var.f375404d;
                                }
                            }
                        }
                    }
                    r45.hp0 hp0Var2 = gp0Var.J1;
                    r45.xs4 xs4Var = hp0Var2 != null ? hp0Var2.C : null;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(il4.l.e(context, xs4Var != null ? xs4Var.getInteger(18) : 0));
                    sb6.append(" ");
                    sb6.append(gp0Var.f375404d);
                    return sb6.toString();
                }
                if (!o72.x1.j0()) {
                    return a(context, com.tencent.mm.R.string.cdf) + " " + gp0Var.f375404d;
                }
                return "";
            }
        }
        return a(context, com.tencent.mm.R.string.cdh) + " " + d(context, (int) o72.x1.Y(gp0Var.f375448y));
    }

    public static boolean c(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        return !str.equals(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f492398gh1));
    }

    public static java.lang.String d(android.content.Context context, int i17) {
        if (i17 <= 0) {
            return context.getString(com.tencent.mm.R.string.f491219ce0, 0);
        }
        int i18 = i17 / 60;
        int i19 = i17 % 60;
        return i18 == 0 ? context.getString(com.tencent.mm.R.string.f491219ce0, java.lang.Integer.valueOf(i19)) : context.getString(com.tencent.mm.R.string.cdz, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }
}
