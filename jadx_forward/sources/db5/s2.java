package db5;

/* loaded from: classes15.dex */
public class s2 implements db5.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21497x5c99c26 f310036a;

    public s2(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21497x5c99c26 c21497x5c99c26) {
        this.f310036a = c21497x5c99c26;
    }

    @Override // db5.z1
    public void a(int i17, int i18, boolean z17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21497x5c99c26 c21497x5c99c26 = this.f310036a;
        int i19 = c21497x5c99c26.f278941q;
        int i27 = c21497x5c99c26.f278942r;
        int i28 = c21497x5c99c26.f278943s;
        int i29 = c21497x5c99c26.f278941q;
        if (i18 > i29 || i29 <= 0) {
            int i37 = c21497x5c99c26.f278942r;
            if (i18 >= i37 && i37 < c21497x5c99c26.f278943s - 1) {
                c21497x5c99c26.f278935h.mo50293x3498a0(new db5.r2(this, i18));
            }
        } else {
            c21497x5c99c26.f278935h.mo50293x3498a0(new db5.q2(this, i18));
        }
        c21497x5c99c26.f278939o = i18;
        c21497x5c99c26.f278932e.m78922x7d600aec(i18);
    }
}
