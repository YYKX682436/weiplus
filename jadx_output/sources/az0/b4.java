package az0;

/* loaded from: classes5.dex */
public final class b4 implements com.tencent.maas.MJMaasCore.AnalyticsListener {

    /* renamed from: a, reason: collision with root package name */
    public static final az0.b4 f15355a = new az0.b4();

    @Override // com.tencent.maas.MJMaasCore.AnalyticsListener
    public final void onEvent(com.tencent.maas.analytics.MJAnalyticsEvent mJAnalyticsEvent) {
        if (mJAnalyticsEvent != null) {
            ig.a aVar = mJAnalyticsEvent.f47796a;
            ig.i iVar = null;
            switch (aVar == null ? -1 : az0.a4.f15319a[aVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    java.nio.ByteBuffer pBData = mJAnalyticsEvent.getPBData();
                    if (pBData != null) {
                        try {
                            iVar = ig.i.parseFrom(pBData);
                        } catch (com.google.protobuf.y6 e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MaasReport24945", e17, "pb error", new java.lang.Object[0]);
                        }
                        if (iVar != null) {
                            com.tencent.mm.autogen.mmdata.rpt.MaaSEventReportStruct maaSEventReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MaaSEventReportStruct();
                            maaSEventReportStruct.f58944d = maaSEventReportStruct.b("sessionKey", bz0.a.f36722a, true);
                            maaSEventReportStruct.f58945e = bz0.a.f36723b;
                            maaSEventReportStruct.f58946f = aVar.f291268d + 1;
                            maaSEventReportStruct.f58947g = maaSEventReportStruct.b("maasVersionCode", "2008004", true);
                            java.lang.String name = iVar.getName();
                            kotlin.jvm.internal.o.f(name, "getName(...)");
                            maaSEventReportStruct.f58948h = maaSEventReportStruct.b("maasEventName", r26.i0.t(name, ",", ";", false), true);
                            java.lang.String errorCode = iVar.getErrorCode();
                            kotlin.jvm.internal.o.f(errorCode, "getErrorCode(...)");
                            maaSEventReportStruct.f58949i = maaSEventReportStruct.b("maasEventCode", r26.i0.t(errorCode, ",", ";", false), true);
                            java.lang.String errorMessage = iVar.getErrorMessage();
                            kotlin.jvm.internal.o.f(errorMessage, "getErrorMessage(...)");
                            maaSEventReportStruct.f58950j = maaSEventReportStruct.b("maasEventMessage", r26.i0.t(errorMessage, ",", ";", false), true);
                            com.google.protobuf.j9<java.lang.String> expandsList = iVar.getExpandsList();
                            kotlin.jvm.internal.o.f(expandsList, "getExpandsList(...)");
                            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(expandsList, 10));
                            for (java.lang.String str : expandsList) {
                                kotlin.jvm.internal.o.d(str);
                                arrayList.add(r26.i0.t(str, ",", ";", false));
                            }
                            java.lang.String str2 = (java.lang.String) kz5.n0.a0(arrayList, 0);
                            if (str2 == null) {
                                str2 = "";
                            }
                            maaSEventReportStruct.f58951k = maaSEventReportStruct.b("maasExpand1", str2, true);
                            java.lang.String str3 = (java.lang.String) kz5.n0.a0(arrayList, 1);
                            if (str3 == null) {
                                str3 = "";
                            }
                            maaSEventReportStruct.f58952l = maaSEventReportStruct.b("maasExpand2", str3, true);
                            java.lang.String str4 = (java.lang.String) kz5.n0.a0(arrayList, 2);
                            if (str4 == null) {
                                str4 = "";
                            }
                            maaSEventReportStruct.f58953m = maaSEventReportStruct.b("maasExpand3", str4, true);
                            java.lang.String str5 = (java.lang.String) kz5.n0.a0(arrayList, 3);
                            if (str5 == null) {
                                str5 = "";
                            }
                            maaSEventReportStruct.f58954n = maaSEventReportStruct.b("maasExpand4", str5, true);
                            java.lang.String str6 = (java.lang.String) kz5.n0.a0(arrayList, 4);
                            if (str6 == null) {
                                str6 = "";
                            }
                            maaSEventReportStruct.f58955o = maaSEventReportStruct.b("maasExpand5", str6, true);
                            java.lang.String str7 = (java.lang.String) kz5.n0.a0(arrayList, 5);
                            if (str7 == null) {
                                str7 = "";
                            }
                            maaSEventReportStruct.f58956p = maaSEventReportStruct.b("maasExpand6", str7, true);
                            java.lang.String str8 = (java.lang.String) kz5.n0.a0(arrayList, 6);
                            if (str8 == null) {
                                str8 = "";
                            }
                            maaSEventReportStruct.f58957q = maaSEventReportStruct.b("maasExpand7", str8, true);
                            java.lang.String str9 = (java.lang.String) kz5.n0.a0(arrayList, 7);
                            if (str9 == null) {
                                str9 = "";
                            }
                            maaSEventReportStruct.f58958r = maaSEventReportStruct.b("maasExpand8", str9, true);
                            java.lang.String str10 = (java.lang.String) kz5.n0.a0(arrayList, 8);
                            if (str10 == null) {
                                str10 = "";
                            }
                            maaSEventReportStruct.f58959s = maaSEventReportStruct.b("maasExpand9", str10, true);
                            java.lang.String str11 = (java.lang.String) kz5.n0.a0(arrayList, 9);
                            maaSEventReportStruct.f58960t = maaSEventReportStruct.b("maasExpand10", str11 != null ? str11 : "", true);
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            com.google.protobuf.j9 keysList = iVar.getKeysList();
                            kotlin.jvm.internal.o.f(keysList, "getKeysList(...)");
                            com.google.protobuf.j9 valuesList = iVar.getValuesList();
                            kotlin.jvm.internal.o.f(valuesList, "getValuesList(...)");
                            java.util.Iterator it = ((java.util.ArrayList) kz5.n0.a1(keysList, valuesList)).iterator();
                            while (it.hasNext()) {
                                jz5.l lVar = (jz5.l) it.next();
                                jSONObject.put((java.lang.String) lVar.f302833d, lVar.f302834e);
                            }
                            java.lang.String jSONObject2 = jSONObject.toString();
                            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                            maaSEventReportStruct.f58961u = maaSEventReportStruct.b("maasNamed", r26.i0.t(jSONObject2, ",", ";", false), true);
                            maaSEventReportStruct.f58966z = iVar.getTimeStamp();
                            long j17 = bz0.b.f36725b;
                            bz0.b.f36725b = 1 + j17;
                            maaSEventReportStruct.f58965y = j17;
                            maaSEventReportStruct.k();
                            return;
                        }
                        return;
                    }
                    return;
                case 7:
                    java.nio.ByteBuffer pBData2 = mJAnalyticsEvent.getPBData();
                    if (pBData2 != null) {
                        try {
                            iVar = ig.i.parseFrom(pBData2);
                        } catch (com.google.protobuf.y6 e18) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("PublisherSessionMetricsReport", e18, "MJAnalyticsEvent pb error", new java.lang.Object[0]);
                        }
                        if (iVar != null) {
                            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                            java.util.Map l17 = kz5.c1.l(new jz5.l("view_id", iVar.getName()));
                            com.google.protobuf.j9 keysList2 = iVar.getKeysList();
                            kotlin.jvm.internal.o.f(keysList2, "getKeysList(...)");
                            com.google.protobuf.j9 valuesList2 = iVar.getValuesList();
                            kotlin.jvm.internal.o.f(valuesList2, "getValuesList(...)");
                            l17.putAll(kz5.c1.q(kz5.n0.a1(keysList2, valuesList2)));
                            ((cy1.a) rVar).yj(iVar.getName(), null, kz5.c1.s(l17), 6, false);
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
