package te5;

@j95.b
/* loaded from: classes9.dex */
public final class y extends i95.w implements ct.t2 {
    public z01.b0 wi(android.content.Context context, l15.c recordMsg) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String m75945x2fec8307;
        java.lang.String j17;
        java.lang.String l17;
        v05.b k17;
        java.lang.String m75945x2fec83072;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordMsg, "recordMsg");
        s15.w wVar = new s15.w();
        v05.b k18 = recordMsg.k();
        java.lang.String str3 = "";
        if (k18 == null || (str = k18.m75945x2fec8307(k18.f513848e + 44)) == null) {
            str = "";
        }
        wVar.m126728xdc93280d(str);
        int i17 = wVar.f384956d;
        java.lang.String obj = r26.n0.u0(wVar.m75945x2fec8307(i17 + 0)).toString();
        if (r26.n0.N(obj) && ((k17 = recordMsg.k()) == null || (m75945x2fec83072 = k17.m75945x2fec8307(k17.f449898d + 2)) == null || (obj = r26.n0.u0(m75945x2fec83072).toString()) == null)) {
            obj = "";
        }
        if (r26.n0.N(obj)) {
            java.lang.String str4 = "";
            java.lang.String str5 = str4;
            boolean z17 = false;
            for (s15.h hVar : wVar.j()) {
                s15.i p17 = hVar.p();
                if (p17 != null && (l17 = p17.l()) != null) {
                    if (!(!r26.n0.N(l17))) {
                        l17 = null;
                    }
                    if (l17 != null) {
                        obj = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572417n82);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "getString(...)");
                        z17 = true;
                    }
                }
                s15.i p18 = hVar.p();
                if (p18 != null && (j17 = p18.j()) != null) {
                    if (!(!r26.n0.N(j17))) {
                        j17 = null;
                    }
                    if (j17 != null) {
                        if (r26.n0.N(str4)) {
                            str4 = hVar.m163588xabfe893c();
                        } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str4, hVar.m163588xabfe893c())) {
                            str5 = hVar.m163588xabfe893c();
                        }
                    }
                }
            }
            if ((!r26.n0.N(str4)) && (!r26.n0.N(str5)) && !z17) {
                obj = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572418n83, str4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "getString(...)");
            } else if ((!r26.n0.N(str4)) && (!r26.n0.N(str5)) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str4, str5) && !z17) {
                obj = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572416n81, str4, str5);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "getString(...)");
            }
        }
        java.lang.String obj2 = r26.n0.u0(wVar.m75945x2fec8307(i17 + 1)).toString();
        java.lang.String str6 = r26.n0.N(obj2) ^ true ? obj2 : null;
        if (str6 != null) {
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("&lt;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
            java.lang.String replaceAll = compile.matcher(str6).replaceAll("<");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
            java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("&gt;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile2, "compile(...)");
            str2 = compile2.matcher(replaceAll).replaceAll(">");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "replaceAll(...)");
            if (str2.length() > 100) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.o0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5.class))).getClass();
                boolean z18 = com.p314xaae8f345.mm.p2614xca6eae71.q0.f274869d;
                str2 = str2.substring(0, com.p314xaae8f345.mm.p2614xca6eae71.l0.f274840a.h(str2, 0, 100));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "substring(...)");
            }
        } else {
            v05.b k19 = recordMsg.k();
            if (k19 != null && (m75945x2fec8307 = k19.m75945x2fec8307(k19.f449898d + 3)) != null) {
                str3 = m75945x2fec8307;
            }
            str2 = str3;
        }
        z01.b0 b0Var = new z01.b0();
        b0Var.f550485d = obj;
        b0Var.f550486e = str2;
        return b0Var;
    }
}
