package oy0;

/* loaded from: classes5.dex */
public final class c implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f431368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f431369b;

    public c(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, yz5.a aVar) {
        this.f431368a = z2Var;
        this.f431369b = aVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        java.lang.String Bi = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6709x9f81f895 c6709x9f81f895 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6709x9f81f895();
        c6709x9f81f895.f140501e = c6709x9f81f895.b("sessionid_", Bi, true);
        c6709x9f81f895.f140500d = 3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AITemplateUtils", "reportDialogAction sessionId:" + Bi + " action:3");
        c6709x9f81f895.k();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("kv_ai_permission", true);
        this.f431368a.B();
        this.f431369b.mo152xb9724478();
    }
}
