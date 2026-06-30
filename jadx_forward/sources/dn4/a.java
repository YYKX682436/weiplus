package dn4;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final dn4.a f323566a = new dn4.a();

    public final void a(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar) {
        java.lang.String str;
        map.put("tipsid", jbVar.f65880x11c19d58);
        map.put("ext_reportinfo", jbVar.f65874xb5f7102a.f470032t);
        long m75942xfb822ef2 = jbVar.W0().m75942xfb822ef2(0);
        if (m75942xfb822ef2 == 0) {
            str = "0";
        } else if (m75942xfb822ef2 > 0) {
            str = java.lang.Long.toString(m75942xfb822ef2, 10);
        } else {
            char[] cArr = new char[64];
            long j17 = (m75942xfb822ef2 >>> 1) / 5;
            long j18 = 10;
            int i17 = 63;
            cArr[63] = java.lang.Character.forDigit((int) (m75942xfb822ef2 - (j17 * j18)), 10);
            while (j17 > 0) {
                i17--;
                cArr[i17] = java.lang.Character.forDigit((int) (j17 % j18), 10);
                j17 /= j18;
            }
            str = new java.lang.String(cArr, i17, 64 - i17);
        }
        map.put("object_id", str);
        map.put("ctrl_type", java.lang.Integer.valueOf(jbVar.m55856xfb85f7b0()));
    }

    public final void b(android.content.Context context, java.lang.String str, int i17) {
        dn4.b bVar;
        java.lang.String obj;
        java.lang.String obj2;
        java.lang.String str2;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "ws_tab_tips_bubble");
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        hashMap.put("my_finder_username", xy2.c.e(context2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(zm4.d.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        zm4.a O6 = ((zm4.d) a17).O6(false);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = O6.f555709a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            bVar = dn4.b.f323567a;
            if (!hasNext) {
                break;
            }
            zm4.b bVar2 = (zm4.b) it.next();
            java.util.Map b17 = bVar2.b();
            java.lang.String str3 = "";
            if (b17 != null) {
                java.lang.String str4 = bVar2.f555710a + "-num_red_dot";
                java.lang.Object a18 = bVar.a(b17);
                if (a18 == null || (str2 = a18.toString()) == null) {
                    str2 = "";
                }
                linkedHashMap.put(str4, str2);
            }
            java.util.Map a19 = bVar2.a();
            if (a19 != null) {
                java.lang.String str5 = bVar2.f555710a + "-content_red_dot";
                java.lang.Object a27 = bVar.a(a19);
                if (a27 != null && (obj2 = a27.toString()) != null) {
                    str3 = obj2;
                }
                linkedHashMap.put(str5, str3);
            }
        }
        java.lang.Object a28 = bVar.a(linkedHashMap);
        hashMap.put("in_tab_reddot_info", (a28 == null || (obj = a28.toString()) == null) ? null : r26.i0.t(obj, ",", ";", false));
        hashMap.put("tab_category_id", java.lang.Integer.valueOf(i17));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj(str, null, hashMap, 3, false);
    }
}
