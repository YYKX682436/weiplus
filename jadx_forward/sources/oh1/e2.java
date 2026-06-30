package oh1;

/* loaded from: classes4.dex */
public class e2 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f426737a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f426738b;

    /* renamed from: c, reason: collision with root package name */
    public int f426739c;

    /* renamed from: d, reason: collision with root package name */
    public long f426740d;

    /* renamed from: e, reason: collision with root package name */
    public int f426741e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f426742f;

    /* renamed from: g, reason: collision with root package name */
    public k01.w0 f426743g;

    public e2(oh1.d2 d2Var) {
    }

    public void a() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f426737a) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f426738b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxaUpdateableMsgService", "appId or shareKey is null, return");
            return;
        }
        oh1.j2 j2Var = oh1.j2.INSTANCE;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) j2Var.f426774d;
        concurrentHashMap.size();
        concurrentHashMap.put(java.lang.Integer.valueOf(this.f426738b.hashCode()), this);
        j2Var.h();
    }

    public boolean b() {
        int i17 = this.f426739c;
        if (i17 < 0) {
            return false;
        }
        return i17 == 0 ? java.lang.System.currentTimeMillis() - this.f426740d > com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d : java.lang.System.currentTimeMillis() - this.f426740d > ((long) this.f426739c) * 1000;
    }
}
