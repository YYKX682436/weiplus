package az0;

/* loaded from: classes5.dex */
public final class b4 implements com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.AnalyticsListener {

    /* renamed from: a, reason: collision with root package name */
    public static final az0.b4 f96888a = new az0.b4();

    @Override // com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.AnalyticsListener
    /* renamed from: onEvent */
    public final void mo9327xaf8c47fb(com.p314xaae8f345.p457x3304c6.p458x9b169b86.C3968xe11269b1 c3968xe11269b1) {
        if (c3968xe11269b1 != null) {
            ig.a aVar = c3968xe11269b1.f129329a;
            ig.i iVar = null;
            switch (aVar == null ? -1 : az0.a4.f96852a[aVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    java.nio.ByteBuffer m32402x27f85b92 = c3968xe11269b1.m32402x27f85b92();
                    if (m32402x27f85b92 != null) {
                        try {
                            iVar = ig.i.m135599x92b714fd(m32402x27f85b92);
                        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MaasReport24945", e17, "pb error", new java.lang.Object[0]);
                        }
                        if (iVar != null) {
                            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6708xb03371bd c6708xb03371bd = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6708xb03371bd();
                            c6708xb03371bd.f140477d = c6708xb03371bd.b("sessionKey", bz0.a.f118255a, true);
                            c6708xb03371bd.f140478e = bz0.a.f118256b;
                            c6708xb03371bd.f140479f = aVar.f372801d + 1;
                            c6708xb03371bd.f140480g = c6708xb03371bd.b("maasVersionCode", "2008004", true);
                            java.lang.String mo135554xfb82e301 = iVar.mo135554xfb82e301();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135554xfb82e301, "getName(...)");
                            c6708xb03371bd.f140481h = c6708xb03371bd.b("maasEventName", r26.i0.t(mo135554xfb82e301, ",", ";", false), true);
                            java.lang.String mo135542x130a215f = iVar.mo135542x130a215f();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135542x130a215f, "getErrorCode(...)");
                            c6708xb03371bd.f140482i = c6708xb03371bd.b("maasEventCode", r26.i0.t(mo135542x130a215f, ",", ";", false), true);
                            java.lang.String mo135544xa8aa7f55 = iVar.mo135544xa8aa7f55();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135544xa8aa7f55, "getErrorMessage(...)");
                            c6708xb03371bd.f140483j = c6708xb03371bd.b("maasEventMessage", r26.i0.t(mo135544xa8aa7f55, ",", ";", false), true);
                            com.p176xb6135e39.p283xc50a8b8b.j9<java.lang.String> mo135549xc0cb2c21 = iVar.mo135549xc0cb2c21();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135549xc0cb2c21, "getExpandsList(...)");
                            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(mo135549xc0cb2c21, 10));
                            for (java.lang.String str : mo135549xc0cb2c21) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                                arrayList.add(r26.i0.t(str, ",", ";", false));
                            }
                            java.lang.String str2 = (java.lang.String) kz5.n0.a0(arrayList, 0);
                            if (str2 == null) {
                                str2 = "";
                            }
                            c6708xb03371bd.f140484k = c6708xb03371bd.b("maasExpand1", str2, true);
                            java.lang.String str3 = (java.lang.String) kz5.n0.a0(arrayList, 1);
                            if (str3 == null) {
                                str3 = "";
                            }
                            c6708xb03371bd.f140485l = c6708xb03371bd.b("maasExpand2", str3, true);
                            java.lang.String str4 = (java.lang.String) kz5.n0.a0(arrayList, 2);
                            if (str4 == null) {
                                str4 = "";
                            }
                            c6708xb03371bd.f140486m = c6708xb03371bd.b("maasExpand3", str4, true);
                            java.lang.String str5 = (java.lang.String) kz5.n0.a0(arrayList, 3);
                            if (str5 == null) {
                                str5 = "";
                            }
                            c6708xb03371bd.f140487n = c6708xb03371bd.b("maasExpand4", str5, true);
                            java.lang.String str6 = (java.lang.String) kz5.n0.a0(arrayList, 4);
                            if (str6 == null) {
                                str6 = "";
                            }
                            c6708xb03371bd.f140488o = c6708xb03371bd.b("maasExpand5", str6, true);
                            java.lang.String str7 = (java.lang.String) kz5.n0.a0(arrayList, 5);
                            if (str7 == null) {
                                str7 = "";
                            }
                            c6708xb03371bd.f140489p = c6708xb03371bd.b("maasExpand6", str7, true);
                            java.lang.String str8 = (java.lang.String) kz5.n0.a0(arrayList, 6);
                            if (str8 == null) {
                                str8 = "";
                            }
                            c6708xb03371bd.f140490q = c6708xb03371bd.b("maasExpand7", str8, true);
                            java.lang.String str9 = (java.lang.String) kz5.n0.a0(arrayList, 7);
                            if (str9 == null) {
                                str9 = "";
                            }
                            c6708xb03371bd.f140491r = c6708xb03371bd.b("maasExpand8", str9, true);
                            java.lang.String str10 = (java.lang.String) kz5.n0.a0(arrayList, 8);
                            if (str10 == null) {
                                str10 = "";
                            }
                            c6708xb03371bd.f140492s = c6708xb03371bd.b("maasExpand9", str10, true);
                            java.lang.String str11 = (java.lang.String) kz5.n0.a0(arrayList, 9);
                            c6708xb03371bd.f140493t = c6708xb03371bd.b("maasExpand10", str11 != null ? str11 : "", true);
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            com.p176xb6135e39.p283xc50a8b8b.j9 mo135553x9ac07628 = iVar.mo135553x9ac07628();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135553x9ac07628, "getKeysList(...)");
                            com.p176xb6135e39.p283xc50a8b8b.j9 mo135560x691318d6 = iVar.mo135560x691318d6();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135560x691318d6, "getValuesList(...)");
                            java.util.Iterator it = ((java.util.ArrayList) kz5.n0.a1(mo135553x9ac07628, mo135560x691318d6)).iterator();
                            while (it.hasNext()) {
                                jz5.l lVar = (jz5.l) it.next();
                                jSONObject.put((java.lang.String) lVar.f384366d, lVar.f384367e);
                            }
                            java.lang.String jSONObject2 = jSONObject.toString();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                            c6708xb03371bd.f140494u = c6708xb03371bd.b("maasNamed", r26.i0.t(jSONObject2, ",", ";", false), true);
                            c6708xb03371bd.f140499z = iVar.mo135556xf3aa40();
                            long j17 = bz0.b.f118258b;
                            bz0.b.f118258b = 1 + j17;
                            c6708xb03371bd.f140498y = j17;
                            c6708xb03371bd.k();
                            return;
                        }
                        return;
                    }
                    return;
                case 7:
                    java.nio.ByteBuffer m32402x27f85b922 = c3968xe11269b1.m32402x27f85b92();
                    if (m32402x27f85b922 != null) {
                        try {
                            iVar = ig.i.m135599x92b714fd(m32402x27f85b922);
                        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("PublisherSessionMetricsReport", e18, "MJAnalyticsEvent pb error", new java.lang.Object[0]);
                        }
                        if (iVar != null) {
                            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                            java.util.Map l17 = kz5.c1.l(new jz5.l("view_id", iVar.mo135554xfb82e301()));
                            com.p176xb6135e39.p283xc50a8b8b.j9 mo135553x9ac076282 = iVar.mo135553x9ac07628();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135553x9ac076282, "getKeysList(...)");
                            com.p176xb6135e39.p283xc50a8b8b.j9 mo135560x691318d62 = iVar.mo135560x691318d6();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135560x691318d62, "getValuesList(...)");
                            l17.putAll(kz5.c1.q(kz5.n0.a1(mo135553x9ac076282, mo135560x691318d62)));
                            ((cy1.a) rVar).yj(iVar.mo135554xfb82e301(), null, kz5.c1.s(l17), 6, false);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
