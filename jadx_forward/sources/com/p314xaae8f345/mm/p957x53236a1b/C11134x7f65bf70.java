package com.p314xaae8f345.mm.p957x53236a1b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.modelsimple.NetSceneGetDisasterInfo$1$1 */
/* loaded from: classes8.dex */
public class C11134x7f65bf70 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5144xa73bfa91> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f152812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f152813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p957x53236a1b.n0 f152814f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11134x7f65bf70(com.p314xaae8f345.mm.p957x53236a1b.n0 n0Var, p012xc85e97e9.p093xedfae76a.y yVar, java.lang.String str, java.lang.String str2) {
        super(yVar);
        this.f152814f = n0Var;
        this.f152812d = str;
        this.f152813e = str2;
        this.f39173x3fe91575 = -1206899071;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5144xa73bfa91 c5144xa73bfa91) {
        com.p314xaae8f345.mm.p957x53236a1b.n0 n0Var = this.f152814f;
        n0Var.f152909f.f152920g.mo48814x2efc64();
        n0Var.f152909f.f152920g = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdize NetSceneGetDisasterInfo onGYNetEnd manualauthSucc showtony after 5s[%b]", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274606c));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p957x53236a1b.m0(this), 5000L);
        return true;
    }
}
