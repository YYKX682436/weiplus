package dk5;

/* loaded from: classes9.dex */
public class i3 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f316203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316204b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316205c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f316207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316208f;

    public i3(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93, java.util.HashMap hashMap, java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.Intent intent) {
        this.f316208f = activityC22571x51759e93;
        this.f316203a = hashMap;
        this.f316204b = str;
        this.f316205c = str2;
        this.f316206d = str3;
        this.f316207e = intent;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = this.f316208f;
        activityC22571x51759e93.mo48674x36654fab();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectConversationUI", "dealRetransmitFromAppBrandShareTextToGroup bOk:%b", java.lang.Boolean.valueOf(z17));
        android.content.Intent intent = this.f316207e;
        if (!z17) {
            int i18 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.B2;
            activityC22571x51759e93.a8(0, intent);
            activityC22571x51759e93.finish();
            return;
        }
        java.util.HashMap hashMap = this.f316203a;
        boolean a17 = c01.od.a(hashMap.get("useForChatTool"), false);
        boolean a18 = c01.od.a(hashMap.get("needShowEntrance"), false);
        c01.od.c(hashMap.get("entrancePath"), "");
        java.lang.String c17 = c01.od.c(hashMap.get("srcUsername"), "");
        ot0.q qVar = new ot0.q();
        qVar.f430187f = this.f316204b;
        qVar.f430199i = 1;
        qVar.f430255w = c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectConversationUI", "dealRetransmitFromAppBrandShareTextToGroup needShowEntrance:%b useForChatTool:%b", java.lang.Boolean.valueOf(a18), java.lang.Boolean.valueOf(a17));
        ot0.a aVar = new ot0.a();
        aVar.R = this.f316205c;
        if (a18) {
            p15.x xVar = new p15.x();
            xVar.m126728xdc93280d(c01.od.c(hashMap.get("wxaInfo"), ""));
            aVar.P = xVar;
            qVar.f(aVar);
        }
        android.util.Pair I = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(qVar, "", "", this.f316206d, null, null);
        java.lang.Object obj2 = I.first;
        if (obj2 != null && (obj = I.second) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectConversationUI", "dealRetransmitFromAppBrandShareTextToGroup result:%d %d", obj2, obj);
        }
        if (str != null && !str.isEmpty()) {
            tg3.a1 a19 = tg3.t1.a();
            java.lang.String str2 = this.f316206d;
            ((dk5.s5) a19).fj(str2, str, c01.e2.C(str2), 0);
        }
        int i19 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.B2;
        activityC22571x51759e93.a8(-1, intent);
        activityC22571x51759e93.finish();
    }
}
