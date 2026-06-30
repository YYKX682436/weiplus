package bh0;

/* loaded from: classes4.dex */
public class w1 extends com.tencent.mm.sdk.event.n {
    public w1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent webviewReportPublisherIdEvent = (com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent) iEvent;
        if (!(webviewReportPublisherIdEvent instanceof com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent)) {
            return false;
        }
        java.lang.String r17 = c01.z1.r();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(webviewReportPublisherIdEvent.f54990g.f7765a);
        am.r20 r20Var = webviewReportPublisherIdEvent.f54990g;
        arrayList.add(r20Var.f7766b);
        arrayList.add(r20Var.f7767c);
        arrayList.add(r20Var.f7768d);
        arrayList.add(r20Var.f7769e);
        arrayList.add("" + r20Var.f7770f);
        arrayList.add(r20Var.f7771g);
        arrayList.add(r20Var.f7772h);
        arrayList.add("" + r20Var.f7773i);
        arrayList.add("" + r20Var.f7774j);
        arrayList.add(r17);
        arrayList.add("" + r20Var.f7775k);
        arrayList.add(r20Var.f7776l);
        com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
        arrayList.add(((n34.p4) ((p94.o0) i95.n0.c(p94.o0.class))).Ai(r20Var.f7777m, pString));
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        int a17 = c01.h2.a(r20Var.f7767c, r20Var.f7768d);
        int a18 = c01.h2.a(r17, r20Var.f7771g);
        arrayList.add("" + a17);
        arrayList.add("" + a18);
        java.lang.String str = r20Var.f7778n;
        java.lang.String str2 = r20Var.f7779o;
        try {
            str = java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c);
            str2 = com.tencent.mm.sdk.platformtools.t8.K0(str2) ? "" : java.net.URLEncoder.encode(str2, com.tencent.mapsdk.internal.rv.f51270c);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("WvReportPublisherIdListener", e17, "", new java.lang.Object[0]);
        }
        arrayList.add(str);
        arrayList.add(pString.value);
        arrayList.add(str2);
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String str3 = r20Var.f7771g;
        ((py.a) iVar).getClass();
        arrayList.add(c01.v1.y(str3) ? "1" : "0");
        java.lang.String str4 = r20Var.f7769e;
        if (str4 != null) {
            str4.replace(",", "!");
        }
        java.lang.String str5 = r20Var.f7776l;
        if (str5 != null) {
            str5.replace(",", "!");
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.l(11954, arrayList);
        return true;
    }
}
