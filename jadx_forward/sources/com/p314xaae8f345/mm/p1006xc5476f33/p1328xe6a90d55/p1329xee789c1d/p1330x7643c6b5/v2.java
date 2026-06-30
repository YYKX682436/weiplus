package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class v2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.w2 f177651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f177652b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.x2 f177653c;

    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.x2 x2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.w2 w2Var, java.lang.String str) {
        this.f177653c = x2Var;
        this.f177651a = w2Var;
        this.f177652b = str;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        if (i17 != 0 || i18 != 0 || (fVar = oVar.f152244b.f152233a) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceSessionMgr", "hy: get sessionkey fail,errType:" + i17 + ",errCode:" + i18);
            this.f177653c.a(i17, i18, str, null, false, this.f177651a);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.t2 t2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.t2();
        t2Var.f177630a = ((r45.hd3) fVar).f457597d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        t2Var.f177632c = android.os.SystemClock.elapsedRealtime();
        t2Var.f177631b = r12.f457599f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceSessionMgr", "hy: getSession sessionKey: %s", t2Var);
        ((java.util.concurrent.ConcurrentHashMap) this.f177653c.f177663a).put(this.f177652b, t2Var);
        this.f177653c.a(0, 0, "", t2Var, true, this.f177651a);
    }
}
