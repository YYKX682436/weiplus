package dk5;

/* loaded from: classes9.dex */
public class h3 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316183b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316184c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f316185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f316186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316187f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f316188g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316189h;

    public h3(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr, java.util.List list, java.lang.String str4, android.content.Intent intent) {
        this.f316189h = activityC22571x51759e93;
        this.f316182a = str;
        this.f316183b = str2;
        this.f316184c = str3;
        this.f316185d = strArr;
        this.f316186e = list;
        this.f316187f = str4;
        this.f316188g = intent;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = this.f316189h;
        activityC22571x51759e93.mo48674x36654fab();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectConversationUI", "dealRetransmitFromAppBrandNotifyGroupMembers bOk:%b", java.lang.Boolean.valueOf(z17));
        android.content.Intent intent = this.f316188g;
        if (!z17) {
            int i18 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.B2;
            activityC22571x51759e93.a8(0, intent);
            activityC22571x51759e93.finish();
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f316185d.length);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectConversationUI", "dealRetransmitFromAppBrandNotifyGroupMembers customText:%s, weAppSourceUsername:%s atUserListString:%s atUserList:%d", this.f316182a, this.f316183b, this.f316184c, valueOf);
        for (nm5.b bVar : this.f316186e) {
            java.lang.String str2 = (java.lang.String) bVar.a(0);
            java.lang.String str3 = (java.lang.String) bVar.a(1);
            java.util.LinkedHashMap linkedHashMap = com.p314xaae8f345.mm.ui.i1.f290427d;
            if (linkedHashMap != null) {
                linkedHashMap.put(str2, str3);
            }
        }
        tg3.a1 a17 = tg3.t1.a();
        java.lang.String str4 = this.f316182a;
        java.lang.String str5 = this.f316187f;
        ((dk5.s5) a17).hj(str5, str4, c01.e2.C(str5), 0, 0L, "", this.f316183b, "");
        if (str != null && !str.isEmpty()) {
            ((dk5.s5) tg3.t1.a()).fj(str5, str, c01.e2.C(str5), 0);
        }
        int i19 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.B2;
        activityC22571x51759e93.a8(-1, intent);
        activityC22571x51759e93.finish();
    }
}
