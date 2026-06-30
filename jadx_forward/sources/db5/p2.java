package db5;

/* loaded from: classes15.dex */
public class p2 implements db5.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21497x5c99c26 f309997a;

    public p2(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21497x5c99c26 c21497x5c99c26) {
        this.f309997a = c21497x5c99c26;
    }

    @Override // db5.y1
    public void a(int i17, int i18) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21497x5c99c26 c21497x5c99c26 = this.f309997a;
        int i19 = c21497x5c99c26.f278936i;
        if ((java.lang.Math.abs(c21497x5c99c26.f278937m - i18) < 50 && java.lang.Math.abs(c21497x5c99c26.f278936i - i17) < 50) || i18 == 0 || i17 == 0) {
            return;
        }
        if (!c21497x5c99c26.E || c21497x5c99c26.f278936i <= i17 || c21497x5c99c26.D) {
            boolean z17 = c21497x5c99c26.K;
            c21497x5c99c26.D = false;
            if (!z17) {
                c21497x5c99c26.f278937m = i18;
                c21497x5c99c26.f278936i = i17;
            }
            c21497x5c99c26.f278938n = c21497x5c99c26.f278939o * c21497x5c99c26.f278944t * c21497x5c99c26.f278945u;
            c21497x5c99c26.d();
        }
    }
}
