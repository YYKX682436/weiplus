package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public class b2 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p971x6de15a2e.z0 f153500h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f153501i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f153502j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153503k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p971x6de15a2e.c2 f153504l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.p314xaae8f345.mm.p971x6de15a2e.c2 c2Var, long j17, java.lang.Object obj, com.p314xaae8f345.mm.p971x6de15a2e.z0 z0Var, int i17, int i18, java.lang.String str) {
        super(j17, obj);
        this.f153504l = c2Var;
        this.f153500h = z0Var;
        this.f153501i = i17;
        this.f153502j = i18;
        this.f153503k = str;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        try {
            com.p314xaae8f345.mm.p971x6de15a2e.g1.d(this.f153504l.f153506d, this.f153500h, this.f153501i, this.f153502j, this.f153503k);
            return null;
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return null;
        }
    }
}
