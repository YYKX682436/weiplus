package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes9.dex */
public class t1 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f83241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ot0.q f83242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f83243f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83244g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ byte[] f83245h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f83246i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask f83247m;

    public t1(com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask sendAppMessageTask, java.util.LinkedList linkedList, ot0.q qVar, int i17, java.lang.String str, byte[] bArr, java.lang.StringBuilder sb6) {
        this.f83247m = sendAppMessageTask;
        this.f83241d = linkedList;
        this.f83242e = qVar;
        this.f83243f = i17;
        this.f83244g = str;
        this.f83245h = bArr;
        this.f83246i = sb6;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ym6 ym6Var;
        r45.k46 k46Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMessageTask", "callback, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        r45.hc7 hc7Var = (r45.hc7) oVar.f70711b.f70700a;
        java.lang.String str2 = this.f83244g;
        java.util.LinkedList linkedList = this.f83241d;
        ot0.q qVar = this.f83242e;
        com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask sendAppMessageTask = this.f83247m;
        if (i17 == 0 && i18 == 0 && hc7Var != null) {
            java.util.LinkedList linkedList2 = hc7Var.f376057d;
            if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList2)) {
                sendAppMessageTask.I1 = new java.util.ArrayList();
                int i19 = 0;
                while (i19 < linkedList.size()) {
                    r45.vc7 vc7Var = i19 < linkedList2.size() ? (r45.vc7) linkedList2.get(i19) : new r45.vc7();
                    java.lang.String str3 = vc7Var.f388114e;
                    qVar.f348693o2 = str3;
                    sendAppMessageTask.I1.add(new com.tencent.mm.plugin.appbrand.jsapi.share.ShareInfo(str3, vc7Var.f388113d));
                    ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
                    boolean z17 = vc7Var.f388116g;
                    aVar.f348349e = z17;
                    aVar.Q = vc7Var.f388121o;
                    aVar.f348367w = vc7Var.f388119m;
                    if (z17 && (k46Var = vc7Var.f388115f) != null) {
                        aVar.f348350f = k46Var.f378366d;
                        aVar.f348351g = k46Var.f378367e;
                        aVar.f348352h = k46Var.f378368f;
                        aVar.f348353i = k46Var.f378369g;
                        aVar.f348354j = k46Var.f378370h;
                        aVar.f348355k = k46Var.f378373n;
                        aVar.f348357m = k46Var.f378372m;
                        aVar.f348356l = k46Var.f378371i;
                        com.tencent.mm.autogen.mmdata.rpt.WxaUpdatableMsgReportStruct wxaUpdatableMsgReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WxaUpdatableMsgReportStruct();
                        wxaUpdatableMsgReportStruct.f63050d = wxaUpdatableMsgReportStruct.b("AppId", sendAppMessageTask.f83062f, true);
                        wxaUpdatableMsgReportStruct.f63051e = wxaUpdatableMsgReportStruct.b("PageId", sendAppMessageTask.f83076t, true);
                        wxaUpdatableMsgReportStruct.f63053g = wxaUpdatableMsgReportStruct.b("ShareTicket", vc7Var.f388114e, true);
                        wxaUpdatableMsgReportStruct.f63054h = wxaUpdatableMsgReportStruct.b("ChattingId", (java.lang.String) linkedList.get(i19), true);
                        wxaUpdatableMsgReportStruct.f63055i = ((java.lang.String) linkedList.get(i19)).toLowerCase().endsWith("@chatroom") ? cm.b1.YES : cm.b1.NO;
                        wxaUpdatableMsgReportStruct.f63056j = cm.a1.SHAREAPPMSG;
                        wxaUpdatableMsgReportStruct.f63057k = this.f83243f;
                        wxaUpdatableMsgReportStruct.f63058l = wxaUpdatableMsgReportStruct.b("SceneNote", sendAppMessageTask.L, true);
                        wxaUpdatableMsgReportStruct.f63061o = cm.z0.a(sendAppMessageTask.Y + 1000);
                        wxaUpdatableMsgReportStruct.f63052f = wxaUpdatableMsgReportStruct.i();
                        wxaUpdatableMsgReportStruct.f63059m = cm.c1.DOING;
                        wxaUpdatableMsgReportStruct.f63060n = cm.d1.NOTSUBSCRIBE;
                        wxaUpdatableMsgReportStruct.k();
                    }
                    if (vc7Var.f388117h && (ym6Var = vc7Var.f388118i) != null && ym6Var.f391220d) {
                        aVar.f348364t = ym6Var.f391221e;
                    }
                    if (vc7Var.f388121o) {
                        aVar.f348358n = 1;
                        r45.cz czVar = vc7Var.f388122p;
                        if (czVar != null) {
                            aVar.f348350f = czVar.f371934d;
                            aVar.f348351g = czVar.f371935e;
                            aVar.f348357m = czVar.f371937g;
                            aVar.f348356l = czVar.f371936f;
                        }
                    }
                    com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask.B(sendAppMessageTask, qVar, str2, hc7Var.f376059f);
                    this.f83247m.C(this.f83242e, this.f83245h, (java.lang.String) linkedList.get(i19), this.f83246i, this.f83243f);
                    i19++;
                }
                sendAppMessageTask.c();
                return 0;
            }
        }
        if (qVar.f348681l2 == 3) {
            qVar.f348681l2 = 2;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str4 = (java.lang.String) it.next();
            if (hc7Var != null) {
                com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask.B(sendAppMessageTask, qVar, str2, hc7Var.f376059f);
            }
            this.f83247m.C(this.f83242e, this.f83245h, str4, this.f83246i, this.f83243f);
        }
        sendAppMessageTask.c();
        return 0;
    }
}
