package x03;

/* loaded from: classes15.dex */
public class f1 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x03.p1 f532557a;

    public f1(x03.p1 p1Var) {
        this.f532557a = p1Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        if (message.what != 1001) {
            return;
        }
        x03.p1 p1Var = this.f532557a;
        if (p1Var.f532629i != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("event", "preparing");
            ((ku5.t0) ku5.t0.f394148d).B(new x03.z0(p1Var, hashMap));
        }
    }
}
