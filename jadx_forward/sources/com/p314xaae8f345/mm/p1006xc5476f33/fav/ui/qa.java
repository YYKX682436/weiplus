package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

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
                return a(context, com.p314xaae8f345.mm.R.C30867xcad56011.cbg) + " " + gp0Var.J1.f457889g.f451721d;
            }
            if (i17 == 16) {
                return a(context, com.p314xaae8f345.mm.R.C30867xcad56011.cay);
            }
            if (i17 != 20) {
                if (i17 != 22) {
                    if (i17 != 29) {
                        if (i17 == 5) {
                            return a(context, com.p314xaae8f345.mm.R.C30867xcad56011.cdf) + " " + gp0Var.f456937d;
                        }
                        if (i17 == 6) {
                            r45.pp0 pp0Var = gp0Var.J1.f457887e;
                            if (pp0Var == null) {
                                return a(context, com.p314xaae8f345.mm.R.C30867xcad56011.cd_);
                            }
                            if (c(pp0Var.f464807o)) {
                                return a(context, com.p314xaae8f345.mm.R.C30867xcad56011.cd_) + " " + pp0Var.f464807o;
                            }
                            return a(context, com.p314xaae8f345.mm.R.C30867xcad56011.cd_) + " " + pp0Var.f464805m;
                        }
                        if (i17 != 7) {
                            if (i17 == 8) {
                                return a(context, com.p314xaae8f345.mm.R.C30867xcad56011.f572744cd1) + " " + gp0Var.f456937d;
                            }
                            if (i17 != 32) {
                                if (i17 == 33) {
                                    android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                                    r45.hp0 hp0Var = gp0Var.J1;
                                    return il4.d.p(context2, hp0Var != null ? hp0Var.G : null) + " " + gp0Var.f456937d;
                                }
                            }
                        }
                    }
                    r45.hp0 hp0Var2 = gp0Var.J1;
                    r45.xs4 xs4Var = hp0Var2 != null ? hp0Var2.C : null;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(il4.l.e(context, xs4Var != null ? xs4Var.m75939xb282bd08(18) : 0));
                    sb6.append(" ");
                    sb6.append(gp0Var.f456937d);
                    return sb6.toString();
                }
                if (!o72.x1.j0()) {
                    return a(context, com.p314xaae8f345.mm.R.C30867xcad56011.cdf) + " " + gp0Var.f456937d;
                }
                return "";
            }
        }
        return a(context, com.p314xaae8f345.mm.R.C30867xcad56011.cdh) + " " + d(context, (int) o72.x1.Y(gp0Var.f456981y));
    }

    public static boolean c(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        return !str.equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573931gh1));
    }

    public static java.lang.String d(android.content.Context context, int i17) {
        if (i17 <= 0) {
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572752ce0, 0);
        }
        int i18 = i17 / 60;
        int i19 = i17 % 60;
        return i18 == 0 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572752ce0, java.lang.Integer.valueOf(i19)) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cdz, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }
}
