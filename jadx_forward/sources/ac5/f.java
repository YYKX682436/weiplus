package ac5;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final ac5.f f84623a = new ac5.f();

    public final android.content.Intent a(bc5.e exporter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exporter, "exporter");
        android.content.Intent intent = new android.content.Intent("android.intent.action.SEND_MULTIPLE");
        intent.setType("*/*");
        intent.putStringArrayListExtra("android.intent.extra.TEXT_LIST", exporter.b(false, 2, true, true));
        intent.putExtra("android.intent.extra.SUBJECT", exporter.f100728k);
        java.lang.String str = exporter.f100727j;
        java.util.ArrayList arrayList = exporter.f100726i;
        if (str == null) {
            exporter.b(false, 2, true, true);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((bc5.b) it.next()).f100707a);
            }
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.h2.a(arrayList2, "\n\n");
            exporter.f100727j = str;
        }
        intent.putExtra("android.intent.extra.TEXT", str);
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(exporter.f100721d, "had not exported, do export first");
            exporter.b(false, 2, true, true);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            bc5.a aVar = ((bc5.b) it6.next()).f100708b;
            if (aVar != null) {
                arrayList3.add(aVar);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
        java.util.Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            android.net.Uri uri = ((bc5.a) it7.next()).f100705a;
            if (uri == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uri");
                throw null;
            }
            arrayList4.add(uri);
        }
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", new java.util.ArrayList<>(arrayList4));
        intent.addFlags(1);
        intent.addFlags(268435456);
        return intent;
    }

    public final java.lang.String b(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.z3 talker) {
        java.lang.String f27;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(talker.d1())) {
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574505ii2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{talker.f2(), gm0.j1.u().c().l(4, null)}, 2));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            return format;
        }
        java.lang.String str = "";
        if (((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).c(talker.d1())) {
            ((ku5.t0) ku5.t0.f394148d).B(ac5.e.f84622d);
            return "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(talker.P0())) {
            qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
            java.lang.String d17 = talker.d1();
            ((py.a) iVar).getClass();
            java.util.List<java.lang.String> m17 = c01.v1.m(d17);
            if (m17 == null || m17.isEmpty()) {
                f27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5v);
            } else {
                for (java.lang.String str2 : m17) {
                    ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                    str = str + c01.a2.e(str2) + ", ";
                }
                f27 = str.substring(0, str.length() - 2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f27, "substring(...)");
            }
        } else {
            f27 = talker.f2();
        }
        java.lang.String string2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574506ii3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{f27}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        return format2;
    }
}
