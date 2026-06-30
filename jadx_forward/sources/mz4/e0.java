package mz4;

/* loaded from: classes12.dex */
public class e0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a f414808d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a) {
        this.f414808d = c19515x154ec45a;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a = this.f414808d;
        nz4.f fVar = c19515x154ec45a.R;
        if (fVar != null && fVar.a() == 1) {
            int i17 = c19515x154ec45a.R.f423140f;
            c19515x154ec45a.D();
            c19515x154ec45a.z(i17, false);
        }
        return true;
    }
}
