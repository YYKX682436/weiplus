package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9;

/* loaded from: classes5.dex */
public final class x1 extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f147092f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f147093g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f147094h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f147095i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(jm0.o service) {
        super(service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f147092f = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.t1.f147069d);
        this.f147093g = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.s1.f147065d);
        this.f147094h = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.u1.f147073d);
        this.f147095i = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.w1.f147088d);
    }

    public static final java.lang.String T6(boolean z17, boolean z18, java.lang.String str, android.content.Context context, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        if (z17 && !z18 && str != null) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pfn, str2, str3, str, str5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        if (z17 && !z18) {
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pfm, str2, str3, str5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            return string2;
        }
        if (z17 && str != null) {
            java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pfk, str4, str3, str, str5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            return string3;
        }
        if (z17) {
            java.lang.String string4 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pfj, str4, str3, str5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
            return string4;
        }
        if (z18) {
            java.lang.String string5 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pfi, str4, str5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
            return string5;
        }
        java.lang.String string6 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pfl, str2, str5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string6, "getString(...)");
        return string6;
    }

    public static final oy.m U6(boolean z17, boolean z18, java.lang.Boolean bool, android.content.Context context, com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.x1 x1Var, java.lang.String str, java.util.List list, java.lang.String str2, boolean z19) {
        if (!z17 || z18) {
            if (z19) {
                x1Var.getClass();
                str2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pfc, str, str2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getString(...)");
            } else {
                x1Var.getClass();
                str2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pfe, str, str2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getString(...)");
            }
        } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.valueOf(z19))) {
            str2 = z19 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pfd, str2) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pff, str2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        }
        return new oy.m(str2, java.lang.Boolean.valueOf(z19), list);
    }

    public final java.lang.String V6(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 message, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        if (message.A0() == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReadableMessageFSC", "getReadableUserName: sender is current user");
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572005w1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            return string;
        }
        boolean g17 = g95.e0.g(message);
        if (str == null && (str = com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.r1.b(message)) == null) {
            str = "";
        }
        tg3.v0 v0Var = (tg3.v0) ((jz5.n) this.f147092f).mo141623x754a37bb();
        java.lang.String Q0 = g17 ? message.Q0() : null;
        ((sg3.a) v0Var).getClass();
        java.lang.String f17 = c01.a2.f(str, Q0);
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ReadableMessageFSC", "getReadableUserName: failed to get display name, isGroupChat=" + g17);
        }
        if (f17 != null) {
            return f17;
        }
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pf_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return string2;
    }

    public final java.lang.String W6(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2)) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572005w1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        boolean g17 = g95.e0.g(f9Var);
        tg3.v0 v0Var = (tg3.v0) ((jz5.n) this.f147092f).mo141623x754a37bb();
        java.lang.String Q0 = g17 ? f9Var.Q0() : null;
        ((sg3.a) v0Var).getClass();
        java.lang.String f17 = c01.a2.f(str, Q0);
        if (f17 != null) {
            return f17;
        }
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pf_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return string2;
    }
}
