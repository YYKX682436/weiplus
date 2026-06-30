package x44;

/* loaded from: classes4.dex */
public final class i2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q64.b f533369d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(q64.b bVar) {
        super(3);
        this.f533369d = bVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment$onServerRun$1");
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        int intValue3 = ((java.lang.Number) obj3).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment$onServerRun$1");
        q64.b bVar = this.f533369d;
        if (bVar != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("error", intValue);
            bundle.putInt("opType", intValue2);
            bundle.putInt("status", intValue3);
            ((r64.b) bVar).e(bundle);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment$onServerRun$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment$onServerRun$1");
        return f0Var;
    }
}
