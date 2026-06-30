package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class ja {
    public static void a(yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q9 q9Var) {
        sb5.e eVar = (sb5.e) dVar.f542241c.a(sb5.e.class);
        android.widget.TextView textView = q9Var.f286863c;
        if (textView == null) {
            return;
        }
        textView.setBackgroundResource(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v2) eVar).n0());
        com.p314xaae8f345.mm.ui.bk.s0(q9Var.f286863c.getPaint());
        q9Var.f286863c.setTextColor(i65.a.d(dVar.g(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) q9Var.f286863c.getLayoutParams();
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v2) ((sb5.e) dVar.f542241c.a(sb5.e.class))).o0(i65.a.f(dVar.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561089yd));
            q9Var.f286863c.setLayoutParams(marginLayoutParams);
        }
    }

    public static boolean b(android.view.View view) {
        if (view != null && view.getTag(com.p314xaae8f345.mm.R.id.bqt) != null) {
            try {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - ((java.lang.Long) view.getTag(com.p314xaae8f345.mm.R.id.bqt)).longValue();
                if (currentTimeMillis > 0 && currentTimeMillis < 500) {
                    return true;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgGroupSolitatire", "checkSolitaireFoldDoubleClick Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            }
        }
        return false;
    }

    public static java.lang.String c(android.content.Context context, yb5.d dVar, java.lang.String str, java.lang.CharSequence charSequence, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        java.lang.CharSequence charSequence2;
        java.lang.Boolean bool;
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pc) ((sb5.v0) dVar.f542241c.a(sb5.v0.class))).m0(f9Var)) {
            f9Var.getClass();
            r45.ad4 ad4Var = tg3.p1.f500739a.a(f9Var).f276562g;
            if (ad4Var == null) {
                ad4Var = f9Var.L0();
            }
            r45.ad4 ad4Var2 = ad4Var;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.LinkedList linkedList = ad4Var2.f451475d;
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.bd4 bd4Var = (r45.bd4) it.next();
                    java.lang.String str2 = bd4Var.f452209d;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    sb6.append(str2);
                    sb6.append(str.substring(bd4Var.f452210e, bd4Var.f452211f));
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sb6.toString())) {
                sb6.append("\n");
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sb6.toString()) && ad4Var2.f451478g == 1) {
                sb6.append("\n");
            }
            yd5.h.f542632a.a(c22624x85d69039, f9Var, dVar.D(), dVar.t());
            android.os.Bundle c17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.c(f9Var, dVar, dVar.t());
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1.f272786g.b(c17, k01.d.a(f9Var.Q0()));
            android.text.SpannableString fj6 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).fj(context, sb6, (int) c22624x85d69039.m84164x40077844(), i17, c17, le0.x.P0);
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsp);
            android.text.SpannableString spannableString = new android.text.SpannableString(string);
            spannableString.setSpan(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p9(i17, null, dVar, f9Var, c22624x85d69039, charSequence, ad4Var2), 0, string.length(), 33);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append("\n");
            java.util.LinkedList linkedList2 = ad4Var2.f451476e;
            if (linkedList2 != null) {
                java.util.Iterator it6 = linkedList2.iterator();
                while (it6.hasNext()) {
                    r45.bd4 bd4Var2 = (r45.bd4) it6.next();
                    java.lang.String str3 = bd4Var2.f452209d;
                    if (str3 == null) {
                        str3 = "";
                    }
                    sb7.append(str3);
                    sb7.append(str.substring(bd4Var2.f452210e, bd4Var2.f452211f));
                    sb7.append("\n");
                }
            }
            if (ad4Var2.f451477f != null) {
                sb7.append("\n");
                java.lang.String str4 = ad4Var2.f451477f.f452209d;
                if (str4 == null) {
                    str4 = "";
                }
                sb7.append(str4);
                r45.bd4 bd4Var3 = ad4Var2.f451477f;
                sb7.append(str.substring(bd4Var3.f452210e, bd4Var3.f452211f));
            }
            charSequence2 = android.text.TextUtils.concat(android.text.TextUtils.concat(fj6, spannableString), ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).fj(context, sb7, (int) c22624x85d69039.m84164x40077844(), i17, c17, le0.x.P0));
        } else {
            charSequence2 = charSequence;
        }
        if (f9Var != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a9 a9Var = f9Var.f275460g2;
            if (a9Var instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.un) {
                bool = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.un) a9Var).f287248d;
                c22624x85d69039.c(charSequence2, android.widget.TextView.BufferType.SPANNABLE, bool);
                return charSequence2.toString();
            }
        }
        bool = null;
        c22624x85d69039.c(charSequence2, android.widget.TextView.BufferType.SPANNABLE, bool);
        return charSequence2.toString();
    }
}
