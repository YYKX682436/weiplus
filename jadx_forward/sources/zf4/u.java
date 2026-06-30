package zf4;

/* loaded from: classes13.dex */
public class u extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zf4.v f554224a;

    public u(zf4.v vVar, zf4.w wVar) {
        this.f554224a = vVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        zf4.w wVar = this.f554224a.f554226e;
        if (wVar.f554233f <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.f1 f1Var = wVar.f554229b;
        wVar.f554233f = 2;
        if (f1Var != null) {
            f1Var.a();
        }
    }
}
