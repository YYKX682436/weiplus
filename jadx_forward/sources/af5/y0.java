package af5;

/* loaded from: classes9.dex */
public abstract class y0 {
    public static final z01.k a(z01.k kVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emoji, boolean z17, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emoji, "emoji");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        kVar.s(msgInfo.A0() == 1 ? 2 : 1);
        java.lang.String mo42933xb5885648 = emoji.mo42933xb5885648();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo42933xb5885648, "getMd5(...)");
        kVar.t(mo42933xb5885648);
        kVar.q(msgInfo.m124847x74d37ac6());
        kVar.u(z17);
        if (emoji.k()) {
            java.lang.String mo42934xfb82e301 = emoji.mo42934xfb82e301();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo42934xfb82e301, "getName(...)");
            if (r26.i0.y(mo42934xfb82e301, "jsb_j", false)) {
                java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bwl);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                kVar.r(string);
            } else {
                java.lang.String mo42934xfb82e3012 = emoji.mo42934xfb82e301();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo42934xfb82e3012, "getName(...)");
                if (r26.i0.y(mo42934xfb82e3012, "jsb_s", false)) {
                    java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bwm);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                    kVar.r(string2);
                } else {
                    java.lang.String mo42934xfb82e3013 = emoji.mo42934xfb82e301();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo42934xfb82e3013, "getName(...)");
                    if (r26.i0.y(mo42934xfb82e3013, "jsb_b", false)) {
                        java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bwk);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                        kVar.r(string3);
                    } else {
                        java.lang.String mo42934xfb82e3014 = emoji.mo42934xfb82e301();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo42934xfb82e3014, "getName(...)");
                        if (r26.i0.y(mo42934xfb82e3014, "dice", false)) {
                            java.lang.String mo42934xfb82e3015 = emoji.mo42934xfb82e301();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo42934xfb82e3015, "getName(...)");
                            kVar.r(r26.i0.t(r26.i0.t(mo42934xfb82e3015, "dice_", "", false), ".png", "", false));
                        }
                    }
                }
            }
        } else {
            java.lang.String v17 = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).v(emoji.mo42933xb5885648());
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            kVar.r(v17 != null ? v17 : "");
        }
        return kVar;
    }

    public static final z01.q b(z01.q qVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        java.lang.Object z07 = msgInfo.z0();
        if (z07 == null) {
            z07 = "";
        }
        int i17 = qVar.f550677i;
        qVar.set(i17 + 0, z07);
        j15.a b17 = g45.c.b(msgInfo);
        qVar.set(i17 + 2, java.lang.Integer.valueOf(b17.q()));
        qVar.set(i17 + 1, java.lang.Integer.valueOf(b17.n()));
        qVar.set(i17 + 4, java.lang.Boolean.valueOf(msgInfo.A0() == 1));
        if (qVar.m75933x41a8a7f2(i17 + 4)) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            if (m11.b1.Di().S1(msgInfo) != null) {
                xs.d1 d1Var = (xs.d1) i95.n0.c(xs.d1.class);
                com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 a17 = tg3.l1.a(msgInfo);
                v70.w wVar = (v70.w) d1Var;
                wVar.getClass();
                java.lang.String format = java.lang.String.format("%s_%s", java.util.Arrays.copyOf(new java.lang.Object[]{a17.a(), java.lang.Long.valueOf(a17.f231013d)}, 2));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                java.lang.Float f17 = (java.lang.Float) wVar.ij().get(format);
                int floatValue = (int) ((f17 == null ? 0.0f : f17.floatValue()) * 100);
                qVar.set(i17 + 6, java.lang.Integer.valueOf(floatValue));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(floatValue);
                sb6.append('%');
                qVar.set(i17 + 5, sb6.toString());
                qVar.set(i17 + 3, java.lang.Boolean.valueOf(msgInfo.P0() != 1));
                qVar.set(i17 + 7, java.lang.Boolean.valueOf(!qVar.m75933x41a8a7f2(i17 + 3)));
            } else {
                qVar.set(i17 + 3, java.lang.Boolean.FALSE);
            }
        } else {
            qVar.set(i17 + 3, java.lang.Boolean.TRUE);
        }
        oi3.f fVar = new oi3.f();
        c01.gb.a(fVar, msgInfo);
        qVar.set(i17 + 9, fVar);
        return qVar;
    }

    public static final y01.a c(c11.b bVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bVar, "<this>");
        y01.a aVar = new y01.a(bVar.f119343a);
        aVar.d(bVar.f119344b);
        aVar.a(bVar.f119345c);
        aVar.f540108d = bVar.f119346d;
        java.lang.String str = bVar.f119347e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        aVar.f540109e = str;
        aVar.b(bVar.f119348f);
        aVar.f540111g = bVar.f119349g;
        aVar.f540112h = bVar.f119350h;
        aVar.f540113i = bVar.f119351i;
        java.lang.String str2 = bVar.f119352j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
        aVar.f540114j = str2;
        aVar.c(bVar.f119353k);
        aVar.f540116l = 0L;
        return aVar;
    }
}
