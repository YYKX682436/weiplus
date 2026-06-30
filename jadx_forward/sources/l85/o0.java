package l85;

/* loaded from: classes12.dex */
public final class o0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21024xc1ed8ab9 f398734a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21024xc1ed8ab9 abstractC21024xc1ed8ab9, xu5.b bVar) {
        super(bVar);
        this.f398734a = abstractC21024xc1ed8ab9;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        android.content.Intent intent = (android.content.Intent) message.obj;
        com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21024xc1ed8ab9 abstractC21024xc1ed8ab9 = this.f398734a;
        abstractC21024xc1ed8ab9.i(intent);
        int i17 = message.arg1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC21024xc1ed8ab9.b(), "%s stopSelf() startId = %d mStartId = %d", "MicroMsg.MMService", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(abstractC21024xc1ed8ab9.f274737d));
        if (i17 == abstractC21024xc1ed8ab9.f274737d) {
            abstractC21024xc1ed8ab9.a(new android.content.Intent(), "stop");
        }
    }
}
