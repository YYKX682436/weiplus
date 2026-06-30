package db5;

/* loaded from: classes11.dex */
public class e5 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21509xb4b2d0e6 f309860d;

    public e5(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21509xb4b2d0e6 c21509xb4b2d0e6) {
        this.f309860d = c21509xb4b2d0e6;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21509xb4b2d0e6 c21509xb4b2d0e6 = this.f309860d;
        int i17 = c21509xb4b2d0e6.f279053f;
        int i18 = c21509xb4b2d0e6.f279052e;
        int i19 = i17 - i18;
        if (i19 <= 0) {
            return false;
        }
        int i27 = (int) (i19 * 0.6d);
        if (i27 <= 0) {
            i27 = 1;
        }
        int i28 = i18 + i27;
        c21509xb4b2d0e6.f279052e = i28;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21509xb4b2d0e6.a(c21509xb4b2d0e6, i28);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = c21509xb4b2d0e6.f279057m;
        int i29 = c21509xb4b2d0e6.f279051d;
        long j17 = ((i29 - i19) * 40) / i29;
        b4Var.c(j17, j17);
        return false;
    }
}
