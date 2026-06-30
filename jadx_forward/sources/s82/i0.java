package s82;

/* loaded from: classes9.dex */
public class i0 extends s82.c {
    public i0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar) {
        super(raVar);
        new java.util.HashMap();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:48:0x028e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0298  */
    @Override // s82.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View e(android.view.View r30, android.view.ViewGroup r31, o72.r2 r32) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s82.i0.e(android.view.View, android.view.ViewGroup, o72.r2):android.view.View");
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        s82.h0 h0Var = (s82.h0) view.getTag();
        android.content.Context context = view.getContext();
        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(context, h0Var.f486307a, dq0Var);
    }

    public final java.lang.String l(android.content.Context context, int i17) {
        return "[" + context.getResources().getString(i17) + "]";
    }

    public final void m(android.widget.ImageView imageView, r45.gp0 gp0Var, o72.r2 r2Var, int i17) {
        int i18 = gp0Var.I;
        if (i18 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.d(imageView, com.p314xaae8f345.mm.R.raw.f80954x6d683109, gp0Var, r2Var, true, i17, i17);
        } else if (i18 == 4 || i18 == 15) {
            this.f486272c.a(imageView, gp0Var, r2Var, com.p314xaae8f345.mm.R.raw.f78433xb28fb9bc, i17, i17);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0041. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0044. Please report as an issue. */
    public final boolean n(android.widget.TextView textView, r45.gp0 gp0Var) {
        java.lang.String str;
        if (gp0Var.L1) {
            str = gp0Var.K1 + ": ";
        } else {
            str = "";
        }
        int i17 = gp0Var.I;
        if (i17 == 10130) {
            i17 = 8;
        }
        if (i17 == 10) {
            str = str + l(textView.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.cbg) + gp0Var.J1.f457889g.f451721d;
        } else if (i17 != 19) {
            if (i17 != 29) {
                if (i17 != 36) {
                    if (i17 == 21) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(str);
                        sb6.append(l(textView.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.cdc));
                        java.lang.String str2 = gp0Var.f456937d;
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        sb6.append(str2 != null ? str2 : "");
                        str = sb6.toString();
                    } else if (i17 != 22) {
                        switch (i17) {
                            case 1:
                                str = str + gp0Var.f456941f;
                                break;
                            case 2:
                                str = str + l(textView.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.cd8);
                                break;
                            case 3:
                                str = str + l(textView.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.cdh);
                                break;
                            case 4:
                                str = str + l(textView.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.cdg);
                                break;
                            case 5:
                                str = str + l(textView.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.cdf) + gp0Var.f456937d;
                                break;
                            case 6:
                                r45.pp0 pp0Var = gp0Var.J1.f457887e;
                                if (pp0Var != null) {
                                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                    sb7.append(str);
                                    sb7.append(l(textView.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.cd_));
                                    sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pp0Var.f464807o) ? pp0Var.f464805m : pp0Var.f464807o);
                                    str = sb7.toString();
                                    break;
                                } else {
                                    str = str + l(textView.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.cd_);
                                    break;
                                }
                            case 7:
                                break;
                            case 8:
                                str = str + l(textView.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f572744cd1) + gp0Var.f456937d;
                                break;
                            default:
                                switch (i17) {
                                    case 15:
                                        str = str + l(textView.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.ccx);
                                        break;
                                    case 16:
                                        str = str + l(textView.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.cay);
                                        break;
                                    case 17:
                                        str = str + l(textView.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.cde);
                                        break;
                                    default:
                                        switch (i17) {
                                            case 31:
                                                str = str + l(textView.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.cbc);
                                                break;
                                            case 32:
                                                break;
                                            case 33:
                                                android.content.Context context = textView.getContext();
                                                r45.hp0 hp0Var = gp0Var.J1;
                                                str = str + il4.d.p(context, hp0Var != null ? hp0Var.G : null) + gp0Var.f456937d;
                                                break;
                                            default:
                                                return false;
                                        }
                                }
                        }
                    } else if (!o72.x1.j0()) {
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                        sb8.append(str);
                        sb8.append(l(textView.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.cdf));
                        java.lang.String str3 = gp0Var.f456937d;
                        sb8.append(str3 != null ? str3 : "");
                        str = sb8.toString();
                    }
                } else if (u46.l.e(gp0Var.f456941f)) {
                    str = str + textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572122za) + gp0Var.f456937d;
                } else {
                    str = str + gp0Var.f456941f;
                }
            }
            r45.hp0 hp0Var2 = gp0Var.J1;
            r45.xs4 xs4Var = hp0Var2 != null ? hp0Var2.C : null;
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str);
            sb9.append(il4.l.e(textView.getContext(), xs4Var != null ? xs4Var.m75939xb282bd08(18) : 0));
            sb9.append(gp0Var.f456937d);
            str = sb9.toString();
        } else {
            str = str + l(textView.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.ccy) + gp0Var.f456937d;
        }
        if (str.length() <= 0) {
            textView.setVisibility(8);
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = textView.getContext();
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, str, textSize));
        return true;
    }

    public final void o(android.widget.TextView textView, android.widget.TextView textView2, boolean z17) {
        if (z17) {
            textView.setVisibility(0);
            textView2.setVisibility(0);
        } else {
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
    }
}
