package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public class d2 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p971x6de15a2e.z0 f153512h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f153513i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f153514j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p971x6de15a2e.e2 f153515k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.p314xaae8f345.mm.p971x6de15a2e.e2 e2Var, long j17, java.lang.Object obj, com.p314xaae8f345.mm.p971x6de15a2e.z0 z0Var, int i17, int i18) {
        super(j17, obj);
        this.f153515k = e2Var;
        this.f153512h = z0Var;
        this.f153513i = i17;
        this.f153514j = i18;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        try {
            com.p314xaae8f345.mm.p971x6de15a2e.g1.g(this.f153515k.f153516d, this.f153512h, this.f153513i, this.f153514j);
            return null;
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return null;
        }
    }
}
