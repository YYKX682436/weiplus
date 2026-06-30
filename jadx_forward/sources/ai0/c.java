package ai0;

/* loaded from: classes14.dex */
public final class c implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ai0.g f86580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f86581b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f86582c;

    public c(ai0.g gVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f86580a = gVar;
        this.f86581b = z2Var;
        this.f86582c = interfaceC29045xdcb5ca57;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        ai0.g gVar = this.f86580a;
        gVar.f86612b = true;
        this.f86581b.B();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportAgreeClick ");
        java.lang.String str = gVar.f86592c;
        sb6.append(str);
        sb6.append(", ");
        int i17 = gVar.f86593d;
        sb6.append(i17);
        sb6.append(", ");
        java.lang.String str2 = gVar.f86594e;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PrivacyAgreementDialog", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("chat_name", str);
        hashMap.put("enter_type", java.lang.Integer.valueOf(i17));
        hashMap.put("enter_sessionid", str2);
        hashMap.put("view_id", "yuanbao_private_agree");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f86582c.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
    }
}
