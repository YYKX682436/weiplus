package w21;

/* loaded from: classes12.dex */
public class n implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w21.k f523962d;

    public n(w21.k kVar) {
        this.f523962d = kVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        w21.k kVar = this.f523962d;
        if (kVar.mo807x6c193ac1(kVar.m47995xb7ba1aa7(), kVar.f523935d) != -1) {
            return false;
        }
        kVar.f523935d.mo815x76e0bfae(3, -1, "doScene failed", kVar);
        return false;
    }
}
