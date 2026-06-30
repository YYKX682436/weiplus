package ac5;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final ac5.f f3090a = new ac5.f();

    public final android.content.Intent a(bc5.e exporter) {
        kotlin.jvm.internal.o.g(exporter, "exporter");
        android.content.Intent intent = new android.content.Intent("android.intent.action.SEND_MULTIPLE");
        intent.setType("*/*");
        intent.putStringArrayListExtra("android.intent.extra.TEXT_LIST", exporter.b(false, 2, true, true));
        intent.putExtra("android.intent.extra.SUBJECT", exporter.f19195k);
        java.lang.String str = exporter.f19194j;
        java.util.ArrayList arrayList = exporter.f19193i;
        if (str == null) {
            exporter.b(false, 2, true, true);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((bc5.b) it.next()).f19174a);
            }
            str = com.tencent.mm.sdk.platformtools.h2.a(arrayList2, "\n\n");
            exporter.f19194j = str;
        }
        intent.putExtra("android.intent.extra.TEXT", str);
        if (arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.w(exporter.f19188d, "had not exported, do export first");
            exporter.b(false, 2, true, true);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            bc5.a aVar = ((bc5.b) it6.next()).f19175b;
            if (aVar != null) {
                arrayList3.add(aVar);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
        java.util.Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            android.net.Uri uri = ((bc5.a) it7.next()).f19172a;
            if (uri == null) {
                kotlin.jvm.internal.o.o("uri");
                throw null;
            }
            arrayList4.add(uri);
        }
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", new java.util.ArrayList<>(arrayList4));
        intent.addFlags(1);
        intent.addFlags(268435456);
        return intent;
    }

    public final java.lang.String b(android.content.Context context, com.tencent.mm.storage.z3 talker) {
        java.lang.String f27;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(talker, "talker");
        if (!com.tencent.mm.storage.z3.R4(talker.d1())) {
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f492972ii2);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{talker.f2(), gm0.j1.u().c().l(4, null)}, 2));
            kotlin.jvm.internal.o.f(format, "format(...)");
            return format;
        }
        java.lang.String str = "";
        if (((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).c(talker.d1())) {
            ((ku5.t0) ku5.t0.f312615d).B(ac5.e.f3089d);
            return "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(talker.P0())) {
            qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
            java.lang.String d17 = talker.d1();
            ((py.a) iVar).getClass();
            java.util.List<java.lang.String> m17 = c01.v1.m(d17);
            if (m17 == null || m17.isEmpty()) {
                f27 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b5v);
            } else {
                for (java.lang.String str2 : m17) {
                    ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                    str = str + c01.a2.e(str2) + ", ";
                }
                f27 = str.substring(0, str.length() - 2);
                kotlin.jvm.internal.o.f(f27, "substring(...)");
            }
        } else {
            f27 = talker.f2();
        }
        java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.f492973ii3);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{f27}, 1));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        return format2;
    }
}
