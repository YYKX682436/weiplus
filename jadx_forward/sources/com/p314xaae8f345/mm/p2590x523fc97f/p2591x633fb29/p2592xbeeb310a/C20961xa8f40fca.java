package com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.roomsdk.model.factory.RoomOpLogCallbackFactory$1 */
/* loaded from: classes11.dex */
public class C20961xa8f40fca extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5827xd72bd98b> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.f f273777d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20961xa8f40fca(com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.f fVar, p012xc85e97e9.p093xedfae76a.y yVar) {
        super(yVar);
        this.f273777d = fVar;
        this.f39173x3fe91575 = 1984241019;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5827xd72bd98b c5827xd72bd98b) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5827xd72bd98b c5827xd72bd98b2 = c5827xd72bd98b;
        com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.f fVar = this.f273777d;
        fVar.f273796h.mo48814x2efc64();
        java.lang.Object[] objArr = new java.lang.Object[2];
        xg3.q0 q0Var = fVar.f273794f;
        objArr[0] = q0Var != null ? java.lang.Integer.valueOf(q0Var.b()) : "null";
        objArr[1] = java.lang.Integer.valueOf(c5827xd72bd98b2.f136135g.f89737a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomCallbackFactory", "oplogServiceEvent callback, cmdId: %s, ret: %s", objArr);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.d(this, c5827xd72bd98b2));
        return false;
    }
}
