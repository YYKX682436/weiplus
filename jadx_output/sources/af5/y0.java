package af5;

/* loaded from: classes9.dex */
public abstract class y0 {
    public static final z01.k a(z01.k kVar, com.tencent.mm.storage.f9 msgInfo, com.tencent.mm.api.IEmojiInfo emoji, boolean z17, android.content.Context context) {
        kotlin.jvm.internal.o.g(kVar, "<this>");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(emoji, "emoji");
        kotlin.jvm.internal.o.g(context, "context");
        kVar.s(msgInfo.A0() == 1 ? 2 : 1);
        java.lang.String md52 = emoji.getMd5();
        kotlin.jvm.internal.o.f(md52, "getMd5(...)");
        kVar.t(md52);
        kVar.q(msgInfo.getMsgId());
        kVar.u(z17);
        if (emoji.k()) {
            java.lang.String name = emoji.getName();
            kotlin.jvm.internal.o.f(name, "getName(...)");
            if (r26.i0.y(name, "jsb_j", false)) {
                java.lang.String string = context.getString(com.tencent.mm.R.string.bwl);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                kVar.r(string);
            } else {
                java.lang.String name2 = emoji.getName();
                kotlin.jvm.internal.o.f(name2, "getName(...)");
                if (r26.i0.y(name2, "jsb_s", false)) {
                    java.lang.String string2 = context.getString(com.tencent.mm.R.string.bwm);
                    kotlin.jvm.internal.o.f(string2, "getString(...)");
                    kVar.r(string2);
                } else {
                    java.lang.String name3 = emoji.getName();
                    kotlin.jvm.internal.o.f(name3, "getName(...)");
                    if (r26.i0.y(name3, "jsb_b", false)) {
                        java.lang.String string3 = context.getString(com.tencent.mm.R.string.bwk);
                        kotlin.jvm.internal.o.f(string3, "getString(...)");
                        kVar.r(string3);
                    } else {
                        java.lang.String name4 = emoji.getName();
                        kotlin.jvm.internal.o.f(name4, "getName(...)");
                        if (r26.i0.y(name4, "dice", false)) {
                            java.lang.String name5 = emoji.getName();
                            kotlin.jvm.internal.o.f(name5, "getName(...)");
                            kVar.r(r26.i0.t(r26.i0.t(name5, "dice_", "", false), ".png", "", false));
                        }
                    }
                }
            }
        } else {
            java.lang.String v17 = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).v(emoji.getMd5());
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            kVar.r(v17 != null ? v17 : "");
        }
        return kVar;
    }

    public static final z01.q b(z01.q qVar, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(qVar, "<this>");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        java.lang.Object z07 = msgInfo.z0();
        if (z07 == null) {
            z07 = "";
        }
        int i17 = qVar.f469144i;
        qVar.set(i17 + 0, z07);
        j15.a b17 = g45.c.b(msgInfo);
        qVar.set(i17 + 2, java.lang.Integer.valueOf(b17.q()));
        qVar.set(i17 + 1, java.lang.Integer.valueOf(b17.n()));
        qVar.set(i17 + 4, java.lang.Boolean.valueOf(msgInfo.A0() == 1));
        if (qVar.getBoolean(i17 + 4)) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            if (m11.b1.Di().S1(msgInfo) != null) {
                xs.d1 d1Var = (xs.d1) i95.n0.c(xs.d1.class);
                com.tencent.mm.plugin.msg.MsgIdTalker a17 = tg3.l1.a(msgInfo);
                v70.w wVar = (v70.w) d1Var;
                wVar.getClass();
                java.lang.String format = java.lang.String.format("%s_%s", java.util.Arrays.copyOf(new java.lang.Object[]{a17.a(), java.lang.Long.valueOf(a17.f149480d)}, 2));
                kotlin.jvm.internal.o.f(format, "format(...)");
                java.lang.Float f17 = (java.lang.Float) wVar.ij().get(format);
                int floatValue = (int) ((f17 == null ? 0.0f : f17.floatValue()) * 100);
                qVar.set(i17 + 6, java.lang.Integer.valueOf(floatValue));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(floatValue);
                sb6.append('%');
                qVar.set(i17 + 5, sb6.toString());
                qVar.set(i17 + 3, java.lang.Boolean.valueOf(msgInfo.P0() != 1));
                qVar.set(i17 + 7, java.lang.Boolean.valueOf(!qVar.getBoolean(i17 + 3)));
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
        kotlin.jvm.internal.o.g(bVar, "<this>");
        y01.a aVar = new y01.a(bVar.f37810a);
        aVar.d(bVar.f37811b);
        aVar.a(bVar.f37812c);
        aVar.f458575d = bVar.f37813d;
        java.lang.String str = bVar.f37814e;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        aVar.f458576e = str;
        aVar.b(bVar.f37815f);
        aVar.f458578g = bVar.f37816g;
        aVar.f458579h = bVar.f37817h;
        aVar.f458580i = bVar.f37818i;
        java.lang.String str2 = bVar.f37819j;
        kotlin.jvm.internal.o.g(str2, "<set-?>");
        aVar.f458581j = str2;
        aVar.c(bVar.f37820k);
        aVar.f458583l = 0L;
        return aVar;
    }
}
